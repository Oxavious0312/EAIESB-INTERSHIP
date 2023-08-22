import React, { useState } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Form, Button } from 'react-bootstrap';

function App() {
  const [num1, setNum1] = useState("");
  const [num2, setNum2] = useState("");
  const [operator, setOperator] = useState("");
  const [result, setResult] = useState("");

  return (
    <div className="app-container">
      <h2>CALCULATOR</h2>
      <div className="formcomponents-centered">
        <div className="component-maxwidth">
          <Form.Label htmlFor="num1">Number 1:</Form.Label>
          <Form.Control
            type="number"
            onChange={(e) => { setNum1(e.target.value); }}
            value={num1}
            id="num1"
          />
          <Form.Label htmlFor="num2">Number 2:</Form.Label>
          <Form.Control
            type="number"
            onChange={(e) => { setNum2(e.target.value); }}
            value={num2}
            id="num2"
          />
          <Form.Label htmlFor="operator">Operator:</Form.Label>
          <Form.Control
            as="select"
            onChange={(e) => { setOperator(e.target.value); }}
            value={operator}
            id="operator"
          >
            <option value="" disabled>Choose an Operator</option>
            <option value="add">Add</option>
            <option value="sub">Subtract</option>
            <option value="mul">Multiply</option>
            <option value="div">Divide</option>
          </Form.Control>
        </div>
      </div>
      <br></br>
      <div className="center">
        <Button
          variant="primary"
          onClick={() => {
            if (operator === "add") {
              setResult(parseFloat(num1) + parseFloat(num2));
            } else if (operator === "sub") {
              setResult(parseFloat(num1) - parseFloat(num2));
            } else if (operator === "mul") {
              setResult(parseFloat(num1) * parseFloat(num2));
            } else if (operator === "div") {
              setResult(parseFloat(num1) / parseFloat(num2));
            }
          }}
          disabled={!operator || !num1 || !num2}          
        >
          Calculate
        </Button>
      </div>
      {result !== "" && (
        <div className="text-center mt-2">
          Result for the above operation is : {result}
        </div>
      )}
    </div>
  );
}

export default App;
