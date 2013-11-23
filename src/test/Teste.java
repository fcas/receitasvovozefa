package test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import activity.MainActivity;
import android.app.Activity;

import com.example.teste.R;

@RunWith(RobolectricTestRunner.class)
public class Teste  {
	
	@Test
	public void test() throws Exception{
		 Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

		 String hello = activity.getResources().getString(R.string.hello_world);
		 assertThat(hello, equalTo("Hello world!"));
	}

}
