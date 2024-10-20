package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.79o, reason: invalid class name */
/* loaded from: 79o.class */
public final class C79o implements Runnable {
    public static final String __redex_internal_original_name = "HasContentChangedDelegate";
    public AtomicBoolean A00 = new AtomicBoolean(false);
    public final WeakReference A01;

    public C79o(WeakReference weakReference) {
        this.A01 = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        6RU r0 = (6RU) this.A01.get();
        if (r0 != null) {
            7FI.A02(r0, 7Am.A02);
            this.A00.set(false);
        }
    }
}
