package activity;

import dimap.ufrn.ms.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MinhasReceitas extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_minhas_receitas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.minhas_receitas, menu);
		return true;
	}

}
