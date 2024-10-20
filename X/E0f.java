package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: E0f.class */
public final class E0f extends JVd {
    public final Drawable[] A00;

    public E0f(Drawable[] drawableArr) {
        ((JVd) this).A00 = new LayerDrawable(drawableArr);
        this.A00 = drawableArr;
    }

    /* renamed from: BSD, reason: merged with bridge method [inline-methods] */
    public boolean BSF(2hW r302) {
        if (this != r302) {
            if (!(r302 instanceof E0f)) {
                return false;
            }
            Drawable[] drawableArr = ((E0f) r302).A00;
            Drawable[] drawableArr2 = this.A00;
            int length = drawableArr2.length;
            if (length != drawableArr.length) {
                return false;
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                if (!C4Da.A00(drawableArr2[i2], drawableArr[i2])) {
                    return false;
                }
                i = i2 + 1;
            }
        }
        return true;
    }
}
