package X;

import android.graphics.drawable.Drawable;

/* loaded from: E0g.class */
public final class E0g extends JVd {
    public final int A00;

    public E0g(Drawable drawable, int i) {
        ((JVd) this).A00 = drawable;
        this.A00 = i;
    }

    /* renamed from: BSD, reason: merged with bridge method [inline-methods] */
    public boolean BSF(2hW r302) {
        boolean z = true;
        if (this != r302) {
            if (!(r302 instanceof E0g)) {
                return false;
            }
            if (this.A00 != ((E0g) r302).A00) {
                z = false;
            }
        }
        return z;
    }
}
