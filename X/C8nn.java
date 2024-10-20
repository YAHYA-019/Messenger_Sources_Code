package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.8nn, reason: invalid class name */
/* loaded from: 8nn.class */
public final class C8nn extends C1rj {
    public static final 95O A05 = 95O.A02;
    public 95O A00;
    public 8NJ A01;
    public 8NK A02;
    public MigColorScheme A03;
    public boolean A04;

    public C8nn() {
        super("MigNux");
        this.A00 = A05;
        this.A04 = false;
    }

    public static 8Tn A00(1Iw r301) {
        return new 8Tn(r301, new C8nn());
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A03, this.A01, this.A02, Boolean.valueOf(this.A04)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A03;
        8NJ r0 = this.A01;
        8NK r02 = this.A02;
        95O r03 = this.A00;
        boolean z = this.A04;
        1BK.A1M(r302, migColorScheme);
        11T.A0F(r03, 4);
        boolean z2 = true;
        boolean A1T = AnonymousClass001.A1T(r0);
        if (r02 == null) {
            z2 = false;
        }
        if (!(z2 ^ A1T)) {
            throw 1BK.A0g();
        }
        2cM A00 = 2cK.A00(r302);
        C8R7 c8r7 = new C8R7(r302, new 8nL());
        8nL r04 = c8r7.A01;
        r04.A03 = migColorScheme;
        BitSet bitSet = c8r7.A02;
        bitSet.set(1);
        r04.A01 = r0;
        r04.A00 = r03;
        bitSet.set(0);
        r04.A04 = z;
        bitSet.set(2);
        r04.A02 = r02;
        c8r7.A0R();
        C1rs.A03(bitSet, c8r7.A03);
        c8r7.A0J();
        A00.A2e(r04);
        A00.A0R();
        return A00.A00;
    }
}
