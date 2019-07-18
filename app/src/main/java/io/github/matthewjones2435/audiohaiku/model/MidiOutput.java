package io.github.matthewjones2435.audiohaiku.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;


@Entity (foreignKeys = {
    @ForeignKey(entity = TermKeyword.class,
        parentColumns =  "term_keyword",
        childColumns =  "output_id")
})

public class MidiOutput {

  @PrimaryKey (autoGenerate = true)
  @ColumnInfo(name = "output_id", index = true)
  private long id;

  @ColumnInfo (name = "filename", index = true)
  private String filename;

  @ColumnInfo (name = "timestamp")
  private long timestamp;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
