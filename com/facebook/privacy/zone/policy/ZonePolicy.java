package com.facebook.privacy.zone.policy;

import X.11T;
import X.1BL;
import X.5gT;
import X.5gU;
import X.7tQ;
import X.82N;
import X.C00t;
import X.C82e;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ZonePolicy.class */
public final class ZonePolicy implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ZonePolicy[] A01;
    public static final ZonePolicy A02;
    public static final ZonePolicy A03;
    public static final ZonePolicy A04;
    public static final ZonePolicy A05;
    public static final ZonePolicy A06;
    public static final ZonePolicy A07;
    public static final ZonePolicy A08;
    public static final ZonePolicy A09;
    public static final ZonePolicy A0A;
    public static final ZonePolicy A0B;
    public static final ZonePolicy A0C;
    public static final ZonePolicy A0D;
    public static final ZonePolicy A0E;
    public static final ZonePolicy A0F;
    public static final ZonePolicy A0G;
    public static final ZonePolicy A0H;
    public static final Parcelable.Creator CREATOR;
    public final 5gU enforcementMode;
    public final 5gT purposePolicy;

    static {
        5gT r0 = 5gT.A02;
        5gU r02 = 5gU.A03;
        ZonePolicy zonePolicy = new ZonePolicy(r02, r0, "ALLOW_ALL_POLICY", 0);
        A03 = zonePolicy;
        ZonePolicy zonePolicy2 = new ZonePolicy(r02, 5gT.A09, "ACCESS_TOKEN_POLICY", 1);
        A02 = zonePolicy2;
        5gT r03 = 5gT.A03;
        ZonePolicy zonePolicy3 = new ZonePolicy(r02, r03, "DEFAULT_PURPOSES_OPERATIONAL_POLICY", 2);
        A04 = zonePolicy3;
        5gU r04 = 5gU.A02;
        ZonePolicy zonePolicy4 = new ZonePolicy(r04, r03, "DEFAULT_PURPOSES_OPERATIONAL_STRICT_POLICY", 3);
        A05 = zonePolicy4;
        ZonePolicy zonePolicy5 = new ZonePolicy(r02, 5gT.A0A, "FAMILY_DEVICE_ID_POLICY", 4);
        A06 = zonePolicy5;
        ZonePolicy zonePolicy6 = new ZonePolicy(r02, 5gT.A04, "INFRASTRUCTURE_ANALYTICS_POLICY", 5);
        A07 = zonePolicy6;
        ZonePolicy zonePolicy7 = new ZonePolicy(r02, 5gT.A06, "MESSAGING_ARMADILLO_METADATA", 6);
        A09 = zonePolicy7;
        5gT r05 = 5gT.A0D;
        ZonePolicy zonePolicy8 = new ZonePolicy(r02, r05, "MESSAGING_CONTENT_E2EE_POLICY", 7);
        A0B = zonePolicy8;
        5gT r06 = 5gT.A0E;
        ZonePolicy zonePolicy9 = new ZonePolicy(r02, r06, "MESSAGING_CONTENT_OPEN_POLICY", 8);
        A0D = zonePolicy9;
        ZonePolicy zonePolicy10 = new ZonePolicy(r02, 5gT.A0C, "MESSAGING_CONTENT_DEBUGGING_POLICY", 9);
        A0A = zonePolicy10;
        ZonePolicy zonePolicy11 = new ZonePolicy(r02, 5gT.A05, "MESSAGE_CONTENT_DATA_TYPE", 10);
        A08 = zonePolicy11;
        ZonePolicy zonePolicy12 = new ZonePolicy(r04, r05, "MESSAGING_CONTENT_E2EE_STRICT_POLICY", 11);
        A0C = zonePolicy12;
        ZonePolicy zonePolicy13 = new ZonePolicy(r04, r06, "MESSAGING_CONTENT_OPEN_STRICT_POLICY", 12);
        A0E = zonePolicy13;
        ZonePolicy zonePolicy14 = new ZonePolicy(r02, 5gT.A08, "MESSAGING_TRAFFIC_METADATA", 13);
        A0G = zonePolicy14;
        ZonePolicy zonePolicy15 = new ZonePolicy(r02, 5gT.A0F, "SENSITIVE_DATA_NO_ADS", 14);
        A0H = zonePolicy15;
        ZonePolicy zonePolicy16 = new ZonePolicy(r02, 5gT.A07, "MESSAGING_CONTENT_POLICY", 15);
        A0F = zonePolicy16;
        ZonePolicy[] zonePolicyArr = {zonePolicy, zonePolicy2, zonePolicy3, zonePolicy4, zonePolicy5, zonePolicy6, zonePolicy7, zonePolicy8, zonePolicy9, zonePolicy10, zonePolicy11, zonePolicy12, zonePolicy13, zonePolicy14, zonePolicy15, zonePolicy16};
        A01 = zonePolicyArr;
        A00 = C00t.A00(zonePolicyArr);
        CREATOR = new 82N(1);
    }

    public ZonePolicy(5gU r302, 5gT r303, String str, int i) {
        this.purposePolicy = r303;
        this.enforcementMode = r302;
    }

    public static ZonePolicy valueOf(String str) {
        return (ZonePolicy) Enum.valueOf(ZonePolicy.class, str);
    }

    public static ZonePolicy[] values() {
        return (ZonePolicy[]) A01.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r303 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A00() {
        /*
            r301 = this;
            java.util.Map r0 = X.7tQ.A00
            r302 = r0
            r0 = r301
            X.5gT r0 = r0.purposePolicy
            r303 = r0
            r0 = r302
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            X.82e r0 = (X.C82e) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L21
            r0 = r303
            java.lang.String r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L24
        L21:
            java.lang.String r0 = ""
            r303 = r0
        L24:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.privacy.zone.policy.ZonePolicy.A00():java.lang.String");
    }

    public final String A01() {
        C82e c82e = (C82e) 7tQ.A00.get(this.purposePolicy);
        return String.valueOf(c82e != null ? Integer.valueOf(c82e.A01) : null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this);
    }
}
