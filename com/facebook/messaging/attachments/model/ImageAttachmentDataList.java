package com.facebook.messaging.attachments.model;

import X.11T;
import X.4YW;
import X.C04v;
import X.C61u;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: ImageAttachmentDataList.class */
public final class ImageAttachmentDataList extends C04v implements Parcelable, C61u {
    public static final Parcelable.Creator CREATOR = new CSR(94);
    public final List A00;

    public ImageAttachmentDataList(List list) {
        this.A00 = list;
    }

    public final boolean A00() {
        List list = this.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaResource mediaResource = ((ImageAttachmentData) it.next()).A09;
            if (mediaResource != null && mediaResource.A03()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C61u
    public boolean BRl() {
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((ImageAttachmentData) it.next()).BRl()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A09 = 4YW.A09(parcel, this.A00);
        while (A09.hasNext()) {
            parcel.writeParcelable((Parcelable) A09.next(), i);
        }
    }
}
