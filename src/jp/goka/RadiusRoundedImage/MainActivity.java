package jp.goka.RadiusRoundedImage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.ImageLoader;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageView imageView = (ImageView)findViewById(R.id.image);
        ImageLoader.getInstance().displayImage(Constants.IMAGES[0], imageView);
    }
}
