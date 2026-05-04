-- ================================================
-- model.Game Library Operations - PostgreSQL DB Sxemi
-- ================================================

-- Oyunlar cədvəli (Admin tərəfindən idarə olunur)
CREATE TABLE IF NOT EXISTS games (
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    price NUMERIC(10, 2) NOT NULL
);

-- İstifadəçinin kitabxanası (satın alınan oyunlar)
CREATE TABLE IF NOT EXISTS user_library (
    id         SERIAL PRIMARY KEY,
    game_id    INT NOT NULL REFERENCES games(id) ON DELETE CASCADE,
    added_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
