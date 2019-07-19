package com.unicms.core.util.database;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;


@Component
public class DatabaseCheck {

    public String DatabaseInUse ="";

    @PersistenceContext
    EntityManager entityManager;

    public String checkDatabaseVersion() throws SQLException {
        java.sql.Connection connection = entityManager.unwrap(java.sql.Connection.class);
        DatabaseInUse = connection.getMetaData().getDatabaseProductName();

        return DatabaseInUse;
    }
}
