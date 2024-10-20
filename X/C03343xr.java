package X;

import com.facebook.inject.FbInjector;

/* renamed from: X.3xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xr.class */
public final class C03343xr implements 0Gk, 1Nq {
    public final C00i A02 = new 1BQ(16385);
    public final C00i A01 = new 1BQ(16511);
    public final C00i A00 = FbInjector.A00;
    public final C00i A03 = new 1BV(33061);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03343xr.A00():boolean");
    }

    public boolean A01() {
        ((03D) this.A03.get()).A04("ProfiloConfigUpdater", "Config update after cold start");
        return A00();
    }

    public int Adi() {
        return 29651;
    }

    public void BqJ(int i) {
        synchronized (this) {
            ((03D) this.A03.get()).A04("ProfiloConfigUpdater", "Config update trigger from MC");
            A00();
        }
    }

    public void BqO(boolean z, String str) {
        if (z) {
            return;
        }
        1BK.A09(this.A01).D0v("ProfiloConfigUpdater", "Could not remove init file based config");
    }

    public void BqP(boolean z) {
        if (z) {
            return;
        }
        1BK.A09(this.A01).D0v("ProfiloConfigUpdater", "Could not read config file");
    }

    public void BqQ(boolean z) {
        if (z) {
            return;
        }
        1BK.A09(this.A01).D0v("ProfiloConfigUpdater", "Failure in parsing json (v2) from MobileConfig.");
    }

    public void BqS(boolean z) {
        if (z) {
            return;
        }
        1BK.A09(this.A01).D0v("ProfiloConfigUpdater", "Could not write init file based config");
    }
}
