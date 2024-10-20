package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* loaded from: Lcg.class */
public final class Lcg implements MKv {
    public final Lcl A00;

    public Lcg(Lcl lcl) {
        this.A00 = lcl;
    }

    @Override // X.MKv
    public final K4s DBU(K4s k4s) {
        this.A00.A05.A0F.add(k4s);
        return k4s;
    }

    @Override // X.MKv
    public final K4s DBX(K4s k4s) {
        throw AnonymousClass001.A0N("GoogleApiClient is not connected yet.");
    }

    @Override // X.MKv
    public final void DBb() {
        Lcl lcl = this.A00;
        Iterator A1A = 1BK.A1A(lcl.A09);
        while (A1A.hasNext()) {
            ((2AE) A1A.next()).disconnect();
        }
        lcl.A05.A03 = Collections.emptySet();
    }

    @Override // X.MKv
    public final void DBe() {
        Lcl lcl = this.A00;
        Lock lock = lcl.A0D;
        lock.lock();
        try {
            2A9 r0 = lcl.A08;
            java.util.Map map = lcl.A0B;
            lcl.A0E = new Lch(lcl.A02, lcl.A03, lcl.A04, lcl, r0, map, lock);
            lcl.A0E.DBb();
            lcl.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.MKv
    public final void DBh(Bundle bundle) {
    }

    @Override // X.MKv
    public final void DBi(ConnectionResult connectionResult, AnonymousClass286 anonymousClass286, boolean z) {
    }

    @Override // X.MKv
    public final void DBj(int i) {
    }

    @Override // X.MKv
    public final boolean DBk() {
        return true;
    }
}
