package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Cgy.class */
public final class Cgy implements C00i {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ BWe A02;
    public final /* synthetic */ CbG A03;

    public Cgy(Context context, FbUserSession fbUserSession, BWe bWe, CbG cbG) {
        this.A03 = cbG;
        this.A02 = bWe;
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    @Override // X.C00i, X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        return new RJi(this.A00, this.A01);
    }
}
