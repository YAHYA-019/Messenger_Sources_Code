package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.base.Optional;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: X.409, reason: invalid class name */
/* loaded from: 409.class */
public final class AnonymousClass409 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final CallerContext A06;
    public final AnonymousClass408 A07;
    public final C5e8 A08;
    public final EnumC04093zx A09;
    public final C5e9 A0A;
    public final Optional A0B;
    public final Integer A0C;
    public final String A0D;
    public final java.util.Map A0E;
    public final java.util.Map A0F;
    public final ResponseHandler A0G;
    public final HttpUriRequest A0H;
    public final boolean A0I;

    public /* synthetic */ AnonymousClass409(CallerContext callerContext, AnonymousClass408 anonymousClass408, C5e8 c5e8, EnumC04093zx enumC04093zx, C5e9 c5e9, Optional optional, Integer num, String str, java.util.Map map, java.util.Map map2, ResponseHandler responseHandler, HttpUriRequest httpUriRequest, int i, int i2, int i3, int i4, long j, long j2, boolean z) {
        this.A0H = httpUriRequest;
        this.A0D = str;
        this.A06 = callerContext;
        this.A0G = responseHandler;
        this.A07 = anonymousClass408;
        this.A0C = num;
        this.A03 = i;
        this.A04 = j;
        this.A0B = optional;
        this.A08 = c5e8;
        this.A05 = j2;
        this.A0F = map;
        this.A0E = map2;
        this.A09 = enumC04093zx;
        this.A0A = c5e9;
        this.A0I = z;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    public static final AnonymousClass407 A00(String str, ResponseHandler responseHandler, HttpUriRequest httpUriRequest) {
        return C4En.A00(str, responseHandler, httpUriRequest);
    }

    public final ResponseHandler A01() {
        return this.A0G;
    }

    public final HttpUriRequest A02() {
        return this.A0H;
    }

    public String toString() {
        String substring;
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A03);
        A0k.append(" [");
        RequestPriority requestPriority = this.A07.A01;
        11T.A0A(requestPriority);
        if (requestPriority.ordinal() == 4) {
            substring = "?";
        } else {
            substring = requestPriority.name().substring(0, 1);
            11T.A0A(substring);
        }
        A0k.append(substring);
        A0k.append("] ");
        A0k.append(this.A0D);
        A0k.append("__");
        CallerContext callerContext = this.A06;
        if (callerContext != null) {
            str = callerContext.A03;
            11T.A0A(str);
            if (0CU.A0T(str, ".", false)) {
                str = str.substring(0CU.A01(str, '.', str.length() - 1) + 1);
                11T.A0A(str);
            }
            if (0CU.A0T(str, "$", false)) {
                11T.A0F(str, 0);
                str = str.substring(0, 0CU.A01(str, '$', str.length() - 1));
                11T.A0A(str);
            }
        } else {
            str = "Unknown";
        }
        String A0d = AnonymousClass001.A0d(str, A0k);
        11T.A0A(A0d);
        return A0d;
    }
}
