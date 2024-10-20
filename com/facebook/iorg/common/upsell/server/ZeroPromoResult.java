package com.facebook.iorg.common.upsell.server;

import X.1BL;
import X.AnonymousClass001;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: ZeroPromoResult.class */
public final class ZeroPromoResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(80);
    public final UpsellPromo A00;
    public final Page A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    /* loaded from: ZeroPromoResult$Page.class */
    public final class Page implements Parcelable {
        public static final Parcelable.Creator CREATOR = FKc.A00(81);
        public final String A00;
        public final String A01;
        public final String A02;
        public final String A03;
        public final String A04;

        public Page() {
            this.A03 = null;
            this.A01 = null;
            this.A04 = null;
            this.A02 = null;
            this.A00 = null;
        }

        public Page(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A01 = parcel.readString();
            this.A04 = parcel.readString();
            this.A02 = parcel.readString();
            this.A00 = parcel.readString();
        }

        public Page(String str, String str2, String str3, String str4, String str5) {
            this.A03 = str;
            this.A01 = str2;
            this.A04 = str3;
            this.A02 = str4;
            this.A00 = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            parcel.writeString(this.A01);
            parcel.writeString(this.A04);
            parcel.writeString(this.A02);
            parcel.writeString(this.A00);
        }
    }

    public ZeroPromoResult() {
        this.A03 = null;
        this.A04 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = ImmutableList.of();
    }

    public ZeroPromoResult(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = (Page) 1BL.A0C(parcel, Page.class);
        this.A00 = (UpsellPromo) 1BL.A0C(parcel, UpsellPromo.class);
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, UpsellDialogScreenContent.CREATOR);
        this.A02 = ImmutableList.copyOf((Collection) A0s);
    }

    public ZeroPromoResult(UpsellPromo upsellPromo, Page page, ImmutableList immutableList, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = page;
        this.A00 = upsellPromo;
        this.A02 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeTypedList(this.A02);
    }
}
