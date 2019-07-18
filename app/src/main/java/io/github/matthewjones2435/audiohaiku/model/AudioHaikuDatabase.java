package io.github.matthewjones2435.audiohaiku.model;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import io.github.matthewjones2435.audiohaiku.model.dao.MidiOutputDao;
import io.github.matthewjones2435.audiohaiku.model.dao.TermKeywordDao;

@Database(entities = {TermKeyword.class, MidiOutput.class}, version = 1)
public abstract class AudioHaikuDatabase extends RoomDatabase {

  public abstract TermKeywordDao keywordDao();
  public abstract MidiOutputDao outputDao();

  private static AudioHaikuDatabase INSTANCE;

  public static AudioHaikuDatabase getInstance(Context context) {
    if (INSTANCE == null) {
      INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
          AudioHaikuDatabase.class, "audio_haiku_database").build();
    }
    return INSTANCE;

  }
}