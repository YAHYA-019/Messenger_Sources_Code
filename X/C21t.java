package X;

import com.facebook.tigon.TigonBodyProvider;
import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonRequestToken;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: X.21t, reason: invalid class name */
/* loaded from: 21t.class */
public interface C21t extends C21u {
    boolean isAvailable();

    TigonRequestToken sendRequest(TigonRequest tigonRequest, TigonBodyProvider tigonBodyProvider, TigonCallbacks tigonCallbacks, Executor executor);

    TigonRequestToken sendRequest(TigonRequest tigonRequest, ByteBuffer[] byteBufferArr, int i, TigonCallbacks tigonCallbacks, Executor executor);
}
