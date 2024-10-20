package androidx.compose.animation.core;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.7zM;
import X.AnonymousClass001;
import kotlin.jvm.functions.Function2;

/* loaded from: InfiniteTransition$run$1$1$3.class */
public final class InfiniteTransition$run$1$1$3 extends 0DO implements Function2 {
    public /* synthetic */ float F$0;
    public int label;

    public InfiniteTransition$run$1$1$3(0DR r302) {
        super(2, r302);
    }

    public final 0DR create(Object obj, 0DR r303) {
        InfiniteTransition$run$1$1$3 infiniteTransition$run$1$1$3 = new InfiniteTransition$run$1$1$3(r303);
        infiniteTransition$run$1$1$3.F$0 = 7zM.A00(obj);
        return infiniteTransition$run$1$1$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(Float.valueOf(7zM.A00(obj)), (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        return Boolean.valueOf(AnonymousClass001.A1P((this.F$0 > 0.0f ? 1 : (this.F$0 == 0.0f ? 0 : -1))));
    }
}
