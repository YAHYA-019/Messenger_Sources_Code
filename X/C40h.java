package X;

import java.net.URI;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;

/* renamed from: X.40h, reason: invalid class name */
/* loaded from: 40h.class */
public final class C40h extends EntityEnclosingRequestWrapper implements AbortableHttpRequest {
    public RequestLine A00;
    public final AbortableHttpRequest A01;

    public C40h(HttpEntityEnclosingRequest httpEntityEnclosingRequest, AbortableHttpRequest abortableHttpRequest) {
        super(httpEntityEnclosingRequest);
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
