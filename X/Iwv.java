package X;

import com.facebook.rsys.cowatch.gen.CowatchPlayerModel;

/* loaded from: Iwv.class */
public final class Iwv implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncPlaybackRsysPresenter$onResume$1";
    public final /* synthetic */ GrG A00;
    public final /* synthetic */ CowatchPlayerModel A01;

    public Iwv(GrG grG, CowatchPlayerModel cowatchPlayerModel) {
        this.A00 = grG;
        this.A01 = cowatchPlayerModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GrG grG = this.A00;
        CowatchPlayerModel cowatchPlayerModel = this.A01;
        GrG.A09(grG, cowatchPlayerModel.mediaInfo, cowatchPlayerModel);
    }
}
