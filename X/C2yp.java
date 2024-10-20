package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.imagepipeline.module.BitmapPoolStatsTracker;
import com.facebook.imagepipeline.module.CacheTrackerName;
import com.facebook.imagepipeline.module.FlexByteArrayPoolParams;
import com.facebook.imagepipeline.module.ImageDecodeExecutorService;
import com.facebook.imagepipeline.module.ImageTransformExecutorService;
import com.facebook.imagepipeline.module.LoggedOutDiskCacheEventListener;
import com.facebook.imagepipeline.module.NativeMemoryChunkPoolStatsTracker;
import com.facebook.imagepipeline.module.PrimaryDiskCacheEventListener;
import com.facebook.imagepipeline.module.SmallByteArrayPoolStatsTracker;
import com.facebook.imagepipeline.module.SmallDiskCacheEventListener;
import com.facebook.inject.FbInjector;
import com.facebook.mobileconfig.factory.module.AdminIdMC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.2yp, reason: invalid class name */
/* loaded from: 2yp.class */
public abstract class C2yp extends 1EJ {
    public static final 2Hc A00() {
        return new 2Hc(((2HZ) 1Bi.A04(2HZ.class)).A00("logged_out_image_file"));
    }

    public static final 2Hc A01() {
        return new 2Hc(((2HZ) 1Bi.A04(2HZ.class)).A00("profile_thumbnail_image_file"));
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.2I3] */
    public static final 2DT A02() {
        Context A00 = FbInjector.A00();
        2HP r0 = (2HP) 1Bi.A04(2HP.class);
        2HR r02 = (2HR) 1Bi.A04(2HR.class);
        2HX r03 = (2HX) 1Bi.A05(2HX.class, LoggedOutDiskCacheEventListener.class);
        A00.getClass();
        IQL iql = new IQL(A00, 1);
        2I2 r04 = new 2I2(A00);
        r04.A08 = "logged_out_image";
        r04.A07 = iql;
        r04.A02 = 262144L;
        r04.A01 = 4194304L;
        r04.A00 = 4194304L;
        r04.A03 = r0;
        r04.A04 = r03;
        r04.A06 = r02;
        r04.A05 = new Object();
        return new 2DT(r04);
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, X.2I3] */
    public static final 2DT A03() {
        Context A00 = FbInjector.A00();
        2yD r0 = (2yD) 1Bi.A05(1CO.class, (Class) null);
        2HP r02 = (2HP) 1Bi.A05(2HP.class, (Class) null);
        2HR r03 = (2HR) 1Bi.A05(2HR.class, (Class) null);
        2HX r04 = (2HX) 1Bi.A05(2HX.class, PrimaryDiskCacheEventListener.class);
        2He r05 = (2He) 1Bi.A05(2He.class, (Class) null);
        IQL iql = new IQL(A00, 2);
        2I0 A002 = 2He.A00(r05.A00.A00(36873221949161472L), (MFF) null, r05);
        long A02 = A002.A02("cache_size_limit", 62914560L);
        long A022 = A002.A02("cache_size_limit_low_space", 15728640L);
        long A023 = A002.A02("cache_size_limit_min_space", 2097152L);
        if (r0.AZk(36313557645728432L)) {
            long Auy = r0.Auy(36595032622696857L) * 1024 * 1024;
            if (Auy < 62914560) {
                Auy = 62914560;
            }
            double Ai7 = r0.Ai7(37157982575919421L);
            if (Ai7 < 1.0d || Ai7 > 20.0d) {
                Double valueOf = Double.valueOf(1.0d);
                C0d7.A0C("ImagePipelineFactory", "fb4a_android_image_disk_cache cache multipler out of range ( %f <= x <= %f). Defaulting to %f", valueOf, Double.valueOf(20.0d), valueOf);
                Ai7 = 1.0d;
            }
            double A06 = C03h.A01().A06(0S2.A00) - (6.7108864E7d * Ai7);
            C03h.A01();
            if (A06 > Auy + 1048576000) {
                A02 = (long) (A02 * Ai7);
            }
        }
        2I2 r06 = new 2I2(A00);
        r06.A08 = "image";
        r06.A07 = iql;
        r06.A02 = A023;
        r06.A01 = A022;
        r06.A00 = A02;
        r06.A03 = r02;
        r06.A04 = r04;
        r06.A06 = r03;
        r06.A05 = new Object();
        return new 2DT(r06);
    }

    public static final 2DT A04() {
        Context A00 = FbInjector.A00();
        2HP r0 = (2HP) 1Bi.A04(2HP.class);
        2HR r02 = (2HR) 1Bi.A04(2HR.class);
        2HX r03 = (2HX) 1Bi.A05(2HX.class, SmallDiskCacheEventListener.class);
        2I2 r04 = new 2I2(A00);
        r04.A08 = "image";
        r04.A07 = new IQL(A00, 3);
        r04.A02 = 262144L;
        r04.A01 = 4194304L;
        r04.A00 = 4194304L;
        r04.A03 = r0;
        r04.A04 = r03;
        r04.A06 = r02;
        return new 2DT(r04);
    }

    public static final 1E8 A05() {
        Number number = (Number) 1Bn.A0H(Integer.class, ImageDecodeExecutorService.class);
        return ((1Ej) 1Bi.A04(1Ej.class)).A01(1DU.A03, "ImageDecode", number.intValue());
    }

    public static final 2EK A06() {
        return ((1Ej) 1Bi.A04(1Ej.class)).A03(1DU.A03, "ImageCache", 2);
    }

    public static final 2EK A07() {
        return ((1Ej) 1Bi.A04(1Ej.class)).A03(1DU.A03, "ThumbnailProducer", Runtime.getRuntime().availableProcessors());
    }

    public static final 2G4 A08() {
        2Cf r0 = (2Cf) 1Bi.A04(2Cf.class);
        Object A04 = 1Bi.A04(2Ft.class);
        2ER r02 = (2ER) 1Bi.A04(2ER.class);
        11T.A0H(r0, A04);
        11T.A0F(r02, 2);
        return new 2G4(r02, r0.A01());
    }

    public static final 2FD A09() {
        return ((2Cb) 1Bi.A04(2Cb.class)).A07();
    }

    public static final 2HD A0A() {
        return ((2Cb) 1Bi.A04(2Cb.class)).A09();
    }

    public static final 2HD A0B() {
        return ((2Cb) 1Bi.A04(2Cb.class)).A0A();
    }

    public static final 2ER A0C() {
        return new 2ER((2Dl) 1Bi.A04(2Dl.class));
    }

    public static final 2Ff A0D() {
        2Cb r0 = (2Cb) 1Bi.A04(2Cb.class);
        1Bi.A05(1CO.class, (Class) null);
        return r0.A0B();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.2DB, java.lang.Object] */
    public static final 2Cb A0E() {
        2Cb r301;
        2yD r0 = (2yD) 1Bi.A04(1CO.class);
        2yD r02 = (2yD) 1Bi.A05(1CO.class, AdminIdMC.class);
        2DE r03 = (2Cf) 1Bi.A04(2Cf.class);
        2DG r04 = (2DG) 1Bi.A04(2DG.class);
        2D9.A00 = new Object();
        if (r0.AZk(36310731564713052L)) {
            synchronized (2Cb.class) {
                2Cb.A0G = true;
            }
        }
        2Dp.A0O = r0.AZk(36310731562615884L);
        2Dp.A0P = r0.AZk(36310731562681421L);
        CallerContext.A07 = r0.AZk(36310731562484810L);
        r0.AZk(36310731562550347L);
        ContextChain.A06 = r0.AZk(36312518266720957L);
        2Ds.A0D = r0.AZk(36310731562746958L);
        2Dt.A00 = r02.AZk(72339803457390870L);
        if (2Cb.A05()) {
            C0d7.A09("ImagePipelineFactory", "Attempting to initialize ImagePipelineFactory but it has already been initialized, most likely via Fresco.initialize(). Fresco.initialize() should not be used in applications that also inject the ImagePipeline via DI.");
            r301 = 2Cb.A0F;
            C0By.A03(r301, "ImagePipelineFactory was not initialized!");
        } else {
            if (r0.AZk(36310731558356028L)) {
                2Dx.A0Q.A00 = true;
            }
            2E8.A00 = new 2E4((2E0) 1Bi.A04(2E0.class), (2E1) 1Bi.A04(2E1.class));
            2Cb.A04(r04);
            r301 = 2Cb.A0F;
            C0By.A03(r301, "ImagePipelineFactory was not initialized!");
            if (r03 instanceof 2DE) {
                r03.A00 = r301.A07();
                return r301;
            }
        }
        return r301;
    }

    public static final 2GC A0F() {
        Set<2GL> A06 = 1Bi.A06(92);
        11T.A0A(A06);
        Set<2GL> A0I = 1Bn.A0I(285);
        11T.A0A(A0I);
        2GE r0 = 2GD.A00;
        Object obj = new Object();
        Object obj2 = new Object();
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(obj);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(r0, obj2);
        if (!A06.isEmpty()) {
            for (2GL r02 : A06) {
                2GE Aq2 = r02.Aq2();
                2GG AnD = r02.AnD();
                2DS Apz = r02.Apz();
                A0s.add(AnD);
                if (Apz != null) {
                    A0u.put(Aq2, Apz);
                }
            }
        }
        if (!A0I.isEmpty()) {
            for (2GL r03 : A0I) {
                2GE Aq22 = r03.Aq2();
                2GG AnD2 = r03.AnD();
                2DS Apz2 = r03.Apz();
                A0s.add(AnD2);
                if (Apz2 != null) {
                    A0u.put(Aq22, Apz2);
                }
            }
        }
        2GE r04 = 2GS.A00;
        2GT r05 = new 2GT();
        Object obj3 = new Object();
        A0s.add(r05);
        A0u.put(r04, obj3);
        return new 2GC(A0s, A0u);
    }

    public static final 2Da A0G() {
        1CO r0 = (1CO) 1Bi.A04(1CO.class);
        return !r0.AZk(2342153740771984443L) ? new 2H2(r0.AZk(36310731564647515L)) : new 3YR(new 3YT(r0));
    }

    public static final 2Hd A0H() {
        2HZ r0 = (2HZ) 1Bi.A04(2HZ.class);
        Set A0I = 1Bn.A0I(284);
        11T.A0A(A0I);
        String str = (String) 1Bi.A05(String.class, CacheTrackerName.class);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.addAll(A0I);
        A0s.add(new 2Hc(r0.A00(str)));
        return new 2Hd(A0s);
    }

    public static final 2Ci A0I() {
        return (2Ci) 1Bi.A05(2Ci.class, BitmapPoolStatsTracker.class);
    }

    public static final 2Ci A0J() {
        return (2Ci) 1Bi.A05(2Ci.class, NativeMemoryChunkPoolStatsTracker.class);
    }

    public static final 2Ci A0K() {
        return (2Ci) 1Bi.A05(2Ci.class, SmallByteArrayPoolStatsTracker.class);
    }

    public static final 2Cv A0L() {
        2Ck r0 = (2Ck) 1Bi.A04(2Ck.class);
        C0dp c0dp = (C0dp) 1Bi.A04(C0dp.class);
        return new 2Cv(new 2Cs(r0, c0dp, "bitmap_pool_stats_counters"), (2Cn) 1Bi.A04(2Cn.class));
    }

    public static final 2Cv A0M() {
        2Ck r0 = (2Ck) 1Bi.A04(2Ck.class);
        C0dp c0dp = (C0dp) 1Bi.A04(C0dp.class);
        return new 2Cv(new 2Cs(r0, c0dp, "native_memory_chunk_pool_stats_counters"), (2Cn) 1Bi.A04(2Cn.class));
    }

    public static final 2Cv A0N() {
        2Ck r0 = (2Ck) 1Bi.A04(2Ck.class);
        C0dp c0dp = (C0dp) 1Bi.A04(C0dp.class);
        return new 2Cv(new 2Cs(r0, c0dp, "common_byte_array_pool_stats_counters"), (2Cn) 1Bi.A04(2Cn.class));
    }

    public static final 2Cn A0O() {
        return new 2Cn((C0dp) 1Bi.A04(C0dp.class), (1JE) 1Bi.A04(1JE.class));
    }

    public static final 2Eh A0P() {
        return new 2Eh((ActivityManager) 1Hv.A03(FbInjector.A00(), ActivityManager.class, (Class) null), (1CO) 1Bi.A05(1CO.class, (Class) null));
    }

    public static final 2GK A0Q() {
        return new 2GK((2GJ) 1Bn.A0H(2GJ.class, (Class) null));
    }

    public static final 2Dc A0R() {
        ActivityManager activityManager = (ActivityManager) 1Hv.A03(FbInjector.A00(), ActivityManager.class, (Class) null);
        1CO r0 = (1CO) 1Bi.A05(1CO.class, (Class) null);
        2Dm r02 = (2Dm) 1Bn.A0H(2Dm.class, (Class) null);
        Runtime.getRuntime();
        return new 2Dc(activityManager, r02, r0);
    }

    public static final 2Fg A0S() {
        return ((2Cf) 1Bi.A04(2Cf.class)).A02();
    }

    public static final 2D3 A0T() {
        WindowManager windowManager = (WindowManager) 1Hv.A03(FbInjector.A00(), WindowManager.class, (Class) null);
        int A03 = AnonymousClass001.A03(1Bn.A0H(Integer.class, ImageDecodeExecutorService.class));
        Display defaultDisplay = windowManager.getDefaultDisplay();
        int i = 65536;
        if (defaultDisplay == null) {
            0fH.A18("FbFlexByteArrayPoolParams", "Window manager passed down to Fresco has no display attached! Object of class %s", new Object[]{AnonymousClass001.A0Y(windowManager)});
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i2 = point.x * point.y;
            if (i2 >= 518400) {
                i = 262144;
                if (i2 < 1024000) {
                    i = 131072;
                }
            }
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        do {
            sparseIntArray.put(i, A03);
            i *= 2;
        } while (i <= 4194304);
        return new 2D3(sparseIntArray, 4194304, A03 * 4194304, A03);
    }

    public static final 2Dd A0U() {
        return new 2Dd((1CO) 1Bi.A04(1CO.class));
    }

    public static final 4bF A0V(Object obj) {
        return new 4bF((FbUserSession) obj);
    }

    public static final 2DE A0W() {
        2Cg r0 = (2Cg) 1Bn.A0H(2Cg.class, BitmapPoolStatsTracker.class);
        2Cg r02 = (2Cg) 1Bn.A0H(2Cg.class, SmallByteArrayPoolStatsTracker.class);
        2Cy r03 = (2Cy) 1Bi.A04(2Cy.class);
        2Cg r04 = (2Cg) 1Bn.A0H(2Cg.class, NativeMemoryChunkPoolStatsTracker.class);
        2D3 r05 = (2D3) 1Bi.A05(2D3.class, FlexByteArrayPoolParams.class);
        2yD r06 = (2yD) 1Bi.A04(1CO.class);
        Resources resources = FbInjector.A00().getResources();
        r0.getClass();
        r02.getClass();
        r04.getClass();
        long min = Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        double d = resources.getDisplayMetrics().widthPixels;
        return new 2DE(new IQL(r06, 4), new 2D8(r03, r05, r0, r04, r02, "dummy", (int) (0.5d * d * d * 4.0d), (int) (min * 0.5d), r06.AZk(36311650681294037L)));
    }

    public static final 2DN A0X() {
        return new 2DN((1CO) 1Bi.A04(1CO.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0054, code lost:
    
        if (r0.AZk(36310396550840527L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.2GB A0Y() {
        /*
            java.lang.Class<X.1CO> r0 = X.1CO.class
            java.lang.Object r0 = X.1Bi.A04(r0)
            X.2yD r0 = (X.2yD) r0
            r301 = r0
            java.lang.Class<X.2Fq> r0 = X.2Fq.class
            java.lang.Object r0 = X.1Bi.A04(r0)
            X.2Fq r0 = (X.2Fq) r0
            r302 = r0
            java.lang.Class<X.2DX> r0 = X.2DX.class
            r303 = r0
            r0 = r303
            java.lang.Object r0 = X.1Bi.A04(r0)
            X.2DX r0 = (X.2DX) r0
            r304 = r0
            r0 = r301
            r1 = 36310396550709453(0x81001d000f00cd, double:3.0261792166753626E-306)
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = 2342153405764468942(0x2081001d001000ce, double:4.05744296993231E-152)
            r306 = r0
            r0 = r301
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L57
            r0 = 36310396550840527(0x81001d001100cf, double:3.0261792167582543E-306)
            r306 = r0
            r0 = r301
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r303 = r0
            r0 = r309
            if (r0 == 0) goto L5a
        L57:
            r0 = 1
            r308 = r0
        L5a:
            X.2G5 r0 = new X.2G5
            r310 = r0
            r0 = r310
            r1 = r302
            r2 = r304
            r3 = r305
            r4 = r308
            r0.<init>(r1, r2, r3, r4)
            X.2GB r0 = new X.2GB
            r303 = r0
            r0 = r303
            r1 = r310
            r0.<init>(r1)
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2yp.A0Y():X.2GB");
    }

    public static final 2Fs A0Z() {
        return new 2Fs((2Fr) 1Bi.A04(2Fr.class));
    }

    public static final 2G2 A0a() {
        2Cf r0 = (2Cf) 1Bi.A04(2Cf.class);
        2yD r02 = (2yD) 1Bi.A04(1CO.class);
        boolean AZk = r02.AZk(36310731564188759L);
        2Fu.A00 = (int) (r02.Auy(36592206541029905L) * 1024);
        2EC r03 = ((2DG) 1Bi.A04(2DG.class)).Al7().A04;
        1BK.A1J(r0, 0, r03);
        return new 2G2(2Fz.A00(r0, AZk), r0.A01(), r03);
    }

    public static final 1EC A0b() {
        return (1EC) 1Bi.A05(1EC.class, ImageTransformExecutorService.class);
    }

    public static final 2E1 A0c() {
        return new 2E1((2E0) 1Bi.A04(2E0.class));
    }

    public static final Integer A0d() {
        2yD r0 = (2yD) 1Bi.A04(1CO.class);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int A00 = 2yD.A00(r0, 36592206542471698L);
        return A00 == 0 ? Integer.valueOf(availableProcessors) : Integer.valueOf(Math.min(A00, availableProcessors));
    }
}
