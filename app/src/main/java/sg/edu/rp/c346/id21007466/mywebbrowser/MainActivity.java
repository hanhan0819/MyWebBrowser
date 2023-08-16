package sg.edu.rp.c346.id21007466.mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    Button btnLoadURL;
    WebView wvMypage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnLoadURL= findViewById(R.id.buttonLoad);
    wvMypage=findViewById(R.id.WebViewMyPage);
    wvMypage.setWebViewClient(new WebViewClient());

    btnLoadURL.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String url = "https://www.rp.edu.sg/soi/home";
            wvMypage.loadUrl(url);

        }
    });




    }


}