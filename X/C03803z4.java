package X;

/* renamed from: X.3z4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3z4.class */
public final class C03803z4 {
    public String A01;
    public boolean A02 = false;
    public final Object A05 = new Object();
    public long A00 = Long.MAX_VALUE;
    public final C00i A04 = new 1BQ(16481);
    public final C00i A03 = new 1BQ(32844);

    public static void A00(C03803z4 c03803z4, String str) {
        synchronized (c03803z4.A05) {
            if (c03803z4.A02) {
                c03803z4.A00 = Long.MAX_VALUE;
                c03803z4.A02 = false;
                String str2 = c03803z4.A01;
                c03803z4.A01 = "";
                0fH.A0l("MobileConfigEmergencyPushResetHandlerImpl", "Emergency Push is resetting app now");
                00F.A01(0Pz.A0v("MobileConfig ", str, ": ", str2));
            }
        }
    }
}
