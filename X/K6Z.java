package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: K6Z.class */
public final class K6Z extends LCw implements MIt {
    public static DecimalFormat A03;
    public final Uri A00;
    public final L9t A01;
    public final String A02;

    public K6Z(L9t l9t, String str) {
        super(l9t);
        AbstractC00481b7.A04(str);
        this.A01 = l9t;
        this.A02 = str;
        AbstractC00481b7.A04(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(TraceFieldType.Uri);
        builder.authority("google-analytics.com");
        builder.path(str);
        this.A00 = builder.build();
    }

    public static String A00(String str, int i) {
        if (i > 0) {
            return AnonymousClass001.A0e(str, AnonymousClass001.A0l(1BK.A02(str) + 11), i);
        }
        KYF.A00("index out of range for prefix", str);
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap A01(X.L8Q r301) {
        /*
            Method dump skipped, instructions count: 1893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6Z.A01(X.L8Q):java.util.HashMap");
    }

    public static void A02(String str, java.util.Map map, double d) {
        if (d != 0.0d) {
            DecimalFormat decimalFormat = A03;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat("0.######");
                A03 = decimalFormat;
            }
            map.put(str, decimalFormat.format(d));
        }
    }

    public static void A03(java.util.Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    @Override // X.MIt
    public final Uri DCF() {
        return this.A00;
    }

    @Override // X.MIt
    public final void DCN(L8Q l8q) {
        long j;
        int i;
        K6g k6g;
        HashMap A01;
        Object obj;
        AbstractC00481b7.A02(l8q);
        AbstractC00481b7.A08(l8q.A03, "Can't deliver not submitted measurement");
        AbstractC00481b7.A05("deliver should be called on worker thread");
        L8Q l8q2 = new L8Q(l8q);
        K1l k1l = (K1l) l8q2.A01(K1l.class);
        if (TextUtils.isEmpty(k1l.A01)) {
            k6g = ((LCw) this).A00.A0C;
            L9t.A02(k6g);
            A01 = A01(l8q2);
            obj = "Ignoring measurement without type";
        } else {
            if (!TextUtils.isEmpty(k1l.A02)) {
                K1a k1a = this.A01.A02;
                AbstractC00481b7.A02(k1a);
                AbstractC00481b7.A08(AnonymousClass001.A1N(k1a.A01 ? 1 : 0), "Analytics instance not initialized");
                double d = k1l.A00;
                String str = k1l.A02;
                if (d > 0.0d && d < 100.0d) {
                    if (TextUtils.isEmpty(str)) {
                        i = 1;
                    } else {
                        i = 0;
                        for (int length = str.length() - 1; length >= 0; length--) {
                            char charAt = str.charAt(length);
                            i = ((i << 6) & ((-1) >>> 4)) + charAt + (charAt << 14);
                            int i2 = 266338304 & i;
                            if (i2 != 0) {
                                i ^= i2 >> 21;
                            }
                        }
                    }
                    if (i % LogcatReader.DEFAULT_WAIT_TIME >= d * 100.0d) {
                        A0E("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                        return;
                    }
                }
                HashMap A012 = A01(l8q2);
                A012.put("v", ConstantsKt.CAMERA_ID_BACK);
                A012.put("_v", Kc9.A01);
                String str2 = this.A02;
                A012.put("tid", str2);
                AbstractC00481b7.A08(AnonymousClass001.A1N(k1a.A01 ? 1 : 0), "Analytics instance not initialized");
                if (k1a.A02) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    Iterator A0x = AnonymousClass001.A0x(A012);
                    while (A0x.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0x);
                        if (A0k.length() != 0) {
                            AnonymousClass001.A1H(A0k);
                        }
                        JR0.A1J(A0k, AnonymousClass001.A0j(A0z));
                        A0k.append(1BK.A16(A0z));
                    }
                    LCw.A09(this, A0k.toString(), (Object) null, (Object) null, "Dry run is enabled. GoogleAnalytics would have sent", 4);
                    return;
                }
                HashMap A0u = AnonymousClass001.A0u();
                L6G.A02(A0u, ErrorReportingConstants.USER_ID_KEY, k1l.A03);
                K1n k1n = (K1n) ((L7x) l8q.A09.get(K1n.class));
                if (k1n != null) {
                    L6G.A02(A0u, "an", k1n.A00);
                    L6G.A02(A0u, "aid", k1n.A02);
                    L6G.A02(A0u, "av", k1n.A01);
                    L6G.A02(A0u, "aiid", k1n.A03);
                }
                KlA klA = new KlA(k1l.A02, str2, A0u, 0L, JQx.A1V(k1l.A04));
                L9t l9t = ((LCw) this).A00;
                K6c k6c = l9t.A06;
                L9t.A02(k6c);
                k6c.A0I();
                L0g.A00();
                K6k k6k = k6c.A00;
                k6k.A0I();
                L0g.A00();
                long j2 = -1;
                try {
                    try {
                        K6m k6m = k6k.A04;
                        k6m.A0I();
                        C01m.A01(k6m.A0J(), -1896096357);
                        String str3 = klA.A01;
                        AbstractC00481b7.A04(str3);
                        k6m.A0I();
                        L0g.A00();
                        SQLiteDatabase A0J = k6m.A0J();
                        String valueOf = String.valueOf(0L);
                        int delete = A0J.delete("properties", "app_uid=? AND cid<>?", new String[]{valueOf, str3});
                        if (delete > 0) {
                            k6m.A0D("Deleted property records", Integer.valueOf(delete));
                        }
                        String str4 = klA.A02;
                        AbstractC00481b7.A04(str3);
                        AbstractC00481b7.A04(str4);
                        k6m.A0I();
                        L0g.A00();
                        j = K6m.A01(k6m, "SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{valueOf, str3, str4});
                        klA.A00 = 1 + j;
                        k6m.A0I();
                        L0g.A00();
                        SQLiteDatabase A0J2 = k6m.A0J();
                        java.util.Map map = klA.A03;
                        AbstractC00481b7.A02(map);
                        Uri.Builder builder = new Uri.Builder();
                        Iterator A0y = AnonymousClass001.A0y(map);
                        while (A0y.hasNext()) {
                            Map.Entry A0z2 = AnonymousClass001.A0z(A0y);
                            builder.appendQueryParameter(AnonymousClass001.A0j(A0z2), 1BK.A16(A0z2));
                        }
                        String encodedQuery = builder.build().getEncodedQuery();
                        if (encodedQuery == null) {
                            encodedQuery = "";
                        }
                        ContentValues contentValues = new ContentValues();
                        4YV.A16(contentValues, "app_uid", 0L);
                        contentValues.put("cid", str3);
                        contentValues.put("tid", str4);
                        4YU.A1E(contentValues, "adid", klA.A04 ? 1 : 0);
                        4YV.A16(contentValues, "hits_count", klA.A00);
                        contentValues.put("params", encodedQuery);
                        try {
                            C01m.A00(-1992842745);
                            long insertWithOnConflict = A0J2.insertWithOnConflict("properties", null, contentValues, 5);
                            C01m.A00(-1447504665);
                            if (insertWithOnConflict == j2) {
                                LCw.A0A(k6m, "Failed to insert/update a property (got -1)", 6);
                            }
                        } catch (SQLiteException e) {
                            k6m.A0G("Error storing a property", e);
                        }
                        k6m.A0I();
                        k6m.A0J().setTransactionSuccessful();
                        try {
                            k6m.A0L();
                        } catch (SQLiteException e2) {
                            k6k.A0G("Failed to end transaction", e2);
                        }
                        if (j == 0) {
                            L0g.A00();
                            k6k.A0E("Sending first hit to property", str4);
                            L9t l9t2 = ((LCw) k6k).A00;
                            K6h k6h = l9t2.A0D;
                            L9t.A02(k6h);
                            if (!new L22(((LCw) k6h).A00.A04, k6h.A0J()).A00(AnonymousClass001.A05(Kz3.A04.A00))) {
                                L9t.A02(k6h);
                                L0g.A00();
                                k6h.A0I();
                                String string = k6h.A00.getString("installation_campaign", null);
                                if (TextUtils.isEmpty(string)) {
                                    string = null;
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    K6g k6g2 = l9t2.A0C;
                                    L9t.A02(k6g2);
                                    K1m A00 = L6G.A00(k6g2, string);
                                    k6k.A0E("Found relevant installation campaign", A00);
                                    K6k.A02(klA, k6k, A00);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            k6k.A04.A0L();
                            throw th;
                        } catch (SQLiteException e3) {
                            k6k.A0G("Failed to end transaction", e3);
                            throw th;
                        }
                    }
                } catch (SQLiteException e4) {
                    k6k.A0G("Failed to update Analytics property", e4);
                    try {
                        k6k.A04.A0L();
                    } catch (SQLiteException e5) {
                        k6k.A0G("Failed to end transaction", e5);
                    }
                    j = -1;
                }
                A012.put("_s", String.valueOf(j));
                K6g k6g3 = l9t.A0C;
                L9t.A02(k6g3);
                L2Y l2y = new L2Y(k6g3, (List) null, A012, 0, l8q.A00, 0L, true);
                L9t.A02(k6c);
                k6c.A0I();
                k6c.A0E("Hit delivery requested", l2y);
                L9t.A00(k6c).A02.submit(new LoZ(k6c, l2y));
                return;
            }
            k6g = ((LCw) this).A00.A0C;
            L9t.A02(k6g);
            A01 = A01(l8q2);
            obj = "Ignoring measurement without client id";
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        Iterator A0x2 = AnonymousClass001.A0x(A01);
        while (A0x2.hasNext()) {
            Map.Entry A0z3 = AnonymousClass001.A0z(A0x2);
            if (A0k2.length() > 0) {
                A0k2.append(',');
            }
            A0k2.append(AnonymousClass001.A0j(A0z3));
            A0k2.append('=');
            A0k2.append(1BK.A16(A0z3));
        }
        k6g.A0F(1BL.A0s("Discarding hit. ", obj), A0k2.toString());
    }
}
