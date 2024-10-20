package androidx.lifecycle;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Dt;
import X.2aI;
import X.2sD;
import X.AnonymousClass001;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.functions.Function2;

/* loaded from: LifecycleCoroutineScopeImpl$register$1.class */
public final class LifecycleCoroutineScopeImpl$register$1 extends 0DO implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, 0DR r303) {
        super(2, r303);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    public final 0DR create(Object obj, 0DR r303) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, r303);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        2aI r0 = (2aI) this.L$0;
        if (this.this$0.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.this$0;
            lifecycleCoroutineScopeImpl.getLifecycle$lifecycle_common().addObserver(lifecycleCoroutineScopeImpl);
        } else {
            2sD.A01(r0.getCoroutineContext());
        }
        return 04S.A00;
    }
}
