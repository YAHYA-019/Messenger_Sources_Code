package com.facebook.messaging.memories.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.4YV;
import X.4YW;
import X.7zP;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Iterator;
import java.util.List;

/* loaded from: MemoryViewModel.class */
public final class MemoryViewModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(39);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final ThreadKey A07;
    public final Integer A08;
    public final Long A09;
    public final Long A0A;
    public final Long A0B;
    public final Long A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public MemoryViewModel(ThreadKey threadKey, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, List list3, List list4, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        1BL.A1F(str, str2);
        7zP.A1O(str4, 6, list);
        7zP.A1R(list2, 12, str9);
        11T.A0F(list3, 19);
        this.A0F = str;
        this.A0G = str2;
        this.A07 = threadKey;
        this.A0H = str3;
        this.A05 = j;
        this.A0D = str4;
        this.A0E = str5;
        this.A09 = l;
        this.A02 = i;
        this.A01 = i2;
        this.A0N = list;
        this.A0O = list2;
        this.A06 = j2;
        this.A0I = str6;
        this.A0K = str7;
        this.A0A = l2;
        this.A0J = str8;
        this.A0L = str9;
        this.A0P = list3;
        this.A0R = z;
        this.A0T = z2;
        this.A0M = str10;
        this.A04 = j3;
        this.A0C = l3;
        this.A08 = num;
        this.A0B = l4;
        this.A0U = z3;
        this.A03 = i3;
        this.A0Q = list4;
        this.A00 = i / i2;
        this.A0S = 4YV.A1X(i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MemoryViewModel)) {
                return false;
            }
            MemoryViewModel memoryViewModel = (MemoryViewModel) obj;
            if (!11T.A0O(this.A0F, memoryViewModel.A0F) || !11T.A0O(this.A0G, memoryViewModel.A0G) || !11T.A0O(this.A07, memoryViewModel.A07) || !11T.A0O(this.A0H, memoryViewModel.A0H) || this.A05 != memoryViewModel.A05 || !11T.A0O(this.A0D, memoryViewModel.A0D) || !11T.A0O(this.A0E, memoryViewModel.A0E) || !11T.A0O(this.A09, memoryViewModel.A09) || this.A02 != memoryViewModel.A02 || this.A01 != memoryViewModel.A01 || !11T.A0O(this.A0N, memoryViewModel.A0N) || !11T.A0O(this.A0O, memoryViewModel.A0O) || this.A06 != memoryViewModel.A06 || !11T.A0O(this.A0I, memoryViewModel.A0I) || !11T.A0O(this.A0K, memoryViewModel.A0K) || !11T.A0O(this.A0A, memoryViewModel.A0A) || !11T.A0O(this.A0J, memoryViewModel.A0J) || !11T.A0O(this.A0L, memoryViewModel.A0L) || !11T.A0O(this.A0P, memoryViewModel.A0P) || this.A0R != memoryViewModel.A0R || this.A0T != memoryViewModel.A0T || !11T.A0O(this.A0M, memoryViewModel.A0M) || this.A04 != memoryViewModel.A04 || !11T.A0O(this.A0C, memoryViewModel.A0C) || !11T.A0O(this.A08, memoryViewModel.A08) || !11T.A0O(this.A0B, memoryViewModel.A0B) || this.A0U != memoryViewModel.A0U || this.A03 != memoryViewModel.A03 || !11T.A0O(this.A0Q, memoryViewModel.A0Q)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A0Q, (((((((((AnonymousClass002.A02(this.A04, (((((AnonymousClass002.A05(this.A0P, AnonymousClass002.A07(this.A0L, (((((((AnonymousClass002.A02(this.A06, AnonymousClass002.A05(this.A0O, AnonymousClass002.A05(this.A0N, (((((((AnonymousClass002.A07(this.A0D, AnonymousClass002.A02(this.A05, (((AnonymousClass002.A07(this.A0G, 4YV.A02(this.A0F)) + AnonymousClass001.A02(this.A07)) * 31) + 1BL.A05(this.A0H)) * 31)) + 1BL.A05(this.A0E)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + this.A02) * 31) + this.A01) * 31))) + 1BL.A05(this.A0I)) * 31) + 1BL.A05(this.A0K)) * 31) + AnonymousClass001.A02(this.A0A)) * 31) + 1BL.A05(this.A0J)) * 31)) + AnonymousClass002.A00(this.A0R ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0T ? 1 : 0)) * 31) + 1BL.A05(this.A0M)) * 31) + AnonymousClass001.A02(this.A0C)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + 4YU.A03(this.A0B)) * 31) + AnonymousClass002.A00(this.A0U ? 1 : 0)) * 31) + this.A03) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0H);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        C3o5.A0g(parcel, this.A09);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeStringList(this.A0N);
        parcel.writeStringList(this.A0O);
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0K);
        C3o5.A0g(parcel, this.A0A);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0L);
        parcel.writeStringList(this.A0P);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeString(this.A0M);
        parcel.writeLong(this.A04);
        C3o5.A0g(parcel, this.A0C);
        C3o5.A0f(parcel, this.A08);
        C3o5.A0g(parcel, this.A0B);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A03);
        Iterator A09 = 4YW.A09(parcel, this.A0Q);
        while (A09.hasNext()) {
            ((MemoryMessageContext) A09.next()).writeToParcel(parcel, i);
        }
    }
}
