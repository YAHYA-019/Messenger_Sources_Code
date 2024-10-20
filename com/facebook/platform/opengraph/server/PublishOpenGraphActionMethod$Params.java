package com.facebook.platform.opengraph.server;

import X.11T;
import X.1BK;
import X.24X;
import X.2DM;
import X.4YU;
import X.7zM;
import X.AbF;
import X.AbJ;
import X.AnonymousClass001;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.platform.server.protocol.ProxiedAppMethodParams;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: PublishOpenGraphActionMethod$Params.class */
public final class PublishOpenGraphActionMethod$Params extends ProxiedAppMethodParams {
    public static final Parcelable.Creator CREATOR = new FKW(38);
    public final String A00;
    public final HashMap A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final HashSet A06;
    public final boolean A07;
    public final boolean A08;

    public PublishOpenGraphActionMethod$Params(2DM r302, String str, String str2, String str3, String str4, Set set) {
        super(str2, str3, str4);
        this.A00 = str;
        this.A02 = "message";
        this.A06 = AbF.A1E(set);
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A08 = false;
        this.A07 = false;
        this.A01 = AnonymousClass001.A0u();
        Iterator A0N = r302.A0N();
        11T.A0A(A0N);
        while (A0N.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0N);
            Object key = A0z.getKey();
            24X r0 = (24X) A0z.getValue();
            String A0H = r0.A0Y() ? r0.A0H() : r0.toString();
            HashMap hashMap = this.A01;
            11T.A0D(A0H);
            hashMap.put(key, A0H);
        }
    }

    public PublishOpenGraphActionMethod$Params(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = readString;
        Serializable readSerializable = parcel.readSerializable();
        11T.A0I(readSerializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        this.A01 = (HashMap) readSerializable;
        Serializable readSerializable2 = parcel.readSerializable();
        11T.A0I(readSerializable2, "null cannot be cast to non-null type java.util.HashSet<kotlin.Long>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.Long> }");
        this.A06 = (HashSet) readSerializable2;
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A07 = AbJ.A1W(parcel);
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString2;
    }

    @Override // com.facebook.platform.server.protocol.ProxiedAppMethodParams
    public void A00(List list) {
        super.A00(list);
        list.add(new BasicNameValuePair("user_selected_tags", String.valueOf(this.A08)));
        list.add(new BasicNameValuePair("user_selected_place", String.valueOf(this.A07)));
        HashMap hashMap = this.A01;
        Iterator A19 = 1BK.A19(hashMap);
        while (A19.hasNext()) {
            String A0i = AnonymousClass001.A0i(A19);
            list.add(new BasicNameValuePair(A0i, 4YU.A16(A0i, hashMap)));
        }
        String str = this.A03;
        if (str != null) {
            list.add(new BasicNameValuePair("message", str));
        }
        HashSet hashSet = this.A06;
        if (7zM.A1b(hashSet)) {
            list.add(new BasicNameValuePair("tags", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, hashSet)));
        }
        String str2 = this.A05;
        if (str2 != null) {
            list.add(new BasicNameValuePair("place", str2));
        }
        String str3 = this.A04;
        if (str3 != null) {
            list.add(new BasicNameValuePair("privacy", str3));
        }
        list.add(new BasicNameValuePair("fb:channel", this.A02));
    }

    @Override // com.facebook.platform.server.protocol.ProxiedAppMethodParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeSerializable(this.A01);
        parcel.writeSerializable(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
