package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: AtomicLongDeserializer.class */
public class AtomicLongDeserializer extends StdScalarDeserializer {
    public static final long serialVersionUID = 1;

    public AtomicLongDeserializer() {
        super(AtomicLong.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AtomicLong A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        long intValue;
        if (abstractC01033pi.A1o()) {
            intValue = abstractC01033pi.A1A();
        } else {
            Long A0o = A0o(abstractC01033pi, c27t, AtomicLong.class);
            if (A0o == null) {
                return null;
            }
            intValue = A0o.intValue();
        }
        return new AtomicLong(intValue);
    }
}
