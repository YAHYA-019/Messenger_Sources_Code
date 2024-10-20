package X;

import java.util.BitSet;

/* renamed from: X.Aw8, reason: case insensitive filesystem */
/* loaded from: Aw8.class */
public final class C1907Aw8 extends C1rs {
    public 1Iw A00;
    public B07 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1907Aw8(1Iw r302, B07 b07) {
        super(b07, r302, 0, 0);
        this.A03 = new String[]{"address", "contactName", "isInstagramAppointment", "onContactClickListener", "onMessengerClickListener", "onPhoneNumberClickListener", "phoneNumber", "profilePhotoUri", "shouldShowTitle"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = b07;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A18(this, this.A02, this.A03);
        return this.A01;
    }
}
