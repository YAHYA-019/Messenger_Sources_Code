package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: A1r.class */
public final class A1r implements 1HN {
    public final /* synthetic */ C2lh A00;
    public final /* synthetic */ C8h5 A01;
    public final /* synthetic */ boolean A02;

    public A1r(C2lh c2lh, C8h5 c8h5, boolean z) {
        this.A00 = c2lh;
        this.A01 = c8h5;
        this.A02 = z;
    }

    public final void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        C2lh c2lh = this.A00;
        C8h5 c8h5 = this.A01;
        7zN.A1U(c2lh, C8h5.A01(c8h5, c8h5.A02, this.A02));
    }
}
