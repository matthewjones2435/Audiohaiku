package io.github.matthewjones2435.audiohaiku;

import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.matthewjones2435.audiohaiku.viewmodel.TermKeywordsViewModel;

public class TermKeywordsFragment extends Fragment {

  private TermKeywordsViewModel mViewModel;

  public static TermKeywordsFragment newInstance() {
    return new TermKeywordsFragment();
  }

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_term_keywords, container, false);
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mViewModel = ViewModelProviders.of(this).get(TermKeywordsViewModel.class);
    // TODO: Use the ViewModel
  }

}
