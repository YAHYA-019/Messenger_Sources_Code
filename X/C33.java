package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: C33.class */
public final class C33 {
    public final 1I7 A00;
    public final Context A01;

    public C33() {
        Context A0A = 7zM.A0A();
        this.A01 = A0A;
        this.A00 = (1I7) 1Hv.A02(A0A, 65728);
    }

    public final void A00() {
        Intent A05 = AbF.A05();
        A05.setAction("com.facebook.rtc.fbwebrtc.CALL_LOG_UPDATED");
        this.A00.CkS(A05);
    }
}
