package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: AI4.class */
public final class AI4 implements 0zU {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ C6yx A03;
    public final /* synthetic */ C5j5 A04;
    public final /* synthetic */ MigColorScheme A05;
    public final /* synthetic */ C79j A06;

    public AI4(FbUserSession fbUserSession, 1Iw r303, ThreadKey threadKey, C6yx c6yx, C5j5 c5j5, MigColorScheme migColorScheme, C79j c79j) {
        this.A03 = c6yx;
        this.A01 = r303;
        this.A02 = threadKey;
        this.A00 = fbUserSession;
        this.A05 = migColorScheme;
        this.A06 = c79j;
        this.A04 = c5j5;
    }

    public /* bridge */ /* synthetic */ Object emit(Object obj, 0DR r303) {
        8Lu r0 = (8Lu) obj;
        C6yx c6yx = this.A03;
        1Iw r02 = this.A01;
        ThreadKey threadKey = this.A02;
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A05;
        List list = (List) r0.A00;
        Integer num = (Integer) r0.A01;
        C6yx.A03(fbUserSession, r02, threadKey, c6yx, this.A04, migColorScheme, this.A06, num, list);
        return 04S.A00;
    }
}
