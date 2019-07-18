package io.github.matthewjones2435.audiohaiku.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TermKeyword {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo (name = "term_keyword_id")
  private long id;
  @ColumnInfo(name = "user_input_words")
  private String userInputWords;
  @ColumnInfo (name = "searched_words_for_output")
  private String userSearchedWordsForOutput;
  @ColumnInfo (name = "output_phrase")
  private String outputPhrase;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserInputWords() {
    return userInputWords;
  }

  public void setUserInputWords(String userInputWords) {
    this.userInputWords = userInputWords;
  }

  public String getUserSearchedWordsForOutput() {
    return userSearchedWordsForOutput;
  }

  public void setUserSearchedWordsForOutput(String userSearchedWordsForOutput) {
    this.userSearchedWordsForOutput = userSearchedWordsForOutput;
  }

  public String getOutputPhrase() {
    return outputPhrase;
  }

  public void setOutputPhrase(String outputPhrase) {
    this.outputPhrase = outputPhrase;
  }

  @NonNull
  @Override
  public String toString() {
    return userInputWords;
  }
}


