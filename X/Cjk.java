package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cjk.class */
public final class Cjk implements C5xz {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ DDz A02;
    public final /* synthetic */ DFB A03;
    public final /* synthetic */ 6Im A04;
    public final /* synthetic */ ThreadKey A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public Cjk(06Z r302, FbUserSession fbUserSession, DDz dDz, DFB dfb, 6Im r306, ThreadKey threadKey, String str, String str2, String str3) {
        this.A04 = r306;
        this.A01 = fbUserSession;
        this.A05 = threadKey;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A00 = r302;
        this.A02 = dDz;
        this.A03 = dfb;
    }

    @Override // X.C5xz
    public final void CHX(ThreadSummary threadSummary) {
        6Im r0 = this.A04;
        C5yq A00 = ((C5ym) 1De.A00(r0.A01, 68427)).A00(this.A01, threadSummary, 0S2.A00);
        if (threadSummary == null || A00 == null) {
            return;
        }
        ThreadKey threadKey = this.A05;
        String A0N = ThreadKey.A0N(threadKey);
        11T.A0A(A0N);
        r0.A05.A01(this.A00, this.A02, this.A03, 6Im.A02(A00, r0, threadKey, threadSummary, ThreadKey.A0L(threadKey), C5yl.A0L, A0N, this.A08, this.A07, this.A06));
    }
}
