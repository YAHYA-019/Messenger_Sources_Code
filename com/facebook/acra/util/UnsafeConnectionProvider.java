package com.facebook.acra.util;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* loaded from: UnsafeConnectionProvider.class */
public class UnsafeConnectionProvider implements HttpConnectionProvider {
    public Proxy mProxy;
    public final int mSocketTimeout;

    public UnsafeConnectionProvider(int i, Proxy proxy) {
        this.mSocketTimeout = i;
        this.mProxy = proxy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.acra.util.HttpConnectionProvider
    public HttpURLConnection getConnection(URL url) {
        Proxy proxy = this.mProxy;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy != null ? url.openConnection(proxy) : url.openConnection());
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new TrustManager[]{new Object()}, null);
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                httpsURLConnection.setSSLSocketFactory(socketFactory);
                httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.facebook.acra.util.UnsafeConnectionProvider.1
                    @Override // javax.net.ssl.HostnameVerifier
                    public boolean verify(String str, SSLSession sSLSession) {
                        return true;
                    }
                });
            } catch (KeyManagementException | NoSuchAlgorithmException unused) {
            }
        }
        initializeConnectionParameters(httpURLConnection);
        return httpURLConnection;
    }

    public HttpURLConnection initializeConnectionParameters(HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(this.mSocketTimeout);
        httpURLConnection.setReadTimeout(this.mSocketTimeout);
        return httpURLConnection;
    }
}
