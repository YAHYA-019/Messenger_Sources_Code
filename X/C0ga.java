package X;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.0ga, reason: invalid class name */
/* loaded from: 0ga.class */
public final /* synthetic */ class C0ga implements Callable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ Throwable A01;
    public final /* synthetic */ Map.Entry A02;

    public /* synthetic */ C0ga(String str, Throwable th, Map.Entry entry) {
        this.A02 = entry;
        this.A01 = th;
        this.A00 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Map.Entry entry = this.A02;
        Throwable th = this.A01;
        String str = this.A00;
        try {
            return ((C0c7) entry.getValue()).AgE(th);
        } catch (Throwable th2) {
            0fH.A11("lacrima", "Failed to apply lazy supplier: %s", th2, new Object[]{str});
            C0iy.A00().Bwu("FbCustomReportDataSupplier", th2, null);
            return "";
        }
    }
}
