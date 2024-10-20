package com.facebook.messaging.business.inboxads.common;

import X.11T;
import X.1BL;
import X.82M;
import X.C1pq;
import X.C3o5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InboxAdsVideo.class */
public final class InboxAdsVideo implements Parcelable {
    public static volatile Uri A0G;
    public static final Parcelable.Creator CREATOR = new 82M(21);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Uri A05;
    public final InboxAdsImage A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final Uri A0E;
    public final Set A0F;

    public InboxAdsVideo(Uri uri, Uri uri2, InboxAdsImage inboxAdsImage, String str, String str2, String str3, String str4, Set set, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        C1pq.A08("autoplayCellGatingResult", str);
        this.A07 = str;
        this.A08 = str2;
        this.A01 = i2;
        this.A0B = z;
        this.A0C = z2;
        this.A06 = inboxAdsImage;
        this.A09 = str3;
        this.A02 = i3;
        this.A03 = i4;
        this.A05 = uri;
        this.A0A = str4;
        this.A0D = z3;
        this.A04 = i5;
        this.A0E = uri2;
        this.A0F = Collections.unmodifiableSet(set);
    }

    public InboxAdsVideo(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A00 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = parcel.readInt();
        boolean z = true;
        this.A0B = parcel.readInt() == 1;
        this.A0C = parcel.readInt() == 1;
        Uri uri = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (InboxAdsImage) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (Uri) parcel.readParcelable(classLoader);
        }
        this.A0A = parcel.readString();
        this.A0D = parcel.readInt() != 1 ? false : z;
        this.A04 = parcel.readInt();
        this.A0E = parcel.readInt() != 0 ? (Uri) parcel.readParcelable(classLoader) : uri;
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.A0F = Collections.unmodifiableSet(hashSet);
    }

    public Uri A00() {
        if (this.A0F.contains(TraceFieldType.Uri)) {
            return this.A0E;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = Uri.EMPTY;
                }
            }
        }
        return A0G;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InboxAdsVideo)) {
                return false;
            }
            InboxAdsVideo inboxAdsVideo = (InboxAdsVideo) obj;
            if (this.A00 != inboxAdsVideo.A00 || !11T.A0O(this.A07, inboxAdsVideo.A07) || !11T.A0O(this.A08, inboxAdsVideo.A08) || this.A01 != inboxAdsVideo.A01 || this.A0B != inboxAdsVideo.A0B || this.A0C != inboxAdsVideo.A0C || !11T.A0O(this.A06, inboxAdsVideo.A06) || !11T.A0O(this.A09, inboxAdsVideo.A09) || this.A02 != inboxAdsVideo.A02 || this.A03 != inboxAdsVideo.A03 || !11T.A0O(this.A05, inboxAdsVideo.A05) || !11T.A0O(this.A0A, inboxAdsVideo.A0A) || this.A0D != inboxAdsVideo.A0D || this.A04 != inboxAdsVideo.A04 || !11T.A0O(A00(), inboxAdsVideo.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), (C1pq.A02(C1pq.A04(this.A0A, C1pq.A04(this.A05, (((C1pq.A04(this.A09, C1pq.A04(this.A06, C1pq.A02(C1pq.A02((C1pq.A04(this.A08, C1pq.A04(this.A07, this.A00 + 31)) * 31) + this.A01, this.A0B), this.A0C))) * 31) + this.A02) * 31) + this.A03)), this.A0D) * 31) + this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        C3o5.A0d(parcel, this.A06, i);
        1BL.A13(parcel, this.A09);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A04);
        C3o5.A0d(parcel, this.A0E, i);
        Iterator A0S = C3o5.A0S(parcel, this.A0F);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
