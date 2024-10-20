package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.1r9, reason: invalid class name */
/* loaded from: 1r9.class */
public final class C1r9 {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ ComponentHost A03;

    public C1r9(ComponentHost componentHost) {
        this.A03 = componentHost;
    }

    public final void A00() {
        int i;
        if (this.A02 != null) {
            0AE r0 = this.A03.A0M;
            int A00 = r0.A00();
            int i2 = this.A00;
            while (true) {
                int i3 = i2;
                if (i3 >= A00) {
                    i = this.A01;
                    break;
                }
                2JG r02 = (2JG) r0.A05(i3);
                Object obj = r02.A04;
                if (obj instanceof View) {
                    i = i3 + 1;
                    break;
                }
                if (r02.A02) {
                    boolean BWo = ComponentsSystrace.A00.BWo();
                    if (BWo) {
                        String A0a = 2JK.A00(r02.A01).A03.A0a();
                        11T.A0A(A0a);
                        ComponentsSystrace.A02(0Pz.A0W("draw: ", A0a));
                    }
                    11T.A0I(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    Drawable drawable = (Drawable) obj;
                    Canvas canvas = this.A02;
                    if (canvas == null) {
                        throw 1BK.A0e();
                    }
                    drawable.draw(canvas);
                    if (BWo) {
                        ComponentsSystrace.A01();
                    }
                }
                i2 = i3 + 1;
            }
            this.A00 = i;
        }
    }
}
