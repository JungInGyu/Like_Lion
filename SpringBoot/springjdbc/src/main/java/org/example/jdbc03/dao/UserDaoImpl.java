package org.example.jdbc02.dao;

import com.mysql.cj.result.Row;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
@Repository
@RequiredArgsConstructor // final에 대한 필드에 대해서만 생성자를 생성하는 애노테이션
public class UserDaoImpl implements UserDao{
    //JdbcTemplate 객체이용해서 구현 할거니까..
    //필드기반 필드기반은 지향하지 않음
//    @Autowired // 필드 기반으로 받아오기 위한 애노테이션이고 AutoWired 애노테이션을 사용하려면 @Component 애노테이션이 필요함
    private final JdbcTemplate jdbcTemplate;

    //생성자기반
//    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    //설정자 기반
//    @Autowired
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users(name,email) VALUES (?,?)";
        jdbcTemplate.update(sql, user.getName(),user.getEmail());
    }

    @Override
    public List<User> findAllUsers() {
        RowMapper rowMapper = (ResultSet rs, int row) -> new User(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getString("email")
        );
        String sql = "SELECT id,name,email FROM users";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void updateUserEamil(String name, String email) {
        jdbcTemplate.update("UPDATE users SET email = ? WHERE name = ?",email,name);
    }

    @Override
    public void deleteUser(String name) {
        jdbcTemplate.update("DELETE FROM users WHERE name = ?", name);
    }
}
