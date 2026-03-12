import React, { useState } from 'react';
import './ClickEvent.css';

function ClickEvent() {
  const [message, setMessage] = useState('Click the button');

  const handleClick = () => {
    setMessage('You clicked the button!');
  };

  return (
    <div className="click-container">
      <div className="click-box">
        <h2 className="message">{message}</h2>
        <button className="click-button" onClick={handleClick}>
          Click Me
        </button>
      </div>
    </div>
  );
}

export default ClickEvent;
