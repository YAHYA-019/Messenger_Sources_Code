package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.23i, reason: invalid class name */
/* loaded from: 23i.class */
public final class C23i extends C23j {
    public long A00;

    public C23i() {
        this(0);
    }

    public C23i(int i) {
        long jni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jni_YGConfigNewJNI == 0) {
            throw AnonymousClass001.A0N("Failed to allocate native memory");
        }
        this.A00 = jni_YGConfigNewJNI;
    }

    public void finalize() {
        int A03 = 0FI.A03(-1238630231);
        try {
            long j = this.A00;
            if (j != 0) {
                this.A00 = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
            0FI.A09(649301970, A03);
        } catch (Throwable th) {
            0FI.A09(184493016, A03);
            throw th;
        }
    }
}
