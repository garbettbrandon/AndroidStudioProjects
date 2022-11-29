package com.example.agenda.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAllUsers();

    @Insert
    void insertUser(User...users);

    @Delete
    void Delete(User user);

    @Query("DELETE FROM user WHERE uid = :id")
    void deleteById(int id);
}
