package ru.innopolis.stc9.db.connection;

import java.sql.Connection;

public interface ConnectionManager {
    Connection getConnection();
}
