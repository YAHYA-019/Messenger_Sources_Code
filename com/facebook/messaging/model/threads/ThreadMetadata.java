package com.facebook.messaging.model.threads;

import X.11T;
import X.1Du;
import X.4YU;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C5pa;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ThreadMetadata.class */
public final class ThreadMetadata implements Parcelable, C5pa {
    public static final Parcelable.Creator CREATOR = new CSV(79);
    public final int A00;
    public final ThreadKey A01;
    public final MentorshipThreadData A02;
    public final ImmutableMap A03;
    public final boolean A04;

    public ThreadMetadata(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A04 = 4YV.A1U(parcel.readInt());
        MentorshipThreadData mentorshipThreadData = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                A0u.put(parcel.readString(), ThreadGameData.CREATOR.createFromParcel(parcel));
            }
            this.A03 = ImmutableMap.copyOf((Map) A0u);
        }
        this.A02 = parcel.readInt() != 0 ? (MentorshipThreadData) parcel.readParcelable(A0e) : mentorshipThreadData;
        this.A00 = parcel.readInt();
        this.A01 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    public ThreadMetadata(ThreadKey threadKey, MentorshipThreadData mentorshipThreadData, ImmutableMap immutableMap, int i, boolean z) {
        this.A04 = z;
        this.A03 = immutableMap;
        this.A02 = mentorshipThreadData;
        this.A00 = i;
        C1pq.A08("threadKey", threadKey);
        this.A01 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadMetadata)) {
                return false;
            }
            ThreadMetadata threadMetadata = (ThreadMetadata) obj;
            if (this.A04 != threadMetadata.A04 || !11T.A0O(this.A03, threadMetadata.A03) || !11T.A0O(this.A02, threadMetadata.A02) || this.A00 != threadMetadata.A00 || !11T.A0O(this.A01, threadMetadata.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, (C1pq.A04(this.A02, C1pq.A04(this.A03, C1pq.A05(this.A04))) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        ImmutableMap immutableMap = this.A03;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableMap.size());
            1Du A0i = 4YU.A0i(immutableMap);
            while (A0i.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0i);
                parcel.writeString(AnonymousClass001.A0j(A0z));
                ((ThreadGameData) A0z.getValue()).writeToParcel(parcel, i);
            }
        }
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }
}
