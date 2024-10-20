package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3l.class */
public final class D3l implements 2eF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 5Ht A02;
    public final /* synthetic */ MediaResource A03;
    public final /* synthetic */ boolean A04;

    public D3l(5Ht r302, MediaResource mediaResource, long j, long j2, boolean z) {
        this.A02 = r302;
        this.A03 = mediaResource;
        this.A01 = j;
        this.A04 = z;
        this.A00 = j2;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        if (obj == Qog.A04) {
            return 1hM.A01;
        }
        5Ht r0 = this.A02;
        5HQ r02 = (5HQ) r0.A09.get();
        MediaResource mediaResource = this.A03;
        r02.A04(mediaResource, false);
        return 5Ht.A01(r0.A02, r0, mediaResource, this.A01, this.A00, this.A04);
    }
}
