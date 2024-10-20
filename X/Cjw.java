package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.communitymessaging.adminactions.removemessageoptions.ProfileMoreActionsBottomSheet;
import com.facebook.messaging.communitymessaging.model.MemberActionsState;
import com.facebook.messaging.communitymessaging.plugins.adminactions.admodremovemessagecta.AdmodRemoveMessageCtaImplementation;
import com.facebook.messaging.customthreads.threadsettings.nicknames.SetNicknameLiveDialogFragment;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: Cjw.class */
public final class Cjw implements 7Yx {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cjw(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void CHY(User user) {
        switch (this.A00) {
            case 0:
                if (user != null) {
                    AdmodRemoveMessageCtaImplementation admodRemoveMessageCtaImplementation = (AdmodRemoveMessageCtaImplementation) this.A02;
                    MemberActionsState memberActionsState = (MemberActionsState) this.A01;
                    94S r0 = MigBottomSheetDialogFragment.A01;
                    ThreadSummary threadSummary = admodRemoveMessageCtaImplementation.A07;
                    if (threadSummary == null) {
                        throw 1BK.A0h();
                    }
                    06Z r02 = admodRemoveMessageCtaImplementation.A01;
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user);
                    A05.putParcelable("thread_summary", threadSummary);
                    A05.putParcelable("member_action_state", memberActionsState);
                    2Ov profileMoreActionsBottomSheet = new ProfileMoreActionsBottomSheet();
                    profileMoreActionsBottomSheet.setArguments(A05);
                    profileMoreActionsBottomSheet.A0m(r02, "ProfileMoreActionsBottomSheet");
                    return;
                }
                return;
            case 1:
                if (user != null) {
                    Ck1 ck1 = (Ck1) this.A01;
                    C1527Akg c1527Akg = ck1.A02;
                    SetNicknameLiveDialogFragment A052 = SetNicknameLiveDialogFragment.A05(ck1.A04, (User) this.A02, user);
                    c1527Akg.A02 = A052;
                    A052.A0m(ck1.A00, "set_nickname");
                    return;
                }
                return;
            default:
                if (user == null) {
                    1Kh A0y = AbF.A0y();
                    A0y.A05(((UserKey) this.A02).id);
                    A0y.A1t = true;
                    user = AbF.A0w(A0y);
                }
                7zL.A1T(this.A01, user);
                return;
        }
    }
}
