package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerFunFactModel.class */
public final class ComposerFunFactModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(17);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public ComposerFunFactModel(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A03 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0D = AbJ.A1W(parcel);
        this.A08 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A09 = C3o5.A0O(parcel);
    }

    public ComposerFunFactModel(ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A02 = str2;
        this.A0A = z;
        this.A0B = z2;
        this.A0C = z3;
        C1pq.A08("presetIdList", immutableList);
        this.A00 = immutableList;
        C1pq.A08("promptEmoji", str3);
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        C1pq.A08("promptTitle", str6);
        this.A06 = str6;
        C1pq.A08("promptType", str7);
        this.A07 = str7;
        this.A0D = z4;
        this.A08 = str8;
        this.A09 = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerFunFactModel)) {
                return false;
            }
            ComposerFunFactModel composerFunFactModel = (ComposerFunFactModel) obj;
            if (!11T.A0O(this.A01, composerFunFactModel.A01) || !11T.A0O(this.A02, composerFunFactModel.A02) || this.A0A != composerFunFactModel.A0A || this.A0B != composerFunFactModel.A0B || this.A0C != composerFunFactModel.A0C || !11T.A0O(this.A00, composerFunFactModel.A00) || !11T.A0O(this.A03, composerFunFactModel.A03) || !11T.A0O(this.A04, composerFunFactModel.A04) || !11T.A0O(this.A05, composerFunFactModel.A05) || !11T.A0O(this.A06, composerFunFactModel.A06) || !11T.A0O(this.A07, composerFunFactModel.A07) || this.A0D != composerFunFactModel.A0D || !11T.A0O(this.A08, composerFunFactModel.A08) || !11T.A0O(this.A09, composerFunFactModel.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A02(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A03(this.A01)), this.A0A), this.A0B), this.A0C))))))), this.A0D)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0D ? 1 : 0);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
    }
}
