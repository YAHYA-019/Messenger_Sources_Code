package X;

import java.lang.ref.WeakReference;

/* loaded from: G23.class */
public final class G23 implements Runnable {
    public static final String __redex_internal_original_name = "PerfOverlayController$addPerfMetric$1";
    public final /* synthetic */ 52V A00;
    public final /* synthetic */ GjM A01;

    public G23(52V r302, GjM gjM) {
        this.A00 = r302;
        this.A01 = gjM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E9A e9a;
        52V r0 = this.A00;
        52V.A00(r0);
        WeakReference weakReference = r0.A00;
        if (weakReference == null || (e9a = (E9A) weakReference.get()) == null) {
            return;
        }
        String str = this.A01.A03;
        11T.A0F(str, 0);
        if (e9a.A00.get(str) == null) {
            E9A.A02(e9a, str, "");
        }
    }
}
