package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.viewercontext.ViewerContext;

/* loaded from: ComposerDifferentVoiceData.class */
public final class ComposerDifferentVoiceData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(12);
    public final ViewerContext A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public ComposerDifferentVoiceData(Parcel parcel) {
        this.A03 = DKI.A0k(parcel, this);
        ViewerContext viewerContext = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? (ViewerContext) ViewerContext.CREATOR.createFromParcel(parcel) : viewerContext;
    }

    public ComposerDifferentVoiceData(ViewerContext viewerContext, String str, String str2, boolean z) {
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = viewerContext;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerDifferentVoiceData)) {
                return false;
            }
            ComposerDifferentVoiceData composerDifferentVoiceData = (ComposerDifferentVoiceData) obj;
            if (this.A03 != composerDifferentVoiceData.A03 || !11T.A0O(this.A01, composerDifferentVoiceData.A01) || !11T.A0O(this.A02, composerDifferentVoiceData.A02) || !11T.A0O(this.A00, composerDifferentVoiceData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A05(this.A03))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        ViewerContext viewerContext = this.A00;
        if (viewerContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewerContext.writeToParcel(parcel, i);
        }
    }
}
