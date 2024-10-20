package com.facebook.acra.util;

import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: HttpConnectionProvider.class */
public interface HttpConnectionProvider {
    HttpURLConnection getConnection(URL url);
}
