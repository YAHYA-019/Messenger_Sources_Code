package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: AH4.class */
public final class AH4 implements Runnable {
    public static final String __redex_internal_original_name = "SharedAlbumCreateRepository$optimisticCreateSharedAlbum$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 9gL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ java.util.Map A03;
    public final /* synthetic */ Function1 A04;

    public AH4(9gL r302, String str, java.util.Map map, Function1 function1, long j) {
        this.A01 = r302;
        this.A00 = j;
        this.A02 = str;
        this.A03 = map;
        this.A04 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MailboxFeature A0d = 7zP.A0d(this.A01.A02);
        long j = this.A00;
        String str = this.A02;
        java.util.Map map = this.A03;
        A1d a1d = new A1d(this.A04, ActionId.HEADER_DATA_LOADED);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, a1d);
        1Um.A02(AQV, new A0c(map, A0d, A0Q, str, 3, j), A0Q, false);
    }
}
