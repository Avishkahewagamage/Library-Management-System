import { Grid, Card, Tabs, Typography, Tab, Box, FormControl, InputLabel, Select, MenuItem } from '@mui/material';
import { useState } from 'react';
import Pic1 from '../../../images/pic3.jpg'
import Registration from './Registration';
import UserLogin from './UserLogin';
import { Book, ShoppingBag } from '@mui/icons-material';

const TabPanel = (props) => {
  const { children, value, index } = props;
  return (
    <div role='tabpanel' hidden={value !== index}>
      {
        value === index && (
          <Box>{children}</Box>
        )
      }
    </div>
  )
}

const LoginReg = () => {
  const [value, setValue] = useState(0);
  const [userType, setUserType] = useState('User'); // Default value is 'User'

  const handleChange = (event, newValue) => {
    setValue(newValue);
  }

  const handleUserTypeChange = (event) => {
    setUserType(event.target.value);
  }

  return (
    <>
      <Grid container sx={{ height: '90vh' }}>
        <Grid item lg={7} sm={5} sx={{
          backgroundImage: `url(${Pic1})`,
          backgroundRepeat: 'no-repeat',
          backgroundSize: 'cover',
          backgroundPosition: 'center',
          display: { xs: 'none', sm: 'block' }
        }}>
        </Grid>
        <Grid item lg={5} sm={7} xs={12}>
          <Card sx={{ width: '100%', height: '100%' }}>
            <Box sx={{ mx: 3, height: 530 }}>
              <Box sx={{ borderBottom: 1, borderColor: 'divider' }}>
                <Tabs value={value} textColor='secondary' indicatorColor='secondary' onChange={handleChange}>
                  <Tab label='Login' sx={{ textTransform: 'none', fontWeight: 'bold' }}></Tab>
                  <Tab label='Registration' sx={{ textTransform: 'none', fontWeight: 'bold' }}></Tab>
                </Tabs>
              </Box>
              <TabPanel value={value} index={0}>
                <UserLogin />
              </TabPanel>
              <TabPanel value={value} index={1}>
                <Registration />
              </TabPanel>
              <FormControl sx={{ mt: 2 }}>
                <InputLabel><b>User Type</b></InputLabel>
                <br></br>
                <Select
                  value={userType}
                  onChange={handleUserTypeChange}
                >
                  <MenuItem value="User">User</MenuItem>
                  <MenuItem value="Admin">Admin</MenuItem>
                </Select>
              </FormControl>
            </Box>
            <Box textAlign='center' sx={{ mt: 2 }}>
              <Book sx={{ color: 'purple', fontSize: 100 }} />
              <Typography variant='h5' sx={{ fontWeight: 'bold' }}>Book-Shop</Typography>
            </Box>
          </Card>
        </Grid>
      </Grid>
    </>
  );
};

export default LoginReg;
