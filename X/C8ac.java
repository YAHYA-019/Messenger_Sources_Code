package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8ac, reason: invalid class name */
/* loaded from: 8ac.class */
public final class C8ac extends 1LH {
    public final FbUserSession A00;
    public final 8An A01;
    public final 6Rz A02;
    public final ThreadSummary A03;
    public final MigColorScheme A04;

    public C8ac(FbUserSession fbUserSession, 8An r303, 6Rz r304, ThreadSummary threadSummary, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A04 = migColorScheme;
        this.A02 = r304;
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A03 = threadSummary;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Function1 A01 = 4FN.A01(c2k5, new DD4(this, 48));
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A07, 7zQ.A0B());
        int BDl = this.A04.BDl();
        Integer num = 0S2.A00;
        2lO A0Z = 7zQ.A0Z(4YV.A0L(A0K, num, 7zL.A0j(BDl), 1), num, A01);
        long A08 = 7zP.A08();
        2NI r02 = C8nc.A0O;
        1Iw r03 = c2k5.A05;
        C02A c02a = r03.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A00 = C9sn.A00(r03);
        ImmutableList immutableList = this.A02.A00;
        11T.A0I(immutableList, "null cannot be cast to non-null type kotlin.collections.Iterable<com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem>");
        C9sn.A02(A00, immutableList, this, ASG.A00, 3);
        return new C8ej(r02, null, null, A0Z, null, C9mj.A01(r03, c1j8, 7zN.A03(c2k5, A08), z), A00.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
    }
}
