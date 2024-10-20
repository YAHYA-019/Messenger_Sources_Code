package com.facebook.cameracore.ardelivery.xplat.effectmanager;

import X.HOl;
import X.Hpi;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import java.io.File;

/* loaded from: AREngineEffectAdapter.class */
public interface AREngineEffectAdapter {
    Hpi toAREngineEffect(File file, XplatModelPaths xplatModelPaths, HOl hOl, ARRequestAsset aRRequestAsset, String str, String str2);
}
