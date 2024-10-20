package com.facebook.common.json;

import X.28Q;
import X.2LD;
import X.3sP;
import X.3sR;
import X.AnonymousClass001;
import X.AnonymousClass259;
import X.C26c;
import X.C42f;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: FbSerializerProvider$6.class */
public class FbSerializerProvider$6 extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v28, types: [X.Jxb, java.lang.Throwable, X.2LD, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.Jxb, java.lang.Throwable, X.2LD, java.io.IOException] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        String A1b;
        Map map = (Map) obj;
        r302.A0b();
        for (Object obj2 : map.keySet()) {
            if (obj2 instanceof String) {
                A1b = (String) obj2;
            } else {
                if (!(obj2 instanceof Enum)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Non-string, non-enum key (");
                    A0k.append(obj2.getClass());
                    ?? iOException = new IOException(AnonymousClass001.A0d(") found in map.", A0k), null);
                    ((2LD) iOException)._location = null;
                    iOException.A00 = null;
                    throw iOException;
                }
                AnonymousClass259 A0A = r302.A0L().A0A();
                StringWriter stringWriter = new StringWriter();
                3sP A07 = A0A.A07(stringWriter);
                ((3sR) A07).A01 = r302.A0L();
                A07.A0P(obj2);
                A07.flush();
                C42f A05 = A0A.A05(stringWriter.toString());
                A1b = A05.A1b();
                if (A1b == null || A05.A1K() != null) {
                    ?? iOException2 = new IOException(AnonymousClass001.A0Z(stringWriter, "Tried to use json as map key, but it is not a string: ", AnonymousClass001.A0k()), null);
                    ((2LD) iOException2)._location = null;
                    iOException2.A00 = null;
                    throw iOException2;
                }
            }
            r302.A0o(A1b);
            r302.A0P(map.get(obj2));
        }
        r302.A0Y();
    }
}
