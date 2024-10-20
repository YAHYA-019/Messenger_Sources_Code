package X;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: K5k.class */
public final class K5k extends C28w {
    public K5k() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.wtf("BasePendingResult", 0Pz.A0T("Don't know how to handle message: ", i), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).A09(Status.A0A);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        MG9 mg9 = (MG9) pair.first;
        28W r0 = (28W) pair.second;
        try {
            mg9.CHb(r0);
        } catch (RuntimeException e) {
            BasePendingResult.A01(r0);
            throw e;
        }
    }
}
