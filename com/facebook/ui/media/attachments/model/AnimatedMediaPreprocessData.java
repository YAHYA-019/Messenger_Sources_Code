package com.facebook.ui.media.attachments.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.google.common.collect.ImmutableList;

/* loaded from: AnimatedMediaPreprocessData.class */
public final class AnimatedMediaPreprocessData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(86);
    public final ImmutableList A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final EffectItem A08;

    public AnimatedMediaPreprocessData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        boolean z = false;
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            AnimatedImageTranscodingData[] animatedImageTranscodingDataArr = new AnimatedImageTranscodingData[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, animatedImageTranscodingDataArr, i);
            }
            this.A00 = ImmutableList.copyOf(animatedImageTranscodingDataArr);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (EffectItem) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = Integer.valueOf(parcel.readInt());
        this.A03 = Integer.valueOf(parcel.readInt());
        this.A07 = C3o5.A0O(parcel);
        this.A01 = Boolean.valueOf(parcel.readInt() == 1 ? true : z);
    }

    public AnimatedMediaPreprocessData(ImmutableList immutableList, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A00 = immutableList;
        this.A04 = str;
        this.A08 = null;
        this.A05 = str2;
        this.A06 = str3;
        C1pq.A08("outputHeight", num);
        this.A02 = num;
        C1pq.A08("outputWidth", num2);
        this.A03 = num2;
        this.A07 = str4;
        C1pq.A08("shouldTranscodeFromImage", bool);
        this.A01 = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnimatedMediaPreprocessData)) {
                return false;
            }
            AnimatedMediaPreprocessData animatedMediaPreprocessData = (AnimatedMediaPreprocessData) obj;
            if (!11T.A0O(this.A00, animatedMediaPreprocessData.A00) || !11T.A0O(this.A04, animatedMediaPreprocessData.A04) || !11T.A0O(this.A08, animatedMediaPreprocessData.A08) || !11T.A0O(this.A05, animatedMediaPreprocessData.A05) || !11T.A0O(this.A06, animatedMediaPreprocessData.A06) || !11T.A0O(this.A02, animatedMediaPreprocessData.A02) || !11T.A0O(this.A03, animatedMediaPreprocessData.A03) || !11T.A0O(this.A07, animatedMediaPreprocessData.A07) || !11T.A0O(this.A01, animatedMediaPreprocessData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A07, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A08, C1pq.A04(this.A04, C1pq.A03(this.A00)))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                parcel.writeParcelable((AnimatedImageTranscodingData) A0b.next(), i);
            }
        }
        1BL.A13(parcel, this.A04);
        C3o5.A0d(parcel, this.A08, i);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeInt(this.A02.intValue());
        parcel.writeInt(this.A03.intValue());
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A01.booleanValue() ? 1 : 0);
    }
}
