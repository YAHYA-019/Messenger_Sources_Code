package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;

/* loaded from: Cux.class */
public final class Cux implements 6iP {
    public MessageDeepLinkInfo A00;
    public boolean A01;
    public int A02;
    public ThreadKey A03;
    public String A04;
    public boolean A05;
    public final FbUserSession A06;
    public final 1De A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final C01i A0B = C01g.A00(C03i.A02, new DCy(this, 7));

    public Cux(FbUserSession fbUserSession, 1De r303) {
        this.A07 = r303;
        this.A06 = fbUserSession;
        1BY r0 = r303.A00;
        this.A0A = 1Bu.A03(r0, 84538);
        this.A09 = 1Lm.A03(fbUserSession, r0, 83581);
        this.A08 = AbG.A0M();
        this.A02 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0192, code lost:
    
        if (r316 < 10000000000000L) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x012b, code lost:
    
        if (r316 < 10000000000000L) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Cux r301, java.lang.String r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cux.A00(X.Cux, java.lang.String, boolean):void");
    }

    private final void A01(String str, String str2, int i, boolean z) {
        Byg byg = new Byg();
        byg.A05 = BKp.A01;
        ThreadKey threadKey = this.A03;
        if (threadKey == null) {
            throw 1BK.A0h();
        }
        byg.A04 = threadKey;
        byg.A0B = true;
        byg.A00 = i;
        byg.A03 = CallerContext.A0D("SyncPrimaryDataSource", str);
        byg.A07 = str2;
        byg.A08 = this.A04;
        byg.A0A = z;
        ((Cc8) 7zM.A1B(this.A0B)).A0J(new CHi(byg));
    }

    public void AMQ(MessageDeepLinkInfo messageDeepLinkInfo, String str, boolean z) {
        this.A00 = messageDeepLinkInfo;
        A01(str, messageDeepLinkInfo.A02, 20, z);
    }

    public void BYq(String str) {
        A01(str, null, 20, true);
    }

    public void BYr(String str) {
        BYs(str, 20);
    }

    public void BYs(String str, int i) {
        A01(str, null, i, false);
    }

    public /* synthetic */ void CQG() {
    }

    public /* synthetic */ void CQY() {
    }

    public void Ctu(int i) {
        this.A02 = i;
    }

    public void D3N(ThreadKey threadKey, 6iS r303, MessageDeepLinkInfo messageDeepLinkInfo, String str) {
        ThreadKey threadKey2 = this.A03;
        if (threadKey2 != null && !threadKey2.equals(threadKey)) {
            throw 1BK.A0g();
        }
        this.A03 = threadKey;
        this.A00 = messageDeepLinkInfo;
        this.A04 = str;
        ((Cc8) 7zM.A1B(this.A0B)).CmR(new Cbv(this, r303, 7));
        C00i c00i = this.A0A.A00;
        ((Bxn) c00i.get()).A03 = new D0u(this);
        this.A05 = true;
        this.A01 = false;
        Bxn bxn = (Bxn) c00i.get();
        bxn.A02 = threadKey;
        bxn.A04 = ThreadKey.A0L(threadKey);
        ((Bxn) c00i.get()).A00.A00();
        A00(this, "thread_visible", false);
    }

    public void D6B(String str) {
        if (this.A00 != null) {
            this.A00 = null;
            if (this.A05) {
                ((Cc8) 7zM.A1B(this.A0B)).AEC();
                A00(this, str, true);
            }
        }
    }

    public void D6F() {
        this.A04 = null;
        this.A05 = false;
        this.A01 = false;
        ((Bxn) 1Br.A0B(this.A0A)).A00.A01();
        ((Cc8) 7zM.A1B(this.A0B)).AEC();
    }
}
