package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationRequest;

/* loaded from: Ju5.class */
public final class Ju5 extends LcD {
    public final /* synthetic */ PendingIntent A00;
    public final /* synthetic */ LWR A01;
    public final /* synthetic */ LocationRequest A02;

    public Ju5(PendingIntent pendingIntent, LWR lwr, LocationRequest locationRequest) {
        this.A01 = lwr;
        this.A00 = pendingIntent;
        this.A02 = locationRequest;
    }

    public void Bqg(Bundle bundle) {
        28M r0 = ((LcD) this).A00;
        PendingIntent pendingIntent = this.A00;
        LWR.A00(pendingIntent, this, r0);
        28M r02 = ((LcD) this).A00;
        LocationRequest locationRequest = this.A02;
        r02.getClass();
        try {
            r02.A07(new K6w(pendingIntent, r02, locationRequest));
            0fH.A0V(pendingIntent, LWR.class, "Requesting locations to %s with %s", locationRequest);
        } catch (SecurityException unused) {
        } catch (RuntimeException e) {
            R07.A00(e);
        }
        28M r03 = ((LcD) this).A00;
        28M r04 = r03.getClass();
        try {
            r04 = r03;
            r04.A09();
        } catch (RuntimeException unused2) {
            R07.A00(r04);
        }
    }

    public void Bqs(ConnectionResult connectionResult) {
    }

    public void Bqv(int i) {
    }
}
