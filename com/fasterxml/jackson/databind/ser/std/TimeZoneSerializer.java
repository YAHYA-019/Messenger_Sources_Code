package com.fasterxml.jackson.databind.ser.std;

import X.28Q;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;
import java.util.TimeZone;

/* loaded from: TimeZoneSerializer.class */
public class TimeZoneSerializer extends StdScalarSerializer {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        TimeZone timeZone = (TimeZone) obj;
        Kls A03 = c4Nr.A03(C42h.A0C, timeZone);
        A03.A01 = TimeZone.class;
        Kls A01 = c4Nr.A01(r302, A03);
        r302.A0r(timeZone.getID());
        c4Nr.A02(r302, A01);
    }
}
