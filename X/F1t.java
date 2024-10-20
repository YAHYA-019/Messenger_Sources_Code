package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: F1t.class */
public final class F1t {
    public static final void A00(Fragment fragment, MigColorScheme migColorScheme, String str) {
        11T.A0F(migColorScheme, 1);
        View view = fragment.mView;
        if (str == null || str.length() == 0 || view == null) {
            return;
        }
        L5Q A00 = KXg.A00(view, str, 0);
        JYg jYg = ((LBS) A00.A01).A0D;
        11T.A0A(jYg);
        ViewGroup.LayoutParams layoutParams = jYg.getLayoutParams();
        11T.A0I(layoutParams, GOm.A00(0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = 7zO.A0D(fragment).getDimensionPixelSize(2RH.A03.sizeRes);
        marginLayoutParams.leftMargin += dimensionPixelSize;
        marginLayoutParams.rightMargin += dimensionPixelSize;
        marginLayoutParams.bottomMargin += dimensionPixelSize;
        marginLayoutParams.topMargin += dimensionPixelSize;
        jYg.setLayoutParams(marginLayoutParams);
        A00.A06(migColorScheme.BKh());
        A00.A02();
    }
}
