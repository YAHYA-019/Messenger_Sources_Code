package X;

import android.os.Process;
import android.os.SystemClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;

/* loaded from: G3k.class */
public final class G3k implements Runnable {
    public static final String __redex_internal_original_name = "FxFBMasterAccountCacheHelper$genCacheAccessQplEvent$1";
    public final /* synthetic */ EKR A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ java.util.Map A02;

    public G3k(EKR ekr, String str, java.util.Map map) {
        this.A00 = ekr;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EKR ekr = this.A00;
        1Br r0 = ekr.A0E;
        7zP.A0e(r0).markerStart(444803545);
        7zP.A0e(r0).markerAnnotate(444803545, "should_use_omnistore", ekr.A0I());
        QuickPerformanceLogger A0e = 7zP.A0e(r0);
        1Br.A0C(ekr.A0D);
        1G1 r02 = ekr.A04;
        A0e.markerAnnotate(444803545, "is_msys_ready", false);
        7zP.A0e(r0).markerAnnotate(444803545, "time_since_app_start_ms", SystemClock.uptimeMillis() - Process.getStartUptimeMillis());
        7zP.A0e(r0).markerAnnotate(444803545, "caller_name", this.A01);
        7zP.A0e(r0).markerAnnotate(444803545, "is_aic_query", 1Br.A07(((EnP) 1Br.A0B(ekr.A05)).A00).AZr(1GD.A05, 18305928004975918L));
        QuickPerformanceLogger A0e2 = 7zP.A0e(r0);
        java.util.Map map = this.A02;
        A0e2.markerAnnotate(444803545, "total_account_count", 0QD.A01(map.values()));
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            String A0i = AnonymousClass001.A0i(A1B);
            7zP.A0e(r0).markerAnnotate(444803545, 0Pz.A0W(1BK.A13(A0i), "_account_count"), 7zR.A05(1BK.A0o(A0i, map)));
        }
        QuickPerformanceLogger A0e3 = 7zP.A0e(r0);
        1G1 r03 = r02;
        A0e3.markerAnnotate(444803545, "is_primary_profile", 11T.A0O(r03.A05, r03.A04));
        7zP.A0e(r0).markerAnnotate(444803545, "is_cache_expired", ekr.A0J());
        7zP.A0e(r0).markerEnd(444803545, (short) 467);
    }
}
