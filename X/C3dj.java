package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.3dj, reason: invalid class name */
/* loaded from: 3dj.class */
public final class C3dj implements 1K9 {
    public final WeakReference A00;

    public C3dj(AtomicLong atomicLong) {
        11T.A0F(atomicLong, 1);
        this.A00 = new WeakReference(atomicLong);
    }

    public void onFailure(Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AtomicLong atomicLong;
        Number number = (Number) obj;
        if (number == null || (atomicLong = (AtomicLong) this.A00.get()) == null) {
            return;
        }
        atomicLong.set(number.longValue());
    }
}
