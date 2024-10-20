package X;

import android.os.SystemClock;

/* loaded from: J92.class */
public final class J92 extends C00q implements C00m {
    public static final J92 A00 = new J92();

    public J92() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        return Long.valueOf(SystemClock.currentThreadTimeMillis());
    }
}
