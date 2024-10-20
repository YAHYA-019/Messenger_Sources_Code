package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Hzo.class */
public final class Hzo {
    public final 5L1 A00;
    public final 5L3 A01;
    public final HeroPlayerSetting A02;
    public final 5Kx A03;
    public final java.util.Map A04;
    public final Executor A05;
    public final ScheduledExecutorService A06;
    public final boolean A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5Kx, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Hzo() {
        /*
            r301 = this;
            java.util.HashMap r0 = X.AnonymousClass001.A0u()
            r302 = r0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = com.facebook.video.heroplayer.setting.HeroPlayerSetting.A01
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            X.S35 r0 = new X.S35
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r301
            r1 = 0
            r2 = 0
            r3 = r303
            r4 = r304
            r5 = r302
            r6 = 0
            r7 = 0
            r8 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hzo.<init>():void");
    }

    public Hzo(5L1 r302, 5L3 r303, HeroPlayerSetting heroPlayerSetting, 5Kx r305, java.util.Map map, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
        1BL.A1F(map, heroPlayerSetting);
        this.A04 = map;
        this.A02 = heroPlayerSetting;
        this.A03 = r305;
        this.A07 = z;
        this.A06 = scheduledExecutorService;
        this.A05 = executor;
        this.A00 = r302;
        this.A01 = r303;
    }
}
