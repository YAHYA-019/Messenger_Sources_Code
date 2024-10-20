package com.facebook.video.heroplayer.service.live;

import X.5L8;
import X.5LD;
import X.5LT;
import X.5Lo;
import X.5Lr;
import android.content.Context;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: HeroDashLiveManagerImpl.class */
public class HeroDashLiveManagerImpl {
    public final 5Lr A00;
    public final ServiceEventCallbackImpl A01;

    public HeroDashLiveManagerImpl(Context context, HeroPlayerSetting heroPlayerSetting, 5L8 r304, AtomicReference atomicReference, 5LT r306, 5LD r307) {
        this.A00 = new 5Lr(context, r306, new 5Lo((AtomicReference) null), heroPlayerSetting.abrSetting, heroPlayerSetting, r307);
        this.A01 = new ServiceEventCallbackImpl(r304, heroPlayerSetting.mEventLogSetting, atomicReference);
    }
}
