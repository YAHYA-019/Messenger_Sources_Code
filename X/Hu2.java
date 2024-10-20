package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Hu2.class */
public final class Hu2 {
    public final 1Br A00 = 1Bq.A00(16431);
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1De A08;

    public Hu2(1De r302) {
        this.A08 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 115968);
        this.A06 = 1Bq.A00(67858);
        this.A07 = 1HG.A00(7zQ.A0I(r0), 65898);
        this.A04 = 1Bq.A00(84456);
        this.A05 = 7zM.A0R();
        this.A03 = 1Bu.A03(r0, 115935);
        this.A02 = 1Bq.A00(49642);
    }

    public final 2eH A00(FbUserSession fbUserSession, 2EU r303, ThreadKey threadKey, C6x4 c6x4, C5eq c5eq, C5ew c5ew, MediaResource mediaResource, MediaResourceCameraPosition mediaResourceCameraPosition, MediaResourceSendSource mediaResourceSendSource, String str, String str2, int i) {
        1BK.A1K(fbUserSession, 0, c5eq);
        2EU A07 = r303.A07();
        ListenableFuture A0A = 1Kd.A0A(r303.A09());
        Hz6 hz6 = (Hz6) 1Br.A0B(this.A01);
        C5ep c5ep = C5ep.A0R;
        11T.A0B(MediaResourceCameraPosition.A01);
        C5eq c5eq2 = C5eq.CAMERA_CORE;
        C5ew c5ew2 = C5ew.DEFAULT;
        2FT A02 = 2FP.A02(new Imc((HnB) 1Lo.A04((Context) null, fbUserSession, hz6.A00, 99907), hz6, new Hk8(null, c5eq, c5ep, c5ew, mediaResourceCameraPosition, mediaResourceSendSource, 4YV.A0u(c6x4), str2, str, i, 0)), A0A, 4YV.A11(this.A00));
        A02.addListener(new Iqo(A07), 4YV.A11(this.A05));
        return 2FP.A00(new In9(fbUserSession, threadKey, this, mediaResource, false), A02, 1JU.A01);
    }

    public final 2eH A01(FbUserSession fbUserSession, 2EU r303, ThreadKey threadKey, C6x4 c6x4, C5eq c5eq, 5HP r307, MediaResource mediaResource, MediaResource mediaResource2, MediaResourceCameraPosition mediaResourceCameraPosition, MediaResourceSendSource mediaResourceSendSource, boolean z) {
        11T.A0F(fbUserSession, 0);
        1hM r0 = new 1hM(mediaResource);
        Hz6 hz6 = (Hz6) 1Br.A0B(this.A01);
        2FT A02 = 2FP.A02(new Imr(r303, (HnB) 1Lo.A04((Context) null, fbUserSession, hz6.A00, 99907), hz6, threadKey, c5eq, r307, mediaResourceCameraPosition, mediaResourceSendSource, 4YV.A0u(c6x4), z), r0, 4YV.A11(this.A00));
        11T.A0D(A02);
        return 2FP.A00(new In9(fbUserSession, threadKey, this, mediaResource2, z), A02, 1JU.A01);
    }

    public final ListenableFuture A02(FbUserSession fbUserSession, ThreadKey threadKey, MediaResource mediaResource, MediaResource mediaResource2, boolean z) {
        ThreadKey threadKey2 = threadKey;
        11T.A0F(fbUserSession, 0);
        String A00 = 53F.A00(this.A06);
        if (threadKey == null) {
            threadKey2 = ((53G) 1Br.A0B(this.A04)).A00();
        }
        C5en A002 = C5en.A00();
        if (mediaResource == null) {
            throw 1BK.A0h();
        }
        A002.A01(mediaResource);
        A002.A0s = A00;
        A002.A0J = threadKey2;
        A002.A0z = z;
        A002.A0Q = mediaResource2;
        if (5Q1.A00((5Q1) 1Br.A0B(this.A03)).AZk(36314369394548639L)) {
            A002.A0E = ((5HV) 1Br.A0B(this.A02)).A07(fbUserSession, mediaResource).A0E;
        }
        ListenableFuture A0A = 1Kd.A0A(((CQl) 1Br.A0B(this.A07)).A0I(fbUserSession, threadKey2, 4YU.A0Y(A002), "", A00));
        11T.A0A(A0A);
        return A0A;
    }
}
