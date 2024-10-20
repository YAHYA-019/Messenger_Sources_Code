package com.facebook.messaging.model.platformmetadata.types.persona;

import X.1BL;
import X.C7yy;
import X.CSa;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: MessagePersonaPlatformMetadata.class */
public final class MessagePersonaPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSa(2);
    public final MessagePlatformPersona A00;

    public MessagePersonaPlatformMetadata(Parcel parcel) {
        this.A00 = (MessagePlatformPersona) 1BL.A0C(parcel, MessagePlatformPersona.class);
    }

    public MessagePersonaPlatformMetadata(MessagePlatformPersona messagePlatformPersona) {
        this.A00 = messagePlatformPersona;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
