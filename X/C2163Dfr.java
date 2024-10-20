package X;

import java.util.BitSet;

/* renamed from: X.Dfr, reason: case insensitive filesystem */
/* loaded from: Dfr.class */
public final class C2163Dfr extends AbstractC2178Dg6 implements GKV {
    public C2165Dft A00;
    public EMj A01;
    public 1Im A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0L(CharSequence charSequence) {
        if (charSequence == null) {
            ((ESq) this).A00 = true;
            charSequence = null;
        }
        this.A03 = charSequence;
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        C2165Dft c2165Dft = this.A00;
        if (c2165Dft == null) {
            return null;
        }
        EMj eMj = this.A01;
        if (eMj == null) {
            ((ESq) this).A00 = true;
            eMj = null;
        }
        CharSequence charSequence = this.A03;
        if (charSequence == null) {
            ((ESq) this).A00 = true;
            charSequence = null;
        }
        if (eMj == null || charSequence == null) {
            return null;
        }
        DuR duR = new DuR(new DxM(), super.A04);
        boolean z = this.A04;
        DxM dxM = duR.A00;
        dxM.A05 = z;
        BitSet bitSet = duR.A02;
        bitSet.set(0);
        dxM.A01 = eMj;
        bitSet.set(4);
        dxM.A04 = charSequence;
        bitSet.set(1);
        dxM.A00 = c2165Dft;
        bitSet.set(3);
        dxM.A03 = this.A02;
        dxM.A06 = this.A05;
        dxM.A02 = ezJ;
        bitSet.set(2);
        return duR;
    }
}
