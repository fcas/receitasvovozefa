import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import activity.ListaReceitas;

@RunWith(RobolectricTestRunner.class)
public class Teste  {
	
	private ListaReceitas activity;
	
	@Test
	public void test() throws Exception{
		 activity = Robolectric.buildActivity(ListaReceitas.class).create().get();
		 activity.onCreate(null);
	}

}
