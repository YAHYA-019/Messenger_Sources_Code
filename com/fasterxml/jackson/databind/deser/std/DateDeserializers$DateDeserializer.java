package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import java.util.Date;

/* loaded from: DateDeserializers$DateDeserializer.class */
public class DateDeserializers$DateDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$DateDeserializer A00 = new DateDeserializers$DateDeserializer();

    public DateDeserializers$DateDeserializer() {
        super(Date.class);
    }

    private void A00(AbstractC01033pi abstractC01033pi, C27T c27t) {
        A0u(abstractC01033pi, c27t);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return A0u(abstractC01033pi, c27t);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        return new Date(0L);
    }
}
