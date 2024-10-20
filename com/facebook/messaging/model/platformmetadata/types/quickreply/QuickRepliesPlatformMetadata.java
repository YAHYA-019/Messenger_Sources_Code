package com.facebook.messaging.model.platformmetadata.types.quickreply;

import X.4YV;
import X.C7yy;
import X.CSa;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: QuickRepliesPlatformMetadata.class */
public final class QuickRepliesPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSa(3);
    public final ImmutableList A00;

    public QuickRepliesPlatformMetadata(Parcel parcel) {
        ArrayList A0y = 4YV.A0y(parcel, QuickReplyItem.class);
        this.A00 = A0y == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) A0y);
    }

    public QuickRepliesPlatformMetadata(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }
}
