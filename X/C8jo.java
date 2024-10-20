package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8jo, reason: invalid class name */
/* loaded from: 8jo.class */
public final class C8jo extends C1rj {
    public BeX A00;
    public MigColorScheme A01;
    public 2MG A02;
    public C5xv A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;

    public C8jo() {
        super("MigEditTextTitleBar");
        this.A06 = Collections.emptyList();
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, this.A01, 1BK.A0d(), this.A04, this.A02, this.A00, Boolean.valueOf(this.A07), this.A05, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        String str = this.A05;
        String str2 = this.A04;
        2MG r306 = this.A02;
        C5xv c5xv = this.A03;
        BeX beX = this.A00;
        boolean z = this.A07;
        List list = this.A06;
        if (r306 == null) {
            r306 = c5xv == null ? 2MG.A06 : 2MG.A02;
        }
        C83r A00 = C5yy.A00(r302);
        C5yy c5yy = A00.A01;
        c5yy.A0H = false;
        A00.A2Y(migColorScheme);
        8RA r0 = new 8RA(r302, new C8lf());
        C8lf c8lf = r0.A01;
        c8lf.A04 = str;
        c8lf.A03 = str2;
        c8lf.A01 = beX;
        c8lf.A05 = z;
        c8lf.A02 = migColorScheme;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        r0.A0R();
        C1rs.A01(bitSet, r0.A03);
        C2ko c2ko = c8lf.A00;
        if (c2ko == null) {
            c2ko = 1LI.A0D(c8lf, r0.A00, 1597260695);
        }
        c8lf.A00 = c2ko;
        r0.A0J();
        A00.A2X(c8lf);
        c5yy.A0E = false;
        c5yy.A08 = r306;
        A00.A2Z(c5xv);
        A00.A2b(list);
        return A00.A2V();
    }
}
