package X;

import android.os.SystemClock;
import com.facebook.messaging.locationpermission.LocationPermissionRequest;

/* renamed from: X.Gmy, reason: case insensitive filesystem */
/* loaded from: Gmy.class */
public final class C2746Gmy extends AbstractC2748Gn0 {
    public static final String[] A00 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    @Override // X.L4Y
    public void A02(MIT mit, LocationPermissionRequest locationPermissionRequest) {
        53U r0 = ((AbstractC2748Gn0) this).A01;
        String[] strArr = A00;
        if ((r0.BNK(strArr) ? 0S2.A00 : 0S2.A0C) != 0S2.A0C) {
            A01(mit);
            return;
        }
        long j = AbstractC2748Gn0.A02;
        if (j >= 0 && SystemClock.elapsedRealtime() - j <= 10000) {
            mit.C4w();
        } else {
            r0.AHQ(A03(), new IgE(mit, this), strArr);
            AbstractC2748Gn0.A02 = SystemClock.elapsedRealtime();
        }
    }
}
