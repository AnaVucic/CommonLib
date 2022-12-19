/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonlib.domain;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class User implements Serializable, GenericEntity {

    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.username);
        hash = 89 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }

    @Override
    public String getTableName() {
        return "user";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "username, password";

    }

    @Override
    public String getInsertValues() {
        return "'" + username + "', '" + password + "' ";
    }

    // UNSUPPORTED
    @Override
    public String getInsertValuesUnprepared() {
        return null;
    }

    // UNSUPPORTED
    @Override
    public void prepareStatement(PreparedStatement statement) throws SQLException {

    }

    @Override
    public void setID(Long id) {
        this.id = id;
    }

    @Override
    public String getSelectCondition() {
        if (username != null) {
            return "username='" + username + "' AND password='" + password + "'";
        } else {
            return "id=" + id;
        }
    }

    @Override
    public String getDeleteCondition() {
        return "id+" + id;
    }

    @Override
    public String getDeleteConditionForItem() {
        return null;
    }

    @Override
    public String getUpdateCondition() {
        return "id+" + id;
    }

    @Override
    public String setAttributes() {
        return "username='" + username + "', password='" + password + "' ";
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));

            list.add(user);
        }
        return list;
    }

    @Override
    public String getSpecificSelectCondition() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
