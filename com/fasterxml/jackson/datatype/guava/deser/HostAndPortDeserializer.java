package com.fasterxml.jackson.datatype.guava.deser;

import X.3eX;
import X.C27T;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

/* loaded from: HostAndPortDeserializer.class */
public class HostAndPortDeserializer extends FromStringDeserializer {
    public static final HostAndPortDeserializer A00 = new HostAndPortDeserializer();
    public static final long serialVersionUID = 1;

    public HostAndPortDeserializer() {
        super(3eX.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r0 > ((char) (-1))) goto L16;
     */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.3eX A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            r301 = this;
            X.42h r0 = X.C42h.A06
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.A1u(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lac
            r0 = r302
            X.24a r0 = r0.A1N()
            X.24X r0 = (X.24X) r0
            r306 = r0
            r0 = r306
            java.lang.String r1 = "host"
            X.24X r0 = r0.A0D(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L45
            r0 = r306
            java.lang.String r1 = "hostText"
            X.24X r0 = r0.A0E(r1)
            r304 = r0
            r0 = r304
            java.lang.String r0 = r0.A0H()
            r307 = r0
        L33:
            r0 = r306
            java.lang.String r1 = "port"
            X.24X r0 = r0.A0D(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L4e
            r0 = r307
            X.3eX r0 = X.3eX.A00(r0)
            return r0
        L45:
            r0 = r304
            java.lang.String r0 = r0.A0I()
            r307 = r0
            goto L33
        L4e:
            r0 = r304
            int r0 = r0.A03()
            r308 = r0
            r0 = r308
            if (r0 < 0) goto L67
            r0 = -1
            char r0 = (char) r0
            r305 = r0
            r0 = 1
            r309 = r0
            r0 = r308
            r1 = r305
            if (r0 <= r1) goto L6d
        L67:
            r0 = 0
            r309 = r0
            r0 = 0
            r306 = r0
        L6d:
            r0 = r309
            java.lang.String r1 = "Port out of range: %s"
            r2 = r308
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            r0 = r307
            X.3eX r0 = X.3eX.A00(r0)
            r310 = r0
            r0 = r310
            int r0 = r0.port
            boolean r0 = X.1BL.A1S(r0)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r1 = "Host has a port: %s"
            r2 = r307
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            r0 = r310
            java.lang.String r0 = r0.host
            r307 = r0
            r0 = r310
            boolean r0 = r0.hasBracketlessColons
            r309 = r0
            X.3eX r0 = new X.3eX
            r304 = r0
            r0 = r304
            r1 = r307
            r2 = r308
            r3 = r309
            r0.<init>(r1, r2, r3)
            r0 = r304
            return r0
        Lac:
            r0 = r301
            r1 = r302
            r2 = r303
            java.lang.Object r0 = super.A0M(r1, r2)
            X.3eX r0 = (X.3eX) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer.A0M(X.3pi, X.27T):X.3eX");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ Object A14(C27T c27t, String str) {
        return 3eX.A00(str);
    }
}
