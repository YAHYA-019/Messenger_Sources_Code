package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: A3l.class */
public final class A3l implements C2r7 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MigColorScheme A01;

    public A3l(MigColorScheme migColorScheme, int i) {
        this.A01 = migColorScheme;
        this.A00 = i;
    }

    @Override // X.C2r7
    public Drawable AJ5(Context context, C2fd c2fd, C2qg c2qg) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        MigColorScheme migColorScheme = this.A01;
        gradientDrawable.setColor(migColorScheme.B6U());
        return new LayerDrawable(new Drawable[]{gradientDrawable, C1uu.A00(context.getResources(), context.getDrawable(this.A00), migColorScheme.AWT())});
    }

    @Override // X.C2r7
    public int AYi() {
        return 0;
    }

    @Override // X.C2r7
    public float AYj() {
        return 0.0f;
    }
}
