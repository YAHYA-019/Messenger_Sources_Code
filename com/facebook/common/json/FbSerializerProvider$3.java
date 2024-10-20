package com.facebook.common.json;

import X.0Pz;
import X.0fH;
import X.28Q;
import X.4YV;
import X.4iJ;
import X.4iV;
import X.C26c;
import android.util.Base64;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeJNI;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FbSerializerProvider$3.class */
public class FbSerializerProvider$3 extends JsonSerializer {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        TreeJNI treeJNI = (4iV) obj;
        boolean z = treeJNI instanceof Tree;
        if ((c26c instanceof 4iJ) && ((4iJ) c26c).mHumanReadableFormatEnabled) {
            if (z) {
                r302.A0S(treeJNI.toExpensiveHumanReadableDebugString());
                return;
            }
        } else if (z) {
            r302.A0r(0Pz.A0W("tree:", Base64.encodeToString(4YV.A1b(treeJNI), 2)));
            return;
        }
        0fH.A0F(4iJ.class, 0Pz.A0T("Use of deprecated flatbuffer infra: model type tag ", treeJNI.getTypeTag()));
    }
}
