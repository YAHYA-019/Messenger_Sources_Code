package com.facebook.messaging.model.threads;

import X.0S2;
import X.11T;
import X.1M1;
import X.C1pq;
import X.C1zJ;
import X.C1zL;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ThreadParticipant.class */
public final class ThreadParticipant implements Parcelable {
    public static volatile C1zL A0J;
    public static volatile 1M1 A0K;
    public static volatile HeterogeneousMap A0L;
    public static volatile Integer A0M;
    public static final Parcelable.Creator CREATOR = new C2xc(34);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final ParticipantInfo A05;
    public final C1zL A06;
    public final 1M1 A07;
    public final UserKey A08;
    public final HeterogeneousMap A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final Set A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public ThreadParticipant(C1zJ c1zJ) {
        this.A06 = c1zJ.A06;
        this.A0E = c1zJ.A0E;
        this.A0A = c1zJ.A0A;
        this.A08 = c1zJ.A08;
        this.A0F = c1zJ.A0F;
        this.A0G = c1zJ.A0G;
        this.A0H = c1zJ.A0H;
        this.A0I = c1zJ.A0I;
        this.A0B = c1zJ.A0B;
        this.A01 = c1zJ.A01;
        this.A02 = c1zJ.A02;
        this.A03 = c1zJ.A03;
        this.A09 = c1zJ.A09;
        this.A04 = c1zJ.A04;
        ParticipantInfo participantInfo = c1zJ.A05;
        C1pq.A08("participantInfo", participantInfo);
        this.A05 = participantInfo;
        this.A07 = c1zJ.A07;
        this.A00 = c1zJ.A00;
        this.A0C = c1zJ.A0C;
        this.A0D = Collections.unmodifiableSet(c1zJ.A0D);
    }

    public ThreadParticipant(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = C1zL.values()[parcel.readInt()];
        }
        boolean z = true;
        this.A0E = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = 0S2.A00(3)[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (UserKey) parcel.readParcelable(classLoader);
        }
        this.A0F = parcel.readInt() == 1;
        this.A0G = parcel.readInt() == 1;
        this.A0H = parcel.readInt() == 1;
        this.A0I = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A03 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (HeterogeneousMap) parcel.readParcelable(classLoader);
        }
        this.A04 = parcel.readLong();
        this.A05 = (ParticipantInfo) parcel.readParcelable(classLoader);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = 1M1.values()[parcel.readInt()];
        }
        this.A00 = parcel.readInt();
        this.A0C = parcel.readInt() != 0 ? parcel.readString() : str;
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.A0D = Collections.unmodifiableSet(hashSet);
    }

    public ThreadParticipant(ParticipantInfo participantInfo, C1zL c1zL, UserKey userKey, String str, Set set, int i, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        this.A06 = c1zL;
        this.A0E = z;
        this.A0A = null;
        this.A08 = userKey;
        this.A0F = z2;
        this.A0G = false;
        this.A0H = false;
        this.A0I = z3;
        this.A0B = str;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = j3;
        this.A09 = null;
        this.A04 = -1;
        C1pq.A08("participantInfo", participantInfo);
        this.A05 = participantInfo;
        this.A07 = null;
        this.A00 = i;
        this.A0C = null;
        this.A0D = Collections.unmodifiableSet(set);
    }

    public C1zL A00() {
        if (this.A0D.contains("adminType")) {
            return this.A06;
        }
        if (A0J == null) {
            synchronized (this) {
                if (A0J == null) {
                    A0J = C1zL.A04;
                }
            }
        }
        return A0J;
    }

    public 1M1 A01() {
        if (this.A0D.contains("reachabilityStatusType")) {
            return this.A07;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    A0K = 1M1.A0D;
                }
            }
        }
        return A0K;
    }

    public HeterogeneousMap A02() {
        if (this.A0D.contains("metadata")) {
            return this.A09;
        }
        if (A0L == null) {
            synchronized (this) {
                if (A0L == null) {
                    HeterogeneousMap heterogeneousMap = HeterogeneousMap.A02;
                    11T.A0I(heterogeneousMap, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap<T of com.facebook.xapp.messaging.map.HeterogeneousMap.Companion.empty>");
                    A0L = heterogeneousMap;
                }
            }
        }
        return A0L;
    }

    public Integer A03() {
        if (this.A0D.contains("groupParticipantJoinState")) {
            return this.A0A;
        }
        if (A0M == null) {
            synchronized (this) {
                if (A0M == null) {
                    A0M = 0S2.A00;
                }
            }
        }
        return A0M;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadParticipant)) {
                return false;
            }
            ThreadParticipant threadParticipant = (ThreadParticipant) obj;
            if (A00() != threadParticipant.A00() || this.A0E != threadParticipant.A0E || A03() != threadParticipant.A03() || !11T.A0O(this.A08, threadParticipant.A08) || this.A0F != threadParticipant.A0F || this.A0G != threadParticipant.A0G || this.A0H != threadParticipant.A0H || this.A0I != threadParticipant.A0I || !11T.A0O(this.A0B, threadParticipant.A0B) || this.A01 != threadParticipant.A01 || this.A02 != threadParticipant.A02 || this.A03 != threadParticipant.A03 || !11T.A0O(A02(), threadParticipant.A02()) || this.A04 != threadParticipant.A04 || !11T.A0O(this.A05, threadParticipant.A05) || A01() != threadParticipant.A01() || this.A00 != threadParticipant.A00 || !11T.A0O(this.A0C, threadParticipant.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        C1zL A00 = A00();
        int i = -1;
        int A02 = C1pq.A02((A00 == null ? -1 : A00.ordinal()) + 31, this.A0E);
        Integer A03 = A03();
        int A04 = C1pq.A04(this.A05, C1pq.A01(C1pq.A04(A02(), C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A04(this.A0B, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A08, (A02 * 31) + (A03 == null ? -1 : A03.intValue())), this.A0F), this.A0G), this.A0H), this.A0I)), this.A01), this.A02), this.A03)), this.A04));
        1M1 A01 = A01();
        if (A01 != null) {
            i = A01.ordinal();
        }
        return C1pq.A04(this.A0C, (((A04 * 31) + i) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C1zL c1zL = this.A06;
        if (c1zL == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(c1zL.ordinal());
        }
        parcel.writeInt(this.A0E ? 1 : 0);
        Integer num = this.A0A;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        UserKey userKey = this.A08;
        if (userKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(userKey, i);
        }
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        String str = this.A0B;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A03);
        HeterogeneousMap heterogeneousMap = this.A09;
        if (heterogeneousMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(heterogeneousMap, i);
        }
        parcel.writeLong(this.A04);
        parcel.writeParcelable(this.A05, i);
        1M1 r0 = this.A07;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r0.ordinal());
        }
        parcel.writeInt(this.A00);
        String str2 = this.A0C;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        Set set = this.A0D;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
    }
}
