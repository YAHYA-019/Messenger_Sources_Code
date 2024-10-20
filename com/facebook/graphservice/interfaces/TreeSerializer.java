package com.facebook.graphservice.interfaces;

import java.nio.ByteBuffer;

/* loaded from: TreeSerializer.class */
public interface TreeSerializer {
    Tree deserializeTree(String str, Class cls, int i);

    Tree deserializeTreeFromByteBuffer(ByteBuffer byteBuffer, Class cls, int i);

    int serializeTree(Tree tree, String str);

    ByteBuffer serializeTreeToByteBuffer(Tree tree);
}
