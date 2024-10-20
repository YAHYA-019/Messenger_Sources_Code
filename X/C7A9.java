package X;

import android.net.Uri;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.storage.cask.fbapps.FBCask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7A9, reason: invalid class name */
/* loaded from: 7A9.class */
public final class C7A9 {
    public final /* synthetic */ 7A8 A00;
    public final /* synthetic */ FBCask A01;
    public final /* synthetic */ 1Mw A02;

    public C7A9(7A8 r302, FBCask fBCask, 1Mw r304) {
        this.A01 = fBCask;
        this.A02 = r304;
        this.A00 = r302;
    }

    public final void A00(LED led, QuickPerformanceLogger quickPerformanceLogger, String str, int i) {
        Uri uri;
        FileOutputStream fileOutputStream;
        Uri uri2;
        FBCask fBCask = null;
        boolean z = false;
        if (led == null) {
            z = true;
        }
        0fH.A0g(Boolean.valueOf(z), "ParserFacadeImpl", "webPageInfo is null ? %b");
        if (led == null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerPoint(637347993, i, "load_page_end");
                quickPerformanceLogger.markerEnd(637347993, i, (short) 3);
                return;
            }
            return;
        }
        FBCask fBCask2 = this.A01;
        boolean z2 = false;
        if (fBCask2 != null) {
            fBCask = fBCask2;
            z2 = true;
        }
        String str2 = led.A0I;
        11T.A09(str2);
        6Bu r0 = new 6Bu(str2);
        String str3 = led.A06;
        if (str3 == null || str3.length() == 0) {
            str3 = str2;
        }
        r0.A07 = str3;
        r0.A0C = led.A09;
        r0.A0E = led.A0A;
        r0.A0B = led.A08;
        C7qa c7qa = led.A04;
        6Bu r317 = null;
        r0.A02 = c7qa != null ? Integer.valueOf(c7qa.A00) : null;
        r0.A08 = c7qa != null ? c7qa.A01 : null;
        r0.A09 = c7qa != null ? c7qa.A02 : null;
        L7e l7e = led.A03;
        r0.A0F = l7e != null ? l7e.A02 : null;
        r0.A04 = l7e != null ? Integer.valueOf(l7e.A00) : null;
        r0.A05 = l7e != null ? Integer.valueOf(l7e.A01) : null;
        r0.A06 = led.A05;
        List list = led.A0C;
        r0.A0G = list != null ? Collections.unmodifiableList(list) : null;
        byte[] bArr = led.A0D;
        if (bArr == null) {
            uri = null;
        } else {
            if (z2) {
                File A00 = C3RB.A00(fBCask, UUID.randomUUID().toString());
                try {
                    fileOutputStream = new FileOutputStream(A00);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        uri = Uri.fromFile(A00);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException e) {
                    0fH.A0p("PageInfoAdapter", "copying into FileOutputStream failed", e);
                }
            }
            uri = null;
        }
        r0.A00 = uri;
        byte[] bArr2 = led.A0E;
        if (bArr2 == null) {
            uri2 = null;
        } else {
            if (z2) {
                File A002 = C3RB.A00(fBCask, UUID.randomUUID().toString());
                try {
                    fileOutputStream = new FileOutputStream(A002);
                    try {
                        fileOutputStream.write(bArr2);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        uri2 = Uri.fromFile(A002);
                    } finally {
                    }
                } catch (IOException e2) {
                    0fH.A0p("PageInfoAdapter", "copying into FileOutputStream failed", e2);
                }
            }
            uri2 = null;
        }
        r0.A01 = uri2;
        String str4 = led.A07;
        r0.A0D = str4;
        byte[] bArr3 = led.A0D;
        r0.A0I = bArr3;
        byte[] bArr4 = led.A0E;
        r0.A0H = bArr4;
        if (r0.A0E != null || r0.A0C != null || bArr3 != null || bArr4 != null || r0.A00 != null || uri2 != null) {
            if (str4 != null && 11T.A0P("/image/", 1, str4)) {
                r0.A0D = "png";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("pageInfo is:");
            sb.append(r0);
            0fH.A0j("PageInfoAdapter", sb.toString());
            r317 = r0;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerPoint(637347993, i, "load_page_end");
                quickPerformanceLogger.markerEnd(637347993, i, (short) 2);
            }
            r0.A0A = 7Sn.A01(str);
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(637347993, i, "load_page_end");
            quickPerformanceLogger.markerEnd(637347993, i, (short) 3);
        }
        this.A00.ADS(r317, str);
    }
}
