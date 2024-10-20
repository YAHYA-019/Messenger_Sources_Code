package com.facebook.wearable.common.comms.hera.shared.host;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.2aI;
import X.AnonymousClass001;
import com.facebook.wearable.common.comms.rtc.hera.video.mixer.RawVideoMixer;
import kotlin.jvm.functions.Function2;

/* loaded from: VideoStreamsManager$1$1.class */
public final class VideoStreamsManager$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ int $it;
    public int label;
    public final /* synthetic */ VideoStreamsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamsManager$1$1(VideoStreamsManager videoStreamsManager, int i, 0DR r304) {
        super(2, r304);
        this.this$0 = videoStreamsManager;
        this.$it = i;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new VideoStreamsManager$1$1(this.this$0, this.$it, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(2aI r302, 0DR r303) {
        return create(r302, r303).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            RawVideoMixer rawVideoMixer = this.this$0.cameraVideoMixer;
            int i2 = this.$it;
            this.label = 1;
            if (rawVideoMixer.A00(i2, this) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }
}
