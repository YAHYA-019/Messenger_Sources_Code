package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3n.class */
public final class D3n implements 2eF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ B9j A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public D3n(Context context, FbUserSession fbUserSession, B9j b9j, String str, boolean z, boolean z2) {
        this.A02 = b9j;
        this.A03 = str;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A04 = z;
        this.A05 = z2;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        0fH.A0h(String.valueOf(obj), "SendMessageRequestHandler", "Mqtt wake result: %s");
        String str = this.A03;
        ThreadKey A0j = AbG.A0j(str);
        if (A0j != null) {
            0fH.A0l("SendMessageRequestHandler", "ThreadKey was sent with request. Skipping thread key resolution");
            return C3o5.A0J(A0j);
        }
        0fH.A0g(str, "SendMessageRequestHandler", "ThreadKey not found. Attempting to look up thread key from recipient id: %s");
        return ((CbW) 1Lo.A04(this.A00, this.A01, (1BY) null, 83487)).A04(str, this.A04, this.A05);
    }
}
