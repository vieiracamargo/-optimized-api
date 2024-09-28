DROP TABLE IF EXISTS presets;

CREATE TABLE presets(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    texture VARCHAR(255) NOT NULL,
    models VARCHAR(255) NOT NULL,
    anisotropic_filter VARCHAR(255) NOT NULL,
    lighting VARCHAR(255) NOT NULL,
    shadows VARCHAR(255) NOT NULL,
    reflections VARCHAR(255) NOT NULL,
    atmospherics VARCHAR(255) NOT NULL,
    ambient_oclusion VARCHAR(255) NOT NULL,
    tessellation VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    youtube_channel VARCHAR(255) NOT NULL,
    video_link VARCHAR(255) NOT NULL
);

INSERT INTO presets(
    title,
    texture,
    models,
    anisotropic_filter,
    lighting,
    shadows,
    reflections,
    atmospherics,
    ambient_oclusion,
    tessellation,
    name,
    youtube_channel,
    video_link
)
VALUES(
    'God of War Ragnarok',
    'HIGH',
    'HIGH',
    'ULTRA',
    'MEDIUM',
    'MEDIUM',
    'MEDIUM',
    'HIGH',
    'ULTRA',
    'MEDIUM',
    'BenchmarKing',
    'https://www.youtube.com/@benchmarking4386',
    'https://www.youtube.com/watch?v=e6UPDPdFf4A'
);