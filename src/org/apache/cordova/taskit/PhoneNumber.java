package org.apache.cordova.taskit;

import org.apache.cordova.DroidGap;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.webkit.WebView;

public class PhoneNumber extends Activity{
	private WebView mAppView; //webview que renderiza el html
    private DroidGap mGap; //Objeto phonegap


    /****inicializaci�n de los componentes*****/
    public PhoneNumber(DroidGap gap, WebView view)
    {
        mAppView = view;
        mGap = gap;
    }
    
    
    /***m�todo para acceder al operador de la red m�vil****/
    public String getTelephoneNumber(){
        TelephonyManager tm = (TelephonyManager) mGap.getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getNetworkOperatorName();
        return number;
    }
}
