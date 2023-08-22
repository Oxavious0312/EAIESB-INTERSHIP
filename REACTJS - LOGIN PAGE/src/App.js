import React from 'react';
import logo from './logo.svg'; // Import the logo image
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <div className="login-form">
          <h2>Login</h2>
          <div className="input-container">
            <label>Username: </label>
            <input
              type="text"
              placeholder="Enter Username"
              required
            />
          </div>
          <div className="input-container">
            <label>Password: </label>
            <input
              type="password"
              placeholder="Enter Password"
              required
              onKeyPress={(event) => {
                if (event.key === 'Enter') {
                  // Redirect to Google (simulate login action)
                  window.location.href = 'https://www.google.com';
                }
              }}
            />
          </div>
          {<a href="https://www.google.com">
            <button>Login</button>
          </a> }
        </div>
      </header>
    </div>
  );
}

export default App;
