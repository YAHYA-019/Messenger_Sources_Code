package com.facebook.rsys.cowatch.gen;

/* loaded from: CowatchPlayerProxy.class */
public abstract class CowatchPlayerProxy {
    public abstract CowatchPlayerApi getApi();

    public abstract boolean isE2eeCowatchEnabled();

    public abstract void setApi(CowatchPlayerApi cowatchPlayerApi);

    public abstract boolean shouldSubscribeBeforeConnect();
}
