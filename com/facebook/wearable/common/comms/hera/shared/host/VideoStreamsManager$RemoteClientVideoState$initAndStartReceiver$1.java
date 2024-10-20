package com.facebook.wearable.common.comms.hera.shared.host;

import X.0DP;
import X.0DR;
import com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager;

/* loaded from: VideoStreamsManager$RemoteClientVideoState$initAndStartReceiver$1.class */
public final class VideoStreamsManager$RemoteClientVideoState$initAndStartReceiver$1 extends 0DP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VideoStreamsManager.RemoteClientVideoState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamsManager$RemoteClientVideoState$initAndStartReceiver$1(VideoStreamsManager.RemoteClientVideoState remoteClientVideoState, 0DR r303) {
        super(r303);
        this.this$0 = remoteClientVideoState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.initAndStartReceiver(null, this);
    }
}
