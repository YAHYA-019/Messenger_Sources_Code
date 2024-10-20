package com.facebook.cameracore.ardelivery.xplat.models;

import X.11T;
import X.Esm;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* loaded from: XplatModelPaths.class */
public final class XplatModelPaths {
    public final Esm aRModelPaths = new Esm();

    public final Esm getARModelPaths() {
        return this.aRModelPaths;
    }

    public final void setModelPaths(int i, ModelPathsHolder modelPathsHolder) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        if (fromXplatValue != null) {
            Esm esm = this.aRModelPaths;
            if (modelPathsHolder != null) {
                esm.A00.put(fromXplatValue, modelPathsHolder);
            }
        }
    }

    public final void setSparkVisionModelPath(String str, String str2) {
        11T.A0H(str, str2);
        this.aRModelPaths.A01.put(str, str2);
    }
}
