package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.7zL;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: BlockPage.class */
public final class BlockPage implements Parcelable {
    public static volatile Integer A0A;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(88);
    public final User A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public BlockPage(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        int i = 0;
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = AbJ.A1V(parcel);
        this.A00 = (User) parcel.readParcelable(A0e);
        this.A01 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        this.A03 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public BlockPage(User user, Integer num, String str, String str2, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = str;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A09 = z5;
        C1pq.A08("otherUser", user);
        this.A00 = user;
        this.A01 = num;
        C1pq.A08("userName", str2);
        this.A03 = str2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public int A00() {
        Integer num;
        if (this.A04.contains("pageTitleResId")) {
            num = this.A01;
        } else {
            if (A0A == null) {
                synchronized (this) {
                    if (A0A == null) {
                        A0A = 2131953398;
                    }
                }
            }
            num = A0A;
        }
        return num.intValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BlockPage)) {
                return false;
            }
            BlockPage blockPage = (BlockPage) obj;
            if (!11T.A0O(this.A02, blockPage.A02) || this.A05 != blockPage.A05 || this.A06 != blockPage.A06 || this.A07 != blockPage.A07 || this.A08 != blockPage.A08 || this.A09 != blockPage.A09 || !11T.A0O(this.A00, blockPage.A00) || A00() != blockPage.A00() || !11T.A0O(this.A03, blockPage.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, (C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A02), this.A05), this.A06), this.A07), this.A08), this.A09)) * 31) + A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        C3o5.A0f(parcel, this.A01);
        parcel.writeString(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
