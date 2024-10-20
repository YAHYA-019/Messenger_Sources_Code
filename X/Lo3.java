package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* loaded from: Lo3.class */
public final class Lo3 implements Runnable {
    public static final String __redex_internal_original_name = "IOLinkPipeline$sendWith$1";
    public final /* synthetic */ LBM A00;
    public final /* synthetic */ Function1 A01;

    public Lo3(LBM lbm, Function1 function1) {
        this.A00 = lbm;
        this.A01 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LBM lbm = this.A00;
            Rae rae = lbm.A07;
            AtomicBoolean atomicBoolean = rae.A01;
            atomicBoolean.set(true);
            if (rae.A02.get() == 10) {
                Object obj = rae.A00;
                synchronized (obj) {
                    obj.notify();
                }
            }
            this.A01.invoke(lbm);
            atomicBoolean.set(false);
        } catch (Throwable th) {
            this.A00.A07.A01.set(false);
            throw th;
        }
    }
}
