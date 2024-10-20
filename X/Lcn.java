package X;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: Lcn.class */
public final class Lcn implements 2Bh {
    public final boolean A00;
    public final AnonymousClass286 A01;
    public final WeakReference A02;

    public Lcn(AnonymousClass286 anonymousClass286, Lch lch, boolean z) {
        this.A02 = 7zL.A14(lch);
        this.A01 = anonymousClass286;
        this.A00 = z;
    }

    public final void CGk(ConnectionResult connectionResult) {
        Lch lch = (Lch) this.A02.get();
        if (lch != null) {
            AbstractC00481b7.A09(AnonymousClass001.A1W(Looper.myLooper(), lch.A0D.A05.A06), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            Lock lock = lch.A0G;
            lock.lock();
            try {
                if (Lch.A07(lch, 0)) {
                    if (connectionResult.A01 != 0) {
                        Lch.A01(connectionResult, this.A01, lch, this.A00);
                    }
                    if (Lch.A06(lch)) {
                        Lch.A04(lch);
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
