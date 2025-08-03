import React, { Component } from 'react';

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      const userData = data.results[0];

      this.setState({
        user: {
          title: userData.name.title,
          firstName: userData.name.first,
          image: userData.picture.large
        }
      });
    } catch (error) {
      console.error('Error fetching user:', error);
    }
  }

  render() {
    const { user } = this.state;

    return (
      <div style={{ textAlign: 'center', marginTop: '40px' }}>
        <h2>Random User Info</h2>
        {user ? (
          <div>
            <h3>{user.title} {user.firstName}</h3>
            <img src={user.image} alt="User" width="200" height="200" />
          </div>
        ) : (
          <p>Loading user...</p>
        )}
      </div>
    );
  }
}

export default Getuser;
