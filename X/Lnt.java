package X;

import android.os.Looper;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: Lnt.class */
public final class Lnt implements Runnable {
    public static final String __redex_internal_original_name = "HeroManager$6";
    public final /* synthetic */ Looper A00;
    public final /* synthetic */ 5L4 A01;

    public Lnt(Looper looper, 5L4 r303) {
        this.A01 = r303;
        this.A00 = looper;
    }

    @Override // java.lang.Runnable
    public void run() {
        C51f.A01("HeroManager", "media codec warmup", AnonymousClass001.A1Z());
        HeroPlayerSetting heroPlayerSetting = this.A01.A0F;
        if (heroPlayerSetting.enableWarmCodec) {
            boolean z = heroPlayerSetting.warmupVp9Codec;
            boolean z2 = heroPlayerSetting.warmupAv1Codec;
            C6ay.A06("video/avc");
            C6ay.A06("audio/mp4a-latm");
            if (z) {
                C6ay.A06("video/x-vnd.on2.vp9");
            }
            if (z2) {
                C6ay.A06("video/av01");
            }
        }
        this.A00.quit();
    }
}
