import React, { useState } from 'react';
import './App.css'; // Import the CSS file
import axios from 'axios'

// Import the New York Yankees logo image
import yankeesLogo from './yankees-logo.png';

function App() {
  const [text, setText] = useState('');
  const [selectedOption, setSelectedOption] = useState('Create');
  const [data, setData] = useState()

  // Function to handle changes in the input field
  const handleInputChange = (event) => {
    setText(event.target.value);
  };

  // Function to handle changes in the dropdown menu
  const handleDropdownChange = (event) => {
    setSelectedOption(event.target.value);
  };

  const headers = data && data.length > 0 ? 
    Object.keys(data[0]).filter(key => data.some(item => item[key] !== undefined && item[key] !== null)) 
    : [];
  const callDatabase = async() => {
    if (selectedOption === "Create") {
      await axios.post(`http://localhost:8080?query=${text}`)
    } else if (selectedOption === "Read") {
      const res = await axios.get(`http://localhost:8080?query=${text}`)
      setData(res.data)
    }
    else {
      await axios.put(`http://localhost:8080?query=${text}`)
    }
  }

  return (
    <div className="app-container">
      <img src={yankeesLogo} alt="Yankees Logo" className="corner-logo top-left" />
      <h1 className="app-title">New York Yankees Database</h1>
      <div className="input-container">
        <select value={selectedOption} onChange={handleDropdownChange} style={{ marginRight: '10px' }}>
          <option value="Create">Create</option>
          <option value="Read">Read</option>
          <option value="Update">Update</option>
        </select>
        <input
          type="text"
          value={text}
          onChange={handleInputChange}
          placeholder="Type something here..."
        />
        <button style={{ marginLeft: '10px' }} onClick={callDatabase}>Enter</button>
      </div>

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