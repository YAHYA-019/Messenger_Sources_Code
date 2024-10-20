package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zL;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AdditionalActionsPage.class */
public final class AdditionalActionsPage implements Parcelable {
    public static volatile ProactiveWarningAdditionalActionsPageConfig A0E;
    public static volatile Integer A0F;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(87);
    public final ProactiveWarningAdditionalActionsPageConfig A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Set A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AdditionalActionsPage(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        int readInt = parcel.readInt();
        AdditionalAction[] additionalActionArr = new AdditionalAction[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, additionalActionArr, i2);
        }
        this.A01 = ImmutableList.copyOf(additionalActionArr);
        int readInt2 = parcel.readInt();
        CustomButton[] customButtonArr = new CustomButton[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, customButtonArr, i3);
        }
        this.A02 = ImmutableList.copyOf(customButtonArr);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt3 = parcel.readInt();
            InfoItem[] infoItemArr = new InfoItem[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = AbI.A01(parcel, A0e, infoItemArr, i4);
            }
            this.A03 = ImmutableList.copyOf(infoItemArr);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ProactiveWarningAdditionalActionsPageConfig) parcel.readParcelable(A0e);
        }
        this.A0C = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0D = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0A = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt4 = parcel.readInt();
        while (i < readInt4) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0B = Collections.unmodifiableSet(A0v);
    }

    public AdditionalActionsPage(ProactiveWarningAdditionalActionsPageConfig proactiveWarningAdditionalActionsPageConfig, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Set set, boolean z, boolean z2) {
        this.A05 = str;
        this.A06 = str2;
        C1pq.A08("additionalActions", immutableList);
        this.A01 = immutableList;
        C1pq.A08("customButtons", immutableList2);
        this.A02 = immutableList2;
        this.A07 = str3;
        this.A03 = immutableList3;
        this.A04 = num;
        this.A00 = proactiveWarningAdditionalActionsPageConfig;
        this.A0C = z;
        this.A0D = z2;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A0B = Collections.unmodifiableSet(set);
    }

    public int A00() {
        Integer num;
        if (this.A0B.contains("pageTitleResId")) {
            num = this.A04;
        } else {
            if (A0F == null) {
                synchronized (this) {
                    if (A0F == null) {
                        A0F = 2131960038;
                    }
                }
            }
            num = A0F;
        }
        return num.intValue();
    }

    public ProactiveWarningAdditionalActionsPageConfig A01() {
        if (this.A0B.contains("proactiveWarningPageConfig")) {
            return this.A00;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = new ProactiveWarningAdditionalActionsPageConfig(null, null, false, false, false, false);
                }
            }
        }
        return A0E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdditionalActionsPage)) {
                return false;
            }
            AdditionalActionsPage additionalActionsPage = (AdditionalActionsPage) obj;
            if (!11T.A0O(this.A05, additionalActionsPage.A05) || !11T.A0O(this.A06, additionalActionsPage.A06) || !11T.A0O(this.A01, additionalActionsPage.A01) || !11T.A0O(this.A02, additionalActionsPage.A02) || !11T.A0O(this.A07, additionalActionsPage.A07) || !11T.A0O(this.A03, additionalActionsPage.A03) || A00() != additionalActionsPage.A00() || !11T.A0O(A01(), additionalActionsPage.A01()) || this.A0C != additionalActionsPage.A0C || this.A0D != additionalActionsPage.A0D || !11T.A0O(this.A08, additionalActionsPage.A08) || !11T.A0O(this.A09, additionalActionsPage.A09) || !11T.A0O(this.A0A, additionalActionsPage.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A02(C1pq.A02(C1pq.A04(A01(), (C1pq.A04(this.A03, C1pq.A04(this.A07, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A06, C1pq.A03(this.A05)))))) * 31) + A00()), this.A0C), this.A0D))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AdditionalAction) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((CustomButton) A0b2.next(), i);
        }
        1BL.A13(parcel, this.A07);
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((InfoItem) A0Y.next(), i);
            }
        }
        C3o5.A0f(parcel, this.A04);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        Iterator A0S = C3o5.A0S(parcel, this.A0B);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
