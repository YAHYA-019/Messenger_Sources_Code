package X;

import com.facebook.messaging.integrity.frx.proactivewarning.model.ProactiveWarningInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9rv, reason: invalid class name */
/* loaded from: 9rv.class */
public final class C9rv implements C2mq {
    public final ProactiveWarningInfo A00;
    public final ThreadKey A01;

    public C9rv(ProactiveWarningInfo proactiveWarningInfo, ThreadKey threadKey) {
        this.A00 = proactiveWarningInfo;
        this.A01 = threadKey;
    }

    @Override // X.C2mq
    public int AU8() {
        return 28;
    }
}
