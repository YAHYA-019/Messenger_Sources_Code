package com.facebook.traffic.tasosvideobwe;

import X.11T;
import X.5LD;
import X.5M2;
import X.AnonymousClass001;
import X.C7xv;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: TasosVideoBandwidthMeterFactory.class */
public final class TasosVideoBandwidthMeterFactory {
    public static final TasosVideoBandwidthMeterFactory INSTANCE = new Object();

    public 5M2 create(C7xv c7xv, AbrContextAwareConfiguration abrContextAwareConfiguration, HeroPlayerSetting heroPlayerSetting) {
        5LD r0;
        11T.A0H(c7xv, abrContextAwareConfiguration);
        if (!(c7xv instanceof 5LD) || (r0 = (5LD) c7xv) == null) {
            throw AnonymousClass001.A0N("networkStackVideoServiceHelper is not an instance of TigonVideoServiceHelper");
        }
        return new TasosVideoBandwidthMeter(r0, abrContextAwareConfiguration);
    }
}
