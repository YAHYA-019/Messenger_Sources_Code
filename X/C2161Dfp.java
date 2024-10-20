package X;

import java.util.BitSet;

/* renamed from: X.Dfp, reason: case insensitive filesystem */
/* loaded from: Dfp.class */
public final class C2161Dfp extends AbstractC2178Dg6 implements GLn {
    public FF6 A00;
    public ENn A01;
    public ENO A02;
    public F6n A03;
    public ENX A04;
    public 1Im A05;
    public CharSequence A06;
    public CharSequence A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final ENu A0D;

    public C2161Dfp(1Iw r302) {
        super(r302);
        this.A02 = ENO.A02;
        this.A01 = ENn.A03;
        ENX enx = ENX.A03;
        this.A04 = enx;
        this.A0A = true;
        this.A03 = F6n.A0C;
        this.A0D = this.A0C ? enx.active : enx.inactive;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        DuJ duJ = new DuJ(new DxP(), super.A04);
        DxP dxP = duJ.A00;
        dxP.A05 = ezJ;
        BitSet bitSet = duJ.A02;
        bitSet.set(1);
        dxP.A00 = this.A00;
        bitSet.set(4);
        boolean z = this.A0C;
        dxP.A09 = z ? this.A08 : this.A09;
        bitSet.set(9);
        dxP.A0C = z;
        bitSet.set(7);
        bitSet.set(8);
        dxP.A04 = this.A04;
        bitSet.set(11);
        dxP.A02 = this.A02;
        bitSet.set(12);
        dxP.A01 = this.A01;
        bitSet.set(10);
        dxP.A0A = this.A0A;
        bitSet.set(2);
        dxP.A06 = this.A05;
        dxP.A0B = this.A0B;
        bitSet.set(6);
        dxP.A03 = this.A03;
        bitSet.set(3);
        CharSequence charSequence = this.A06;
        if (charSequence == null) {
            charSequence = this.A08;
        }
        dxP.A07 = charSequence;
        bitSet.set(0);
        CharSequence charSequence2 = this.A07;
        if (charSequence2 == null) {
            charSequence2 = this.A09;
        }
        dxP.A08 = charSequence2;
        bitSet.set(5);
        return duJ;
    }

    @Override // X.GLn
    public ENu BDD() {
        return this.A0D;
    }

    @Override // X.GLn
    public ENO BKl() {
        return this.A02;
    }
}
