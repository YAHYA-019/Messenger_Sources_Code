package X;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.27G, reason: invalid class name */
/* loaded from: 27G.class */
public final class C27G {
    public final Drawable A00;
    public final boolean A01;
    public final AnonymousClass257 A02;

    public C27G(Drawable drawable, AnonymousClass257 anonymousClass257, boolean z) {
        this.A02 = anonymousClass257;
        this.A01 = z;
        this.A00 = drawable;
    }

    public int A00() {
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        return (int) (fArr != null ? fArr[2] : 0.0f);
    }

    public int A01() {
        return AnonymousClass272.A00(this.A02.A0K.getLayoutPadding(C26z.BOTTOM));
    }

    public int A02() {
        return AnonymousClass272.A00(this.A02.A0K.getLayoutPadding(C26z.LEFT));
    }

    public int A03() {
        return AnonymousClass272.A00(this.A02.A0K.getLayoutPadding(C26z.RIGHT));
    }

    public int A04() {
        return AnonymousClass272.A00(this.A02.A0K.getLayoutPadding(C26z.TOP));
    }

    public int A05() {
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        return (int) (fArr != null ? fArr[1] : 0.0f);
    }

    public AnonymousClass255 A06() {
        AnonymousClass255 layoutDirection = this.A02.A0K.getLayoutDirection();
        11T.A0A(layoutDirection);
        return AnonymousClass254.A01(AnonymousClass254.A00(layoutDirection));
    }
}
