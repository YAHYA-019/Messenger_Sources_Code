package com.facebook.messaging.service.model;

import X.1BL;
import X.AbK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: SaveDraftParams.class */
public final class SaveDraftParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(11);
    public final MessageDraft A00;
    public final ThreadKey A01;

    public SaveDraftParams(Parcel parcel) {
        this.A01 = AbK.A0X(parcel);
        this.A00 = (MessageDraft) 1BL.A0C(parcel, MessageDraft.class);
    }

    public SaveDraftParams(MessageDraft messageDraft, ThreadKey threadKey) {
        this.A01 = threadKey;
        this.A00 = messageDraft;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
