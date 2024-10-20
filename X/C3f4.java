package X;

import com.facebook.messaging.app.init.OrcaCrashLoopDrill;

/* renamed from: X.3f4, reason: invalid class name */
/* loaded from: 3f4.class */
public final class C3f4 implements Runnable {
    public static final String __redex_internal_original_name = "OrcaCrashLoopDrill$1";
    public final /* synthetic */ OrcaCrashLoopDrill A00;

    public C3f4(OrcaCrashLoopDrill orcaCrashLoopDrill) {
        this.A00 = orcaCrashLoopDrill;
    }

    @Override // java.lang.Runnable
    public void run() {
        throw AnonymousClass001.A0T("Crash drill");
    }
}
