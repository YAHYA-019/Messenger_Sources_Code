package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9ft, reason: invalid class name */
/* loaded from: 9ft.class */
public final class C9ft {
    public final C6ku A00;
    public final 1Br A01;
    public final 16K A02;
    public final C11i A03;
    public final 1De A04;

    /* JADX WARN: Type inference failed for: r0v17, types: [X.6ku, com.facebook.msys.mca.MailboxFeature] */
    public C9ft(FbUserSession fbUserSession, 1De r303) {
        boolean A1Z = 7zP.A1Z(fbUserSession);
        this.A04 = r303;
        this.A01 = 7zL.A0S(fbUserSession, r303, 16686);
        Integer num = 0S2.A00;
        0KW A00 = 0KV.A00(num, 0, 0);
        this.A02 = A00;
        this.A03 = A00;
        C1qL c1qL = C6ku.A00;
        this.A00 = new MailboxFeature((1Uj) 1Br.A0B(this.A01));
        0N2.A03(2Zy.A01(2Zo.A02(num)), new C0oe((Function2) new AJW(this, null, 22), (0zV) new AHu(4ZG.A00((1Uj) 1Br.A0B(this.A01), 02H.A02(new String[]{"avatars_details_config", "avatar_artifacts"})), A1Z ? 1 : 0), 3));
    }

    public static final Object A00(1X9 r301, long j) {
        try {
            return r301.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            0fH.A0u("AvatarDetailMsys", "Error on Avatar Detail Msys", e);
            return null;
        }
    }
}
