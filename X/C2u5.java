package X;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2u5, reason: invalid class name */
/* loaded from: 2u5.class */
public final class C2u5 extends C2u6 {
    public C2td A00;
    public C2u7 A01;
    public final Context A02;
    public final C2tv A03;
    public final 00T A04;
    public final 00V A05;
    public final 0ED A06;
    public final Executor A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final java.util.Map A07 = new HashMap();
    public final boolean A0A = true;

    public C2u5(Context context, C2tv c2tv, 00T r304, 00V r305, 0ED r306, Executor executor) {
        this.A02 = context;
        this.A08 = executor;
        this.A04 = r304;
        this.A03 = c2tv;
        this.A05 = r305;
        this.A06 = r306;
        Throwable th = null;
        try {
            if (((ConnectivityManager) context.getSystemService("connectivity")) != null) {
                return;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (th != null) {
            0fH.A0w("FacebookVoltronDownloader", "Failed to get ConnectivityManager", th);
        } else {
            0fH.A0o("FacebookVoltronDownloader", "Failed to get ConnectivityManager");
        }
    }
}
