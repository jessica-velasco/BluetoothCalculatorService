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
		solveString(finalString);
	}
	
	public Integer solveString (String expression){
		//only works with binary arithmetic expressions i.e. 2+2
		String[] splitExp;
		String op="";
		Integer ans;
		
		splitExp= expression.split(" ");
		ans=Integer.valueOf(splitExp[0]);
		
		op=splitExp[1];

		if (op.contentEquals("+"))
			ans+=Integer.valueOf(splitExp[2]);
		else if (op.contentEquals("-"))
			ans-=Integer.valueOf(splitExp[2]);
			//if (splitExp[i].matches("[0-9]+"))			
			
		return ans;
	}

}
	
