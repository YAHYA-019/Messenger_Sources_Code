package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: Lcj.class */
public final class Lcj implements MJe {
    public final /* synthetic */ Lck A00;

    public /* synthetic */ Lcj(Lck lck) {
        this.A00 = lck;
    }

    @Override // X.MJe
    public final void DBV(ConnectionResult connectionResult) {
        Lck lck = this.A00;
        Lock lock = lck.A0B;
        lock.lock();
        try {
            lck.A03 = connectionResult;
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
            lck.A03 = ConnectionResult.A04;
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
            if (lck.A04) {
                lck.A04 = false;
                lck.A07.DBa(i, false);
                lck.A03 = null;
                lck.A02 = null;
            } else {
                lck.A04 = true;
                lck.A08.Bqv(i);
            }
        } finally {
            lock.unlock();
        }
    }
}
