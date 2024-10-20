package com.shopify.checkout.models;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.5Yu;
import X.5ZL;
import X.5ZR;
import X.7mU;
import X.7zN;
import X.AnonymousClass001;
import X.DKH;
import X.LwC;
import java.util.Map;

/* loaded from: NetworkRequestPayload.class */
public final class NetworkRequestPayload {
    public static final 5Yu[] A06;
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    /* loaded from: NetworkRequestPayload$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LwC.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.shopify.checkout.models.NetworkRequestPayload$Companion] */
    static {
        5ZL r0 = 5ZL.A01;
        A06 = new 5Yu[]{null, null, null, new 5ZR(r0, r0), null, null};
    }

    public /* synthetic */ NetworkRequestPayload(String str, String str2, String str3, String str4, String str5, Map map, int i) {
        if (63 != (i & 63)) {
            7mU.A00(LwC.A01, i, 63);
            throw 0Q8.createAndThrow();
        }
        this.A04 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A05 = map;
        this.A01 = str4;
        this.A03 = str5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NetworkRequestPayload)) {
                return false;
            }
            NetworkRequestPayload networkRequestPayload = (NetworkRequestPayload) obj;
            if (!11T.A0O(this.A04, networkRequestPayload.A04) || !11T.A0O(this.A02, networkRequestPayload.A02) || !11T.A0O(this.A00, networkRequestPayload.A00) || !11T.A0O(this.A05, networkRequestPayload.A05) || !11T.A0O(this.A01, networkRequestPayload.A01) || !11T.A0O(this.A03, networkRequestPayload.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((1BL.A05(this.A04) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A00)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 1BL.A05(this.A01)) * 31) + 7zN.A05(this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NetworkRequestPayload(url=");
        A0k.append(this.A04);
        A0k.append(", method=");
        A0k.append(this.A02);
        A0k.append(", body=");
        A0k.append(this.A00);
        A0k.append(", headers=");
        A0k.append(this.A05);
        A0k.append(", initiatorType=");
        A0k.append(this.A01);
        A0k.append(1BJ.A00(615));
        return DKH.A0o(this.A03, A0k);
    }
}
