package X;

import com.facebook.user.model.User;

/* loaded from: Cx3.class */
public final class Cx3 implements DGK {
    public final /* synthetic */ C3q A00;
    public final /* synthetic */ DK3 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public Cx3(C3q c3q, DK3 dk3, User user, boolean z) {
        this.A00 = c3q;
        this.A02 = user;
        this.A03 = z;
        this.A01 = dk3;
    }

    public void Bnv(boolean z) {
        Be5 be5 = this.A00.A01;
        User user = this.A02;
        boolean z2 = !this.A03;
        Be4 be4 = be5.A00.A05;
        if (be4 != null) {
            AlM.A0B(be4.A00, user, z2);
        }
    }
}
