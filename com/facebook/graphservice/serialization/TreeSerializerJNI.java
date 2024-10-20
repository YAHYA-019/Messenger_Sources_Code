package com.facebook.graphservice.serialization;

import X.1VZ;
import X.AnonymousClass001;
import X.C0gh;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.interfaces.TreeSerializer;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;
import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;

/* loaded from: TreeSerializerJNI.class */
public class TreeSerializerJNI implements TreeSerializer {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphservice-jni-serialization");
    }

    public TreeSerializerJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native TreeJNI deserializeTreeFromByteBufferNative(ByteBuffer byteBuffer, Class cls, int i, boolean z, boolean z2);

    private native TreeJNI deserializeTreeNative(String str, Class cls, int i, int i2, int i3, boolean z, boolean z2);

    private native int serializeTreeNative(TreeJNI treeJNI, String str, boolean z, boolean z2);

    private native ByteBuffer serializeTreeToByteBufferNative(TreeJNI treeJNI, boolean z);

    @Override // com.facebook.graphservice.interfaces.TreeSerializer
    public Tree deserializeTree(String str, Class cls, int i) {
        return deserializeTreeNative(str, cls, i, 0, 0, 1VZ.A06, 1VZ.A07);
    }

    @Override // com.facebook.graphservice.interfaces.TreeSerializer
    public Tree deserializeTreeFromByteBuffer(ByteBuffer byteBuffer, Class cls, int i) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            if (!allocateDirect.isDirect()) {
                throw AnonymousClass001.A0q("Direct ByteBuffer is not supported on this platform");
            }
            allocateDirect.put(byteBuffer.duplicate());
            allocateDirect.position(0);
            byteBuffer2 = allocateDirect;
        }
        return deserializeTreeFromByteBufferNative(byteBuffer2, cls, i, 1VZ.A06, 1VZ.A07);
    }

    @Override // com.facebook.graphservice.interfaces.TreeSerializer
    public int serializeTree(Tree tree, String str) {
        Preconditions.checkArgument(tree.isValidGraphServicesJNIModelWithLogging());
        return serializeTreeNative((TreeJNI) tree, str, false, 1VZ.A00);
    }

    @Override // com.facebook.graphservice.interfaces.TreeSerializer
    public ByteBuffer serializeTreeToByteBuffer(Tree tree) {
        tree.getClass();
        Preconditions.checkArgument(tree.isValidGraphServicesJNIModelWithLogging());
        return serializeTreeToByteBufferNative((TreeJNI) tree, 1VZ.A00);
    }
}
