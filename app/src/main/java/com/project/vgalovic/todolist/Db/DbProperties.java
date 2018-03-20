package com.project.vgalovic.todolist.Db;

import android.provider.BaseColumns;

/**
 * Created by vgalovic on 19.03.2018..
 */

public class DbProperties {
    public static final String DB_NAME = "com.projekat.vgalovic.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "todoDB";
        public static final String COL_TASK_TITLE = "task";
    }
}
