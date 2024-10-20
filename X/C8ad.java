package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.8ad, reason: invalid class name */
/* loaded from: 8ad.class */
public final class C8ad extends 1LH {
    public final int A00;
    public final int A01;
    public final C1u2 A02;
    public final 1Im A03;
    public final MigColorScheme A04;

    public C8ad(C1u2 c1u2, 1Im r303, MigColorScheme migColorScheme, int i, int i2) {
        11T.A0F(c1u2, 2);
        this.A04 = migColorScheme;
        this.A02 = c1u2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        1Iw A0X = 7zL.A0X(c2k5);
        Context context = A0X.A0D;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279449);
        float f = this.A01 + this.A00;
        C2cq A00 = C2cp.A00(A0X, 0);
        A00.A0c();
        MigColorScheme migColorScheme = this.A04;
        C1u2 c1u2 = this.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        ShapeDrawable A0D = 7zR.A0D();
        A0D.getPaint().setColor(migColorScheme.BKg());
        A0s.add(A0D);
        ShapeDrawable A0D2 = 7zR.A0D();
        A0D2.getPaint().setColor(-1);
        A0s.add(A0D2);
        A0s.add(c1u2.A08(C1u3.A52, -16777216));
        int A002 = C0A8.A00(context, 3.0f);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) A0s.toArray(new Drawable[0]));
        layerDrawable.setLayerInset(1, A002, A002, A002, A002);
        A00.A2a(layerDrawable);
        A00.A2b(ImageView.ScaleType.CENTER);
        A00.A0C(dimensionPixelSize);
        A00.A1L(dimensionPixelSize);
        A00.A27(C26z.START, f);
        A00.A1F(f);
        A00.A2T(this.A03);
        return A00.A2W();
    }
}
