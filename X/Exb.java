package X;

import com.mapbox.mapboxsdk.BuildConfig;

/* loaded from: Exb.class */
public final class Exb {
    public final 1Br A00 = 7zM.A0S();

    public final void A00(String str) {
        C00i c00i = this.A00.A00;
        if (1BK.A0V(c00i).isMarkerOn(2293785)) {
            1BK.A0V(c00i).markerPoint(2293785, str);
        }
    }

    public final void A01(String str) {
        C00i c00i = this.A00.A00;
        1BK.A0V(c00i).markerStart(2293785);
        1BK.A0V(c00i).markerAnnotate(2293785, "login_flow", BuildConfig.KEYSTORE_TYPE);
        1BK.A0V(c00i).markerAnnotate(2293785, "login_type", str);
    }

    public final void A02(short s) {
        7zP.A0e(this.A00).markerEnd(2293785, s);
    }
}
