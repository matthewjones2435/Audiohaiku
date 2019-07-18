package io.github.matthewjones2435.audiohaiku.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import io.github.matthewjones2435.audiohaiku.model.TermKeyword;
import java.util.List;

@Dao
public interface TermKeywordDao {

  @Insert
  void insert (TermKeyword termKeywords);

  @Query("SELECT * FROM TermKeyword")
  LiveData<List<TermKeyword>> getAll();

  @Query("SELECT * FROM TermKeyword WHERE term_keyword = :id")
  LiveData<TermKeyword> wordListFindById (long id);

}
