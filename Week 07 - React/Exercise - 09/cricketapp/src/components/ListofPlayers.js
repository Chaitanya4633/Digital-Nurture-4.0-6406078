import React from 'react';

const ListofPlayers=()=>{
  const players=[
    { name:'Virat',score:254 },
    { name:'Rohit',score:185 },
    { name:'Rahul',score:65 },
    { name:'Shreyas',score:50 },
    { name:'Pant',score:155 },
    { name:'Hardik',score:90 },
    { name:'Jadeja',score:85 },
    { name:'Ashwin',score:60 },
    { name:'Bumrah',score:95 },
    { name:'Shami',score:45 },
    { name:'Siraj',score:70 },
  ];

  const lowScorers=players.filter(p=>p.score<70);

  return (
    <div>
      <h2>List of Players</h2>
      {players.map((player,idx)=>(
        <p key={idx}>{player.name} - {player.score}</p>
      ))}

      <h3>Players with Score below 70</h3>
      {lowScorers.map((player, idx)=>(
        <p key={idx}>{player.name}-{player.score}</p>
      ))}
    </div>
  );
};

export default ListofPlayers;
