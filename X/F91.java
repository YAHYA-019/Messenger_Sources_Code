package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.FutureTask;

/* loaded from: F91.class */
public final class F91 {
    public final FGk A00;
    public final FxB A01;
    public final C0dr A02;
    public final 50G A03;

    public F91(FGk fGk, FxB fxB, 50G r304) {
        11T.A0F(r304, 3);
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        11T.A0A(realtimeSinceBootClock);
        this.A01 = fxB;
        this.A00 = fGk;
        this.A03 = r304;
        this.A02 = realtimeSinceBootClock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (r0.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.03Y A00(X.ELh r301, X.EI7 r302, X.F91 r303, X.Ey6 r304, java.lang.String r305, long r306, long r308, long r310) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F91.A00(X.ELh, X.EI7, X.F91, X.Ey6, java.lang.String, long, long, long):X.03Y");
    }

    public Ey7 A01(GH9 gh9) {
        Ey7 ey7;
        FxB fxB = this.A01;
        GH9 fxD = new FxD(gh9, 1);
        try {
            DKD.A1P("BloksComponentQueryLRUMemoryCache", "getSnapshotAndSubscribe");
            synchronized (fxB.A04) {
                ey7 = new Ey7(fxB.A03.A00(fxD), new FxC(fxB.A00));
            }
            1kF.A00();
            return new Ey7(ey7.A01, new Exm(((FxC) ey7.A00).A00));
        } catch (Throwable th) {
            1kF.A00();
            throw th;
        }
    }

    public final void A02(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((ELX) it.next()).ordinal();
            if (ordinal == 0) {
                FxB fxB = this.A01;
                try {
                    DKD.A1P("BloksComponentQueryLRUMemoryCache", "clear");
                    synchronized (fxB.A04) {
                        1Xo r0 = fxB.A02;
                        1Xo.A00(r0, -1);
                        LinkedHashMap A05 = r0.A05();
                        fxB.A00 = A05;
                        fxB.A03.A01(new FxC(A05));
                    }
                    1kF.A00();
                } catch (Throwable th) {
                    1kF.A00();
                    throw th;
                }
            } else if (ordinal == 1) {
                FGk fGk = this.A00;
                fGk.A04.execute(new FutureTask(new G6i(fGk, 0)));
            }
        }
    }
}
