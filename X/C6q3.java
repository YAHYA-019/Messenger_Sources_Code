package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileFilter;

/* renamed from: X.6q3, reason: invalid class name */
/* loaded from: 6q3.class */
public final class C6q3 implements CallerContextable {
    public static final String __redex_internal_original_name = "StickerAssetDownloader";
    public final C6q6 A07;
    public final C00i A02 = new 1BQ(16511);
    public final C6q4 A01 = (C6q4) 1Bi.A03(65669);
    public final C00i A05 = new 1BQ(84488);
    public final C0es A00 = (C0es) 1Bn.A0A(83607);
    public final 5R6 A03 = (5R6) 1Bi.A03(49723);
    public final C6q5 A06 = (C6q5) 1Bi.A03(100210);
    public final AnonymousClass536 A04 = (AnonymousClass536) 1Bi.A03(49473);

    /* JADX WARN: Type inference failed for: r0v43, types: [X.6q6] */
    public C6q3() {
        C1F6 c1f6 = (C1F6) 1Bn.A0A(65573);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            final 1De r0 = new 1De(c1f6, new int[0]);
            ?? r02 = new C2u2(r0) { // from class: X.6q6
                public final 2Ff A00;
                public final 1De A01;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r301 = this;
                        r0 = r302
                        X.1BY r0 = r0.A00
                        r303 = r0
                        r0 = 0
                        r1 = r303
                        r2 = 83719(0x14707, float:1.17315E-40)
                        java.lang.Object r0 = X.1Bn.A0E(r0, r1, r2)
                        android.content.Context r0 = (android.content.Context) r0
                        r303 = r0
                        r0 = 17131(0x42eb, float:2.4006E-41)
                        java.lang.Object r0 = X.1Bi.A03(r0)
                        X.2tx r0 = (X.C2tx) r0
                        r304 = r0
                        r0 = 17132(0x42ec, float:2.4007E-41)
                        java.lang.Object r0 = X.1Bi.A03(r0)
                        X.2ty r0 = (X.C2ty) r0
                        r305 = r0
                        r0 = 49750(0xc256, float:6.9715E-41)
                        X.1Br r0 = X.1Bq.A00(r0)
                        r306 = r0
                        r0 = 17133(0x42ed, float:2.4008E-41)
                        java.lang.Object r0 = X.1Bi.A03(r0)
                        X.2tz r0 = (X.C2tz) r0
                        r307 = r0
                        r0 = 33257(0x81e9, float:4.6603E-41)
                        java.lang.Object r0 = X.1Bi.A03(r0)
                        X.2u1 r0 = (X.C2u1) r0
                        r308 = r0
                        r0 = r301
                        r1 = r303
                        r2 = r305
                        r3 = r308
                        r4 = r304
                        r5 = r307
                        r6 = r306
                        java.lang.String r7 = "sticker"
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        r0 = r301
                        r1 = r302
                        r0.A01 = r1
                        r0 = 65609(0x10049, float:9.1938E-41)
                        java.lang.Object r0 = X.1Bi.A03(r0)
                        X.2Ff r0 = (X.2Ff) r0
                        r309 = r0
                        r0 = r301
                        r1 = r309
                        r0.A00 = r1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C6q6.<init>(X.1De):void");
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
                
                    if (r0 == X.EnumC10414tb.FILE) goto L6;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v28, types: [java.io.InputStream] */
                @Override // X.C2u2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object A02(X.C10404ta r302) {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C6q6.A02(X.4ta):java.lang.Object");
                }
            };
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A07 = r02;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    private boolean A00() {
        ImmutableList build;
        5R6 r0 = this.A03;
        ImmutableList A00 = 5R6.A00(r0);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        1Du it = A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                build = builder.build();
                break;
            }
            File[] listFiles = ((File) it.next()).listFiles((FileFilter) new 3eK(r0, 1));
            if (listFiles == null) {
                build = ImmutableList.of();
                break;
            }
            for (File file : listFiles) {
                builder.m11011add((Object) file);
            }
        }
        1Du it2 = build.iterator();
        File file2 = null;
        while (it2.hasNext()) {
            File file3 = (File) it2.next();
            if (file2 == null || file3.lastModified() < file2.lastModified()) {
                file2 = file3;
            }
        }
        C0L3.A02(file2);
        ImmutableList A002 = 5R6.A00(r0);
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        1Du it3 = A002.iterator();
        while (it3.hasNext()) {
            File file4 = (File) it3.next();
            if (!file4.isDirectory() || file4.list().length == 0) {
                builder2.m11011add((Object) file4);
            }
        }
        1Du it4 = builder2.build().iterator();
        while (it4.hasNext()) {
            C0L3.A02((File) it4.next());
        }
        File A02 = r0.A02();
        if (A02 == null || 4sJ.A00(A02) <= 500000) {
            return true;
        }
        return A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[Catch: Exception -> 0x0216, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0216, blocks: (B:8:0x0047, B:9:0x004d, B:13:0x005e, B:17:0x0071, B:18:0x0078, B:19:0x007f, B:21:0x0088, B:22:0x008d, B:22:0x008d, B:25:0x0096, B:27:0x009d, B:29:0x00a3, B:32:0x00ad, B:34:0x00b5, B:35:0x00bc, B:37:0x00c5, B:39:0x00ce, B:40:0x00d3, B:42:0x00e9, B:44:0x00fe, B:45:0x0103, B:45:0x0103, B:47:0x0108, B:49:0x0110, B:50:0x0115, B:50:0x0115, B:53:0x0120, B:55:0x0126, B:57:0x012d, B:59:0x013e, B:60:0x0145, B:62:0x0153, B:64:0x0159, B:66:0x0166, B:68:0x016f, B:70:0x0184, B:72:0x018b, B:73:0x0190, B:74:0x0197, B:75:0x01a0, B:76:0x01a7, B:78:0x01b0, B:80:0x01b7, B:83:0x01cc, B:86:0x01ea, B:91:0x01f2, B:93:0x0200, B:94:0x0207, B:96:0x020e, B:98:0x0215), top: B:7:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2 A[Catch: Exception -> 0x0216, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0216, blocks: (B:8:0x0047, B:9:0x004d, B:13:0x005e, B:17:0x0071, B:18:0x0078, B:19:0x007f, B:21:0x0088, B:22:0x008d, B:22:0x008d, B:25:0x0096, B:27:0x009d, B:29:0x00a3, B:32:0x00ad, B:34:0x00b5, B:35:0x00bc, B:37:0x00c5, B:39:0x00ce, B:40:0x00d3, B:42:0x00e9, B:44:0x00fe, B:45:0x0103, B:45:0x0103, B:47:0x0108, B:49:0x0110, B:50:0x0115, B:50:0x0115, B:53:0x0120, B:55:0x0126, B:57:0x012d, B:59:0x013e, B:60:0x0145, B:62:0x0153, B:64:0x0159, B:66:0x0166, B:68:0x016f, B:70:0x0184, B:72:0x018b, B:73:0x0190, B:74:0x0197, B:75:0x01a0, B:76:0x01a7, B:78:0x01b0, B:80:0x01b7, B:83:0x01cc, B:86:0x01ea, B:91:0x01f2, B:93:0x0200, B:94:0x0207, B:96:0x020e, B:98:0x0215), top: B:7:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.File A01(android.net.Uri r302, com.facebook.common.callercontext.CallerContext r303, X.5R2 r304, java.lang.String r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6q3.A01(android.net.Uri, com.facebook.common.callercontext.CallerContext, X.5R2, java.lang.String, java.lang.String):java.io.File");
    }
}
