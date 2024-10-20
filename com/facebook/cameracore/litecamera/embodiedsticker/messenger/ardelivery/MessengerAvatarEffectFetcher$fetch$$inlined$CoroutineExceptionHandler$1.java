package com.facebook.cameracore.litecamera.embodiedsticker.messenger.ardelivery;

import X.0DC;
import X.0DE;
import X.G7R;
import X.JCh;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: MessengerAvatarEffectFetcher$fetch$$inlined$CoroutineExceptionHandler$1.class */
public final class MessengerAvatarEffectFetcher$fetch$$inlined$CoroutineExceptionHandler$1 extends 0DC implements CoroutineExceptionHandler {
    public final /* synthetic */ JCh $callback$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerAvatarEffectFetcher$fetch$$inlined$CoroutineExceptionHandler$1(G7R g7r, JCh jCh) {
        super(g7r);
        this.$callback$inlined = jCh;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(0DE r302, Throwable th) {
        new Exception(th);
    }
}
