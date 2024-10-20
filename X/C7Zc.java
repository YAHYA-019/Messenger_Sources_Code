package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.7Zc, reason: invalid class name */
/* loaded from: 7Zc.class */
public final class C7Zc {
    public final Handler A00;
    public final QuickPerformanceLogger A01;

    public C7Zc(Looper looper, QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 2);
        this.A00 = new Handler(looper);
        this.A01 = quickPerformanceLogger;
    }
}
