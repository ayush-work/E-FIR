package com.app.e_fir;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadUrl {
    public void readUrl(String myurl) throws IOException{

        String data="";
        InputStream inputStream=null;
        HttpURLConnection httpURLConnection=null;
        try {
            URL url = new URL(myurl);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();
        } finally {

        }
    }
}
