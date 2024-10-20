package com.facebook.messaging.audio.plugins.voiceclip.instructions;

import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;

/* loaded from: InstructionsVoiceClipParams.class */
public final class InstructionsVoiceClipParams implements Parcelable, ComposerTopSheetOpenParams {
    public static final Parcelable.Creator CREATOR = CSR.A00(95);
    public final int A00;

    public InstructionsVoiceClipParams(int i) {
        this.A00 = i;
    }

    public InstructionsVoiceClipParams(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InstructionsVoiceClipParams) && this.A00 == ((InstructionsVoiceClipParams) obj).A00);
    }

    public int hashCode() {
        return this.A00 + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
