package com.example.testdemo.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MySqliterHelper extends SQLiteOpenHelper {


    public MySqliterHelper(Context context) {
        super(context, "ice.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table students(_id integer primary key autoincrement,name varchar(20))";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldversion, int newversion) {
        String sql="alter table students add age integer";
        sqLiteDatabase.execSQL(sql);
    }
}
