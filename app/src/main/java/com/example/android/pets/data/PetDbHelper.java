package com.example.android.pets.data;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by Pack Heng on 16/04/17
 * pack@oz-heng.com
 */

/**
 * Database helper for Pets app. Manages database creation and version management.
 */
public class PetDbHelper extends SQLiteOpenHelper {

    /** Name of the database file */
    private static final String DATABASE_NAME = "shelter.db";

    /**
     * Database version.If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /** String constants for SQL keywords */
    private static final String CREATE_TABLE = "CREATE TABLE ";
    private static final String DROP_TABLE = "DROP TABLE";
    private static final String IF_EXISTS = " IF EXISTS ";
    private static final String TEXT = " TEXT";
    private static final String INTEGER = " INTEGER";
    private static final String PRIMARY_KEY = " PRIMARY KEY";
    private static final String AUTOINCREMENT = " AUTOINCREMENT";
    private static final String NOT_NULL = " NOT NULL";
    private static final String DEFAULT = " DEFAULT ";
    private static final String COMMA_SEP = ", ";

    /** String constant for the SQL statement to create the pets table */
    private static final String SQL_CREATE_ENTRIES =
            CREATE_TABLE + PetEntry.TABLE_NAME + " (" +
                PetEntry._ID + INTEGER + PRIMARY_KEY + AUTOINCREMENT + COMMA_SEP +
                PetEntry.COLUMN_PET_NAME + TEXT + NOT_NULL + COMMA_SEP +
                PetEntry.COLUMN_PET_BREED + TEXT + COMMA_SEP +
                PetEntry.COLUMN_PET_GENDER + INTEGER + NOT_NULL + COMMA_SEP +
                PetEntry.COLUMN_PET_WEIGHT + INTEGER + NOT_NULL + DEFAULT + "0" +
                ");";

    /** String constant for the SQL statement to delete the pets table */
    private static final String SQL_DELETE_ENTRIES = DROP_TABLE + IF_EXISTS + PetEntry.TABLE_NAME;


    /**
     * Constructs a new instance of {@link PetDbHelper}.
     *
     * @param context of the app
     */
    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // The database is still at version 1, so there's nothing to do be done here.
    }

 }
