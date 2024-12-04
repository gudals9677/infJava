import './App.css';
import { Component } from 'react';

function App() {
  return (
    <div className="App">
      <FristComponent />
      <SecondComponent />
      <ThridComponent />
      <ThridComponent />
    </div>
  );
}

function FristComponent() {
  return (
    <div className="FristComponent">
      Frist Component
    </div>
  );
}

function SecondComponent() {
  return (
    <div className="SecondComponent">
      Second Component
    </div>
  );
}

class ThridComponent extends Component {
    render() {
      return (
        <div className="ThridComponent">
          Thrid Component
        </div>
      );
    }
}

class FourthComponent extends Component {
  render() {
    return (
      <div className="FourthComponent">
        Fourth Component
      </div>
    );
  }
}

export default App;
