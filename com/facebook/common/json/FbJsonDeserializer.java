package com.facebook.common.json;

import X.0Pz;
import X.0Q8;
import X.5BB;
import X.AbstractC01033pi;
import X.C27T;
import X.C41w;
import X.C42h;
import X.C4V6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* loaded from: FbJsonDeserializer.class */
public class FbJsonDeserializer extends JsonDeserializer {
    public Class A00;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        try {
            Object A0Y = A0Y();
            while (5BB.A00(abstractC01033pi) != C42h.A02) {
                if (abstractC01033pi.A1J() == C42h.A03) {
                    String A1Y = abstractC01033pi.A1Y();
                    abstractC01033pi.A1K();
                    FbJsonField A0X = A0X(A1Y);
                    if (A0X != null) {
                        A0X.deserialize(A0Y, abstractC01033pi, c27t);
                    } else {
                        abstractC01033pi.A20();
                    }
                }
            }
            if (A0Y instanceof C41w) {
                ((C41w) A0Y).CY7();
            }
            return A0Y;
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, IOException.class);
            C4V6.A01(abstractC01033pi, this.A00, e);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0038, code lost:
    
        if (r306 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0498, code lost:
    
        if (r306 != null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0588, code lost:
    
        if (r306 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0666, code lost:
    
        if (r306 != null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x07bb, code lost:
    
        if (r306 != null) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x08e5, code lost:
    
        if (r306 != null) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0a28, code lost:
    
        if (r306 != null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0b91, code lost:
    
        if (r306 != null) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0c7e, code lost:
    
        if (r306 != null) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0d98, code lost:
    
        if (r306 != null) goto L731;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:446:0x08f3. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.common.json.FbJsonField A0X(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 4017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.json.FbJsonDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public Object A0Y() {
        try {
            Constructor declaredConstructor = this.A00.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(0Pz.A0W(this.A00.getName(), " missing default constructor"), e);
        }
    }
}
