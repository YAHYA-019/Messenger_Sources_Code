package com.facebook.cameracore.ardelivery.model;

import X.0fH;
import X.AnonymousClass001;
import X.HC6;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ModelPathsHolder.class */
public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = 255;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap A0u = AnonymousClass001.A0u();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= iArr.length) {
                return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, A0u);
            }
            A0u.put(HC6.values()[iArr[i4]], strArr[i4]);
            i3 = i4 + 1;
        }
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public String getModelPath(HC6 hc6) {
        String A0b = AnonymousClass001.A0b(hc6, this.mModelPaths);
        if (A0b == null) {
            0fH.A0o(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", hc6.name(), this.mCapability.name()));
        }
        return A0b;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean modelPathsExists(HC6 hc6) {
        return this.mModelPaths.containsKey(hc6);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ModelPathsHolder{mCapability=");
        A0k.append(this.mCapability);
        A0k.append(", mVersion=");
        A0k.append(this.mVersion);
        A0k.append(", mModelPaths=");
        A0k.append(this.mModelPaths);
        return AnonymousClass001.A0f(A0k);
    }
}
