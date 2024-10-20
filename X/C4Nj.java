package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.inbox.TasMetadataLoader;

/* renamed from: X.4Nj, reason: invalid class name */
/* loaded from: 4Nj.class */
public final class C4Nj implements C2nj {
    public final AnonymousClass207 A00 = C3u7.A01;
    public final /* synthetic */ TasMetadataLoader A01;

    public C4Nj(TasMetadataLoader tasMetadataLoader) {
        this.A01 = tasMetadataLoader;
    }

    @Override // X.C2nj
    public AnonymousClass207 Asi() {
        return this.A00;
    }

    @Override // X.C2nj
    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        TasMetadataLoader tasMetadataLoader = this.A01;
        Object obj = ((C02113u1) 1Lm.A05(tasMetadataLoader.A00, tasMetadataLoader.A01, 65930)).A05.get(Long.valueOf(threadSummary.A0n.A0r()));
        if (obj == null) {
            obj = "";
        }
        C4Nk[] values = C4Nk.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return null;
            }
            C4Nk c4Nk = values[i2];
            if (11T.A0O(c4Nk.key, obj)) {
                return new C3u7(c4Nk);
            }
            i = i2 + 1;
        }
    }
}
