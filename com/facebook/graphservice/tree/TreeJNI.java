package com.facebook.graphservice.tree;

import X.0Pz;
import X.0fH;
import X.1VZ;
import X.C0gh;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.PaginableList;
import com.facebook.graphservice.interfaces.PaginationMetadata;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.jni.HybridClassBase;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: TreeJNI.class */
public class TreeJNI extends HybridClassBase implements Tree {
    public static final Class TAG = TreeJNI.class;
    public final int[] mSetFields;
    public final int mTypeTag;

    static {
        C0gh.A02("graphservice-jni-tree");
    }

    public TreeJNI(int i, int[] iArr) {
        this.mTypeTag = i;
        this.mSetFields = iArr;
        if (iArr != null) {
            Arrays.sort(iArr);
        }
    }

    public static final TreeJNI[] filterNullArrayEntries(TreeJNI[] treeJNIArr) {
        if (treeJNIArr == null) {
            treeJNIArr = null;
        } else {
            int length = treeJNIArr.length;
            int i = 0;
            for (TreeJNI treeJNI : treeJNIArr) {
                if (treeJNI == null) {
                    i++;
                }
            }
            if (i != 0) {
                TreeJNI[] treeJNIArr2 = new TreeJNI[length - i];
                int i2 = 0;
                for (TreeJNI treeJNI2 : treeJNIArr) {
                    if (treeJNI2 != null) {
                        treeJNIArr2[i2] = treeJNI2;
                        i2++;
                    }
                }
                return treeJNIArr2;
            }
        }
        return treeJNIArr;
    }

    public static native TreeJNI fromPando(GraphServiceAsset graphServiceAsset, com.facebook.pando.TreeJNI treeJNI, Class cls, long j, int i, String str);

    private native ImmutableList getBooleanListNative(int i);

    private native boolean getBooleanValueNative(int i);

    private native ImmutableList getDoubleListNative(int i);

    private native double getDoubleValueNative(int i);

    private native ImmutableList getIntListNative(int i);

    private native int getIntValueNative(int i);

    private native ByteBuffer getStringAsNonOwningBufferNative(int i);

    private native ImmutableList getStringListNative(int i);

    private native String getStringNative(int i);

    private native String getStringNative(String str);

    private native ImmutableList getTimeListNative(int i);

    private native long getTimeValueNative(int i);

    private TreeJNI[] getTreeArray(int i, Class cls, int i2) {
        if (isFieldUnset(i) || !isValidGraphServicesJNIModel()) {
            return null;
        }
        return filterNullArrayEntries(getTreeArrayNative(i, cls, i2));
    }

    private TreeJNI[] getTreeArray(String str, Class cls, int i) {
        if (isFieldUnset(str.hashCode()) || !isValidGraphServicesJNIModel()) {
            return null;
        }
        return filterNullArrayEntries(getTreeArrayNative(str, cls, i));
    }

    private native TreeJNI[] getTreeArrayNative(int i, Class cls, int i2);

    private native TreeJNI[] getTreeArrayNative(String str, Class cls, int i);

    private native TreeJNI getTreeNative(int i, Class cls, int i2);

    private native TreeJNI getTreeNative(String str, Class cls, int i);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (java.util.Arrays.binarySearch(r0, r302) >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isFieldUnset(int r302) {
        /*
            r301 = this;
            r0 = r301
            int[] r0 = r0.mSetFields
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L16
            r0 = r303
            r1 = r302
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 < 0) goto L1b
        L16:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphservice.tree.TreeJNI.isFieldUnset(int):boolean");
    }

    private native int rootNodeHashCode();

    public boolean equals(Object obj) {
        if (1VZ.A04) {
            boolean z = true;
            if (this != obj) {
                if (!(obj instanceof TreeJNI)) {
                    z = false;
                } else if (isDeepEqualBestGuess((TreeJNI) obj) == Tree.DeepEqualGuess.TRUE) {
                    return true;
                }
            }
            return z;
        }
        return super.equals(obj);
    }

    public final native boolean fulfillsType(String str);

    public final native ImmutableList getAliases();

    public final ImmutableList getBooleanList(int i) {
        return isFieldUnset(i) ? ImmutableList.of() : getBooleanListNative(i);
    }

    public final boolean getBooleanValue(int i) {
        if (isFieldUnset(i)) {
            return false;
        }
        return getBooleanValueNative(i);
    }

    public native Boolean getBooleanVariable(String str);

    public final native ImmutableList getCanonicals();

    public final ImmutableList getDoubleList(int i) {
        return isFieldUnset(i) ? ImmutableList.of() : getDoubleListNative(i);
    }

    public final double getDoubleValue(int i) {
        if (isFieldUnset(i)) {
            return 0.0d;
        }
        return getDoubleValueNative(i);
    }

    public final native Tree.FieldType getFieldType(String str);

    public final ImmutableList getIntList(int i) {
        return isFieldUnset(i) ? ImmutableList.of() : getIntListNative(i);
    }

    public final int getIntValue(int i) {
        if (isFieldUnset(i)) {
            return 0;
        }
        return getIntValueNative(i);
    }

    public final PaginableList getPaginableTreeList(String str, Class cls, int i) {
        PaginationMetadata paginationMetadata = getPaginationMetadata(str, cls, i);
        TreeJNI[] pandoPaginableTreeArray = isPandoBacked() ? getPandoPaginableTreeArray(str, cls, i) : getTreeArray(str, cls, i);
        String str2 = paginationMetadata.paginationKey;
        if (str2.isEmpty()) {
            str2 = null;
        }
        PaginableList paginableList = new PaginableList(str2, pandoPaginableTreeArray == null ? ImmutableList.of() : ImmutableList.copyOf(pandoPaginableTreeArray), paginationMetadata.hasPreviousPage, paginationMetadata.hasNextPage, paginationMetadata.isLoadingPrevious, paginationMetadata.isLoadingNext, paginationMetadata.failedLastLoadPrevious, paginationMetadata.failedLastLoadNext, paginationMetadata.nextPageUUID, paginationMetadata.previousPageUUID, paginationMetadata.endCursor);
        paginableList.mIsPandoBacked = paginationMetadata.isPandoBacked;
        return paginableList;
    }

    public final native PaginationMetadata getPaginationMetadata(String str, Class cls, int i);

    public final TreeJNI[] getPandoPaginableTreeArray(String str, Class cls, int i) {
        return filterNullArrayEntries(getPandoPaginableTreeArrayNative(str, cls, i));
    }

    public final native TreeJNI[] getPandoPaginableTreeArrayNative(String str, Class cls, int i);

    @Override // com.facebook.graphservice.interfaces.Tree
    public final String getString(int i) {
        if (isFieldUnset(i)) {
            return null;
        }
        return getStringNative(i);
    }

    public final ByteBuffer getStringAsNonOwningBuffer(int i) {
        if (isFieldUnset(i)) {
            return null;
        }
        return getStringAsNonOwningBufferNative(i);
    }

    @Override // com.facebook.graphservice.interfaces.Tree
    public final ImmutableList getStringList(int i) {
        return isFieldUnset(i) ? ImmutableList.of() : getStringListNative(i);
    }

    public final ImmutableList getTimeList(int i) {
        return isFieldUnset(i) ? ImmutableList.of() : getTimeListNative(i);
    }

    public final long getTimeValue(int i) {
        if (isFieldUnset(i)) {
            return 0L;
        }
        return getTimeValueNative(i);
    }

    @Override // com.facebook.graphservice.interfaces.Tree
    public /* bridge */ /* synthetic */ Tree getTree(String str) {
        return getTree(str, TreeJNI.class, 0);
    }

    public final TreeJNI getTree(int i, Class cls, int i2) {
        if (isFieldUnset(i)) {
            return null;
        }
        return getTreeNative(i, cls, i2);
    }

    public final TreeJNI getTree(String str, Class cls, int i) {
        if (isFieldUnset(str.hashCode())) {
            return null;
        }
        return getTreeNative(str, cls, i);
    }

    public final ImmutableList getTreeList(int i, Class cls, int i2) {
        TreeJNI[] treeArray = getTreeArray(i, cls, i2);
        return treeArray != null ? ImmutableList.copyOf(treeArray) : ImmutableList.of();
    }

    public final ImmutableList getTreeList(String str, Class cls, int i) {
        TreeJNI[] treeArray = getTreeArray(str, cls, i);
        return treeArray != null ? ImmutableList.copyOf(treeArray) : ImmutableList.of();
    }

    @Override // com.facebook.graphservice.interfaces.Tree
    public native String getTypeName();

    @Override // com.facebook.graphservice.interfaces.Tree
    public final int getTypeTag() {
        return this.mTypeTag;
    }

    public final native boolean hasFieldValue(int i);

    public final native boolean hasFieldValue(String str);

    public final native boolean hasPrimaryKey();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r302 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int hashCode() {
        /*
            r301 = this;
            boolean r0 = X.1VZ.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L11
            r0 = r301
            int r0 = r0.rootNodeHashCode()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L16
        L11:
            r0 = r301
            int r0 = super.hashCode()
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphservice.tree.TreeJNI.hashCode():int");
    }

    public native boolean isDeepEqual(TreeJNI treeJNI);

    public native Tree.DeepEqualGuess isDeepEqualBestGuess(TreeJNI treeJNI);

    @Override // com.facebook.graphservice.interfaces.Tree
    public final native boolean isPandoBacked();

    @Override // com.facebook.graphservice.interfaces.Tree
    public final boolean isValidGraphServicesJNIModel() {
        return isValid();
    }

    @Override // com.facebook.graphservice.interfaces.Tree
    public final boolean isValidGraphServicesJNIModelWithLogging() {
        boolean isValidGraphServicesJNIModel = isValidGraphServicesJNIModel();
        if (!isValidGraphServicesJNIModel) {
            0fH.A0o("InvalidGraphServicesJNIModel", 0Pz.A0T("Invalid GraphServices JNI model with type tag: ", getTypeTag()));
        }
        return isValidGraphServicesJNIModel;
    }

    public final native void logToFlipper(String str);

    public final native TreeJNI reinterpret(Class cls, int i);

    @Override // com.facebook.graphservice.interfaces.Tree
    public native String toExpensiveHumanReadableDebugString();

    public native String toString();
}
