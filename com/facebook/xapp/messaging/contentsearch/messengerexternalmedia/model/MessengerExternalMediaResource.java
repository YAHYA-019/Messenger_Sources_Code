package com.facebook.xapp.messaging.contentsearch.messengerexternalmedia.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YU;
import X.4YV;
import X.AXE;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* loaded from: MessengerExternalMediaResource.class */
public final class MessengerExternalMediaResource implements Parcelable, AXE {
    public static final Parcelable.Creator CREATOR = new FKb(51);
    public final Uri A00;
    public final MediaResource A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final long A05;

    public MessengerExternalMediaResource(Uri uri, MediaResource mediaResource, ImmutableList immutableList, String str, String str2) {
        C1pq.A08("appId", str);
        this.A03 = str;
        this.A05 = 0L;
        C1pq.A08("mediaItems", immutableList);
        this.A02 = immutableList;
        C1pq.A08("resultId", str2);
        this.A04 = str2;
        this.A01 = mediaResource;
        this.A00 = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessengerExternalMediaResource(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A03 = parcel.readString();
        this.A05 = parcel.readLong();
        int readInt = parcel.readInt();
        MediaResource[] mediaResourceArr = new MediaResource[readInt];
        for (int i = 0; i < readInt; i++) {
            mediaResourceArr[i] = parcel.readParcelable(A0e);
        }
        this.A02 = ImmutableList.copyOf(mediaResourceArr);
        this.A04 = parcel.readString();
        Uri uri = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MediaResource) parcel.readParcelable(A0e);
        }
        this.A00 = parcel.readInt() != 0 ? (Uri) parcel.readParcelable(A0e) : uri;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessengerExternalMediaResource)) {
                return false;
            }
            MessengerExternalMediaResource messengerExternalMediaResource = (MessengerExternalMediaResource) obj;
            if (!11T.A0O(this.A03, messengerExternalMediaResource.A03) || this.A05 != messengerExternalMediaResource.A05 || !11T.A0O(this.A02, messengerExternalMediaResource.A02) || !11T.A0O(this.A04, messengerExternalMediaResource.A04) || !11T.A0O(this.A01, messengerExternalMediaResource.A01) || !11T.A0O(this.A00, messengerExternalMediaResource.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A01(C1pq.A03(this.A03), this.A05)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeLong(this.A05);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable(4YU.A0Z(A0b), i);
        }
        parcel.writeString(this.A04);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A00, i);
    }
}
