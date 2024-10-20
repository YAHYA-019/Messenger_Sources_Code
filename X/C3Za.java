package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.tigon.TigonBodyStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3Za, reason: invalid class name */
/* loaded from: 3Za.class */
public final class C3Za implements C3lv, CallerContextable {
    public static final String __redex_internal_original_name = "StreamingUploadDataTask";
    public long A00;
    public AnonymousClass409 A01;
    public TigonBodyStream A02;
    public long A03;
    public final C2tx A04;
    public final KhX A05;
    public final DataTask A06;
    public final NetworkSession A07;
    public final UrlRequest A08;
    public final Long A09;
    public final C00i A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final ExecutorService A0D;
    public volatile 3Dp A0E;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r307.booleanValue() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3Za(X.C2tx r302, X.C00i r303, X.KhX r304, com.facebook.msys.mci.DataTask r305, com.facebook.msys.mci.NetworkSession r306, java.lang.Boolean r307, java.lang.Boolean r308, java.util.concurrent.ExecutorService r309) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Za.<init>(X.2tx, X.00i, X.KhX, com.facebook.msys.mci.DataTask, com.facebook.msys.mci.NetworkSession, java.lang.Boolean, java.lang.Boolean, java.util.concurrent.ExecutorService):void");
    }

    public static ArrayList A00(UrlRequest urlRequest) {
        if (urlRequest == null) {
            return null;
        }
        try {
            urlRequest.getHttpHeaders();
            if (urlRequest.getHttpHeaders().get("trace_media_type") == null) {
                return null;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(1BK.A0n(AnonymousClass001.A0b("trace_media_type", urlRequest.getHttpHeaders())));
            return A0s;
        } catch (NumberFormatException e) {
            0fH.A0s(__redex_internal_original_name, "StreamingUploadDataTask failed to parse media type http header", e);
            return null;
        }
    }

    public static void A01(C3Za c3Za) {
        if (c3Za.A0E != 3Dp.A04) {
            1BK.A09(c3Za.A0A).D0v(__redex_internal_original_name, String.format("canHandleStreamingUploadUpdateCallback() on illegal state : %s, bytesSoFar = %d, totalExpectedBytes = %d", c3Za.A0E, Long.valueOf(c3Za.A03), c3Za.A09));
        }
    }

    public static void A02(C3Za c3Za, byte[] bArr, int i) {
        String str;
        if (c3Za.A02 != null) {
            DataTask dataTask = c3Za.A06;
            UrlRequest urlRequest = dataTask.mUrlRequest;
            if (urlRequest != null) {
                urlRequest.getHttpHeaders();
                str = AnonymousClass001.A0b("data_trace_id", urlRequest.getHttpHeaders());
            } else {
                str = null;
            }
            ArrayList A00 = A00(dataTask.mUrlRequest);
            C00j.A05("StreamUploadDataTask.transferBytes", -736914843);
            C1jS.A04(str, A00, 0, 1152);
            c3Za.A02.transferBytes(bArr, i);
            c3Za.A00 += i;
            C1jS.A04(str, A00, 0, 1153);
            C00j.A01(321363604);
            Execution.executeAsync(new 38N(c3Za, i), null, 3);
            boolean booleanValue = c3Za.A0B.booleanValue();
            if ((booleanValue ? c3Za.A00 : c3Za.A03) < c3Za.A09.longValue()) {
                if (booleanValue) {
                    return;
                }
                Execution.executeAsync(new 38K(c3Za), null, 3);
            } else {
                C00j.A05("StreamUploadDataTask.writeEOM", -137416690);
                c3Za.A02.writeEOM();
                C1jS.A04(str, A00(dataTask.mUrlRequest), 0, 1154);
                C00j.A01(-1657835797);
            }
        }
    }

    @Override // X.C3lv
    public void AEL() {
        this.A0E = 3Dp.A01;
        TigonBodyStream tigonBodyStream = this.A02;
        tigonBodyStream.getClass();
        tigonBodyStream.writeEOM();
        C2tx c2tx = this.A04;
        AnonymousClass409 anonymousClass409 = this.A01;
        anonymousClass409.getClass();
        c2tx.A03(anonymousClass409);
        NetworkUtils.markDataTaskCompleted(this.A06, this.A07, NetworkUtils.newErrorURLResponse(this.A08), __redex_internal_original_name, null, null, AnonymousClass001.A0G("Task cancelled."));
    }

    @Override // X.C3lv
    public void BMn(final byte[] bArr) {
        ExecutorService executorService;
        if (this.A02 == null) {
            throw AnonymousClass001.A0G("TigonBodyStream has not been properly initialized.");
        }
        final int length = bArr.length;
        this.A03 += length;
        if (!this.A0C.booleanValue() || (executorService = this.A0D) == null) {
            A02(this, bArr, length);
        } else {
            executorService.execute(new Runnable() { // from class: X.3hl
                public static final String __redex_internal_original_name = "StreamingUploadDataTask$1";

                @Override // java.lang.Runnable
                public void run() {
                    C3Za.A02(C3Za.this, bArr, length);
                }
            });
        }
        if (!this.A0B.booleanValue() || this.A03 >= this.A09.longValue()) {
            return;
        }
        Execution.executeAsync(new 38K(this), null, 3);
    }
}
