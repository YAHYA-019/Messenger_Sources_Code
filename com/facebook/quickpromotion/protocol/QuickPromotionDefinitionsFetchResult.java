package com.facebook.quickpromotion.protocol;

import X.11T;
import X.AnonymousClass001;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.ArrayList;
import java.util.List;

/* loaded from: QuickPromotionDefinitionsFetchResult.class */
public final class QuickPromotionDefinitionsFetchResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(75);
    public final List quickPromotionDefinitions;

    public QuickPromotionDefinitionsFetchResult() {
        this.quickPromotionDefinitions = null;
    }

    public QuickPromotionDefinitionsFetchResult(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.quickPromotionDefinitions = A0s;
        parcel.readList(A0s, QuickPromotionDefinition.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.quickPromotionDefinitions);
    }
}
