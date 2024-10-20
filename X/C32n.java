package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.32n, reason: invalid class name */
/* loaded from: 32n.class */
public final class C32n extends Drawable.ConstantState {
    public final int A00;
    public final int A01;
    public final C1gj A02;

    public C32n(C1gj c1gj, int i, int i2) {
        this.A02 = c1gj;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return resources.getDrawable(this.A02.A06() ? this.A00 : this.A01, null);
    }
}
