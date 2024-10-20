package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3i.class */
public final class D3i implements 2eF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public D3i(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        5HZ r307;
        int i = this.A00;
        MediaResource mediaResource = (MediaResource) this.A03;
        boolean A01 = C6kg.A01(mediaResource);
        switch (i) {
            case 0:
                if (A01) {
                    r307 = ((5Hv) this.A01).A0I;
                    r307.A08((FbUserSession) this.A02, mediaResource, 0S2.A0C);
                    return r307.A05(mediaResource);
                }
                return 1hM.A01;
            case 1:
                if (A01) {
                    r307 = (5HZ) this.A01;
                    r307.A08((FbUserSession) this.A02, mediaResource, 0S2.A0C);
                    return r307.A05(mediaResource);
                }
                return 1hM.A01;
            default:
                if (A01) {
                    C00i c00i = ((5Ht) this.A01).A0G;
                    ((5HZ) c00i.get()).A08((FbUserSession) this.A02, mediaResource, 0S2.A0C);
                    r307 = (5HZ) c00i.get();
                    return r307.A05(mediaResource);
                }
                return 1hM.A01;
        }
    }
}
