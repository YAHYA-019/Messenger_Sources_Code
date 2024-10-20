package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.24x, reason: invalid class name */
/* loaded from: 24x.class */
public final class C24x extends YogaNodeJNIBase {
    public C24x() {
    }

    public C24x(C23j c23j) {
        long jni_YGNodeNewWithConfigJNI = YogaNative.jni_YGNodeNewWithConfigJNI(((C23i) c23j).A00);
        this.arr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        if (jni_YGNodeNewWithConfigJNI == 0) {
            throw AnonymousClass001.A0N("Failed to allocate native memory");
        }
        this.mNativePointer = jni_YGNodeNewWithConfigJNI;
        this.mConfig = c23j;
    }

    public void finalize() {
        int A03 = 0FI.A03(-1925225205);
        try {
            long j = this.mNativePointer;
            if (j != 0) {
                this.mNativePointer = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j);
            }
            0FI.A09(1539719056, A03);
        } catch (Throwable th) {
            0FI.A09(330946702, A03);
            throw th;
        }
    }
}
