package com.facebook.wearable.common.comms.hera.shared.host;

import X.0DP;
import X.0DR;

/* loaded from: AudioStreamsManager$onRemoteAvailability$1.class */
public final class AudioStreamsManager$onRemoteAvailability$1 extends 0DP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AudioStreamsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioStreamsManager$onRemoteAvailability$1(AudioStreamsManager audioStreamsManager, 0DR r303) {
        super(r303);
        this.this$0 = audioStreamsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.onRemoteAvailability(0, false, null, this);
    }
}
