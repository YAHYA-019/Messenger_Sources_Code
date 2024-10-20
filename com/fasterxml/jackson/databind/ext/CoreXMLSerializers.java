package com.fasterxml.jackson.databind.ext;

import X.24S;
import X.28Q;
import X.68U;
import X.AnonymousClass251;
import X.C25p;
import X.C26c;
import X.C27r;
import X.C28j;
import X.C42h;
import X.C4Nr;
import X.JQy;
import X.Kls;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* loaded from: CoreXMLSerializers.class */
public class CoreXMLSerializers extends C28j {

    /* loaded from: CoreXMLSerializers$XMLGregorianCalendarSerializer.class */
    public class XMLGregorianCalendarSerializer extends StdSerializer implements C27r {
        public static final XMLGregorianCalendarSerializer A00 = new XMLGregorianCalendarSerializer();
        public final JsonSerializer _delegate;

        public XMLGregorianCalendarSerializer() {
            this(CalendarSerializer.A00);
        }

        public XMLGregorianCalendarSerializer(JsonSerializer jsonSerializer) {
            super(XMLGregorianCalendar.class);
            this._delegate = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            Kls A03 = c4Nr.A03(C42h.A0C, xMLGregorianCalendar);
            A03.A01 = XMLGregorianCalendar.class;
            Kls A01 = c4Nr.A01(r302, A03);
            this._delegate.A0A(r302, c26c, xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar());
            c4Nr.A02(r302, A01);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            this._delegate.A0A(r302, c26c, xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar());
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            return this._delegate.A0B(c26c, xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar());
        }

        @Override // X.C27r
        public JsonSerializer AJN(68U r302, C26c c26c) {
            JsonSerializer jsonSerializer = this._delegate;
            if (jsonSerializer != null) {
                jsonSerializer = JQy.A0b(r302, jsonSerializer, c26c, jsonSerializer instanceof C27r ? 1 : 0);
            }
            return jsonSerializer != this._delegate ? new XMLGregorianCalendarSerializer(jsonSerializer) : this;
        }
    }

    @Override // X.C28j
    public JsonSerializer ASy(24S r302, C25p c25p, AnonymousClass251 anonymousClass251) {
        Class cls = r302._class;
        if (Duration.class.isAssignableFrom(cls) || QName.class.isAssignableFrom(cls)) {
            return ToStringSerializer.A00;
        }
        if (XMLGregorianCalendar.class.isAssignableFrom(cls)) {
            return XMLGregorianCalendarSerializer.A00;
        }
        return null;
    }
}
