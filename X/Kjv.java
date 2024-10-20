package X;

import android.os.Bundle;

/* loaded from: Kjv.class */
public abstract class Kjv {
    public final Bundle A00;
    public final Bundle A01;
    public final Kic A02;
    public final String A03;

    public Kjv(Bundle bundle, Bundle bundle2, Kic kic, String str, boolean z) {
        7zR.A1O(bundle, bundle2);
        this.A03 = str;
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = kic;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
