package com.facebook.rsys.callmanager.callintentcommon.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.callintent.gen.CallIntent;
import java.util.ArrayList;

/* loaded from: InitCallConfig.class */
public class InitCallConfig {
    public static 2JQ CONVERTER = IR0.A00(38);
    public static long sMcfTypeId;
    public final CallIntent callIntent;
    public final FeatureHolder coreFeature;
    public final ArrayList otherFeatures;
    public final boolean setupMode;

    public InitCallConfig(FeatureHolder featureHolder, CallIntent callIntent, ArrayList arrayList, boolean z) {
        featureHolder.getClass();
        arrayList.getClass();
        this.callIntent = callIntent;
        this.setupMode = z;
        this.coreFeature = featureHolder;
        this.otherFeatures = arrayList;
    }

    public InitCallConfig(Builder builder) {
        builder.callIntent.getClass();
        builder.coreFeature.getClass();
        builder.otherFeatures.getClass();
        this.callIntent = builder.callIntent;
        this.setupMode = builder.setupMode;
        this.coreFeature = builder.coreFeature;
        this.otherFeatures = builder.otherFeatures;
    }

    public static native InitCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof InitCallConfig)) {
                return false;
            }
            InitCallConfig initCallConfig = (InitCallConfig) obj;
            if (this.callIntent.equals(initCallConfig.callIntent) && this.setupMode == initCallConfig.setupMode && this.coreFeature.equals(initCallConfig.coreFeature) && this.otherFeatures.equals(initCallConfig.otherFeatures)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.otherFeatures, AnonymousClass002.A05(this.coreFeature, (AbstractC2327GOs.A08(this.callIntent) + (this.setupMode ? 1 : 0)) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InitCallConfig{callIntent=");
        A0k.append(this.callIntent);
        A0k.append(",setupMode=");
        A0k.append(this.setupMode);
        A0k.append(",coreFeature=");
        A0k.append(this.coreFeature);
        A0k.append(",otherFeatures=");
        return AbstractC2327GOs.A0U(this.otherFeatures, A0k);
    }
}
