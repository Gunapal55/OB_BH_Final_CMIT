package com.onebill.reinvent;

import java.io.IOException;


public class App 
{
    public static void main( String[] args )
    {
       ReadPropertyFile readProp = new ReadPropertyFile();
       try {
		readProp.readProp("/home/onebill/Desktop/Gunapal P/Reinvite/reinvent/readme.properties");
	} catch (IOException e) {
	
		e.printStackTrace();
	}
    }
}
