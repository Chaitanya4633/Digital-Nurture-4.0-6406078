import React from 'react';

const OfficeSpace=()=>{
  const office={
    Name:'DBS',
    Rent:50000,
    Address:'Chennai',
  };

  const offices=[
    { Name:'Villa',Rent:50000, Address:'Chennai' },
    { Name:'Studio Rooms',Rent:65000,Address:'Chennai' },
    { Name:'pent_house',Rent:55000,Address:'Hyderabad' },
    { Name:'Bungalows',Rent:70000,Address:'Hyderabad' },
  ];

  const getRentStyle=(rent)=>({
    color:rent<=60000 ?'red':'green',
    fontWeight:'bold',
  });

  const getImageByName=(name)=>{
    if (name==='Villa') 
      return '/Pictures/Villas.jpg';

    if (name==='Studio Rooms') 
      return '/Pictures/Studio Rooms.jpg';

    if (name==='pent_house') 
      return '/Pictures/Pent_house.jpg';

    if (name==='Bungalows') 
      return '/Pictures/Bungalows.jpg';
    return '/Pictures/default.jpg'; 
  };

  return (
    <div style={{ padding: '20px', 
                  fontFamily: 'Arial',
                  display:'flex', 
                  flexDirection: 'column', 
                  // alignItems: 'center'
           }}>

      <h1>Office Space , at Affordable Range</h1>

      <img
        src="/Pictures/Villas.jpg"
        alt="Office Space"
        width="400"
        height="250"
      />

      <h2>Name:{office.Name}</h2>
      <h3 style={getRentStyle(office.Rent)}>Rent: Rs. {office.Rent}</h3>
      <h3>Address: {office.Address}</h3>

      <hr />

     <h2>More Office Spaces:</h2>
<div style={{
  display: 'flex',
  flexWrap: 'wrap',
  gap: '20px',
  justifyContent: 'center'
}}>
  {offices.map((item, idx) => (
    <div
      key={idx}
      style={{
        border: '1px solid #ccc',
        padding: '10px',
        borderRadius: '8px',
        width: '300px',
        textAlign: 'center'
      }}
    >
      <h3>Name: {item.Name}</h3>
      <h4 style={getRentStyle(item.Rent)}>Rent: Rs. {item.Rent}</h4>
      <h4>Address: {item.Address}</h4>
      <img
        src={getImageByName(item.Name)}
        alt={item.Name}
        width="280"
        height="180"
        style={{ borderRadius: '6px' }}
      />
    </div>
  ))}
</div>

    </div>
  );
};

export default OfficeSpace;
