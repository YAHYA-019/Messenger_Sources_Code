package com.facebook.messaging.search.lists.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.53N;
import X.7zN;
import X.7zO;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel;
import com.google.common.collect.ImmutableList;

/* loaded from: MessageSearchMessageModel.class */
public final class MessageSearchMessageModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(67);
    public final long A00;
    public final ThreadSummary A01;
    public final 53N A02;
    public final ImmutableList A03;
    public final Boolean A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageSearchMessageModel(Parcel parcel) {
        ThreadSummary threadSummary = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A0G = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0H = 1BM.A07(parcel);
        this.A04 = Boolean.valueOf(1BM.A07(parcel));
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt = parcel.readInt();
            MessageSearchMatchRangesModel[] messageSearchMatchRangesModelArr = new MessageSearchMatchRangesModel[readInt];
            for (int i = 0; i < readInt; i++) {
                messageSearchMatchRangesModelArr[i] = MessageSearchMatchRangesModel.CREATOR.createFromParcel(parcel);
            }
            this.A03 = ImmutableList.copyOf(messageSearchMatchRangesModelArr);
        }
        this.A02 = 53N.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A0I = AbJ.A1W(parcel);
        this.A0F = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? (ThreadSummary) ThreadSummary.CREATOR.createFromParcel(parcel) : threadSummary;
        this.A00 = parcel.readLong();
        this.A06 = AbN.A0h(parcel);
    }

    public MessageSearchMessageModel(ThreadSummary threadSummary, 53N r303, ImmutableList immutableList, Boolean bool, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, boolean z) {
        this.A07 = str;
        this.A0G = false;
        this.A0H = false;
        C1pq.A08("isOpenThread", bool);
        this.A04 = bool;
        C1pq.A08("message", str2);
        this.A08 = str2;
        C1pq.A08("messageId", str3);
        this.A09 = str3;
        this.A05 = l;
        this.A0A = str4;
        this.A03 = immutableList;
        C1pq.A08("resultType", r303);
        this.A02 = r303;
        this.A0B = str5;
        this.A0C = str6;
        this.A0D = str7;
        this.A0E = str8;
        this.A0I = z;
        C1pq.A08("threadKey", str9);
        this.A0F = str9;
        this.A01 = threadSummary;
        this.A00 = j;
        this.A06 = l2;
    }

    public MessageSearchMessageModel(ThreadSummary threadSummary, 53N r303, ImmutableList immutableList, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z) {
        this.A07 = null;
        this.A0G = false;
        this.A0H = false;
        this.A04 = bool;
        C1pq.A08("message", str);
        this.A08 = str;
        C1pq.A08("messageId", str2);
        this.A09 = str2;
        this.A05 = null;
        this.A0A = null;
        this.A03 = immutableList;
        this.A02 = r303;
        this.A0B = null;
        this.A0C = str3;
        this.A0D = str4;
        this.A0E = str5;
        this.A0I = z;
        C1pq.A08("threadKey", str6);
        this.A0F = str6;
        this.A01 = threadSummary;
        this.A00 = j;
        this.A06 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageSearchMessageModel)) {
                return false;
            }
            MessageSearchMessageModel messageSearchMessageModel = (MessageSearchMessageModel) obj;
            if (!11T.A0O(this.A07, messageSearchMessageModel.A07) || this.A0G != messageSearchMessageModel.A0G || this.A0H != messageSearchMessageModel.A0H || !11T.A0O(this.A04, messageSearchMessageModel.A04) || !11T.A0O(this.A08, messageSearchMessageModel.A08) || !11T.A0O(this.A09, messageSearchMessageModel.A09) || !11T.A0O(this.A05, messageSearchMessageModel.A05) || !11T.A0O(this.A0A, messageSearchMessageModel.A0A) || !11T.A0O(this.A03, messageSearchMessageModel.A03) || this.A02 != messageSearchMessageModel.A02 || !11T.A0O(this.A0B, messageSearchMessageModel.A0B) || !11T.A0O(this.A0C, messageSearchMessageModel.A0C) || !11T.A0O(this.A0D, messageSearchMessageModel.A0D) || !11T.A0O(this.A0E, messageSearchMessageModel.A0E) || this.A0I != messageSearchMessageModel.A0I || !11T.A0O(this.A0F, messageSearchMessageModel.A0F) || !11T.A0O(this.A01, messageSearchMessageModel.A01) || this.A00 != messageSearchMessageModel.A00 || !11T.A0O(this.A06, messageSearchMessageModel.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A04(this.A0A, C1pq.A04(this.A05, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A04, C1pq.A02(C1pq.A02(C1pq.A03(this.A07), this.A0G), this.A0H)))))));
        return C1pq.A04(this.A06, C1pq.A01(C1pq.A04(this.A01, C1pq.A04(this.A0F, C1pq.A02(C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, (A04 * 31) + C3o5.A03(this.A02))))), this.A0I))), this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A04.booleanValue() ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        C3o5.A0g(parcel, this.A05);
        1BL.A13(parcel, this.A0A);
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((MessageSearchMatchRangesModel) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        7zN.A0z(parcel, this.A02);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0F);
        ThreadSummary threadSummary = this.A01;
        if (threadSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadSummary.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.A00);
        C3o5.A0g(parcel, this.A06);
    }
}
