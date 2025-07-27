import React from 'react';

class CountPeople extends React.Component {
  constructor(){
    super();
    this.state={
      entrycount:0,
      exitcount:0,
    };
  }
  updateEntry=()=>{
    this.setState(prevState => ({
      entrycount:prevState.entrycount+1
    }));
  }

  updateExit=()=>{
    this.setState(prevState=>({
      exitcount:prevState.exitcount+1
    }));
  }

  render() {
    return (
      <div>
        <h1>Mall People Counter</h1>
        <p>People Entered:{this.state.entrycount}</p>
        <p>People Exited:{this.state.exitcount}</p>
        <button onClick={this.updateEntry}>Login</button>
        <button onClick={this.updateExit} >Exit</button>
      </div>
    );
  }
}

export default CountPeople;
