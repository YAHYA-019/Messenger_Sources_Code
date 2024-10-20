package X;

import android.util.LruCache;
import com.google.repack.protobuf.MessageLite;
import com.meta.wearable.comms.calling.hera.engine.base.EngineState;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: Lgd.class */
public abstract class Lgd implements MessageLite {
    public int memoizedHashCode = 0;

    public static int A0D(MLr mLr, Object obj) {
        KJb kJb = (Lgd) obj;
        KJb kJb2 = kJb;
        int i = kJb2.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int BA4 = mLr.BA4(kJb);
        kJb2.memoizedSerializedSize = BA4;
        return BA4;
    }

    public static KJb A0E(LruCache lruCache, KJb kJb, com.meta.wearable.comms.calling.hera.engine.base.Any any, Object obj) {
        KJb CWi = ((MGg) kJb.dynamicMethod(KMJ.A04, (Object) null, (Object) null)).CWi(any.value_);
        lruCache.put(obj, CWi);
        11T.A0D(CWi);
        return CWi;
    }

    public static Iterator A0F(EngineState engineState, Object obj) {
        11T.A0F(obj, 2);
        MRR mrr = engineState.moduleStates_;
        11T.A0A(mrr);
        return mrr.iterator();
    }

    @Override // com.google.repack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            KEF kef = new KEF(bArr, serializedSize);
            writeTo((KEH) kef);
            if (kef.A01 - kef.A00 == 0) {
                return bArr;
            }
            throw AnonymousClass001.A0N("Did not write as much data as expected.");
        } catch (IOException e) {
            throw 1BK.A0s(0Pz.A0z("Serializing ", AnonymousClass001.A0Y(this), " to a ", "byte array", " threw an IOException (should never happen)."), e);
        }
    }

    @Override // com.google.repack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        KEG keg = new KEG(outputStream, serializedSize);
        writeTo((KEH) keg);
        if (keg.A00 > 0) {
            KEG.A00(keg);
        }
    }
}
