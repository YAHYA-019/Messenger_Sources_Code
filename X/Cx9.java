package X;

import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.history.DeletionFlowFragment;
import com.facebook.messaging.invites.CombinedInviteFriendsActivity;
import com.facebook.messaging.settings.mesettings.surface.MessengerMePreferenceActivity;
import com.facebook.messaging.storagemanagement.threadmanager.fragment.ThreadManagerSeeAllFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cx9.class */
public final class Cx9 implements C1t1 {
    public final int A00;
    public final Object A01;

    public Cx9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [androidx.fragment.app.Fragment, com.facebook.messaging.storagemanagement.threadmanager.fragment.ThreadManagerSeeAllFragment] */
    /* JADX WARN: Type inference failed for: r0v56, types: [androidx.fragment.app.Fragment, com.facebook.messaging.history.DeletionFlowFragment] */
    @Override // X.C1t1
    public void CIs() {
        switch (this.A00) {
            case 0:
                BKV bkv = (BKV) this.A01;
                MigColorScheme A0j = 7zS.A0j(bkv);
                if (11T.A0O(bkv.A03, A0j)) {
                    return;
                }
                bkv.A03 = A0j;
                BKV.A05(bkv);
                return;
            case 1:
                AmK amK = (AmK) this.A01;
                amK.A0G = AbK.A0h(amK);
                AmK.A0A(amK);
                return;
            case 2:
                ?? r0 = (DeletionFlowFragment) this.A01;
                MigColorScheme A0j2 = 7zS.A0j((Fragment) r0);
                MigColorScheme migColorScheme = r0.A07;
                if (migColorScheme != null) {
                    if (migColorScheme.equals(A0j2)) {
                        return;
                    }
                    r0.A07 = A0j2;
                    DeletionFlowFragment.A06(r0);
                    return;
                }
                break;
            case 3:
                CombinedInviteFriendsActivity.A15((CombinedInviteFriendsActivity) this.A01);
                return;
            case 4:
                MessengerMePreferenceActivity messengerMePreferenceActivity = (MessengerMePreferenceActivity) this.A01;
                MigColorScheme A0d = AbI.A0d(messengerMePreferenceActivity);
                C00i c00i = messengerMePreferenceActivity.A02;
                c00i.getClass();
                c00i.get();
                AlW.A06(messengerMePreferenceActivity.A03);
                MessengerMePreferenceActivity.A12(messengerMePreferenceActivity, A0d);
                MigColorScheme.A00(messengerMePreferenceActivity.A04, A0d);
                return;
            case 5:
                ?? r02 = (ThreadManagerSeeAllFragment) this.A01;
                MigColorScheme A0j3 = 7zS.A0j((Fragment) r02);
                MigColorScheme migColorScheme2 = r02.A04;
                if (migColorScheme2 != null) {
                    if (migColorScheme2.equals(A0j3)) {
                        return;
                    }
                    r02.A04 = A0j3;
                    ThreadManagerSeeAllFragment.A03(r02);
                    return;
                }
                break;
            default:
                AmD amD = (AmD) this.A01;
                CallerContext callerContext = AmD.A0V;
                MigColorScheme A0j4 = 7zS.A0j(amD);
                MigColorScheme migColorScheme3 = amD.A0B;
                if (migColorScheme3 != null) {
                    if (migColorScheme3.equals(A0j4)) {
                        return;
                    }
                    amD.A0B = A0j4;
                    AmD.A07(amD);
                    return;
                }
                break;
        }
        11T.A0L("colorScheme");
        throw 0Q8.createAndThrow();
    }
}
