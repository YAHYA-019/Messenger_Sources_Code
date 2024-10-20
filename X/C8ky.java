package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8ky, reason: invalid class name */
/* loaded from: 8ky.class */
public final class C8ky extends C1rj {
    public int A00;
    public int A01;
    public Drawable A02;
    public 1Im A03;
    public String A04;
    public String A05;

    public C8ky() {
        super("PermissionRequestComponent");
    }

    public final Object[] A0k() {
        return 7zU.A1b(Integer.valueOf(this.A00), this.A04, this.A02, this.A05, this.A01);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A05;
        String str2 = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        Drawable drawable = this.A02;
        11T.A0F(r302, 0);
        1BL.A1F(str, str2);
        2cM A0j = 7zM.A0j(r302, 0);
        A0j.A2e(drawable != null ? 7zM.A0u(drawable, r302, 0).A2W() : null);
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A2f();
        A0L.A3A(str);
        A0L.A32(2131165289);
        A0L.A2x(i2);
        A0L.A1d(2131165288);
        A0L.A1b(R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold);
        7zM.A1L(A0j, A0L);
        7ZL A00 = C5Ay.A00(r302);
        Context context = r302.A0D;
        Ekz ekz = new Ekz(android.R.attr.state_enabled);
        int i3 = ekz.A02;
        if (i3 < 0) {
            ekz.A02 = -i3;
        }
        ekz.A00 = i;
        ekz.A01 = context.getColor(2132214313);
        A00.A2a(ekz);
        Ekz ekz2 = new Ekz(android.R.attr.state_pressed);
        int i4 = ekz2.A02;
        if (i4 < 0) {
            ekz2.A02 = -i4;
        }
        ekz2.A00 = i;
        ekz2.A01 = context.getColor(2132213993);
        A00.A2a(ekz2);
        A00.A1b(2132279305);
        A00.A1d(2132279314);
        A00.A00.A0G = str2;
        A00.A2Z(2131165289);
        A00.A00.A08 = Typeface.DEFAULT_BOLD;
        A00.A00.A06 = 0Em.A02(context, 2132214598);
        7zN.A1C(A00, r302, C8ky.class, "PermissionRequestComponent");
        A00.A0J();
        A0j.A2e(A00.A00);
        A0j.A2c();
        return A0j.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r307 == null) goto L9;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.A01
            r304 = r0
            r0 = -1351902487(0xffffffffaf6b9ae9, float:-2.142816E-10)
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L17
            r0 = r302
            r1 = r303
            r2 = r304
            X.4YV.A1G(r0, r1, r2)
            r0 = 0
            return r0
        L17:
            r0 = r302
            X.1LI r0 = X.7zU.A0I(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L48
            r0 = 0
            r307 = r0
        L25:
            java.lang.String r0 = "PermissionRequestComponentSpec"
            r308 = r0
            java.lang.String r0 = "Tried to ask for permissions but no event handler"
            r306 = r0
            r0 = r308
            r1 = r306
            X.0fH.A0o(r0, r1)
        L34:
            X.9EQ r0 = new X.9EQ
            r306 = r0
            r0 = r306
            r0.<init>()
            r0 = r307
            r1 = r306
            java.lang.Object r0 = r0.A00(r1)
            r0 = 0
            return r0
        L48:
            r0 = r306
            X.8ky r0 = (X.C8ky) r0
            r306 = r0
            r0 = r306
            X.1Im r0 = r0.A03
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L34
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8ky.A15(X.1Im, java.lang.Object):java.lang.Object");
    }
}
