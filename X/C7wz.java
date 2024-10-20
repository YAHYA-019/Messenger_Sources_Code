package X;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: X.7wz, reason: invalid class name */
/* loaded from: 7wz.class */
public final class C7wz extends URLStreamHandler {
    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) {
        return new SGG(url);
    }
}
