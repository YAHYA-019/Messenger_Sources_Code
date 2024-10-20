package com.facebook.common.json;

import X.0Q8;
import X.2tS;
import X.AbstractC01033pi;
import X.C27T;
import X.C4V6;
import X.EVE;
import android.util.Base64;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.Tree;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: TreeFragmentModelBase64Deserializer.class */
public class TreeFragmentModelBase64Deserializer extends FbJsonDeserializer {
    public Class A00;

    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Tree tree = null;
        try {
            String A1z = abstractC01033pi.A1z();
            if (A1z != null) {
                int A00 = EVE.A00(A1z);
                if (A1z.startsWith("type_tag:")) {
                    A1z = A1z.substring(18);
                }
                tree = 2tS.A04(GraphServiceAsset.getDefaultConfigName()).deserializeTreeFromByteBuffer(ByteBuffer.wrap(Base64.decode(A1z, 2)), this.A00, A00);
            }
            return tree;
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, IOException.class);
            C4V6.A01(abstractC01033pi, this.A00, e);
            throw 0Q8.createAndThrow();
        }
    }
}
