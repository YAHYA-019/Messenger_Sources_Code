package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.inject.FbInjector;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Kvy.class */
public final class Kvy {
    public static final int A00() {
        Context A00 = FbInjector.A00();
        1Bn.A0A(68908);
        11T.A0D(A00);
        11T.A0F(A00, 0);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
        try {
            return A00.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }
}
