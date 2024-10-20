package com.facebook.ui.media.externalmedia;

import X.1BL;
import X.AnonymousClass001;
import X.FKe;
import X.H9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: ExternalMediaGraphQLResult.class */
public final class ExternalMediaGraphQLResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(89);
    public final Sticker A00;
    public final MediaResource A01;
    public final H9l A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;

    public ExternalMediaGraphQLResult(Parcel parcel) {
        this.A02 = (H9l) parcel.readSerializable();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = (Sticker) 1BL.A0C(parcel, Sticker.class);
        this.A01 = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readList(A0s, MediaResource.class.getClassLoader());
        this.A03 = ImmutableList.copyOf((Collection) A0s);
    }

    public ExternalMediaGraphQLResult(Sticker sticker, MediaResource mediaResource, H9l h9l, ImmutableList immutableList, String str, String str2) {
        this.A02 = h9l;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = sticker;
        this.A01 = mediaResource;
        this.A03 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A03);
    }
}
