package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Fbp.class */
public final class Fbp implements GEJ {
    public final /* synthetic */ XplatModelMetadataCompletionCallback A02;
    public final AtomicBoolean A01 = 7zO.A15();
    public final List A00 = Collections.synchronizedList(AnonymousClass001.A0s());

    public Fbp(XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback) {
        this.A02 = xplatModelMetadataCompletionCallback;
    }

    public void Bpw(Exception exc, List list, java.util.Map map) {
        List list2;
        if (exc != null) {
            if (this.A01.compareAndSet(false, true)) {
                String message = exc.getMessage();
                if (message != null) {
                    this.A02.onFailure(message);
                    return;
                } else {
                    this.A02.onFailure("ModelMetadata fetch failed");
                    return;
                }
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it.next();
            if (map != null && (list2 = (List) map.get(aRModelMetadataRequest.mCapability)) != null) {
                List list3 = this.A00;
                int i = aRModelMetadataRequest.mRequestId;
                VersionedCapability versionedCapability = aRModelMetadataRequest.mCapability;
                11T.A0A(versionedCapability);
                list3.add(new XplatModelMetadataResponse(i, versionedCapability, aRModelMetadataRequest.mPreferredVersion, list2));
            }
        }
        if (this.A01.compareAndSet(false, true)) {
            XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback = this.A02;
            List list4 = this.A00;
            11T.A09(list4);
            xplatModelMetadataCompletionCallback.onSuccess(list4);
        }
    }
}
