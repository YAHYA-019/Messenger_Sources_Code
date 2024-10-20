package com.facebook.common.appcomponentfactory.m4a;

import com.facebook.common.appcomponentfactory.doppelganger.DoppelAppComponentFactory;

/* loaded from: M4aDoppelAppComponentFactory.class */
public final class M4aDoppelAppComponentFactory extends DoppelAppComponentFactory {
    @Override // com.facebook.common.appcomponentfactory.doppelganger.DoppelAppComponentFactory
    public String actualAppComponentFactoryName() {
        return "com.facebook.common.appcomponentfactory.m4a.M4aAppComponentFactory";
    }

    @Override // com.facebook.common.appcomponentfactory.doppelganger.DoppelAppComponentFactory
    public boolean shouldSkipAppComponenFactory() {
        return false;
    }
}
