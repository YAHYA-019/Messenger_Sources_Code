package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.enums.GraphQLPrivateReplyStatus;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.math.BigDecimal;
import java.util.BitSet;

/* renamed from: X.8i7, reason: invalid class name */
/* loaded from: 8i7.class */
public final class C8i7 extends 1LH {
    public static final CallerContext A04 = CallerContext.A0B("PrivateReplyCommentItemComponent");
    public final 2JX A00;
    public final 9Tp A01;
    public final MigColorScheme A02;
    public final C9fd A03;

    public C8i7(2JX r302, C9fd c9fd, 9Tp r304, MigColorScheme migColorScheme) {
        7zT.A1U(migColorScheme, r304, c9fd);
        this.A00 = r302;
        this.A02 = migColorScheme;
        this.A01 = r304;
        this.A03 = c9fd;
    }

    private final C2p8 A01() {
        Integer num;
        String A0k;
        2JX r0 = this.A00;
        if (r0 == null || !r0.getBooleanValue(2082189195)) {
            C9fd c9fd = this.A03;
            if (r0 == null || (A0k = r0.A0k()) == null || !c9fd.A01.contains(A0k)) {
                num = 0S2.A0N;
                return C2p6.A00(num);
            }
        }
        num = 0S2.A01;
        return C2p6.A00(num);
    }

    public static final boolean A0L(C8i7 c8i7) {
        String A0k;
        2JY A0B;
        2JX r0 = c8i7.A00;
        Enum r303 = null;
        if (r0 != null && (A0B = 1BK.A0B(r0, 2JX.class, -158729314, 2006391114)) != null) {
            r303 = A0B.A0g(GraphQLPrivateReplyStatus.A02, -892481550);
        }
        if (r303 != GraphQLPrivateReplyStatus.A01) {
            return (r0 == null || (A0k = r0.A0k()) == null || !c8i7.A03.A02.contains(A0k)) ? false : true;
        }
        return true;
    }

    public 1LI A0s(C2k5 c2k5) {
        C2rr c2rr;
        2K3 r305;
        C1rh c1rh;
        2JY A0B;
        String A0l;
        C2pa c2pa;
        String A0i;
        2JX A0L;
        String A0j;
        2JX A0L2;
        2JY A0Q;
        String A0l2;
        11T.A0F(c2k5, 0);
        2JX r0 = this.A00;
        if (r0 == null) {
            return new C1rh(null, null, null, null, null, false);
        }
        2lQ r02 = 2lO.A02;
        2RH r03 = 2RH.A03;
        long A06 = 4YV.A06(r03);
        Integer num = 0S2.A0E;
        5BG r312 = null;
        2lO A0K = 4YV.A0K((2lO) null, num, A06);
        Integer num2 = 0S2.A00;
        2lO A042 = C82m.A04(A0K, num2, 100.0f, 0);
        long doubleToRawLongBits = Double.doubleToRawLongBits(74.0d);
        Integer num3 = 0S2.A01;
        2lO A0V = 7zS.A0V(7zT.A0d(4YV.A0L(4YV.A0K(A042, num3, doubleToRawLongBits), 0S2.A1G, AVH.A00(c2k5, this, 45), 1), r03, num), C82m.A08(num2, 100.0f, 0), num3, doubleToRawLongBits);
        C1ro c1ro = C1ro.CENTER;
        C2sn A0L3 = 7zR.A0L(c2k5);
        2JX A0L4 = 1BL.A0L(r0, -1987376666, 889471774);
        if (A0L4 == null || (A0L2 = 1BL.A0L(A0L4, -1406328437, 135897241)) == null || (A0Q = A0L2.A0Q(2JX.class, -1403390082)) == null || (A0l2 = A0Q.A0l()) == null) {
            c2rr = null;
        } else {
            C2sS A00 = C2rr.A00(A0L3.AeS());
            A00.A2Y(C2q0.A08);
            A00.A01.A02 = C2py.CIRCULAR;
            A00.A2Z(this.A02);
            A00.A1y(c1ro);
            Uri uri = null;
            try {
                uri = C0A2.A03(A0l2);
            } catch (SecurityException unused) {
            }
            A00.A2X(uri);
            7zO.A1H(A00, r03);
            A00.A0S();
            c2rr = A00.A2W();
        }
        A0L3.A00(c2rr);
        2lO A0Y = 7zS.A0Y(7zT.A0L((2lO) null, 7zL.A00(r03)), num3);
        1Iw AeS = A0L3.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        C2yw A002 = 2dA.A00(A0U.A00);
        C2sn A0J = 7zS.A0J(A0U);
        if (A0L4 == null || (A0L = 1BL.A0L(A0L4, -1406328437, 135897241)) == null || (A0j = A0L.A0j()) == null) {
            r305 = null;
        } else {
            C2p8 A01 = A01();
            2KD A0a = 7zO.A0a(A0J, 0);
            A0a.A2x(this.A02);
            A0a.A2z(A0j);
            A0a.A2y(A01.A05);
            A0a.A2w(A01.A01);
            A0a.A2Z();
            r305 = A0a.A2W();
        }
        A0J.A00(r305);
        C2pa c2pa2 = null;
        if (A0L4 != null) {
            BigDecimal multiply = new BigDecimal(A0L4.getTimeValue(2003148228)).multiply(new BigDecimal(1000));
            1Iw AeS2 = A0J.AeS();
            2oN r04 = (2oN) 7zO.A0o(AeS2, 33246);
            C2p8 A012 = A01();
            2lO A0N = 7zT.A0N((2lO) null, 2.0d);
            C2sn A0U2 = 7zQ.A0U(AeS2);
            2JY A0B2 = 1BK.A0B(A0L4, 2JX.class, 3029410, 1072162971);
            if (A0B2 == null || (A0i = A0B2.A0i()) == null) {
                c2pa = null;
            } else {
                C2p8 A013 = A01();
                C2zi A003 = C2pa.A00(A0U2.AeS());
                A003.A2a(A0i);
                A003.A2X(A013.A02);
                A003.A2Z(A013.A06);
                A003.A2Y(this.A02);
                c2pa = A003.A2W();
            }
            A0U2.A00(c2pa);
            C2zk c2zk = new C2zk(A0U2.A00, new C2pg());
            MigColorScheme migColorScheme = this.A02;
            C2pg c2pg = c2zk.A01;
            c2pg.A01 = migColorScheme;
            BitSet bitSet = c2zk.A02;
            bitSet.set(0);
            c2pg.A03 = r04.A03(multiply.longValue());
            bitSet.set(3);
            c2pg.A02 = A012.A07;
            bitSet.set(2);
            c2pg.A00 = A012.A03;
            bitSet.set(1);
            c2zk.A0S();
            c1rh = 7zN.A0R(c2zk.A2W(), A0U2, A0J, A0N);
        } else {
            c1rh = null;
        }
        A0J.A00(c1rh);
        if (A0L(this)) {
            C2p8 A014 = A01();
            C2zi A004 = C2pa.A00(A0J.AeS());
            A004.A2a(3vP.A00(A0J).getString(2131963837));
            A004.A2X(C2pq.A02);
            A004.A2Z(A014.A06);
            A004.A2Y(this.A02);
            c2pa2 = A004.A2W();
        }
        A0J.A00(c2pa2);
        A002.A2Y(ImmutableList.of((Object) C2so.A00(A0J)));
        A002.A2W(4YU.A00(r03));
        A002.A0J();
        7zQ.A1E(A002.A01, A0U, A0L3, A0Y);
        2JY A0B3 = 1BK.A0B(r0, 2JX.class, 1014891912, 1389715613);
        if (A0B3 != null && (A0B = 1BK.A0B(A0B3, 2JX.class, 1330532588, 1949531552)) != null && (A0l = A0B.A0l()) != null) {
            5BH A015 = 5BG.A01(AeS);
            A015.A0z(56.0f);
            A015.A0l(56.0f);
            7zM.A1J(A015, A0l);
            C07004ik A005 = C06984ii.A00();
            7zM.A1K(A005, C0A8.A00(7zL.A0A(AeS), 12.0f));
            C06984ii.A01(A015, A005);
            A015.A0S();
            7zO.A1K(A015, r03);
            r312 = 7zO.A0P(A015, A04);
        }
        return 7zM.A0o(r312, A0L3, c2k5, A0V);
    }
}
