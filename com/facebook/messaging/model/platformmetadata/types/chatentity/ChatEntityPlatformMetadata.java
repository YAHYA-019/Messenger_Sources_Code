package com.facebook.messaging.model.platformmetadata.types.chatentity;

import X.11T;
import X.1BK;
import X.1BL;
import X.24X;
import X.2DM;
import X.4YU;
import X.C5qt;
import X.C7yy;
import X.CSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: ChatEntityPlatformMetadata.class */
public final class ChatEntityPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSZ(0);
    public final MessagePlatformChatEntity A00;

    public ChatEntityPlatformMetadata(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, MessagePlatformChatEntity.class);
        if (A0C == null) {
            throw 1BK.A0h();
        }
        this.A00 = (MessagePlatformChatEntity) A0C;
    }

    public ChatEntityPlatformMetadata(MessagePlatformChatEntity messagePlatformChatEntity) {
        this.A00 = messagePlatformChatEntity;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public C5qt A00() {
        return C5qt.A06;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public 24X A01() {
        MessagePlatformChatEntity messagePlatformChatEntity = this.A00;
        2DM A0f = 4YU.A0f();
        A0f.A0o("content_id", messagePlatformChatEntity.A00);
        A0f.A0o(TraceFieldType.ContentType, messagePlatformChatEntity.A01);
        return A0f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
