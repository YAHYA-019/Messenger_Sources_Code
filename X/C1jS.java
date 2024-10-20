package X;

import android.content.Context;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.messaging.msys.appstatecache.AppStateTracker;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import com.facebook.tigon.TigonErrorException;
import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: X.1jS, reason: invalid class name */
/* loaded from: 1jS.class */
public final class C1jS implements CallerContextable {
    public static final String __redex_internal_original_name = "TigonNetworkSessionListenerManager";
    public int A00;
    public final int A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final 1CO A05;
    public final DataTaskListener A06;
    public final java.util.Map A07 = Collections.synchronizedMap(new HashMap());
    public final boolean A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final File A0D;

    public C1jS(Context context) {
        1CO r0 = (1CO) 1Bi.A03(16385);
        this.A05 = r0;
        this.A0D = 1M9.A00(context).AUq((2Jm) null, 1488457487);
        this.A0B = new 1BQ(17131);
        this.A04 = new 1BQ(16687);
        this.A02 = new 1BQ(66588);
        this.A0A = new 1BQ(16511);
        1BQ r02 = new 1BQ(66265);
        this.A09 = r02;
        this.A08 = 1PG.A00((1PG) r02.get()).AZk(36316619966589245L);
        this.A03 = new 1BQ(16448);
        this.A0C = new 1BQ(131109);
        this.A01 = (int) r0.Auy(36595084163156389L);
        this.A06 = new 1jU(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private 42C A00(DataTask dataTask, NetworkSession networkSession, UrlRequest urlRequest, ByteArrayOutputStream byteArrayOutputStream, String str, boolean z) {
        HttpGet httpGet;
        HttpEntity c40k;
        0fH.A0g(urlRequest.getUrl(), __redex_internal_original_name, "Start MSys liger handleDataTask, %s");
        URI create = URI.create(urlRequest.getUrl());
        String httpMethod = urlRequest.getHttpMethod();
        byte[] httpBody = urlRequest.getHttpBody();
        if (httpMethod.equals("GET")) {
            httpGet = new HttpGet(create);
        } else {
            if (!httpMethod.equals("POST")) {
                throw AnonymousClass001.A0G(0Pz.A0j("Method '", httpMethod, "' is not supported"));
            }
            HttpPost httpPost = new HttpPost(create);
            if (httpBody != null) {
                c40k = new ByteArrayEntity(httpBody);
            } else {
                String str2 = dataTask.mContentUrl;
                httpGet = httpPost;
                if (str2 != null) {
                    httpGet = httpPost;
                    if (str2.startsWith("file://")) {
                        File file = new File(str2.substring(7));
                        long length = file.length();
                        Preconditions.checkArgument(length <= 2147483647L, "file is too long");
                        c40k = new C40k(new LW7(this, networkSession, str, length / (length >= 4194304 ? 12 : length >= 2097152 ? (int) Math.min((((float) length) / 2097152.0f) * 6.0f, 12.0f) : 6), length), file, 0, (int) length, (int) 1PG.A00((1PG) this.A09.get()).Auy(36595084162959780L));
                    }
                }
            }
            httpPost.setEntity(c40k);
            httpGet = httpPost;
        }
        boolean z2 = dataTask.mTaskType == 0 && dataTask.mTaskMode == 1 && this.A05.AZk(36325218481951181L);
        3jU r323 = z2 ? new 3jU(dataTask, networkSession) : new C4Hy(dataTask, networkSession, urlRequest, byteArrayOutputStream, this.A0D, str, __redex_internal_original_name, z);
        for (Map.Entry entry : urlRequest.getHttpHeaders().entrySet()) {
            httpGet.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        String A0T = 0Pz.A0T("msysDataTask", dataTask.mTaskType);
        if (urlRequest.getUrl().contains("messaging/lightspeed/cat")) {
            A0T = 0Pz.A0W(A0T, "_CATFetch");
        }
        AnonymousClass407 A00 = AnonymousClass409.A00(A0T, r323, httpGet);
        String str3 = dataTask.mTaskCategory;
        11T.A0F(str3, 0);
        A00.A09 = str3;
        A00.A04 = CallerContext.A06(getClass());
        if (urlRequest.getUrl().equals("https://v.whatsapp.net/v2/fb_register_v2?")) {
            httpGet.addHeader(HttpRequestMultipart.CONTENT_TYPE, AnonymousClass000.A00(50));
        }
        if (this.A00 > 0 && !((1PG) this.A09.get()).A05()) {
            A00.A03 = this.A00;
        }
        int Auy = (int) this.A05.Auy(36595651119418085L);
        if (Auy > 0) {
            A00.A00 = Auy;
        }
        AnonymousClass409 A002 = A00.A00();
        if (z2) {
            this.A07.put(dataTask.mTaskIdentifier, new 3ZZ((C2tx) this.A0B.get(), A002, r323, dataTask, networkSession));
        }
        return ((C2tx) this.A0B.get()).A01(A002);
    }

    public static IOException A01(Throwable th) {
        if (th == null || !(th instanceof TigonErrorException)) {
            return new IOException(th);
        }
        int ordinal = ((TigonErrorException) th).tigonError.category.ordinal();
        return ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 1 ? new IOException(th) : new IOException("network cancel", th) : new IOException("network request not supported", th) : new IOException("network invalid request", th) : new IOException("network fatal error", th) : new IOException("network disconnected", th);
    }

    public static void A02(final C1jS c1jS, final DataTask dataTask, final NetworkSession networkSession) {
        int i;
        String str;
        C00j.A05("HTTP.executeNewTask", -1739103714);
        int i2 = dataTask.mTaskType;
        if (i2 != 0) {
            if (i2 == 1) {
                0fH.A0j(__redex_internal_original_name, "handleDownloadTaskType called.");
                final UrlRequest urlRequest = dataTask.mUrlRequest;
                try {
                    C00j.A05("HTTP.handleDownloadTaskType", -1853767703);
                    if (urlRequest != null) {
                        urlRequest.getHttpHeaders();
                        str = (String) urlRequest.getHttpHeaders().get("data_trace_id");
                    } else {
                        str = null;
                    }
                    42C A00 = c1jS.A00(dataTask, networkSession, urlRequest, null, dataTask.mTaskIdentifier, true);
                    A04(str, null, 0, 561);
                    final String str2 = str;
                    4DQ.A02(new 1K9() { // from class: X.3dw
                        public void onFailure(Throwable th) {
                            0fH.A0k(C1jS.__redex_internal_original_name, "handleDataTask failed for handleDownloadTaskType");
                            String str3 = str2;
                            if (str3 != null) {
                                C1jS.A04(str3, null, (th == null || !(th instanceof TigonErrorException)) ? 5 : ((TigonErrorException) th).tigonError.category.value, 562);
                                C1jS.A04(str3, null, 0, 85);
                            }
                            NetworkUtils.markDataTaskCompleted(dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest), C1jS.__redex_internal_original_name, null, null, C1jS.A01(th));
                        }

                        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                            0fH.A0j(C1jS.__redex_internal_original_name, "callback success for handleDownloadTaskType");
                            String str3 = str2;
                            C1jS.A04(str3, null, 0, 563);
                            C1jS.A04(str3, null, 0, 84);
                        }
                    }, A00.A02, 4DP.A00);
                } catch (IOException e) {
                    0fH.A0r(__redex_internal_original_name, "IOException while executing handleDownloadTaskType", e);
                    NetworkUtils.markDataTaskCompleted(dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest), __redex_internal_original_name, null, null, e);
                }
            } else if (i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    C00j.A01(377918804);
                    throw AnonymousClass001.A0q(0Pz.A0d("DataTask type ", " not yet supported", dataTask.mTaskType));
                }
                try {
                    1CO r0 = c1jS.A05;
                    boolean AZk = r0.AZk(36313609186515733L);
                    c1jS.A07.put(dataTask.mTaskIdentifier, new C3Za((C2tx) c1jS.A0B.get(), c1jS.A0A, new KhX(c1jS, dataTask), dataTask, networkSession, Boolean.valueOf(AZk), Boolean.valueOf(r0.AZk(36313609188481825L)), AZk ? (ExecutorService) c1jS.A0C.get() : null));
                } catch (IOException e2) {
                    0fH.A0x(__redex_internal_original_name, "Failed to create StreamingUploadDataTask", e2);
                    C00j.A01(196890266);
                    throw new RejectedExecutionException("Failed to create StreamingUploadDataTask");
                }
            }
            C00j.A01(1944010219);
        }
        0fH.A0j(__redex_internal_original_name, "handleDataTaskType called.");
        final UrlRequest urlRequest2 = dataTask.mUrlRequest;
        if (((FbNetworkManager) c1jS.A04.get()).A0M() || !((AppStateTracker) c1jS.A02.get()).A00) {
            try {
                try {
                    0fH.A0j(__redex_internal_original_name, "handleDataTaskType called.");
                    C00j.A05("HTTP.handleDataTaskType", -1983201131);
                    4DQ.A02(new 1K9() { // from class: X.4L6
                        public void onFailure(Throwable th) {
                            0fH.A0k(C1jS.__redex_internal_original_name, "handleDataTask failed for handleDataTaskType");
                            C1jS c1jS2 = C1jS.this;
                            DataTask dataTask2 = dataTask;
                            C1jS.A03(c1jS2, dataTask2, networkSession, NetworkUtils.newErrorURLResponse(urlRequest2), C1jS.A01(th));
                            c1jS2.A07.remove(dataTask2.mTaskIdentifier);
                        }

                        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                            0fH.A0j(C1jS.__redex_internal_original_name, "callback success for handleDataTaskType");
                            C1jS.this.A07.remove(dataTask.mTaskIdentifier);
                        }
                    }, c1jS.A00(dataTask, networkSession, urlRequest2, new ByteArrayOutputStream(), dataTask.mTaskIdentifier, false).A02, 4DP.A00);
                    i = -520495040;
                } catch (IOException e3) {
                    0fH.A0r(__redex_internal_original_name, "IOException while executing handleDataTaskType", e3);
                    A03(c1jS, dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest2), e3);
                    i = -234384905;
                }
                C00j.A01(i);
            } catch (Throwable th) {
                C00j.A01(-863662783);
                throw th;
            }
        } else {
            0fH.A0k(__redex_internal_original_name, "skip handleDataTaskType when network disconnected");
            A03(c1jS, dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest2), new 3DS());
        }
        C00j.A01(1944010219);
    }

    public static void A03(C1jS c1jS, DataTask dataTask, NetworkSession networkSession, UrlResponse urlResponse, IOException iOException) {
        if (dataTask.mTaskType != 0 || dataTask.mTaskMode != 1 || !c1jS.A05.AZk(36325218481951181L)) {
            NetworkUtils.markDataTaskCompleted(dataTask, networkSession, urlResponse, __redex_internal_original_name, null, null, iOException);
            return;
        }
        NetworkUtils networkUtils = NetworkUtils.$redex_init_class;
        0fH.A0h(dataTask.mTaskIdentifier, __redex_internal_original_name, "markDataTaskStreamingCompleted, id=%s");
        Execution.executeAsync(new 38X(dataTask, networkSession, urlResponse, iOException), null, 3);
    }

    public static void A04(String str, List list, int i, int i2) {
        if (str != null) {
            TraceLogger.log(null, 0, null, i2, str, null, i, list);
        }
    }

    public static void A05(HttpResponse httpResponse) {
        StatusLine statusLine = httpResponse.getStatusLine();
        C0k4.A00(statusLine);
        int statusCode = statusLine.getStatusCode();
        if (statusCode >= 400 && statusCode <= 500) {
            throw AnonymousClass001.A0G(String.format(null, "errorReason: %s, [HTTP status=%d] Error Content = ", AnonymousClass001.A1b(statusLine.getReasonPhrase(), statusCode)));
        }
    }
}
