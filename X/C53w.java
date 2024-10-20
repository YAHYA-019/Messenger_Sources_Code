package X;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;

/* renamed from: X.53w, reason: invalid class name */
/* loaded from: 53w.class */
public final class C53w extends ProgressBar {
    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        super.setIndeterminateDrawable(drawable);
    }
}
