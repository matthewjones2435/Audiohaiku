package io.github.matthewjones2435.audiohaiku.model;

import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class WordServiceApi {

  private List<WordServiceApi> randomWordsList;

  public List<WordServiceApi> getRandomWordsList() {
    return randomWordsList;
  }

  public void setRandomWordsList(
      List<WordServiceApi> randomWordsList) {
    this.randomWordsList = randomWordsList;
  }
}
