package com.facebook.messaging.highlightstab.immersiveutils;

import X.0DC;
import X.0DE;
import X.0fH;
import X.G7R;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: HTImmersiveImageAnalyzer$analyzeImage$$inlined$CoroutineExceptionHandler$1.class */
public final class HTImmersiveImageAnalyzer$analyzeImage$$inlined$CoroutineExceptionHandler$1 extends 0DC implements CoroutineExceptionHandler {
    public HTImmersiveImageAnalyzer$analyzeImage$$inlined$CoroutineExceptionHandler$1(G7R g7r) {
        super(g7r);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(0DE r302, Throwable th) {
        0fH.A0r("HTImmersiveImageAnalyzer", "Error in analyzeImageProperties", th);
    }
}
