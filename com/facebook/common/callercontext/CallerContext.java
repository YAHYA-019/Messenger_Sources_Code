package com.facebook.common.callercontext;

import X.1BL;
import X.1lN;
import X.AnonymousClass001;
import X.C01e;
import X.C2qv;
import X.C2xc;
import X.C46q;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: CallerContext.class */
public final class CallerContext implements Parcelable {
    public static boolean A07;
    public static final CallerContext A08 = new CallerContext();
    public static final Parcelable.Creator CREATOR = new C2xc(3);
    public int A00;
    public final ContextChain A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public CallerContext() {
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A06 = null;
    }

    public CallerContext(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = (ContextChain) 1BL.A0C(parcel, ContextChain.class);
        this.A06 = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    public CallerContext(ContextChain contextChain, Class cls, String str, String str2, String str3) {
        cls.getClass();
        this.A03 = C01e.A00(cls);
        this.A02 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = contextChain;
        this.A06 = null;
    }

    public CallerContext(ContextChain contextChain, String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = contextChain;
        this.A06 = null;
    }

    public CallerContext(ContextChain contextChain, String str, String str2, String str3, Map map) {
        this.A03 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A04 = "unknown";
        this.A01 = contextChain;
        this.A06 = map;
    }

    public CallerContext(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = null;
        this.A06 = null;
    }

    public static CallerContext A00(Context context) {
        if (context == null) {
            return null;
        }
        Class<?> cls = context.getClass();
        if (!1lN.class.isAssignableFrom(cls)) {
            return A0C(C01e.A00(cls), "unknown");
        }
        1lN r0 = (1lN) context;
        if (r0 != null) {
            return A08(r0.getClass(), r0.AWg());
        }
        return null;
    }

    public static CallerContext A01(CallerContext callerContext, ContextChain contextChain) {
        if (callerContext == null) {
            if (contextChain != null) {
                return A04(contextChain);
            }
            callerContext = null;
        } else if (contextChain != null) {
            return new CallerContext(contextChain, callerContext.A03, callerContext.A02, callerContext.A04, callerContext.A05);
        }
        return callerContext;
    }

    public static CallerContext A02(CallerContext callerContext, ContextChain contextChain, String str) {
        return new CallerContext(contextChain, callerContext.A03, callerContext.A02, str, callerContext.A05);
    }

    public static CallerContext A03(CallerContext callerContext, String str) {
        return callerContext.A04 != null ? callerContext : new CallerContext(callerContext.A03, callerContext.A02, str, callerContext.A05);
    }

    public static CallerContext A04(ContextChain contextChain) {
        return new CallerContext(contextChain, contextChain.A04, (String) null, (String) null, (String) null);
    }

    public static CallerContext A05(ContextChain contextChain, String str) {
        A0F(str);
        return new CallerContext(contextChain, str, (String) null, (String) null, (String) null);
    }

    public static CallerContext A06(Class cls) {
        return new CallerContext((ContextChain) null, cls, (String) null, (String) null, (String) null);
    }

    public static CallerContext A07(Class cls) {
        return new CallerContext(C01e.A00(cls), null, null, null);
    }

    public static CallerContext A08(Class cls, String str) {
        return new CallerContext((ContextChain) null, cls, str, str, str);
    }

    public static CallerContext A09(Class cls, String str) {
        return new CallerContext((ContextChain) null, cls, (String) null, str, (String) null);
    }

    public static CallerContext A0A(Class cls, String str, String str2) {
        return new CallerContext((ContextChain) null, cls, str, str2, str);
    }

    public static CallerContext A0B(String str) {
        A0F(str);
        return new CallerContext((ContextChain) null, str, (String) null, (String) null, (String) null);
    }

    public static CallerContext A0C(String str, String str2) {
        A0F(str);
        return new CallerContext(str, str2, str2, str2);
    }

    public static CallerContext A0D(String str, String str2) {
        A0F(str);
        return new CallerContext((ContextChain) null, str, (String) null, str2, (String) null);
    }

    public static CallerContext A0E(String str, String str2, String str3) {
        A0F(str);
        return new CallerContext((ContextChain) null, str, str2, str3, str2);
    }

    public static void A0F(String str) {
        if (str == null || str.isEmpty()) {
            throw AnonymousClass001.A0L("callingClassName for the CallerContext cannot be null nor empty.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CallerContext)) {
            return false;
        }
        CallerContext callerContext = (CallerContext) obj;
        return C2qv.A01(this.A03, callerContext.A03) && C2qv.A01(this.A02, callerContext.A02) && C2qv.A01(this.A04, callerContext.A04) && C2qv.A01(this.A05, callerContext.A05) && C2qv.A01(this.A01, callerContext.A01) && C2qv.A01(this.A06, callerContext.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r303 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int hashCode() {
        /*
            r301 = this;
            boolean r0 = com.facebook.common.callercontext.CallerContext.A07
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L11
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L61
        L11:
            r0 = r301
            java.lang.String r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L63
            r0 = r304
            int r0 = r0.hashCode()
            r305 = r0
        L20:
            r0 = r301
            java.lang.String r0 = r0.A02
            r1 = r305
            int r0 = X.C5B9.A00(r0, r1)
            r305 = r0
            r0 = r301
            java.lang.String r0 = r0.A04
            r1 = r305
            int r0 = X.C5B9.A00(r0, r1)
            r305 = r0
            r0 = r301
            java.lang.String r0 = r0.A05
            r1 = r305
            int r0 = X.C5B9.A00(r0, r1)
            r305 = r0
            r0 = r301
            com.facebook.common.callercontext.ContextChain r0 = r0.A01
            r1 = r305
            int r0 = X.C5B9.A00(r0, r1)
            r305 = r0
            r0 = r301
            java.util.Map r0 = r0.A06
            r304 = r0
            r0 = r304
            r1 = r305
            int r0 = X.C5B9.A00(r0, r1)
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L61
            r0 = r301
            r1 = r303
            r0.A00 = r1
        L61:
            r0 = r303
            return r0
        L63:
            r0 = 0
            r305 = r0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.callercontext.CallerContext.hashCode():int");
    }

    public String toString() {
        C46q A00 = C2qv.A00(this);
        C46q.A00(A00, this.A03, "Calling Class Name");
        C46q.A00(A00, this.A02, "Analytics Tag");
        C46q.A00(A00, this.A04, "Feature tag");
        C46q.A00(A00, this.A05, "Module Analytics Tag");
        C46q.A00(A00, this.A01, "Context Chain");
        C46q.A00(A00, this.A06, "Request Tags");
        return A00.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeMap(this.A06);
    }
}
