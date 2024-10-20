package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8mh, reason: invalid class name */
/* loaded from: 8mh.class */
public final class C8mh extends C1rj {
    public static final CallerContext A07 = CallerContext.A0B("NameBadgeSpec");
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public 1LI A05;
    public String A06;

    public C8mh() {
        super("NameBadge");
    }

    public final Object[] A0k() {
        return new Object[]{null, this.A06, this.A04, Float.valueOf(this.A00), Integer.valueOf(this.A02), null, Float.valueOf(this.A01), Integer.valueOf(this.A03), this.A05};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8mh c8mh = (C8mh) super.A0l();
        c8mh.A05 = 4YV.A0J(c8mh.A05);
        return c8mh;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rq A01;
        C26z c26z;
        1LI r0 = this.A05;
        int i = this.A03;
        Drawable drawable = this.A04;
        int i2 = this.A02;
        float f = this.A01;
        float f2 = this.A00;
        String str = this.A06;
        if (i != 1) {
            A01 = C1rg.A01(r302, null, 0);
            if (i != 2) {
                c26z = C26z.END;
            } else {
                A01.A00.A05 = true;
                c26z = C26z.START;
            }
        } else {
            A01 = 2cK.A01(r302, (String) null, 0);
            c26z = C26z.BOTTOM;
        }
        A01.A0S();
        A01.A2Y(C1ro.FLEX_START);
        A01.A2a(C1rp.CENTER);
        A01.A2Z(C1ro.CENTER);
        if (drawable != null) {
            C2cq A0u = 7zM.A0u(drawable, r302, 0);
            A0u.A2C(c26z, i2);
            A0u.A2S(str);
            if (f != -1.0f) {
                A0u.A0z(f);
            }
            if (f2 != -1.0f) {
                A0u.A0l(f2);
            }
            A01.A2X(A0u.A2W());
        }
        A01.A2X(r0);
        return A01.A2V();
    }
}
