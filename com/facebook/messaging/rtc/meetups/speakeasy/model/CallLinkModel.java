package com.facebook.messaging.rtc.meetups.speakeasy.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zO;
import X.AbF;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.google.common.collect.ImmutableList;

/* loaded from: CallLinkModel.class */
public final class CallLinkModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(57);
    public final long A00;
    public final JoinableVideoChatAvailabilitySettings A01;
    public final SpeakeasyRoomOptionsModel A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final int A09;
    public final long A0A;
    public final RankingLoggingItem A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final Long A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public CallLinkModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A09 = parcel.readInt();
        int readInt = parcel.readInt();
        CallLinkParticipant[] callLinkParticipantArr = new CallLinkParticipant[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, callLinkParticipantArr, i);
        }
        this.A0C = ImmutableList.copyOf(callLinkParticipantArr);
        this.A0A = parcel.readLong();
        SpeakeasyRoomOptionsModel speakeasyRoomOptionsModel = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
        int readInt2 = parcel.readInt();
        CallLinkParticipant[] callLinkParticipantArr2 = new CallLinkParticipant[readInt2];
        int i2 = 0;
        while (i2 < readInt2) {
            i2 = AbI.A01(parcel, A0e, callLinkParticipantArr2, i2);
        }
        this.A0D = ImmutableList.copyOf(callLinkParticipantArr2);
        this.A0L = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0M = 1BM.A07(parcel);
        this.A0N = 1BM.A07(parcel);
        this.A0O = 1BM.A07(parcel);
        this.A0P = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (JoinableVideoChatAvailabilitySettings) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        this.A05 = parcel.readString();
        this.A0G = parcel.readString();
        this.A0H = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        this.A06 = parcel.readString();
        this.A0J = parcel.readString();
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (RankingLoggingItem) RankingLoggingItem.CREATOR.createFromParcel(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? (SpeakeasyRoomOptionsModel) parcel.readParcelable(A0e) : speakeasyRoomOptionsModel;
        this.A0K = parcel.readString();
        this.A08 = AbJ.A1W(parcel);
    }

    public CallLinkModel(JoinableVideoChatAvailabilitySettings joinableVideoChatAvailabilitySettings, SpeakeasyRoomOptionsModel speakeasyRoomOptionsModel, ImmutableList immutableList, ImmutableList immutableList2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A09 = i;
        C1pq.A08("activeParticipants", immutableList);
        this.A0C = immutableList;
        this.A0A = j;
        this.A03 = str;
        this.A00 = j2;
        AbF.A1T(str2);
        this.A04 = str2;
        C1pq.A08("interestedParticipants", immutableList2);
        this.A0D = immutableList2;
        this.A0L = z;
        this.A0M = z2;
        this.A0N = z3;
        this.A0O = z4;
        this.A0P = z5;
        this.A01 = joinableVideoChatAvailabilitySettings;
        this.A0E = l;
        this.A0F = str3;
        C1pq.A08("linkCreatorId", str4);
        this.A05 = str4;
        C1pq.A08("linkCreatorName", str5);
        this.A0G = str5;
        this.A0H = str6;
        this.A0I = str7;
        this.A06 = str8;
        this.A0J = str9;
        AbF.A1U(str10);
        this.A07 = str10;
        this.A0B = null;
        this.A02 = speakeasyRoomOptionsModel;
        this.A0K = str11;
        this.A08 = z6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallLinkModel)) {
                return false;
            }
            CallLinkModel callLinkModel = (CallLinkModel) obj;
            if (this.A09 != callLinkModel.A09 || !11T.A0O(this.A0C, callLinkModel.A0C) || this.A0A != callLinkModel.A0A || !11T.A0O(this.A03, callLinkModel.A03) || this.A00 != callLinkModel.A00 || !11T.A0O(this.A04, callLinkModel.A04) || !11T.A0O(this.A0D, callLinkModel.A0D) || this.A0L != callLinkModel.A0L || this.A0M != callLinkModel.A0M || this.A0N != callLinkModel.A0N || this.A0O != callLinkModel.A0O || this.A0P != callLinkModel.A0P || !11T.A0O(this.A01, callLinkModel.A01) || !11T.A0O(this.A0E, callLinkModel.A0E) || !11T.A0O(this.A0F, callLinkModel.A0F) || !11T.A0O(this.A05, callLinkModel.A05) || !11T.A0O(this.A0G, callLinkModel.A0G) || !11T.A0O(this.A0H, callLinkModel.A0H) || !11T.A0O(this.A0I, callLinkModel.A0I) || !11T.A0O(this.A06, callLinkModel.A06) || !11T.A0O(this.A0J, callLinkModel.A0J) || !11T.A0O(this.A07, callLinkModel.A07) || !11T.A0O(this.A0B, callLinkModel.A0B) || !11T.A0O(this.A02, callLinkModel.A02) || !11T.A0O(this.A0K, callLinkModel.A0K) || this.A08 != callLinkModel.A08) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A0K, C1pq.A04(this.A02, C1pq.A04(this.A0B, C1pq.A04(this.A07, C1pq.A04(this.A0J, C1pq.A04(this.A06, C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A05, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0D, C1pq.A04(this.A04, C1pq.A01(C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A0C, this.A09 + 31), this.A0A)), this.A00))), this.A0L), this.A0M), this.A0N), this.A0O), this.A0P)))))))))))))), this.A08);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A09);
        1Du A0b = 1BL.A0b(parcel, this.A0C);
        while (A0b.hasNext()) {
            parcel.writeParcelable((CallLinkParticipant) A0b.next(), i);
        }
        parcel.writeLong(this.A0A);
        1BL.A13(parcel, this.A03);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        1Du A0b2 = 1BL.A0b(parcel, this.A0D);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((CallLinkParticipant) A0b2.next(), i);
        }
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0g(parcel, this.A0E);
        1BL.A13(parcel, this.A0F);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        1BL.A13(parcel, this.A0I);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A07);
        RankingLoggingItem rankingLoggingItem = this.A0B;
        if (rankingLoggingItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rankingLoggingItem.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A08 ? 1 : 0);
    }
}
