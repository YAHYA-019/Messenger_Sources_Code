package X;

import android.widget.ImageView;
import com.facebook.messaging.sharing.mediapreview.MediaSharePreviewPlayableView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GeZ, reason: case insensitive filesystem */
/* loaded from: GeZ.class */
public final class C2478GeZ extends 1RM {
    public final int A00;
    public final Object A01;

    public C2478GeZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x07ea, code lost:
    
        if (r0 < 10000) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x045b, code lost:
    
        if (r308 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v434, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2478GeZ.A02(java.lang.Object):void");
    }

    public void A03(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                0fH.A0r("LowLatencyClock", "Failure looking up server side clock", th);
                Hk7 hk7 = (Hk7) this.A01;
                if (hk7.A05) {
                    GOp.A1H(hk7.A08).schedule(hk7.A0A, 10000L, TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 1:
                0fH.A0k("LivingRoomPresencePoller", "Presence polling failure");
                return;
            case 2:
                11T.A0F(th, 0);
                ((JID) this.A01).onFailure(AnonymousClass001.A0U(th));
                return;
            case 3:
            case 5:
            default:
                return;
            case 4:
                0fH.A0K(H4z.class, "Failed to load recent emoji", th);
                ((H4z) this.A01).A01 = null;
                return;
            case 6:
                MediaSharePreviewPlayableView mediaSharePreviewPlayableView = (MediaSharePreviewPlayableView) this.A01;
                ImageView imageView = mediaSharePreviewPlayableView.A00;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                6cT r0 = mediaSharePreviewPlayableView.A06;
                if (r0 != null) {
                    r0.setVisibility(4);
                }
                DKG.A1J(mediaSharePreviewPlayableView.A03);
                mediaSharePreviewPlayableView.A01.setVisibility(4);
                1BK.A09(mediaSharePreviewPlayableView.A09).softReport(MediaSharePreviewPlayableView.class.getName(), "Failed to fetch media resource for playable", th);
                return;
        }
    }
}
