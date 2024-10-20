package com.facebook.wearable.common.comms.hera.shared.host;

import X.0DP;
import X.0DR;

/* loaded from: VideoStreamsManager$startClientCameraReceiver$1.class */
public final class VideoStreamsManager$startClientCameraReceiver$1 extends 0DP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VideoStreamsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamsManager$startClientCameraReceiver$1(VideoStreamsManager videoStreamsManager, 0DR r303) {
        super(r303);
        this.this$0 = videoStreamsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.startClientCameraReceiver(0, null, null, this);
    }
}
