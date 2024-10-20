package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Ayi, reason: case insensitive filesystem */
/* loaded from: Ayi.class */
public final class C1989Ayi extends C1rj {
    public 4LS A00;
    public MigColorScheme A01;
    public C5xv A02;
    public String A03;
    public List A04;
    public boolean A05;

    public C1989Ayi() {
        super("RestrictedListPickerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, Boolean.valueOf(this.A05), this.A02, this.A03, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rs A00;
        MigColorScheme migColorScheme = this.A01;
        String str = this.A03;
        boolean z = this.A05;
        List list = this.A04;
        C5xv c5xv = this.A02;
        4LS r0 = this.A00;
        1BK.A1M(r302, migColorScheme);
        7zT.A11(2, str, list, c5xv, r0);
        2cM A002 = 2cK.A00(r302);
        C1895Avw c1895Avw = new C1895Avw(r302, new C1990Ayj());
        C1990Ayj c1990Ayj = c1895Avw.A01;
        c1990Ayj.A04 = str;
        BitSet bitSet = c1895Avw.A02;
        bitSet.set(2);
        c1990Ayj.A02 = migColorScheme;
        bitSet.set(0);
        c1990Ayj.A05 = true;
        c1990Ayj.A03 = c5xv;
        bitSet.set(1);
        A002.A2d(c1895Avw);
        C2ze A003 = 2hU.A00(r302);
        String A0D = r302.A0D(2131962707);
        2hU r02 = A003.A01;
        r02.A0B = A0D;
        7zM.A1O(A003, migColorScheme);
        A003.A2Y(new 2hR(migColorScheme));
        A003.A2X(CpV.A00);
        r02.A05 = r0;
        r02.A00 = 268435456;
        A002.A2e(A003.A2W());
        if (z) {
            A00 = 2cK.A00(r302);
            7zM.A1O(A00, migColorScheme);
            A00.A2c();
            A00.A0R();
            A00.A2e(AbN.A0S(r302, migColorScheme));
        } else {
            A00 = 8mB.A00(r302);
            7zM.A1O(A00, migColorScheme);
            A00.A0R();
            A00.A2Y(ImmutableList.copyOf((Collection) list));
        }
        return 7zL.A0U(A002, A00);
    }
}
