package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.2iy, reason: invalid class name */
/* loaded from: 2iy.class */
public final class C2iy implements C2iz {
    public 2ZQ A00;
    public final C00i A01 = new 1BQ(17085);

    @Override // X.C2iz
    public void AU9(C2j1 c2j1) {
        c2j1.A00(29);
        c2j1.A00(30);
        c2j1.A00(31);
    }

    @Override // X.C2iz
    public void AUA(C2mq c2mq) {
        2ZQ r0;
        ImmutableList immutableList;
        int AU8 = c2mq.AU8();
        if (AU8 == 29) {
            2ZQ r02 = this.A00;
            if (r02 != null) {
                0fH.A0j("ForegroundThreadMessagesPrefetcher", "onActiveNowComponentInvisible");
                r02.A00.A0G.set(false);
                return;
            }
            return;
        }
        if (AU8 == 30) {
            C5bs c5bs = (C5bs) c2mq;
            2ZQ r03 = this.A00;
            if (r03 != null) {
                ImmutableList immutableList2 = c5bs.A00;
                0fH.A0j("ForegroundThreadMessagesPrefetcher", "onActiveNowComponentViewportChanged");
                r03.A00.A02(immutableList2);
                return;
            }
            return;
        }
        if (AU8 != 31 || (r0 = this.A00) == null) {
            return;
        }
        0fH.A0j("ForegroundThreadMessagesPrefetcher", "onActiveNowComponentVisible");
        2ZP r04 = r0.A00;
        r04.A0G.set(true);
        0WH r05 = r04.A02;
        synchronized (r05) {
            if (r05.isEmpty()) {
                immutableList = null;
            } else {
                immutableList = ImmutableList.copyOf((Collection) r05);
                r05.clear();
            }
        }
        if (immutableList == null || immutableList.isEmpty()) {
            return;
        }
        r04.A02(immutableList);
    }
}
