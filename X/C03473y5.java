package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Arrays;

/* renamed from: X.3y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3y5.class */
public final class C03473y5 extends C1rj {
    public C1p8 A00;
    public C1p8 A01;
    public C1p8 A02;
    public MigColorScheme A03;
    public String A04;

    public C03473y5() {
        super("TextBadge");
    }

    public static final ShapeDrawable A00(1Iw r301, int i, int i2) {
        11T.A0F(r301, 0);
        float[] fArr = new float[8];
        11T.A0A(r301.A0D);
        Arrays.fill(fArr, C0A8.A00(r0, i));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        return shapeDrawable;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A04, this.A01, this.A03, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A03;
        String str = this.A04;
        C1p8 c1p8 = this.A02;
        C1p8 c1p82 = this.A00;
        C1p8 c1p83 = this.A01;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0D(A00(r302, 11, migColorScheme.Chx(c1p83)));
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0D(A00(r302, 8, migColorScheme.Chx(c1p82)));
        A012.A24(C26z.ALL, 3.0f);
        A012.A0j(1.0f);
        2KD A013 = 2K3.A01(r302, 0);
        A013.A2x(migColorScheme);
        A013.A2z(str);
        A013.A2y(2KE.A0E);
        A013.A2w(c1p8);
        A013.A31(false);
        A013.A25(C26z.HORIZONTAL, 4.0f);
        A012.A2f(A013.A2W());
        A012.A2h(C1ro.CENTER);
        A012.A2i(C1rp.CENTER);
        A01.A2e(A012);
        return A01.A00;
    }
}
