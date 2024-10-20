package X;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;

/* renamed from: X.Ddt, reason: case insensitive filesystem */
/* loaded from: Ddt.class */
public final class C2107Ddt extends 4gM {
    public final int A00;
    public final ECl A01;
    public final boolean A02;
    public final /* synthetic */ DNx A03;

    public C2107Ddt(ECl eCl, DNx dNx, int i, boolean z) {
        this.A03 = dNx;
        this.A01 = eCl;
        this.A02 = z;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        5CC A02;
        2Ec r0 = (2Ec) obj;
        if (!this.A02 || r0 == null || (A02 = this.A01.A00.A02()) == null) {
            return;
        }
        Rect bounds = A02.getBounds();
        int i = this.A00;
        float f = 0.0f / 0.0f;
        if (i == -1) {
            if (bounds.width() == r0.getWidth() && bounds.height() == r0.getHeight()) {
                return;
            }
            A02.setBounds(0, 0, r0.getWidth(), r0.getHeight());
            return;
        }
        int height = (int) ((i / r0.getHeight()) * r0.getWidth());
        if (bounds.width() == height && bounds.height() == i) {
            return;
        }
        A02.setBounds(0, 0, height, i);
    }
}
