package X;

import android.content.Context;
import com.facebook.payments.transactionhub.views.HubIntroBrandingView;

/* loaded from: E6u.class */
public final class E6u extends HubIntroBrandingView implements GFc {
    public C00i A00;
    public EMw A01;
    public final C00i A02;

    public E6u(Context context) {
        super(context, null, 0);
        this.A02 = DKD.A0P();
        this.A00 = DKD.A0U();
    }

    @Override // X.GFc
    public void Cqh(GID gid) {
        FXs.A01(((HubIntroBrandingView) this).A06, new Ej0(this, gid), this, 62);
    }
}
