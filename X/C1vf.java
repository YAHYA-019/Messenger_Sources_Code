package X;

import com.facebook.fury.context.ReqContextTypeResolver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1vf, reason: invalid class name */
/* loaded from: 1vf.class */
public final class C1vf {
    public final 1Br A05 = 1Bq.A00(16431);
    public final 1Br A04 = 1Bq.A00(33140);
    public final 1Br A09 = 1Bq.A00(84488);
    public final 1Br A08 = 1Bq.A00(16634);
    public final 1Br A07 = 1Bu.A00(33141);
    public final 1Br A06 = 1Bq.A00(16853);
    public final 1Br A03 = 1Bq.A00(33137);
    public final 1Br A02 = 1Bu.A00(33139);
    public final AtomicBoolean A0A = new AtomicBoolean(true);
    public final C1w0 A01 = new C1w0((C1vy) this.A03.A00.get(), (C1vh) this.A06.A00.get(), false);
    public C1w0 A00 = new C1w0((C1vy) this.A03.A00.get(), (C1vh) this.A06.A00.get(), true);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0149, code lost:
    
        if (r306 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C1vf r301, java.lang.String r302, long r303) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1vf.A00(X.1vf, java.lang.String, long):void");
    }

    public void A01(final String str, long j) {
        final long now = ((C0dr) this.A09.A00.get()).now();
        if (j == -1) {
            j = 332366327812798L;
        }
        1EK.A09(str, j);
        try {
            1ED r0 = (1ED) this.A05.A00.get();
            Runnable runnable = new Runnable(this) { // from class: X.1w3
                public static final String __redex_internal_original_name = "AppJobsSchedulerImpl$onTrigger$1";
                public final /* synthetic */ C1vf A01;

                {
                    this.A01 = this;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x01f8, code lost:
                
                    if (r307 == false) goto L12;
                 */
                /* JADX WARN: Removed duplicated region for block: B:11:0x00c0  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0162  */
                /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x018c  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x01a2  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x01c5  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x01d9  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x01e9  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 545
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1w3.run():void");
                }
            };
            int i = 4;
            if (ReqContextTypeResolver.sProvider == null) {
                i = 0;
            }
            r0.execute(C0jy.A02(runnable, "AppJobsSchedulerImpl", i));
        } finally {
            1EK.A03();
        }
    }
}
