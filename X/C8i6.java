package X;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextWatcher;
import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.8i6, reason: invalid class name */
/* loaded from: 8i6.class */
public final class C8i6 extends 1LH {
    public static final long A03;
    public static final long A04;
    public static final long A05;
    public static final Rect A06;
    public static final RectF A07;
    public static final long A08;
    public static final long A09;
    public static final long A0D;
    public final 9Gd A00;
    public final String A01;
    public final String A02;
    public static final long A0C = 7zS.A06(16.0f);
    public static final long A0A = 7zP.A0A();
    public static final long A0B = 7zP.A09();

    static {
        long A082 = 7zQ.A08();
        A09 = A082;
        long A072 = 7zQ.A07();
        A08 = A072;
        long A0F = 7zP.A0F();
        A03 = A0F;
        A07 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        A06 = new Rect(0, 0, 0, 0);
        A04 = A082;
        A05 = A0F;
        A0D = A072;
    }

    public C8i6(9Gd r302, String str, String str2) {
        11T.A0F(r302, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r302;
    }

    private final C1rh A01(TextWatcher textWatcher, C2k6 c2k6, String str, int i, boolean z) {
        2lQ r0 = 2lO.A02;
        float[] fArr = new float[8];
        Arrays.fill(fArr, 0, 8, 7zO.A06(c2k6, A03));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, A07, null));
        shapeDrawable.setPadding(A06);
        shapeDrawable.mutate();
        shapeDrawable.setColorFilter(167772160, PorterDuff.Mode.SRC_IN);
        2lO A0Z = 7zT.A0Z(7zT.A0P(4YV.A0L((2lO) null, 0S2.A00, shapeDrawable, 1), A0A, A0B), 7zN.A0T(A09), z ? 7zP.A08() : A08);
        C2sn A0L = 7zS.A0L(c2k6);
        String A092 = 3yH.A09(A0L, i);
        long j = A0C;
        2lO A0R = 7zS.A0R((2lO) null, 1.0f);
        Typeface typeface = Typeface.DEFAULT;
        11T.A0B(typeface);
        7ZF A01 = 6rU.A01(A0L.A00, 0);
        7zT.A1O(A01, str, A092, -16777216, 2130706432);
        int A042 = 7zO.A04(A0L, j);
        6rU r02 = A01.A01;
        r02.A08 = A042;
        r02.A0B = typeface;
        r02.A07 = 1;
        r02.A01 = 8388611;
        r02.A0i = true;
        A01.A2k(true);
        r02.A06 = 3;
        A01.A2Z((-1) >>> 1);
        A01.A2Y(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        r02.A02 = 0;
        r02.A0C = null;
        A01.A2e(textWatcher);
        A01.A1w(null);
        C5z7.A00(A01, A0R);
        return 7zN.A0R(7zR.A0T(A01), A0L, c2k6, A0Z);
    }

    public static final 2KZ A0L(C2k6 c2k6, Integer num, int i, int i2, long j, long j2, long j3) {
        String A092 = 3yH.A09(c2k6, i);
        Typeface A01 = 2KU.A01(3vP.A00(c2k6), num);
        2lQ r0 = 2lO.A02;
        2lO A0Z = 7zT.A0Z(4YV.A0K((2lO) null, 0S2.A07, j2), 7zM.A0r(j3), A0D);
        long A082 = 7zP.A08();
        3yF A0v = 7zM.A0v(c2k6.AeS(), A092, 0);
        A0v.A2x(i2);
        7zQ.A1L(A0v, c2k6.B7k(), 0, j);
        A0v.A34(A01);
        7zV.A10(A0v, c2k6, A082);
        A0v.A2e();
        7zT.A1L(A0v, false);
        return 7zQ.A0c(A0Z, A0v);
    }

    public 1LI A0s(C2k5 c2k5) {
        C2sn A0U = 7zQ.A0U(7zL.A0X(c2k5));
        long A062 = 7zS.A06(16.0f);
        long j = A04;
        long j2 = A05;
        Integer num = 0S2.A0C;
        A0U.A00(A0L(A0U, num, 2131959953, -16777216, A062, j, j2));
        A0U.A00(A01(new 9pI(this, 1), A0U, this.A02, 2131959950, true));
        long A063 = 7zQ.A06();
        A0U.A00(A0L(A0U, 0S2.A01, 2131959949, 2130706432, 7zP.A0G(), A063, 7zP.A08()));
        A0U.A00(A0L(A0U, num, 2131959951, -16777216, 7zS.A06(16.0f), j, j2));
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, 7zL.A16(A01(new 9pI(this, 0), A0U, this.A01, 2131959952, false), A0U), false);
    }
}
