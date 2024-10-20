package X;

import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.concurrent.locks.Lock;

/* loaded from: K5m.class */
public final class K5m extends C28w {
    public final /* synthetic */ Lcl A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5m(Looper looper, Lcl lcl) {
        super(looper);
        this.A00 = lcl;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lch lch;
        ConnectionResult connectionResult;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                throw ((Throwable) message.obj);
            }
            android.util.Log.w("GACStateManager", 0Pz.A0T("Unknown message id: ", i));
            return;
        }
        Kfv kfv = (Kfv) message.obj;
        Lcl lcl = this.A00;
        Lock lock = lcl.A0D;
        lock.lock();
        try {
            if (lcl.A0E == kfv.A00) {
                if (kfv instanceof K2h) {
                    K2h k2h = (K2h) kfv;
                    lch = k2h.A00;
                    zak zakVar = k2h.A01;
                    if (Lch.A07(lch, 0)) {
                        connectionResult = zakVar.A01;
                        if (connectionResult.A01 == 0) {
                            zav zavVar = zakVar.A02;
                            AbstractC00481b7.A02(zavVar);
                            connectionResult = zavVar.A02;
                            if (connectionResult.A01 == 0) {
                                lch.A04 = true;
                                IBinder iBinder = zavVar.A01;
                                IAccountAccessor A00 = iBinder == null ? null : AccountAccessor.A00(iBinder);
                                AbstractC00481b7.A02(A00);
                                lch.A00 = A00;
                                lch.A05 = zavVar.A03;
                                lch.A06 = zavVar.A04;
                                Lch.A04(lch);
                            } else {
                                android.util.Log.wtf("GACConnecting", AbstractC00603o4.A00(392).concat(JQx.A0w(connectionResult)), new Exception());
                                Lch.A02(connectionResult, lch);
                            }
                        } else {
                            if (lch.A02 && connectionResult.A02 == null) {
                                Lch.A03(lch);
                                Lch.A04(lch);
                            }
                            Lch.A02(connectionResult, lch);
                        }
                    }
                } else if (kfv instanceof K2f) {
                    ((K2f) kfv).A00.CGk(new ConnectionResult(16, null));
                } else if (kfv instanceof K2g) {
                    K2g k2g = (K2g) kfv;
                    lch = k2g.A01.A01;
                    connectionResult = k2g.A00;
                    Lch.A02(connectionResult, lch);
                } else {
                    ((K2e) kfv).A00.DBj(1);
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
