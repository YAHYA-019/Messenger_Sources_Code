package X;

import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg9.class */
public final class Cg9 implements 1Ro {
    public static final String __redex_internal_original_name = "PushTraceInfoConfirmationMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("event_info", "device_received"));
        A0s.add(new BasicNameValuePair("event_time", String.valueOf(System.currentTimeMillis())));
        A0s.add(new BasicNameValuePair("trace_info", (String) obj));
        return new C04103zy(0S2.A00, "pushTraceInfoConfirmation", "POST", "method/user.tracePush", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
