package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import java.util.List;

/* renamed from: X.3as, reason: invalid class name */
/* loaded from: 3as.class */
public final class C3as implements MailboxCallback {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ C3Q6 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C3as(FbUserSession fbUserSession, ThreadKey threadKey, C3Q6 c3q6, String str, List list) {
        this.A02 = c3q6;
        this.A01 = threadKey;
        this.A00 = fbUserSession;
        this.A03 = str;
        this.A04 = list;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (AnonymousClass001.A1V(obj)) {
            C3Q6 c3q6 = this.A02;
            if (c3q6.A02.get()) {
                return;
            }
            C3Q6.A00(this.A00, this.A01, c3q6, this.A03, this.A04);
        }
    }
}
