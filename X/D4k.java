package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.rtc.launch.CallStartOutcome;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: D4k.class */
public final class D4k implements 1K9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ B9r A03;
    public final /* synthetic */ C5V0 A04;
    public final /* synthetic */ ImmutableList A05;
    public final /* synthetic */ SettableFuture A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public D4k(Context context, FbUserSession fbUserSession, ThreadKey threadKey, B9r b9r, C5V0 c5v0, ImmutableList immutableList, SettableFuture settableFuture, String str, boolean z) {
        this.A03 = b9r;
        this.A02 = threadKey;
        this.A05 = immutableList;
        this.A06 = settableFuture;
        this.A08 = z;
        this.A07 = str;
        this.A00 = context;
        this.A04 = c5v0;
        this.A01 = fbUserSession;
    }

    public void onFailure(Throwable th) {
        0fH.A0s(B9r.__redex_internal_original_name, "Failed to create call", th);
        this.A06.set(new CallStartOutcome(H9h.A02, null));
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ThreadKey threadKey = this.A02;
        ImmutableList immutableList = this.A05;
        0fH.A0a(obj, threadKey, 1BK.A0k(immutableList), B9r.__redex_internal_original_name, "Starting e2ee group call %d %s %d");
        if (obj == null) {
            this.A06.set(new CallStartOutcome(H9h.A02, null));
            return;
        }
        boolean z = this.A08;
        String obj2 = obj.toString();
        String str = this.A07;
        C9b bHk = new BHk(threadKey, immutableList, obj2, "stella_call", (String) null, "stella", str, z, false, false);
        Context context = this.A00;
        RhC.A01(str).A04();
        this.A06.setFuture(this.A04.A0B(context, this.A01, bHk));
    }
}
