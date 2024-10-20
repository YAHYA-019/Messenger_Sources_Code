package com.facebook.messaging.montage.model.art;

import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ArtCategoryItem.class */
public final class ArtCategoryItem extends BaseItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(3);
    public ImmutableList A00;

    @Override // com.facebook.messaging.montage.model.art.BaseItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
    }
}
