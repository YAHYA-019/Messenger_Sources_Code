package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import X.C42h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AtomicBooleanDeserializer.class */
public class AtomicBooleanDeserializer extends StdScalarDeserializer {
    public static final long serialVersionUID = 1;

    public AtomicBooleanDeserializer() {
        super(AtomicBoolean.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AtomicBoolean A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        boolean booleanValue;
        C42h A1I = abstractC01033pi.A1I();
        if (A1I == C42h.A0D) {
            booleanValue = true;
        } else if (A1I == C42h.A08) {
            booleanValue = false;
        } else {
            Boolean A0k = A0k(abstractC01033pi, c27t, AtomicBoolean.class);
            if (A0k == null) {
                return null;
            }
            booleanValue = A0k.booleanValue();
        }
        return new AtomicBoolean(booleanValue);
    }
}
