package X;

import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;
import com.facebook.user.model.User;

/* loaded from: DIq.class */
public interface DIq {
    void A7J(Bhv bhv);

    void AEJ(ThreadKey threadKey);

    void CWP(ThreadKey threadKey, User user);

    void Cf9(Bhv bhv);

    void Cjk(View view, 1Kq r2, ThreadKey threadKey, ThreadSummary threadSummary, BroadcastFlowMnetItem broadcastFlowMnetItem, SendState sendState, User user, String str, boolean z, boolean z2);

    void D5d(ThreadKey threadKey);

    void D7Q(ThreadKey threadKey, SendState sendState, String str);

    void D7t(Csv csv, Csw csw);
}
