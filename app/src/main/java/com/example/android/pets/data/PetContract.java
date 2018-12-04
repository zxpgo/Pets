package com.example.android.pets.data;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

//不需要扩展给外部类使用，仅仅是一个常量类，所以添加final
public final class PetContract {


    public PetContract(){}

    public static final class PetEntry implements BaseColumns{
        //table name
        public final static String TABLE_NAME = "pets";
        //column name
        public final static String _ID = BaseColumns._ID; //id来自BaseColumns类
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";
        public final static String COLUMN_PET_BREED = "breed";

        //gender 常量
        public final static int GENDER_UNKNOWM = 0;
        public final static int GEMDER_MALE = 1;
        public final static int GEMDER_FEMALE = 2;


    }
}
