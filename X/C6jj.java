package X;

import java.util.Set;

/* renamed from: X.6jj, reason: invalid class name */
/* loaded from: 6jj.class */
public final class C6jj {
    public static final Set A01;
    public volatile Set A00;

    static {
        char[] chars = Character.toChars(10052);
        11T.A0A(chars);
        String str = new String(chars);
        String str2 = new String(new int[]{10052, 65039}, 0, 2);
        char[] chars2 = Character.toChars(9731);
        11T.A0A(chars2);
        String str3 = new String(chars2);
        char[] chars3 = Character.toChars(9924);
        11T.A0A(chars3);
        String str4 = new String(chars3);
        char[] chars4 = Character.toChars(127877);
        11T.A0A(chars4);
        String str5 = new String(chars4);
        String str6 = new String(new int[]{127877, 127995}, 0, 2);
        String str7 = new String(new int[]{127877, 127996}, 0, 2);
        String str8 = new String(new int[]{127877, 127997}, 0, 2);
        String str9 = new String(new int[]{127877, 127998}, 0, 2);
        String str10 = new String(new int[]{127877, 127999}, 0, 2);
        char[] chars5 = Character.toChars(129334);
        11T.A0A(chars5);
        String str11 = new String(chars5);
        String str12 = new String(new int[]{129334, 127995}, 0, 2);
        String str13 = new String(new int[]{129334, 127996}, 0, 2);
        String str14 = new String(new int[]{129334, 127997}, 0, 2);
        String str15 = new String(new int[]{129334, 127998}, 0, 2);
        String str16 = new String(new int[]{129334, 127999}, 0, 2);
        char[] chars6 = Character.toChars(127876);
        11T.A0A(chars6);
        String str17 = new String(chars6);
        char[] chars7 = Character.toChars(127938);
        11T.A0A(chars7);
        String str18 = new String(chars7);
        String str19 = new String(new int[]{127938, 127995}, 0, 2);
        String str20 = new String(new int[]{127938, 127996}, 0, 2);
        String str21 = new String(new int[]{127938, 127997}, 0, 2);
        String str22 = new String(new int[]{127938, 127998}, 0, 2);
        String str23 = new String(new int[]{127938, 127999}, 0, 2);
        char[] chars8 = Character.toChars(9975);
        11T.A0A(chars8);
        String str24 = new String(chars8);
        String str25 = new String(new int[]{9975, 65039}, 0, 2);
        String str26 = new String(new int[]{9975, 127995}, 0, 2);
        String str27 = new String(new int[]{9975, 127996}, 0, 2);
        String str28 = new String(new int[]{9975, 127997}, 0, 2);
        String str29 = new String(new int[]{9975, 127998}, 0, 2);
        String str30 = new String(new int[]{9975, 127999}, 0, 2);
        char[] chars9 = Character.toChars(127784);
        11T.A0A(chars9);
        String str31 = new String(chars9);
        String str32 = new String(new int[]{127784, 65039}, 0, 2);
        String[] strArr = new String[32];
        System.arraycopy(new String[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{str28, str29, str30, str31, str32}, 0, strArr, 27, 5);
        A01 = 02H.A02(strArr);
    }

    public final boolean A00(String str) {
        boolean z = false;
        if (str != null && !0CU.A0O(str)) {
            if (this.A00 == null) {
                this.A00 = C6jl.A00(36873763115368625L);
            }
            Set set = this.A00;
            if (set == null) {
                throw 1BK.A0h();
            }
            z = set.contains(str);
        }
        return z;
    }
}
