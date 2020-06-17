package com.example.dialogwithpageindicator;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.DialogFragment;
        import androidx.fragment.app.FragmentManager;
        import androidx.recyclerview.widget.RecyclerView;
        import androidx.viewpager2.widget.ViewPager2;

        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialog();
    }

    private void showDialog() {
        FragmentManager fragmentManager=getSupportFragmentManager();
        PageIndicatorFragment pageIndicatorFragment=PageIndicatorFragment.newInstance(false);
        pageIndicatorFragment.show(fragmentManager,"viewpager2");

        //fragmentManager.beginTransaction().add(R.id.dialog_page_indicator,pageIndicatorFragment).commit();
    }
}