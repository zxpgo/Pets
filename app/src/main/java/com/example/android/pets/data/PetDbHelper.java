package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class PetDbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
       String SQL_CREATE_ENTRIES = "CREATE TABLE " + PetContract.PetEntry.TABLE_NAME + " (" +
                PetContract.PetEntry._ID + " INTEGER PRIMARY KEY " + "," +
                PetContract.PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL " + "," +
                PetContract.PetEntry.COLUMN_PET_BREED + " TEXT " + "," +
                PetContract.PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL " + "," +
                PetContract.PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0 " + " )";

        db.execSQL(SQL_CREATE_ENTRIES);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        /** String SQL_DELETE_EMTRIES =
                "DROP TABLE IF EXISTS "  +  PetContract.PetEntry.TABLE_NAME;

        db.execSQL(SQL_DELETE_EMTRIES);*/
        onCreate(db);
    }

    public void onDowndrage(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
