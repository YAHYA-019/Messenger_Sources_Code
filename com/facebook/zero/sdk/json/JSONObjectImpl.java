package com.facebook.zero.sdk.json;

import X.11T;
import X.1BL;
import X.1Pr;
import X.24X;
import X.2DM;
import X.AnonymousClass243;
import X.DKC;
import X.DKE;
import X.F9f;
import java.util.Iterator;

/* loaded from: JSONObjectImpl.class */
public final class JSONObjectImpl {
    public 24X nodeInner;

    public JSONObjectImpl() {
        24X A0I = AnonymousClass243.A00().A0I("{}");
        11T.A0A(A0I);
        this.nodeInner = A0I;
    }

    public F9f A00(String str) {
        11T.A0F(str, 0);
        24X A0D = this.nodeInner.A0D(str);
        if (A0D != null) {
            return new F9f(A0D);
        }
        throw DKE.A0o(str, " not found");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.facebook.zero.sdk.json.JSONObjectImpl] */
    public JSONObjectImpl A01(String str) {
        11T.A0F(str, 0);
        24X A0D = this.nodeInner.A0D(str);
        if (A0D == null) {
            throw DKE.A0o(str, " not found");
        }
        if (!(A0D instanceof 2DM)) {
            throw DKE.A0o(str, " is not of type JSONObject");
        }
        ?? obj = new Object();
        obj.nodeInner = A0D;
        return obj;
    }

    public 1Pr A02() {
        1Pr r0 = new 1Pr();
        Iterator A0M = this.nodeInner.A0M();
        while (A0M.hasNext()) {
            r0.A00(A0M.next());
        }
        return r0;
    }

    public 1Pr A03(String str) {
        24X A0D = this.nodeInner.A0D(str);
        if (A0D == null) {
            throw DKE.A0o(str, " not found");
        }
        if (!A0D.A0R()) {
            throw DKE.A0o(str, " not an array");
        }
        1Pr r0 = new 1Pr();
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            24X A0j = DKC.A0j(it);
            11T.A0D(A0j);
            r0.A00(new F9f(A0j));
        }
        return r0;
    }

    public Long A04(String str) {
        24X A0D = this.nodeInner.A0D(str);
        if (A0D == null) {
            throw DKE.A0o(str, " not found");
        }
        if (A0D.A0T()) {
            return Long.valueOf(A0D.A07());
        }
        throw DKE.A0o(str, " not numeric");
    }

    public String A05(String str) {
        11T.A0F(str, 0);
        24X A0D = this.nodeInner.A0D(str);
        if (A0D == null) {
            throw DKE.A0o(str, " not found");
        }
        if (!A0D.A0Y()) {
            throw DKE.A0o(str, " is not of type String");
        }
        String A0H = A0D.A0H();
        11T.A0A(A0H);
        return A0H;
    }

    public boolean A06(String str) {
        24X A0D = this.nodeInner.A0D(str);
        if (A0D == null) {
            throw DKE.A0o(str, " not found");
        }
        if (A0D.A0V()) {
            return A0D.A0O();
        }
        throw DKE.A0o(str, " is not of type Boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        return 11T.A0O(this.nodeInner, ((JSONObjectImpl) obj).nodeInner);
    }

    public int hashCode() {
        return this.nodeInner.hashCode();
    }

    public String toString() {
        return 11T.A02(this.nodeInner);
    }
}
