package X;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.google.common.base.Preconditions;

/* renamed from: X.9gu, reason: invalid class name */
/* loaded from: 9gu.class */
public final class C9gu {
    public static final C9gu A01 = new Object();
    public static final Rect A00 = new Rect(0, 0, 0, 0);

    public final Drawable A00(int[] iArr, int i) {
        int i2 = 0;
        int length = iArr.length;
        Preconditions.checkArgument(!AnonymousClass001.A1O(length));
        if (length <= 1) {
            int i3 = iArr[0];
            ShapeDrawable A0D = 7zR.A0D();
            A0D.setPadding(A00);
            7zO.A17(PorterDuff.Mode.SRC_IN, A0D, i3);
            return A0D;
        }
        int i4 = (length / 2) - 1;
        if (i4 >= 0) {
            int i5 = length - 1;
            while (true) {
                int i6 = iArr[i2];
                iArr[i2] = iArr[i5];
                iArr[i5] = i6;
                i5--;
                if (i2 == i4) {
                    break;
                }
                i2++;
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setShape(1);
        int i7 = i * 2;
        gradientDrawable.setSize(i7, i7);
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientRadius(i * 1.52f);
        gradientDrawable.setGradientCenter(0.5f, 0.76f);
        return gradientDrawable;
    }
}
