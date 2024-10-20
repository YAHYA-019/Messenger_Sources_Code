package X;

import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8fs, reason: invalid class name */
/* loaded from: 8fs.class */
public final class C8fs extends 1LH {
    public static final CallerContext A03 = CallerContext.A0B("AudioAvatarComposerButtonComponent");
    public final 1Im A00;
    public final int A01 = 2132279321;
    public final C6xp A02;

    public C8fs(1Im r302, C6xp c6xp) {
        this.A02 = c6xp;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        I1x i1x = (I1x) 1Lm.A06(C54z.A00(r0), 68862);
        C2lh A00 = C2lc.A00(c2k5, new J9o(i1x, 41));
        Object obj = A00.A02;
        if (((CharSequence) obj).length() == 0 && i1x != null) {
            i1x.A01(new S3r(A00));
        }
        Resources A0E = 4YU.A0E(r0);
        int i = this.A01;
        float dimension = A0E.getDimension(i) * 0.15f;
        float dimension2 = A0E.getDimension(i);
        float dimension3 = A0E.getDimension(i) + dimension;
        OvalShape ovalShape = new OvalShape();
        ovalShape.resize(16.0f, 16.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        C6xp c6xp = this.A02;
        Integer num = c6xp.A04;
        if (num == null) {
            num = 7zN.A0h();
        }
        shapeDrawable.setColorFilter(KVC.A00(0S2.A0N, num.intValue()));
        2lQ r02 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A01, 7zO.A0B((int) A0E.getDimension(i)));
        long A0I = 7zP.A0I();
        Integer num2 = 0S2.A00;
        2lO A0b = 7zS.A0b(7zT.A0L(4YV.A0K(A0K, num2, A0I), 2.0d), 0S2.A1G, AVF.A01(this, 14));
        C2sn A0U = 7zQ.A0U(r0);
        2dP r03 = 2dP.A01;
        2lO A0V = 7zS.A0V((2lO) null, 7zL.A0u(0S2.A0Y, r03, 0), num2, A0I);
        1Iw r04 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r04);
        1Iw r05 = A0U2.A00;
        8OI A002 = 8mA.A00(r05);
        int i2 = c6xp.A00;
        A002.A2Y(i2);
        A002.A2X(3.0f);
        A002.A2a(9);
        A002.A0z(4.0f);
        Resources A0E2 = 4YU.A0E(r05);
        A002.A1L((int) A0E2.getDimension(i));
        A002.A0J();
        A0U2.A00(A002.A00);
        8OI A003 = 8mA.A00(r05);
        A003.A2Y(i2);
        A003.A2X(9.0f);
        A003.A2a(6);
        A003.A0C(((int) A0E2.getDimension(i)) - 7zO.A04(A0U2, 7zQ.A07()));
        A003.A1L((int) A0E2.getDimension(i));
        A003.A0J();
        7zQ.A1F(A003.A00, A0U2, A0U, A0V);
        5BH A01 = 5BG.A01(r04);
        Uri uri = null;
        try {
            uri = C0A2.A03((String) obj);
        } catch (SecurityException unused) {
        }
        A01.A2X(uri);
        A01.A2b(A03);
        A01.A2H(r03);
        C26z c26z = C26z.BOTTOM;
        A01.A2E(c26z, 0);
        A01.A1L((int) dimension3);
        A01.A0C((int) dimension2);
        7zO.A1A(A01, A0U);
        C2cq A004 = C2cp.A00(r04, 0);
        A004.A0z(16.0f);
        A004.A0l(16.0f);
        A004.A2H(r03);
        C26z c26z2 = C26z.END;
        A004.A27(c26z2, -3.0f);
        A004.A27(c26z, -3.0f);
        A004.A2a(shapeDrawable);
        7zN.A1O(A0U, A004);
        C2cq A005 = C2cp.A00(r04, 0);
        A005.A0z(16.0f);
        A005.A0l(16.0f);
        A005.A2H(r03);
        A005.A27(c26z2, -3.0f);
        A005.A27(c26z, -3.0f);
        A005.A2a(i1x != null ? 4YV.A0I().A08(C1u3.A52, i2) : null);
        7zN.A1O(A0U, A005);
        return C2so.A0I(A0U, c2k5, A0b);
    }
}
