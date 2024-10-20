package X;

import android.os.SystemClock;
import com.facebook.acra.util.HttpRequest;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.base.Absent;
import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;

/* renamed from: X.404, reason: invalid class name */
/* loaded from: 404.class */
public abstract class AnonymousClass404 {
    public static AnonymousClass409 A00(CallerContext callerContext, RequestPriority requestPriority, C04033zm c04033zm, EnumC04093zx enumC04093zx, Integer num, String str, ResponseHandler responseHandler, HttpUriRequest httpUriRequest, long j) {
        C5e8 c5e8 = null;
        C5e9 c5e9 = null;
        int incrementAndGet = AnonymousClass407.A0D.incrementAndGet();
        AnonymousClass408 anonymousClass408 = new AnonymousClass408();
        11T.A0F(enumC04093zx, 0);
        C5e8 c5e82 = c04033zm.A02;
        if (c5e82 != null && (c5e82 instanceof C5e8)) {
            c5e8 = c5e82;
        }
        C5e9 c5e92 = c04033zm.A04;
        if (c5e92 != null) {
            c5e9 = c5e92;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (requestPriority != null) {
            anonymousClass408.A01 = requestPriority;
        }
        Absent absent = Absent.INSTANCE;
        11T.A0A(absent);
        return new AnonymousClass409(callerContext, anonymousClass408, c5e8, enumC04093zx, c5e9, absent, num, str, null, null, responseHandler, httpUriRequest, incrementAndGet, 0, 0, -1, uptimeMillis, j, true);
    }

    public static HttpEntity A01(final HttpEntity httpEntity) {
        Header contentType = httpEntity.getContentType();
        Preconditions.checkNotNull(contentType, "Unexpected entity with no Content-Type defined");
        return HttpRequest.POST_CONTENT_TYPE_FORM_URLENCODED.equals(contentType.getValue()) ? new AnonymousClass406(httpEntity) { // from class: X.405
            @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
            public Header getContentEncoding() {
                return new BasicHeader("Content-Encoding", "gzip");
            }

            @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
            public long getContentLength() {
                return -1;
            }

            @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
            public boolean isChunked() {
                return true;
            }

            @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
            public void writeTo(OutputStream outputStream) {
                if (outputStream == null) {
                    throw AnonymousClass001.A0L("Output stream may not be null");
                }
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.wrappedEntity.writeTo(gZIPOutputStream);
                } finally {
                    gZIPOutputStream.close();
                }
            }
        } : httpEntity;
    }

    public static void A02(HttpUriRequest httpUriRequest) {
        HttpEntity httpEntity;
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
            while (true) {
                httpEntity = entity;
                if (!(httpEntity instanceof AnonymousClass406)) {
                    break;
                } else {
                    entity = ((AnonymousClass406) httpEntity).A00();
                }
            }
            if (httpEntity instanceof AnonymousClass403) {
                ((AnonymousClass403) httpEntity).release();
            }
        }
    }
}
