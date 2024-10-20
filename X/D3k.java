package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;

/* loaded from: D3k.class */
public final class D3k implements 2eF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public D3k(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                List list = (List) obj;
                if (list == null || !1BK.A1Y(list)) {
                    str = "There is no active FB session";
                } else {
                    String str2 = ((C67e) list.get(0)).A00.A02.A02;
                    11T.A0A(str2);
                    CBu cBu = (CBu) this.A02;
                    Integer num = (Integer) this.A01;
                    String str3 = this.A03;
                    long parseLong = Long.parseLong(str3);
                    long parseLong2 = Long.parseLong(str2);
                    11T.A0F(num, 0);
                    CBu.A00(cBu, num, Long.valueOf(parseLong), Long.valueOf(parseLong2), "msgr_eligibility_check_fb_active_user");
                    if (!str2.equals(str3)) {
                        0fH.A0j("AutoLoginUtil", "Different user are logged in");
                        CBu.A00(cBu, num, Long.valueOf(Long.parseLong(str3)), Long.valueOf(Long.parseLong(str2)), "msgr_eligibility_check_fb_msgr_different_account");
                        return C3o5.A0J(str2);
                    }
                    str = "Same user is logged in";
                }
                0fH.A0j("AutoLoginUtil", str);
                return C3o5.A0J("");
            case 1:
                return ((6Ro) this.A01).A04(((MediaResource) obj).A0E, (CallerContext) this.A02, this.A03);
            case 2:
                IXv iXv = (JNm) obj;
                if (iXv == null) {
                    return new 7hZ(AnonymousClass001.A0N("Cannot update state sync topic for an ended ConferenceCall"));
                }
                String str4 = this.A03;
                Optional optional = (Optional) this.A01;
                11T.A0F(optional, 1);
                iXv.A00.D84(optional, str4, false);
                ListenableFuture listenableFuture = 1hM.A01;
                11T.A0A(listenableFuture);
                return listenableFuture;
            default:
                C5S c5s = (C5S) this.A02;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                String str5 = this.A03;
                ?? A0j = 4YU.A0j();
                C1qM cxR = new CxR(fbUserSession, c5s, (SettableFuture) A0j, str5);
                1BY r0 = c5s.A01.A00;
                C21N c21n = (C21N) 1Lm.A07(fbUserSession, r0, 33124);
                c21n.A00(cxR);
                MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A07(fbUserSession, r0, 33192);
                long parseLong3 = Long.parseLong(str5);
                PrivacyContext A00 = AbJ.A0p(c5s.A02).A00("3527223753976444");
                Czg A002 = Czg.A00(c21n, A0j, cxR, 24);
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A002);
                1Um.A02(AQV, new Czh(33, parseLong3, A00, mailboxFeature, A0Q), A0Q, false);
                return 2FP.A02(D3J.A01(obj, 34), (ListenableFuture) A0j, 4YV.A11(c5s.A04));
        }
    }
}
