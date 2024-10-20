package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1q8;
import X.C53v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: MontageThreadPreview.class */
public final class MontageThreadPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(66);
    public final long A00;
    public final Attachment A01;
    public final C1q8 A02;
    public final ParticipantInfo A03;
    public final MontageMetadata A04;
    public final MediaResource A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public MontageThreadPreview(Parcel parcel) {
        this.A00 = parcel.readLong();
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = readString;
        this.A01 = (Attachment) 1BL.A0C(parcel, Attachment.class);
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        Enum A07 = C53v.A07(parcel, C1q8.class);
        if (A07 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = (C1q8) A07;
        this.A05 = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
        Parcelable A0C = 1BL.A0C(parcel, ParticipantInfo.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = (ParticipantInfo) A0C;
        this.A04 = (MontageMetadata) 1BL.A0C(parcel, MontageMetadata.class);
    }

    public MontageThreadPreview(Attachment attachment, C1q8 c1q8, ParticipantInfo participantInfo, MontageMetadata montageMetadata, MediaResource mediaResource, String str, String str2, String str3, long j) {
        this.A00 = j;
        this.A06 = str;
        this.A02 = c1q8;
        this.A03 = participantInfo;
        this.A01 = attachment;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = mediaResource;
        this.A04 = montageMetadata;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            MontageThreadPreview montageThreadPreview = (MontageThreadPreview) obj;
            if (this.A00 != montageThreadPreview.A00 || !11T.A0O(this.A06, montageThreadPreview.A06)) {
                return false;
            }
            Attachment attachment = this.A01;
            Attachment attachment2 = montageThreadPreview.A01;
            if (attachment != null) {
                if (!attachment.equals(attachment2)) {
                    return false;
                }
            } else if (attachment2 != null) {
                return false;
            }
            String str = this.A07;
            String str2 = montageThreadPreview.A07;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (this.A02 != montageThreadPreview.A02) {
                return false;
            }
            MediaResource mediaResource = this.A05;
            MediaResource mediaResource2 = montageThreadPreview.A05;
            if (mediaResource != null) {
                if (!mediaResource.equals(mediaResource2)) {
                    return false;
                }
            } else if (mediaResource2 != null) {
                return false;
            }
            if (!11T.A0O(this.A03, montageThreadPreview.A03)) {
                return false;
            }
            MontageMetadata montageMetadata = this.A04;
            MontageMetadata montageMetadata2 = montageThreadPreview.A04;
            if (montageMetadata != null) {
                if (!montageMetadata.equals(montageMetadata2)) {
                    return false;
                }
            } else if (montageMetadata2 != null) {
                return false;
            }
            String str3 = this.A08;
            String str4 = montageThreadPreview.A08;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (AnonymousClass002.A02(this.A00, this.A06.hashCode() * 31) + AnonymousClass002.A04(this.A01)) * 31;
        String str = this.A07;
        int hashCode = (A02 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A08;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + AnonymousClass002.A04(this.A02)) * 31) + AnonymousClass002.A04(this.A05)) * 31) + AnonymousClass002.A04(this.A03)) * 31;
        MontageMetadata montageMetadata = this.A04;
        if (montageMetadata != null) {
            i = montageMetadata.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        C53v.A0J(parcel, this.A02);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
    }
}
