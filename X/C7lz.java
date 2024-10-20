package X;

import android.view.View;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.7lz, reason: invalid class name */
/* loaded from: 7lz.class */
public abstract class C7lz {
    public static final void A00(View view, 6TX r302, String str) {
        boolean A1X = 1BL.A1X(view, str);
        11T.A0F(r302, 2);
        r302.A04(str, "Visibility", view.getVisibility() == 0 ? Property.VISIBLE : view.getVisibility() == 4 ? "invisible" : "gone");
        view.getVisibility();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        r302.A04(str, "ScreenLocation", 0Pz.A0A(',', iArr[0], iArr[A1X ? 1 : 0]));
        r302.A04(str, "Z", String.valueOf(view.getZ()));
        r302.A04(str, "Width", String.valueOf(view.getWidth()));
        r302.A04(str, "Height", String.valueOf(view.getHeight()));
        r302.A04(str, "ScaleX", String.valueOf(view.getScaleX()));
        r302.A04(str, "ScaleY", String.valueOf(view.getScaleY()));
    }
}
