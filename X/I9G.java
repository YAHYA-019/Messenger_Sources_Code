package X;

import android.os.Handler;
import java.util.UUID;

/* loaded from: I9G.class */
public final class I9G {
    public JGB A00;
    public String A01 = "";
    public final I5y A02;
    public volatile UUID A03;
    public volatile boolean A04;
    public volatile boolean A05;

    public I9G(I5y i5y) {
        this.A02 = i5y;
    }

    private void A00(final String str, final String str2) {
        android.util.Log.e("SessionManager", 0Pz.A0v(str, " has been evicted. ", str2, " now owns the camera device"));
        int i = ID3.A00;
        ID3.A00(27, 0, GOn.A0G(str, str2));
        final JGB jgb = this.A00;
        if (jgb != null) {
            I5y i5y = this.A02;
            Runnable runnable = new Runnable() { // from class: X.J0y
                public static final String __redex_internal_original_name = "SessionManager$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    jgb.C4s(str, str2);
                }
            };
            synchronized (i5y) {
                Handler handler = i5y.A00;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    I9z.A00(runnable);
                }
            }
            this.A00 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01(boolean r302) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9G.A01(boolean):boolean");
    }

    public UUID A02(Handler handler, String str, boolean z) {
        UUID uuid;
        I5y i5y = this.A02;
        synchronized (i5y) {
            boolean z2 = this.A05;
            if (this.A04 && !z2) {
                A00(this.A01, str);
            }
            if (A01(z) && !z2) {
                A00(this.A01, str);
            }
            i5y.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public void A03() {
        synchronized (this.A02) {
        }
    }

    public void A04(JGB jgb) {
        synchronized (this.A02) {
            this.A00 = jgb;
        }
    }

    public boolean A05(UUID uuid) {
        I5y i5y = this.A02;
        synchronized (i5y) {
            if (uuid != null) {
                if (this.A03 != null && uuid.equals(this.A03)) {
                    A01(false);
                    i5y.A00 = null;
                    this.A00 = null;
                    this.A04 = false;
                    return true;
                }
            }
            return false;
        }
    }
}
