package com.fasterxml.jackson.databind.ser.std;

import X.28Q;
import X.C26c;
import X.C4Nr;

/* loaded from: StringSerializer.class */
public final class StringSerializer extends StdScalarSerializer {
    public static final long serialVersionUID = 1;

    public StringSerializer() {
        super(String.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        r302.A0r((String) obj);
    }
}
