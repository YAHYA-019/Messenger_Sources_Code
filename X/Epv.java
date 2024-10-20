package X;

import android.os.Looper;

/* loaded from: Epv.class */
public final class Epv {
    public final MS5 A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;

    public Epv(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A05 = 1Bu.A03(r0, 16428);
        1Br A03 = 1Bu.A03(r0, 83719);
        this.A02 = A03;
        this.A03 = 1HG.A00(AbJ.A05(A03), 99435);
        this.A01 = 1Bq.A00(100034);
        this.A04 = 1Bq.A00(83633);
        Looper mainLooper = Looper.getMainLooper();
        11T.A0A(mainLooper);
        this.A00 = new MS5(mainLooper, this);
    }
}
