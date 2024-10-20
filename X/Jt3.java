package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: Jt3.class */
public final class Jt3 extends C04v {
    public static final KWw Companion = new Object();
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public Jt3(boolean z, String str, Object obj) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OdinResult(result=");
        A0k.append(this.A00);
        A0k.append(DKB.A00(ActionId.SERVICE_ON_START_COMMAND));
        A0k.append(this.A02);
        A0k.append(4YT.A00(203));
        return DKH.A0o(this.A01, A0k);
    }
}
