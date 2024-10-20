package com.google.repack.protobuf;

import X.KEH;
import X.Lge;
import X.MJ3;
import java.io.OutputStream;

/* loaded from: MessageLite.class */
public interface MessageLite extends MJ3 {
    int getSerializedSize();

    Lge newBuilderForType();

    Lge toBuilder();

    byte[] toByteArray();

    void writeTo(KEH keh);

    void writeTo(OutputStream outputStream);
}
