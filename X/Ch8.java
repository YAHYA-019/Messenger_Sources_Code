package X;

/* loaded from: Ch8.class */
public abstract class Ch8 implements GEx {
    public 1iF A00() {
        if (this instanceof B2X) {
            return AbF.A0C(267451864570511L);
        }
        if (this instanceof B2V) {
            return AbF.A0C(1567251216773138L);
        }
        return AbF.A0C(2 - ((B2W) this).A00 != 0 ? 2429843100654746L : 267451864570511L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0069. Please report as an issue. */
    public 2Jf A01() {
        C30G A0H;
        int A01;
        String str;
        if (this instanceof B2X) {
            B2X b2x = (B2X) this;
            A0H = AbF.A0H(80);
            A0H.A03("userID", b2x.A01);
            A01 = C54a.A00(b2x.A00);
            str = "full_screen_width";
        } else if (this instanceof B2V) {
            A0H = AbF.A0H(65);
            A01 = 12;
            str = "archived_montage_messages_pagination_first";
        } else {
            B2W b2w = (B2W) this;
            switch (b2w.A00) {
                case 0:
                    A0H = AbF.A0H(32);
                    A0H.A03("page_id", b2w.A01);
                    A0H.A06("profile_image_height", 3yG.A01(100.0f));
                    A01 = 3yG.A01(100.0f);
                    str = "profile_image_width";
                    break;
                case 1:
                    C30G A0H2 = AbF.A0H(33);
                    A0H2.A03("page_id", b2w.A01);
                    return A0H2;
                default:
                    C30G A0H3 = AbF.A0H(81);
                    A0H3.A02(b2w.A01, "userID");
                    return A0H3;
            }
        }
        A0H.A06(str, A01);
        return A0H;
    }

    @Override // X.GEx
    public C3sa Ao9() {
        C3sa A00 = C3sa.A00(A01());
        A00.A05 = A00();
        return A00;
    }
}
