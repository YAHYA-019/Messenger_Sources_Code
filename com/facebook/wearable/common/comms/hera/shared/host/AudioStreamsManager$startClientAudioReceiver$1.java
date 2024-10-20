package com.facebook.wearable.common.comms.hera.shared.host;

import X.0DP;
import X.0DR;

/* loaded from: AudioStreamsManager$startClientAudioReceiver$1.class */
public final class AudioStreamsManager$startClientAudioReceiver$1 extends 0DP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AudioStreamsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioStreamsManager$startClientAudioReceiver$1(AudioStreamsManager audioStreamsManager, 0DR r303) {
        super(r303);
        this.this$0 = audioStreamsManager;
    }

    public final Object invokeSuspend(Object obj) {
        Object startClientAudioReceiver;
        this.result = obj;
        this.label |= (-1) << (-1);
        startClientAudioReceiver = this.this$0.startClientAudioReceiver(0, this);
        return startClientAudioReceiver;
    }
}
