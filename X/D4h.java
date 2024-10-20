package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.rtc.launch.CallStartOutcome;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;

/* loaded from: D4h.class */
public final class D4h implements 1K9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ B9r A02;
    public final /* synthetic */ CbW A03;
    public final /* synthetic */ SettableFuture A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    public D4h(Context context, FbUserSession fbUserSession, B9r b9r, CbW cbW, SettableFuture settableFuture, String str, List list, boolean z) {
        this.A02 = b9r;
        this.A04 = settableFuture;
        this.A03 = cbW;
        this.A00 = context;
        this.A06 = list;
        this.A07 = z;
        this.A05 = str;
        this.A01 = fbUserSession;
    }

    public void onFailure(Throwable th) {
        this.A04.setException(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ThreadKey threadKey = (ThreadKey) obj;
        if (threadKey == null) {
            0fH.A0n(B9r.__redex_internal_original_name, "Unable to fetch or create thread.");
            this.A04.set(new CallStartOutcome(H9h.A02, null));
        } else {
            ListenableFuture A03 = this.A03.A03(threadKey);
            1Kd.A0D(this.A02.A01, D4p.A00(threadKey, this, 72), A03);
        }
    }
}
