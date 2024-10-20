package com.facebook.graphservice.serialization;

import X.C0gh;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.interfaces.TreeJsonSerializer;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;

/* loaded from: TreeJsonSerializerJNI.class */
public class TreeJsonSerializerJNI implements TreeJsonSerializer {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphservice-jni-serialization");
    }

    public TreeJsonSerializerJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native TreeJNI deserializeFromJsonNative(String str, long j, Class cls, int i, String str2);

    @Override // com.facebook.graphservice.interfaces.TreeJsonSerializer
    public Tree deserializeFromJson(String str, long j, Class cls, int i, String str2) {
        return deserializeFromJsonNative(str, j, cls, i, str2);
    }
}
