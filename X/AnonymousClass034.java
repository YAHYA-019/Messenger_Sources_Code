package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.034, reason: invalid class name */
/* loaded from: 034.class */
public abstract class AnonymousClass034 {
    public static boolean A00;

    public final void A01() {
        0fH.A0j("MQD", "start initializing...");
        07N.A04 = SystemClock.uptimeMillis();
        AnonymousClass034 c0vg = A00 ? new C0vg(this) : this;
        0Lz A02 = c0vg.A02();
        if (A02.A01() || !(A02.A02() || A02.A04() || A02.A06() || A02.A05() || A02.A07() || A02.A03())) {
            07N.A07 = true;
            0fH.A0j("MQD", "MQD is disabled.");
            return;
        }
        07N.A08 = A02.A05();
        0Wq r303 = 0Wq.A02;
        if (r303 == null) {
            r303 = new 0Wq();
            0Wq.A02 = r303;
        }
        r303.A00.post(new 0Wb(c0vg));
    }

    public abstract 0Lz A02();

    public abstract 0Wx A03();

    public abstract C0Wy A04();

    public abstract C0Wy A05();

    public abstract 0X8 A06();

    public abstract C0hg A07();

    public abstract C0Cy A08();

    public abstract void A09(List list);

    public abstract void A0A(List list);
}
