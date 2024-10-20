package X;

import android.graphics.drawable.Drawable;
import java.util.BitSet;

/* renamed from: X.8jd, reason: invalid class name */
/* loaded from: 8jd.class */
public final class C8jd extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;

    public C8jd() {
        super("BadgeIcon");
        this.A03 = 15;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), 0, 0, Integer.valueOf(this.A01), this.A04, Integer.valueOf(this.A02), Integer.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable drawable = this.A04;
        int i = this.A01;
        int i2 = this.A02;
        int i3 = this.A00;
        int i4 = this.A03;
        11T.A0F(r302, 0);
        8T1 A00 = C8nu.A00(r302);
        C2cm A002 = C2cl.A00(r302);
        A002.A2X(i2);
        A002.A2b(drawable);
        C8nu c8nu = A00.A00;
        c8nu.A05 = A002.A2V();
        BitSet bitSet = A00.A02;
        bitSet.set(0);
        c8nu.A03 = i;
        bitSet.set(1);
        c8nu.A00 = i3;
        c8nu.A01 = 0;
        c8nu.A02 = 0;
        c8nu.A04 = i4;
        return A00.A2W();
    }
}
