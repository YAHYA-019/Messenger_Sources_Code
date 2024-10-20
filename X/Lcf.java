package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: Lcf.class */
public final class Lcf implements MKv {
    public final Lcl A00;

    public Lcf(Lcl lcl) {
        this.A00 = lcl;
    }

    @Override // X.MKv
    public final K4s DBU(K4s k4s) {
        DBX(k4s);
        return k4s;
    }

    @Override // X.MKv
    public final K4s DBX(K4s k4s) {
        try {
            Lcl lcl = this.A00;
            K2P k2p = lcl.A05;
            Kzv kzv = k2p.A09;
            kzv.A01.add(k4s);
            k4s.A0B.set(kzv.A00);
            AnonymousClass281 anonymousClass281 = k4s.A00;
            2AE r0 = (2AE) k2p.A0D.get(anonymousClass281);
            AbstractC00481b7.A03(r0, "Appropriate Api was not requested.");
            if (r0.isConnected() || !lcl.A0A.containsKey(anonymousClass281)) {
                k4s.A0A(r0);
                return k4s;
            }
            k4s.A0B(new Status(17, null));
            return k4s;
        } catch (DeadObjectException unused) {
            Lcl lcl2 = this.A00;
            1BK.A1I(lcl2.A06, new K2e(this, this), 1);
            return k4s;
        }
    }

    @Override // X.MKv
    public final void DBb() {
    }

    @Override // X.MKv
    public final void DBe() {
    }

    @Override // X.MKv
    public final void DBh(Bundle bundle) {
    }

    @Override // X.MKv
    public final void DBi(ConnectionResult connectionResult, AnonymousClass286 anonymousClass286, boolean z) {
    }

    @Override // X.MKv
    public final void DBj(int i) {
        Lcl lcl = this.A00;
        lcl.A00(null);
        lcl.A07.DBa(i, false);
    }

    @Override // X.MKv
    public final boolean DBk() {
        this.A00.A00(null);
        return true;
    }
}
