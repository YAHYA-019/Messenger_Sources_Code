package X;

import java.util.List;

/* renamed from: X.5lj, reason: invalid class name */
/* loaded from: 5lj.class */
public final class C5lj implements C5lk {
    public static final C5lj A00 = new Object();
    public static final C04t A02 = new C04t("�� (.*)\\n(.*)");
    public static final C04t A01 = new C04t("�� (.*)\\n(.*)\\n(.*)");

    /* JADX WARN: Type inference failed for: r0v61, types: [X.949, X.5fq] */
    /* JADX WARN: Type inference failed for: r309v3, types: [X.949, X.5fq] */
    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, 59);
        C5fq c5fq = null;
        C5fq c5fq2 = c5fq;
        if (nullableInteger != null) {
            c5fq2 = c5fq;
            if (nullableInteger.intValue() == 7) {
                c5fq2 = c5fq;
                if (r0.mResultSet.getString(i, 52) != null) {
                    String string = r0.mResultSet.getString(i, 52);
                    c5fq2 = c5fq;
                    if (string != null) {
                        c5fq2 = c5fq;
                        if (string.length() != 0) {
                            C07u A04 = A01.A04(string, 0);
                            if (0AI.A00(A04) <= 0 || ((0PH) 0AI.A01(A04)).A00().size() != 4) {
                                C07u A042 = A02.A04(string, 0);
                                c5fq2 = c5fq;
                                if (0AI.A00(A042) > 0) {
                                    c5fq2 = c5fq;
                                    if (((0PH) 0AI.A01(A042)).A00().size() == 3) {
                                        List A002 = ((0PH) 0AI.A01(A042)).A00();
                                        String str = (String) A002.get(1);
                                        String str2 = (String) A002.get(2);
                                        ?? c5fq3 = new C5fq();
                                        11T.A0F(str, 0);
                                        c5fq3.A02 = str;
                                        11T.A0F(str2, 0);
                                        c5fq3.A00 = str2;
                                        return c5fq3;
                                    }
                                }
                            } else {
                                List A003 = ((0PH) 0AI.A01(A04)).A00();
                                String str3 = (String) A003.get(1);
                                String str4 = (String) A003.get(2);
                                String str5 = (String) A003.get(3);
                                ?? c5fq4 = new C5fq();
                                11T.A0F(str3, 0);
                                c5fq4.A02 = str3;
                                11T.A0F(str4, 0);
                                c5fq4.A00 = str4;
                                c5fq4.A01 = str5;
                                c5fq2 = c5fq4;
                            }
                        }
                    }
                }
            }
        }
        return c5fq2;
    }
}
