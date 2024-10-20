package X;

import com.facebook.user.model.UserKey;

/* renamed from: X.6nb, reason: invalid class name */
/* loaded from: 6nb.class */
public final class C6nb extends 1LH {
    public static final C2q1 A03 = new C2q1(0.0f, 0.0f, 4.0f, 16.0f, 0.0f, 0, 16, 11, 11, 16);
    public final 2lO A00;
    public final 5zD A01;
    public final UserKey A02;

    public C6nb(2lO r302, 5zD r303, UserKey userKey) {
        11T.A0F(userKey, 2);
        11T.A0F(r303, 3);
        this.A00 = r302;
        this.A02 = userKey;
        this.A01 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2zT A00 = C2q7.A00(c2k5.A05);
        C5z7.A00(A00, this.A00);
        A00.A0k(1.0f);
        A00.A2Z(this.A02);
        A00.A2X(A03);
        A00.A01.A06 = C2q2.A0G;
        A00.A2Y(this.A01.Axg());
        return A00.A2W();
    }
}
