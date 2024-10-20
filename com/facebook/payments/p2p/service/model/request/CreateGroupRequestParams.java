package com.facebook.payments.p2p.service.model.request;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: CreateGroupRequestParams.class */
public final class CreateGroupRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(16);
    public final MediaResource A00;
    public final ImmutableMap A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public CreateGroupRequestParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        HashMap A0u = AnonymousClass001.A0u();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = AbL.A01(parcel, A0u, i);
        }
        this.A01 = ImmutableMap.copyOf((Map) A0u);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MediaResource) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = C3o5.A0O(parcel);
    }

    public CreateGroupRequestParams(MediaResource mediaResource, ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, String str6) {
        C1pq.A08("amounts", immutableMap);
        this.A01 = immutableMap;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = mediaResource;
        this.A04 = str3;
        C1pq.A08("offlineThreadingId", str4);
        this.A05 = str4;
        this.A06 = null;
        this.A07 = str5;
        this.A08 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreateGroupRequestParams)) {
                return false;
            }
            CreateGroupRequestParams createGroupRequestParams = (CreateGroupRequestParams) obj;
            if (!11T.A0O(this.A01, createGroupRequestParams.A01) || !11T.A0O(this.A02, createGroupRequestParams.A02) || !11T.A0O(this.A03, createGroupRequestParams.A03) || !11T.A0O(this.A00, createGroupRequestParams.A00) || !11T.A0O(this.A04, createGroupRequestParams.A04) || !11T.A0O(this.A05, createGroupRequestParams.A05) || !11T.A0O(this.A06, createGroupRequestParams.A06) || !11T.A0O(this.A07, createGroupRequestParams.A07) || !11T.A0O(this.A08, createGroupRequestParams.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0g = DKH.A0g(parcel, this.A01);
        while (A0g.hasNext()) {
            AbL.A0n(parcel, A0g);
        }
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
    }
}
