package com.facebook.messaging.integrity.frx.model;

import X.0S2;
import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zL;
import X.7zU;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: GroupMembersPage.class */
public final class GroupMembersPage implements Parcelable {
    public static volatile Integer A06;
    public static volatile Integer A07;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(99);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final Set A05;

    public GroupMembersPage(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        int readInt = parcel.readInt();
        User[] userArr = new User[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, userArr, i2);
        }
        this.A00 = ImmutableList.copyOf(userArr);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr, i3);
        }
        this.A01 = ImmutableList.copyOf(strArr);
        this.A03 = parcel.readInt() != 0 ? 7zU.A0e(parcel, 3) : num;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public GroupMembersPage(ImmutableList immutableList, ImmutableList immutableList2, Integer num, Integer num2, String str, Set set) {
        this.A04 = str;
        C1pq.A08("members", immutableList);
        this.A00 = immutableList;
        this.A02 = num;
        C1pq.A08("reportedUserIds", immutableList2);
        this.A01 = immutableList2;
        this.A03 = num2;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public int A00() {
        Integer num;
        if (this.A05.contains("pageTitleResId")) {
            num = this.A02;
        } else {
            if (A06 == null) {
                synchronized (this) {
                    if (A06 == null) {
                        A06 = 2131960057;
                    }
                }
            }
            num = A06;
        }
        return num.intValue();
    }

    public Integer A01() {
        if (this.A05.contains(Property.SYMBOL_Z_ORDER_SOURCE)) {
            return this.A03;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = 0S2.A00;
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
            if (!(obj instanceof GroupMembersPage)) {
                return false;
            }
            GroupMembersPage groupMembersPage = (GroupMembersPage) obj;
            if (!11T.A0O(this.A04, groupMembersPage.A04) || !11T.A0O(this.A00, groupMembersPage.A00) || A00() != groupMembersPage.A00() || !11T.A0O(this.A01, groupMembersPage.A01) || A01() != groupMembersPage.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A01, (C1pq.A04(this.A00, C1pq.A03(this.A04)) * 31) + A00());
        return (A04 * 31) + C3o5.A04(A01());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable(AbG.A0t(A0b), i);
        }
        C3o5.A0f(parcel, this.A02);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        C3o5.A0f(parcel, this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
