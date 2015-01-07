package com.example.android.apis.utils;

public class Utils {

	
	public static String getString(float[] arrays){
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		int length = arrays == null?0:arrays.length;
		for(int i=0;i<length;i++){
			sb.append(arrays[i]);
			if(i != length - 1){
				sb.append(",");
			}
		}
		sb.append("}");
		return sb.toString();
	}
	
}
