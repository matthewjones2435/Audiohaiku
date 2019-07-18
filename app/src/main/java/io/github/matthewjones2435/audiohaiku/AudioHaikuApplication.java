package io.github.matthewjones2435.audiohaiku;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class AudioHaikuApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }
}


