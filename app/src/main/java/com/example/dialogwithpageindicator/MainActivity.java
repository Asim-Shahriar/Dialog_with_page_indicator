package com.example.dialogwithpageindicator;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.DialogFragment;
        import androidx.fragment.app.FragmentManager;
        import androidx.recyclerview.widget.RecyclerView;
        import androidx.viewpager2.widget.ViewPager2;

        import android.app.Dialog;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialog();
    }

    private void showDialog() {

      /*  PageIndicatorFragment pageIndicatorFragment=PageIndicatorFragment.newInstance(false);
        pageIndicatorFragment.show(getSupportFragmentManager(),PageIndicatorFragment.ARG_SHOW_AS_DIALOG);
*/
      Dialog dialog=new Dialog(this);
      dialog.setContentView(R.layout.fragment_page_indicator);
      dialog.show();

    }
}