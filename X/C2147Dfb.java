package X;

import java.util.BitSet;

/* renamed from: X.Dfb, reason: case insensitive filesystem */
/* loaded from: Dfb.class */
public final class C2147Dfb extends AbstractC2178Dg6 {
    public QqU A00;
    public Qpn A01;
    public RIF A02;
    public Ed1 A03;
    public F39 A04;
    public DgA A05;
    public DgB A06;
    public 1Im A07;
    public boolean A08;

    public C2147Dfb(1Iw r302) {
        super(r302);
        this.A00 = QqU.A02;
        this.A04 = F39.A00;
        this.A01 = Qpn.A01;
        this.A06 = DgB.A01;
        this.A05 = DgA.A00;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        this.A01.getClass();
        EvK A02 = ezJ.A02();
        A02.A02 = this.A01.hierarchyLevel;
        QqU qqU = this.A00;
        if (qqU != QqU.A03) {
            A02.A01 = new F7h(qqU.style.background);
        }
        EzJ A00 = A02.A00();
        Ds4 ds4 = new Ds4(new DyD(), super.A04);
        DyD dyD = ds4.A00;
        dyD.A03 = A00;
        BitSet bitSet = ds4.A02;
        bitSet.set(3);
        dyD.A00 = this.A00;
        bitSet.set(2);
        dyD.A05 = this.A06;
        bitSet.set(4);
        dyD.A04 = this.A05;
        bitSet.set(0);
        dyD.A07 = this.A08;
        bitSet.set(7);
        dyD.A06 = this.A07;
        ds4.A2T(null);
        dyD.A02 = this.A03;
        bitSet.set(5);
        dyD.A01 = this.A02;
        bitSet.set(1);
        bitSet.set(6);
        return ds4;
    }
}
