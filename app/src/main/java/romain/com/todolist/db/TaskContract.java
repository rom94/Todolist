package romain.com.todolist.db;

import android.provider.BaseColumns;

/**
 * Created by romain on 12/02/15.
 */


public class TaskContract {
    public static final String DB_NAME = "romain.com.todolist.db.tasks";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "tasks";

    public class Columns {
        public static final String TASK = "task";
        public static final String IMPORTANCE = "importance";
        public static final String _ID = BaseColumns._ID;
    }
}

