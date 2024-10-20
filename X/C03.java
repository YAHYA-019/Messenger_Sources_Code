package X;

/* loaded from: C03.class */
public final class C03 {
    public final C00i A00 = AbH.A0N();

    public void A00(String str, String str2) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "msg_received");
        if (A08.isSampled()) {
            A08.A7R("message_id", str2);
            A08.A7R("src", str);
            A08.BZL();
        }
    }
}
