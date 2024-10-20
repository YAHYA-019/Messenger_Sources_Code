package com.facebook.messaging.integrity.frx.model;

import X.1BL;
import X.4YV;
import X.7zL;
import X.AnonymousClass001;
import X.DIm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: FRXPage.class */
public final class FRXPage implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(93);
    public AdditionalActionsPage A00;
    public BlockPage A01;
    public EvidencePage A02;
    public EvidenceSearchPage A03;
    public FeedbackPage A04;
    public GroupMembersPage A05;
    public MarketplaceFeedbackPage A06;
    public final int A07;
    public final String A08;

    public FRXPage(int i, String str) {
        this.A07 = i;
        this.A08 = str;
    }

    public FRXPage(Parcel parcel) {
        this.A04 = (FeedbackPage) 1BL.A0C(parcel, FeedbackPage.class);
        this.A06 = (MarketplaceFeedbackPage) 1BL.A0C(parcel, MarketplaceFeedbackPage.class);
        this.A00 = (AdditionalActionsPage) 1BL.A0C(parcel, AdditionalActionsPage.class);
        this.A01 = (BlockPage) 1BL.A0C(parcel, BlockPage.class);
        this.A05 = (GroupMembersPage) 1BL.A0C(parcel, GroupMembersPage.class);
        this.A02 = (EvidencePage) 1BL.A0C(parcel, EvidencePage.class);
        this.A03 = (EvidenceSearchPage) 1BL.A0C(parcel, EvidenceSearchPage.class);
        this.A07 = parcel.readInt();
        this.A08 = parcel.readString();
    }

    public Object A00(DIm dIm) {
        FeedbackPage feedbackPage = this.A04;
        if (feedbackPage != null) {
            return dIm.D9T(feedbackPage);
        }
        MarketplaceFeedbackPage marketplaceFeedbackPage = this.A06;
        if (marketplaceFeedbackPage != null) {
            return dIm.D9V(marketplaceFeedbackPage);
        }
        AdditionalActionsPage additionalActionsPage = this.A00;
        if (additionalActionsPage != null) {
            return dIm.D9P(additionalActionsPage);
        }
        BlockPage blockPage = this.A01;
        if (blockPage != null) {
            return dIm.D9Q(blockPage);
        }
        GroupMembersPage groupMembersPage = this.A05;
        if (groupMembersPage != null) {
            return dIm.D9U(groupMembersPage);
        }
        EvidencePage evidencePage = this.A02;
        if (evidencePage != null) {
            return dIm.D9R(evidencePage);
        }
        EvidenceSearchPage evidenceSearchPage = this.A03;
        if (evidenceSearchPage != null) {
            return dIm.D9S(evidenceSearchPage);
        }
        throw AnonymousClass001.A0N("No valid page to visit!");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof FRXPage) {
            FRXPage fRXPage = (FRXPage) obj;
            if (Objects.equal(this.A04, fRXPage.A04) && Objects.equal(this.A06, fRXPage.A06) && Objects.equal(this.A00, fRXPage.A00) && Objects.equal(this.A01, fRXPage.A01) && Objects.equal(this.A05, fRXPage.A05) && Objects.equal(this.A02, fRXPage.A02)) {
                z = 4YV.A1Z(this.A03, fRXPage.A03);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A06, this.A00, this.A01, this.A05, this.A02, this.A03});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A07);
        parcel.writeString(this.A08);
    }
}
