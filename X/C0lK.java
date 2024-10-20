package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0lK, reason: invalid class name */
/* loaded from: 0lK.class */
public final class C0lK {
    public final int A00;
    public final long A01;

    public C0lK(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public static File A00(Context context, boolean z) {
        return new File(context.getApplicationInfo().dataDir, z ? "insta_crash_remedy_log" : "remedy_log");
    }

    public static void A01(Context context, boolean z) {
        if (A00(context, z).delete()) {
            return;
        }
        android.util.Log.w("CrashLoopRemedyLog", 0Pz.A1C("unable to delete remedy log, instaCrash: ", z));
    }
}
