package com.facebook.interstitial.triggers;

import X.0J6;
import X.11T;
import X.C2xc;
import X.DKB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: InterstitialTriggerContext.class */
public final class InterstitialTriggerContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(11);
    public final ImmutableMap A00;
    public final boolean A01;

    public InterstitialTriggerContext() {
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        11T.A0A(immutableMap);
        this.A00 = immutableMap;
        this.A01 = false;
    }

    public InterstitialTriggerContext(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(HashMap.class.getClassLoader());
        11T.A0I(readHashMap, DKB.A00(28));
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) readHashMap);
        11T.A0A(copyOf);
        this.A00 = copyOf;
        this.A01 = parcel.readInt() != 1 ? false : true;
    }

    public InterstitialTriggerContext(Map map) {
        ImmutableMap copyOf = ImmutableMap.copyOf(map);
        11T.A0A(copyOf);
        this.A00 = copyOf;
        this.A01 = false;
    }

    public InterstitialTriggerContext(Map map, boolean z) {
        ImmutableMap copyOf = ImmutableMap.copyOf(map);
        11T.A0A(copyOf);
        this.A00 = copyOf;
        this.A01 = true;
    }

    public final String A00(String str) {
        String str2 = (String) this.A00.get(str);
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r301.A01 != r0.A01) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.interstitial.triggers.InterstitialTriggerContext
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L39
            r0 = r301
            com.google.common.collect.ImmutableMap r0 = r0.A00
            r304 = r0
            r0 = r302
            com.facebook.interstitial.triggers.InterstitialTriggerContext r0 = (com.facebook.interstitial.triggers.InterstitialTriggerContext) r0
            r302 = r0
            r0 = r302
            com.google.common.collect.ImmutableMap r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L39
            r0 = r301
            boolean r0 = r0.A01
            r306 = r0
            r0 = r302
            boolean r0 = r0.A01
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L3e
        L39:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L3e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.interstitial.triggers.InterstitialTriggerContext.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return 0J6.A00(this.A00, Boolean.valueOf(this.A01));
    }

    public String toString() {
        return 11T.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeMap(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
