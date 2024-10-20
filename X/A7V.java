package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.lockchat.auth.AuthLockChatState;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A7V.class */
public final class A7V implements 1Vf {
    public final LifecycleOwner A00;
    public final 1Br A01 = 1Bq.A00(16616);
    public final 1Br A02 = 1Bq.A00(83479);
    public final ThreadKey A03;
    public final Context A04;

    public A7V(Context context, LifecycleOwner lifecycleOwner, ThreadKey threadKey) {
        this.A04 = context;
        this.A03 = threadKey;
        this.A00 = lifecycleOwner;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnViewCreated")) {
            Activity A09 = ((1Od) 1Br.A0B(this.A01)).A09();
            if (A09 != null) {
                C9qn.A00(this.A00, ((C5xl) 1Bi.A03(67528)).ASY(this.A03), A09, this, 13);
                return;
            }
            return;
        }
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
            throw 4YV.A0f(str);
        }
        Activity A092 = ((1Od) 1Br.A0B(this.A01)).A09();
        if (A092 != null) {
            3Gs.A00(A092, 1BK.A0d());
            AuthLockChatState authLockChatState = (AuthLockChatState) 1Br.A0B(this.A02);
            authLockChatState.A02.set(1xS.A04);
        }
    }
}
