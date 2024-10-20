package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: A3m.class */
public final class A3m implements C2r7 {
    public final C1u2 A00;
    public final MigColorScheme A01;

    public A3m(C1u2 c1u2, MigColorScheme migColorScheme) {
        this.A00 = c1u2;
        this.A01 = migColorScheme;
    }

    @Override // X.C2r7
    public Drawable AJ5(Context context, C2fd c2fd, C2qg c2qg) {
        11T.A0F(context, 0);
        Drawable A07 = this.A00.A07(C1u3.A63);
        ShapeDrawable A0D = 7zR.A0D();
        Paint paint = A0D.getPaint();
        MigColorScheme migColorScheme = this.A01;
        paint.setColor(migColorScheme.B0U());
        ShapeDrawable A0D2 = 7zR.A0D();
        A0D2.getPaint().setColor(migColorScheme.Awo());
        A0D2.getPaint().setStyle(Paint.Style.STROKE);
        A0D2.getPaint().setStrokeWidth(4YU.A00(2RH.A09) * 4YU.A0C(context).getDisplayMetrics().density);
        int round = Math.round(24.0f * 4YU.A0C(context).getDisplayMetrics().density);
        A0D.setIntrinsicWidth(round);
        A0D.setIntrinsicHeight(round);
        A0D2.setIntrinsicWidth(round);
        A0D2.setIntrinsicHeight(round);
        int round2 = Math.round(4YU.A00(2RH.A07) * 4YU.A0C(context).getDisplayMetrics().density);
        int round3 = Math.round(6.0f * 4YU.A0C(context).getDisplayMetrics().density);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A0D, A0D2, A07});
        layerDrawable.setLayerInset(0, round2, round2, round2, round2);
        layerDrawable.setLayerInset(1, round2, round2, round2, round2);
        layerDrawable.setLayerInset(2, round3, round3, round3, round3);
        return layerDrawable;
    }

    @Override // X.C2r7
    public int AYi() {
        return 0;
    }

    @Override // X.C2r7
    public float AYj() {
        return 4.0f;
    }
}
