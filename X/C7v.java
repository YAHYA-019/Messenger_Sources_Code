package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: C7v.class */
public final class C7v {
    public Throwable A00;
    public final AnonymousClass047 A01;
    public final java.util.Map A02 = 1BK.A1C();
    public final String A03;

    public C7v(AnonymousClass046 anonymousClass046, String str) {
        this.A03 = str;
        this.A01 = anonymousClass046.ACu(str, 659044095);
    }

    public final void A00() {
        this.A01.report();
        0fH.A0k("RtcUnexpectedEvent", this.A03);
        Throwable th = this.A00;
        if (th != null) {
            0fH.A0k("RtcUnexpectedEvent", String.valueOf(C0ra.A00(th)));
        }
        Iterator A0y = AnonymousClass001.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            0fH.A0k("RtcUnexpectedEvent", 0Pz.A0v("\t ", AnonymousClass001.A0j(A0z), " = ", 1BK.A16(A0z)));
        }
    }

    public final void A01(String str, String str2) {
        11T.A0F(str2, 1);
        this.A01.A8K(str, str2);
        this.A02.put(str, str2);
    }
}
