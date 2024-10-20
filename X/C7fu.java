package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* renamed from: X.7fu, reason: invalid class name */
/* loaded from: 7fu.class */
public final class C7fu extends C1rj {
    public int A00;
    public AnonymousClass597 A01;

    public C7fu() {
        super("RoundRectangularIconTileLayout");
    }

    public final Object[] A0k() {
        return AnonymousClass001.A1b(this.A01, this.A00);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Context context;
        AnonymousClass597 anonymousClass597 = this.A01;
        int i = this.A00;
        boolean A1X = 1BL.A1X(r302, anonymousClass597);
        float[] fArr = new float[8];
        int i2 = 0;
        do {
            float A00 = 4YU.A00(2RH.A04);
            context = r302.A0D;
            fArr[i2] = 4YW.A00(context, A00, A1X ? 1 : 0);
            i2++;
        } while (i2 < 8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        shapeDrawable.getPaint().setColor(anonymousClass597.A00);
        Drawable A03 = C1uu.A03.A03(4YU.A0C(context), context.getDrawable(anonymousClass597.A02), anonymousClass597.A01);
        int minimumWidth = (i - (A03 != null ? A03.getMinimumWidth() : 0)) / 2;
        int minimumHeight = (i - (A03 != null ? A03.getMinimumHeight() : 0)) / 2;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, A03});
        layerDrawable.setLayerInset(A1X ? 1 : 0, minimumWidth, minimumHeight, minimumWidth, minimumHeight);
        C2cq A002 = C2cp.A00(r302, 0);
        A002.A2a(layerDrawable);
        return A002.A2W();
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        11T.A0F(r302, 0);
        Context context = r302.A0D;
        int A02 = 0NA.A02(context, 2130972066, context.getResources().getDimensionPixelSize(2132279326));
        if (Integer.valueOf(A02) != null) {
            this.A00 = A02;
        }
    }
}
