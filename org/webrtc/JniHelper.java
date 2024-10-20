package org.webrtc;

import X.AnonymousClass001;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: JniHelper.class */
public class JniHelper {
    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            throw AnonymousClass001.A0T("ISO-8859-1 is unsupported");
        }
    }

    public static Object getStringClass() {
        return String.class;
    }

    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
