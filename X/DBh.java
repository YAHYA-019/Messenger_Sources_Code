package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.customthreads.name.dialog.ThreadNameSettingDialogFragment;
import com.facebook.messaging.lockchat.auth.AuthLockChatState;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.quicksilver.views.loading.QuicksilverCardlessLoadingView;
import java.util.HashMap;

/* loaded from: DBh.class */
public final class DBh implements C00l, C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DBh(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C00m
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                ThreadNameSettingDialogFragment threadNameSettingDialogFragment = (ThreadNameSettingDialogFragment) this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                1Uv A0a = AbF.A0a(threadNameSettingDialogFragment.A09);
                ThreadKey threadKey = threadNameSettingDialogFragment.A02;
                Bundle A05 = 1BK.A05();
                A05.putSerializable("broadcast_cause", 54N.A0A);
                A0a.A09(A05, fbUserSession, threadKey, "ThreadNameSettingDialogFragment");
                threadNameSettingDialogFragment.A0p();
                return null;
            case 1:
                C1557Alb c1557Alb = (C1557Alb) this.A01;
                ThreadKey threadKey2 = (ThreadKey) this.A02;
                ((AuthLockChatState) c1557Alb.A0o.get()).A01.set(false);
                C1557Alb.A0C(threadKey2, c1557Alb);
                return null;
            default:
                QuicksilverCardlessLoadingView quicksilverCardlessLoadingView = (QuicksilverCardlessLoadingView) this.A01;
                FIT fit = (FIT) this.A02;
                if (quicksilverCardlessLoadingView.A09 != null) {
                    HashMap A0u = AnonymousClass001.A0u();
                    A0u.put(DKB.A00(520), "true");
                    fit.A0J("retry_load_button_click", A0u);
                    quicksilverCardlessLoadingView.A09.CI2();
                }
                return 04S.A00;
        }
    }
}
