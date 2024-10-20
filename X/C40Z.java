package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolException;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;

/* renamed from: X.40Z, reason: invalid class name */
/* loaded from: 40Z.class */
public final class C40Z {
    public final ImmutableList A00;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Comparator] */
    public C40Z() {
        Set A06 = 1Bi.A06(173);
        Set A0I = 1Bn.A0I(172);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(A06);
        arrayList.addAll(A0I);
        Collections.sort(arrayList, new Object());
        this.A00 = ImmutableList.copyOf((Collection) arrayList);
    }

    public RequestWrapper A00(AnonymousClass409 anonymousClass409) {
        RequestWrapper requestWrapper;
        HttpUriRequest A02 = anonymousClass409.A02();
        try {
            if (A02 instanceof HttpEntityEnclosingRequest) {
                if (A02 instanceof AbortableHttpRequest) {
                    new C40h((HttpEntityEnclosingRequest) A02, (AbortableHttpRequest) A02);
                } else {
                    new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) A02);
                }
            } else if (A02 instanceof AbortableHttpRequest) {
                new C07454jx((AbortableHttpRequest) A02, A02);
            } else {
                new RequestWrapper(A02);
            }
            requestWrapper.resetHeaders();
            1Du it = this.A00.iterator();
            while (it.hasNext()) {
                ((C40b) it.next()).CZ9(anonymousClass409, requestWrapper);
            }
            return requestWrapper;
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        }
    }
}
