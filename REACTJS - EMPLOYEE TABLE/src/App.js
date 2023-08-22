import React from 'react';
import './App.css';
import { DataGrid } from '@mui/x-data-grid';
import { GridToolbar } from '@mui/x-data-grid-pro';
import employees from './Resources/Employee.json';

function App() {
  const columns = [
    {
      field: 'empNum',
      headerName: 'Employee Number',
      width: 200,
    },
    {
      field: 'empFirstName',
      headerName: 'First Name',
      width: 200,
    },
    {
      field: 'empLastName',
      headerName: 'Last Name',
      width: 200,
    },
    {
      field: 'empSalary',
      headerName: 'Salary',
      width: 150,
    },
  ];

  
  const rows = employees.Employees.map((employee) => ({
    ...employee,
    id: employee._id.$oid,
  }));

  return (
    <div className="tabularcomponents-centered">
      <div className="text-alligned">
        <h2>Employee Data</h2>
      </div>
      <div style={{ height: 400, width: '100%' }}>
        <DataGrid
          rows={rows}
          columns={columns}
          components={{Toolbar: GridToolbar,}}
          componentsProps={{toolbar: { showQuickFilter: true}}}
          pageSize={5}
          rowsPerPageOptions={[5]}
          checkboxSelection
          disableSelectionOnClick
        />
      </div>
    </div>
  );
}

export default App;
