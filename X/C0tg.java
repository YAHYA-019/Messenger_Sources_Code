package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.0tg, reason: invalid class name */
/* loaded from: 0tg.class */
public abstract class C0tg implements IVerboseDebuggable {
    public static final 0KO A05 = new 0KO("ActivityLifecycleCodes");
    public C0te A00 = C0te.A0B;
    public C0ti[] A01 = null;
    public final Class A02;
    public final String A03;
    public final C0ti[] A04;

    public C0tg(String str, C0ti... c0tiArr) {
        this.A03 = str;
        c0tiArr.getClass();
        this.A04 = c0tiArr;
        this.A02 = c0tiArr.getClass();
    }

    public void A00(StringBuilder sb) {
        C0ti[] c0tiArr = this.A04;
        C0ti[] c0tiArr2 = this.A01;
        if (c0tiArr2 != null) {
            sb.append("Proccessed codes");
            c0tiArr = c0tiArr2;
        } else {
            sb.append("Potential codes");
        }
        sb.append(": [");
        for (C0ti c0ti : c0tiArr) {
            if (c0ti != null) {
                sb.append(C0ti.A00(c0ti));
                AnonymousClass001.A1H(sb);
            }
        }
        sb.append(']');
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(C0db.A00(this.A03));
        A0k.append(" ");
        A0k.append(this.A00.friendlyName);
        A0k.append(" ");
        A00(A0k);
        return A0k.toString();
    }
}
