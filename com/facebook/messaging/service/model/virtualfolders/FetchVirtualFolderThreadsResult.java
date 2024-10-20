package com.facebook.messaging.service.model.virtualfolders;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Du;
import X.1Hk;
import X.4YV;
import X.7zN;
import X.AbG;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FetchVirtualFolderThreadsResult.class */
public final class FetchVirtualFolderThreadsResult implements Parcelable {
    public static volatile DataFetchDisposition A06;
    public static volatile ThreadsCollection A07;
    public static final Parcelable.Creator CREATOR = CSU.A00(32);
    public final long A00;
    public final 1Hk A01;
    public final ImmutableList A02;
    public final DataFetchDisposition A03;
    public final ThreadsCollection A04;
    public final Set A05;

    public FetchVirtualFolderThreadsResult(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readLong();
        ThreadsCollection threadsCollection = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (DataFetchDisposition) parcel.readParcelable(A0e);
        }
        this.A04 = parcel.readInt() != 0 ? (ThreadsCollection) ThreadsCollection.CREATOR.createFromParcel(parcel) : threadsCollection;
        int readInt = parcel.readInt();
        User[] userArr = new User[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, userArr, i2);
        }
        this.A02 = ImmutableList.copyOf(userArr);
        this.A01 = 1Hk.values()[parcel.readInt()];
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public FetchVirtualFolderThreadsResult(DataFetchDisposition dataFetchDisposition, ThreadsCollection threadsCollection, 1Hk r304, ImmutableList immutableList, Set set, long j) {
        this.A00 = j;
        this.A03 = dataFetchDisposition;
        this.A04 = threadsCollection;
        C1pq.A08("users", immutableList);
        this.A02 = immutableList;
        C1pq.A08("virtualFolderName", r304);
        this.A01 = r304;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public DataFetchDisposition A00() {
        if (this.A05.contains("disposition")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = DataFetchDisposition.A0I;
                }
            }
        }
        return A06;
    }

    public ThreadsCollection A01() {
        if (this.A05.contains("threadsCollection")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    Parcelable.Creator creator = ThreadsCollection.CREATOR;
                    A07 = new ThreadsCollection(1BK.A0b(), false);
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
            if (!(obj instanceof FetchVirtualFolderThreadsResult)) {
                return false;
            }
            FetchVirtualFolderThreadsResult fetchVirtualFolderThreadsResult = (FetchVirtualFolderThreadsResult) obj;
            if (this.A00 != fetchVirtualFolderThreadsResult.A00 || !11T.A0O(A00(), fetchVirtualFolderThreadsResult.A00()) || !11T.A0O(A01(), fetchVirtualFolderThreadsResult.A01()) || !11T.A0O(this.A02, fetchVirtualFolderThreadsResult.A02) || this.A01 != fetchVirtualFolderThreadsResult.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A04(A01(), C1pq.A04(A00(), 1BL.A01(this.A00) + 31)));
        return (A04 * 31) + C3o5.A03(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        C3o5.A0d(parcel, this.A03, i);
        ThreadsCollection threadsCollection = this.A04;
        if (threadsCollection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadsCollection.writeToParcel(parcel, i);
        }
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable(AbG.A0t(A0b), i);
        }
        7zN.A0z(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
