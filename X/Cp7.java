package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.facebook.messaging.rtc.incall.impl.profilecard.ProfileCardFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: Cp7.class */
public final class Cp7 implements 2Qn {
    public final int A00;
    public final Object A01;

    public Cp7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CBi() {
        Dialog dialog;
        JZj jZj;
        switch (this.A00) {
            case 0:
                B7b b7b = (B7b) this.A01;
                b7b.A02.postValue(Boolean.valueOf(B7b.A01(b7b)));
                return;
            case 1:
                LobbyRootView lobbyRootView = (LobbyRootView) this.A01;
                if (!((2Qa) 1Br.A0B(lobbyRootView.A0M)).A05() || (dialog = ((By3) 1Br.A0B(lobbyRootView.A0N)).A00) == null) {
                    return;
                }
                dialog.dismiss();
                return;
            case 2:
                ProfileCardFragment profileCardFragment = (ProfileCardFragment) this.A01;
                94S r0 = MigBottomSheetDialogFragment.A01;
                2Qa r02 = profileCardFragment.A00;
                if (r02 == null || !r02.A05()) {
                    return;
                }
                profileCardFragment.A0p();
                return;
            default:
                COZ coz = (COZ) this.A01;
                1BY r03 = coz.A01;
                if (!((2Qa) 1Lo.A04((Context) null, 1Fw.A05(r03), r03, 33089)).A05() || (jZj = coz.A00) == null) {
                    return;
                }
                jZj.dismiss();
                coz.A00 = null;
                return;
        }
    }
}
