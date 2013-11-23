package activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.teste.R;

public class MainActivity extends Activity {

	private Button button_receitas;
	private Button button_compartilhar;
	private Button button_buscar;
	private Button button_logoff;
	private Button button_sair;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setTitle("Receitas Vovó Zefa");
		setButtons();
	}

	private void setButtons() {
		button_receitas = (Button) findViewById(R.id.button_minhas_receitas);
		button_receitas.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				Intent novoComentarioIntent = new Intent();
				novoComentarioIntent.setClass(MainActivity.this,
						ListaReceitas.class);
				startActivity(novoComentarioIntent);
				finish();
			}
		});

		button_compartilhar = (Button) findViewById(R.id.button_compartilhar);
		button_compartilhar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				Intent novoComentarioIntent = new Intent();
				novoComentarioIntent.setClass(MainActivity.this,
						Compartilhar.class);
				startActivity(novoComentarioIntent);
				finish();
			}
		});

		button_buscar = (Button) findViewById(R.id.button_buscar);
		button_buscar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				Intent novoComentarioIntent = new Intent();
				novoComentarioIntent.setClass(MainActivity.this,
						Compartilhar.class);
				startActivity(novoComentarioIntent);
				finish();
			}
		});

		button_logoff = (Button) findViewById(R.id.button_logoff);
		button_logoff.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				finish();
			}
		});

		button_sair = (Button) findViewById(R.id.button_sair);
		button_sair.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.minhas_receitas, menu);
		return true;
	}

}
