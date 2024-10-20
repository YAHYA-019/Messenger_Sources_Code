package X;

import android.os.SystemClock;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0hj, reason: invalid class name */
/* loaded from: 0hj.class */
public final class C0hj implements C0iO, C0fq {
    public static C0hj A03;
    public final 0gK A00;
    public final 0jH A01;
    public final List A02 = AnonymousClass001.A0s();

    public C0hj(0gK r302, 0jH r303) {
        this.A01 = r303;
        this.A00 = r302;
        C0ft.A04(this, false);
    }

    public void A00(String str, String str2, final WeakReference weakReference) {
        0fH.A0j("lacrima", "NavigationDetector onDetect...");
        String str3 = "";
        if (str == null || str.equals(str3)) {
            str = "empty";
        }
        if (str2 == null || str2.equals(str3)) {
            str2 = "empty";
        }
        C0pu c0pu = this.A01.A03;
        0RZ.A02(c0pu);
        Object obj = c0pu.A02;
        synchronized (obj) {
            C0pu.A04(c0pu, str, 3, 80);
            C0pu.A02(c0pu);
        }
        synchronized (obj) {
            if (str2.length() < 80) {
                C0pu.A04(c0pu, str2, 85, 80);
            } else {
                String A0c = AnonymousClass001.A0c(str2, 80);
                str3 = str2.substring(80);
                C0pu.A04(c0pu, A0c, 85, 80);
            }
            C0pu.A04(c0pu, str3, 622, 127);
            String str4 = c0pu.A00;
            if (str4 != null) {
                C0pu.A04(c0pu, str4, 1778, 207);
            }
            C0pu.A02(c0pu);
            c0pu.A00 = str2;
        }
        C0o7 c0o7 = C0ft.A04;
        if (c0o7 != null) {
            c0o7.A04 = str;
            c0o7.A03 = str2;
            c0o7.A01 = SystemClock.uptimeMillis();
        }
        synchronized (C0ft.class) {
            if (!str2.equals(C0ft.A05)) {
                C0ft.A05 = str2;
                final HashSet hashSet = new HashSet(C0ft.A01);
                final String str5 = str;
                final String str6 = str2;
                C0ft.A03.execute(new Runnable() { // from class: X.05b
                    public static final String __redex_internal_original_name = "GlobalAppState$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        HashSet hashSet2 = hashSet;
                        String str7 = str5;
                        String str8 = str6;
                        WeakReference weakReference2 = weakReference;
                        boolean z = C0ft.A06;
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            ((0J1) it.next()).Bw1(str7, str8, weakReference2);
                        }
                    }
                });
            }
        }
        C0qh A00 = C0qh.A00();
        C0qh.A01(C0g6.A1w, A00, SystemClock.uptimeMillis());
        0gK r0 = this.A00;
        r0.A0A(A00, C0gq.CRITICAL_REPORT, this);
        r0.A0A(A00, C0gq.LARGE_REPORT, this);
        Iterator it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onEndpointChanged");
        }
    }

    @Override // X.C0fq
    public void BjC() {
    }

    @Override // X.C0fq
    public void BjH() {
        A00(null, null, null);
    }

    @Override // X.C0iO
    public /* synthetic */ int getHealthEventSamplingRate() {
        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
    }

    @Override // X.C0iO
    public /* synthetic */ C0l0 getLimiter() {
        return null;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return 0iP.A0N;
    }

    @Override // X.C0iO
    public void start() {
        A03 = this;
    }
}
