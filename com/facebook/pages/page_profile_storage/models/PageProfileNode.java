package com.facebook.pages.page_profile_storage.models;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbG;
import X.AbH;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pages.bizapp.config.model.BizAppBusinessPermissions;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PageProfileNode.class */
public final class PageProfileNode implements Parcelable {
    public static volatile BizAppBusinessPermissions A0G;
    public static final Parcelable.Creator CREATOR = new FKY(30);
    public final int A00;
    public final int A01;
    public final long A02;
    public final BizAppBusinessPermissions A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final Set A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public PageProfileNode(Parcel parcel) {
        AbG.A1X(this);
        this.A06 = parcel.readString();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (BizAppBusinessPermissions) BizAppBusinessPermissions.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        int i = 0;
        boolean z = true;
        this.A0D = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = parcel.readLong();
        this.A0E = 1BM.A07(parcel);
        this.A0F = parcel.readInt() != 1 ? false : z;
        this.A00 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A01 = parcel.readInt();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A04 = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr2, i3);
        }
        this.A05 = ImmutableList.copyOf(strArr2);
        this.A0A = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0B = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0C = Collections.unmodifiableSet(A0v);
    }

    private BizAppBusinessPermissions A00() {
        if (this.A0C.contains("bizAppBusinessPermissions")) {
            return this.A03;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = new BizAppBusinessPermissions(false, false, false, false, false, false, false, false, false, false, false, false);
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
            if (!(obj instanceof PageProfileNode)) {
                return false;
            }
            PageProfileNode pageProfileNode = (PageProfileNode) obj;
            if (!11T.A0O(this.A06, pageProfileNode.A06) || !11T.A0O(A00(), pageProfileNode.A00()) || !11T.A0O(this.A07, pageProfileNode.A07) || this.A0D != pageProfileNode.A0D || this.A02 != pageProfileNode.A02 || this.A0E != pageProfileNode.A0E || this.A0F != pageProfileNode.A0F || this.A00 != pageProfileNode.A00 || !11T.A0O(this.A08, pageProfileNode.A08) || this.A01 != pageProfileNode.A01 || !11T.A0O(this.A04, pageProfileNode.A04) || !11T.A0O(this.A09, pageProfileNode.A09) || !11T.A0O(this.A05, pageProfileNode.A05) || !11T.A0O(this.A0A, pageProfileNode.A0A) || !11T.A0O(this.A0B, pageProfileNode.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A05, C1pq.A04(this.A09, C1pq.A04(this.A04, (C1pq.A04(this.A08, (C1pq.A02(C1pq.A02(C1pq.A01(C1pq.A02(C1pq.A04(this.A07, C1pq.A04(A00(), C1pq.A03(this.A06))), this.A0D), this.A02), this.A0E), this.A0F) * 31) + this.A00) * 31) + this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        BizAppBusinessPermissions bizAppBusinessPermissions = this.A03;
        if (bizAppBusinessPermissions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bizAppBusinessPermissions.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A04);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1BL.A13(parcel, this.A09);
        1Du A0b2 = 1BL.A0b(parcel, this.A05);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        Iterator A0S = C3o5.A0S(parcel, this.A0C);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
