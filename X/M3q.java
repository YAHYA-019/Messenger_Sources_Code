package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.jvm.functions.Function1;

/* loaded from: M3q.class */
public final class M3q extends C00q implements Function1 {
    public final /* synthetic */ MKm $animation;
    public final /* synthetic */ Function1 $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ 0CL $lateInitScope;
    public final /* synthetic */ LNu $this_animate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3q(MKm mKm, LNu lNu, Function1 function1, 0CL r305, float f) {
        super(1);
        this.$lateInitScope = r305;
        this.$durationScale = f;
        this.$animation = mKm;
        this.$this_animate = lNu;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A05 = AnonymousClass001.A05(obj);
        Object obj2 = this.$lateInitScope.element;
        11T.A0D(obj2);
        SuspendAnimationKt.A02(this.$animation, (Km5) obj2, this.$this_animate, this.$block, this.$durationScale, A05);
        return 04S.A00;
    }
}
