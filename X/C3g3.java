package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zact;

/* renamed from: X.3g3, reason: invalid class name */
/* loaded from: 3g3.class */
public final class C3g3 implements Runnable {
    public static final String __redex_internal_original_name = "zacq";
    public final /* synthetic */ zact A00;

    public C3g3(zact zactVar) {
        this.A00 = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.DBf(new ConnectionResult(4));
    }
}
