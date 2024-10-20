package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.53l, reason: invalid class name */
/* loaded from: 53l.class */
public final class C53l {
    public int A00 = 0;
    public final ImageView A01;

    public C53l(ImageView imageView) {
        this.A01 = imageView;
    }

    public void A00() {
        Drawable drawable = this.A01.getDrawable();
        if (drawable != null) {
            C53d.A02(drawable);
        }
    }

    public void A01(int i) {
        Drawable drawable;
        ImageView imageView = this.A01;
        if (i != 0) {
            drawable = C53a.A00(imageView.getContext(), i);
            if (drawable != null) {
                C53d.A02(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(android.util.AttributeSet r302, int r303) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53l.A02(android.util.AttributeSet, int):void");
    }
}
