import React, { useState } from 'react';
import './App.css'; // Import the CSS file

// Import the New York Yankees logo image
import yankeesLogo from './yankees-logo.png';

function App() {
  const [text, setText] = useState(''); // State to hold the input text

  // Function to handle changes in the input field
  const handleInputChange = (event) => {
    setText(event.target.value);
  };

  return (
    <div className="app-container">
      {/* New York Yankees logo in the top left corner */}
      <img src={yankeesLogo} alt="Yankees Logo" className="corner-logo top-left" />

      {/* Title */}
      <h1 className="app-title">New York Yankees Database</h1>

      {/* Input field and Enter button */}
      <div className="input-container">
        <input
          type="text"
          value={text}
          onChange={handleInputChange}
          placeholder="Type something here..."
        />
        <button>Enter</button>
      </div>

      {/* Output box */}
      <div className="output-box">
        <h3>Output:</h3>
        <p></p> {/* The output box is empty */}
      </div>
    </div>
  );
}

export default App;
