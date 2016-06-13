package com.akayerov.mapsyar;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by a_kayerov on 11.06.2016.
 */
public class Sdate {
    final String LOG_TAG = "myLogs";
    final String FILENAME = "file";
    final String DIR_SD = "MyFiles";
    final String FILENAME_SD = "fileSD";
    AssetManager am;

    Sdate( AssetManager am) {
       this.am =  am;
    }
    public String ReadData() {
        String s = "hello";
        InputStream is = null;
        try {
            is = am.open("text1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        s = InputStreamConverter.convertStreamToString(is);
        s = "zzzzzzInputStreamConverter.convertStreamToString(is)";
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
