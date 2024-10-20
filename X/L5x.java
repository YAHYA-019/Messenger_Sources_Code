package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.webkit.WebView;
import com.facebook.browser.lite.BrowserLiteInMainProcessIntentService;
import com.facebook.browser.lite.BrowserLiteIntentService;

/* loaded from: L5x.class */
public abstract class L5x {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:12:0x001e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static void A00(android.content.Context r301) {
        /*
            r0 = r301
            boolean r0 = A02(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            java.lang.String r0 = "BrowserLiteIntentServiceHelper"
            r303 = r0
            java.lang.String r0 = "Warming up the WebView"
            r304 = r0
            r0 = r303
            r1 = r304
            X.0fH.A0j(r0, r1)     // Catch: java.lang.Exception -> L1e
            r0 = r301
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r0)     // Catch: java.lang.Exception -> L1e
        L19:
            X.LUF r0 = X.KVn.A00()     // Catch: java.lang.Exception -> L1e java.lang.Exception -> L22
        L1d:
            return
        L1e:
            goto L19
        L22:
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L5x.A00(android.content.Context):void");
    }

    public static void A01(Context context, Bundle bundle, String str, boolean z, boolean z2) {
        Intent A0D = C3o5.A0D(context, z ? BrowserLiteInMainProcessIntentService.class : BrowserLiteIntentService.class);
        A0D.putExtra("EXTRA_ACTION", str);
        if (bundle != null) {
            A0D.putExtras(bundle);
        }
        if (z2) {
            A0D.putExtra("EXTRA_START_AS_SERVICE", true);
            1BK.A0W().A0C(context, A0D);
            return;
        }
        if (z) {
            try {
                0Fe.enqueueWork(context, BrowserLiteInMainProcessIntentService.class, 560821342, A0D);
                return;
            } catch (RuntimeException e) {
                e = e;
                if (e.getCause() instanceof DeadObjectException) {
                    return;
                }
                if ((e instanceof IllegalArgumentException) && String.valueOf(e.getMessage()).contains("No such service")) {
                    0fH.A0r("BrowserLiteInMainProcessIntentService", "Could not enqueue work", e);
                    return;
                }
                throw e;
            }
        }
        try {
            0Fe.enqueueWork(context, BrowserLiteIntentService.class, 48052291, A0D);
        } catch (RuntimeException e2) {
            e = e2;
            if (e.getCause() instanceof DeadObjectException) {
                return;
            }
            if ((e instanceof IllegalArgumentException) && String.valueOf(e.getMessage()).contains("No such service")) {
                0fH.A0r("BrowserLiteIntentService", "Could not enqueue work", e);
                return;
            }
            throw e;
        }
    }

    public static boolean A02(Context context) {
        boolean z = false;
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                context.getPackageManager().getPackageInfo(currentWebViewPackage.packageName, 0);
                z = true;
            }
            return z;
        } catch (Exception e) {
            0fH.A0u("BrowserLiteIntentServiceHelper", "Checking for WebView package failed", e);
            return false;
        }
    }
}
