package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: G67.class */
public final class G67 implements Runnable {
    public static final String __redex_internal_original_name = "MsgBloksActionLauncher$launchActionTemp$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ EhE A02;
    public final /* synthetic */ ETW A03;
    public final /* synthetic */ F8z A04;
    public final /* synthetic */ DqI A05;
    public final /* synthetic */ java.util.Map A06;

    public G67(Context context, FbUserSession fbUserSession, EhE ehE, ETW etw, F8z f8z, DqI dqI, java.util.Map map) {
        this.A02 = ehE;
        this.A04 = f8z;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A05 = dqI;
        this.A06 = map;
        this.A03 = etw;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? A0j = 4YU.A0j();
        EhE ehE = this.A02;
        if (ehE != null) {
            ehE.A00.add(new FzW((SettableFuture) A0j));
        }
        F8z f8z = this.A04;
        FbUserSession fbUserSession = this.A01;
        Context context = this.A00;
        F8z.A00(context, fbUserSession, f8z, this.A05, A0j);
        1Br.A0D(f8z.A03, new FwH(1, context, ehE, this.A03, this.A06), (ListenableFuture) A0j);
    }
}
