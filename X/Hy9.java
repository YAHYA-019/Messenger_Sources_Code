package X;

/* loaded from: Hy9.class */
public final class Hy9 {
    public 8Lq A00 = new 8Lq((Integer) null, (String) null, (String) null, (String) null, 15);
    public final IY8 A01 = IY8.A01(this, 4);

    public static final void A00(Hy9 hy9, String str, String str2, String str3) {
        8Lq r308;
        String str4 = str2;
        String str5 = str;
        if (str == null && str2 == null) {
            4zI.A03.A05("RtcBugReportMiscDataMapProvider", "No call IDs provided to add to bug report", AnonymousClass001.A1Z());
            return;
        }
        if (!11T.A0O(str, hy9.A00.A03) || str == null) {
            if (!11T.A0O(str2, hy9.A00.A04) || str2 == null) {
                r308 = new 8Lq((Integer) null, (String) null, str, str3, 5);
                hy9.A00 = r308;
            } else if (str == null) {
                str5 = hy9.A00.A03;
            }
        } else if (str2 == null) {
            str4 = hy9.A00.A04;
        }
        r308 = new 8Lq(hy9.A00.A01, str3, str4, str5, 6);
        hy9.A00 = r308;
    }
}
