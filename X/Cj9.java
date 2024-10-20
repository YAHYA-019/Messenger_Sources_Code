package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.model.MemberRequestApprovalSetting;
import com.facebook.messaging.communitymessaging.plugins.memberrequest.memberrequestheader.MemberRequestHeaderImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cj9.class */
public final class Cj9 implements DI1 {
    public final /* synthetic */ MemberRequestHeaderImplementation A00;

    public Cj9(MemberRequestHeaderImplementation memberRequestHeaderImplementation) {
        this.A00 = memberRequestHeaderImplementation;
    }

    @Override // X.DI1
    public void Biq(C2lh c2lh) {
        MemberRequestHeaderImplementation memberRequestHeaderImplementation = this.A00;
        MemberRequestApprovalSetting memberRequestApprovalSetting = 7zP.A1V(c2lh) ? MemberRequestApprovalSetting.A04 : MemberRequestApprovalSetting.A03;
        CIy cIy = (CIy) 1Br.A0B(memberRequestHeaderImplementation.A03);
        CommunityExtraData communityExtraData = memberRequestHeaderImplementation.A06;
        cIy.A01(new CjD(c2lh, memberRequestHeaderImplementation, 0), memberRequestApprovalSetting, AbG.A02(communityExtraData), communityExtraData.A00);
    }

    @Override // X.DI1
    public void C6Q() {
    }

    @Override // X.DI1
    public void D08() {
        AbR abR = (AbR) 1Bn.A0A(84760);
        MemberRequestHeaderImplementation memberRequestHeaderImplementation = this.A00;
        Context context = memberRequestHeaderImplementation.A00;
        Fragment fragment = memberRequestHeaderImplementation.A01;
        MigColorScheme migColorScheme = memberRequestHeaderImplementation.A07;
        FbUserSession fbUserSession = memberRequestHeaderImplementation.A02;
        CommunityExtraData communityExtraData = memberRequestHeaderImplementation.A06;
        long j = communityExtraData.A00;
        String str = communityExtraData.A06;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            CHW chw = new CHW(context, fragment, fbUserSession, migColorScheme, str, j);
            1Bn.A0K();
            FbInjector.A04(A01);
            chw.A01();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
