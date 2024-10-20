package X;

import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cl6.class */
public final class Cl6 implements DGz {
    public final /* synthetic */ AmL A00;

    public Cl6(AmL amL) {
        this.A00 = amL;
    }

    @Override // X.DGz
    public void BoP(D55 d55) {
        AmL amL = this.A00;
        if (d55 == null) {
            throw 1BK.A0h();
        }
        User user = d55.A04;
        11T.A09(user);
        AmL.A09(amL, user);
    }

    @Override // X.DGz
    public boolean C58(D55 d55) {
        AmL amL = this.A00;
        User user = d55.A04;
        11T.A09(user);
        ImmutableList immutableList = AmL.A0X;
        if (!4YV.A1S() && !user.A05) {
            return false;
        }
        R1U.A00(amL.requireContext(), AbF.A1A(user));
        return true;
    }
}
