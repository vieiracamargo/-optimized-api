import React, { useState } from 'react';
import axios from 'axios';
import {
  Container,
  TextField,
  Button,
  Typography,
  Card,
  CardContent,
  Grid,
  Paper,
} from '@mui/material';

function App() {
  const [gameTitle, setGameTitle] = useState('');
  const [settings, setSettings] = useState(null);

  const fetchGameSettings = async () => {
    try {
      const response = await axios.get(`${process.env.REACT_APP_API_URL}/settings/${gameTitle}`)
      setSettings(response.data);
    } catch (error) {
      console.error("Error fetching game settings:", error);
    }
  };

  return (
    <Container maxWidth="sm" style={{ marginTop: '40px' }}>
      <Typography variant="h4" align="center" gutterBottom>
        Game Settings Finder
      </Typography>
      <Grid container spacing={2} alignItems="center" justifyContent="center">
        <Grid item xs={8}>
          <TextField
            fullWidth
            label="Enter game title"
            variant="outlined"
            value={gameTitle}
            onChange={(e) => setGameTitle(e.target.value)}
            style={{ backgroundColor: 'white' }}
          />
        </Grid>
        <Grid item xs={4}>
          <Button
            variant="contained"
            color="primary"
            onClick={fetchGameSettings}
            fullWidth
          >
            Get Settings
          </Button>
        </Grid>
      </Grid>

      {settings && (
        <Paper elevation={3} style={{ marginTop: '20px', padding: '20px' }}>
          <Typography variant="h5" align="center">
            Settings for {settings.title}
          </Typography>
          <Grid container spacing={2}>
            <Grid item xs={12}>
              <Card variant="outlined">
                <CardContent>
                  <Typography variant="h6">Graphics Settings</Typography>
                  <ul>
                    <li><strong>Texture:</strong> {settings.texture}</li>
                    <li><strong>Models:</strong> {settings.models}</li>
                    <li><strong>Anisotropic Filter:</strong> {settings.anisotropicFilter}</li>
                    <li><strong>Lighting:</strong> {settings.lighting}</li>
                    <li><strong>Shadows:</strong> {settings.shadows}</li>
                    <li><strong>Reflections:</strong> {settings.reflections}</li>
                    <li><strong>Atmospherics:</strong> {settings.atmospherics}</li>
                    <li><strong>Ambient Occlusion:</strong> {settings.ambientOclusion}</li>
                    <li><strong>Tessellation:</strong> {settings.tessellation}</li>
                  </ul>
                </CardContent>
              </Card>
            </Grid>
            <Grid item xs={12}>
              <Card variant="outlined">
                <CardContent>
                  <Typography variant="h6">Author Info</Typography>
                  <Typography>
                    <strong>Name:</strong> {settings.author.name}
                  </Typography>
                  <Typography>
                    <strong>YouTube Channel:</strong>
                    <a href={settings.author.youTubeChannel} target="_blank" rel="noopener noreferrer"> {settings.author.youTubeChannel}</a>
                  </Typography>
                  <Typography>
                    <strong>Video Link:</strong>
                    <a href={settings.author.videoLink} target="_blank" rel="noopener noreferrer"> {settings.author.videoLink}</a>
                  </Typography>
                </CardContent>
              </Card>
            </Grid>
          </Grid>
        </Paper>
      )}
    </Container>
  );
}

export default App;
