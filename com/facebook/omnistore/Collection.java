package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.omnistore.Omnistore;

/* loaded from: Collection.class */
public class Collection {
    public final HybridData mHybridData;

    static {
        C0il.A0B("omnistorecollections");
    }

    public Collection(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void applyStoredProcedureWithDeltas(int i, byte[] bArr, Delta[] deltaArr, String str);

    public native void deleteObject(String str);

    public native long getCollectionDeltaApplicationTimestampSeconds();

    public native long getCollectionGvid();

    public native int getIndexCollectionUniqueCount();

    public native IndexedFields getIndexedFields(String str);

    public native long getIntegrityCheckTimestampSeconds();

    public native Cursor getObject(String str);

    public native int getObjectCount();

    public native int getQueueState();

    public native int getSnapshotState();

    public native long getSnapshotTimestampSeconds();

    public native Cursor query(String str, int i, int i2);

    public native Cursor queryWithIndex(String str, String[] strArr, int i);

    public native Cursor queryWithIndexSorted(String str, String[] strArr, String str2, int i, int i2, int i3);

    public native void reindexAllObjects();

    public native void saveObject(String str, String str2, byte[] bArr);

    public native void updateIndexFields(String[] strArr, Omnistore.CollectionIndexerFunction collectionIndexerFunction);

    public native void updateIndexFieldsForObject(String str, String[] strArr, IndexedFields indexedFields);
}
