import { useEffect } from "react";
import './App.css'

function App() {
  useEffect(() => {
    fetch("http://localhost:8080/api/projects")
      .then(res => res.json())
      .then(data => {
        console.log("Profile data:", data);
      })
      .catch(err => {
        console.error("Fetch error:", err);
      });
  }, []);

  return (
    <div>
      <h1>React ↔ Spring Boot Test</h1>
      <p>Check the browser console.</p>
    </div>
  );
}

export default App;
