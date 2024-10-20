package X;

/* loaded from: IkJ.class */
public final class IkJ implements JJK {
    public Hqj A00;
    public int A01;
    public final ICS A02;
    public final QxZ A03;
    public final JJK A04;
    public final Rb8 A05;
    public final Integer A06;
    public final /* synthetic */ IkM A07;

    public IkJ(ICS ics, QxZ qxZ, JJK jjk, IkM ikM, Rb8 rb8, Integer num) {
        this.A07 = ikM;
        this.A06 = num;
        this.A04 = jjk;
        this.A03 = qxZ;
        this.A05 = rb8;
        this.A02 = ics;
    }

    @Override // X.JJK
    public void Bq8(String str, int i, java.util.Map map) {
        synchronized (this) {
            this.A04.Bq8(str, i, map);
        }
    }

    @Override // X.JJK
    public void Bxr(Exception exc, java.util.Map map, int i, boolean z) {
        synchronized (this) {
            11T.A0F(map, 3);
            if (z) {
                int i2 = this.A01;
                if (i2 < 5) {
                    this.A01 = i2 + 1;
                    int intValue = this.A06.intValue();
                    if (intValue == 0) {
                        this.A07.A00.ClC(this.A00, this);
                    } else if (intValue != 1) {
                        JM1 jm1 = this.A07.A00;
                        QxZ qxZ = this.A03;
                        if (qxZ == null) {
                            throw 1BK.A0h();
                        }
                        jm1.Ckb(qxZ, this);
                    } else {
                        this.A07.A00.Cl7(this.A02, this.A03, this, this.A05);
                    }
                }
            }
            this.A04.Bxr(exc, map, i, z);
        }
    }
}
