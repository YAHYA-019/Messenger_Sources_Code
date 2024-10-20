package X;

import android.graphics.drawable.GradientDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8fu, reason: invalid class name */
/* loaded from: 8fu.class */
public final class C8fu extends 1LH {
    public static final long A03 = Double.doubleToRawLongBits(58.0d);
    public final MigColorScheme A00;
    public final String A01;
    public final String A02;

    public C8fu(MigColorScheme migColorScheme, String str, String str2) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A02 = str;
        this.A01 = str2;
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        11T.A0F(c2k5, 0);
        final String str2 = this.A02;
        if ((str2 == null || str2.length() == 0) && ((str = this.A01) == null || str.length() == 0)) {
            return 7zL.A0Y();
        }
        C1ro c1ro = C1ro.FLEX_END;
        C1rp c1rp = C1rp.FLEX_START;
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A0S = 7zS.A0S(4YV.A0K(C82m.A06(num, 100.0f, 0), 0S2.A01, A03), 0);
        long A08 = 7zP.A08();
        2lO A0Y = 7zQ.A0Y(A0S, 0S2.A0C, A08);
        Integer num2 = 0S2.A0j;
        2lO A0Y2 = 7zQ.A0Y(A0Y, num2, A08);
        int A032 = 7zT.A03(this.A00, 0KF.A01(204.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{A032, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        2lO A0c = 7zS.A0c(4YV.A0L(A0Y2, num, gradientDrawable, 1), num2, true);
        C2sn A0I = 7zS.A0I(c2k5);
        final String str3 = this.A01;
        A0I.A00(new 1LH(str2, str3) { // from class: X.89z
            public final String A00;
            public final String A01;
            public static final long A02 = 7zP.A0F();
            public static final long A03 = 7zQ.A08();
            public static final long A05 = 7zQ.A0A();
            public static final long A06 = 7zP.A0A();
            public static final long A04 = 7zQ.A0B();

            {
                this.A01 = str2;
                this.A00 = str3;
            }

            public static final C2cl A01(C1u3 c1u3, C1u2 c1u2, C2k6 c2k6) {
                C2cm A00 = C2cl.A00(c2k6.AeS());
                A00.A2a(c1u2.A04(c1u3, C1u4.SIZE_16));
                long j = A06;
                A00.A0C(7zO.A06(c2k6, j));
                A00.A1L(7zO.A06(c2k6, j));
                A00.A0L();
                return 7zN.A09(A00);
            }

            public static final 8A0 A0L(String str4, boolean z) {
                Integer num3 = 0S2.A15;
                Integer num4 = 0S2.A0g;
                2lQ r02 = 2lO.A02;
                return new 8A0(4YV.A0K(7zS.A0h(0S2.A00, C1ro.CENTER, 0), 0S2.A0u, z ? A05 : 7zP.A08()), 2KG.A07, str4, num3, num4, 1, true);
            }

            public 1LI A0s(C2k5 c2k52) {
                C1rh A0Y3;
                C1rh A0Y4;
                C1u3 c1u3;
                11T.A0F(c2k52, 0);
                boolean A033 = 2yD.A03(1BL.A0Q(), 36322912084969545L);
                boolean A00 = DLy.A00(7zL.A0A(c2k52.A05));
                AnonymousClass255 anonymousClass255 = (!A033 ? A00 : !A00) ? AnonymousClass255.LTR : AnonymousClass255.RTL;
                String str4 = this.A01;
                if (str4 == null || str4.length() == 0) {
                    String str5 = this.A00;
                    if (str5 == null || str5.length() == 0) {
                        return 7zL.A0Y();
                    }
                    C1ro c1ro2 = C1ro.FLEX_END;
                    C1rp c1rp2 = C1rp.CENTER;
                    2lQ r02 = 2lO.A02;
                    Integer num3 = 0S2.A01;
                    2lO A0X = 7zQ.A0X((2lO) null, num3, 1.0f);
                    Integer num4 = 0S2.A0C;
                    2lO A0h = 7zT.A0h(4YV.A0L(C82m.A05(7zQ.A0X(A0X, num4, 0.0f), 0S2.A00, num3, 100.0f, 0), 0S2.A0Y, 2dP.A02, 0), num4, 7zP.A08());
                    long j = A03;
                    2lO A0W = 7zS.A0W(4YV.A0K(A0h, 0S2.A0u, j), 7zL.A0i(0S2.A1G, j), num4, anonymousClass255, 0);
                    Integer num5 = 0S2.A0j;
                    2lO A0L = 4YV.A0L(A0W, num5, true, 1);
                    C2sn A0I2 = 7zS.A0I(c2k52);
                    C1rp c1rp3 = C1rp.FLEX_START;
                    2lO A0L2 = 4YV.A0L(7zS.A0W(7zS.A0U((2lO) null, 7zL.A0k(num3, 1.0f), num4, 0.0f), 7zL.A0i(0S2.A1J, A02), num4, anonymousClass255, 0), num5, true, 1);
                    C2sn A0K = 7zS.A0K(A0I2);
                    A0K.A00(A0L(str5, false));
                    7zN.A1M(A0K, A0I2, A0L2, c1rp3);
                    return C2so.A0V(A0I2, c2k52, A0L, c1ro2, c1rp2);
                }
                try {
                    JSONObject jSONObject = new JSONObject(str4);
                    JSONArray jSONArray = jSONObject.getJSONArray("reaction_icons_sorted");
                    11T.A0D(jSONArray);
                    ArrayList A0s = AnonymousClass001.A0s();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        if ("like".equals(string)) {
                            c1u3 = A0s.isEmpty() ? C1u3.A5L : C1u3.A43;
                        } else if ("love".equals(string)) {
                            c1u3 = A0s.isEmpty() ? C1u3.A49 : C1u3.A4A;
                        } else if ("haha".equals(string)) {
                            c1u3 = A0s.isEmpty() ? C1u3.A3d : C1u3.A3e;
                        }
                        A0s.add(c1u3);
                    }
                    String string2 = jSONObject.getString("reactions");
                    String string3 = jSONObject.getString("views");
                    C1u2 c1u2 = (C1u2) 1Bi.A03(16839);
                    C1ro c1ro3 = C1ro.FLEX_END;
                    C1rp c1rp4 = C1rp.FLEX_START;
                    2lQ r03 = 2lO.A02;
                    Integer num6 = 0S2.A00;
                    2lO A042 = C82m.A04(null, num6, 100.0f, 0);
                    Integer num7 = 0S2.A01;
                    2lO A043 = C82m.A04(A042, num7, 100.0f, 0);
                    2dP r04 = 2dP.A02;
                    Integer num8 = 0S2.A0Y;
                    2lO A0L3 = 4YV.A0L(A043, num8, r04, 0);
                    long A082 = 7zP.A08();
                    Integer num9 = 0S2.A0C;
                    2lO A0Y5 = 7zQ.A0Y(A0L3, num9, A082);
                    Integer num10 = 0S2.A0N;
                    2lO A0Y6 = 7zQ.A0Y(A0Y5, num10, A082);
                    long j2 = A03;
                    2lO A0W2 = 7zS.A0W(4YV.A0K(A0Y6, 0S2.A0u, j2), 7zL.A0i(0S2.A1G, j2), num9, anonymousClass255, 0);
                    Integer num11 = 0S2.A0j;
                    2lO A0L4 = 4YV.A0L(A0W2, num11, true, 1);
                    C2sn A0I3 = 7zS.A0I(c2k52);
                    if (A0s.isEmpty() || string2 == null) {
                        A0Y3 = 7zL.A0Y();
                    } else {
                        2lO A0L5 = 4YV.A0L(7zS.A0W(7zQ.A0Y(4YV.A0L(C82m.A05(null, num6, num7, 100.0f, 0), num8, r04, 0), num9, A082), new 2lV(num10, A082), num9, anonymousClass255, 0), num11, true, 1);
                        C2sn A0J = 7zS.A0J(A0I3);
                        2lO A0L6 = 4YV.A0L(7zS.A0W(7zT.A0j((2lO) null, num7, num9, 0.0f), 7zL.A0i(0S2.A1J, A02), num9, anonymousClass255, 0), num11, true, 1);
                        C2sn A0K2 = 7zS.A0K(A0J);
                        if (anonymousClass255 != AnonymousClass255.LTR) {
                            int size = A0s.size() - 1;
                            while (true) {
                                int i2 = size;
                                if (-1 >= i2) {
                                    break;
                                }
                                A0K2.A00(A01((C1u3) A0s.get(i2), c1u2, A0K2));
                                size = i2 - 1;
                            }
                        } else {
                            Iterator it = A0s.iterator();
                            while (it.hasNext()) {
                                A0K2.A00(A01((C1u3) it.next(), c1u2, A0K2));
                            }
                        }
                        7zQ.A1F(A0L(string2, true), A0K2, A0J, A0L6);
                        A0Y3 = C2so.A0V(A0J, A0I3, A0L5, c1ro3, c1rp4);
                    }
                    A0I3.A00(A0Y3);
                    if (string3 == null) {
                        A0Y4 = 7zL.A0Y();
                    } else {
                        C1rp c1rp5 = C1rp.FLEX_END;
                        2lO A0L7 = 4YV.A0L(7zS.A0W(7zQ.A0Y(4YV.A0L(C82m.A05(null, num6, num7, 100.0f, 0), num8, r04, 0), num9, A082), new 2lV(num10, A082), num9, anonymousClass255, 0), num11, true, 1);
                        C2sn A0J2 = 7zS.A0J(A0I3);
                        2lO A0L8 = 4YV.A0L(7zS.A0W(7zT.A0j((2lO) null, num7, num9, 0.0f), 7zL.A0i(0S2.A1J, A02), num9, anonymousClass255, 0), num11, true, 1);
                        C2sn A0K3 = 7zS.A0K(A0J2);
                        C2cm A0M = 7zO.A0M(A0K3);
                        7zN.A18(A0M, C1u3.A51, c1u2);
                        A0M.A2X(-1);
                        7zT.A1H(A0M, A0K3, A04);
                        A0M.A0L();
                        7zR.A17(A0M, A0K3);
                        7zQ.A1F(A0L(string3, false), A0K3, A0J2, A0L8);
                        A0Y4 = C2so.A0V(A0J2, A0I3, A0L7, c1ro3, c1rp5);
                    }
                    A0I3.A00(A0Y4);
                    return C2so.A0V(A0I3, c2k52, A0L4, c1ro3, c1rp4);
                } catch (JSONException unused) {
                    return 7zL.A0Y();
                }
            }
        });
        return C2so.A0V(A0I, c2k5, A0c, c1ro, c1rp);
    }
}
