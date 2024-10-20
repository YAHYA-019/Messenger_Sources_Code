package com.facebook.goodwill.ipc;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKX;
import X.GOq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GoodwillInspirationComposerLoggingParams.class */
public final class GoodwillInspirationComposerLoggingParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(81);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public GoodwillInspirationComposerLoggingParams(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
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
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = C3o5.A0O(parcel);
    }

    public GoodwillInspirationComposerLoggingParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
        this.A08 = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GoodwillInspirationComposerLoggingParams)) {
                return false;
            }
            GoodwillInspirationComposerLoggingParams goodwillInspirationComposerLoggingParams = (GoodwillInspirationComposerLoggingParams) obj;
            if (!11T.A0O(this.A00, goodwillInspirationComposerLoggingParams.A00) || !11T.A0O(this.A01, goodwillInspirationComposerLoggingParams.A01) || !11T.A0O(this.A02, goodwillInspirationComposerLoggingParams.A02) || !11T.A0O(this.A03, goodwillInspirationComposerLoggingParams.A03) || !11T.A0O(this.A04, goodwillInspirationComposerLoggingParams.A04) || !11T.A0O(this.A05, goodwillInspirationComposerLoggingParams.A05) || !11T.A0O(this.A06, goodwillInspirationComposerLoggingParams.A06) || !11T.A0O(this.A07, goodwillInspirationComposerLoggingParams.A07) || !11T.A0O(this.A08, goodwillInspirationComposerLoggingParams.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GoodwillInspirationComposerLoggingParams{archivedStoryCardId=");
        A0k.append(this.A00);
        A0k.append(", goodwillCampaignId=");
        A0k.append(this.A01);
        A0k.append(", goodwillPromoMetadata=");
        A0k.append(this.A02);
        A0k.append(", goodwillPromotionId=");
        A0k.append(this.A03);
        A0k.append(", goodwillShareSource=");
        A0k.append(this.A04);
        A0k.append(", goodwillStoryId=");
        A0k.append(this.A05);
        A0k.append(", goodwillStoryType=");
        A0k.append(this.A06);
        A0k.append(", postGraphQLId=");
        A0k.append(this.A07);
        A0k.append(", sharedText=");
        return GOq.A12(this.A08, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
    }
}
