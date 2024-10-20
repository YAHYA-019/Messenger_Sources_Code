package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.jvm.functions.Function1;

/* loaded from: M3o.class */
public final class M3o extends C00q implements Function1 {
    public final /* synthetic */ Function1 $beforeFrame;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3o(UpdatableAnimationState updatableAnimationState, Function1 function1, float f) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f;
        this.$beforeFrame = function1;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.KuM, X.Jad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.KuM, X.Jad, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A02;
        long A05 = AnonymousClass001.A05(obj);
        UpdatableAnimationState updatableAnimationState = this.this$0;
        long j = updatableAnimationState.A01;
        if (j == Long.MIN_VALUE) {
            updatableAnimationState.A01 = A05;
            j = A05;
        }
        float f = updatableAnimationState.A00;
        ?? obj2 = new Object();
        obj2.A00 = f;
        if (this.$durationScale == 0.0f) {
            MKM mkm = updatableAnimationState.A04;
            ?? obj3 = new Object();
            obj3.A00 = f;
            A02 = mkm.Aia((KuM) obj3, UpdatableAnimationState.A05, updatableAnimationState.A02);
        } else {
            A02 = 0KF.A02(((float) (A05 - j)) / r0);
        }
        UpdatableAnimationState updatableAnimationState2 = this.this$0;
        MKM mkm2 = updatableAnimationState2.A04;
        C2821Jad c2821Jad = UpdatableAnimationState.A05;
        float f2 = ((C2821Jad) mkm2.BIs((KuM) obj2, c2821Jad, updatableAnimationState2.A02, A02)).A00;
        UpdatableAnimationState updatableAnimationState3 = this.this$0;
        updatableAnimationState3.A02 = (C2821Jad) updatableAnimationState3.A04.BJ4((KuM) obj2, c2821Jad, updatableAnimationState3.A02, A02);
        UpdatableAnimationState updatableAnimationState4 = this.this$0;
        updatableAnimationState4.A01 = A05;
        float f3 = updatableAnimationState4.A00 - f2;
        updatableAnimationState4.A00 = f2;
        this.$beforeFrame.invoke(Float.valueOf(f3));
        return 04S.A00;
    }
}
