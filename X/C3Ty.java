package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.3Ty, reason: invalid class name */
/* loaded from: 3Ty.class */
public final class C3Ty implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C3Ty(Context context, ViewGroup viewGroup, FbUserSession fbUserSession, CCb cCb, ThreadKey threadKey, MigColorScheme migColorScheme, int i) {
        this.A00 = i;
        this.A06 = cCb;
        this.A03 = fbUserSession;
        this.A01 = migColorScheme;
        this.A02 = context;
        this.A05 = viewGroup;
        this.A04 = threadKey;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A00;
        CCb cCb = (CCb) this.A06;
        CCb.A00((Context) this.A02, (ViewGroup) this.A05, (FbUserSession) this.A03, cCb, (ThreadKey) this.A04, (MigColorScheme) this.A01, i2 != 0 ? 5 : 0);
    }
}
