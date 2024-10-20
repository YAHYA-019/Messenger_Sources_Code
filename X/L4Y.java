package X;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.locationpermission.LocationPermissionRequest;

/* loaded from: L4Y.class */
public abstract class L4Y {
    public static long A05;
    public static final String[] A06 = {"gps", "network"};
    public JvN A00;
    public final Context A01;
    public final LocationManager A02;
    public final Activity A03;
    public final Fragment A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.Context] */
    public L4Y(Activity activity, LocationManager locationManager, Fragment fragment) {
        this.A03 = activity;
        this.A04 = fragment;
        this.A01 = activity == null ? fragment.requireContext() : activity;
        this.A02 = locationManager;
    }

    public void A00() {
        if (this.A00 != null) {
            this.A01.getApplicationContext().unregisterReceiver(this.A00);
            this.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (X.JQx.A0O(r0) > 10000) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(X.MIT r302) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4Y.A01(X.MIT):void");
    }

    public abstract void A02(MIT mit, LocationPermissionRequest locationPermissionRequest);
}
