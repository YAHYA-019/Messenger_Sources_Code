package X;

import com.facebook.user.model.User;

/* loaded from: C0g.class */
public final class C0g {
    public final 1Br A00 = AbG.A0V();

    public final String A00(User user) {
        String string;
        if (user.A05) {
            C00i c00i = this.A00.A00;
            string = 4YU.A0u(AbG.A06(c00i), AbH.A17(AbG.A06(c00i)), 2131954825);
        } else {
            if (user.A0D()) {
                String str = user.A1W;
                if (str != null && !0CU.A0O(str)) {
                    return String.valueOf(str);
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                String str2 = user.A1N;
                if (str2 != null && !0CU.A0O(str2) && !str2.equals(7zL.A13(user))) {
                    A0k.append(str2);
                    A0k.append(" • ");
                }
                AbG.A1F(4YV.A09(this.A00), A0k, 2131954824);
                return 11T.A02(A0k);
            }
            string = 4YV.A09(this.A00).getString(2131954823);
        }
        11T.A0A(string);
        return string;
    }
}
