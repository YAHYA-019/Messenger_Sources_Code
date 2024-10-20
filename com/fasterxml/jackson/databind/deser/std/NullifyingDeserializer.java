package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import X.C42h;

/* loaded from: NullifyingDeserializer.class */
public class NullifyingDeserializer extends StdDeserializer {
    public static final NullifyingDeserializer A00 = new NullifyingDeserializer();
    public static final long serialVersionUID = 1;

    public NullifyingDeserializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        if (!abstractC01033pi.A1u(C42h.A03)) {
            abstractC01033pi.A20();
            return null;
        }
        while (true) {
            C42h A1K = abstractC01033pi.A1K();
            if (A1K == null || A1K == C42h.A02) {
                return null;
            }
            abstractC01033pi.A20();
        }
    }
}
