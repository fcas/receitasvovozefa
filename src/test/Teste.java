import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import activity.MainActivity;

import com.example.teste.R;

@RunWith(RobolectricTestRunner.class)
public class Teste {
	private MainActivity activity;

	@Before
	public void setUp() throws Exception {
		activity = Robolectric.buildActivity(MainActivity.class).create().visible().get();
	}

	@Test
	public void test() throws Exception {

		String hello = activity.getResources().getString(R.string.hello_world);
		assertThat(hello, equalTo("Hello world!"));
	}

}
