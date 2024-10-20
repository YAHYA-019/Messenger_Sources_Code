package com.facebook.msys.mci;

import X.1XV;
import com.facebook.simplejni.NativeHolder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: UrlRequest.class */
public class UrlRequest {
    public final NativeHolder mNativeHolder;

    static {
        1XV.A00();
    }

    public UrlRequest(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native String[] getHeaderKeys();

    private native String[] getHeaderValues();

    public native byte[] getHttpBody();

    public Map getHttpHeaders() {
        HashMap hashMap = new HashMap();
        String[] headerKeys = getHeaderKeys();
        String[] headerValues = getHeaderValues();
        if (headerKeys != null && headerValues != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= headerKeys.length) {
                    break;
                }
                hashMap.put(headerKeys[i2], headerValues[i2]);
                i = i2 + 1;
            }
        }
        return hashMap;
    }

    public native String getHttpMethod();

    public native String getUrl();
}
