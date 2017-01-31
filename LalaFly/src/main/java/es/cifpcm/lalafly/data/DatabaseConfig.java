/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.lalafly.data;

/**
 *
 * @author Fer
 */
public class DatabaseConfig {
   
    private String dbName;
    private String datasourceName;
    private String driverName;
    private String url;
    private String user;
    private String password;

    public DatabaseConfig() {
    }

    public DatabaseConfig(String driverName, String url, String user, String password) {
        this.driverName = driverName;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public DatabaseConfig(String dbName, String datasourceName) {
        this.dbName = dbName;
        this.datasourceName = datasourceName;
    }
    

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }
    
    
}
