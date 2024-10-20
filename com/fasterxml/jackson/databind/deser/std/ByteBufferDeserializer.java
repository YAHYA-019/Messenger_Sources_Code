package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C24e;
import X.C27T;
import java.nio.ByteBuffer;

/* loaded from: ByteBufferDeserializer.class */
public class ByteBufferDeserializer extends StdScalarDeserializer {
    public static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super(ByteBuffer.class);
    }

    public static void A00(AbstractC01033pi abstractC01033pi) {
        ByteBuffer.wrap(abstractC01033pi.A1w(C24e.A01));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return ByteBuffer.wrap(abstractC01033pi.A1w(C24e.A01));
    }
}
