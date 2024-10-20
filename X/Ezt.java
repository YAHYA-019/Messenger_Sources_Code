package X;

import com.facebook.zero.sdk.json.JSONObjectImpl;
import java.util.Iterator;

/* loaded from: Ezt.class */
public final class Ezt {
    public final 2DM A00 = AnonymousClass243.A00().A0K();

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.facebook.zero.sdk.json.JSONObjectImpl] */
    public JSONObjectImpl A00() {
        2DM r0 = this.A00;
        11T.A0F(r0, 1);
        ?? obj = new Object();
        obj.nodeInner = r0;
        return obj;
    }

    public void A01(JSONObjectImpl jSONObjectImpl, String str) {
        11T.A0F(str, 0);
        this.A00.A0e(jSONObjectImpl.nodeInner, str);
    }

    public void A02(1Pr r302, String str) {
        C03353xs A0k = DKC.A0k(AnonymousClass243.A00()._deserializationConfig._nodeFactory);
        Iterator it = r302.iterator();
        while (it.hasNext()) {
            F9f f9f = (F9f) it.next();
            11T.A0I(f9f, "null cannot be cast to non-null type com.facebook.zero.sdk.json.JSONNodeImpl");
            A0k.A0d(f9f.A00);
        }
        this.A00.A0e(A0k, str);
    }

    public /* bridge */ /* synthetic */ void A03(String str, Boolean bool) {
        this.A00.A0p(str, bool.booleanValue());
    }

    public /* bridge */ /* synthetic */ void A04(String str, Long l) {
        long longValue = l.longValue();
        11T.A0F(str, 0);
        this.A00.A0j(str, longValue);
    }

    public void A05(String str, String str2) {
        11T.A0H(str, str2);
        this.A00.A0o(str, str2);
    }
}
