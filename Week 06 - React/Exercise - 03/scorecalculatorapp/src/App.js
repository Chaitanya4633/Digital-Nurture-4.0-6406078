import './App.css';
import { CalculateScore } from './Components/CalculateScore';
function App() {
  return (
     <div>
      <CalculateScore
          Name={"Chaitanya"}
          School={"Cognizant"}
          toal={470}
          goal={5}
      />
     </div>
  );
}

export default App;
