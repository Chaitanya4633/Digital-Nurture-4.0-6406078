import React from 'react';
import GuestGreeting from './GuestGreeting';
import UserGreeting from './UserGreeting';

const Greeting = ({ isLoggedIn }) => {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
};

export default Greeting;
