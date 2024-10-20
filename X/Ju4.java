package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: Ju4.class */
public final class Ju4 extends LcD {
    public final /* synthetic */ PendingIntent A00;
    public final /* synthetic */ LWR A01;

    public Ju4(PendingIntent pendingIntent, LWR lwr) {
        this.A01 = lwr;
        this.A00 = pendingIntent;
    }

    public void Bqg(Bundle bundle) {
        LWR.A00(this.A00, this, ((LcD) this).A00);
        28M r0 = ((LcD) this).A00;
        28M r02 = r0.getClass();
        try {
            r02 = r0;
            r02.A09();
        } catch (RuntimeException unused) {
            R07.A00(r02);
        }
    }

    public void Bqs(ConnectionResult connectionResult) {
    }

    public void Bqv(int i) {
    }
}
