package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.Ac9, reason: case insensitive filesystem */
/* loaded from: Ac9.class */
public final class RunnableC1267Ac9 implements Runnable {
    public static final String __redex_internal_original_name = "FcmPushIntentSenderClassic$sendIntent$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ C1265Ac7 A03;

    public RunnableC1267Ac9(Context context, Intent intent, FbUserSession fbUserSession, C1265Ac7 c1265Ac7) {
        this.A03 = c1265Ac7;
        this.A02 = fbUserSession;
        this.A01 = intent;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4Dx c4Dx = (C4Dx) 1Br.A0B(this.A03.A00);
        FbUserSession fbUserSession = this.A02;
        c4Dx.A03(this.A00, this.A01, fbUserSession);
    }
}
