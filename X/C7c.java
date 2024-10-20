package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: C7c.class */
public final class C7c {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public C7c(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 67968);
        this.A02 = 7zM.A0R();
        this.A00 = 1Bu.A03(r0, 82461);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0178, code lost:
    
        if (r313 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a5, code lost:
    
        r309 = r313.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a2, code lost:
    
        if (r313 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams A00(com.facebook.messaging.montage.model.MontageCard r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7c.A00(com.facebook.messaging.montage.model.MontageCard, java.lang.String, java.lang.String, java.lang.String, boolean):com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams");
    }

    public final SettableFuture A01(FbUserSession fbUserSession, User user) {
        11T.A0F(fbUserSession, 0);
        1BY r0 = this.A03.A00;
        Object A0E = 1Bn.A0E((Context) null, r0, 83430);
        1Br A03 = 1Lm.A03(fbUserSession, r0, 49711);
        C75 c75 = (C75) 1Lo.A04((Context) null, fbUserSession, r0, 82162);
        C5sv c5sv = (C5sv) 1Bn.A0E((Context) null, r0, 83790);
        SettableFuture A0j = 4YU.A0j();
        1FV A00 = c75.A00(user, 1Br.A07(c5sv.A00).AZk(36316439572457570L));
        1Br.A0D(this.A02, new D4a(0, A03, A0j, user, A0E, this), A00);
        return A0j;
    }
}
