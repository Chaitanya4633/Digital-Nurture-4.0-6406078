import React from 'react';

const flights=[
  { from:'Hyderabad',to:'Bangalore',price:3500 },
  { from:'Chennai',to:'Mumbai',price:4200 },
  { from:'Delhi',to:'Kolkata',price:5000 },
];

const UserGreeting=()=>{
  return (
    <div>
      <h2 style={{ color:'green',animation:'fadeIn 1s ease-in-out' }}>
        Welcome back!  Ready to fly?
      </h2>

      <div style={{
        display:'flex',
        justifyContent:'center',
        flexWrap:'wrap',
        gap:'20px',
        marginTop:'20px'
      }}>
        {flights.map((flight, idx) => (
          <div
            key={idx}
            style={{
              border:'1px solid #ccc',
              borderRadius:'10px',
              padding:'15px',
              width:'250px',
              boxShadow:'2px 2px 10px rgba(0,0,0,0.1)',
              transition:'transform 0.2s ease',
            }}
            onMouseEnter={(e)=>(e.currentTarget.style.transform='scale(1.05)')}
            onMouseLeave={(e)=>(e.currentTarget.style.transform='scale(1.0)')}
          >
            <h3>{flight.from} -- {flight.to}</h3>
            <p><strong>Fare:</strong> ₹{flight.price}</p>
            <button style={{
              backgroundColor: '#007bff',
              color: 'white',
              padding: '8px 12px',
              border: 'none',
              borderRadius: '5px',
              cursor: 'pointer'
            }}>
              Book Now
            </button>
          </div>
        ))}
      </div>
     
    </div>
  );
};

export default UserGreeting;
