package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3cg, reason: invalid class name */
/* loaded from: 3cg.class */
public final class C3cg implements 2vK {
    public final /* synthetic */ 2vD A00;
    public final /* synthetic */ 2vH A01;

    public C3cg(2vD r302, 2vH r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    public void Bpz(2vI r302) {
        boolean A08 = r302.A08();
        if (A08) {
            ArrayList A0s = AnonymousClass001.A0s();
            2vD r0 = this.A00;
            Set set = r0.A0A;
            A0s.add(new 2vF(0S2.A0N, set));
            for (C2v1 c2v1 : r0.A09) {
                2vG r02 = new 2vG(2vC.A09, (String) null, (String) null, A0s, set, set, -1);
                boolean equals = "AUTO_UNINSTALL".equals(r0.A03);
                if (c2v1 instanceof C2v8) {
                    1Fe r03 = ((C2v8) c2v1).A00;
                    1Fi A00 = r03.A00("AppModules::UninstallInitialRequestTime");
                    InterfaceC00051a0 AP5 = A00.AP5();
                    InterfaceC00051a0 AP52 = r03.A00("AppModules::Uninstall").AP5();
                    InterfaceC00051a0 AP53 = r03.A00("AppModules::PrevDownload").AP5();
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = r02.A08.iterator();
                    while (it.hasNext()) {
                        String A0i = AnonymousClass001.A0i(it);
                        if (!A00.contains(A0i)) {
                            AP5.CaG(A0i, currentTimeMillis);
                        }
                        AP52.Ca2(A0i, true);
                        AP53.Cdi(A0i);
                    }
                    AP5.apply();
                    AP52.apply();
                    AP53.apply();
                } else if (c2v1 instanceof C2v6) {
                    C2v6 c2v6 = (C2v6) c2v1;
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c2v6.A03;
                    int i = c2v6.A00;
                    int i2 = r02.A02;
                    lightweightQuickPerformanceLogger.markerStart(i, i2);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "downloader", c2v6.A04.getName());
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "use_case", r02.A03.toString());
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "auto_uninstalled", equals);
                    Set set2 = r02.A08;
                    String[] strArr = new String[set2.size()];
                    long[] jArr = new long[set2.size()];
                    1Fi A002 = c2v6.A01.A00("AppModules::LastLoadTimestamp");
                    Iterator it2 = set2.iterator();
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (!it2.hasNext()) {
                            break;
                        }
                        String A0i2 = AnonymousClass001.A0i(it2);
                        strArr[i4] = A0i2;
                        jArr[i4] = A002.getLong(A0i2, 0L);
                        i3 = i4 + 1;
                    }
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "modules", strArr);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "last_load_times", jArr);
                    lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2);
                }
            }
        }
        this.A01.A01(new 2vM(A08));
    }
}
