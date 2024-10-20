package X;

import android.graphics.drawable.Drawable;

/* loaded from: A81.class */
public final class A81 implements AYm {
    public final Drawable A00;
    public final String A01;

    public A81(String str, Drawable drawable) {
        this.A01 = str;
        this.A00 = drawable;
    }

    @Override // X.AYm
    public String getPromptText() {
        return this.A01;
    }
}
