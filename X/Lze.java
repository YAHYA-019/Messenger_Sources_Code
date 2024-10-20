package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* loaded from: Lze.class */
public final class Lze extends 0DP {
    public float F$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lze(UpdatableAnimationState updatableAnimationState, 0DR r303) {
        super(r303);
        this.this$0 = updatableAnimationState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.A00(this, null, null);
    }
}
