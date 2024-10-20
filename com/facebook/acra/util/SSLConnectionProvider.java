package com.facebook.acra.util;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* loaded from: SSLConnectionProvider.class */
public class SSLConnectionProvider implements HttpConnectionProvider {
    public final Proxy mProxy;
    public final int mSocketTimeout;

    public SSLConnectionProvider(int i, Proxy proxy) {
        this.mSocketTimeout = i;
        this.mProxy = proxy;
    }

    @Override // com.facebook.acra.util.HttpConnectionProvider
    public HttpURLConnection getConnection(URL url) {
        Proxy proxy = this.mProxy;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy != null ? url.openConnection(proxy) : url.openConnection());
        initializeConnectionParameters(httpURLConnection);
        return httpURLConnection;
    }

    public HttpURLConnection initializeConnectionParameters(HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(this.mSocketTimeout);
        httpURLConnection.setReadTimeout(this.mSocketTimeout);
        return httpURLConnection;
    }
}
