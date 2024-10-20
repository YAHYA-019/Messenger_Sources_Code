package com.facebook.messaging.business.inboxads.common;

import X.11T;
import X.1BL;
import X.1Du;
import X.82M;
import X.C1pq;
import X.C3o5;
import X.EnumC08694nm;
import X.EnumC08714nq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.common.calltoaction.model.AdCallToAction;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InboxAdsMediaInfo.class */
public final class InboxAdsMediaInfo implements Parcelable {
    public static volatile ImmutableList A0K;
    public static volatile ImmutableList A0L;
    public static final Parcelable.Creator CREATOR = new 82M(19);
    public final double A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final AdCallToAction A04;
    public final InboxAdsImage A05;
    public final InboxAdsVideo A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Set A0I;
    public final boolean A0J;

    public InboxAdsMediaInfo(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        InboxAdsVideo inboxAdsVideo = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            int readInt = parcel.readInt();
            EnumC08714nq[] enumC08714nqArr = new EnumC08714nq[readInt];
            for (int i = 0; i < readInt; i++) {
                enumC08714nqArr[i] = EnumC08714nq.values()[parcel.readInt()];
            }
            this.A07 = ImmutableList.copyOf(enumC08714nqArr);
        }
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A01 = parcel.readInt();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A03 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            int readInt2 = parcel.readInt();
            EnumC08694nm[] enumC08694nmArr = new EnumC08694nm[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                enumC08694nmArr[i2] = EnumC08694nm.values()[parcel.readInt()];
            }
            this.A08 = ImmutableList.copyOf(enumC08694nmArr);
        }
        this.A00 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (AdCallToAction) AdCallToAction.CREATOR.createFromParcel(parcel);
        }
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (InboxAdsImage) parcel.readParcelable(classLoader);
        }
        this.A0J = parcel.readInt() != 1 ? false : true;
        this.A0F = parcel.readString();
        this.A0G = parcel.readString();
        this.A0H = parcel.readString();
        this.A02 = parcel.readInt();
        this.A06 = parcel.readInt() != 0 ? (InboxAdsVideo) parcel.readParcelable(classLoader) : inboxAdsVideo;
        HashSet hashSet = new HashSet();
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            hashSet.add(parcel.readString());
        }
        this.A0I = Collections.unmodifiableSet(hashSet);
    }

    public InboxAdsMediaInfo(AdCallToAction adCallToAction, InboxAdsImage inboxAdsImage, InboxAdsVideo inboxAdsVideo, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Set set, double d, int i, int i2, long j, boolean z) {
        this.A07 = immutableList;
        C1pq.A08("adId", str);
        this.A09 = str;
        C1pq.A08("adItemId", str2);
        this.A0A = str2;
        this.A01 = i;
        C1pq.A08("adTitle", str3);
        this.A0B = str3;
        C1pq.A08("adToken", str4);
        this.A0C = str4;
        this.A03 = j;
        this.A08 = immutableList2;
        this.A00 = d;
        this.A04 = adCallToAction;
        C1pq.A08("cardDescription", str5);
        this.A0D = str5;
        C1pq.A08("description", str6);
        this.A0E = str6;
        this.A05 = inboxAdsImage;
        this.A0J = z;
        C1pq.A08("pageId", str7);
        this.A0F = str7;
        C1pq.A08("photoDescription", str8);
        this.A0G = str8;
        C1pq.A08("title", str9);
        this.A0H = str9;
        this.A02 = i2;
        this.A06 = inboxAdsVideo;
        this.A0I = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A0I.contains("adCardTypes")) {
            return this.A07;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    A0K = ImmutableList.of();
                }
            }
        }
        return A0K;
    }

    public ImmutableList A01() {
        if (this.A0I.contains("adTypes")) {
            return this.A08;
        }
        if (A0L == null) {
            synchronized (this) {
                if (A0L == null) {
                    A0L = ImmutableList.of();
                }
            }
        }
        return A0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InboxAdsMediaInfo)) {
                return false;
            }
            InboxAdsMediaInfo inboxAdsMediaInfo = (InboxAdsMediaInfo) obj;
            if (!11T.A0O(A00(), inboxAdsMediaInfo.A00()) || !11T.A0O(this.A09, inboxAdsMediaInfo.A09) || !11T.A0O(this.A0A, inboxAdsMediaInfo.A0A) || this.A01 != inboxAdsMediaInfo.A01 || !11T.A0O(this.A0B, inboxAdsMediaInfo.A0B) || !11T.A0O(this.A0C, inboxAdsMediaInfo.A0C) || this.A03 != inboxAdsMediaInfo.A03 || !11T.A0O(A01(), inboxAdsMediaInfo.A01()) || this.A00 != inboxAdsMediaInfo.A00 || !11T.A0O(this.A04, inboxAdsMediaInfo.A04) || !11T.A0O(this.A0D, inboxAdsMediaInfo.A0D) || !11T.A0O(this.A0E, inboxAdsMediaInfo.A0E) || !11T.A0O(this.A05, inboxAdsMediaInfo.A05) || this.A0J != inboxAdsMediaInfo.A0J || !11T.A0O(this.A0F, inboxAdsMediaInfo.A0F) || !11T.A0O(this.A0G, inboxAdsMediaInfo.A0G) || !11T.A0O(this.A0H, inboxAdsMediaInfo.A0H) || this.A02 != inboxAdsMediaInfo.A02 || !11T.A0O(this.A06, inboxAdsMediaInfo.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, (C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A04, C1pq.A00(this.A00, C1pq.A04(A01(), C1pq.A01(C1pq.A04(this.A0C, C1pq.A04(this.A0B, (C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A03(A00()))) * 31) + this.A01)), this.A03))))))), this.A0J)))) * 31) + this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A07;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                parcel.writeInt(((EnumC08714nq) A0b.next()).ordinal());
            }
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeLong(this.A03);
        ImmutableList immutableList2 = this.A08;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                parcel.writeInt(((EnumC08694nm) A0b2.next()).ordinal());
            }
        }
        parcel.writeDouble(this.A00);
        AdCallToAction adCallToAction = this.A04;
        if (adCallToAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adCallToAction.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A02);
        C3o5.A0d(parcel, this.A06, i);
        Iterator A0S = C3o5.A0S(parcel, this.A0I);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
