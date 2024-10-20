package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: AH2.class */
public final class AH2 implements Runnable {
    public static final String __redex_internal_original_name = "SharedAlbumAddToAlbumRepository$addToAlbumWithExistingAttachment$1$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 9gK A02;
    public final /* synthetic */ java.util.Map A03;
    public final /* synthetic */ C00m A04;

    public AH2(9gK r302, java.util.Map map, C00m c00m, long j, long j2) {
        this.A02 = r302;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = map;
        this.A04 = c00m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MailboxFeature A0d = 7zP.A0d(this.A02.A02);
        long j = this.A01;
        long j2 = this.A00;
        java.util.Map map = this.A03;
        A1d A00 = A1d.A00(this.A04, ActionId.RTMP_CONNECTION_CONNECTED);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
        1Um.A02(AQV, new CzZ(5, j2, j, A0Q, map, A0d), A0Q, false);
    }
}
