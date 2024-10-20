package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: AH3.class */
public final class AH3 implements Runnable {
    public static final String __redex_internal_original_name = "SharedAlbumAddToAlbumRepository$uploadMediaToExistingSharedAlbum$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 9gK A03;
    public final /* synthetic */ List A04;

    public AH3(9gK r302, List list, long j, long j2, long j3) {
        this.A03 = r302;
        this.A00 = j;
        this.A02 = j2;
        this.A04 = list;
        this.A01 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        8yG r0 = (8yG) 1Br.A0B(this.A03.A02);
        long j = this.A00;
        long j2 = this.A02;
        List list = this.A04;
        long j3 = this.A01;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A0l(A0P, r0, list, 1, j, j2, j3), A0P, false);
    }
}
