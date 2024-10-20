package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import com.google.common.collect.ImmutableMap;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: X.Jnn, reason: case insensitive filesystem */
/* loaded from: Jnn.class */
public final class C3251Jnn extends KTX {
    public static final C1AJ A0Q = new Object();
    public boolean A08;
    public KeQ A0A;
    public boolean A0B;
    public final Intent A0C;
    public final JgX A0D;
    public final JgX A0E;
    public final LDF A0F;
    public final ML7 A0H;
    public final boolean A0I;
    public final Context A0J;
    public final C3241Jnc A0K;
    public final Kjp A0L;
    public final Kk6 A0M;
    public final MNp A0N;
    public final boolean A0P;
    public long A09 = -1;
    public int A00 = 0;
    public int A02 = 0;
    public int A01 = 0;
    public boolean A06 = true;
    public SslError A03 = null;
    public boolean A07 = false;
    public String A04 = null;
    public final java.util.Map A0O = AnonymousClass001.A0u();
    public final LAK A0G = new LAK();
    public List A05 = LC8.A00().A03(MNs.class);

    public C3251Jnn(Context context, Intent intent, JgX jgX, C3241Jnc c3241Jnc, Kjp kjp, LDF ldf, Kk6 kk6, MNp mNp, ML7 ml7, boolean z) {
        KeP keP;
        this.A0M = kk6;
        this.A0F = ldf;
        this.A0N = mNp;
        this.A0K = c3241Jnc;
        this.A0D = jgX;
        this.A0E = jgX;
        this.A0L = kjp;
        this.A0J = context;
        this.A0C = intent;
        this.A0P = z;
        this.A0H = ml7;
        this.A0I = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IAB_NEW_URL_CHECK_ENABLED_FOR_SSL_ERROR", false);
        Intent intent2 = this.A0C;
        Bundle bundleExtra = intent2.getBundleExtra("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER");
        if (bundleExtra != null) {
            bundleExtra.getInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_HASHES");
            bundleExtra.getInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_BITS");
            keP = new KeP(bundleExtra.getByteArray("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_BITS"));
        } else {
            keP = null;
        }
        if (intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID", false)) {
            intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT", false);
        }
        this.A0A = new KeQ(keP);
    }

    public static WebResourceResponse A00(Uri uri, C3251Jnn c3251Jnn, String str) {
        int i;
        String str2;
        String str3;
        if (!"properties".equals(uri.getScheme())) {
            return null;
        }
        if ("browser".equals(uri.getHost()) && "/clickID".equals(uri.getPath())) {
            Kh8 A09 = c3251Jnn.A09(str);
            str3 = A09.A00;
            if (str3 != null) {
                i = 200;
                str2 = "OK";
            } else {
                str3 = A09.A01;
                if (str3 == null) {
                    str3 = "";
                }
                i = 404;
                str2 = "Not Found";
            }
        } else {
            i = 400;
            str2 = "Bad Request";
            str3 = "";
        }
        return A02(str2, str3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168 A[LOOP:0: B:30:0x015a->B:32:0x0168, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.webkit.WebResourceResponse A01(X.C3251Jnn r301, X.AbstractC3252Jnp r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3251Jnn.A01(X.Jnn, X.Jnp, java.lang.String):android.webkit.WebResourceResponse");
    }

    public static WebResourceResponse A02(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "";
        }
        Charset charset = StandardCharsets.UTF_8;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str2.getBytes(charset));
        WebResourceResponse webResourceResponse = new WebResourceResponse(AbstractC00603o4.A00(310), charset.name().toLowerCase(Locale.US), byteArrayInputStream);
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put("Access-Control-Allow-Origin", "*");
        A0c.put("Access-Control-Allow-Headers", "*");
        webResourceResponse.setResponseHeaders(AbG.A10(A0c, "Access-Control-Allow-Methods", "GET, OPTIONS"));
        webResourceResponse.setStatusCodeAndReasonPhrase(i, str);
        return webResourceResponse;
    }

    private String A03(Uri uri) {
        String queryParameter;
        if (uri == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("fbclid");
        return (queryParameter2 != null || (queryParameter = uri.getQueryParameter("u")) == null) ? queryParameter2 : A03(C0A2.A00(A0Q, queryParameter));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022b, code lost:
    
        if (r0.getHost() == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024c, code lost:
    
        if (r0.getHost().toLowerCase().endsWith(".facebook.com") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026a, code lost:
    
        r328 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026f, code lost:
    
        if ("m.me".equals(r0.getQueryParameter("handler")) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0277, code lost:
    
        if (r0 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0283, code lost:
    
        if (r0.getHost() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a4, code lost:
    
        r329 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a9, code lost:
    
        if (X.LDu.A09(r0.getHost().toLowerCase(java.util.Locale.ENGLISH), "m.me") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02c0, code lost:
    
        if (r0.getHost() == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c3, code lost:
    
        r0 = r0.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ca, code lost:
    
        r0 = java.util.Locale.ENGLISH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ef, code lost:
    
        if (X.LDu.A09(r0.toLowerCase(r0), X.AbstractC00603o4.A00(234)) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02fb, code lost:
    
        if (r0.getEncodedPath() == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x031c, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0321, code lost:
    
        if (r0.getEncodedPath().toLowerCase(r0).startsWith("/t/") != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x032c, code lost:
    
        if (r328 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0331, code lost:
    
        if (r329 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0336, code lost:
    
        if (r313 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0339, code lost:
    
        r0 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0340, code lost:
    
        r0 = r0.A0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0347, code lost:
    
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0350, code lost:
    
        if (r0 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0364, code lost:
    
        if (r0.BMB(r0, r0, r306) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x036a, code lost:
    
        r327 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x037a, code lost:
    
        X.0fH.A0w("BrowserLiteCallbacker", "Error in handleMDotMeUriRedirectSync", r327);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0324, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ac, code lost:
    
        r329 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b4, code lost:
    
        if (r0 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0272, code lost:
    
        r328 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03fd, code lost:
    
        if (r0.BMh(r0, r317) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x046f, code lost:
    
        if (r0.BMP(r306) != false) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r317 = r302.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        r0 = r301.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0681, code lost:
    
        if (r0.equals(r0.getScheme()) != false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        r322 = r0.BdW(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r322 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        r306 = r322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        r0 = r301.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x085b, code lost:
    
        if (X.JgX.A0R(r302, r306) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x08b0, code lost:
    
        r0 = r302.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x08c9, code lost:
    
        if (r0.historyEntryList.size() == 0) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x08d5, code lost:
    
        r0 = r0.A00(r0.currentIndex);
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x08de, code lost:
    
        if (r0 == null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x08f8, code lost:
    
        if (X.LDu.A03(X.C0A2.A03(r0.A03)) == false) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0900, code lost:
    
        r0.A0f(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        if (r0.A0t != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x087a, code lost:
    
        if (X.JgX.A0R(r302, r306) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x00f0, code lost:
    
        r320 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0100, code lost:
    
        X.0fH.A0w("BrowserLiteCallbacker", "Error in maybeOverrideUrl", r320);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        X.C0A2.A03(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0106, code lost:
    
        r322 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0162, code lost:
    
        r0 = X.DaZ.A01(r306, r0.getStringExtra("BrowserLiteIntent.EXTRA_ALLEYOOP_CAMPAIGN_GROUP_IDS"), r0.getStringExtra("BrowserLiteIntent.EXTRA_ALLEYOOP_AD_ACCOUNT_IDS"), r0.getStringExtra("BrowserLiteIntent.EXTRA_ALLEYOOP_PACKAGE_NAME"), r0.getBooleanExtra("BrowserLiteIntent.EXTRA_IAB_PLAY_STORE_ALLEYOOP_ENABLED", false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016e, code lost:
    
        r0 = X.LBw.A00.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
    
        if (r0.hasNext() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018e, code lost:
    
        r0 = (X.MJW) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019a, code lost:
    
        r0 = r0.AJA(r306, (java.lang.String) null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b9, code lost:
    
        if (r0.D5J(r301.A0J, r0) != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d3, code lost:
    
        if (r0.getStringArrayList("package_names") == X.DaZ.A00) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01da, code lost:
    
        X.JQy.A1H(r0, r306, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ef, code lost:
    
        r0.A0H.A01.setValue(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ff, code lost:
    
        if (X.JgX.A0R(r302, r306) == false) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0202, code lost:
    
        X.JgX.A0F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020a, code lost:
    
        r0 = X.LDu.A00(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0213, code lost:
    
        if (r317 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0216, code lost:
    
        r0 = X.C0A2.A03(r317);
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a5 A[Catch: all -> 0x0928, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0928, blocks: (B:3:0x001f, B:5:0x0030, B:7:0x0037, B:11:0x004b, B:14:0x0057, B:16:0x0066, B:18:0x006c, B:20:0x0075, B:21:0x007e, B:24:0x0094, B:25:0x009d, B:27:0x00af, B:33:0x00c0, B:34:0x00c6, B:35:0x00cd, B:40:0x00db, B:44:0x0108, B:45:0x010f, B:48:0x011b, B:51:0x012a, B:53:0x0137, B:55:0x0145, B:57:0x0153, B:59:0x0162, B:60:0x0169, B:61:0x016e, B:62:0x0177, B:65:0x0185, B:66:0x018e, B:68:0x019a, B:69:0x01a3, B:71:0x01ae, B:76:0x01c3, B:77:0x01ca, B:81:0x01da, B:83:0x01e1, B:84:0x01e6, B:86:0x01ef, B:88:0x01f6, B:91:0x0202, B:94:0x020a, B:97:0x0216, B:98:0x021d, B:101:0x022e, B:102:0x0235, B:104:0x0243, B:108:0x025a, B:110:0x0263, B:115:0x027a, B:118:0x0286, B:119:0x028d, B:121:0x0294, B:123:0x029d, B:126:0x02b7, B:129:0x02c3, B:130:0x02ca, B:132:0x02d1, B:134:0x02dd, B:136:0x02e6, B:139:0x02f2, B:142:0x02fe, B:144:0x0307, B:146:0x0315, B:155:0x0339, B:156:0x0340, B:157:0x0347, B:162:0x0359, B:168:0x037a, B:173:0x037f, B:176:0x0386, B:180:0x0394, B:183:0x03a0, B:184:0x03a7, B:187:0x03b5, B:189:0x03c1, B:190:0x03c8, B:191:0x03cf, B:194:0x03db, B:195:0x03e2, B:200:0x03f2, B:206:0x0413, B:208:0x041a, B:209:0x041f, B:212:0x042b, B:214:0x0439, B:217:0x0447, B:221:0x08a3, B:222:0x08a8, B:225:0x0882, B:229:0x089c, B:230:0x0456, B:235:0x0464, B:241:0x0485, B:244:0x048f, B:246:0x049a, B:249:0x04a5, B:251:0x04ac, B:254:0x04b8, B:256:0x04c6, B:260:0x04d9, B:264:0x04e7, B:265:0x04ee, B:268:0x04fa, B:269:0x0501, B:273:0x050f, B:275:0x0516, B:280:0x0529, B:282:0x0532, B:283:0x0539, B:286:0x0545, B:288:0x0553, B:291:0x055f, B:295:0x0572, B:299:0x0580, B:300:0x0587, B:303:0x0593, B:304:0x059a, B:308:0x05a8, B:310:0x05af, B:313:0x05bb, B:315:0x05c2, B:317:0x05d0, B:320:0x05dc, B:321:0x05e3, B:325:0x05f1, B:327:0x05f8, B:331:0x0609, B:333:0x0615, B:336:0x0621, B:338:0x062a, B:341:0x0639, B:342:0x0640, B:346:0x064e, B:349:0x065a, B:351:0x0663, B:354:0x066f, B:356:0x0678, B:360:0x0689, B:362:0x0697, B:363:0x069f, B:365:0x06a8, B:368:0x06b4, B:370:0x06bd, B:371:0x06c4, B:372:0x06cb, B:375:0x06d7, B:377:0x06e0, B:380:0x06ec, B:381:0x06f3, B:384:0x0701, B:388:0x0716, B:391:0x0721, B:394:0x072d, B:397:0x073c, B:398:0x0743, B:400:0x074c, B:406:0x075f, B:409:0x076b, B:410:0x0770, B:413:0x078f, B:415:0x079a, B:417:0x07a1, B:418:0x07a6, B:419:0x07ad, B:421:0x07b6, B:424:0x07c2, B:426:0x07cd, B:428:0x07d4, B:430:0x07db, B:431:0x07e2, B:434:0x07f0, B:435:0x07f9, B:437:0x080e, B:444:0x081d, B:446:0x0827, B:450:0x083d, B:454:0x084a, B:455:0x0852, B:458:0x08b0, B:459:0x08b7, B:460:0x08be, B:463:0x08cc, B:465:0x08d5, B:468:0x08e1, B:469:0x08e8, B:470:0x08ef, B:474:0x0900, B:476:0x0863, B:480:0x0871, B:483:0x0909, B:485:0x0915, B:489:0x0100), top: B:2:0x001f, inners: #0, #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0909 A[Catch: all -> 0x0928, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0928, blocks: (B:3:0x001f, B:5:0x0030, B:7:0x0037, B:11:0x004b, B:14:0x0057, B:16:0x0066, B:18:0x006c, B:20:0x0075, B:21:0x007e, B:24:0x0094, B:25:0x009d, B:27:0x00af, B:33:0x00c0, B:34:0x00c6, B:35:0x00cd, B:40:0x00db, B:44:0x0108, B:45:0x010f, B:48:0x011b, B:51:0x012a, B:53:0x0137, B:55:0x0145, B:57:0x0153, B:59:0x0162, B:60:0x0169, B:61:0x016e, B:62:0x0177, B:65:0x0185, B:66:0x018e, B:68:0x019a, B:69:0x01a3, B:71:0x01ae, B:76:0x01c3, B:77:0x01ca, B:81:0x01da, B:83:0x01e1, B:84:0x01e6, B:86:0x01ef, B:88:0x01f6, B:91:0x0202, B:94:0x020a, B:97:0x0216, B:98:0x021d, B:101:0x022e, B:102:0x0235, B:104:0x0243, B:108:0x025a, B:110:0x0263, B:115:0x027a, B:118:0x0286, B:119:0x028d, B:121:0x0294, B:123:0x029d, B:126:0x02b7, B:129:0x02c3, B:130:0x02ca, B:132:0x02d1, B:134:0x02dd, B:136:0x02e6, B:139:0x02f2, B:142:0x02fe, B:144:0x0307, B:146:0x0315, B:155:0x0339, B:156:0x0340, B:157:0x0347, B:162:0x0359, B:168:0x037a, B:173:0x037f, B:176:0x0386, B:180:0x0394, B:183:0x03a0, B:184:0x03a7, B:187:0x03b5, B:189:0x03c1, B:190:0x03c8, B:191:0x03cf, B:194:0x03db, B:195:0x03e2, B:200:0x03f2, B:206:0x0413, B:208:0x041a, B:209:0x041f, B:212:0x042b, B:214:0x0439, B:217:0x0447, B:221:0x08a3, B:222:0x08a8, B:225:0x0882, B:229:0x089c, B:230:0x0456, B:235:0x0464, B:241:0x0485, B:244:0x048f, B:246:0x049a, B:249:0x04a5, B:251:0x04ac, B:254:0x04b8, B:256:0x04c6, B:260:0x04d9, B:264:0x04e7, B:265:0x04ee, B:268:0x04fa, B:269:0x0501, B:273:0x050f, B:275:0x0516, B:280:0x0529, B:282:0x0532, B:283:0x0539, B:286:0x0545, B:288:0x0553, B:291:0x055f, B:295:0x0572, B:299:0x0580, B:300:0x0587, B:303:0x0593, B:304:0x059a, B:308:0x05a8, B:310:0x05af, B:313:0x05bb, B:315:0x05c2, B:317:0x05d0, B:320:0x05dc, B:321:0x05e3, B:325:0x05f1, B:327:0x05f8, B:331:0x0609, B:333:0x0615, B:336:0x0621, B:338:0x062a, B:341:0x0639, B:342:0x0640, B:346:0x064e, B:349:0x065a, B:351:0x0663, B:354:0x066f, B:356:0x0678, B:360:0x0689, B:362:0x0697, B:363:0x069f, B:365:0x06a8, B:368:0x06b4, B:370:0x06bd, B:371:0x06c4, B:372:0x06cb, B:375:0x06d7, B:377:0x06e0, B:380:0x06ec, B:381:0x06f3, B:384:0x0701, B:388:0x0716, B:391:0x0721, B:394:0x072d, B:397:0x073c, B:398:0x0743, B:400:0x074c, B:406:0x075f, B:409:0x076b, B:410:0x0770, B:413:0x078f, B:415:0x079a, B:417:0x07a1, B:418:0x07a6, B:419:0x07ad, B:421:0x07b6, B:424:0x07c2, B:426:0x07cd, B:428:0x07d4, B:430:0x07db, B:431:0x07e2, B:434:0x07f0, B:435:0x07f9, B:437:0x080e, B:444:0x081d, B:446:0x0827, B:450:0x083d, B:454:0x084a, B:455:0x0852, B:458:0x08b0, B:459:0x08b7, B:460:0x08be, B:463:0x08cc, B:465:0x08d5, B:468:0x08e1, B:469:0x08e8, B:470:0x08ef, B:474:0x0900, B:476:0x0863, B:480:0x0871, B:483:0x0909, B:485:0x0915, B:489:0x0100), top: B:2:0x001f, inners: #0, #1, #3, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(X.C3251Jnn r301, X.AbstractC3252Jnp r302, java.lang.Boolean r303, java.lang.Boolean r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 2387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3251Jnn.A04(X.Jnn, X.Jnp, java.lang.Boolean, java.lang.Boolean, java.lang.String):boolean");
    }

    public void A06(Bitmap bitmap, AbstractC3252Jnp abstractC3252Jnp, String str) {
        InputStreamReader A0g;
        String A00;
        MNp mNp;
        IABEvent iABEvent;
        this.A0G.A03("BLWVC.onPageStarted");
        LCd.A03("BrowserLiteFragment", "onPageStarted %s", new Object[]{str});
        this.A07 = false;
        this.A04 = str;
        if (this.A09 == -1) {
            this.A09 = System.currentTimeMillis();
        }
        if (!"file:///android_asset/".equals(str)) {
            LDF ldf = this.A0F;
            LDF.A02(new JmR(this.A0C.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING"), ldf, abstractC3252Jnp.A08(), str), ldf);
        }
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((MNs) it.next()).CAh(str);
        }
        abstractC3252Jnp.A0W = false;
        abstractC3252Jnp.A0U = false;
        abstractC3252Jnp.A0X = true;
        KlP klP = abstractC3252Jnp.A0C;
        if (klP != null) {
            if (LDu.A04(Uri.parse(str)) && str.contains("/dialog/oauth")) {
                L11 l11 = klP.A04.A0c;
                if (l11.A0g) {
                    l11.A0Q = true;
                }
            }
            JgX jgX = klP.A04;
            if (jgX.A0s && !jgX.A0z) {
                String str2 = abstractC3252Jnp.A0N;
                if (str2 == null) {
                    str2 = AbstractC3252Jnp.A02(abstractC3252Jnp, 0);
                    abstractC3252Jnp.A0N = str2;
                }
                if (!str.equals(str2)) {
                    jgX.A0z = true;
                    L11 l112 = jgX.A0c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (l112.A0g) {
                        l112.A0H = currentTimeMillis;
                        Parcelable.Creator creator = IABEvent.CREATOR;
                        iABEvent = new IABLandingPageViewEndedEvent(l112.A0P, l112.A0U, currentTimeMillis, L11.A00(l112));
                    } else {
                        iABEvent = IABEvent.A04;
                    }
                    JQx.A1E(jgX, iABEvent);
                }
            }
            L4Z l4z = jgX.A0N;
            if (l4z.A02()) {
                AbstractC3252Jnp abstractC3252Jnp2 = klP.A05;
                03Y A002 = Kvd.A00(l4z);
                if (AnonymousClass001.A1V(A002.first)) {
                    LCd.A03("BwPCookieWorks", 0Pz.A0j("For url ", (String) A002.second, ", setting local storage"), new Object[0]);
                    ValueCallback<String> valueCallback = LL4.A00;
                    JvO jvO = ((SystemWebView) abstractC3252Jnp2).A03;
                    jvO.evaluateJavascript("window.localStorage.setItem('session-aa-os-name', 'Android');", valueCallback);
                    jvO.evaluateJavascript(0Pz.A0d("window.localStorage.setItem('session-aa-os-version', '", "');", Build.VERSION.SDK_INT), LL5.A00);
                }
            }
            L36 l36 = jgX.A0M;
            if (l36.A01()) {
                AbstractC3252Jnp abstractC3252Jnp3 = klP.A05;
                Pair A003 = Kvc.A00(l36);
                if (AnonymousClass001.A1V(A003.first)) {
                    LCd.A03("BwICookieWorks", "For url %s, setting local storage", new Object[]{A003.second});
                    ValueCallback<String> valueCallback2 = LL2.A00;
                    JvO jvO2 = ((SystemWebView) abstractC3252Jnp3).A03;
                    jvO2.evaluateJavascript("window.localStorage.setItem('session-aa-os-name', 'Android');", valueCallback2);
                    jvO2.evaluateJavascript(0Pz.A0d("window.localStorage.setItem('session-aa-os-version', '", "');", Build.VERSION.SDK_INT), LL3.A00);
                }
            }
            C3241Jnc c3241Jnc = jgX.A0I;
            if (c3241Jnc != null && (mNp = c3241Jnc.A06) != null) {
                mNp.CAi(str);
            }
        }
        Kk8 kk8 = abstractC3252Jnp.A0I;
        if (!kk8.A03) {
            return;
        }
        AbstractC3252Jnp abstractC3252Jnp4 = kk8.A01;
        Context context = kk8.A00;
        11T.A0F(context, 1);
        WeakReference weakReference = KSA.A00;
        try {
            if (weakReference != null) {
                A00 = (String) weakReference.get();
                if (A00 == null) {
                    KSA.A00 = null;
                }
                abstractC3252Jnp4.A0I(A00);
                return;
            }
            A00 = C03t.A00(A0g);
            A0g.close();
            if (A00.length() < 2048) {
                KSA.A00 = 7zL.A14(A00);
            }
            abstractC3252Jnp4.A0I(A00);
            return;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass127.A00(A0g, th);
                throw th2;
            }
        }
        A0g = JQy.A0g(context.getResources(), 2131886137);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0332, code lost:
    
        if (r309 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0361, code lost:
    
        if (r309.equals(r0) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0353, code lost:
    
        if ("about:blank".equals(r309) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(android.net.http.SslError r302, X.AbstractC3252Jnp r303, X.RDl r304) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3251Jnn.A07(android.net.http.SslError, X.Jnp, X.RDl):void");
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, X.KSp] */
    public void A08(WebResourceError webResourceError, WebResourceRequest webResourceRequest, AbstractC3252Jnp abstractC3252Jnp) {
        JgX jgX;
        AbstractC3252Jnp A0U;
        int errorCode = webResourceError.getErrorCode();
        String charSequence = webResourceError.getDescription().toString();
        String obj = webResourceRequest.getUrl().toString();
        boolean isForMainFrame = webResourceRequest.isForMainFrame();
        LCd.A03("BrowserLiteFragment", "onReceivedError %d, %s, %s", new Object[]{Integer.valueOf(errorCode), charSequence, obj});
        this.A0G.A03("BLWVC.onReceivedError");
        if (-10 == errorCode && !TextUtils.isEmpty(obj) && obj.equals(this.A0E.A0j) && !LDu.A03(C0A2.A01(A0Q, obj)) && this.A0D.A0g(obj)) {
            ((SystemWebView) abstractC3252Jnp).A03.stopLoading();
            Runnable lpE = new LpE(this, abstractC3252Jnp, obj);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                lpE.run();
            } else {
                KxI.A00.postDelayed(lpE, 1000L);
            }
        }
        if (obj.equals(this.A0E.A0j) && (((A0U = (jgX = this.A0D).A0U()) == null || !A0U.A0J()) && jgX.A01 == 0)) {
            jgX.A01 = errorCode;
            L11 l11 = jgX.A0c;
            if (l11.A0g) {
                l11.A02 = errorCode;
            }
        }
        if (isForMainFrame) {
            this.A07 = true;
            JgX jgX2 = this.A0D;
            if (jgX2.A07 != null && JgX.A06(jgX2, (RDl) null) != null && jgX2.A0F == null) {
                ?? obj2 = new Object();
                ((KSp) obj2).A01 = 0;
                ((KSp) obj2).A00 = 0;
                ((KSp) obj2).A02 = new Handler();
                ((KSp) obj2).A03 = new Lmz(obj2, abstractC3252Jnp);
                jgX2.A0F = obj2;
            }
        }
        super.A08(webResourceError, webResourceRequest, abstractC3252Jnp);
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.KSd, java.lang.Object] */
    public Kh8 A09(String str) {
        String str2;
        String[] stringArrayExtra;
        int length;
        String str3;
        Intent intent = this.A0C;
        if (!intent.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID", false)) {
            str3 = "Handling is disabled";
        } else {
            if (!intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT", false)) {
                java.util.Map map = this.A0O;
                KSd kSd = (KSd) map.get(str);
                if (kSd != null) {
                    String str4 = kSd.A01;
                    if (!TextUtils.isEmpty(str4)) {
                        return new Kh8(str4, null);
                    }
                }
                if (this.A0B) {
                    str2 = null;
                } else {
                    if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_GET_CLICKID_FROM_IAB_ADS_CONTEXT", false)) {
                        IabCommonTrait iabCommonTrait = (IabCommonTrait) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("EXTRA_IAB_CONTEXT", IabCommonTrait.class) : intent.getParcelableExtra("EXTRA_IAB_CONTEXT"));
                        if (iabCommonTrait != null) {
                            List Ach = iabCommonTrait.Ach();
                            if (!Ach.isEmpty()) {
                                str2 = 1BK.A14(Ach, 0);
                            }
                        }
                        str2 = null;
                    } else {
                        str2 = intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = A03(intent.getData());
                    }
                    this.A0B = true;
                }
                if (TextUtils.isEmpty(str2) && (stringArrayExtra = intent.getStringArrayExtra("BrowserLiteIntent.EXTRA_CLICK_IDS")) != null && (length = stringArrayExtra.length) > 0) {
                    str2 = stringArrayExtra[new Random().nextInt(length)];
                }
                if (TextUtils.isEmpty(str2)) {
                    return new Kh8(null, 0Pz.A0T("Cannot fetch from pool, state: ", intent.getIntExtra("BrowserLiteIntent.EXTRA_CLICK_ID_POOL_FETCH_STATE", -1)));
                }
                Long valueOf = Long.valueOf(4YU.A06(System.currentTimeMillis()));
                ?? obj = new Object();
                ((KSd) obj).A01 = str2;
                ((KSd) obj).A00 = valueOf;
                map.put(str, obj);
                return new Kh8(str2, null);
            }
            str3 = "User is EPD opt-out";
        }
        return new Kh8(null, str3);
    }

    public void A0A(String str) {
        JZY jzy;
        JgX jgX = this.A0D;
        jgX.A0j = str;
        if (!TextUtils.isEmpty(str) && !str.equals("about:blank")) {
            jgX.A0k = str;
        }
        C3241Jnc c3241Jnc = this.A0K;
        if (c3241Jnc != null && str != null) {
            c3241Jnc.CT5(str);
        }
        Kk6 kk6 = this.A0M;
        if (kk6 != null) {
            AbstractC3252Jnp A0U = kk6.A03.A0U();
            if ((A0U == null || !A0U.A0e) && (jzy = kk6.A01) != null) {
                jzy.A00(str);
            }
        } else {
            ML7 ml7 = this.A0H;
            if (ml7 != null && !this.A07) {
                ml7.CT6(str);
            }
        }
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((MNs) it.next()).CT5(str);
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = jgX.A0K;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A0E(str);
        }
        MNp mNp = this.A0N;
        if (mNp != null) {
            mNp.CT5(str);
        }
        LDF ldf = this.A0F;
        if (ldf == null || str == null) {
            return;
        }
        Bundle A05 = 1BK.A05();
        BrowserLiteCallback browserLiteCallback = ldf.A06;
        if (browserLiteCallback != null) {
            try {
                browserLiteCallback.CT4(str, A05);
            } catch (RemoteException e) {
                0fH.A0w("BrowserLiteCallbacker", "Error in onUrlChange", e);
            }
        }
    }
}
