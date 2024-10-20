package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.2p9, reason: invalid class name */
/* loaded from: 2p9.class */
public final class C2p9 extends C1rj {
    public static final 2KG A09 = 2KG.A03;
    public int A00;
    public int A01;
    public Drawable A02;
    public 2KG A03;
    public C2p1 A04;
    public 2KE A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public C2p9() {
        super("M4ThreadNameComponent");
        this.A07 = false;
        this.A00 = 1;
        this.A03 = A09;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2p1 c2p1 = this.A04;
        2KE r0 = this.A05;
        int i = this.A01;
        boolean z = this.A08;
        String str = this.A06;
        boolean z2 = this.A07;
        int i2 = this.A00;
        2KG r02 = this.A03;
        Drawable drawable = this.A02;
        11T.A0F(r302, 0);
        11T.A0F(r0, 2);
        11T.A0F(r02, 8);
        2zY r03 = new 2zY(r302, new C2qk());
        r03.A2Z(c2p1);
        C2qk c2qk = r03.A01;
        c2qk.A0B = z;
        c2qk.A09 = str;
        c2qk.A00 = i2;
        c2qk.A07 = r02;
        c2qk.A02 = r03.A02.A06(2KK.A03(r0).textSizeResId);
        r03.A02.set(2);
        2KQ A04 = 2KK.A04(r0);
        Context context = r302.A0D;
        11T.A0A(context);
        c2qk.A03 = A04.A00(context);
        r03.A2Y(i);
        c2qk.A0A = z2;
        c2qk.A04 = drawable;
        return r03.A2W();
    }
}
