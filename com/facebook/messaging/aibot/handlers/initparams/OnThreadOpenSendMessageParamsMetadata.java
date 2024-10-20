package com.facebook.messaging.aibot.handlers.initparams;

import X.11T;
import X.82M;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;
import java.util.List;

/* loaded from: OnThreadOpenSendMessageParamsMetadata.class */
public final class OnThreadOpenSendMessageParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A0C;
    public static final Parcelable.Creator CREATOR = new 82M(9);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A0C = new AnonymousClass207(OnThreadOpenSendMessageParamsMetadata.class, null);
    }

    public OnThreadOpenSendMessageParamsMetadata(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2) {
        this.A07 = str;
        this.A05 = str2;
        this.A00 = num;
        this.A01 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A06 = str6;
        this.A04 = str7;
        this.A08 = str8;
        this.A09 = str9;
        this.A0B = list;
        this.A0A = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OnThreadOpenSendMessageParamsMetadata)) {
                return false;
            }
            OnThreadOpenSendMessageParamsMetadata onThreadOpenSendMessageParamsMetadata = (OnThreadOpenSendMessageParamsMetadata) obj;
            if (!11T.A0O(this.A07, onThreadOpenSendMessageParamsMetadata.A07) || !11T.A0O(this.A05, onThreadOpenSendMessageParamsMetadata.A05) || !11T.A0O(this.A00, onThreadOpenSendMessageParamsMetadata.A00) || !11T.A0O(this.A01, onThreadOpenSendMessageParamsMetadata.A01) || !11T.A0O(this.A02, onThreadOpenSendMessageParamsMetadata.A02) || !11T.A0O(this.A03, onThreadOpenSendMessageParamsMetadata.A03) || !11T.A0O(this.A06, onThreadOpenSendMessageParamsMetadata.A06) || !11T.A0O(this.A04, onThreadOpenSendMessageParamsMetadata.A04) || !11T.A0O(this.A08, onThreadOpenSendMessageParamsMetadata.A08) || !11T.A0O(this.A09, onThreadOpenSendMessageParamsMetadata.A09) || !11T.A0O(this.A0B, onThreadOpenSendMessageParamsMetadata.A0B) || !11T.A0O(this.A0A, onThreadOpenSendMessageParamsMetadata.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.A07;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A01;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A02;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A03;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A06;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A04;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A08;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A09;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.A0B;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A0A;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode11 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        11T.A0F(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        Integer num = this.A00;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeStringList(this.A0B);
        parcel.writeStringList(this.A0A);
    }
}
