package com.meta.metaai.imagine.memu.camera.facebook.impl;

import X.0DC;
import X.0DE;
import X.EJn;
import X.EJo;
import X.G7R;
import com.facebook.tigon.TigonErrorException;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: FbCameraControllerProvider$loadMEmuEffect$$inlined$CoroutineExceptionHandler$1.class */
public final class FbCameraControllerProvider$loadMEmuEffect$$inlined$CoroutineExceptionHandler$1 extends 0DC implements CoroutineExceptionHandler {
    public final /* synthetic */ Function1 $onResult$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FbCameraControllerProvider$loadMEmuEffect$$inlined$CoroutineExceptionHandler$1(G7R g7r, Function1 function1) {
        super(g7r);
        this.$onResult$inlined = function1;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(0DE r302, Throwable th) {
        this.$onResult$inlined.invoke(th instanceof TigonErrorException ? EJo.A00 : EJn.A00);
    }
}
