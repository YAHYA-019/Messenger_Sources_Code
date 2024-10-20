package com.fasterxml.jackson.databind.ser.std;

import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.C27r;
import X.C42h;
import X.C4Nr;
import X.Kls;
import java.net.InetAddress;

/* loaded from: InetAddressSerializer.class */
public class InetAddressSerializer extends StdScalarSerializer implements C27r {
    public final boolean _asNumeric;

    public InetAddressSerializer() {
        this(false);
    }

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this._asNumeric = z;
    }

    public static void A03(28Q r301, InetAddressSerializer inetAddressSerializer, InetAddress inetAddress) {
        String trim;
        if (inetAddressSerializer._asNumeric) {
            trim = inetAddress.getHostAddress();
        } else {
            trim = inetAddress.toString().trim();
            int indexOf = trim.indexOf(47);
            if (indexOf >= 0) {
                trim = indexOf == 0 ? trim.substring(1) : AnonymousClass001.A0c(trim, indexOf);
            }
        }
        r301.A0r(trim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        Kls A03 = c4Nr.A03(C42h.A0C, inetAddress);
        A03.A01 = InetAddress.class;
        Kls A01 = c4Nr.A01(r302, A03);
        A03(r302, this, inetAddress);
        c4Nr.A02(r302, A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            r301 = this;
            r0 = r301
            java.lang.Class r0 = r0._handledType
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            X.25s r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r0, r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L48
            r0 = r304
            X.25t r0 = r0._shape
            r305 = r0
            r0 = r305
            boolean r0 = r0.A00()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L2c
            X.25t r0 = X.C25t.ARRAY
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L48
        L2c:
            r0 = 1
            r307 = r0
        L2f:
            r0 = r301
            boolean r0 = r0._asNumeric
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 == r1) goto L51
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r0 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r304 = r0
            r0 = r304
            r1 = r307
            r0.<init>(r1)
            r0 = r304
            return r0
        L48:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
            goto L2f
        L51:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
