package X;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ddu, reason: case insensitive filesystem */
/* loaded from: Ddu.class */
public final class C2108Ddu extends 4gM {
    public final int A00;
    public final DOR A01;
    public final boolean A02;
    public final /* synthetic */ DNx A03;

    public C2108Ddu(DNx dNx, DOR dor, int i, boolean z) {
        this.A03 = dNx;
        this.A01 = dor;
        this.A02 = z;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        2Ec r0 = (2Ec) obj;
        if (!this.A02 || r0 == null) {
            return;
        }
        Drawable drawable = this.A01.A03;
        Rect bounds = drawable.getBounds();
        int i = this.A00;
        float f = 0.0f / 0.0f;
        if (i == -1) {
            if (bounds.width() == r0.getWidth() && bounds.height() == r0.getHeight()) {
                return;
            }
            drawable.setBounds(0, 0, r0.getWidth(), r0.getHeight());
            return;
        }
        int height = (int) ((i / r0.getHeight()) * r0.getWidth());
        if (bounds.width() == height && bounds.height() == i) {
            return;
        }
        drawable.setBounds(0, 0, height, i);
    }
}
