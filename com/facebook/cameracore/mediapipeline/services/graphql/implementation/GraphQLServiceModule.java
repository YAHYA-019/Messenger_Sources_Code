package com.facebook.cameracore.mediapipeline.services.graphql.implementation;

import X.AbstractC2446Gdn;
import X.C0il;
import X.HGr;
import X.Hy3;
import X.I2f;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: GraphQLServiceModule.class */
public final class GraphQLServiceModule extends ServiceModule {
    public static final HGr Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HGr, java.lang.Object] */
    static {
        C0il.A0B("graphqlservice");
    }

    public GraphQLServiceModule() {
        this.mHybridData = initHybrid();
    }

    public static final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        if (i2f == null) {
            return null;
        }
        Hy3 hy3 = AbstractC2446Gdn.A02;
        if (i2f.A08.containsKey(hy3)) {
            return new GraphQLServiceConfigurationHybrid((AbstractC2446Gdn) i2f.A01(hy3));
        }
        return null;
    }
}
