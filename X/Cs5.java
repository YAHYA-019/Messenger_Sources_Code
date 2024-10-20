package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;

/* loaded from: Cs5.class */
public final class Cs5 implements DIn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ Cr4 A05;
    public final /* synthetic */ BP5 A06;
    public final /* synthetic */ DK4 A07;
    public final /* synthetic */ AcX A08;

    public Cs5(View view, Cr4 cr4, BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4) {
        this.A05 = cr4;
        this.A08 = acX;
        this.A07 = dk4;
        this.A06 = bp5;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A04 = view;
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
        C38 c38 = new C38(this, user);
        AcQ acQ = this.A05.A00;
        Bh1 bh1 = (Bh1) acQ.A10.get();
        06Z r0 = acQ.mFragmentManager;
        Context context = acQ.getContext();
        View view = this.A04;
        BL2 bl2 = acQ.A0R;
        DK4 dk4 = this.A07;
        FbUserSession fbUserSession = acQ.A05;
        if (context != null) {
            bh1.A00.get();
            CbQ cbQ = new CbQ(context, r0, (C0f) null);
            MigColorScheme A0c = 7zR.A0c(context);
            String str = dk4 == EnumC1297Ada.A0o ? "universal_search_people_you_may_know_long_click" : user.A0B() ? "universal_search_contact_long_click" : "universal_search_noncontact_long_click";
            7zP.A1L(user, 0, fbUserSession);
            CbQ.A00(view, 3Ea.A03, fbUserSession, cbQ, (2UP) null, (MontageBucketPreview) null, c38, bl2, A0c, (RichStatus) null, user, str, -1);
        }
    }
}
