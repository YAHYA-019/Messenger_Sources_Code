package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.jvm.functions.Function1;

/* loaded from: M3u.class */
public final class M3u extends C00q implements Function1 {
    public final /* synthetic */ MKm $animation;
    public final /* synthetic */ Function1 $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ KuM $initialVelocityVector;
    public final /* synthetic */ 0CL $lateInitScope;
    public final /* synthetic */ LNu $this_animate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3u(MKm mKm, LNu lNu, KuM kuM, Object obj, Function1 function1, 0CL r307, float f) {
        super(1);
        this.$lateInitScope = r307;
        this.$initialValue = obj;
        this.$animation = mKm;
        this.$initialVelocityVector = kuM;
        this.$this_animate = lNu;
        this.$durationScale = f;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A05 = AnonymousClass001.A05(obj);
        0CL r0 = this.$lateInitScope;
        Object obj2 = this.$initialValue;
        MKm mKm = this.$animation;
        Km5 km5 = new Km5(this.$initialVelocityVector, mKm.BHf(), obj2, mKm.BEY(), M3K.A00(this.$this_animate, 1), A05, A05);
        SuspendAnimationKt.A02(this.$animation, km5, this.$this_animate, this.$block, this.$durationScale, A05);
        r0.element = km5;
        return 04S.A00;
    }
}
