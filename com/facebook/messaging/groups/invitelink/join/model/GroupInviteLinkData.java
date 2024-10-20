package com.facebook.messaging.groups.invitelink.join.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.7zL;
import X.7zN;
import X.AnonymousClass001;
import X.C1pq;
import X.C1zu;
import X.C3o5;
import X.C96j;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: GroupInviteLinkData.class */
public final class GroupInviteLinkData implements Parcelable {
    public static volatile C1zu A0O;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(72);
    public final int A00;
    public final long A01;
    public final long A02;
    public final Uri A03;
    public final C96j A04;
    public final ThreadKey A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final C1zu A0M;
    public final Set A0N;

    public GroupInviteLinkData(Uri uri, C96j c96j, ThreadKey threadKey, C1zu c1zu, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Set set, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0G = z;
        this.A0H = z2;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A01 = j;
        this.A0B = str6;
        this.A0C = str7;
        this.A03 = uri;
        this.A0I = z3;
        this.A0J = z4;
        this.A0K = z5;
        this.A02 = j2;
        C1pq.A08("link", str8);
        this.A0D = str8;
        C1pq.A08("linkJoinType", c96j);
        this.A04 = c96j;
        this.A00 = i;
        this.A0E = str9;
        this.A0L = z6;
        this.A05 = threadKey;
        this.A0M = c1zu;
        C1pq.A08("title", str10);
        this.A0F = str10;
        this.A0N = Collections.unmodifiableSet(set);
    }

    public GroupInviteLinkData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        boolean z = true;
        this.A0G = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0H = 1BM.A07(parcel);
        C1zu c1zu = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (Uri) parcel.readParcelable(A0e);
        }
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        this.A0K = 1BM.A07(parcel);
        this.A02 = parcel.readLong();
        this.A0D = parcel.readString();
        this.A04 = C96j.values()[parcel.readInt()];
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A0L = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        this.A0M = parcel.readInt() != 0 ? C1zu.values()[parcel.readInt()] : c1zu;
        this.A0F = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0N = Collections.unmodifiableSet(A0v);
    }

    public C1zu A00() {
        if (this.A0N.contains("threadStatus")) {
            return this.A0M;
        }
        if (A0O == null) {
            synchronized (this) {
                if (A0O == null) {
                    A0O = C1zu.A03;
                }
            }
        }
        return A0O;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GroupInviteLinkData)) {
                return false;
            }
            GroupInviteLinkData groupInviteLinkData = (GroupInviteLinkData) obj;
            if (this.A0G != groupInviteLinkData.A0G || this.A0H != groupInviteLinkData.A0H || !11T.A0O(this.A06, groupInviteLinkData.A06) || !11T.A0O(this.A07, groupInviteLinkData.A07) || !11T.A0O(this.A08, groupInviteLinkData.A08) || !11T.A0O(this.A09, groupInviteLinkData.A09) || !11T.A0O(this.A0A, groupInviteLinkData.A0A) || this.A01 != groupInviteLinkData.A01 || !11T.A0O(this.A0B, groupInviteLinkData.A0B) || !11T.A0O(this.A0C, groupInviteLinkData.A0C) || !11T.A0O(this.A03, groupInviteLinkData.A03) || this.A0I != groupInviteLinkData.A0I || this.A0J != groupInviteLinkData.A0J || this.A0K != groupInviteLinkData.A0K || this.A02 != groupInviteLinkData.A02 || !11T.A0O(this.A0D, groupInviteLinkData.A0D) || this.A04 != groupInviteLinkData.A04 || this.A00 != groupInviteLinkData.A00 || !11T.A0O(this.A0E, groupInviteLinkData.A0E) || this.A0L != groupInviteLinkData.A0L || !11T.A0O(this.A05, groupInviteLinkData.A05) || A00() != groupInviteLinkData.A00() || !11T.A0O(this.A0F, groupInviteLinkData.A0F)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A05, C1pq.A02(C1pq.A04(this.A0E, (((C1pq.A04(this.A0D, C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A01(C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A02(C1pq.A05(this.A0G), this.A0H)))))), this.A01)))), this.A0I), this.A0J), this.A0K), this.A02)) * 31) + C3o5.A03(this.A04)) * 31) + this.A00), this.A0L));
        C1zu A00 = A00();
        if (A00 != null) {
            i = A00.ordinal();
        }
        return C1pq.A04(this.A0F, (A04 * 31) + i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        parcel.writeLong(this.A01);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        C3o5.A0d(parcel, this.A03, i);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A0D);
        7zN.A0z(parcel, this.A04);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A0E);
        parcel.writeInt(this.A0L ? 1 : 0);
        ThreadKey threadKey = this.A05;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A0M);
        parcel.writeString(this.A0F);
        Iterator A0S = C3o5.A0S(parcel, this.A0N);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
