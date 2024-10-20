package X;

import org.apache.http.HttpRequest;

/* renamed from: X.40V, reason: invalid class name */
/* loaded from: 40V.class */
public abstract class C40V {
    public static void A00(HttpRequest httpRequest, long j) {
        httpRequest.getClass();
        httpRequest.getParams().setLongParameter("fb_request_creation_time", j);
    }
}
