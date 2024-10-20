package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M3w.class */
public final class M3w extends C00q implements Function1 {
    public final /* synthetic */ MEE $baseRotation$delegate;
    public final /* synthetic */ long $color;
    public final /* synthetic */ MEE $currentRotation$delegate;
    public final /* synthetic */ MEE $endAngle$delegate;
    public final /* synthetic */ MEE $startAngle$delegate;
    public final /* synthetic */ C2913Jd1 $stroke;
    public final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3w(MEE mee, MEE mee2, MEE mee3, MEE mee4, C2913Jd1 c2913Jd1, float f, long j) {
        super(1);
        this.$strokeWidth = f;
        this.$color = j;
        this.$stroke = c2913Jd1;
        this.$currentRotation$delegate = mee;
        this.$endAngle$delegate = mee2;
        this.$startAngle$delegate = mee3;
        this.$baseRotation$delegate = mee4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MNg mNg = (MNg) obj;
        11T.A0F(mNg, 0);
        MEE mee = this.$currentRotation$delegate;
        LMP lmp = LC0.A04;
        float A03 = (AnonymousClass001.A03(mee.getValue()) * 216.0f) % 360.0f;
        float A01 = DKC.A01(7zM.A00(this.$endAngle$delegate.getValue()), 7zM.A00(this.$startAngle$delegate.getValue()));
        LC0.A03(mNg, this.$stroke, 7zM.A00(this.$startAngle$delegate.getValue()) + (A03 - 90.0f) + 7zM.A00(this.$baseRotation$delegate.getValue()) + (((this.$strokeWidth / (40.0f / 2.0f)) * 57.29578f) / 2.0f), Math.max(A01, 0.1f), this.$color);
        return 04S.A00;
    }
}
