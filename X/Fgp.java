package X;

import com.facebook.http.interfaces.RequestPriority;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgp.class */
public final class Fgp implements 1Ro {
    public static final String __redex_internal_original_name = "ReauthMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("password", (String) obj));
        return new C04103zy(RequestPriority.INTERACTIVE, 0S2.A01, "reauth", "POST", "/auth/reauth", A0s);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.auth.component.ReauthResult, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0w = AbH.A0w(anonymousClass439);
        String A0H = A0w.A0C("token").A0H();
        long A07 = A0w.A0C("creation_time").A07();
        long A072 = A0w.A0C(AbE.A00(63)).A07();
        ?? obj2 = new Object();
        obj2.A02 = A0H;
        obj2.A00 = A07;
        obj2.A01 = A072;
        return obj2;
    }
}
