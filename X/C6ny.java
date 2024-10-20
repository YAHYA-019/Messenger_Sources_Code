package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;

/* renamed from: X.6ny, reason: invalid class name */
/* loaded from: 6ny.class */
public final class C6ny implements 1Vf {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 6Fz A06;

    public C6ny(Context context, FbUserSession fbUserSession, 6Fz r304) {
        11T.A0F(r304, 3);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A06 = r304;
        this.A04 = 1Bq.A00(16385);
        this.A03 = 1Bq.A00(65837);
        this.A05 = 1Bq.A00(16432);
        this.A02 = 1Bu.A00(65841);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
            throw 4YV.A0f(str);
        }
        OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
        11T.A0F(onThreadOpened, 0);
        ThreadKey threadKey = onThreadOpened.A00;
        if (threadKey.A1A() && ((2yD) this.A04.A00.get()).AZk(36323891336989975L)) {
            DD3 dd3 = new DD3(this, 8);
            long j = threadKey.A04;
            1QB r0 = (1QB) 1Br.A0B(this.A02);
            r0.A02(new AFo(this, dd3, j));
            r0.A03 = "GraphQL";
            r0.A04("ThreadQuery");
            r0.A00 = new C02013tp();
            ((1Qc) 1Br.A0B(this.A03)).A03(r0.A01(), "ReplaceExisting");
        }
    }
}
