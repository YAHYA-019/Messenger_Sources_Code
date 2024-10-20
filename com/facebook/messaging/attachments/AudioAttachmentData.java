package com.facebook.messaging.attachments;

import X.1BL;
import X.82M;
import X.AnonymousClass001;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose;
import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: AudioAttachmentData.class */
public final class AudioAttachmentData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(11);
    public final long A00;
    public final Uri A01;
    public final AvatarAudioMessagePose A02;
    public final WaveformData A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public AudioAttachmentData(Uri uri, AvatarAudioMessagePose avatarAudioMessagePose, WaveformData waveformData, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A00 = j;
        this.A01 = uri;
        this.A08 = z;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = waveformData;
        this.A07 = str3;
        this.A02 = avatarAudioMessagePose;
        this.A04 = str4;
    }

    public AudioAttachmentData(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A08 = AnonymousClass001.A1P(parcel.readInt());
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = (WaveformData) 1BL.A0C(parcel, WaveformData.class);
        this.A07 = parcel.readString();
        this.A02 = (AvatarAudioMessagePose) 1BL.A0C(parcel, AvatarAudioMessagePose.class);
        this.A04 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof AudioAttachmentData)) {
            AudioAttachmentData audioAttachmentData = (AudioAttachmentData) obj;
            if (this.A00 == audioAttachmentData.A00 && Objects.equal(this.A01, audioAttachmentData.A01) && this.A08 == audioAttachmentData.A08 && this.A05.equals(audioAttachmentData.A05) && Objects.equal(this.A06, audioAttachmentData.A06) && Objects.equal(this.A03, audioAttachmentData.A03) && Objects.equal(this.A07, audioAttachmentData.A07) && Objects.equal(this.A02, audioAttachmentData.A02) && Objects.equal(this.A04, audioAttachmentData.A04)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01, Boolean.valueOf(this.A08), this.A05, this.A06, this.A03, this.A07, this.A02, this.A04});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
    }
}
