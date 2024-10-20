package X;

import kotlin.jvm.functions.Function1;

/* loaded from: J9z.class */
public final class J9z extends C00q implements Function1 {
    public final /* synthetic */ int $height;
    public final /* synthetic */ boolean $needsCentering;
    public final /* synthetic */ boolean $shouldCropToFit;
    public final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9z(int i, int i2, boolean z, boolean z2) {
        super(1);
        this.$width = i;
        this.$height = i2;
        this.$needsCentering = z;
        this.$shouldCropToFit = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GOo.A0g(obj).CUN(this.$width, this.$height, this.$needsCentering, this.$shouldCropToFit);
        return 04S.A00;
    }
}
