import './App.css';
import Home from './Components/Home';
import Contact from './Components/Contact';
import About from './Components/About';

function App() {
  return (
     <div className='Container'>
        <Home/>
        <About/>
        <Contact/>
     </div>
  );
}

export default App;
