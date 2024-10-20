package X;

import org.apache.http.client.HttpResponseException;

/* renamed from: X.3l7, reason: invalid class name */
/* loaded from: 3l7.class */
public final class C3l7 extends HttpResponseException implements 2L1 {
    public final java.util.Map mResponseHeaders;

    public C3l7(String str, Throwable th, java.util.Map map, int i) {
        super(i, str == null ? "" : str);
        initCause(th);
        this.mResponseHeaders = map;
    }

    public java.util.Map B7n() {
        return this.mResponseHeaders;
    }
}
