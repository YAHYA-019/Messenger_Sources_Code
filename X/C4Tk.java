package X;

import com.facebook.user.model.User;

/* renamed from: X.4Tk, reason: invalid class name */
/* loaded from: 4Tk.class */
public final class C4Tk {
    public final 1Br A00;
    public final 0ER A01;
    public final 0ER A02;
    public final User A03;
    public final 1De A04;

    public C4Tk(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 84855);
        this.A03 = (User) 1Bn.A0G(r0, 83430);
        16J r02 = new 16J();
        r02.A05(new String[]{"fb-messenger"});
        r02.A03(new String[]{"business_calling"});
        this.A01 = C3o5.A0H(r02, "/call_hours_setting/");
        16J r03 = new 16J();
        r03.A05(new String[]{"fb-messenger-secure"});
        r03.A03(new String[]{"business_calling"});
        this.A02 = C3o5.A0H(r03, "/call_hours_setting/");
    }
}
