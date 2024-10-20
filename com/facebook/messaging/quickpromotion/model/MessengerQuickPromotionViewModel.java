package com.facebook.messaging.quickpromotion.model;

import X.1qX;
import X.2Ri;
import X.4LR;
import X.7zM;
import X.7zO;
import X.7zP;
import X.AbK;
import X.AbM;
import X.AnonymousClass001;
import X.CSS;
import X.HwJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: MessengerQuickPromotionViewModel.class */
public final class MessengerQuickPromotionViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(39);
    public final ImmutableList A00;
    public final Long A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* loaded from: MessengerQuickPromotionViewModel$BulletListItem.class */
    public final class BulletListItem implements Parcelable {
        public static final Parcelable.Creator CREATOR = CSS.A00(40);
        public final String A00;
        public final String A01;
        public final String A02;
        public final String A03;

        public BulletListItem(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = parcel.readString();
            this.A01 = parcel.readString();
            this.A00 = parcel.readString();
        }

        public BulletListItem(String str, String str2, String str3, String str4) {
            this.A03 = str;
            this.A02 = str2;
            this.A01 = str3;
            this.A00 = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }
    }

    public MessengerQuickPromotionViewModel(Parcel parcel) {
        this.A03 = 7zO.A0j(parcel);
        this.A09 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A02 = 7zO.A0j(parcel);
        this.A04 = 7zO.A0j(parcel);
        this.A01 = 7zO.A0j(parcel);
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, BulletListItem.CREATOR);
        this.A00 = ImmutableList.copyOf((Collection) A0s);
    }

    public MessengerQuickPromotionViewModel(InterstitialTriggerContext interstitialTriggerContext, 4LR r303) {
        this.A09 = HwJ.A00(interstitialTriggerContext, ((1qX) r303).mResultSet.getString(0, 4));
        this.A05 = HwJ.A00(interstitialTriggerContext, 7zP.A0l(r303, 0));
        this.A07 = HwJ.A00(interstitialTriggerContext, 7zP.A0q(r303, 0));
        this.A08 = HwJ.A00(interstitialTriggerContext, AbM.A0z(r303, 0));
        this.A02 = ((1qX) r303).mResultSet.getNullableLong(0, 9);
        this.A04 = ((1qX) r303).mResultSet.getNullableLong(0, 11);
        this.A01 = ((1qX) r303).mResultSet.getNullableLong(0, 13);
        this.A06 = 7zP.A0t(r303, 0);
        this.A03 = Long.valueOf(7zM.A07(r303));
        List A00 = A00(r303, ((1qX) r303).mResultSet.getString(0, 36), 36);
        List A002 = A00(r303, ((1qX) r303).mResultSet.getString(0, 37), 37);
        List A003 = A00(r303, ((1qX) r303).mResultSet.getString(0, 38), 38);
        List A004 = A00(r303, ((1qX) r303).mResultSet.getString(0, 39), 39);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < Math.max(A00.size(), A002.size()); i++) {
            builder.m11011add((Object) new BulletListItem((String) 2Ri.A0C(A00, i), (String) 2Ri.A0C(A002, i), (String) 2Ri.A0C(A003, i), (String) 2Ri.A0C(A004, i)));
        }
        this.A00 = builder.build();
    }

    public static List A00(1qX r301, Object obj, int i) {
        return obj != null ? Arrays.asList(r301.mResultSet.getString(0, i).split("<>")) : new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03.longValue());
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        long j = 0;
        parcel.writeLong(AbK.A06(this.A02));
        parcel.writeLong(AbK.A06(this.A04));
        Long l = this.A01;
        if (l != null) {
            j = l.longValue();
        }
        parcel.writeLong(j);
        parcel.writeTypedList(this.A00);
    }
}
