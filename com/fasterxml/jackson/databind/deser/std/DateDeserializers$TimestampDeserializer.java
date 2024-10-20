package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: DateDeserializers$TimestampDeserializer.class */
public class DateDeserializers$TimestampDeserializer extends DateDeserializers$DateBasedDeserializer {
    public DateDeserializers$TimestampDeserializer() {
        super(Timestamp.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Timestamp A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Date A0u = A0u(abstractC01033pi, c27t);
        if (A0u == null) {
            return null;
        }
        return new Timestamp(A0u.getTime());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        return new Timestamp(0L);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer
    public /* bridge */ /* synthetic */ DateDeserializers$DateBasedDeserializer A12(String str, DateFormat dateFormat) {
        return new DateDeserializers$DateBasedDeserializer(this, str, dateFormat);
    }
}
