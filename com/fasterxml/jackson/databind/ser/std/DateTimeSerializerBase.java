package com.fasterxml.jackson.databind.ser.std;

import X.0Pz;
import X.1MG;
import X.26D;
import X.28Q;
import X.C25p;
import X.C26c;
import X.C27r;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: DateTimeSerializerBase.class */
public abstract class DateTimeSerializerBase extends StdScalarSerializer implements C27r {
    public final DateFormat _customFormat;
    public final AtomicReference _reusedCustomFormat;
    public final Boolean _useTimestamp;

    public DateTimeSerializerBase(Boolean bool, Class cls, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference();
    }

    private DateTimeSerializerBase A0E(Boolean bool, DateFormat dateFormat) {
        return this instanceof SqlDateSerializer ? new DateTimeSerializerBase(bool, Date.class, dateFormat) : this instanceof DateSerializer ? new DateTimeSerializerBase(bool, java.util.Date.class, dateFormat) : new DateTimeSerializerBase(bool, Calendar.class, dateFormat);
    }

    public void A0F(28Q r302, C26c c26c, java.util.Date date) {
        if (this._customFormat != null) {
            DateFormat dateFormat = (DateFormat) this._reusedCustomFormat.getAndSet(null);
            if (dateFormat == null) {
                dateFormat = (DateFormat) this._customFormat.clone();
            }
            r302.A0r(dateFormat.format(date));
            1MG.A00(this._reusedCustomFormat, (Object) null, dateFormat);
            return;
        }
        26D r0 = 26D.A0D;
        C25p c25p = c26c._config;
        if (c25p.A0G(r0)) {
            r302.A0g(date.getTime());
            return;
        }
        DateFormat dateFormat2 = c26c._dateFormat;
        if (dateFormat2 == null) {
            dateFormat2 = (DateFormat) c25p._base._dateFormat.clone();
            c26c._dateFormat = dateFormat2;
        }
        r302.A0r(dateFormat2.format(date));
    }

    public boolean A0G(C26c c26c) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (c26c == null) {
            throw 0Pz.A05("Null SerializerProvider passed for ", this._handledType.getName());
        }
        return c26c._config.A0G(26D.A0D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0192, code lost:
    
        if (r0.isEmpty() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0260, code lost:
    
        if (r0 == false) goto L22;
     */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
