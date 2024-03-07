import { Grid } from "@mui/material";

const Contact = () => {
  return <>
    <Grid container justifyContent='center'>
      <Grid item sm={10}>
        <h1>Contact Page</h1>
        <hr />
        <p><h3>Contact Number</h3>06546874413/465446465</p>
        <p><h3>Email</h3>nipuvfer@com</p>

         <p><h3>Location</h3>No: 64, Main Streat Colombo 2</p>
         
          <p><h3>Branches</h3>
          <ul>
           <li>Matara</li>
           <li>Galle</li>
           <li> Colombo</li>
           <li>Negambo</li>
          </ul>
          </p>
      </Grid>
    </Grid>
  </>;
};

export default Contact;
