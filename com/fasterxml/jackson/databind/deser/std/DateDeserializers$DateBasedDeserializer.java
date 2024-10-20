package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C24d;
import X.C24m;
import X.C25s;
import X.C26L;
import X.C27T;
import X.C42h;
import X.C42x;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: DateDeserializers$DateBasedDeserializer.class */
public abstract class DateDeserializers$DateBasedDeserializer extends StdScalarDeserializer implements AnonymousClass437 {
    public final DateFormat _customFormat;
    public final String _formatString;

    public DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer dateDeserializers$DateBasedDeserializer, String str, DateFormat dateFormat) {
        super(dateDeserializers$DateBasedDeserializer._valueClass);
        this._customFormat = dateFormat;
        this._formatString = str;
    }

    public DateDeserializers$DateBasedDeserializer(Class cls) {
        super(cls);
        this._customFormat = null;
        this._formatString = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.DateTime;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Date A0u(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Date parse;
        if (this._customFormat == null || !abstractC01033pi.A1u(C42h.A0C)) {
            return super.A0u(abstractC01033pi, c27t);
        }
        String trim = abstractC01033pi.A1Z().trim();
        if (trim.isEmpty()) {
            if (A0g(c27t, trim).ordinal() != 3) {
                return null;
            }
            return new Date(0L);
        }
        synchronized (this._customFormat) {
            try {
                parse = this._customFormat.parse(trim);
            } catch (ParseException unused) {
                c27t.A0l(A0S(), trim, "expected format \"%s\"", this._formatString);
                throw 0Q8.createAndThrow();
            }
        }
        return parse;
    }

    public DateDeserializers$DateBasedDeserializer A12(String str, DateFormat dateFormat) {
        return this instanceof DateDeserializers$DateDeserializer ? new DateDeserializers$DateBasedDeserializer(this, str, dateFormat) : new DateDeserializers$CalendarDeserializer((DateDeserializers$CalendarDeserializer) this, str, dateFormat);
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        DateFormat dateFormat;
        DateFormat dateFormat2;
        DateFormat dateFormat3;
        Class A0S = A0S();
        C26L c26l = c27t._config;
        C25s ASv = r302 != null ? r302.ASv(c26l, A0S) : c26l.A00(A0S);
        if (ASv != null) {
            TimeZone A02 = ASv.A02();
            Boolean bool = ASv._lenient;
            String str = ASv._pattern;
            if (str != null && str.length() > 0) {
                Locale locale = ASv._locale;
                if (locale == null) {
                    locale = c27t._config._base._locale;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                if (A02 == null) {
                    A02 = c27t._config._base._timeZone;
                    if (A02 == null) {
                        A02 = C24m.A00;
                    }
                }
                simpleDateFormat.setTimeZone(A02);
                dateFormat3 = simpleDateFormat;
                if (bool != null) {
                    simpleDateFormat.setLenient(bool.booleanValue());
                    dateFormat3 = simpleDateFormat;
                }
            } else if (A02 != null) {
                C24m c24m = c27t._config._base;
                DateFormat dateFormat4 = c24m._dateFormat;
                if (dateFormat4.getClass() == C24d.class) {
                    Locale locale2 = ASv._locale;
                    if (locale2 == null) {
                        locale2 = c24m._locale;
                    }
                    C24d c24d = (C24d) dateFormat4;
                    TimeZone timeZone = c24d.A02;
                    C24d c24d2 = c24d;
                    if (A02 != timeZone) {
                        c24d2 = c24d;
                        if (!A02.equals(timeZone)) {
                            c24d2 = new C24d(c24d._lenient, c24d._locale, A02, c24d._tzSerializedWithColon);
                        }
                    }
                    Locale locale3 = c24d2._locale;
                    C24d c24d3 = c24d2;
                    if (!locale2.equals(locale3)) {
                        c24d3 = new C24d(c24d2._lenient, locale2, c24d2.A02, c24d2._tzSerializedWithColon);
                    }
                    dateFormat2 = c24d3;
                    if (bool != null) {
                        Boolean bool2 = c24d3._lenient;
                        dateFormat2 = c24d3;
                        if (bool != bool2) {
                            dateFormat2 = c24d3;
                            if (!bool.equals(bool2)) {
                                dateFormat2 = new C24d(bool, c24d3._locale, c24d3.A02, c24d3._tzSerializedWithColon);
                            }
                        }
                    }
                } else {
                    DateFormat dateFormat5 = (DateFormat) dateFormat4.clone();
                    dateFormat5.setTimeZone(A02);
                    dateFormat2 = dateFormat5;
                    if (bool != null) {
                        dateFormat5.setLenient(bool.booleanValue());
                        dateFormat2 = dateFormat5;
                    }
                }
                str = this._formatString;
                dateFormat3 = dateFormat2;
            } else if (bool != null) {
                DateFormat dateFormat6 = c27t._config._base._dateFormat;
                str = this._formatString;
                if (dateFormat6.getClass() == C24d.class) {
                    C24d c24d4 = (C24d) dateFormat6;
                    Boolean bool3 = c24d4._lenient;
                    C24d c24d5 = c24d4;
                    if (bool != bool3) {
                        c24d5 = c24d4;
                        if (!bool.equals(bool3)) {
                            c24d5 = new C24d(bool, c24d4._locale, c24d4.A02, c24d4._tzSerializedWithColon);
                        }
                    }
                    StringBuilder A0l = AnonymousClass001.A0l(100);
                    A0l.append("[one of: '");
                    A0l.append("yyyy-MM-dd'T'HH:mm:ss.SSSX");
                    A0l.append("', '");
                    A0l.append("EEE, dd MMM yyyy HH:mm:ss zzz");
                    A0l.append("' (");
                    A0l.append(Boolean.FALSE.equals(c24d5._lenient) ? "strict" : "lenient");
                    str = AnonymousClass001.A0d(")]", A0l);
                    dateFormat = c24d5;
                } else {
                    DateFormat dateFormat7 = (DateFormat) dateFormat6.clone();
                    dateFormat7.setLenient(bool.booleanValue());
                    boolean z = dateFormat7 instanceof SimpleDateFormat;
                    dateFormat = dateFormat7;
                    if (z) {
                        ((SimpleDateFormat) dateFormat7).toPattern();
                        dateFormat = dateFormat7;
                    }
                }
                dateFormat3 = dateFormat;
                if (str == null) {
                    str = "[unknown]";
                    dateFormat3 = dateFormat;
                }
            }
            return A12(str, dateFormat3);
        }
        return this;
    }
}
