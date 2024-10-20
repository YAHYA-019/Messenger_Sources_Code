package com.facebook.messaging.model.share;

import X.11T;
import X.1BL;
import X.4YV;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.commerce.model.retail.CommerceData;
import com.facebook.messaging.wellbeing.harmfulcontent.informtreatment.common.data.XMAInformTreatmentParams;
import com.facebook.platform.opengraph.model.OpenGraphActionRobotext;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Share.class */
public final class Share implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(55);
    public final CommerceData A00;
    public final XMAInformTreatmentParams A01;
    public final OpenGraphActionRobotext A02;
    public final SendTamXMAMessageParams A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
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

    public Share(Parcel parcel) {
        this.A0B = parcel.readString();
        this.A0H = parcel.readString();
        this.A0D = parcel.readString();
        this.A07 = parcel.readString();
        this.A0A = parcel.readString();
        ArrayList A0y = 4YV.A0y(parcel, ShareMedia.class);
        11T.A0I(A0y, "null cannot be cast to non-null type java.util.ArrayList<com.facebook.messaging.model.share.ShareMedia>");
        this.A04 = 1BL.A0a(A0y);
        this.A0C = parcel.readString();
        ArrayList A0y2 = 4YV.A0y(parcel, ShareProperty.class);
        11T.A0I(A0y2, "null cannot be cast to non-null type java.util.ArrayList<com.facebook.messaging.model.share.ShareProperty>");
        this.A05 = 1BL.A0a(A0y2);
        this.A02 = (OpenGraphActionRobotext) 1BL.A0C(parcel, OpenGraphActionRobotext.class);
        this.A06 = parcel.readString();
        this.A09 = parcel.readString();
        this.A00 = (CommerceData) 1BL.A0C(parcel, CommerceData.class);
        this.A03 = (SendTamXMAMessageParams) 1BL.A0C(parcel, SendTamXMAMessageParams.class);
        this.A08 = parcel.readString();
        this.A01 = (XMAInformTreatmentParams) 1BL.A0C(parcel, XMAInformTreatmentParams.class);
        this.A0J = parcel.readString();
        this.A0I = parcel.readString();
        this.A0F = parcel.readString();
        this.A0G = parcel.readString();
        this.A0E = parcel.readString();
    }

    public Share(CommerceData commerceData, XMAInformTreatmentParams xMAInformTreatmentParams, OpenGraphActionRobotext openGraphActionRobotext, SendTamXMAMessageParams sendTamXMAMessageParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, List list2) {
        this.A0B = str6;
        this.A0H = str13;
        this.A0D = str8;
        this.A07 = str2;
        this.A0A = str5;
        this.A04 = 1BL.A0a(list);
        this.A0C = str7;
        this.A05 = 1BL.A0a(list2);
        this.A02 = openGraphActionRobotext;
        this.A06 = str;
        this.A09 = str4;
        this.A00 = commerceData;
        this.A03 = sendTamXMAMessageParams;
        this.A08 = str3;
        this.A01 = xMAInformTreatmentParams;
        this.A0J = str10;
        this.A0I = str14;
        this.A0F = str11;
        this.A0G = str12;
        this.A0E = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        parcel.writeList(this.A04);
        parcel.writeString(this.A0C);
        parcel.writeList(this.A05);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0E);
    }
}
