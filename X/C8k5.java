package X;

import java.util.BitSet;

/* renamed from: X.8k5, reason: invalid class name */
/* loaded from: 8k5.class */
public final class C8k5 extends C1rj {
    public 5AS A00;

    public C8k5() {
        super("M3MigFlatButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5AS r0 = this.A00;
        8Qr r02 = new 8Qr(r302, new 8jK());
        CharSequence charSequence = r0.A01;
        8jK r03 = r02.A01;
        r03.A00 = charSequence;
        BitSet bitSet = r02.A02;
        bitSet.set(0);
        r03.A01 = true;
        7zN.A1C(r02, r302, C8k5.class, "M3MigFlatButtonAccessoryLayout");
        C1rs.A01(bitSet, r02.A03);
        r02.A0J();
        return r03;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        ((C8k5) r0).A00.A00.onClick(((3xC) obj).A00);
        return null;
    }
}
