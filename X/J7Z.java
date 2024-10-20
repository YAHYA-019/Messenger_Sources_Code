package X;

import com.facebook.rsys.cowatch.gen.CowatchLoggingMetadata;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.google.common.collect.ImmutableMap;
import java.util.TimerTask;

/* loaded from: J7Z.class */
public final class J7Z extends TimerTask {
    public static final String __redex_internal_original_name = "CowatchMediaSharingHelper$onMediaUpdate$$inlined$schedule$1";
    public final /* synthetic */ HpK A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public J7Z(HpK hpK, String str, String str2) {
        this.A00 = hpK;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        HpK hpK = this.A00;
        CowatchPlayerApi cowatchPlayerApi = (CowatchPlayerApi) hpK.A04.get();
        if (cowatchPlayerApi != null) {
            cowatchPlayerApi.playMedia(this.A01, this.A02, 0L, new CowatchLoggingMetadata("thread_upload", null, 0, 0), false, 0);
        } else {
            0fH.A0j("CowatchMediaSharingHelper", "cowatchPlayerApiProvider is null");
        }
        GP5 A0K = GOp.A0K(hpK.A01);
        String str = this.A01;
        ImmutableMap build = 1BK.A0c().build();
        if (build.size() <= 0) {
            build = null;
        }
        GP5.A02(A0K, "amd_video_selected", "thread_upload", null, str, build);
    }
}
