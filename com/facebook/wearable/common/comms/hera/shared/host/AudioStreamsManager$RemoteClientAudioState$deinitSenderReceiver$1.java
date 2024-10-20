package com.facebook.wearable.common.comms.hera.shared.host;

import X.0DP;
import X.0DR;
import com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager;

/* loaded from: AudioStreamsManager$RemoteClientAudioState$deinitSenderReceiver$1.class */
public final class AudioStreamsManager$RemoteClientAudioState$deinitSenderReceiver$1 extends 0DP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AudioStreamsManager.RemoteClientAudioState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioStreamsManager$RemoteClientAudioState$deinitSenderReceiver$1(AudioStreamsManager.RemoteClientAudioState remoteClientAudioState, 0DR r303) {
        super(r303);
        this.this$0 = remoteClientAudioState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.deinitSenderReceiver(this);
    }
}
