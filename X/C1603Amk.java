package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.Amk, reason: case insensitive filesystem */
/* loaded from: Amk.class */
public final class C1603Amk extends C1q6 {
    public final FbUserSession A00;

    public C1603Amk(FbUserSession fbUserSession) {
        this.A00 = fbUserSession;
    }

    @Override // X.C1q6, X.C1pu
    public void BiN(Bundle bundle, Fragment fragment) {
        ((Bgs) 1Lm.A06(this.A00, 84143)).A00 = true;
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        ((Bgs) 1Lm.A06(this.A00, 84143)).A00 = false;
    }
}
