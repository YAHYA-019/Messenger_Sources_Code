package com.facebook.messaging.neue.contactpicker;

import X.1BL;
import X.1JF;
import X.BLn;
import X.C53v;
import X.CST;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.picker.SingleTapActionConfig;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.quicksilver.common.sharing.GamesContextPickerFilterParams;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: ContactPickerParams.class */
public final class ContactPickerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(56);
    public final long A00;
    public final Bundle A01;
    public final SingleTapActionConfig A02;
    public final BLn A03;
    public final GamesContextPickerFilterParams A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public ContactPickerParams(BLn bLn, ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0E = z4;
        this.A0F = z5;
        this.A0G = false;
        this.A0H = false;
        this.A0I = z6;
        this.A0J = false;
        this.A0K = false;
        this.A0A = z;
        this.A0P = false;
        this.A0O = false;
        this.A0L = z7;
        this.A0M = z8;
        this.A0Q = z9;
        bLn.getClass();
        this.A03 = bLn;
        this.A09 = null;
        this.A06 = immutableList;
        this.A07 = immutableList2;
        this.A08 = null;
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A0N = false;
        this.A00 = -1;
        this.A0B = false;
        this.A0D = z3;
        this.A0C = z2;
    }

    public ContactPickerParams(Parcel parcel) {
        this.A0E = C53v.A0S(parcel);
        this.A0F = C53v.A0S(parcel);
        this.A0G = C53v.A0S(parcel);
        this.A0H = C53v.A0S(parcel);
        this.A0I = C53v.A0S(parcel);
        this.A0J = C53v.A0S(parcel);
        this.A0K = C53v.A0S(parcel);
        this.A0A = C53v.A0S(parcel);
        this.A0P = C53v.A0S(parcel);
        this.A0O = C53v.A0S(parcel);
        this.A0L = C53v.A0S(parcel);
        this.A0M = C53v.A0S(parcel);
        this.A0Q = C53v.A0S(parcel);
        BLn A07 = C53v.A07(parcel, BLn.class);
        A07.getClass();
        this.A03 = A07;
        this.A09 = parcel.readString();
        this.A06 = C53v.A04(parcel, ThreadKey.class);
        this.A07 = C53v.A04(parcel, ThreadKey.class);
        this.A08 = parcel.readInt() == 0 ? null : C53v.A01(parcel);
        this.A05 = C53v.A04(parcel, ThreadKey.class);
        this.A01 = parcel.readBundle();
        this.A02 = (SingleTapActionConfig) 1BL.A0C(parcel, SingleTapActionConfig.class);
        this.A04 = (GamesContextPickerFilterParams) 1BL.A0C(parcel, GamesContextPickerFilterParams.class);
        this.A0N = C53v.A0S(parcel);
        this.A00 = parcel.readLong();
        this.A0B = C53v.A0S(parcel);
        this.A0D = C53v.A0S(parcel);
        this.A0C = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof ContactPickerParams)) {
            ContactPickerParams contactPickerParams = (ContactPickerParams) obj;
            if (this.A0E == contactPickerParams.A0E && this.A0F == contactPickerParams.A0F && this.A0G == contactPickerParams.A0G && this.A0H == contactPickerParams.A0H && this.A0I == contactPickerParams.A0I && this.A0J == contactPickerParams.A0J && this.A0K == contactPickerParams.A0K && this.A0A == contactPickerParams.A0A && this.A0P == contactPickerParams.A0P && this.A0O == contactPickerParams.A0O && this.A0L == contactPickerParams.A0L && this.A0M == contactPickerParams.A0M && this.A0Q == contactPickerParams.A0Q && Objects.equal(this.A03, contactPickerParams.A03) && 1JF.A0C(this.A09, contactPickerParams.A09) && Objects.equal(this.A06, contactPickerParams.A06) && Objects.equal(this.A07, contactPickerParams.A07) && Objects.equal(this.A08, contactPickerParams.A08) && Objects.equal(this.A05, contactPickerParams.A05) && Objects.equal(this.A01, contactPickerParams.A01) && Objects.equal(this.A02, contactPickerParams.A02) && Objects.equal(this.A04, contactPickerParams.A04) && this.A0N == contactPickerParams.A0N && this.A00 == contactPickerParams.A00 && this.A0B == contactPickerParams.A0B && this.A0D == contactPickerParams.A0D && this.A0C == contactPickerParams.A0C) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0I), Boolean.valueOf(this.A0J), Boolean.valueOf(this.A0K), Boolean.valueOf(this.A0A), Boolean.valueOf(this.A0P), Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0M), Boolean.valueOf(this.A0Q), this.A03, this.A09, this.A06, this.A07, this.A08, this.A05, this.A01, this.A04, Boolean.valueOf(this.A0N), Long.valueOf(this.A00), Boolean.valueOf(this.A0B), Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0C)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        C53v.A0J(parcel, this.A03);
        parcel.writeString(this.A09);
        parcel.writeList(this.A06);
        parcel.writeList(this.A07);
        C53v.A0M(parcel, this.A08);
        parcel.writeList(this.A05);
        parcel.writeBundle(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
    }
}
