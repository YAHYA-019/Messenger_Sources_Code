package X;

import android.graphics.drawable.GradientDrawable;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveColorScheme;

/* renamed from: X.9kv, reason: invalid class name */
/* loaded from: 9kv.class */
public final class C9kv {
    public final HTImmersiveColorScheme A00;
    public final HTImmersiveColorScheme A01;
    public final Integer A02;
    public final Integer A03;

    public C9kv() {
        this(null, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9kv(HTImmersiveColorScheme hTImmersiveColorScheme) {
        this(hTImmersiveColorScheme, hTImmersiveColorScheme, Integer.valueOf(hTImmersiveColorScheme.Amj()), Integer.valueOf(hTImmersiveColorScheme.Amj()));
        11T.A0F(hTImmersiveColorScheme, 1);
    }

    public C9kv(HTImmersiveColorScheme hTImmersiveColorScheme, HTImmersiveColorScheme hTImmersiveColorScheme2, Integer num, Integer num2) {
        this.A03 = num;
        this.A02 = num2;
        this.A01 = hTImmersiveColorScheme;
        this.A00 = hTImmersiveColorScheme2;
    }

    public final GradientDrawable A00() {
        Integer num;
        Integer num2 = this.A03;
        if (num2 == null || (num = this.A02) == null) {
            return null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{num2.intValue(), num.intValue()});
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }
}
