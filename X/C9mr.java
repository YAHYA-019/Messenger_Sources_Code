package X;

/* renamed from: X.9mr, reason: invalid class name */
/* loaded from: 9mr.class */
public final class C9mr {
    public static String A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static final C9mr A05 = new Object();
    public static final 1Br A04 = 7zM.A0S();

    public static final void A00(int i) {
        7zP.A0e(A04).markerStart(i, true);
    }

    public static final void A01(int i, short s) {
        7zP.A0e(A04).markerEnd(i, s);
    }

    public static final void A02(String str, int i) {
        7zP.A0e(A04).markerPoint(i, str);
    }

    public static final void A03(String str, String str2, int i) {
        7zP.A0e(A04).markerAnnotate(i, str, str2);
    }
}
