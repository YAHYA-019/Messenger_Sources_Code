package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.Ggs, reason: case insensitive filesystem */
/* loaded from: Ggs.class */
public class C2544Ggs extends HFo {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    public C2544Ggs(Drawable drawable) {
        this.A02 = drawable;
        boolean z = drawable instanceof NinePatchDrawable;
        int i = -1;
        this.A01 = z ? -1 : drawable.getIntrinsicWidth();
        this.A00 = z ? i : drawable.getIntrinsicHeight();
    }
}
