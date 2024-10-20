package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: Euf.class */
public final class Euf {
    public 1BY A00;
    public final Fch A03 = DKD.A0b();
    public final 6J7 A01 = (6J7) 1Bn.A0B(81999);
    public final C00i A02 = AbH.A0F();

    public Euf(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(Context context, Bundle bundle, User user) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("p2p_payment_data");
            Parcelable parcelable2 = bundle.getParcelable("p2p_payment_config");
            if (parcelable != null && parcelable2 != null) {
                FbUserSession A0D = 4YV.A0D(context);
                Fch fch = this.A03;
                2FT A00 = Fvf.A00(fch.A05(A0D), fch, 43);
                1Kd.A0D(this.A02, new FwC(1, this, user, parcelable, parcelable2, context), A00);
                return;
            }
        }
        FI9.A00(context, 2131963152);
    }
}
