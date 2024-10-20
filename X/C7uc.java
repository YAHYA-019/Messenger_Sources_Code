package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.7uc, reason: invalid class name */
/* loaded from: 7uc.class */
public final class C7uc {
    public static 0NB A00(0NB r301, int i) {
        return r301.A01(new Lew(i));
    }

    public static 2JX A01(2JX r301) {
        return (2JX) A00(A00(0NB.A00(r301), 13), 1).A00;
    }

    public String A02(FbUserSession fbUserSession, 2JX r303) {
        boolean equals = ((1G1) fbUserSession).A02.equals(A00(A00(A00(0NB.A00(r303), 0), 5), 6).A00);
        0NB A00 = 0NB.A00(r303);
        return (String) (equals ? A00(A00(A00(A00, 2), 3), 4) : A00(A00(A00(A00, 0), 5), 6)).A00;
    }

    public String A03(FbUserSession fbUserSession, 2JX r303) {
        0NB A00;
        int i;
        boolean equals = ((1G1) fbUserSession).A02.equals(A00(A00(A00(0NB.A00(r303), 0), 5), 6).A00);
        0NB A002 = 0NB.A00(r303);
        if (equals) {
            A00 = A00(A00(A002, 7), 8);
            i = 9;
        } else {
            A00 = A00(A00(A002, 10), 11);
            i = 12;
        }
        return (String) A00(A00, i).A00;
    }
}
