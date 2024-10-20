package androidx.lifecycle;

import X.04S;
import X.0DR;
import X.0Ds;
import X.2aG;
import X.AnonymousClass001;
import X.C82u;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.functions.Function2;

/* loaded from: RepeatOnLifecycleKt.class */
public abstract class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, 0DR r304) {
        Object A00;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED || (A00 = 2aG.A00(r304, new C82u(lifecycle, state, function2, null, 1))) != 0Ds.A02) ? 04S.A00 : A00;
        }
        throw AnonymousClass001.A0L("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, 0DR r304) {
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, function2, r304);
        if (repeatOnLifecycle != 0Ds.A02) {
            repeatOnLifecycle = 04S.A00;
        }
        return repeatOnLifecycle;
    }
}
