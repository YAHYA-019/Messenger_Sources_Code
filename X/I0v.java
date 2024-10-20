package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: I0v.class */
public final class I0v {
    public static final I0v A00 = new Object();

    public final HtB A00(Context context, WindowLayoutInfo windowLayoutInfo) {
        C1k1 AH9;
        I1g i1g;
        I1f i1f;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AH9 = C1jb.A00.A03(context);
        } else {
            if (i < 29 || !(context instanceof Activity)) {
                throw AnonymousClass001.A0q("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            AH9 = C1jb.A00.AH9((Activity) context);
        }
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList A0y = 7zO.A0y(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                11T.A08(foldingFeature);
                FoldingFeature foldingFeature2 = foldingFeature;
                11T.A0F(foldingFeature2, 1);
                int type = foldingFeature2.getType();
                if (type == 1) {
                    i1g = I1g.A01;
                } else if (type == 2) {
                    i1g = I1g.A02;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    i1f = I1f.A01;
                } else if (state == 2) {
                    i1f = I1f.A02;
                }
                Rect bounds = foldingFeature2.getBounds();
                11T.A0A(bounds);
                C1k0 c1k0 = new C1k0(bounds);
                Rect A002 = AH9.A00();
                int i2 = c1k0.A00 - c1k0.A03;
                if (i2 != 0 || c1k0.A02 - c1k0.A01 != 0) {
                    int i3 = c1k0.A02 - c1k0.A01;
                    if (i3 == A002.width() || i2 == A002.height()) {
                        if (i3 >= A002.width() || i2 >= A002.height()) {
                            if (i3 != A002.width() || i2 != A002.height()) {
                                Rect bounds2 = foldingFeature2.getBounds();
                                11T.A0A(bounds2);
                                A0y.add(new ILg(new C1k0(bounds2), i1f, i1g));
                            }
                        }
                    }
                }
            }
        }
        return new HtB(A0y);
    }
}
