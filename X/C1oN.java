package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.omnistore.CollectionName;
import com.facebook.omnistore.Delta;
import com.facebook.omnistore.IndexedFields;
import com.facebook.omnistore.Omnistore;
import com.facebook.omnistore.QueueIdentifier;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1oN, reason: invalid class name */
/* loaded from: 1oN.class */
public final class C1oN implements Omnistore.CollectionIndexerFunction, Omnistore.DeltaClusterCallback, Omnistore.DeltaReceivedCallback, Omnistore.SnapshotStateChangedCallback {
    public final C01s A00 = (C01s) 1Bi.A03(16511);
    public final HashMap A01 = new HashMap();
    public final HashMap A02 = new HashMap();

    private ArrayList A00(QueueIdentifier queueIdentifier) {
        ArrayList A0s = AnonymousClass001.A0s();
        synchronized (this) {
            Iterator A0x = AnonymousClass001.A0x(this.A01);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                if (((CollectionName) A0z.getKey()).getQueueIdentifier().equals(queueIdentifier)) {
                    A0s.add((3qK) A0z.getValue());
                }
            }
        }
        return A0s;
    }

    @Override // com.facebook.omnistore.Omnistore.CollectionIndexerFunction
    public IndexedFields getIndexedFields(CollectionName collectionName, String str, String str2, ByteBuffer byteBuffer) {
        3qK r0;
        try {
            synchronized (this) {
                r0 = (3qK) this.A01.get(collectionName);
            }
            return r0 == null ? new IndexedFields() : r0.BOY(str, str2, byteBuffer);
        } catch (Throwable th) {
            this.A00.softReport(0Pz.A0W("Exception thrown while indexing omnistore object for collection ", collectionName.getLabel()), th);
            return new IndexedFields();
        }
    }

    @Override // com.facebook.omnistore.Omnistore.DeltaClusterCallback
    public void onDeltaClusterEnded(int i, QueueIdentifier queueIdentifier) {
        0fH.A0V(Integer.valueOf(i), C1oN.class, "End of cluster of deltas, type %d, queueId %s", queueIdentifier.toString());
        Iterator it = A00(queueIdentifier).iterator();
        while (it.hasNext()) {
            ((3qK) it.next()).onDeltaClusterEnded(i, queueIdentifier);
        }
    }

    @Override // com.facebook.omnistore.Omnistore.DeltaClusterCallback
    public void onDeltaClusterStarted(int i, long j, QueueIdentifier queueIdentifier) {
        0fH.A04(C1oN.class, Integer.valueOf(i), Long.valueOf(j), queueIdentifier.toString(), "Beginnig of cluster of deltas, type %d, numDeltas %d, queueId %s");
        Iterator it = A00(queueIdentifier).iterator();
        while (it.hasNext()) {
            ((3qK) it.next()).onDeltaClusterStarted(i, j, queueIdentifier);
        }
    }

    @Override // com.facebook.omnistore.Omnistore.DeltaReceivedCallback
    public void onDeltaReceived(Delta[] deltaArr) {
        3qK r0;
        ReqContext reqContext;
        int length = deltaArr.length;
        0fH.A07(C1oN.class, Integer.valueOf(length), "Handling %d deltas");
        HashMap A0u = AnonymousClass001.A0u();
        for (Delta delta : deltaArr) {
            int status = delta.getStatus();
            if (status == 1 || status == 4) {
                CollectionName collectionName = delta.getCollectionName();
                AbstractCollection abstractCollection = (AbstractCollection) A0u.get(collectionName);
                if (abstractCollection == null) {
                    abstractCollection = AnonymousClass001.A0t(length);
                    A0u.put(collectionName, abstractCollection);
                }
                abstractCollection.add(delta);
            }
        }
        Iterator A0x = AnonymousClass001.A0x(A0u);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            synchronized (this) {
                r0 = (3qK) this.A01.get(A0z.getKey());
            }
            synchronized (this) {
                reqContext = (ReqContext) this.A02.get(A0z.getKey());
            }
            if (r0 != null) {
                if (reqContext != null) {
                    ReqContext A02 = AnonymousClass018.A02(reqContext, "CollectionCallbackRegistration", ReqContextTypeResolver.resolveName("omnistore"));
                    try {
                        r0.BtA((List) A0z.getValue());
                        if (A02 != null) {
                            A02.close();
                        }
                    } catch (Throwable th) {
                        if (A02 != null) {
                            try {
                                A02.close();
                                throw th;
                            } catch (Throwable th2) {
                                7kF.A00(th, th2);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } else {
                    r0.BtA((List) A0z.getValue());
                }
            }
        }
    }

    @Override // com.facebook.omnistore.Omnistore.SnapshotStateChangedCallback
    public void onSnapshotStateChanged(CollectionName collectionName, int i) {
        3qK r0;
        ReqContext reqContext;
        synchronized (this) {
            r0 = (3qK) this.A01.get(collectionName);
        }
        synchronized (this) {
            reqContext = (ReqContext) this.A02.get(collectionName);
        }
        if (r0 != null) {
            if (reqContext == null) {
                r0.CLx(i);
                return;
            }
            ReqContext A02 = AnonymousClass018.A02(reqContext, "CollectionCallbackRegistration", ReqContextTypeResolver.resolveName("omnistore"));
            try {
                r0.CLx(i);
                if (A02 != null) {
                    A02.close();
                }
            } catch (Throwable th) {
                if (A02 != null) {
                    try {
                        A02.close();
                        throw th;
                    } catch (Throwable th2) {
                        7kF.A00(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }
}
