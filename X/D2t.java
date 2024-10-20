package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.impl.profilecard.ProfileCardFragment;
import com.facebook.messaging.rtc.incall.impl.profilecard.ProfileCardUserInfo;
import com.google.common.base.Function;

/* loaded from: D2t.class */
public final class D2t implements Function {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ C5S A02;
    public final /* synthetic */ boolean A03;

    public D2t(Context context, FbUserSession fbUserSession, C5S c5s, boolean z) {
        this.A02 = c5s;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A03 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.fragment.app.Fragment, com.facebook.messaging.rtc.incall.impl.profilecard.ProfileCardFragment] */
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        ProfileCardUserInfo profileCardUserInfo = (ProfileCardUserInfo) obj;
        if (profileCardUserInfo == null) {
            4zI.A03.A08("ProfileCardLauncher", "Failed to fetch user info, not showing profile card", AnonymousClass001.A1Z());
        } else {
            C5S c5s = this.A02;
            1Br.A0C(c5s.A03);
            FbUserSession fbUserSession = this.A01;
            Context context = this.A00;
            boolean z = this.A03;
            FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass016.A00(context, FragmentActivity.class);
            if (fragmentActivity != null) {
                06Z BDe = fragmentActivity.BDe();
                11T.A0A(BDe);
                0D2 A0b = BDe.A0b("ProfileCardFragment");
                if (A0b != null) {
                    A0b.A0p();
                }
                QoL qoL = z ? QoL.A03 : QoL.A02;
                ?? profileCardFragment = new ProfileCardFragment();
                profileCardFragment.setArguments(0PK.A00(7zO.A1b("style", qoL, 1BK.A1G("user_info", profileCardUserInfo))));
                BDe.A1O(new CZn(fbUserSession, (ProfileCardFragment) profileCardFragment, c5s, profileCardUserInfo), fragmentActivity, 7zK.A00(404));
                C06c A0G = 7zL.A0G(BDe);
                A0G.A0O(profileCardFragment, "ProfileCardFragment");
                C06c.A00(A0G, true);
            }
        }
        return 04S.A00;
    }
}
