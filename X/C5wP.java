package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.5wP, reason: invalid class name */
/* loaded from: 5wP.class */
public final class C5wP {
    public final 5wO A00;
    public final C01i A01 = C01g.A01(5wR.A00);
    public final 1Br A02 = 1Bq.A00(16385);
    public static final Set A06 = 02H.A02(new Integer[]{5, 7});
    public static final Set A04 = 02H.A02(new Integer[]{4, 6});
    public static final Set A05 = 02H.A02(new Integer[]{3, 2, 4});
    public static final Set A03 = 02H.A02(new 5wQ[]{5wQ.A05, 5wQ.A03});

    public C5wP(5wO r302) {
        this.A00 = r302;
    }

    private final C82j A00(C5pu c5pu, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        String str;
        String str2 = (String) function1.invoke(c5pu);
        C82j c82j = null;
        if (str2 != null && (str = (String) function12.invoke(c5pu)) != null) {
            Integer num = (Integer) function13.invoke(c5pu);
            String str3 = (String) function14.invoke(c5pu);
            String str4 = (String) function15.invoke(c5pu);
            Number number = (Number) function16.invoke(c5pu);
            Integer num2 = null;
            if (number != null) {
                int intValue = number.intValue();
                if (intValue == 1) {
                    num2 = 0S2.A00;
                } else if (intValue == 3) {
                    num2 = 0S2.A03;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No mapping for xma icon ");
                    sb.append(number);
                    0fH.A0n("XmaIconResolver", sb.toString());
                }
            }
            c82j = new C82j((C5vw) A03(num, str, str3, str4), num2, str2);
        }
        return c82j;
    }

    private final 1CO A01() {
        return (1CO) this.A02.A00.get();
    }

    private final C5vw A02(C5pu c5pu) {
        1qX r0 = (1qX) c5pu;
        String string = r0.mResultSet.getString(0, 41);
        return string == null ? C5vv.A0o : A03(r0.mResultSet.getNullableInteger(0, 39), string, r0.mResultSet.getString(0, 97), r0.mResultSet.getString(0, 96));
    }

    private final 6AR A03(Integer num, String str, String str2, String str3) {
        return new 6AR((str2 == null || str2.length() == 0) ? null : C0A2.A00((AnonymousClass488) this.A01.getValue(), str2), (str3 == null || str3.length() == 0) ? null : C0A2.A00((AnonymousClass488) this.A01.getValue(), str3), (6Pq) null, num, (Long) null, str);
    }

    private final Integer A04(6AO r302, C5pu c5pu) {
        if (r302 != null && r302.AeC() != null) {
            C5g9 c5g9 = (C5g9) r302;
            6Eq r0 = 6Eq.A05;
            if (c5g9.A06(r0, "layout_type") != null) {
                int i = 0;
                6Eq A062 = c5g9.A06(r0, "layout_type");
                if (A062 == null) {
                    throw 1BK.A0h();
                }
                switch (A062.ordinal()) {
                    case 1:
                        i = 16;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 5:
                        i = 20;
                        break;
                    case 6:
                        i = 10;
                        break;
                }
                return Integer.valueOf(i);
            }
        }
        return ((1qX) c5pu).mResultSet.getNullableInteger(0, 37);
    }

    private final List A05(C5pu c5pu) {
        Function1 function1;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        C82j[] c82jArr = new C82j[3];
        if (A01().AZk(36324217754570249L)) {
            c82jArr[0] = A00(c5pu, new AnonymousClass833(this, 34), new AnonymousClass833(this, 35), new AnonymousClass833(this, 36), new AnonymousClass833(this, 37), new AnonymousClass833(this, 38), new AnonymousClass833(this, 39));
            c82jArr[1] = A00(c5pu, new AnonymousClass833(this, 40), new AnonymousClass833(this, 41), new AnonymousClass833(this, 42), new AnonymousClass833(this, 25), new AnonymousClass833(this, 26), new AnonymousClass833(this, 27));
            function1 = new AnonymousClass833(this, 28);
            function12 = new AnonymousClass833(this, 29);
            function13 = new AnonymousClass833(this, 30);
            function14 = new AnonymousClass833(this, 31);
            function15 = new AnonymousClass833(this, 32);
            function16 = new AnonymousClass833(this, 33);
        } else {
            c82jArr[0] = A00(c5pu, 7xU.A00, 7xV.A00, 7xW.A00, 7xX.A00, 7xY.A00, 7xZ.A00);
            c82jArr[1] = A00(c5pu, C7xa.A00, C7xb.A00, C7xc.A00, C7xd.A00, C7xe.A00, C7xf.A00);
            function1 = C7xg.A00;
            function12 = C7xh.A00;
            function13 = C7xi.A00;
            function14 = C7xj.A00;
            function15 = C7xk.A00;
            function16 = C7xl.A00;
        }
        c82jArr[2] = A00(c5pu, function1, function12, function13, function14, function15, function16);
        11T.A0F(c82jArr, 0);
        return 02L.A08(c82jArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:193|194|195)|(19:201|148|(18:150|(1:191)(2:154|(1:156))|157|158|(2:160|(13:162|163|(3:165|(1:188)(1:169)|170)(1:189)|171|(2:173|(8:175|176|(1:178)(1:186)|179|(1:181)|182|(1:184)|185))|187|176|(0)(0)|179|(0)|182|(0)|185))|190|163|(0)(0)|171|(0)|187|176|(0)(0)|179|(0)|182|(0)|185)|192|158|(0)|190|163|(0)(0)|171|(0)|187|176|(0)(0)|179|(0)|182|(0)|185)|202|203|204|(19:210|148|(0)|192|158|(0)|190|163|(0)(0)|171|(0)|187|176|(0)(0)|179|(0)|182|(0)|185)) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0a72, code lost:
    
        if (X.6C7.A00(r0) != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x077a, code lost:
    
        if (r0 != 8) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x07a8, code lost:
    
        if (r0 == 2009) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0aa5, code lost:
    
        if (X.0QD.A0k(X.C5wP.A03, r0) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x06a8, code lost:
    
        if (X.6C7.A02(r0) != false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0b98  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C5w6 A06(X.C5pu r302, X.C5to r303) {
        /*
            Method dump skipped, instructions count: 3217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5wP.A06(X.5pu, X.5to):X.5w6");
    }
}
