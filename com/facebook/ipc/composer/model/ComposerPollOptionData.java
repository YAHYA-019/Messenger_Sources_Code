package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zO;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKa;
import X.Qob;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.composer.model.richtext.ComposerRichTextStyle;
import com.facebook.ipc.media.data.MediaData;

/* loaded from: ComposerPollOptionData.class */
public final class ComposerPollOptionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(55);
    public final ComposerMusicData A00;
    public final Qob A01;
    public final ComposerRichTextStyle A02;
    public final MediaData A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public ComposerPollOptionData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ComposerRichTextStyle composerRichTextStyle = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ComposerMusicData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Qob.values()[parcel.readInt()];
        }
        this.A02 = parcel.readInt() != 0 ? (ComposerRichTextStyle) ComposerRichTextStyle.CREATOR.createFromParcel(parcel) : composerRichTextStyle;
    }

    public ComposerPollOptionData(ComposerMusicData composerMusicData, Qob qob, ComposerRichTextStyle composerRichTextStyle, MediaData mediaData, Long l, String str, String str2, String str3) {
        this.A03 = mediaData;
        this.A00 = composerMusicData;
        this.A05 = str;
        this.A06 = str2;
        C1pq.A08("optionText", str3);
        this.A07 = str3;
        this.A04 = l;
        this.A01 = qob;
        this.A02 = composerRichTextStyle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPollOptionData)) {
                return false;
            }
            ComposerPollOptionData composerPollOptionData = (ComposerPollOptionData) obj;
            if (!11T.A0O(this.A03, composerPollOptionData.A03) || !11T.A0O(this.A00, composerPollOptionData.A00) || !11T.A0O(this.A05, composerPollOptionData.A05) || !11T.A0O(this.A06, composerPollOptionData.A06) || !11T.A0O(this.A07, composerPollOptionData.A07) || !11T.A0O(this.A04, composerPollOptionData.A04) || this.A01 != composerPollOptionData.A01 || !11T.A0O(this.A02, composerPollOptionData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A04, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A00, C1pq.A03(this.A03))))));
        return C1pq.A04(this.A02, (A04 * 31) + C3o5.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A10(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeString(this.A07);
        C3o5.A0g(parcel, this.A04);
        C3o5.A0e(parcel, this.A01);
        ComposerRichTextStyle composerRichTextStyle = this.A02;
        if (composerRichTextStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerRichTextStyle.writeToParcel(parcel, i);
        }
    }
}
