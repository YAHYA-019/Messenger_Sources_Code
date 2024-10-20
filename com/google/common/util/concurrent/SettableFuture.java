package com.google.common.util.concurrent;

import X.1FV;

/* loaded from: SettableFuture.class */
public final class SettableFuture extends 1FV {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static SettableFuture create() {
        return new Object();
    }

    public boolean set(Object obj) {
        return super/*X.1FX*/.set(obj);
    }

    public boolean setException(Throwable th) {
        return super/*X.1FX*/.setException(th);
    }

    public boolean setFuture(ListenableFuture listenableFuture) {
        return super/*X.1FX*/.setFuture(listenableFuture);
    }
}
