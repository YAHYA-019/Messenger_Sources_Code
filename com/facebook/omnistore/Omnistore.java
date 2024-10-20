package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.omnistore.CollectionName;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: Omnistore.class */
public class Omnistore implements Closeable {
    public final HybridData mHybridData;
    public boolean mIsClosed = false;

    /* loaded from: Omnistore$CollectionIndexerFunction.class */
    public interface CollectionIndexerFunction {
        IndexedFields getIndexedFields(CollectionName collectionName, String str, String str2, ByteBuffer byteBuffer);
    }

    /* loaded from: Omnistore$DeltaClusterCallback.class */
    public interface DeltaClusterCallback {
        void onDeltaClusterEnded(int i, QueueIdentifier queueIdentifier);

        void onDeltaClusterStarted(int i, long j, QueueIdentifier queueIdentifier);
    }

    /* loaded from: Omnistore$DeltaInternalErrorCallback.class */
    public interface DeltaInternalErrorCallback {
        int onDeltaInternalError(Delta[] deltaArr, int i);
    }

    /* loaded from: Omnistore$DeltaReceivedCallback.class */
    public interface DeltaReceivedCallback {
        void onDeltaReceived(Delta[] deltaArr);
    }

    /* loaded from: Omnistore$SnapshotStateChangedCallback.class */
    public interface SnapshotStateChangedCallback {
        void onSnapshotStateChanged(CollectionName collectionName, int i);
    }

    /* loaded from: Omnistore$StoredProcedureInternalErrorCallback.class */
    public interface StoredProcedureInternalErrorCallback {
        void onStoredProcedureInternalError(int i, ByteBuffer byteBuffer);
    }

    /* loaded from: Omnistore$StoredProcedureResultCallback.class */
    public interface StoredProcedureResultCallback {
        void onStoredProcedureResult(int i, ByteBuffer byteBuffer);
    }

    /* loaded from: Omnistore$StoredProcedureResultWithMetadataCallback.class */
    public interface StoredProcedureResultWithMetadataCallback {
        void onStoredProcedureResult(int i, ByteBuffer byteBuffer, String str, StoredProcedureMetadata storedProcedureMetadata);
    }

    /* loaded from: Omnistore$StoredProcedureResultWithUniqueKeyCallback.class */
    public interface StoredProcedureResultWithUniqueKeyCallback {
        void onStoredProcedureResult(int i, ByteBuffer byteBuffer, String str);
    }

    /* loaded from: Omnistore$SubscriptionParamsErrorCallback.class */
    public interface SubscriptionParamsErrorCallback {
        void onSubscriptionParamsError(CollectionName collectionName, String str, String str2, String str3);
    }

    static {
        C0il.A0B("omnistore");
    }

    public Omnistore(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void doApplyStoredProcedure(int i, byte[] bArr, String str, String str2);

    private native boolean doCancelStoredProcedure(int i, String str);

    private native void doClose();

    private native String doGetDebugInfo();

    private native String[] doGetSubscriptionCollectionNames();

    private native SendQueueCursor doQuerySendQueue(String str);

    private native void doStart();

    private native void doUnsubscribeCollection(CollectionName collectionName);

    private native void doUnsubscribeQueue(QueueIdentifier queueIdentifier);

    private native String[] doWriteBugReport(String str);

    public native void addDeltaClusterCallback(DeltaClusterCallback deltaClusterCallback);

    public native void addDeltaReceivedCallback(DeltaReceivedCallback deltaReceivedCallback);

    public native void addSnapshotStateChangedCallback(SnapshotStateChangedCallback snapshotStateChangedCallback);

    public native void addStoredProcedureInternalErrorCallback(StoredProcedureInternalErrorCallback storedProcedureInternalErrorCallback);

    public native void addStoredProcedureResultCallback(StoredProcedureResultCallback storedProcedureResultCallback);

    public native void addStoredProcedureResultWithMetadataCallback(StoredProcedureResultWithMetadataCallback storedProcedureResultWithMetadataCallback);

    public native void addStoredProcedureResultWithUniqueKeyCallback(StoredProcedureResultWithUniqueKeyCallback storedProcedureResultWithUniqueKeyCallback);

    public native void addSubscriptionParamsErrorCallback(SubscriptionParamsErrorCallback subscriptionParamsErrorCallback);

    public void applyStoredProcedure(int i, byte[] bArr, String str, String str2) {
        synchronized (this) {
            if (!this.mIsClosed) {
                doApplyStoredProcedure(i, bArr, str, str2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.mIsClosed) {
                this.mIsClosed = true;
                doClose();
            }
        }
    }

    public native CollectionName.Builder createCollectionNameBuilder(String str);

    public native CollectionName.Builder createCollectionNameWithDomainBuilder(String str, String str2);

    public String getDebugInfo() {
        String doGetDebugInfo;
        synchronized (this) {
            doGetDebugInfo = this.mIsClosed ? "Omnistore removed" : doGetDebugInfo();
        }
        return doGetDebugInfo;
    }

    public native void setCollectionIndexerFunction(CollectionIndexerFunction collectionIndexerFunction);

    public native void setDeltaInternalErrorCallback(DeltaInternalErrorCallback deltaInternalErrorCallback);

    public void start() {
        synchronized (this) {
            if (!this.mIsClosed) {
                doStart();
            }
        }
    }

    public native void subscribeQueue(QueueIdentifier queueIdentifier, String str, long j);

    public void unsubscribeCollection(CollectionName collectionName) {
        synchronized (this) {
            if (!this.mIsClosed) {
                doUnsubscribeCollection(collectionName);
            }
        }
    }

    public String[] writeBugReport(String str) {
        String[] doWriteBugReport;
        synchronized (this) {
            doWriteBugReport = this.mIsClosed ? new String[0] : doWriteBugReport(str);
        }
        return doWriteBugReport;
    }
}
