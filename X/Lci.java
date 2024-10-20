package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: Lci.class */
public final class Lci implements MJe {
    public final /* synthetic */ Lck A00;

    public /* synthetic */ Lci(Lck lck) {
        this.A00 = lck;
    }

    @Override // X.MJe
    public final void DBV(ConnectionResult connectionResult) {
        Lck lck = this.A00;
        Lock lock = lck.A0B;
        lock.lock();
        try {
            lck.A02 = connectionResult;
            Lck.A02(lck);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.MJe
    public final void DBY(Bundle bundle) {
        Lck lck = this.A00;
        Lock lock = lck.A0B;
        lock.lock();
        try {
            Bundle bundle2 = lck.A01;
            if (bundle2 == null) {
                lck.A01 = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            lck.A02 = ConnectionResult.A04;
            Lck.A02(lck);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.MJe
    public final void DBa(int i, boolean z) {
        Lck lck = this.A00;
        Lock lock = lck.A0B;
        lock.lock();
        try {
            if (!lck.A04) {
                ConnectionResult connectionResult = lck.A03;
                if (connectionResult != null && connectionResult.A01 == 0) {
                    lck.A04 = true;
                    lck.A09.Bqv(i);
                }
            }
            lck.A04 = false;
            lck.A07.DBa(i, false);
            lck.A03 = null;
            lck.A02 = null;
        } finally {
            lock.unlock();
        }
    }
}
