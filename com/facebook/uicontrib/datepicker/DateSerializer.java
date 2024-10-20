package com.facebook.uicontrib.datepicker;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: DateSerializer.class */
public class DateSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), Date.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            r302.A0Z();
        }
        r302.A0b();
        int i = date.year;
        r302.A0o("year");
        r302.A0f(i);
        AbstractC11224vw.A0B(r302, date.month, "month");
        AbstractC11224vw.A0B(r302, date.dayOfMonth, "day");
        r302.A0Y();
    }
}
