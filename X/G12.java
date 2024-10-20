package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: G12.class */
public final class G12 implements Runnable {
    public static final String __redex_internal_original_name = "PlaybackBufferPredictor$preparePlaybackSetting$1";
    public final /* synthetic */ EqT A00;

    public G12(EqT eqT) {
        this.A00 = eqT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ArrayList A0s;
        EqT eqT = this.A00;
        synchronized (eqT) {
            if (eqT.A00.isEmpty()) {
                C00i c00i = eqT.A03.A00;
                if (1BK.A0I(c00i).AZk(36316503994411245L)) {
                    Epr epr = (Epr) 1Br.A0B(eqT.A04);
                    ArrayList A17 = 1BK.A17(epr.A01);
                    ArrayList A172 = 1BK.A17(epr.A02);
                    Collections.shuffle(A17);
                    Collections.shuffle(A172);
                    A0s = AnonymousClass001.A0s();
                    int min = Math.min(A17.size(), A172.size());
                    for (int i = 0; i < min; i++) {
                        A0s.add(new F8s(AnonymousClass001.A03(A17.get(i)), AnonymousClass001.A03(A172.get(i))));
                    }
                } else {
                    boolean AZk = 1BK.A0I(c00i).AZk(36316503994542318L);
                    Epr epr2 = (Epr) 1Br.A0B(eqT.A04);
                    if (AZk) {
                        A0s = AnonymousClass001.A0s();
                        List list = epr2.A01;
                        int size = list.size();
                        List list2 = epr2.A02;
                        int min2 = Math.min(size, list2.size());
                        for (int i2 = 0; i2 < min2; i2++) {
                            A0s.add(new F8s(DKE.A0G(list, i2), DKE.A0G(list2, i2)));
                        }
                    } else {
                        A0s = AnonymousClass001.A0s();
                        List list3 = epr2.A01;
                        int size2 = list3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            List list4 = epr2.A02;
                            int size3 = list4.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                A0s.add(new F8s(DKE.A0G(list3, i3), DKE.A0G(list4, i4)));
                            }
                        }
                    }
                }
                eqT.A00 = A0s;
            }
            Iterator it = eqT.A00.iterator();
            if (it.hasNext()) {
                F8s f8s = (F8s) it.next();
                java.util.Map map = eqT.A05;
                if (map.containsKey(f8s)) {
                    map.get(f8s);
                }
                SystemClock.elapsedRealtime();
                C00i c00i2 = eqT.A03.A00;
                1BK.A0I(c00i2).AZk(2342159513206925547L);
                11T.A0A(1BK.A0I(c00i2).BCy(36879453948412830L));
                1Lm.A06(7zQ.A0N().A04(), 114946);
                th = AnonymousClass001.A0T("Using looper stub");
            } else {
                eqT.A07 = F8s.A02;
                5LQ r0 = 5LQ.A02;
                synchronized (r0) {
                    try {
                        z = 5LQ.A01;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                if (z) {
                    r0.A00(eqT.A01 * 1000);
                }
                if (((String) 1Bn.A0A(83439)) != null) {
                    C04I.A00();
                }
                eqT.A05.get(eqT.A07);
            }
            throw th;
        }
    }
}
