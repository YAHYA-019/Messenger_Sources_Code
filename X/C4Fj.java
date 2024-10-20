package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.4Fj, reason: invalid class name */
/* loaded from: 4Fj.class */
public final class C4Fj implements Runnable {
    public static final String __redex_internal_original_name = "TigonNetworkSessionListenerManager$2";
    public final /* synthetic */ C1jS A00;
    public final /* synthetic */ DataTask A01;
    public final /* synthetic */ NetworkSession A02;

    public C4Fj(C1jS c1jS, DataTask dataTask, NetworkSession networkSession) {
        this.A00 = c1jS;
        this.A01 = dataTask;
        this.A02 = networkSession;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1jS.A02(this.A00, this.A01, this.A02);
    }
}
