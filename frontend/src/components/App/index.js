import React, { useEffect, useState } from "react";

const App = () => {
  const [data, setData] = useState();

  useEffect(() => {
    fetch("http://localhost:8080/api/users")
      .then((response) => response.json())
      .then((response) => {
        console.log(response);
        setData(response);
      });
  }, []);
  return (
    <div>
      {data ? (
        <table>
          <thead>
            <tr>
              <th>Prénom</th>
              <th>Nom</th>
              <th>Mail</th>
            </tr>
          </thead>
          {data.map((elem) => (
            <tbody key={elem.id}>
              <tr>
                <td>{elem.firstName}</td>
                <td>{elem.lastName}</td>
                <td>{elem.email}</td>
              </tr>
            </tbody>
          ))}
        </table>
      ) : (
        <div>no users</div>
      )}
    </div>
  );
};

export default App;
