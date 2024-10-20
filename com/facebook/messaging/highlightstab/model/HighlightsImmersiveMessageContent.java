package com.facebook.messaging.highlightstab.model;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.4YW;
import X.5Yu;
import X.5cH;
import X.5cI;
import X.5cO;
import X.5cP;
import X.7mU;
import X.7zL;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: HighlightsImmersiveMessageContent.class */
public final class HighlightsImmersiveMessageContent extends C04v implements Parcelable {
    public static final 5Yu[] A0C;
    public final long A00;
    public final long A01;
    public final Double A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = 7zL.A0v(77);

    /* loaded from: HighlightsImmersiveMessageContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return 5cO.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.highlightstab.model.HighlightsImmersiveMessageContent$Companion, java.lang.Object] */
    static {
        5Yu r0 = new 5cI(5cH.A00);
        5cP r02 = 5cP.A00;
        A0C = new 5Yu[]{null, null, null, null, null, null, null, null, null, r0, new 5cI(r02), new 5cI(r02)};
    }

    public /* synthetic */ HighlightsImmersiveMessageContent(Double d, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, int i, long j, long j2, boolean z) {
        if (4095 != (i & 4095)) {
            7mU.A00(5cO.A01, i, 4095);
            throw 0Q8.createAndThrow();
        }
        this.A05 = str;
        this.A01 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j2;
        this.A06 = str4;
        this.A07 = str5;
        this.A0B = z;
        this.A02 = d;
        this.A09 = list;
        this.A0A = list2;
        this.A08 = list3;
    }

    public HighlightsImmersiveMessageContent(Double d, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, long j, long j2, boolean z) {
        this.A05 = str;
        this.A01 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j2;
        this.A06 = str4;
        this.A07 = str5;
        this.A0B = z;
        this.A02 = d;
        this.A09 = list;
        this.A0A = list2;
        this.A08 = list3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsImmersiveMessageContent)) {
                return false;
            }
            HighlightsImmersiveMessageContent highlightsImmersiveMessageContent = (HighlightsImmersiveMessageContent) obj;
            if (!11T.A0O(this.A05, highlightsImmersiveMessageContent.A05) || this.A01 != highlightsImmersiveMessageContent.A01 || !11T.A0O(this.A03, highlightsImmersiveMessageContent.A03) || !11T.A0O(this.A04, highlightsImmersiveMessageContent.A04) || this.A00 != highlightsImmersiveMessageContent.A00 || !11T.A0O(this.A06, highlightsImmersiveMessageContent.A06) || !11T.A0O(this.A07, highlightsImmersiveMessageContent.A07) || this.A0B != highlightsImmersiveMessageContent.A0B || !11T.A0O(this.A02, highlightsImmersiveMessageContent.A02) || !11T.A0O(this.A09, highlightsImmersiveMessageContent.A09) || !11T.A0O(this.A0A, highlightsImmersiveMessageContent.A0A) || !11T.A0O(this.A08, highlightsImmersiveMessageContent.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A08, AnonymousClass002.A05(this.A0A, AnonymousClass002.A05(this.A09, (((((((AnonymousClass002.A02(this.A00, (((AnonymousClass002.A02(this.A01, 1BL.A05(this.A05) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A07)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + 4YU.A03(this.A02)) * 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0B ? 1 : 0);
        Double d = this.A02;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Iterator A09 = 4YW.A09(parcel, this.A09);
        while (A09.hasNext()) {
            ((HighlightsReactionContent) A09.next()).writeToParcel(parcel, i);
        }
        Iterator A092 = 4YW.A09(parcel, this.A0A);
        while (A092.hasNext()) {
            ((HighlightsAttachmentContent) A092.next()).writeToParcel(parcel, i);
        }
        Iterator A093 = 4YW.A09(parcel, this.A08);
        while (A093.hasNext()) {
            ((HighlightsAttachmentContent) A093.next()).writeToParcel(parcel, i);
        }
    }
}
