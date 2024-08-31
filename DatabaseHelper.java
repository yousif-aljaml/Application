package com.Nasa.Soft.Exzam.Editor35;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String COL_0 = "ID";
    public static final String DATABASE_NAME = "Nasasoft.db";
    public static final String TABLE_NABEL1 = "nabeel_table";

    public void nabeel(String str) {
    }

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS nabeel_table(ID INTEGER PRIMARY KEY AUTOINCREMENT , N1 TEXT , N2 TEXT , N3 TEXT , N4 TEXT , N5 TEXT , N6 TEXT , N7 TEXT , N8 TEXT , N9 TEXT , N10 TEXT )");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS nabeel_table");
        onCreate(sQLiteDatabase);
    }

    public boolean insertData(String str, String str2, String str3, String str4) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + str + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , N1 TEXT , N2 TEXT , N3 TEXT , N4 TEXT , N5 TEXT , N6 TEXT , N7 TEXT , N8 TEXT , N9 TEXT , N10 TEXT )");
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_0, str2);
        contentValues.put("N" + str3, str4);
        if (writableDatabase.insert(str, (String) null, contentValues) != -1) {
            return true;
        }
        updateData(str, str2, str3, str4);
        return false;
    }

    public Cursor getAllData(String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + str + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , N1 TEXT , N2 TEXT , N3 TEXT , N4 TEXT , N5 TEXT , N6 TEXT , N7 TEXT , N8 TEXT , N9 TEXT , N10 TEXT )");
        return writableDatabase.rawQuery("SELECT * FROM " + str, (String[]) null);
    }

    public Integer deleteData(String str, String str2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + str + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , N1 TEXT , N2 TEXT , N3 TEXT , N4 TEXT , N5 TEXT , N6 TEXT , N7 TEXT , N8 TEXT , N9 TEXT , N10 TEXT )");
        return Integer.valueOf(writableDatabase.delete(str, "ID = ?", new String[]{str2}));
    }

    public boolean updateData(String str, String str2, String str3, String str4) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + str + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , N1 TEXT , N2 TEXT , N3 TEXT , N4 TEXT , N5 TEXT , N6 TEXT , N7 TEXT , N8 TEXT , N9 TEXT , N10 TEXT )");
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_0, str2);
        contentValues.put("N" + str3, str4);
        writableDatabase.update(str, contentValues, "ID=?", new String[]{str2});
        return true;
    }
}
