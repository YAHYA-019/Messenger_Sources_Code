package com.facebook.messaging.business.plugins.suggestedreply.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbI;
import X.AbK;
import X.AnonymousClass001;
import X.C1pq;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;
import com.google.common.collect.ImmutableList;

/* loaded from: SuggestedReplyOpenTopSheetParams.class */
public final class SuggestedReplyOpenTopSheetParams implements Parcelable, ComposerTopSheetOpenParams {
    public static final Parcelable.Creator CREATOR = CSW.A00(43);
    public final long A00;
    public final long A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    public SuggestedReplyOpenTopSheetParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        int readInt = parcel.readInt();
        ReplyEntry[] replyEntryArr = new ReplyEntry[readInt];
        boolean z = false;
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, replyEntryArr, i);
        }
        this.A02 = ImmutableList.copyOf(replyEntryArr);
        this.A04 = parcel.readInt() == 1 ? true : z;
        this.A03 = AbK.A15(parcel, parcel.readInt());
    }

    public SuggestedReplyOpenTopSheetParams(ImmutableList immutableList, String str, long j, long j2, boolean z) {
        this.A00 = j;
        this.A01 = j2;
        C1pq.A08("replyEntries", immutableList);
        this.A02 = immutableList;
        this.A04 = z;
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SuggestedReplyOpenTopSheetParams)) {
                return false;
            }
            SuggestedReplyOpenTopSheetParams suggestedReplyOpenTopSheetParams = (SuggestedReplyOpenTopSheetParams) obj;
            if (this.A00 != suggestedReplyOpenTopSheetParams.A00 || this.A01 != suggestedReplyOpenTopSheetParams.A01 || !11T.A0O(this.A02, suggestedReplyOpenTopSheetParams.A02) || this.A04 != suggestedReplyOpenTopSheetParams.A04 || !11T.A0O(this.A03, suggestedReplyOpenTopSheetParams.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A01(1BL.A01(this.A00) + 31, this.A01)), this.A04));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SuggestedReplyOpenTopSheetParams{consumerId=");
        A0k.append(this.A00);
        A0k.append(", pageId=");
        A0k.append(this.A01);
        A0k.append(", replyEntries=");
        A0k.append(this.A02);
        A0k.append(", shouldLogSuggestionImpression=");
        A0k.append(this.A04);
        A0k.append(", typedMessage=");
        A0k.append(this.A03);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ReplyEntry) A0b.next(), i);
        }
        parcel.writeInt(this.A04 ? 1 : 0);
        4YW.A0E(parcel, this.A03);
    }
}
