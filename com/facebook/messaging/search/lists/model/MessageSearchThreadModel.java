package com.facebook.messaging.search.lists.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.53N;
import X.7zN;
import X.7zO;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.Bz0;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel;
import com.google.common.collect.ImmutableList;

/* loaded from: MessageSearchThreadModel.class */
public final class MessageSearchThreadModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(68);
    public final int A00;
    public final long A01;
    public final ThreadSummary A02;
    public final 53N A03;
    public final ImmutableList A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final Long A0D;
    public final boolean A0E;
    public final boolean A0F;

    public MessageSearchThreadModel(Bz0 bz0) {
        this.A0D = bz0.A06;
        this.A07 = bz0.A08;
        this.A0E = bz0.A0E;
        this.A05 = bz0.A05;
        this.A08 = bz0.A09;
        this.A09 = bz0.A0A;
        this.A00 = bz0.A00;
        this.A04 = bz0.A04;
        53N r0 = bz0.A03;
        C1pq.A08("resultType", r0);
        this.A03 = r0;
        this.A0A = bz0.A0B;
        this.A0B = bz0.A0C;
        this.A0C = bz0.A0D;
        this.A0F = bz0.A0F;
        this.A06 = bz0.A07;
        ThreadSummary threadSummary = bz0.A02;
        C1pq.A08("threadSummary", threadSummary);
        this.A02 = threadSummary;
        this.A01 = bz0.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageSearchThreadModel(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A0D = null;
        } else {
            this.A0D = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A0E = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            int readInt = parcel.readInt();
            MessageSearchMatchRangesModel[] messageSearchMatchRangesModelArr = new MessageSearchMatchRangesModel[readInt];
            for (int i = 0; i < readInt; i++) {
                messageSearchMatchRangesModelArr[i] = MessageSearchMatchRangesModel.CREATOR.createFromParcel(parcel);
            }
            this.A04 = ImmutableList.copyOf(messageSearchMatchRangesModelArr);
        }
        this.A03 = 53N.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A0C = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0F = AbJ.A1W(parcel);
        this.A06 = AbN.A0h(parcel);
        this.A02 = (ThreadSummary) ThreadSummary.CREATOR.createFromParcel(parcel);
        this.A01 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageSearchThreadModel)) {
                return false;
            }
            MessageSearchThreadModel messageSearchThreadModel = (MessageSearchThreadModel) obj;
            if (!11T.A0O(this.A0D, messageSearchThreadModel.A0D) || !11T.A0O(this.A07, messageSearchThreadModel.A07) || this.A0E != messageSearchThreadModel.A0E || !11T.A0O(this.A05, messageSearchThreadModel.A05) || !11T.A0O(this.A08, messageSearchThreadModel.A08) || !11T.A0O(this.A09, messageSearchThreadModel.A09) || this.A00 != messageSearchThreadModel.A00 || !11T.A0O(this.A04, messageSearchThreadModel.A04) || this.A03 != messageSearchThreadModel.A03 || !11T.A0O(this.A0A, messageSearchThreadModel.A0A) || !11T.A0O(this.A0B, messageSearchThreadModel.A0B) || !11T.A0O(this.A0C, messageSearchThreadModel.A0C) || this.A0F != messageSearchThreadModel.A0F || !11T.A0O(this.A06, messageSearchThreadModel.A06) || !11T.A0O(this.A02, messageSearchThreadModel.A02) || this.A01 != messageSearchThreadModel.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A04, (C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A05, C1pq.A02(C1pq.A04(this.A07, C1pq.A03(this.A0D)), this.A0E)))) * 31) + this.A00);
        return C1pq.A01(C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A02(C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, (A04 * 31) + C3o5.A03(this.A03)))), this.A0F))), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0g(parcel, this.A0D);
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A0E ? 1 : 0);
        C3o5.A0f(parcel, this.A05);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        parcel.writeInt(this.A00);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((MessageSearchMatchRangesModel) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        7zN.A0z(parcel, this.A03);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        parcel.writeInt(this.A0F ? 1 : 0);
        C3o5.A0g(parcel, this.A06);
        this.A02.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
    }
}
