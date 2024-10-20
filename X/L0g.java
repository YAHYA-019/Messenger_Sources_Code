package X;

import android.content.Context;
import java.lang.Thread;
import java.util.List;

/* loaded from: L0g.class */
public final class L0g {
    public static volatile L0g A06;
    public Thread.UncaughtExceptionHandler A00;
    public final Context A01;
    public final Lyu A02;
    public final List A03;
    public final Lc5 A04;
    public volatile K1n A05;

    public L0g(Context context) {
        Context applicationContext = context.getApplicationContext();
        AbstractC00481b7.A02(applicationContext);
        this.A01 = applicationContext;
        this.A02 = new Lyu(this);
        this.A03 = JQx.A14();
        this.A04 = new Lc5();
    }

    public static void A00() {
        if (!(Thread.currentThread() instanceof LxR)) {
            throw AnonymousClass001.A0N("Call expected from worker thread");
        }
    }
}
