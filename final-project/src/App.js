import React, { useState } from 'react';
import './App.css'; // Import the CSS file
import axios from 'axios'

// Import the New York Yankees logo image
import yankeesLogo from './yankees-logo.png';

function App() {
  const [text, setText] = useState(''); // State to hold the input text
  const [selectedOption, setSelectedOption] = useState('Create'); // State to hold the selected dropdown option
  const [tableSelectedOption, setTableSelectedOption] = useState('Player')
  const [data, setData] = useState()

  // Function to handle changes in the input field
  const handleInputChange = (event) => {
    setText(event.target.value);
  };

  // Function to handle changes in the dropdown menu
  const handleDropdownChange = (event) => {
    setSelectedOption(event.target.value);
  };

  const handleTableDropdownChange = (event) => {
    setTableSelectedOption(event.target.value);
  };

  const headers = data && data.length > 0 ? Object.keys(data[0]) : [];
  const callDatabase = async() => {
    if (selectedOption === "Create") {
      await axios.post(`http://localhost:8080?method=${"Create"}&query=${text}`)
    } else if (selectedOption === "Read") {
      const res = await axios.get(`http://localhost:8080?method=${"Read"}&query=${text}&table=${tableSelectedOption}`)
      setData(res.data)
      console.log(res.data)
    }
    else {
      await axios.put(`http://localhost:8080?method=${"Create"}&query=${text}`)
    }
  }

  return (
    <div className="app-container">
      {/* New York Yankees logo in the top left corner */}
      <img src={yankeesLogo} alt="Yankees Logo" className="corner-logo top-left" />

      {/* Title */}
      <h1 className="app-title">New York Yankees Database</h1>

      {/* Dropdown menu, input field, and Enter button */}
      <div className="input-container">
        {/* Dropdown menu */}
        <select value={selectedOption} onChange={handleDropdownChange} style={{ marginRight: '10px' }}>
          <option value="Create">Create</option>
          <option value="Read">Read</option>
          <option value="Update">Update</option>
        </select>
        <select value={tableSelectedOption} onChange={handleTableDropdownChange} style={{ marginRight: '10px' }}>
          <option value="Owner">Owner</option>
          <option value="General_Manager">General Manager</option>
          <option value="Player">Player</option>
          <option value="Hitter">Hitter</option>
          <option value="Pitcher">Pitcher</option>
          <option value="Coach">Coach</option>
          <option value="PlayerJoinHitter">PlayerJoinHitter</option>
          <option value="PlayerJoinPitcher">PlayerJoinPitcher</option>
        </select>

        {/* Input field */}
        <input
          type="text"
          value={text}
          onChange={handleInputChange}
          placeholder="Type something here..."
        />

        {/* Enter button */}
        <button style={{ marginLeft: '10px' }} onClick={callDatabase}>Enter</button>
      </div>

      {/* Output box */}
      <h1>Response</h1>
      <table>
        <thead>
          <tr>
            {headers.map((header) => (
              <th key={header}>{header}</th>
            ))}
          </tr>
        </thead>
        <tbody>
          {data ? data.map((row) => (
            <tr>
              {headers.map((header) => (
                <td key={header}>{row[header]}</td>
              ))}
            </tr>
          )) : ""}
        </tbody>
      </table>
    </div>
  );
}

export default App;