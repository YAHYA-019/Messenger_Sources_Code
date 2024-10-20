package X;

import java.net.URI;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.impl.client.RequestWrapper;

/* renamed from: X.4jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jx.class */
public final class C07454jx extends RequestWrapper implements AbortableHttpRequest {
    public RequestLine A00;
    public final AbortableHttpRequest A01;

    public C07454jx(AbortableHttpRequest abortableHttpRequest, HttpUriRequest httpUriRequest) {
        super(httpUriRequest);
        abortableHttpRequest.getClass();
        this.A01 = abortableHttpRequest;
    }

    @Override // org.apache.http.impl.client.RequestWrapper, org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        RequestLine requestLine = this.A00;
        if (requestLine == null) {
            requestLine = super.getRequestLine();
            this.A00 = requestLine;
        }
        return requestLine;
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    public void setConnectionRequest(ClientConnectionRequest clientConnectionRequest) {
        this.A01.setConnectionRequest(clientConnectionRequest);
    }

    @Override // org.apache.http.impl.client.RequestWrapper
    public void setMethod(String str) {
        this.A00 = null;
        super.setMethod(str);
    }

    @Override // org.apache.http.impl.client.RequestWrapper
    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.A00 = null;
        super.setProtocolVersion(protocolVersion);
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    public void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger) {
        this.A01.setReleaseTrigger(connectionReleaseTrigger);
    }

    @Override // org.apache.http.impl.client.RequestWrapper
    public void setURI(URI uri) {
        this.A00 = null;
        super.setURI(uri);
    }
}
