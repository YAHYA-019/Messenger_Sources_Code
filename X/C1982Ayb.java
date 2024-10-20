package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Ayb, reason: case insensitive filesystem */
/* loaded from: Ayb.class */
public final class C1982Ayb extends C1rj {
    public MigColorScheme A00;
    public I3s A01;
    public boolean A02;

    public C1982Ayb() {
        super("CryptoKeysView");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, Boolean.valueOf(this.A02), this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A00;
        I3s i3s = this.A01;
        boolean z = this.A02;
        boolean A1X = 1BL.A1X(r302, migColorScheme);
        11T.A0F(i3s, 2);
        i3s.A00 = r302;
        QFC qfc = new QFC(r302, new QLM());
        QLM qlm = qfc.A01;
        qlm.A01 = migColorScheme;
        BitSet bitSet = qfc.A02;
        bitSet.set(0);
        qlm.A02 = i3s;
        bitSet.set(2);
        qlm.A03 = z;
        bitSet.set(A1X ? 1 : 0);
        qfc.A1w(i3s.A01);
        return qfc.A2W();
    }
}
