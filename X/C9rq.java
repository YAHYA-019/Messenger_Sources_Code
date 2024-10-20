package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.writewithai.service.WriteWithAiService;

/* renamed from: X.9rq, reason: invalid class name */
/* loaded from: 9rq.class */
public final class C9rq implements AZ9 {
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ C95n A01;
    public final /* synthetic */ WriteWithAiService A02;
    public final /* synthetic */ C2s8 A03;

    public C9rq(ThreadKey threadKey, C95n c95n, WriteWithAiService writeWithAiService, C2s8 c2s8) {
        this.A03 = c2s8;
        this.A02 = writeWithAiService;
        this.A00 = threadKey;
        this.A01 = c95n;
    }

    @Override // X.AZ9
    public void COU(RI9 ri9) {
        this.A03.resumeWith(ri9);
    }

    @Override // X.AZ9
    public void onFailure(Throwable th) {
        0fH.A0k("WriteWithAiService", 0Pz.A1B("deidentified request provider failure: ", th));
        String message = th.getMessage();
        if (message == null) {
            message = "Error deidentified request provider failure";
        }
        WriteWithAiService.A05(this.A00, this.A01, this.A02, message);
        this.A03.resumeWith(7zL.A17(th));
    }
}
