package vn.supercode.longdang.fragmentdemo;

        import android.app.Activity;
        import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailFragment fragment = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        //Dòng lệnh trên xảy ra lỗi : incompatible types: android.app.Fragment

        fragment.setWorkoutId(1);
        // Code above: We’re going to get WorkoutDetailFragment to display details of a workout here to check it’s working.
    }
}
