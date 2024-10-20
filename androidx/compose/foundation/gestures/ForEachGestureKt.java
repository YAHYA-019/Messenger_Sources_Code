package androidx.compose.foundation.gestures;

import X.04S;
import X.0DR;
import X.0DT;
import X.0Ds;
import X.0KU;
import X.7zV;
import X.C2904Jcq;
import X.C2s7;
import X.LtK;
import X.M6m;
import X.MNc;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* loaded from: ForEachGestureKt.class */
public abstract class ForEachGestureKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x010b -> B:11:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(X.MNe r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A00(X.MNe, X.0DR):java.lang.Object");
    }

    public static final Object A01(MNc mNc, 0DR r302, Function2 function2) {
        0Ds r0;
        04S r02;
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(null, r302.getContext(), function2);
        C2904Jcq c2904Jcq = (C2904Jcq) mNc;
        C2s7 A0d = 7zV.A0d(r302);
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(c2904Jcq, A0d);
        LtK ltK = c2904Jcq.A06;
        synchronized (ltK) {
            ltK.A0C(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 0KU.A01;
            0DR A02 = 0DT.A02(0DT.A01(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, forEachGestureKt$awaitEachGesture$2));
            r0 = 0Ds.A02;
            0KU r03 = new 0KU(r0, A02);
            r02 = 04S.A00;
            r03.resumeWith(r02);
        }
        A0d.BQE(M6m.A00(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, 16));
        Object A0C = A0d.A0C();
        return A0C != r0 ? r02 : A0C;
    }
}
