package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Fbw.class */
public final class Fbw implements GEM {
    public static final 1G2 A01 = 1G3.A01(1G0.A04, "/ard_versioned_capability_experiment");
    public final C00i A00 = AbH.A0S();

    public boolean AEr(VersionedCapability versionedCapability, String str) {
        C00i c00i = this.A00;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        1G2 r0 = A01;
        String name = versionedCapability.name();
        String BD0 = A0R.BD0(1G3.A01(r0, name));
        boolean z = false;
        if (!2Go.A00(str, BD0)) {
            1Ql A0V = 1BL.A0V(c00i);
            if (BD0 == null || str != null) {
                DKE.A1M(r0, A0V, name, str);
                z = true;
            } else {
                A0V.Cdj(1G3.A01(r0, name));
            }
            A0V.commit();
        }
        return z;
    }
}
