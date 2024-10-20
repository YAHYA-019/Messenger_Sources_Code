package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: D9f.class */
public final class D9f implements Runnable {
    public static final String __redex_internal_original_name = "PageAudioCallCTAHandler$invoke$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 1Br A02;
    public final /* synthetic */ Message A03;

    public D9f(View view, FbUserSession fbUserSession, 1Br r304, Message message) {
        this.A01 = fbUserSession;
        this.A00 = view;
        this.A03 = message;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CFs cFs = (CFs) 1Br.A0B(this.A02);
        FbUserSession fbUserSession = this.A01;
        Context A08 = 4YU.A08(this.A00);
        Message message = this.A03;
        cFs.A01(A08, fbUserSession, message, message != null ? message.A0V : null);
    }
}
