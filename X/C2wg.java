package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.io.Closeables;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* renamed from: X.2wg, reason: invalid class name */
/* loaded from: 2wg.class */
public final class C2wg implements 2Ad {
    public long A00;
    public String A02;
    public final C0dp A03;
    public final Queue A04;
    public final C01s A05;
    public final 1CO A07;
    public String A01 = null;
    public final C00i A06 = new 1BV(16671);

    public C2wg() {
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        C01s c01s = (C01s) 1Bi.A03(16511);
        1CO r0 = (1CO) 1Bi.A03(16385);
        this.A03 = c0dp;
        this.A05 = c01s;
        this.A04 = new ConcurrentLinkedQueue();
        this.A02 = "not inspected";
        this.A00 = c0dp.now();
        this.A07 = r0;
    }

    public static JSONObject A00(C2wg c2wg, int i) {
        JSONObject put;
        JSONObject A12 = AnonymousClass001.A12();
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.addAll(c2wg.A04);
        Collections.reverse(A0s);
        Iterator it = A0s.iterator();
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                break;
            }
            48W r0 = (48W) it.next();
            if (i3 > i) {
                break;
            }
            String valueOf = String.valueOf(i3);
            if (r0 == null) {
                put = null;
            } else {
                48V r02 = r0.A02;
                JSONObject put2 = AnonymousClass001.A12().put("recordTime", r0.A01).put("category", r02 != null ? r02.toString() : "not inspected").put(Property.SYMBOL_Z_ORDER_SOURCE, r0.A04).put("dest", r0.A05).put("operation", r0.A03);
                String str = r0.A06;
                if (str == null) {
                    str = "";
                }
                JSONObject put3 = put2.put("threadKey", str);
                long j = r0.A00;
                put = put3.put("timeSpent", StringFormatUtil.formatStrLocaleSafe("%d s %d ms", Long.valueOf(j / 1000), Long.valueOf(j % 1000)));
            }
            A12.put(valueOf, put);
            i2 = i3 + 1;
        }
        return A12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        if (java.lang.Long.parseLong(r306) > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (r324.equals("not inspected") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(java.lang.String r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2wg.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        HashMap A0u = AnonymousClass001.A0u();
        try {
            File A0D = AnonymousClass001.A0D(file, "recent_navigation_json.txt");
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(A0D));
            try {
                printWriter.write(A00(this, 50).toString());
                A0u.put("recent_navigation_json.txt", Uri.fromFile(A0D).toString());
                return A0u;
            } finally {
                Closeables.A00(printWriter, false);
            }
        } catch (Exception e) {
            this.A05.softReport("RecentNavigationTracker", e);
            return A0u;
        }
    }

    public String getName() {
        return "RecentNavigationTracker";
    }

    public boolean isMemoryIntensive() {
        return false;
    }

    public boolean isUserIdentifiable() {
        return false;
    }

    public void prepareDataForWriting() {
    }

    public boolean shouldSendAsync() {
        return this.A07.AZk(2342153633397867031L);
    }
}
