package com.facebook.analytics;

import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Fe;
import X.1Fi;
import X.1G2;
import X.1Ql;
import X.2Jy;
import X.2wZ;
import X.C00i;
import X.InterfaceC00051a0;
import X.InterfaceC08314mj;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Set;

/* loaded from: ClientPeriodicEventReporterManager.class */
public final class ClientPeriodicEventReporterManager {
    public 1Fi A01;
    public final C00i A06 = new 1BQ(16765);
    public final C00i A03 = new 1BQ(33013);
    public final C00i A08 = new 1BQ(16496);
    public final C00i A07 = new 1BQ(16511);
    public final C00i A02 = new 1BQ(99936);
    public final C00i A05 = new 1BQ(49240);
    public long A00 = -1;
    public final C00i A04 = new 1BQ(16385);
    public volatile boolean A09 = false;

    public static void A00(ClientPeriodicEventReporterManager clientPeriodicEventReporterManager, long j) {
        synchronized (clientPeriodicEventReporterManager) {
            clientPeriodicEventReporterManager.A00 = j;
        }
    }

    public 2Jy A01(InterfaceC08314mj interfaceC08314mj, String str, long j) {
        try {
            return interfaceC08314mj.AU5(str, j);
        } catch (Throwable th) {
            1BK.A09(this.A07).softReport("client_side_periodic_reporter_throw", interfaceC08314mj.getClass().toString(), th);
            return null;
        }
    }

    public 1Fi A02() {
        1Fi r0;
        synchronized (this) {
            if (this.A01 == null) {
                1Fi A00 = ((1Fe) this.A08.get()).A00("analytics_periodic_events");
                this.A01 = A00;
                if (!A00.getBoolean("client_periodic_lightprefs_migration", false)) {
                    C00i c00i = this.A03;
                    FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
                    1G2 r02 = 2wZ.A0G;
                    Set<1G2> Asu = fbSharedPreferences.Asu(r02);
                    InterfaceC00051a0 AP5 = this.A01.AP5();
                    1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
                    for (1G2 r03 : Asu) {
                        AP5.CaG(r03.A09(r02), 1BL.A0A(1BK.A0R(c00i), r03));
                        edit.Cdj(r03);
                    }
                    AP5.Ca2("client_periodic_lightprefs_migration", true);
                    AP5.commit();
                    edit.commit();
                }
            }
            r0 = this.A01;
        }
        return r0;
    }

    public void A03(String str, long j, boolean z) {
        long j2 = z ? 3600000L : 900000L;
        if (j < j2) {
            0fH.A0T(getClass(), "Requested time interval of %d ms should be increased to at least %d ms for %s", new Object[]{Long.valueOf(j), Long.valueOf(j2), str});
        }
    }
}
