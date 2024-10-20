package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;

/* renamed from: X.795, reason: invalid class name */
/* loaded from: 795.class */
public final class AnonymousClass795 implements AnonymousClass794 {
    public final FbUserSession A00;
    public final 2Og A01;

    public AnonymousClass795(FbUserSession fbUserSession, 2Og r303) {
        11T.A0F(r303, 3);
        this.A00 = fbUserSession;
        this.A01 = r303;
    }

    @Override // X.AnonymousClass794
    public void AEu(Context context, AZk aZk, GalleryMediaItem galleryMediaItem) {
        if (!galleryMediaItem.A0B) {
            String str = galleryMediaItem.A09;
            11T.A0A(str);
            11T.A0F("image/", 1);
            if (!str.startsWith("image/")) {
                1Br A00 = 1Lm.A00(context, this.A00, 50103);
                06Z BdK = this.A01.BdK();
                if (BdK != null) {
                    ((6Sp) A00.A00.get()).A02(BdK, new 9sY(aZk), (ThreadKey) null, (Object) null, "upload_video_interstitial");
                    return;
                }
                return;
            }
        }
        aZk.Bvl();
    }
}
