package X;

import android.graphics.Color;
import com.facebook.messaging.common.bitmaps.BitmapExtKt;
import kotlin.jvm.functions.Function1;

/* loaded from: M3y.class */
public final class M3y extends C00q implements Function1 {
    public final /* synthetic */ int $height;
    public final /* synthetic */ int[] $includedColorsArray;
    public final /* synthetic */ 0PI $maxX;
    public final /* synthetic */ 0PI $maxY;
    public final /* synthetic */ 0PI $minX;
    public final /* synthetic */ 0PI $minY;
    public final /* synthetic */ int[] $outputPixels;
    public final /* synthetic */ int[] $segmentEverythingPixels;
    public final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3y(0PI r302, 0PI r303, 0PI r304, 0PI r305, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        super(1);
        this.$height = i;
        this.$width = i2;
        this.$segmentEverythingPixels = iArr;
        this.$includedColorsArray = iArr2;
        this.$outputPixels = iArr3;
        this.$minX = r302;
        this.$maxX = r303;
        this.$minY = r304;
        this.$maxY = r305;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A03 = AnonymousClass001.A03(obj);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.$height) {
                return 04S.A00;
            }
            int i3 = (this.$width * i2) + A03;
            boolean A0D = 02L.A0D(this.$includedColorsArray, Color.green(this.$segmentEverythingPixels[i3]));
            int[] iArr = this.$outputPixels;
            if (A0D) {
                iArr[i3] = BitmapExtKt.A00;
                0PI r0 = this.$minX;
                int i4 = r0.element;
                int i5 = A03;
                if (A03 > i4) {
                    i5 = i4;
                }
                r0.element = i5;
                0PI r02 = this.$maxX;
                int i6 = r02.element;
                int i7 = A03;
                if (A03 < i6) {
                    i7 = i6;
                }
                r02.element = i7;
                0PI r03 = this.$minY;
                int i8 = r03.element;
                int i9 = i2;
                if (i2 > i8) {
                    i9 = i8;
                }
                r03.element = i9;
                0PI r04 = this.$maxY;
                int i10 = r04.element;
                int i11 = i2;
                if (i2 < i10) {
                    i11 = i10;
                }
                r04.element = i11;
            } else {
                iArr[i3] = BitmapExtKt.A01;
            }
            i = i2 + 1;
        }
    }
}
