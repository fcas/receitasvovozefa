package test;

import activities.MainActivity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import com.example.receitasvovozefa.R;

public class RTest extends ActivityUnitTestCase<MainActivity> {

	MainActivity mainActivity;

	TextView textNome;

	public RTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		startActivity(new Intent(getInstrumentation().getTargetContext(),
				MainActivity.class), null, null);

		mainActivity = (MainActivity) getActivity();

		textNome = (TextView) mainActivity.findViewById(R.id.textView1);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@SmallTest
	public void testTextView() {
		String actual = textNome.getText().toString();
		String expected = "Nome";
		assertEquals(expected, actual);
	}
}
