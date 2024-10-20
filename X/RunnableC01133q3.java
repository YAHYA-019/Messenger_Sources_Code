package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;

/* renamed from: X.3q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3q3.class */
public final class RunnableC01133q3 implements Runnable {
    public static final String __redex_internal_original_name = "zabt";
    public final /* synthetic */ ConnectionResult A00;
    public final /* synthetic */ 2Bg A01;

    public RunnableC01133q3(ConnectionResult connectionResult, 2Bg r303) {
        this.A01 = r303;
        this.A00 = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        2Bg r0 = this.A01;
        2A2 r02 = (2A2) r0.A05.A09.get(r0.A04);
        if (r02 != null) {
            ConnectionResult connectionResult = this.A00;
            boolean z = false;
            if (connectionResult.A01 == 0) {
                z = true;
            }
            if (!z) {
                r02.A0C(connectionResult, (Exception) null);
                return;
            }
            r0.A02 = true;
            2AC r03 = r0.A03;
            if (r03.ChO()) {
                if (!r0.A02 || (iAccountAccessor = r0.A00) == null) {
                    return;
                }
                r03.B6q(iAccountAccessor, r0.A01);
                return;
            }
            try {
                2AC r04 = r03;
                r03.B6q((IAccountAccessor) null, r04.ChO() ? r04.A01 : Collections.emptySet());
            } catch (SecurityException e) {
                android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                r03.ANY("Failed to get service from broker.");
                r02.A0C(new ConnectionResult(10), (Exception) null);
            }
        }
    }
}
