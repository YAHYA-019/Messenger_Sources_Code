package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.27C;
import X.AbstractC01033pi;
import X.C24m;
import X.C27T;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: DateDeserializers$CalendarDeserializer.class */
public class DateDeserializers$CalendarDeserializer extends DateDeserializers$DateBasedDeserializer {
    public final Constructor _defaultCtor;

    public DateDeserializers$CalendarDeserializer() {
        super(Calendar.class);
        this._defaultCtor = null;
    }

    public DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer dateDeserializers$CalendarDeserializer, String str, DateFormat dateFormat) {
        super(dateDeserializers$CalendarDeserializer, str, dateFormat);
        this._defaultCtor = dateDeserializers$CalendarDeserializer._defaultCtor;
    }

    public DateDeserializers$CalendarDeserializer(Class cls) {
        super(GregorianCalendar.class);
        this._defaultCtor = 27C.A0A(GregorianCalendar.class, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Calendar A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Date A0u = A0u(abstractC01033pi, c27t);
        if (A0u == null) {
            return null;
        }
        Constructor constructor = this._defaultCtor;
        if (constructor == null) {
            TimeZone timeZone = c27t._config._base._timeZone;
            if (timeZone == null) {
                timeZone = C24m.A00;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(A0u);
            return calendar;
        }
        try {
            Calendar calendar2 = (Calendar) constructor.newInstance(new Object[0]);
            calendar2.setTimeInMillis(A0u.getTime());
            TimeZone timeZone2 = c27t._config._base._timeZone;
            if (timeZone2 == null) {
                timeZone2 = C24m.A00;
            }
            if (timeZone2 != null) {
                calendar2.setTimeZone(timeZone2);
            }
            return calendar2;
        } catch (Exception e) {
            c27t.A0m(A0S(), e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }
}
