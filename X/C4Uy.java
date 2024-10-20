package X;

/* renamed from: X.4Uy, reason: invalid class name */
/* loaded from: 4Uy.class */
public final class C4Uy {
    public final 1Br A00 = 1BK.A0C();
    public final 0ER A01;
    public final 0ER A02;
    public final 0ER A03;
    public final 0ER A04;
    public final 0ER A05;
    public final 0ER A06;
    public final 0ER A07;
    public final 0ER A08;

    public C4Uy() {
        16J r0 = new 16J();
        r0.A05(new String[]{"fb-messenger"});
        r0.A03(new String[]{"messaging_commerce"});
        this.A08 = C3o5.A0H(r0, "/offsite_bank_transfer/");
        this.A07 = C3o5.A0H(A00(), "/attach_receipt/");
        this.A06 = C3o5.A0H(A00(), "/informational_message_bottom_sheet/");
        this.A02 = C3o5.A0H(A00(), "/async_controller/");
        this.A03 = C3o5.A0H(A00(), "/checkout/");
        this.A04 = C3o5.A0H(A00(), "/order_details/");
        this.A01 = C3o5.A0H(A00(), "/app_switch/");
        this.A05 = C3o5.A0H(A00(), "/donation/");
    }

    public static 16J A00() {
        16J r0 = new 16J();
        r0.A05(new String[]{"fb-messenger"});
        r0.A03(new String[]{"messaging_commerce"});
        return r0;
    }
}
