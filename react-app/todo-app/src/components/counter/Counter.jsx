import { useState } from 'react';
import { PropTypes } from 'prop-types';
import './Counter.css';

export default function Counter({by}) {

  const [count, setCount] = useState(0);

  console.log("by::", by);

  function incrementCounterFunction() {
    setCount(count + by);
    console.log("count::", count);
  }

  function decrementCounterFunction() {
    setCount(count - by);
    console.log("count::", count);
  }

  return (
    <div className="Counter">
      <span className="count">{count}</span>
      <div>
        <button className="counterButton" onClick={incrementCounterFunction}>
            +{by}
          </button>
        <button className="counterButton" onClick={decrementCounterFunction}>
            -{by}
        </button>
      </div>
    </div>
  )
}

Counter.prototype = {
  by: PropTypes.number
}

Counter.defaultProps = {
  by: 5
}