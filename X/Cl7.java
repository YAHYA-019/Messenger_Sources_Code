package X;

import com.facebook.user.model.User;

/* loaded from: Cl7.class */
public final class Cl7 implements DGz {
    public final /* synthetic */ AmJ A00;

    public Cl7(AmJ amJ) {
        this.A00 = amJ;
    }

    @Override // X.DGz
    public void BoP(D55 d55) {
        if (d55 != null) {
            AmJ amJ = this.A00;
            User user = d55.A04;
            11T.A09(user);
            AmJ.A06(amJ, user);
        }
    }

    @Override // X.DGz
    public boolean C58(D55 d55) {
        return false;
    }
}
