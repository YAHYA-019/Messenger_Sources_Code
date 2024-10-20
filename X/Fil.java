package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: Fil.class */
public final class Fil implements GEv {
    public final FIU A00;

    public Fil(FIU fiu) {
        this.A00 = fiu;
    }

    @Override // X.GEv
    public void D07(Rect rect, View view, int i, int i2) {
        FIU fiu = this.A00;
        int i3 = rect.left;
        int i4 = rect.top;
        fiu.A0E(view, i3, i4, rect.right - i3, rect.bottom - i4);
        fiu.A07();
    }
}
