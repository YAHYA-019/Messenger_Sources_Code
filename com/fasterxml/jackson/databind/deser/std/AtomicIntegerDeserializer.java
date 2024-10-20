package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: AtomicIntegerDeserializer.class */
public class AtomicIntegerDeserializer extends StdScalarDeserializer {
    public static final long serialVersionUID = 1;

    public AtomicIntegerDeserializer() {
        super(AtomicInteger.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AtomicInteger A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int intValue;
        if (abstractC01033pi.A1o()) {
            intValue = abstractC01033pi.A15();
        } else {
            Integer A0n = A0n(abstractC01033pi, c27t, AtomicInteger.class);
            if (A0n == null) {
                return null;
            }
            intValue = A0n.intValue();
        }
        return new AtomicInteger(intValue);
    }
}
