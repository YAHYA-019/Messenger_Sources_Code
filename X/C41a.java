package X;

import com.facebook.tigon.iface.FacebookLoggingRequestInfo;
import com.facebook.tigon.iface.RedirectRequestInfo;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.41a, reason: invalid class name */
/* loaded from: 41a.class */
public abstract class C41a {
    public static final C4OC A00 = new Object();
    public static final Charset A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4OC] */
    static {
        Charset forName = Charset.forName("UTF-8");
        11T.A0A(forName);
        A01 = forName;
    }

    public static void A00(41Z r301, TigonRequest tigonRequest) {
        String method = tigonRequest.method();
        C4OC c4oc = A00;
        c4oc.A02(r301, method);
        c4oc.A02(r301, tigonRequest.url());
        c4oc.A03(r301, tigonRequest.headers());
        r301.A00((byte) tigonRequest.tigonPriority());
        C40y httpPriority = tigonRequest.httpPriority();
        r301.A00(httpPriority.A00);
        r301.A00(httpPriority.A01 ? (byte) 1 : (byte) 0);
        r301.A00(tigonRequest.retryable() ? (byte) 1 : (byte) 0);
        r301.A00(tigonRequest.replaySafe() ? (byte) 1 : (byte) 0);
        C4OC.A01(r301, tigonRequest.connectionTimeoutMS());
        C4OC.A01(r301, tigonRequest.idleTimeoutMS());
        C4OC.A01(r301, tigonRequest.requestTimeoutMS());
        C4OC.A01(r301, tigonRequest.expectedResponseSizeBytes());
        EnumC04093zx requestCategory = tigonRequest.requestCategory();
        11T.A0F(requestCategory, 1);
        C4OC.A00(r301, requestCategory.value);
        c4oc.A02(r301, tigonRequest.loggingId());
        C4OC.A00(r301, tigonRequest.startupStatusOnAdded());
        C4OC.A01(r301, tigonRequest.addedToMiddlewareSinceEpochMS());
        FacebookLoggingRequestInfo facebookLoggingRequestInfo = (FacebookLoggingRequestInfo) tigonRequest.getLayerInformation(AnonymousClass413.A01);
        if (facebookLoggingRequestInfo != null) {
            r301.A00((byte) 1);
            c4oc.A02(r301, facebookLoggingRequestInfo.A02);
            c4oc.A02(r301, facebookLoggingRequestInfo.A00);
            c4oc.A02(r301, facebookLoggingRequestInfo.A01);
        } else {
            r301.A00((byte) 0);
        }
        C41b c41b = (C41b) tigonRequest.getLayerInformation(AnonymousClass413.A06);
        if (c41b != null) {
            r301.A00((byte) 1);
            C4OC.A00(r301, c41b.A03);
            C4OC.A00(r301, c41b.A01);
            C4OC.A00(r301, c41b.A00);
            C4OC.A00(r301, c41b.A02);
        } else {
            r301.A00((byte) 0);
        }
        AnonymousClass417 anonymousClass417 = (AnonymousClass417) tigonRequest.getLayerInformation(AnonymousClass413.A02);
        if (anonymousClass417 != null) {
            r301.A00((byte) 1);
            AnonymousClass416 anonymousClass416 = anonymousClass417.A00;
            c4oc.A02(r301, anonymousClass416.A00);
            c4oc.A03(r301, anonymousClass416.A01);
            c4oc.A03(r301, anonymousClass417.A01);
        } else {
            r301.A00((byte) 0);
        }
        RedirectRequestInfo redirectRequestInfo = (RedirectRequestInfo) tigonRequest.getLayerInformation(AnonymousClass413.A03);
        if (redirectRequestInfo != null) {
            r301.A00((byte) 1);
            r301.A00(redirectRequestInfo.A01 ? (byte) 1 : (byte) 0);
            C4OC.A00(r301, redirectRequestInfo.A00);
        } else {
            r301.A00((byte) 0);
        }
        C41c c41c = (C41c) tigonRequest.getLayerInformation(AnonymousClass413.A07);
        if (c41c != null) {
            r301.A00((byte) 1);
            HashMap A0u = AnonymousClass001.A0u();
            for (C5e9 c5e9 : c41c.A01.values()) {
                String str = c5e9.A04;
                StringBuilder A0k = AnonymousClass001.A0k();
                char c = '.';
                A0k.append(c5e9.A00 ? 'E' : '.');
                if (c5e9.A01) {
                    c = 'T';
                }
                A0k.append(c);
                A0k.append(':');
                A0k.append(str);
                A0k.append(':');
                A0k.append(c5e9.A02);
                A0k.append(':');
                A0u.put(str, AnonymousClass001.A0d(c5e9.A03, A0k));
            }
            c4oc.A03(r301, A0u);
            r301.A00(c41c.A03 ? (byte) 1 : (byte) 0);
            r301.A00(c41c.A02 ? (byte) 1 : (byte) 0);
            c4oc.A02(r301, c41c.A00);
        } else {
            r301.A00((byte) 0);
        }
        C41d c41d = (C41d) tigonRequest.getLayerInformation(AnonymousClass413.A00);
        if (c41d != null) {
            r301.A00((byte) 1);
            c4oc.A02(r301, c41d.A04);
            c4oc.A02(r301, c41d.A06);
            c4oc.A02(r301, c41d.A03);
            c4oc.A02(r301, c41d.A05);
            C4OC.A01(r301, c41d.A02);
            C4OC.A01(r301, c41d.A01);
            C4OC.A01(r301, c41d.A00);
        } else {
            r301.A00((byte) 0);
        }
        C41e c41e = (C41e) tigonRequest.getLayerInformation(AnonymousClass413.A04);
        if (c41e != null) {
            r301.A00((byte) 1);
            c4oc.A03(r301, Collections.unmodifiableMap(c41e.A00));
        } else {
            r301.A00((byte) 0);
        }
        AnonymousClass412 anonymousClass412 = (AnonymousClass412) tigonRequest.getLayerInformation(AnonymousClass413.A05);
        if (anonymousClass412 != null) {
            r301.A00((byte) 1);
            java.util.Map unmodifiableMap = Collections.unmodifiableMap(anonymousClass412.A00);
            11T.A0A(unmodifiableMap);
            c4oc.A03(r301, unmodifiableMap);
        } else {
            r301.A00((byte) 0);
        }
        C41f c41f = (C41f) tigonRequest.getLayerInformation(AnonymousClass413.A08);
        if (c41f == null) {
            r301.A00((byte) 0);
            return;
        }
        r301.A00((byte) 1);
        r301.A00(c41f.A05 ? (byte) 1 : (byte) 0);
        c4oc.A02(r301, c41f.A02);
        c4oc.A02(r301, c41f.A03);
        c4oc.A02(r301, c41f.A04);
        c4oc.A02(r301, c41f.A01);
        c4oc.A02(r301, c41f.A00);
    }
}
