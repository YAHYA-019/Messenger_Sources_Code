package X;

import com.facebook.http.internal.tigonengine.FlowObserverRequestInfo;
import com.facebook.http.internal.tigonengine.TigonHttpClientAdapterImpl;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import com.facebook.tigon.TigonRequestToken;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* renamed from: X.40w, reason: invalid class name */
/* loaded from: 40w.class */
public final class C40w {
    public C40x A04;
    public TigonRequestToken A05;
    public C42g A06;
    public Object A07;
    public Throwable A08;
    public final int A09;
    public final SettableFuture A0A;
    public final String A0B;
    public final FlowObserverRequestInfo A0C;
    public final C21u A0D;
    public final ResponseHandler A0E;
    public int A02 = 0;
    public byte A00 = 0;
    public byte A01 = 10;
    public int A03 = 0;

    public C40w(FlowObserverRequestInfo flowObserverRequestInfo, C21u c21u, SettableFuture settableFuture, String str, ResponseHandler responseHandler, int i) {
        this.A0B = str;
        this.A09 = i;
        this.A0E = responseHandler;
        this.A0C = flowObserverRequestInfo;
        this.A0A = settableFuture;
        this.A0D = c21u;
        this.A04 = new C40x(c21u, i);
    }

    public static void A00(TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl, C40w c40w, Object obj, int i) {
        SettableFuture settableFuture = c40w.A0A;
        settableFuture.set(obj);
        if (i == c40w.A03) {
            c40w.A0C.onEOM(c40w.A06);
        }
        Preconditions.checkState(settableFuture.isDone());
        tigonHttpClientAdapterImpl.cleanup(c40w.A09);
    }

    public static void A01(TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl, C40w c40w, Throwable th, int i) {
        boolean z = false;
        if ((th instanceof TigonErrorException) && ((TigonErrorException) th).tigonError.category == TigonErrorCode.CANCEL) {
            z = true;
        }
        SettableFuture settableFuture = c40w.A0A;
        if (z) {
            settableFuture.cancel(false);
        } else {
            settableFuture.setException(th);
        }
        if (i == c40w.A03) {
            c40w.A0C.onError(c40w.A06, th instanceof IOException ? (IOException) th : new IOException(th));
        }
        Preconditions.checkState(settableFuture.isDone());
        tigonHttpClientAdapterImpl.cleanup(c40w.A09);
    }

    public Object A02(HttpResponse httpResponse) {
        boolean z;
        synchronized (this) {
            z = true;
            if (this.A00 != 1) {
                z = false;
            }
        }
        Preconditions.checkState(z);
        return this.A0E.handleResponse(httpResponse);
    }

    public HttpResponse A03(C42M c42m) {
        HttpResponse A01;
        synchronized (this) {
            A01 = C42N.A01(c42m);
            FlowObserverRequestInfo flowObserverRequestInfo = this.A0C;
            flowObserverRequestInfo.onResponse(A01);
            InputStream interceptResponseStream = flowObserverRequestInfo.interceptResponseStream(this.A04);
            if (interceptResponseStream != null) {
                A01.setEntity(C42N.A00(c42m, interceptResponseStream));
            }
        }
        return A01;
    }

    public void A04(TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl, Exception exc, int i) {
        synchronized (this) {
            if (i == this.A03) {
                this.A00 = (byte) 3;
                byte b = this.A01;
                if (b == 11 || b == 12) {
                    A01(tigonHttpClientAdapterImpl, this, exc, i);
                } else {
                    this.A07 = null;
                    this.A08 = exc;
                }
            }
        }
    }

    public void A05(TigonError tigonError, C42g c42g) {
        synchronized (this) {
            this.A0C.onWillRetry(tigonError, c42g, this.A03);
            this.A00 = (byte) 0;
            this.A01 = (byte) 10;
            this.A07 = null;
            this.A08 = null;
            this.A03++;
            this.A04.A03();
            this.A04 = new C40x(this.A0D, this.A09);
        }
    }

    public void A06(TigonRequest tigonRequest) {
        synchronized (this) {
            this.A0C.onStarted(tigonRequest);
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TigonRequestState{mHandlerState=");
        A0k.append((int) this.A00);
        A0k.append(", mRequestState=");
        A0k.append((int) this.A01);
        A0k.append(", mReportedCount=");
        A0k.append(this.A02);
        A0k.append(", mTicket=");
        A0k.append(this.A03);
        A0k.append(", mName='");
        String str = this.A0B;
        A0k.append(str);
        A0k.append('\'');
        A0k.append(", mSequence=");
        A0k.append(this.A09);
        A0k.append(", mResponseHandler=");
        A0k.append(this.A0E);
        A0k.append(", mFuture=");
        A0k.append(this.A0A);
        A0k.append(", mResult=");
        A0k.append(this.A07);
        A0k.append(", mException=");
        A0k.append(this.A08);
        A0k.append(", mTerminalSummary=");
        A0k.append(this.A06);
        A0k.append(", mBodyBuffer=");
        A0k.append(this.A04);
        A0k.append(", requestToken=");
        A0k.append(this.A05);
        A0k.append(", name='");
        A0k.append(str);
        return AnonymousClass001.A0f(A0k);
    }
}
