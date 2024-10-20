package X;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: M14.class */
public final class M14 extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M14(int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.LNB, java.lang.Object, X.MBK] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 == 0) {
            int i = this.A01;
            int i2 = this.A02;
            MHv mHv = LazyListState.A0O;
            ?? obj = new Object();
            ((LNB) obj).A00 = -1;
            return new LazyListState(obj, i, i2);
        }
        OvalShape ovalShape = new OvalShape();
        float f = this.A01;
        ovalShape.resize(f, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setColorFilter(KVC.A00(0S2.A01, this.A02));
        return shapeDrawable;
    }
}
