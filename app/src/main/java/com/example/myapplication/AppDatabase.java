package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.myapplication.User;
import com.example.myapplication.UserDao;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}