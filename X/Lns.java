package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: Lns.class */
public final class Lns implements Runnable {
    public static final String __redex_internal_original_name = "HeroManager$3";
    public final /* synthetic */ 5L4 A00;
    public final /* synthetic */ Krk A01;

    public Lns(5L4 r302, Krk krk) {
        this.A00 = r302;
        this.A01 = krk;
    }

    @Override // java.lang.Runnable
    public void run() {
        5L4 r0 = this.A00;
        final Krk krk = this.A01;
        5N2 r02 = r0.A0I;
        final 5N9 r03 = r0.A0H;
        if (r03 == null) {
            if (r02 != null) {
                C51f.A01("HeroManager", "execute warmup request vid=%s", krk.A00.A0X.A0F);
                r02.A04(r0, krk);
                return;
            }
            return;
        }
        6Cj r04 = krk.A00.A0X;
        C51f.A01("HeroManager", "schedule warmup request vid=%s", r04.A0F);
        if (!r03.A03.enableWarmupSchedulerRightAway) {
            r03.A01.post(new Runnable() { // from class: X.Lny
                public static final String __redex_internal_original_name = "PlayerWarmupScheduler$$ExternalSyntheticLambda6";

                @Override // java.lang.Runnable
                public final void run() {
                    5N9 r05 = r03;
                    Krk krk2 = krk;
                    HeroPlayerSetting heroPlayerSetting = r05.A03;
                    if (heroPlayerSetting.enableWarmupSkipScheduler) {
                        5L4 r06 = (5L4) r05.A08.get();
                        if (r06 != null) {
                            C51f.A01("PlayerWarmupScheduler", "warm up in BG thread %s", krk2.A00.A0X);
                            r05.A04.A04(r06, krk2);
                            return;
                        }
                        return;
                    }
                    C95s c95s = krk2.A01;
                    if (!heroPlayerSetting.shouldUseWarmupSlot || c95s == C95s.UNSPECIFIED) {
                        r05.A06.offer(krk2);
                    } else {
                        r05.A05.put(c95s, krk2);
                    }
                    if (heroPlayerSetting.enableStopWarmupSchedulerEmpty) {
                        synchronized (r05) {
                            C51f.A01("PlayerWarmupScheduler", "startWarmupScheduler()", AnonymousClass001.A1Z());
                            if (!r05.A09) {
                                Runnable llZ = new LlZ(r05);
                                if (heroPlayerSetting.gen.use_idle_executor_in_warmup_scheduler) {
                                    r05.A07.execute(llZ);
                                } else {
                                    r05.A02.post(llZ);
                                }
                                r05.A09 = true;
                            }
                        }
                    }
                }
            });
            return;
        }
        5L4 r05 = (5L4) r03.A08.get();
        if (r05 != null) {
            C51f.A01("PlayerWarmupScheduler", "warm up right now %s", r04);
            r03.A04.A04(r05, krk);
        }
    }
}
