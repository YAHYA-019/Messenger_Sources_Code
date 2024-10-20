package X;

/* renamed from: X.7s8, reason: invalid class name */
/* loaded from: 7s8.class */
public final class C7s8 {
    public float A00;
    public int A01;
    public int A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public static void A00(C7s8 c7s8, Object obj) {
        switch (c7s8.A03.intValue()) {
            case 0:
            case 7:
                c7s8.A02 = AnonymousClass001.A03(obj);
                return;
            case 1:
            case 6:
                c7s8.A00 = ((Number) obj).floatValue();
                return;
            case 2:
            case 3:
                c7s8.A01 = AnonymousClass001.A03(obj);
                return;
            case 4:
                c7s8.A05 = (String) obj;
                return;
            case 5:
                c7s8.A06 = AnonymousClass001.A1V(obj);
                return;
            default:
                return;
        }
    }
}
