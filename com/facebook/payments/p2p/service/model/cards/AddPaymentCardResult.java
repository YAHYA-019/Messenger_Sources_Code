package com.facebook.payments.p2p.service.model.cards;

import X.4YV;
import X.AbN;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: AddPaymentCardResult.class */
public class AddPaymentCardResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(6);
    public final ImmutableList authTicketsWithPttKidFilteringIds;
    public final String credentialId;
    public final String encodedCredentialId;
    public final String followUpActionButtonText;
    public final String followUpActionText;
    public final String followUpActionType;
    public final String followUpActionUrl;
    public final boolean isMoneyTransferEnabled;

    public AddPaymentCardResult() {
        this.credentialId = null;
        this.encodedCredentialId = null;
        this.followUpActionType = null;
        this.followUpActionText = null;
        this.followUpActionUrl = null;
        this.followUpActionButtonText = null;
        this.isMoneyTransferEnabled = true;
        this.authTicketsWithPttKidFilteringIds = null;
    }

    public AddPaymentCardResult(Parcel parcel) {
        this.credentialId = parcel.readString();
        this.encodedCredentialId = parcel.readString();
        this.followUpActionType = parcel.readString();
        this.followUpActionText = parcel.readString();
        this.followUpActionUrl = parcel.readString();
        this.followUpActionButtonText = parcel.readString();
        this.isMoneyTransferEnabled = AbN.A1U(parcel);
        ArrayList A0y = 4YV.A0y(parcel, ArrayList.class);
        this.authTicketsWithPttKidFilteringIds = A0y != null ? ImmutableList.copyOf((Collection) A0y) : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.credentialId);
        parcel.writeString(this.encodedCredentialId);
        parcel.writeString(this.followUpActionType);
        parcel.writeString(this.followUpActionText);
        parcel.writeString(this.followUpActionUrl);
        parcel.writeString(this.followUpActionButtonText);
        parcel.writeInt(this.isMoneyTransferEnabled ? 1 : 0);
        ImmutableList immutableList = this.authTicketsWithPttKidFilteringIds;
        parcel.writeArray(immutableList == null ? null : immutableList.toArray());
    }
}
