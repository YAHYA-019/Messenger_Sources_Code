package com.facebook.cameracore.ardelivery.xplat.effectmanager;

import X.11T;
import X.7zT;
import X.FH3;
import X.HOl;
import X.Hgz;
import X.Hpi;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import java.io.File;

/* loaded from: AREngineMaskEffectAdapter.class */
public final class AREngineMaskEffectAdapter implements AREngineEffectAdapter {
    @Override // com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineEffectAdapter
    public Hpi toAREngineEffect(File file, XplatModelPaths xplatModelPaths, HOl hOl, ARRequestAsset aRRequestAsset, String str, String str2) {
        11T.A0F(file, 0);
        7zT.A1W(xplatModelPaths, hOl, aRRequestAsset, str);
        11T.A0F(str2, 5);
        Hpi hpi = new Hpi(xplatModelPaths.aRModelPaths, hOl);
        FH3 fh3 = aRRequestAsset.A02;
        String str3 = fh3.A09;
        String str4 = fh3.A0A;
        String absolutePath = file.getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath) && str3 != null) {
            hpi.A05.add(new Hgz(aRRequestAsset.A04, str3, str4, fh3.A0B, absolutePath));
        }
        hpi.A01 = str;
        hpi.A02 = str2;
        return hpi;
    }
}
