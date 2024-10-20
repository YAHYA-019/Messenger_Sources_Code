package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zL;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FeedbackSubmissionResult.class */
public final class FeedbackSubmissionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(97);
    public final FRXEvidencePrompt A00;
    public final FRXReportConfirmationPrompt A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public FeedbackSubmissionResult(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        AdditionalAction[] additionalActionArr = new AdditionalAction[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, additionalActionArr, i2);
        }
        this.A02 = ImmutableList.copyOf(additionalActionArr);
        int readInt2 = parcel.readInt();
        CustomButton[] customButtonArr = new CustomButton[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, customButtonArr, i3);
        }
        this.A03 = ImmutableList.copyOf(customButtonArr);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FRXEvidencePrompt) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (FRXReportConfirmationPrompt) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            int readInt3 = parcel.readInt();
            InfoItem[] infoItemArr = new InfoItem[readInt3];
            while (i < readInt3) {
                i = AbI.A01(parcel, A0e, infoItemArr, i);
            }
            this.A04 = ImmutableList.copyOf(infoItemArr);
        }
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0A = C3o5.A0O(parcel);
    }

    public FeedbackSubmissionResult(FRXEvidencePrompt fRXEvidencePrompt, FRXReportConfirmationPrompt fRXReportConfirmationPrompt, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6) {
        C1pq.A08("additionalActions", immutableList);
        this.A02 = immutableList;
        C1pq.A08("customButtons", immutableList2);
        this.A03 = immutableList2;
        this.A00 = fRXEvidencePrompt;
        this.A01 = fRXReportConfirmationPrompt;
        this.A05 = str;
        this.A04 = immutableList3;
        C1pq.A08("promptTokenId", str2);
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FeedbackSubmissionResult)) {
                return false;
            }
            FeedbackSubmissionResult feedbackSubmissionResult = (FeedbackSubmissionResult) obj;
            if (!11T.A0O(this.A02, feedbackSubmissionResult.A02) || !11T.A0O(this.A03, feedbackSubmissionResult.A03) || !11T.A0O(this.A00, feedbackSubmissionResult.A00) || !11T.A0O(this.A01, feedbackSubmissionResult.A01) || !11T.A0O(this.A05, feedbackSubmissionResult.A05) || !11T.A0O(this.A04, feedbackSubmissionResult.A04) || !11T.A0O(this.A06, feedbackSubmissionResult.A06) || !11T.A0O(this.A07, feedbackSubmissionResult.A07) || !11T.A0O(this.A08, feedbackSubmissionResult.A08) || !11T.A0O(this.A09, feedbackSubmissionResult.A09) || !11T.A0O(this.A0A, feedbackSubmissionResult.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A04, C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02)))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AdditionalAction) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A03);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((CustomButton) A0b2.next(), i);
        }
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        1BL.A13(parcel, this.A05);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((InfoItem) A0Y.next(), i);
            }
        }
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
    }
}
