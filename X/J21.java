package X;

import com.facebook.rsys.cowatch.gen.CowatchLoggingMetadata;
import com.facebook.rsys.cowatch.gen.CowatchMediaMetadata;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.facebook.rsys.cowatch.gen.CowatchReelsMediaInfoModel;

/* loaded from: J21.class */
public final class J21 implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncReelsPlaybackBaseView$pageSelected$finalRunnable$1";
    public final /* synthetic */ GVb A00;
    public final /* synthetic */ GjV A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    public J21(GVb gVb, GjV gjV, Integer num, boolean z) {
        this.A00 = gVb;
        this.A01 = gjV;
        this.A03 = z;
        this.A02 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CowatchPlayerApi cowatchPlayerApi;
        GVb gVb = this.A00;
        gVb.A00 = -1;
        GrO grO = (GrO) gVb.A09.getValue();
        GjV gjV = this.A01;
        boolean z = this.A03;
        Integer num = this.A02;
        boolean A1Y = 7zP.A1Y(num);
        GjW gjW = gjV.A00;
        C2604Git c2604Git = gjV.A01;
        CowatchMediaMetadata cowatchMediaMetadata = new CowatchMediaMetadata(gjW.A04, gjW.A05, A1Y, gjW.A02, gjW.A00, c2604Git.A06, c2604Git.A0B, A1Y, A1Y, null, true, null, null, new CowatchReelsMediaInfoModel(c2604Git.A0A, null, c2604Git.A03, null, AnonymousClass001.A0s(), c2604Git.A07, null, c2604Git.A00, c2604Git.A04, c2604Git.A01, c2604Git.A09, c2604Git.A0D));
        C00i c00i = grO.A05.A00;
        GP5.A01((GP5) c00i.get(), "cowatch_reels_swiped", num.intValue() != 0 ? "down" : "up");
        GP5.A01((GP5) c00i.get(), "amd_video_selected", "reels_chaining");
        int A00 = AbJ.A00(z ? 1 : 0);
        String str = c2604Git.A02;
        if (str == null || (cowatchPlayerApi = (CowatchPlayerApi) grO.A0J.get()) == null) {
            return;
        }
        String str2 = gjV.A02;
        JDB jdb = ((GS2) grO).A01;
        cowatchPlayerApi.playMediaOptimistic(str2, str, 0L, cowatchMediaMetadata, new CowatchLoggingMetadata(((C2643Gjx) AbM.A0r(jdb)).A04, null, A1Y ? 1 : 0, A1Y ? 1 : 0), A00, ((C2643Gjx) AbM.A0r(jdb)).A03);
    }
}
