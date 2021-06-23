package info.mschmitt.android.r8streams;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String joined = Stream.of("x").collect(Collectors.joining());
//        // TODO It's the collect() call that's causing the issue. This one always works:
//        String joined = "";
//        for (Object o : Stream.of("x").toArray()) {
//            joined += o;
//        }
        Log.d("TAG", "onCreate: " + joined);
    }
}