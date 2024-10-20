package X;

import android.app.Activity;

/* loaded from: Hnz.class */
public final class Hnz {
    public final /* synthetic */ 53T A00;
    public final /* synthetic */ String[] A01;

    public Hnz(53T r302, String[] strArr) {
        this.A00 = r302;
        this.A01 = strArr;
    }

    public void A00() {
        53T r0 = this.A00;
        String[] strArr = this.A01;
        C2J c2j = (C2J) r0.A07.get();
        Activity activity = r0.A00;
        for (String str : strArr) {
            c2j.A00(activity, "SECONDARY", "RATIONALE", str);
        }
        r0.A02.onPermissionsNotGranted(((1Rv) r0.A08.get()).A0A(activity, strArr), 53T.A03(r0, strArr));
    }
}
