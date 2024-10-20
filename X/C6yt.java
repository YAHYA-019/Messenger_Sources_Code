package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6yt, reason: invalid class name */
/* loaded from: 6yt.class */
public final class C6yt implements C6wv {
    public final C01i A00;
    public final Context A01;
    public final FbUserSession A02;

    public C6yt(Context context, FbUserSession fbUserSession, BlueServiceOperationFactory blueServiceOperationFactory, C6xd c6xd) {
        11T.A0F(blueServiceOperationFactory, 1);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = C01g.A00(C03i.A02, new 83A(blueServiceOperationFactory, c6xd, 45));
    }

    @Override // X.C6ws
    public ListenableFuture AUS(Bundle bundle) {
        11T.A0F(bundle, 0);
        return 2FP.A02(new Imj(this.A02, this.A01), ((C6ws) this.A00.getValue()).AUS(bundle), 1JU.A01);
    }

    @Override // X.C6wv
    public /* bridge */ /* synthetic */ void Cdm(Object obj) {
    }

    @Override // X.C6wv
    public /* bridge */ /* synthetic */ void add(Object obj) {
        11T.A0F(obj, 0);
        ((C6wv) this.A00.getValue()).add(obj);
    }
}
