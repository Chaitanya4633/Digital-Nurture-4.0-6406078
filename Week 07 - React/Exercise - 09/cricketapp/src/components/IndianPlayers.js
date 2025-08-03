import React from 'react';

const IndianPlayers = () => {
  const T20players = ['Virat', 'Rohit', 'Surya', 'Hardik'];
  const RanjiPlayers = ['Sarfaraz', 'Shaw', 'Ruturaj', 'Shubman'];

  const mergedPlayers = [...T20players, ...RanjiPlayers];
  const oddTeam = mergedPlayers.filter((_, i) => i % 2 !== 0);
  const evenTeam = mergedPlayers.filter((_, i) => i % 2 === 0);

  return (
    <div>
      <h2>Indian Players</h2>
      <h3>Odd Team:</h3>
      <ul>
        {oddTeam.map((player,idx)=><li key={idx}>{player}</li>)}
      </ul>

      <h3>Even Team:</h3>
      <ul>
        {evenTeam.map((player,idx)=><li key={idx}>{player}</li>)}
      </ul>

      <h3>Merged List:</h3>
      <ul>
        {mergedPlayers.map((player,idx) => <li key={idx}>{player}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
