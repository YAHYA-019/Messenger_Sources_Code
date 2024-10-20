package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5hm, reason: invalid class name */
/* loaded from: 5hm.class */
public final class C5hm {
    public static final long A04 = TimeUnit.DAYS.toMillis(7);
    public final SharedPreferences A00;
    public final C5hl A01;
    public final java.util.Map A02 = new HashMap();
    public final Executor A03;

    public C5hm(SharedPreferences sharedPreferences, C5hl c5hl, Executor executor) {
        this.A03 = executor;
        this.A00 = sharedPreferences;
        this.A01 = c5hl;
    }
}
