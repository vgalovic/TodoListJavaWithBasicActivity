package com.project.vgalovic.todolist.Db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vgalovic on 19.03.2018..
 */


public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context){super(context, DbProperties.DB_NAME, null, DbProperties.DB_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + DbProperties.TaskEntry.TABLE + " ( " +
                DbProperties.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DbProperties.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DbProperties.TaskEntry.TABLE);
        onCreate(db);
    }
}
