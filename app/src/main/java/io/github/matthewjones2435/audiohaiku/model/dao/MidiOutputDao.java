package io.github.matthewjones2435.audiohaiku.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import io.github.matthewjones2435.audiohaiku.model.MidiOutput;
import java.util.List;

@Dao
public interface MidiOutputDao {

  @Insert
  String insert (MidiOutput midiOutput);

  @Query("SELECT * FROM midioutput")
  LiveData<List<MidiOutput>> getAll();
}
