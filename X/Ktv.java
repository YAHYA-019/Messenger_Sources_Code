package X;

import com.google.android.gms.common.api.Status;

/* loaded from: Ktv.class */
public abstract class Ktv {
    public final int A00;

    public Ktv(int i) {
        this.A00 = i;
    }

    public void A00(Status status) {
        try {
            ((K2m) this).A00.A0B(status);
        } catch (IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public void A01(2BK r302, boolean z) {
        K4s k4s = ((K2m) this).A00;
        r302.A00.put(k4s, Boolean.valueOf(z));
        k4s.A03(new LcJ(k4s, r302));
    }

    public void A02(2A2 r302) {
        K2m k2m = (K2m) this;
        try {
            k2m.A00.A0A(r302.A04);
        } catch (RuntimeException e) {
            k2m.A03(e);
        }
    }

    public void A03(Exception exc) {
        K2m k2m = (K2m) this;
        try {
            k2m.A00.A0B(new Status(10, 0Pz.A0j(AnonymousClass001.A0X(exc), ": ", exc.getLocalizedMessage())));
        } catch (IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }
}
