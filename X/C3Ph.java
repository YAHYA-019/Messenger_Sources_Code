package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.traffic.rsys.MC;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.TreeSet;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: X.3Ph, reason: invalid class name */
/* loaded from: 3Ph.class */
public abstract class C3Ph {
    public static final TreeSet A00;
    public static final TreeSet A01;

    static {
        Integer[] numArr = new Integer[64];
        System.arraycopy(new Integer[]{1, 7, 9, 11, 13, 15, 17, 19, 20, 21, 22, 23, 25, 37, 42, 43, 53, 77, 79, 87, 95, Integer.valueOf(ActionId.ON_VIEW_CREATED_END), Integer.valueOf(ActionId.DATA_LOAD_START), Integer.valueOf(ActionId.LEGACY_MARKER), Integer.valueOf(ActionId.ACTION_BAR_COMPLETE), Integer.valueOf(ActionId.RTMP_CONNECTION_REQUESTED), Integer.valueOf(ActionId.RTMP_CONNECTION_RELEASE)}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{Integer.valueOf(ActionId.NEW_START_FOUND), Integer.valueOf(ActionId.TIMEOUT), Integer.valueOf(ActionId.RTMP_STREAM_PREPARED), Integer.valueOf(ActionId.RTMP_CONNECTION_CONNECTED), Integer.valueOf(ActionId.RTMP_CONNECTION_INTERCEPTED), Integer.valueOf(ActionId.VIEW_WILL_APPEAR_BEGIN), Integer.valueOf(ActionId.MQTT_CONNECTING), Integer.valueOf(ActionId.APP_FIRST_VIEW_CONTROLLER), Integer.valueOf(ActionId.ACTIVITY_RESUME), 179, 389, 465, 512, 513, 514, 515, 526, 530, 531, 532, 540, 556, 563, 587, 601, 636, 993}, 0, numArr, 27, 27);
        System.arraycopy(new Integer[]{995, Integer.valueOf(MC.rp_ctm_network_throttling.__CONFIG__), 3659, 4045, 6000, 6665, 6666, 6667, 6668, 6669}, 0, numArr, 54, 10);
        A01 = new TreeSet(C0s8.A14(numArr));
        A00 = new TreeSet(C0s8.A14("accept-charset", "accept-encoding", "access-control-request-headers", "access-control-request-method", "connection", "content-length", "cookie", "cookie2", "date", "dnt", "expect", ConstantsKt.DEVICE_ID_HOST, "keep-alive", "origin", "referer", "te", "trailer", "transfer-encoding", "upgrade", "via"));
    }

    public static final AnonymousClass409 A00(String str, String str2, String str3, ResponseHandler responseHandler, String[] strArr, String[] strArr2, boolean z) {
        HttpRequestBase httpRequestBase;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        11T.A0A(upperCase);
        URI create = URI.create(str);
        if (!"https".equals(create.getScheme())) {
            throw AnonymousClass001.A0L("Protocol not supported");
        }
        if (!(!1BL.A1Z(A01, create.getPort()))) {
            throw AnonymousClass001.A0L("Port not supported");
        }
        if (upperCase.equals("GET")) {
            httpRequestBase = new HttpGet(create);
        } else {
            if (!upperCase.equals("POST")) {
                throw 1BL.A0f("Method '", str2, "' is not supported");
            }
            HttpPost httpPost = new HttpPost(create);
            httpRequestBase = httpPost;
            if (str3 != null) {
                httpRequestBase = httpPost;
                if (str3.length() != 0) {
                    Charset forName = Charset.forName("UTF-8");
                    11T.A0A(forName);
                    byte[] bytes = str3.getBytes(forName);
                    11T.A0A(bytes);
                    httpPost.setEntity(new ByteArrayEntity(bytes));
                    httpRequestBase = httpPost;
                }
            }
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (!(!A00.contains(strArr[i]))) {
                throw 1BL.A0f("Header '", strArr[i], "' is not supported");
            }
            httpRequestBase.setHeader(strArr[i], strArr2[i]);
        }
        HttpClientParams.setRedirecting(httpRequestBase.getParams(), z);
        AnonymousClass407 A002 = C4En.A00("EFFECT_REQUEST", responseHandler, httpRequestBase);
        A002.A04 = CallerContext.A06(C3Vf.class);
        return A002.A00();
    }
}
