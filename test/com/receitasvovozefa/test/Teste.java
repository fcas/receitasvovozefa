package com.receitasvovozefa.test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import com.example.teste.R;
import com.receitasvovozefa.activity.MainActivity;

import android.app.Activity;

@RunWith(RobolectricTestRunner.class)
public class Teste extends TestCase {
	
	@Test
	public void test() throws Exception{
		 Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

		 String hello = activity.getResources().getString(R.string.hello_world);
		 assertThat(hello, equalTo("Hello world!"));
	}

}
