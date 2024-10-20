package com.facebook.common.json;

import X.0Q8;
import X.1BK;
import X.2tS;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C27T;
import X.C4V6;
import X.EVE;
import android.util.Base64;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.Tree;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: TypeModelBase64Deserializer.class */
public class TypeModelBase64Deserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        RuntimeException A0s;
        int position;
        Tree tree = null;
        try {
            String A1z = abstractC01033pi.A1z();
            if (A1z != null) {
                if (A1z.startsWith("fltb:")) {
                    String replaceFirst = A1z.replaceFirst("fltb:", "");
                    int A00 = EVE.A00(replaceFirst);
                    if (replaceFirst != null && replaceFirst.startsWith("type_tag:")) {
                        replaceFirst = replaceFirst.substring(18);
                    }
                    try {
                        this.A00.getDeclaredConstructor(Integer.TYPE, int[].class).newInstance(Integer.valueOf(A00), null);
                        ByteBuffer duplicate = ByteBuffer.wrap(Base64.decode(replaceFirst, 2)).duplicate();
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        duplicate.order(byteOrder);
                        try {
                            duplicate.order(byteOrder);
                            synchronized (duplicate) {
                                position = duplicate.position();
                            }
                            if (duplicate.getInt(position) + position > 0) {
                                throw AnonymousClass001.A0q("initFromMutableFlatBuffer is not supported");
                            }
                        } catch (IndexOutOfBoundsException | Exception e) {
                            new RuntimeException("", e);
                            throw A0s;
                        }
                    } catch (Exception e2) {
                        A0s = 1BK.A0s("Can't create model object", e2);
                    }
                } else {
                    Preconditions.checkState(A1z.startsWith("tree:"));
                    String replaceFirst2 = A1z.replaceFirst("tree:", "");
                    int A002 = EVE.A00(replaceFirst2);
                    if (replaceFirst2 != null && replaceFirst2.startsWith("type_tag:")) {
                        replaceFirst2 = replaceFirst2.substring(18);
                    }
                    tree = 2tS.A04(GraphServiceAsset.getDefaultConfigName()).deserializeTreeFromByteBuffer(ByteBuffer.wrap(Base64.decode(replaceFirst2, 2)), this.A00, A002);
                }
            }
            return tree;
        } catch (Exception e3) {
            Throwables.propagateIfPossible(e3, IOException.class);
            C4V6.A01(abstractC01033pi, this.A00, e3);
            throw 0Q8.createAndThrow();
        }
    }
}
