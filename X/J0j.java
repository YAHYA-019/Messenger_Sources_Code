package X;

import android.view.View;
import com.facebook.rsys.cowatch.gen.CowatchLoggingMetadata;
import com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel;
import com.facebook.rsys.cowatch.gen.CowatchMediaMetadata;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;

/* loaded from: J0j.class */
public final class J0j implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncChainingView$onPageChangeCallback$1$onPageSelected$runnable$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ GVc A01;
    public final /* synthetic */ boolean A02;

    public J0j(GVc gVc, int i, boolean z) {
        this.A01 = gVc;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GVc gVc = this.A01;
        Gr5 gr5 = (Gr5) gVc.A09.getValue();
        CowatchMediaInfoModel cowatchMediaInfoModel = (CowatchMediaInfoModel) 4YU.A0q(((GWI) gVc.A08).A00.A02, this.A00);
        String str = gVc.A04;
        boolean z = this.A02;
        11T.A0F(cowatchMediaInfoModel, 0);
        CowatchMediaMetadata cowatchMediaMetadata = new CowatchMediaMetadata(cowatchMediaInfoModel.mediaURL, cowatchMediaInfoModel.dashManifest, false, cowatchMediaInfoModel.durationMs, cowatchMediaInfoModel.mediaAspectRatio, cowatchMediaInfoModel.mediaTitle, cowatchMediaInfoModel.mediaSubtitle, cowatchMediaInfoModel.containsLicensedMusic, cowatchMediaInfoModel.isReportable, cowatchMediaInfoModel.contentRating, false, cowatchMediaInfoModel.ownerName, cowatchMediaInfoModel.ownerAvatarURL, cowatchMediaInfoModel.reelsMediaInfoModel);
        Integer num = z ? 0S2.A00 : 0S2.A01;
        C00i c00i = gr5.A05.A00;
        GP5.A01((GP5) c00i.get(), "cowatch_non_reels_chaining_swiped", num.intValue() != 0 ? "down" : "up");
        GP5.A02((GP5) c00i.get(), "amd_video_selected", "non_reels_chaining", null, cowatchMediaInfoModel.mediaID, null);
        int A00 = AbJ.A00(z ? 1 : 0);
        CowatchPlayerApi cowatchPlayerApi = (CowatchPlayerApi) gr5.A0F.get();
        if (cowatchPlayerApi != null) {
            cowatchPlayerApi.playMediaOptimistic(cowatchMediaInfoModel.mediaID, cowatchMediaInfoModel.mediaSource, 0L, cowatchMediaMetadata, new CowatchLoggingMetadata(str, null, 0, 0), A00, null);
        }
        View childAt = gVc.A05.getChildAt(0);
        11T.A0I(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        childAt.setOnTouchListener(new IKY(false));
    }
}
