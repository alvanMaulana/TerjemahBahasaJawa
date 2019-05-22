package com.example.terjemahbahasajawa.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import com.example.terjemahbahasajawa.Model.Terjemahan;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static int DATABASE_VERSION = 1;
    private static String DB_FILE_NAME = "concretepage";
    public DatabaseHelper(Context context) {
        super(context, DB_FILE_NAME, null, DATABASE_VERSION);
    }
    //Create database
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IndoJawa ( " +
                " id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " kata VARCHAR2(30), " +
                " arti VARCHAR2(30),"+
                "indonesia VARCHAR(30),"+
                " ngoko VARCHAR2(30),"+
                " kromo VARCHAR2(30),"+
                " halus VARCHAR2(30))";
        db.execSQL(sql);
    }
    //Update database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion == oldVersion + 1) {
            //	db.execSQL("ALTER TABLE balita_info ADD COLUMN country VARCHAR(30)");
        }
    }
    //Insert data into table
    public void insertData(Terjemahan isi){
        SQLiteDatabase db = this.getWritableDatabase();

        SQLiteStatement stmt = db.compileStatement("INSERT INTO IndoJawa (kata,arti,indonesia,ngoko,kromo,halus) " +
                "VALUES (?,?,?,?,?,?)");
        stmt.bindString(1, isi.getKata());
        stmt.bindString(2, isi.getArti());
        stmt.bindString(3, isi.getIndonesia());
        stmt.bindString(4, isi.getNgoko());
        stmt.bindString(5, isi.getKrama());
        stmt.bindString(6, isi.getHalus());

        stmt.execute();
        stmt.close();
        db.close();
    }
    //Update data into table

    //Select all data from the table

    public List<Terjemahan> getTerjemahan() {
        List<Terjemahan> isi = new ArrayList<Terjemahan>();
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT id,kata,arti,indonesia,ngoko,kromo,halus from IndoJawa ORDER BY id DESC";
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            Terjemahan std = new Terjemahan();
            std.setId(cursor.getInt(0));
            std.setKata(cursor.getString(1));
            std.setArti(cursor.getString(2));
            std.setIndonesia(cursor.getString(3));
            std.setNgoko(cursor.getString(4));
            std.setKrama(cursor.getString(5));
            std.setHalus(cursor.getString(6));

            isi.add(std);
        }
        db.close();
        return isi;
    }
    //Delete data from the table for the given id
    public void deleteData(){
        SQLiteDatabase db = this.getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement("DELETE FROM IndoJawa ");

        stmt.execute();
        stmt.close();
        db.close();
    }


    public void delete1Data(int stdId){
        SQLiteDatabase db = this.getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement("DELETE FROM IndoJawa WHERE id = ? ");
        stmt.bindLong(1, stdId);
        stmt.execute();
        stmt.close();
        db.close();
    }
    //Select data for the given id
    public Terjemahan getTerjemahanById(int stdId) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT id, name, age, berat, tinggi FROM balita_info WHERE id = ?";
        Cursor cursor = db.rawQuery(query, new String[] {String.valueOf(stdId)});
        cursor.moveToFirst();
        Terjemahan std = new Terjemahan();
        std.setId(cursor.getInt(0));
        std.setKata(cursor.getString(1));
        std.setArti(cursor.getString(2));
        db.close();
        return std;
    }
}
