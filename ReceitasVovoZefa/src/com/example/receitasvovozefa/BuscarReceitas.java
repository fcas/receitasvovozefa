package com.example.receitasvovozefa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class BuscarReceitas extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar_receitas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.buscar_receitas, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() {
		Intent voltaIntent = new Intent();
		voltaIntent.setClass(BuscarReceitas.this, MainActivity.class);
		startActivity(voltaIntent);
		finish();
	}

}
