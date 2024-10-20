package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharedalbum.plugins.renameadmincta.SharedAlbumRenameAdminCta;

/* loaded from: N8x.class */
public final class N8x implements Runnable {
    public static final String __redex_internal_original_name = "SharedAlbumRenameAdminCta$onClick$1$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ SharedAlbumRenameAdminCta A01;
    public final /* synthetic */ C9c5 A02;
    public final /* synthetic */ String A03;

    public N8x(View view, SharedAlbumRenameAdminCta sharedAlbumRenameAdminCta, C9c5 c9c5, String str) {
        this.A02 = c9c5;
        this.A01 = sharedAlbumRenameAdminCta;
        this.A00 = view;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9c5 c9c5 = this.A02;
        FbUserSession fbUserSession = this.A01.A01;
        Context context = this.A00.getContext();
        11T.A0A(context);
        c9c5.A00(context, fbUserSession, this.A03);
    }
}
