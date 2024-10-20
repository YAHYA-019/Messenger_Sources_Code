package X;

import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.messaging.sharedalbum.plugins.adminmessagecta.SharedAlbumAdminMessageCta;

/* loaded from: N8r.class */
public final class N8r implements Runnable {
    public static final String __redex_internal_original_name = "SharedAlbumAdminMessageCta$onClick$1";
    public final /* synthetic */ SharedAlbumArgs A00;
    public final /* synthetic */ SharedAlbumAdminMessageCta A01;

    public N8r(SharedAlbumArgs sharedAlbumArgs, SharedAlbumAdminMessageCta sharedAlbumAdminMessageCta) {
        this.A01 = sharedAlbumAdminMessageCta;
        this.A00 = sharedAlbumArgs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedAlbumAdminMessageCta sharedAlbumAdminMessageCta = this.A01;
        9DF.A00(sharedAlbumAdminMessageCta.A00, sharedAlbumAdminMessageCta.A01, this.A00, false, false);
    }
}
