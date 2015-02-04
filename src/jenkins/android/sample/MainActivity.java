package jenkins.android.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button sdk_btn = (Button) findViewById(R.id.sdkButton);
		sdk_btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.sdkButton:
			Toast.makeText(this, JenkinsTestAndroidSDK.getSDKString(), Toast.LENGTH_LONG).show();
			break;

		}
	}

}
