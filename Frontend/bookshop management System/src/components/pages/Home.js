import React, { useState } from "react";
import { Grid, TextField, Button, Box } from "@mui/material";

const Home = () => {
  const [searchText, setSearchText] = useState("");

  const handleSearchChange = (event) => {
    setSearchText(event.target.value);
  };

  const handleSave = () => {
    // Implement your save logic here
  };

  const handleClear = () => {
    setSearchText("");
  };

  const handleAdd = () => {
    setSearchText("");
  };

  const handlePay = () => {
    setSearchText("");
  };

  return (
    <>
      <Grid container justifyContent="center">
        <Grid item sm={10}>
          <h1>Home Page</h1>
          <hr />
          <TextField
            label="Search"
            variant="outlined"
            fullWidth
            value={searchText}
            onChange={handleSearchChange}
            style={{ marginBottom: "20px" }}
          />
          {/* Grid View of Boxes */}
          <Grid container spacing={2} style={{ marginTop: "20px" }}>
            {/* Repeat the Box component below for each box */}
            <Grid item xs={6} sm={4}>
              <Box
                border={1}
                borderColor="grey.400"
                padding={2}
                textAlign="center"
                width="1300px"
                height="400px"
              >
                List of collectd
              </Box>
            </Grid>
          </Grid>
          
          {/* Grid View for Buttons */}
          <Grid container justifyContent="center" spacing={2} style={{ marginTop: "20px" }}>
            <Grid item>
              <Button variant="contained" color="primary" onClick={handleSave}>
                Save
              </Button>
            </Grid>
            <Grid item>
              <Button variant="contained" color="secondary" onClick={handleClear}>
                Clear
              </Button>
            </Grid>
            <Grid item>
              <Button variant="contained" color="secondary" onClick={handleAdd}>
                Add
              </Button>
            </Grid>
            <Grid item>
              <Button variant="contained" color="secondary" onClick={handlePay}>
                Pay
              </Button>
            </Grid>
          </Grid>
        </Grid>
      </Grid>
    </>
  );
};

export default Home;
