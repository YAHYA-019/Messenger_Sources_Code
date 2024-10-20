package X;

import com.facebook.payments.p2m.messenger.plugins.payment.ctahandler.bloksasynccontroller.P2mBloksAsyncControllerXmaHandler$ActionContentBlob$Companion;

/* loaded from: Jt4.class */
public final class Jt4 extends C04v {
    public static final 5Yu[] A03;
    public static final P2mBloksAsyncControllerXmaHandler$ActionContentBlob$Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final java.util.Map A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.payments.p2m.messenger.plugins.payment.ctahandler.bloksasynccontroller.P2mBloksAsyncControllerXmaHandler$ActionContentBlob$Companion] */
    static {
        5ZL r0 = 5ZL.A01;
        A03 = new 5Yu[]{null, null, new 5ZR(r0, r0)};
    }

    public /* synthetic */ Jt4(String str, String str2, java.util.Map map, int i) {
        if (3 != (i & 3)) {
            7mU.A00(Lvr.A01, i, 3);
            throw 0Q8.createAndThrow();
        }
        this.A00 = str;
        this.A01 = str2;
        if ((i & 4) != 0) {
            this.A02 = map;
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ActionContentBlob(action_type=");
        A0k.append(this.A00);
        A0k.append(", entry_point=");
        A0k.append(this.A01);
        A0k.append(", extra_data=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
