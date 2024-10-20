package X;

import com.facebook.rsys.cowatch.gen.CowatchLoggingMetadata;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;

/* loaded from: J1y.class */
public final class J1y implements Runnable {
    public static final String __redex_internal_original_name = "CoWatchPromotionSharedStateImpl$startPromoMedia$1";
    public final /* synthetic */ I46 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public J1y(I46 i46, String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = i46;
        this.A03 = str2;
        this.A01 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CowatchLoggingMetadata cowatchLoggingMetadata = new CowatchLoggingMetadata("promotion", this.A02, 0, 0);
        CowatchPlayerApi cowatchPlayerApi = (CowatchPlayerApi) 1Br.A0B(this.A00.A09);
        11T.A0D(cowatchPlayerApi);
        String str = this.A03;
        String str2 = this.A01;
        if (str2 == null) {
            str2 = "fb";
        }
        cowatchPlayerApi.playMedia(str, str2, 0L, cowatchLoggingMetadata, false, 0);
    }
}
