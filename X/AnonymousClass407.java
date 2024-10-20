package X;

import android.os.SystemClock;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.base.Absent;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: X.407, reason: invalid class name */
/* loaded from: 407.class */
public final class AnonymousClass407 {
    public static final AtomicInteger A0D = new AtomicInteger(0);
    public int A00;
    public long A02;
    public long A03;
    public CallerContext A04;
    public RequestPriority A06;
    public final String A0A;
    public final ResponseHandler A0B;
    public final HttpUriRequest A0C;
    public int A01 = A0D.incrementAndGet();
    public String A09 = "";
    public AnonymousClass408 A05 = new AnonymousClass408();
    public Integer A08 = 0S2.A00;
    public EnumC04093zx A07 = EnumC04093zx.A0B;

    public AnonymousClass407(String str, ResponseHandler responseHandler, HttpUriRequest httpUriRequest) {
        this.A0C = httpUriRequest;
        this.A0A = str;
        this.A0B = responseHandler;
    }

    public final AnonymousClass409 A00() {
        if (this.A02 == 0) {
            this.A02 = SystemClock.uptimeMillis();
        }
        RequestPriority requestPriority = this.A06;
        if (requestPriority != null) {
            this.A05.A01 = requestPriority;
        }
        HttpUriRequest httpUriRequest = this.A0C;
        String str = this.A0A;
        CallerContext callerContext = this.A04;
        ResponseHandler responseHandler = this.A0B;
        AnonymousClass408 anonymousClass408 = this.A05;
        Integer num = this.A08;
        int i = this.A01;
        long j = this.A02;
        Absent absent = Absent.INSTANCE;
        11T.A0A(absent);
        return new AnonymousClass409(callerContext, anonymousClass408, null, this.A07, null, absent, num, str, null, null, responseHandler, httpUriRequest, i, 0, this.A00, -1, j, this.A03, true);
    }
}
