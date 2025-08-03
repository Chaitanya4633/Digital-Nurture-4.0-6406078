import React, { useState } from 'react';

const EventExamples=()=>{
  const [count, setCount]=useState(0);

  const increment=()=>{
    setCount(prev=>prev+1);
    sayHello();
  };

  const decrement=()=>{
    setCount(prev=>prev-1);
  };

  const sayHello=()=>{
    alert("Hello from EventExamples component");
  };

  const sayWelcome = (msg) => {
    alert("Message: " + msg);
  };

  const handleClick = (e) => {
    e.preventDefault();
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>Event Handling Examples</h2>

      <h3>Counter: {count}</h3>
      <button onClick={increment}>Increment</button> &nbsp;
      <button onClick={decrement}>Decrement</button>

      <br /><br />
      <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>

      <br /><br />
      <button onClick={handleClick}>OnPress (Synthetic Event)</button>
    </div>
  );
};

export default EventExamples;
