package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: X.8ij, reason: invalid class name */
/* loaded from: 8ij.class */
public final class C8ij extends 2Kb {
    public final int A00;
    public final Drawable A01;
    public final Drawable A02;
    public final ImageView.ScaleType A03;
    public final 5BK A04;
    public final 3xX A05;
    public final InterfaceC06154g3 A06;
    public final 5BO A07;
    public final 2lO A08;
    public final String A09;

    public C8ij(Drawable drawable, Drawable drawable2, ImageView.ScaleType scaleType, InterfaceC06154g3 interfaceC06154g3, 5BK r306, 5BO r307, 3xX r308, 2lO r309, String str, int i) {
        11T.A0F(r307, 1);
        this.A07 = r307;
        this.A09 = str;
        this.A03 = scaleType;
        this.A04 = r306;
        this.A02 = drawable;
        this.A01 = drawable2;
        this.A06 = interfaceC06154g3;
        this.A05 = r308;
        this.A00 = i;
        this.A08 = r309;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, X.2lr] */
    public C2lt A0s(2lX r302) {
        11T.A0F(r302, 0);
        ImageView.ScaleType scaleType = this.A03;
        Drawable drawable = this.A02;
        RTp rTp = null;
        if (drawable == null) {
            drawable = null;
        }
        5BK r0 = this.A04;
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            rTp = new RTp(drawable2);
        }
        Object A00 = 2rO.A00(r302, new AKK(this, 18), Arrays.copyOf(7zU.A1b(scaleType, drawable, r0, rTp, this.A00), 5));
        long A01 = r302.A01();
        5BO r02 = this.A07;
        String str = this.A09;
        InterfaceC06154g3 interfaceC06154g3 = this.A06;
        11T.A0F(r02, 1);
        11T.A0F(str, 2);
        return new C2lt(this.A08, new C29l(new Object(), new C2ll(new C2lk(C29N.A00, A2a.A00, 10, true), new ARW(15, A00, str, interfaceC06154g3, r02, (Object) null), A01)));
    }
}
