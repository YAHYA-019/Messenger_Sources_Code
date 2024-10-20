package androidx.lifecycle;

import X.11T;
import X.2aN;
import X.4ZI;

/* loaded from: LifecycleKt.class */
public abstract class LifecycleKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v0 */
    /* JADX WARN: Type inference failed for: r304v1 */
    /* JADX WARN: Type inference failed for: r304v3, types: [java.lang.Object, androidx.lifecycle.LifecycleCoroutineScopeImpl] */
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScope lifecycleCoroutineScope;
        11T.A0F(lifecycle, 0);
        while (true) {
            lifecycleCoroutineScope = (LifecycleCoroutineScope) lifecycle.internalScopeRef.get();
            if (lifecycleCoroutineScope != 0) {
                break;
            }
            lifecycleCoroutineScope = new LifecycleCoroutineScopeImpl(lifecycle, 4ZI.A00().plus(2aN.A00().A01()));
            if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(lifecycle.internalScopeRef, null, lifecycleCoroutineScope)) {
                lifecycleCoroutineScope.register();
                break;
            }
        }
        return lifecycleCoroutineScope;
    }
}
