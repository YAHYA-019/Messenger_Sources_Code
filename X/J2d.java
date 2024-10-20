package X;

import java.util.concurrent.Executor;

/* loaded from: J2d.class */
public final class J2d implements Runnable {
    public static final String __redex_internal_original_name = "KFrescoController$fetch$1$2";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 5C4 A01;
    public final /* synthetic */ 5BR A02;
    public final /* synthetic */ ISk A03;
    public final /* synthetic */ Object A04;

    public J2d(5C4 r302, 5BR r303, ISk iSk, Object obj, long j) {
        this.A00 = j;
        this.A01 = r302;
        this.A03 = iSk;
        this.A02 = r303;
        this.A04 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.A00;
        GSl gSl = this.A01;
        if (j == gSl.Aq3()) {
            ISk iSk = this.A03;
            1OW A02 = iSk.A02.A02(this.A02, (2IE) null, this.A04, j);
            GSl gSl2 = gSl;
            C0Bd c0Bd = iSk.A06;
            HnG hnG = iSk.A00;
            Executor executor = iSk.A05;
            A02.D3K(new Rno(hnG, gSl2, executor, c0Bd, j), executor);
            gSl2.A0F.Cvy(gSl2, A02, GSl.A0P[0]);
        }
    }
}
