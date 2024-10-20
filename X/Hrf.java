package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: Hrf.class */
public final class Hrf {
    public FragmentActivity A00;
    public HVv A01;

    public void A00() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            fragmentActivity.finish();
            FragmentActivity fragmentActivity2 = this.A00;
            if (fragmentActivity2 != null) {
                fragmentActivity2.overridePendingTransition(0, 0);
                return;
            }
        }
        11T.A0L("fragmentActivity");
        throw 0Q8.createAndThrow();
    }

    public void A01(0D2 r302, String str) {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity == null) {
            11T.A0L("fragmentActivity");
            throw 0Q8.createAndThrow();
        }
        06Z BDe = fragmentActivity.BDe();
        11T.A0A(BDe);
        if (C0D1.A01(BDe)) {
            r302.A0m(BDe, str);
            BDe.A0t();
        }
    }
}
