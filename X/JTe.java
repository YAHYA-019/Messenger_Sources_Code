package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: JTe.class */
public final class JTe extends WeakReference implements C1pc {
    public final 1vG A00;

    public JTe(1vG r302, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = r302;
    }

    @Override // X.C1pc
    public C1pc AII(1vG r302, ReferenceQueue referenceQueue) {
        return new JTe(r302, get(), referenceQueue);
    }

    @Override // X.C1pc
    public 1vG Ak7() {
        return this.A00;
    }
}
