package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: DA4.class */
public final class DA4 implements Runnable {
    public static final String __redex_internal_original_name = "ThreadCutoverViewOpenHelper$openThreadViewForUserInChatHeadsUseNavigationApi$1$onSuccess$1";
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ CPY A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ ThreadKey A03;
    public final /* synthetic */ String A04;

    public DA4(Bundle bundle, CPY cpy, ThreadKey threadKey, ThreadKey threadKey2, String str) {
        this.A01 = cpy;
        this.A02 = threadKey;
        this.A04 = str;
        this.A00 = bundle;
        this.A03 = threadKey2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C04464b1 c04464b1 = this.A01.A08;
        ThreadKey threadKey = this.A02;
        String str = this.A04;
        Bundle bundle = this.A00;
        Intent A00 = C04464b1.A00(c04464b1, C1xj.A0C);
        if (bundle != null) {
            A00.putExtras(bundle);
        }
        A00.putExtra(5QN.A01, threadKey);
        A00.putExtra(C1xj.A0T, str);
        C04464b1.A01(A00, c04464b1);
        ThreadKey threadKey2 = this.A03;
        if (threadKey2 != null) {
            c04464b1.A05(threadKey2, str);
        }
    }
}
