package X;

import android.content.Intent;

/* loaded from: EwB.class */
public final class EwB {
    public final DdU A00;
    public final 1Mg A01;

    public EwB(DdU ddU, 1Mg r303) {
        this.A01 = r303;
        this.A00 = ddU;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6QK, java.lang.Object] */
    public void A00() {
        DKD.A1E(this.A01, "com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE");
        this.A00.A01((6QK) new Object());
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.6QK, java.lang.Object] */
    public void A01() {
        Intent A0A = 4YU.A0A("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE");
        A0A.putExtra(1BJ.A00(1993), false);
        this.A01.A02(A0A);
        this.A00.A01((6QK) new Object());
    }
}
