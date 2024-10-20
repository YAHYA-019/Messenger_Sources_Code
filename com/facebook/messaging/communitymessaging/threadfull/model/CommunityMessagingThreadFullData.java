package com.facebook.messaging.communitymessaging.threadfull.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.7zL;
import X.AbE;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CommunityMessagingThreadFullData.class */
public final class CommunityMessagingThreadFullData implements Parcelable {
    public static volatile Uri A07;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(11);
    public final long A00;
    public final long A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final Uri A05;
    public final Set A06;

    public CommunityMessagingThreadFullData(Uri uri, String str, Set set, long j, long j2, boolean z, boolean z2) {
        this.A03 = z;
        this.A04 = z2;
        this.A05 = uri;
        C1pq.A08("channelName", str);
        this.A02 = str;
        this.A00 = j;
        this.A01 = j2;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public CommunityMessagingThreadFullData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        boolean z = true;
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = parcel.readInt() != 1 ? false : z;
        this.A05 = parcel.readInt() == 0 ? null : (Uri) parcel.readParcelable(A0e);
        this.A02 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public Uri A00() {
        if (this.A06.contains(AbE.A00(ActionId.MESSENGER_QUEUE_CREATION))) {
            return this.A05;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    Uri uri = Uri.EMPTY;
                    11T.A0B(uri);
                    A07 = uri;
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
            if (!(obj instanceof CommunityMessagingThreadFullData)) {
                return false;
            }
            CommunityMessagingThreadFullData communityMessagingThreadFullData = (CommunityMessagingThreadFullData) obj;
            if (this.A03 != communityMessagingThreadFullData.A03 || this.A04 != communityMessagingThreadFullData.A04 || !11T.A0O(A00(), communityMessagingThreadFullData.A00()) || !11T.A0O(this.A02, communityMessagingThreadFullData.A02) || this.A00 != communityMessagingThreadFullData.A00 || this.A01 != communityMessagingThreadFullData.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A01(C1pq.A04(this.A02, C1pq.A04(A00(), C1pq.A02(C1pq.A05(this.A03), this.A04))), this.A00), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        4YW.A0D(parcel, this.A05, i);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
