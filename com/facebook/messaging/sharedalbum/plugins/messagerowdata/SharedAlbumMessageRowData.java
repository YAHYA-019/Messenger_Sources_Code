package com.facebook.messaging.sharedalbum.plugins.messagerowdata;

import X.11T;
import X.60I;
import X.60W;
import com.facebook.messaging.model.messages.Message;

/* loaded from: SharedAlbumMessageRowData.class */
public final class SharedAlbumMessageRowData {
    public final Message A00;
    public final 60I A01;
    public final 60W A02;

    public SharedAlbumMessageRowData(Message message, 60I r303, 60W r304) {
        11T.A0F(message, 1);
        11T.A0F(r303, 2);
        11T.A0F(r304, 3);
        this.A00 = message;
        this.A01 = r303;
        this.A02 = r304;
    }
}