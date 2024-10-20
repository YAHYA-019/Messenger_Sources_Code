package com.facebook.payments.p2p.service.model.transactions;

import X.1BL;
import X.C53v;
import X.DKG;
import X.DM3;
import X.ERI;
import X.Er2;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: SendPaymentMessageParams.class */
public final class SendPaymentMessageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(36);
    public final CurrencyAmount A00;
    public final DM3 A01;
    public final ERI A02;
    public final MediaResource A03;
    public final String A04;
    public final String A05;
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
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;

    public SendPaymentMessageParams(Er2 er2) {
        er2.A00.getClass();
        DKG.A1V(er2.A0I);
        DKG.A1V(er2.A0G);
        DKG.A1V(er2.A0C);
        this.A00 = er2.A00;
        this.A0J = er2.A0I;
        this.A0H = er2.A0G;
        this.A0B = er2.A0B;
        this.A0D = er2.A0D;
        this.A0G = er2.A0F;
        this.A07 = er2.A07;
        this.A04 = er2.A04;
        this.A0F = er2.A0E;
        this.A0A = er2.A0A;
        this.A0C = er2.A0C;
        this.A0E = null;
        this.A01 = er2.A01;
        this.A0K = null;
        this.A0L = null;
        this.A0I = er2.A0H;
        this.A0M = er2.A0J;
        this.A0N = er2.A0K;
        this.A09 = er2.A09;
        this.A03 = er2.A03;
        this.A06 = er2.A06;
        this.A02 = er2.A02;
        this.A08 = er2.A08;
        this.A0O = er2.A0L;
        this.A05 = er2.A05;
    }

    public SendPaymentMessageParams(Parcel parcel) {
        this.A00 = (CurrencyAmount) 1BL.A0C(parcel, CurrencyAmount.class);
        this.A0J = parcel.readString();
        this.A0H = parcel.readString();
        this.A0B = parcel.readString();
        this.A0D = parcel.readString();
        this.A0G = parcel.readString();
        this.A07 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0C = parcel.readString();
        this.A0E = parcel.readString();
        this.A01 = parcel.readSerializable();
        this.A0K = parcel.readString();
        this.A0L = parcel.readString();
        this.A0I = parcel.readString();
        this.A0M = parcel.readString();
        this.A0N = parcel.readString();
        this.A09 = parcel.readString();
        this.A03 = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
        this.A06 = parcel.readString();
        this.A02 = parcel.readSerializable();
        this.A08 = parcel.readString();
        this.A0O = C53v.A0S(parcel);
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A0F = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeSerializable(this.A01);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0F);
    }
}
