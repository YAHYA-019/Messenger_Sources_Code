package com.facebook.media.model.features;

import X.11T;
import X.4YV;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.media.model.MediaModel;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MediaModelWithFeatures.class */
public final class MediaModelWithFeatures implements Parcelable {
    public static volatile MediaModel A03;
    public static volatile MediaFeatures A04;
    public static final Parcelable.Creator CREATOR = CSR.A00(76);
    public final MediaModel A00;
    public final MediaFeatures A01;
    public final Set A02;

    public MediaModelWithFeatures(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        MediaModel mediaModel = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MediaFeatures) parcel.readParcelable(A0e);
        }
        this.A00 = parcel.readInt() != 0 ? (MediaModel) MediaModel.CREATOR.createFromParcel(parcel) : mediaModel;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public MediaModelWithFeatures(MediaModel mediaModel, MediaFeatures mediaFeatures, Set set) {
        this.A01 = mediaFeatures;
        this.A00 = mediaModel;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public MediaModel A00() {
        if (this.A02.contains("mediaModel")) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    HashSet A0v = AnonymousClass001.A0v();
                    A03 = new MediaModel(null, "not_used", "", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 4YV.A0z("mediaType", A0v, A0v), 0, 0, 0, 0, 0L);
                }
            }
        }
        return A03;
    }

    public MediaFeatures A01() {
        if (this.A02.contains(AnonymousClass000.A00(ActionId.RTMP_PACKET_RECEIVED))) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = new MediaFeatures(null, null, AnonymousClass001.A0v());
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaModelWithFeatures)) {
                return false;
            }
            MediaModelWithFeatures mediaModelWithFeatures = (MediaModelWithFeatures) obj;
            if (!11T.A0O(A01(), mediaModelWithFeatures.A01()) || !11T.A0O(A00(), mediaModelWithFeatures.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A03(A01()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A01, i);
        MediaModel mediaModel = this.A00;
        if (mediaModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaModel.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
