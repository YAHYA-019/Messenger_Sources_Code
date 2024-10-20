package com.facebook.graphservice.tree;

import X.0Pz;
import X.C0gh;
import X.C2x5;
import com.facebook.graphservice.interfaces.PaginableList;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.jni.HybridClassBase;
import com.google.common.base.Preconditions;

/* loaded from: TreeBuilderJNI.class */
public class TreeBuilderJNI extends HybridClassBase implements C2x5 {
    public final int mTypeTag;

    static {
        C0gh.A02("graphservice-jni-tree");
    }

    public TreeBuilderJNI(int i) {
        this.mTypeTag = i;
    }

    private native TreeJNI getResultJNI(Class cls, int i);

    private native TreeJNI[] getTreeJNIListByAddingTreeToList(TreeJNI treeJNI, Class cls, int i, Iterable iterable);

    private native TreeBuilderJNI setTreeBuilderJNI(String str, String str2, String str3, TreeBuilderJNI treeBuilderJNI);

    private native TreeBuilderJNI setTreeBuilderJNIList(String str, String str2, String str3, Iterable iterable);

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.C2x5
    /* renamed from: setTreeJNI, reason: merged with bridge method [inline-methods] */
    public native TreeBuilderJNI setTree(String str, TreeJNI treeJNI);

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.C2x5
    /* renamed from: setTreeJNIExcludingParams, reason: merged with bridge method [inline-methods] */
    public native TreeBuilderJNI setTreeFaster_UNSAFE(String str, TreeJNI treeJNI);

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.C2x5
    /* renamed from: setTreeJNIList, reason: merged with bridge method [inline-methods] */
    public native TreeBuilderJNI setTreeList(String str, Iterable iterable);

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.C2x5
    /* renamed from: setTreeJNIListExcludingParams, reason: merged with bridge method [inline-methods] */
    public native TreeBuilderJNI setTreeListFaster_UNSAFE(String str, Iterable iterable);

    @Override // X.C2x5
    public Tree getResult(Class cls, int i) {
        TreeJNI resultJNI = getResultJNI(cls, i);
        boolean z = false;
        if (resultJNI.getTypeTag() == i) {
            z = true;
        }
        Preconditions.checkState(z);
        return resultJNI;
    }

    public final native boolean hasPrimaryKey();

    @Override // X.C2x5
    public final native TreeBuilderJNI setBoolean(String str, Boolean bool);

    public final native TreeBuilderJNI setBooleanList(String str, Iterable iterable);

    @Override // X.C2x5
    public final native TreeBuilderJNI setDouble(String str, Double d);

    public final native TreeBuilderJNI setDoubleList(String str, Iterable iterable);

    @Override // X.C2x5
    public final native TreeBuilderJNI setInt(String str, Integer num);

    @Override // X.C2x5
    public final native TreeBuilderJNI setIntList(String str, Iterable iterable);

    public final native TreeBuilderJNI setNull(String str);

    public final TreeBuilderJNI setPaginableTreeList(String str, PaginableList paginableList) {
        String A0W = 0Pz.A0W("archived_montage_messages_pagination", "_has_previous_page");
        return setBoolean(A0W, Boolean.valueOf(paginableList.mHasPreviousPage)).setBoolean(0Pz.A0W("archived_montage_messages_pagination", "_has_next_page"), Boolean.valueOf(paginableList.mHasNextPage)).setTreeList("archived_montage_messages_pagination", paginableList.mTrees);
    }

    @Override // X.C2x5
    public final native TreeBuilderJNI setString(String str, String str2);

    @Override // X.C2x5
    public final native TreeBuilderJNI setStringList(String str, Iterable iterable);

    @Override // X.C2x5
    public final native TreeBuilderJNI setTime(String str, Long l);

    public final native TreeBuilderJNI setTimeList(String str, Iterable iterable);

    @Override // X.C2x5
    public final TreeBuilderJNI setTree(String str, Tree tree) {
        return setTree(str, (TreeJNI) tree);
    }

    public final TreeBuilderJNI setTreeBuilder(String str, String str2, String str3, C2x5 c2x5) {
        return setTreeBuilderJNI("saved_audio_metadata", "saved_audio_metadata", "saved_audio_metadata", (TreeBuilderJNI) c2x5);
    }

    @Override // X.C2x5
    public final TreeBuilderJNI setTreeList(String str, Iterable iterable) {
        return setTreeList(str, iterable);
    }
}
