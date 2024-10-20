package com.facebook.facecast.broadcast.analytics.model;

import X.11T;
import X.7zU;
import X.AbE;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.EOx;
import X.EPQ;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FacecastBroadcastAnalyticsBasicData.class */
public final class FacecastBroadcastAnalyticsBasicData implements Parcelable {
    public static volatile EPQ A06;
    public static volatile EOx A07;
    public static final Parcelable.Creator CREATOR = FKX.A00(69);
    public final String A00;
    public final String A01;
    public final String A02;
    public final EPQ A03;
    public final EOx A04;
    public final Set A05;

    public FacecastBroadcastAnalyticsBasicData(EPQ epq, EOx eOx, String str, String str2, String str3, Set set) {
        C1pq.A08("cameraSessionId", str);
        this.A00 = str;
        C1pq.A08("sessionId", str2);
        this.A01 = str2;
        this.A03 = epq;
        C1pq.A08("sourceType", str3);
        this.A02 = str3;
        this.A04 = eOx;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public FacecastBroadcastAnalyticsBasicData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        EOx eOx = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = EPQ.values()[parcel.readInt()];
        }
        this.A02 = parcel.readString();
        this.A04 = parcel.readInt() != 0 ? EOx.values()[parcel.readInt()] : eOx;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public EPQ A00() {
        if (this.A05.contains(AbE.A00(204))) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = EPQ.A14;
                }
            }
        }
        return A06;
    }

    public EOx A01() {
        if (this.A05.contains("targetType")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = EOx.A0G;
                }
            }
        }
        return A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FacecastBroadcastAnalyticsBasicData)) {
                return false;
            }
            FacecastBroadcastAnalyticsBasicData facecastBroadcastAnalyticsBasicData = (FacecastBroadcastAnalyticsBasicData) obj;
            if (!11T.A0O(this.A00, facecastBroadcastAnalyticsBasicData.A00) || !11T.A0O(this.A01, facecastBroadcastAnalyticsBasicData.A01) || A00() != facecastBroadcastAnalyticsBasicData.A00() || !11T.A0O(this.A02, facecastBroadcastAnalyticsBasicData.A02) || A01() != facecastBroadcastAnalyticsBasicData.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A01, C1pq.A03(this.A00));
        int A042 = C1pq.A04(this.A02, (A04 * 31) + C3o5.A03(A00()));
        return (A042 * 31) + DKF.A04(A01());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        C3o5.A0e(parcel, this.A03);
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
