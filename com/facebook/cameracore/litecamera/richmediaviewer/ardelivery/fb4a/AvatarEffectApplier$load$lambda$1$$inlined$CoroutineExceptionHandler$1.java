package com.facebook.cameracore.litecamera.richmediaviewer.ardelivery.fb4a;

import X.0DC;
import X.0DE;
import X.G7R;
import X.JHv;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: AvatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1.class */
public final class AvatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1 extends 0DC implements CoroutineExceptionHandler {
    public final /* synthetic */ JHv $callback$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1(G7R g7r, JHv jHv) {
        super(g7r);
        this.$callback$inlined = jHv;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(0DE r302, Throwable th) {
        this.$callback$inlined.onFailure(new Exception(th));
    }
}
