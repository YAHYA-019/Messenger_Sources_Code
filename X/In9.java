package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: In9.class */
public final class In9 implements 2eF {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ Hu2 A02;
    public final /* synthetic */ MediaResource A03;
    public final /* synthetic */ boolean A04;

    public In9(FbUserSession fbUserSession, ThreadKey threadKey, Hu2 hu2, MediaResource mediaResource, boolean z) {
        this.A02 = hu2;
        this.A00 = fbUserSession;
        this.A03 = mediaResource;
        this.A01 = threadKey;
        this.A04 = z;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Hu2 hu2 = this.A02;
        FbUserSession fbUserSession = this.A00;
        MediaResource mediaResource = this.A03;
        return hu2.A02(fbUserSession, this.A01, (MediaResource) obj, mediaResource, this.A04);
    }
}
