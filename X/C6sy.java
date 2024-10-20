package X;

import androidx.lifecycle.LiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6sy, reason: invalid class name */
/* loaded from: 6sy.class */
public final class C6sy {
    public final 1Br A00 = 1Bq.A00(66602);
    public final C01i A01 = C01g.A01(C6sz.A00);

    public static final 6CU A00(C6sy c6sy, ThreadKey threadKey) {
        return new 6CU(new 83A(1Bu.A00(65709), threadKey, 4), new AnonymousClass836(c6sy, 11));
    }

    public LiveData A01(ThreadKey threadKey) {
        return ((2Qs) this.A00.A00.get()).A00() ? new C3020Jgj(this, threadKey) : A00(this, threadKey);
    }
}
