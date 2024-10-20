package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: Cs2.class */
public final class Cs2 implements DIn {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Cqy A01;

    public Cs2(View view, Cqy cqy) {
        this.A01 = cqy;
        this.A00 = view;
    }

    @Override // X.DIn
    public void D9q(PlatformSearchGameData platformSearchGameData) {
    }

    @Override // X.DIn
    public void D9r(PlatformSearchUserData platformSearchUserData) {
    }

    @Override // X.DIn
    public void D9s(ThreadSummary threadSummary) {
    }

    @Override // X.DIn
    public void D9t(C1772As6 c1772As6) {
    }

    @Override // X.DIn
    public void D9u(MessageSearchMessageModel messageSearchMessageModel) {
    }

    @Override // X.DIn
    public void D9v(MessageSearchThreadModel messageSearchThreadModel) {
    }

    @Override // X.DIn
    public void D9x(User user) {
        Context context;
        Bdu bdu = this.A01.A00;
        View view = this.A00;
        2Ok r0 = bdu.A00;
        if (r0.A06 == null || (context = r0.getContext()) == null) {
            return;
        }
        C8y c8y = r0.A06;
        06Z parentFragmentManager = r0.getParentFragmentManager();
        C54 c54 = c8y.A00;
        if (c54.A01 == null) {
            1Bn.A0E((Context) null, c54.A00, 147604);
            c54.A01 = new CbQ(context, parentFragmentManager, c54.A04);
        }
        C8y c8y2 = r0.A06;
        MigColorScheme A11 = 7zM.A11(r0.A0D);
        String str = r0.A09;
        FbUserSession fbUserSession = r0.A02;
        fbUserSession.getClass();
        c8y2.A01(view, fbUserSession, A11, user, str);
    }
}
