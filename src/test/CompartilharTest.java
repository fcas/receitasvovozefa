package test;

import org.apache.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;

import com.example.receitasvovozefa.R;

import activities.BuscarReceitas;
import activities.Compartilhar;
import activities.MainActivity;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Instrumentation.ActivityMonitor;
import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.ViewAsserts;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

@SuppressWarnings("unused")
public class CompartilharTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;

	public CompartilharTest() {
		super(MainActivity.class);
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
		activity = getActivity();
	}

	@Test
	public void testCompartilhar() {
		ActivityMonitor monitor = getInstrumentation().addMonitor(
				Compartilhar.class.getName(), null, false);

		Button view = (Button) activity.findViewById(R.id.button_buscar);

		TouchUtils.clickView(this, view);

		Compartilhar startedActivity = (Compartilhar) monitor
				.waitForActivity();	
		assertNotNull(startedActivity);

		TextView textView = (TextView) startedActivity
				.findViewById(R.id.textView1);

		ViewAsserts.assertOnScreen(startedActivity.getWindow().getDecorView(),
				textView);

		assertEquals("Compartilhe sua Receita!", textView.getText().toString());

	}
}

