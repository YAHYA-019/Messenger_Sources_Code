package com.fasterxml.jackson.datatype.guava.deser;

import X.3TD;
import X.C27T;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.base.CharMatcher;

/* loaded from: InternetDomainNameDeserializer.class */
public class InternetDomainNameDeserializer extends FromStringDeserializer {
    public static final InternetDomainNameDeserializer A00 = new InternetDomainNameDeserializer();
    public static final long serialVersionUID = 1;

    public InternetDomainNameDeserializer() {
        super(3TD.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ Object A14(C27T c27t, String str) {
        CharMatcher charMatcher = 3TD.A02;
        str.getClass();
        return new 3TD(str);
    }
}
