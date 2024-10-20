package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Objects;

/* loaded from: D44.class */
public final class D44 implements 1K9 {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C6p5 A01;

    public D44(FbUserSession fbUserSession, C6p5 c6p5) {
        this.A01 = c6p5;
        this.A00 = fbUserSession;
    }

    public void onFailure(Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        OperationResult operationResult = (OperationResult) obj;
        String str = null;
        if (operationResult != null) {
            str = operationResult.resultDataString;
        }
        if (!Objects.equal(str, "ephemeral_media_view_state_updated") || operationResult == null) {
            return;
        }
        Object A0A = operationResult.A0A("thread_key");
        if (A0A == null) {
            throw new DBv();
        }
        ThreadKey threadKey = (ThreadKey) A0A;
        if (threadKey != null) {
            ((1Uv) 1Br.A0B(this.A01.A01)).A0A(this.A00, threadKey, AnonymousClass001.A0Y(this));
        }
    }
}
