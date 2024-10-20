package com.facebook.zero.common;

import X.0fH;
import X.1BK;
import X.2BU;
import X.2Bc;
import X.2Bd;
import X.3HM;
import X.AnonymousClass001;
import X.AnonymousClass243;
import X.C2xc;
import X.F2L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: ZeroToken.class */
public final class ZeroToken implements Parcelable {
    public static final ZeroToken A0N;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final int A01;
    public final ZeroDogfoodingSettingsParams A02;
    public final 2BU A03;
    public final ZeroTrafficEnforcementConfig A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableMap A08;
    public final ImmutableSet A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;

    static {
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
        A0N = new ZeroToken(null, new 2BU(), ZeroTrafficEnforcementConfig.A00, ImmutableList.of(), ImmutableList.of(), ImmutableList.of(), RegularImmutableMap.A03, regularImmutableSet, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0);
        CREATOR = new C2xc(71);
    }

    public ZeroToken(Parcel parcel) {
        ImmutableMap immutableMap;
        ZeroDogfoodingSettingsParams zeroDogfoodingSettingsParams;
        this.A0A = parcel.readString();
        this.A0K = parcel.readString();
        this.A0J = parcel.readString();
        this.A0D = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A01 = parcel.readInt();
        this.A09 = ImmutableSet.A07(2Bc.A00(parcel.createStringArrayList()));
        Parcelable.Creator creator = ZeroUrlRewriteRule.CREATOR;
        this.A06 = ImmutableList.copyOf((Collection) parcel.createTypedArrayList(creator));
        this.A0M = parcel.readString();
        this.A05 = ImmutableList.copyOf((Collection) parcel.createTypedArrayList(creator));
        this.A0L = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0G = parcel.readString();
        AbstractMap abstractMap = (AbstractMap) parcel.readBundle().getSerializable("zero_pool_pricing_map_serializable");
        ImmutableMap.Builder A0c = 1BK.A0c();
        if (abstractMap != null) {
            Iterator A0x = AnonymousClass001.A0x(abstractMap);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                A0c.put(A0z.getKey(), A0z.getValue());
            }
            immutableMap = A0c.build();
        } else {
            immutableMap = null;
        }
        this.A08 = immutableMap;
        this.A0I = parcel.readString();
        this.A0H = parcel.readString();
        this.A0F = parcel.readString();
        String readString = parcel.readString();
        ZeroTrafficEnforcementConfig zeroTrafficEnforcementConfig = ZeroTrafficEnforcementConfig.A00;
        try {
            zeroTrafficEnforcementConfig = (ZeroTrafficEnforcementConfig) AnonymousClass243.A00().A0V(readString, ZeroTrafficEnforcementConfig.class);
        } catch (IOException e) {
            0fH.A0H(3HM.class, "Error deserializing zero traffic enforcement config", e);
        }
        this.A04 = zeroTrafficEnforcementConfig;
        this.A07 = F2L.A00(parcel.readString());
        try {
            zeroDogfoodingSettingsParams = (ZeroDogfoodingSettingsParams) AnonymousClass243.A00().A0V(parcel.readString(), ZeroDogfoodingSettingsParams.class);
        } catch (IOException unused) {
            zeroDogfoodingSettingsParams = null;
        }
        this.A02 = zeroDogfoodingSettingsParams;
        this.A03 = 2Bd.A00(parcel.readString());
        this.A0E = parcel.readString();
    }

    public ZeroToken(ZeroDogfoodingSettingsParams zeroDogfoodingSettingsParams, 2BU r303, ZeroTrafficEnforcementConfig zeroTrafficEnforcementConfig, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableMap immutableMap, ImmutableSet immutableSet, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2) {
        this.A0A = str;
        this.A0K = str2;
        this.A0J = str3;
        this.A0D = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A09 = immutableSet;
        this.A03 = r303;
        this.A06 = immutableList;
        this.A0M = str7;
        this.A05 = immutableList2;
        this.A08 = immutableMap;
        this.A0I = str10;
        this.A0H = str11;
        this.A00 = i2;
        this.A01 = i;
        this.A0L = str8;
        this.A0G = str9;
        this.A0F = str12;
        this.A04 = zeroTrafficEnforcementConfig;
        this.A07 = immutableList3;
        this.A02 = zeroDogfoodingSettingsParams;
        this.A0E = str13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof ZeroToken) {
            ZeroToken zeroToken = (ZeroToken) obj;
            if (Objects.equal(this.A0B, zeroToken.A0B) && Objects.equal(this.A0A, zeroToken.A0A) && Objects.equal(this.A0K, zeroToken.A0K) && Objects.equal(this.A0J, zeroToken.A0J) && Objects.equal(this.A0D, zeroToken.A0D) && Objects.equal(this.A0C, zeroToken.A0C) && Objects.equal(Integer.valueOf(this.A01), Integer.valueOf(zeroToken.A01)) && Objects.equal(this.A09, zeroToken.A09) && Objects.equal(this.A03, zeroToken.A03) && Objects.equal(this.A06, zeroToken.A06) && Objects.equal(this.A0M, zeroToken.A0M) && Objects.equal(this.A05, zeroToken.A05) && Objects.equal(this.A0G, zeroToken.A0G) && Objects.equal(this.A08, zeroToken.A08) && Objects.equal(this.A0I, zeroToken.A0I) && Objects.equal(this.A0H, zeroToken.A0H) && Objects.equal(this.A0F, zeroToken.A0F) && Objects.equal(this.A0E, zeroToken.A0E) && Objects.equal(this.A0L, zeroToken.A0L)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0A, this.A0K, this.A0J, this.A0D, this.A0B, this.A0C, Integer.valueOf(this.A01), this.A09, this.A03, this.A06, this.A0M, this.A05, this.A0L, this.A0G, this.A08, this.A0I, this.A0H, this.A0F, this.A0E});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("campaignId", this.A0A);
        stringHelper.add("status", this.A0K);
        stringHelper.add("regStatus", this.A0J);
        stringHelper.add("carrierName", this.A0D);
        stringHelper.add("carrierId", this.A0B);
        stringHelper.add("carrierLogoUrl", this.A0C);
        stringHelper.add("ttl", this.A01);
        stringHelper.add("enabledUiFeatures", this.A09);
        stringHelper.add("enabledFeaturesWithExperiments", this.A03);
        stringHelper.add("rewriteRules", this.A06);
        stringHelper.add("unregistered_reason", this.A0M);
        stringHelper.add("backupRewriteRules", this.A05);
        stringHelper.add("tokenHash", this.A0L);
        stringHelper.add("requestTime", this.A00);
        stringHelper.add("fastTokenHash", this.A0G);
        stringHelper.add("poolPricingMap", this.A08);
        stringHelper.add("mqttHost", this.A0I);
        stringHelper.add("fbnsHost", this.A0H);
        stringHelper.add("eligibilityHash", this.A0F);
        stringHelper.add("ZeroTrafficEnforcementConfig", this.A04);
        stringHelper.add("statusUpdateContent", this.A07);
        stringHelper.add("chatDHost", this.A0E);
        return stringHelper.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.common.ZeroToken.writeToParcel(android.os.Parcel, int):void");
    }
}
