package com.facebook.ipc.composer.model.editprefilled;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.composer.model.ComposerLookingForPlayersModel;

/* loaded from: EditComposerPreFilledData.class */
public final class EditComposerPreFilledData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(22);
    public final ComposerLookingForPlayersModel A00;

    public EditComposerPreFilledData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : (ComposerLookingForPlayersModel) ComposerLookingForPlayersModel.CREATOR.createFromParcel(parcel);
    }

    public EditComposerPreFilledData(ComposerLookingForPlayersModel composerLookingForPlayersModel) {
        this.A00 = composerLookingForPlayersModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EditComposerPreFilledData) && 11T.A0O(this.A00, ((EditComposerPreFilledData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ComposerLookingForPlayersModel composerLookingForPlayersModel = this.A00;
        if (composerLookingForPlayersModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerLookingForPlayersModel.writeToParcel(parcel, i);
        }
    }
}
