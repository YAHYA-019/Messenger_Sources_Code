package X;

import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg0.class */
public final class Cg0 implements 1Ro {
    public static final String __redex_internal_original_name = "MarkFriendRequestsSeenMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("seen", "true"));
        A0s.add(new BasicNameValuePair("format", "json"));
        return new C04103zy(0S2.A01, "markFriendRequestsSeen", "POST", "me/friendrequests", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
