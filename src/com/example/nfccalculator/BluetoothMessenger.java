package com.example.nfccalculator;

import android.util.Log;

public class BluetoothMessenger {
	private MainActivity mainActivity;
	private String finalString, secondNum, firstNum;
	
	BluetoothMessenger(MainActivity m){
		mainActivity = m;
		Log.i("BluetoothMessenger", "created");

	}
	
	public void sendMessage(int first, int second, String operator){
		
		firstNum=  Integer.valueOf(first).toString();
		secondNum=  Integer.valueOf(second).toString();
		finalString= firstNum + " " + operator + " " + secondNum;
		Log.i("BluetoothMessenger", finalString);
	}

}
	
