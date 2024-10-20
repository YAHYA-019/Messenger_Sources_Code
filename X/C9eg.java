package X;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9eg, reason: invalid class name */
/* loaded from: 9eg.class */
public abstract class C9eg {
    public static final int[] A00;
    public static final int[] A01 = {R.attr.state_pressed};

    static {
        int[] iArr = StateSet.WILD_CARD;
        11T.A0B(iArr);
        A00 = iArr;
    }

    public static final StateListDrawable A00(Context context, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        int Abp = migColorScheme.Abp();
        int AYw = migColorScheme.AYw();
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = A01;
        int A012 = 0De.A01(AYw, Abp);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(context.getResources().getDimension(2132279311));
        gradientDrawable.setColor(A012);
        stateListDrawable.addState(iArr, gradientDrawable);
        int[] iArr2 = A00;
        GradientDrawable A0G = 7zO.A0G(0);
        A0G.setCornerRadius(context.getResources().getDimension(2132279311));
        A0G.setColor(Abp);
        stateListDrawable.addState(iArr2, A0G);
        return stateListDrawable;
    }
}
