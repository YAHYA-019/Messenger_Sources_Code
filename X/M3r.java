package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M3r.class */
public final class M3r extends C00q implements Function1 {
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ C2913Jd1 $stroke;
    public final /* synthetic */ long $unfilledColor;
    public final /* synthetic */ boolean $unfilledColorEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3r(C2913Jd1 c2913Jd1, float f, long j, long j2, boolean z) {
        super(1);
        this.$progress = f;
        this.$unfilledColorEnabled = z;
        this.$unfilledColor = j;
        this.$stroke = c2913Jd1;
        this.$color = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MNg mNg = (MNg) obj;
        11T.A0F(mNg, 0);
        float f = this.$progress * 360.0f;
        if (this.$unfilledColorEnabled) {
            LC0.A03(mNg, this.$stroke, 270.0f, 360.0f, this.$unfilledColor);
        }
        LC0.A03(mNg, this.$stroke, 270.0f, f, this.$color);
        return 04S.A00;
    }
}
