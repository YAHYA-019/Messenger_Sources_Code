package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hog.class */
public final class Hog {
    public final 1Br A00 = 1Bu.A00(115818);
    public final 1Br A01 = 1Bq.A00(67461);
    public final 1Br A02 = 1Bu.A00(115819);

    public final boolean A00(FbUserSession fbUserSession, String str) {
        String str2;
        if (fbUserSession == null) {
            return false;
        }
        Hcv hcv = (Hcv) 1Lo.A08(fbUserSession, 115817);
        if (str != null) {
            C04r c04r = hcv.A00;
            if (c04r.containsKey(str) && (str2 = (String) c04r.get(str)) != null && str2.equals("off")) {
                return false;
            }
            if (c04r.containsKey(str)) {
                return true;
            }
        }
        return AnonymousClass001.A1Q(I7Q.A00((I7Q) 1Br.A0B(this.A00)), 2131957380);
    }
}
