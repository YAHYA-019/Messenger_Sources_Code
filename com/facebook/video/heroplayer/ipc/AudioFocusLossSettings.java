package com.facebook.video.heroplayer.ipc;

import X.1BL;
import X.6TE;
import X.82N;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: AudioFocusLossSettings.class */
public final class AudioFocusLossSettings implements Parcelable {
    public static final AudioFocusLossSettings A03 = new AudioFocusLossSettings();
    public static final Parcelable.Creator CREATOR = new 82N(19);
    public final float A00;
    public final 6TE A01;
    public final 6TE A02;

    public AudioFocusLossSettings() {
        this.A01 = 6TE.A03;
        this.A02 = 6TE.A02;
        this.A00 = 0.0f;
    }

    public AudioFocusLossSettings(6TE r302, 6TE r303) {
        this.A01 = r302;
        this.A02 = r303;
        this.A00 = -1.0f;
    }

    public AudioFocusLossSettings(Parcel parcel) {
        String readString = parcel.readString();
        this.A01 = readString == null ? 6TE.A02 : 6TE.valueOf(readString);
        String readString2 = parcel.readString();
        this.A02 = readString2 == null ? 6TE.A02 : 6TE.valueOf(readString2);
        this.A00 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AudioFocusLossSettings)) {
                return false;
            }
            AudioFocusLossSettings audioFocusLossSettings = (AudioFocusLossSettings) obj;
            if (Float.compare(audioFocusLossSettings.A00, this.A00) == 0 && this.A01 == audioFocusLossSettings.A01 && this.A02 == audioFocusLossSettings.A02) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Float.valueOf(this.A00)});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioFocusLossSettings{mAudioFocusLossBehavior=");
        A0k.append(this.A01);
        A0k.append(", mAudioFocusTransientLossBehavior=");
        A0k.append(this.A02);
        A0k.append(", mAudioFocusTransientLossDuckVolume=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A12(parcel, this.A01);
        1BL.A12(parcel, this.A02);
        parcel.writeFloat(this.A00);
    }
}
