package io.github.matthewjones2435.audiohaiku.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class AudioHaikuDatabaseService extends SQLiteOpenHelper {

  public AudioHaikuDatabaseService(@Nullable Context context) {
    super(context, "Output.db",
        null, 1);
  }

  @Override
  public void onCreate(SQLiteDatabase sqLiteDatabase) {

    sqLiteDatabase.execSQL("CREATE TABLE AudioHaiku ("
      + "id LONG PRIMARY KEY, "
      + "filename TEXT, "
      + "output_phrase TEXT, "
      + "created LONG, "
      + "searched_words TEXT) ");
  }

  @Override
  public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
      // Do Nothing
  }
}
