package com.facebook.xapp.messaging.threadview.model.botresponse;

import X.11T;
import X.1BL;
import X.4YW;
import X.5PP;
import X.6qS;
import X.82N;
import X.C04v;
import X.C3o5;
import X.C97S;
import X.C97T;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: BotResponseMetadata.class */
public final class BotResponseMetadata extends C04v implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new 82N(31);
    public final C97S A00;
    public final C97T A01;
    public final 6qS A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final boolean A0F;
    public final String A0G;

    public BotResponseMetadata(C97S c97s, C97T c97t, 6qS r304, ImmutableList immutableList, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        11T.A0F(num, 2);
        this.A0A = str;
        this.A05 = num;
        this.A08 = str2;
        this.A09 = str3;
        this.A07 = str4;
        this.A03 = immutableList;
        this.A01 = c97t;
        this.A06 = l;
        this.A00 = c97s;
        this.A02 = r304;
        this.A0C = str5;
        this.A0F = z;
        this.A0E = list;
        this.A0B = str6;
        this.A04 = num2;
        this.A0D = str7;
        this.A0G = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BotResponseMetadata)) {
                return false;
            }
            BotResponseMetadata botResponseMetadata = (BotResponseMetadata) obj;
            if (!11T.A0O(this.A0A, botResponseMetadata.A0A) || this.A05 != botResponseMetadata.A05 || !11T.A0O(this.A08, botResponseMetadata.A08) || !11T.A0O(this.A09, botResponseMetadata.A09) || !11T.A0O(this.A07, botResponseMetadata.A07) || !11T.A0O(this.A03, botResponseMetadata.A03) || this.A01 != botResponseMetadata.A01 || !11T.A0O(this.A06, botResponseMetadata.A06) || this.A00 != botResponseMetadata.A00 || this.A02 != botResponseMetadata.A02 || !11T.A0O(this.A0C, botResponseMetadata.A0C) || this.A0F != botResponseMetadata.A0F || !11T.A0O(this.A0E, botResponseMetadata.A0E) || !11T.A0O(this.A0B, botResponseMetadata.A0B) || !11T.A0O(this.A04, botResponseMetadata.A04) || !11T.A0O(this.A0D, botResponseMetadata.A0D) || !11T.A0O(this.A0G, botResponseMetadata.A0G)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.A0A;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        int intValue = this.A05.intValue();
        int hashCode2 = (hashCode + (1 != intValue ? "NONE" : "SERVER_STREAMING_TEXT").hashCode() + intValue) * 31;
        String str2 = this.A08;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ImmutableList immutableList = this.A03;
        int hashCode6 = (hashCode5 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        C97T c97t = this.A01;
        int hashCode7 = (hashCode6 + (c97t == null ? 0 : c97t.hashCode())) * 31;
        Long l = this.A06;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        C97S c97s = this.A00;
        int hashCode9 = (hashCode8 + (c97s == null ? 0 : c97s.hashCode())) * 31;
        6qS r0 = this.A02;
        int hashCode10 = (hashCode9 + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str5 = this.A0C;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int i2 = 1237;
        if (this.A0F) {
            i2 = 1231;
        }
        int i3 = (hashCode11 + i2) * 31;
        List list = this.A0E;
        int hashCode12 = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.A0B;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.A0D;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0G;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode15 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(1 - this.A05.intValue() != 0 ? "NONE" : "SERVER_STREAMING_TEXT");
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeSerializable(this.A03);
        C97T c97t = this.A01;
        if (c97t == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, c97t);
        }
        C3o5.A0g(parcel, this.A06);
        C97S c97s = this.A00;
        if (c97s == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, c97s);
        }
        6qS r0 = this.A02;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, r0);
        }
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0F ? 1 : 0);
        List list = this.A0E;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A09 = 4YW.A09(parcel, list);
            while (A09.hasNext()) {
                ((AIImagineMediaInfo) A09.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A0B);
        C3o5.A0f(parcel, this.A04);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0G);
    }
}
