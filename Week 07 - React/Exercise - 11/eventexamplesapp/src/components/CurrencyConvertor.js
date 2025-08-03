import React, { useState } from 'react';

const CurrencyConvertor=()=>{
  const [euro, setEuro]=useState('');

  const handleSubmit=(e)=>{
    e.preventDefault();
    const rupee=parseFloat(euro)*80; 
    alert(`Converting to Euro Amount is ₹${rupee}`);
  };

  return (
    <div style={{ padding:'20px',fontFamily:'Arial'}}>
      <h2 style={{color:'green'}}>Currency Convertor!!!</h2>

      <form onSubmit={handleSubmit}>
        <label>Amount:</label>&nbsp;
        <input
          type="number"
          value={euro}
          onChange={(e) => setEuro(e.target.value)}
        />
        <br /><br />
        <label>Currency:</label>&nbsp;
        <input type="text" value="Euro" readOnly />
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default CurrencyConvertor;
