package X;

import android.os.SystemClock;
import com.facebook.messaging.locationpermission.LocationPermissionRequest;

/* renamed from: X.Gmz, reason: case insensitive filesystem */
/* loaded from: Gmz.class */
public final class C2747Gmz extends AbstractC2748Gn0 {
    public static final String[] A00 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    public static final String[] A01 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    @Override // X.L4Y
    public void A02(MIT mit, LocationPermissionRequest locationPermissionRequest) {
        53U r0 = ((AbstractC2748Gn0) this).A01;
        String[] strArr = A00;
        Integer num = r0.BNK(strArr) ? 0S2.A00 : r0.BNK(A01) ? 0S2.A01 : 0S2.A0C;
        if (num != 0S2.A0C && (!locationPermissionRequest.A02 || num != 0S2.A01)) {
            A01(mit);
            return;
        }
        long j = AbstractC2748Gn0.A02;
        if (j >= 0 && SystemClock.elapsedRealtime() - j <= 10000) {
            mit.C4w();
            return;
        }
        boolean z = locationPermissionRequest.A02;
        if (!z) {
            strArr = A01;
        }
        r0.AHQ(A03(), new Rwc(mit, this, z), strArr);
        AbstractC2748Gn0.A02 = SystemClock.elapsedRealtime();
    }
}
