package com.fasterxml.jackson.databind.deser.std;

import X.C42x;

/* loaded from: NumberDeserializers$ShortDeserializer.class */
public class NumberDeserializers$ShortDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$ShortDeserializer A00;
    public static final NumberDeserializers$ShortDeserializer A01;
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Short.TYPE;
        C42x c42x = C42x.Integer;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, cls, (short) 0, (short) 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, Short.class, null, (short) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011f, code lost:
    
        if (r0 == X.C25m.AsEmpty) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (r0 > 32767) goto L35;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Short A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer.A0M(X.3pi, X.27T):java.lang.Short");
    }
}
