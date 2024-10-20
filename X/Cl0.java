package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Cl0.class */
public final class Cl0 implements Aab {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AmF A01;
    public final /* synthetic */ ThreadSummary A02;

    public Cl0(Context context, AmF amF, ThreadSummary threadSummary) {
        this.A01 = amF;
        this.A00 = context;
        this.A02 = threadSummary;
    }

    @Override // X.Aab
    public void Bri(View view, String str) {
        if (str != null) {
            Context context = this.A00;
            AmF amF = this.A01;
            CQN.A03(context, view, 7zQ.A0m(amF.A05), str);
            9lB r0 = (9lB) 1Br.A0B(amF.A09);
            ThreadKey threadKey = amF.A03;
            if (threadKey == null) {
                AbM.A17();
                throw 0Q8.createAndThrow();
            }
            Long A14 = AbF.A14(threadKey);
            1UG A08 = 1BK.A08(1Br.A02(r0.A00), 1BJ.A00(1466));
            if (A08.isSampled()) {
                if (A14 != null) {
                    7zL.A1F(A08, A14.toString());
                }
                A08.BZL();
            }
        }
    }

    @Override // X.Aab
    public void CF3(String str) {
    }

    @Override // X.Aab
    public void CHB() {
        AmF amF = this.A01;
        if (1Br.A07(((BjQ) 1Br.A0B(amF.A0B)).A00).AZk(36321443206152548L) || ((1Ew) 1Br.A0B(amF.A08)).AXy() == 0S2.A0C) {
            FbUserSession fbUserSession = amF.A00;
            if (fbUserSession != null) {
                MailboxFeature mailboxFeature = (MailboxFeature) 7zN.A0m(amF, fbUserSession, 68503);
                ThreadKey threadKey = amF.A03;
                if (threadKey != null) {
                    long j = threadKey.A04;
                    PrivacyContext A00 = AbJ.A0p(amF.A0C).A00("303646520704038");
                    1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV);
                    1Um.A02(AQV, new Czh(21, j, A00, mailboxFeature, A0P), A0P, false);
                    return;
                }
                11T.A0L("threadKey");
            }
            11T.A0L("fbUserSession");
        } else {
            Be9 be9 = (Be9) 1Br.A0B(amF.A07);
            FbUserSession fbUserSession2 = amF.A00;
            if (fbUserSession2 != null) {
                ThreadKey threadKey2 = amF.A03;
                if (threadKey2 != null) {
                    07S A0J = 4YU.A0J(GraphQlCallInput.A02, 1BK.A0w(threadKey2), "thread_fbid");
                    AbstractC05414dq A04 = 1VX.A04(be9.A00, fbUserSession2);
                    GraphQlQueryParamSet A0M = 7zL.A0M();
                    4YV.A1A(A0J, A0M, "data");
                    5Dh A002 = 5Dh.A00(A0M, new C01643sd(Q83.class, "ResetLinkMutation", null, "data", "fbandroid", 1056646838, 128, 2743827358L, 2743827358L, false, true));
                    4YU.A1J(A002, 303646520704038L);
                    A04.A06(A002);
                    return;
                }
                11T.A0L("threadKey");
            }
            11T.A0L("fbUserSession");
        }
        throw 0Q8.createAndThrow();
    }

    @Override // X.Aab
    public void CKO(String str) {
        String str2;
        if (str != null) {
            AmF amF = this.A01;
            9lB r0 = (9lB) 1Br.A0B(amF.A09);
            ThreadKey threadKey = amF.A03;
            if (threadKey == null) {
                str2 = "threadKey";
            } else {
                Long A14 = AbF.A14(threadKey);
                1UG A08 = 1BK.A08(1Br.A02(r0.A00), 1BJ.A00(1468));
                if (A08.isSampled()) {
                    if (A14 != null) {
                        7zL.A1F(A08, A14.toString());
                    }
                    A08.BZL();
                }
                Context context = this.A00;
                ThreadSummary threadSummary = this.A02;
                C96j c96j = ThreadKey.A0a(AbJ.A0S(threadSummary)) ? C96j.A02 : 2oI.A07(threadSummary) ? C96j.A06 : 2oI.A06(threadSummary) ? C96j.A05 : C96j.A07;
                FbUserSession fbUserSession = amF.A00;
                if (fbUserSession != null) {
                    5Xv A02 = ((5Xu) 1Lm.A05(context, fbUserSession, 49772)).A02(threadSummary);
                    if (A02 == null) {
                        throw 1BK.A0h();
                    }
                    5Ws r02 = (5Ws) 7zR.A0o(context, 49761);
                    String str3 = A02.A03;
                    if (str3 == null) {
                        str3 = r02.A01(A02.A02);
                        11T.A0A(str3);
                    }
                    CQN.A01(context, threadSummary.A0V, c96j, threadSummary.A0n, 4YV.A0j(), str, str3, "thread_settings", "invite_link_settings", (String) null, (String) null, (String) null, false, false);
                    return;
                }
                str2 = "fbUserSession";
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.Aab
    public void CLD(String str) {
        if (str != null) {
            AmF amF = this.A01;
            9lB r0 = (9lB) 1Br.A0B(amF.A09);
            ThreadKey threadKey = amF.A03;
            if (threadKey == null) {
                AbM.A17();
                throw 0Q8.createAndThrow();
            }
            Long A14 = AbF.A14(threadKey);
            1UG A08 = 1BK.A08(1Br.A02(r0.A00), 1BJ.A00(1469));
            if (A08.isSampled()) {
                if (A14 != null) {
                    7zL.A1F(A08, A14.toString());
                }
                A08.BZL();
            }
            CQN.A04(this.A00, str);
        }
    }

    @Override // X.Aab
    public void CQl(boolean z) {
        AmF amF = this.A01;
        if (1Br.A07(((BjQ) 1Br.A0B(amF.A0B)).A00).AZk(36321443206152548L) || ((1Ew) 1Br.A0B(amF.A08)).AXy() == 0S2.A0C) {
            FbUserSession fbUserSession = amF.A00;
            if (fbUserSession != null) {
                MailboxFeature mailboxFeature = (MailboxFeature) 7zN.A0m(amF, fbUserSession, 68503);
                ThreadKey threadKey = amF.A03;
                if (threadKey != null) {
                    long j = threadKey.A04;
                    int i = !z ? 1 : 0;
                    PrivacyContext A00 = AbJ.A0p(amF.A0C).A00("303646520704038");
                    1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV);
                    1Um.A02(AQV, new CyA(i, 2, j, mailboxFeature, A00, A0P), A0P, false);
                    return;
                }
                11T.A0L("threadKey");
            }
            11T.A0L("fbUserSession");
        } else {
            Be9 be9 = (Be9) 1Br.A0B(amF.A07);
            FbUserSession fbUserSession2 = amF.A00;
            if (fbUserSession2 != null) {
                ThreadKey threadKey2 = amF.A03;
                if (threadKey2 != null) {
                    int i2 = !z ? 1 : 0;
                    07S A0J = 4YU.A0J(GraphQlCallInput.A02, 1BK.A0w(threadKey2), "thread_fbid");
                    07S.A00(A0J, i2 != 0 ? "JOINABLE" : "PRIVATE", "mode");
                    AbstractC05414dq A04 = 1VX.A04(be9.A00, fbUserSession2);
                    GraphQlQueryParamSet A0M = 7zL.A0M();
                    4YV.A1A(A0J, A0M, "data");
                    5Dh A002 = 5Dh.A00(A0M, new C01643sd(Q81.class, "ChangeJoinableModeMutation", null, "data", "fbandroid", -1245935241, 128, 1421206870L, 1421206870L, false, true));
                    4YU.A1J(A002, 303646520704038L);
                    A04.A06(A002);
                    return;
                }
                11T.A0L("threadKey");
            }
            11T.A0L("fbUserSession");
        }
        throw 0Q8.createAndThrow();
    }
}
