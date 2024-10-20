package androidx.compose.ui.contentcapture;

import X.0QD;
import X.0S2;
import X.0WH;
import X.11T;
import X.1BL;
import X.4YU;
import X.AbI;
import X.AnonymousClass001;
import X.C00m;
import X.C2818Jaa;
import X.C4G6;
import X.C4G7;
import X.JQx;
import X.JQy;
import X.JQz;
import X.JR0;
import X.JaS;
import X.JaT;
import X.KZE;
import X.Kdq;
import X.KgS;
import X.Ku3;
import X.Kuh;
import X.Ky4;
import X.L54;
import X.LBT;
import X.LD3;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: AndroidContentCaptureManager.class */
public final class AndroidContentCaptureManager implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public long A00;
    public JaS A01;
    public KgS A02;
    public L54 A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public Kuh A07;
    public C00m A08;
    public final Handler A09;
    public final 0WH A0A;
    public final JaS A0B = new JaS(6);
    public final JaT A0C;
    public final AndroidComposeView A0D;
    public final Runnable A0E;
    public final C4G7 A0F;

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, C00m c00m) {
        this.A0D = androidComposeView;
        this.A08 = c00m;
        Ku3 ku3 = new Ku3();
        C2818Jaa c2818Jaa = Ky4.A01;
        JaT.A01(ku3, 6);
        this.A0C = ku3;
        this.A04 = 0S2.A00;
        this.A06 = true;
        this.A0A = AbI.A07();
        this.A0F = new C4G6(1);
        this.A09 = AnonymousClass001.A07();
        JaS jaS = KZE.A00;
        11T.A0I(jaS, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A07 = jaS;
        this.A01 = new JaS(6);
        LBT A00 = androidComposeView.A0q.A00();
        11T.A0I(jaS, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A02 = new KgS(jaS, A00);
        this.A0E = new Runnable() { // from class: X.Ljp
            public static final String __redex_internal_original_name = "AndroidContentCaptureManager$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                AndroidContentCaptureManager androidContentCaptureManager = AndroidContentCaptureManager.this;
                if (androidContentCaptureManager.A03 != null) {
                    AndroidComposeView androidComposeView2 = androidContentCaptureManager.A0D;
                    androidComposeView2.Be0(true);
                    Kp7 kp7 = androidComposeView2.A0q;
                    AndroidContentCaptureManager.A02(androidContentCaptureManager, androidContentCaptureManager.A02, kp7.A00());
                    AndroidContentCaptureManager.A01(androidContentCaptureManager, androidContentCaptureManager.A02, kp7.A00());
                    Kuh A06 = androidContentCaptureManager.A06();
                    int[] iArr = A06.A02;
                    long[] jArr = A06.A03;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            long j = jArr[i2];
                            if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                                int A0G = JR0.A0G(i2, length);
                                for (int i3 = 0; i3 < A0G; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = iArr[(i2 << 3) + i3];
                                        KgS kgS = (KgS) androidContentCaptureManager.A01.A03(i4);
                                        KgT kgT = (KgT) A06.A03(i4);
                                        if (kgT == null) {
                                            throw AnonymousClass001.A0N("no value for specified key");
                                        }
                                        LBT lbt = kgT.A01;
                                        Lj1 lj1 = lbt.A05;
                                        Iterator it = lj1.iterator();
                                        if (kgS == null) {
                                            while (it.hasNext()) {
                                                Object A0r = JR1.A0r(it);
                                                L29 l29 = KdW.A0P;
                                                if (11T.A0O(A0r, l29)) {
                                                    AndroidContentCaptureManager.A03(androidContentCaptureManager, String.valueOf(L5h.A01(lj1, l29)), lbt.A02);
                                                }
                                            }
                                        } else {
                                            while (it.hasNext()) {
                                                Object A0r2 = JR1.A0r(it);
                                                L29 l292 = KdW.A0P;
                                                if (11T.A0O(A0r2, l292)) {
                                                    Object A01 = L5h.A01(kgS.A01, l292);
                                                    Object A012 = L5h.A01(lj1, l292);
                                                    if (!11T.A0O(A01, A012)) {
                                                        AndroidContentCaptureManager.A03(androidContentCaptureManager, String.valueOf(A012), lbt.A02);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (A0G != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            } else {
                                i = i2 + 1;
                            }
                        }
                    }
                    JaS jaS2 = androidContentCaptureManager.A01;
                    jaS2.A06();
                    Kuh A062 = androidContentCaptureManager.A06();
                    int[] iArr2 = A062.A02;
                    Object[] objArr = A062.A04;
                    long[] jArr2 = A062.A03;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j2 = jArr2[i5];
                            if ((JQy.A0L(j2) & (-9187201950435737472L)) != -9187201950435737472L) {
                                int A08 = 8 - JQx.A08(i5, length2);
                                int i6 = 0;
                                while (true) {
                                    int i7 = i6;
                                    if (i7 >= A08) {
                                        break;
                                    }
                                    if ((255 & j2) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        jaS2.A08(iArr2[i8], new KgS(androidContentCaptureManager.A06(), ((KgT) objArr[i8]).A01));
                                    }
                                    j2 >>= 8;
                                    i6 = i7 + 1;
                                }
                                if (A08 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    androidContentCaptureManager.A02 = new KgS(androidContentCaptureManager.A06(), kp7.A00());
                    androidContentCaptureManager.A05 = false;
                }
            }
        };
    }

    private final void A00() {
        L54 l54 = this.A03;
        if (l54 == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        JaS jaS = this.A0B;
        long j = -9187201950435737472L;
        if (AnonymousClass001.A1N(jaS.A01)) {
            ArrayList A0s = AnonymousClass001.A0s();
            Object[] objArr = jaS.A04;
            long[] jArr = jaS.A03;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j2 = jArr[i];
                    if ((JQz.A0I(j2, 7) & j) != j) {
                        int A0G = JR0.A0G(i, length);
                        for (int i2 = 0; i2 < A0G; i2++) {
                            if ((j2 & 255) < 128) {
                                A0s.add(JQx.A0t(objArr, i, i2));
                            }
                            j2 >>= 8;
                        }
                        if (A0G != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    j = -9187201950435737472L;
                }
            }
            ArrayList A10 = 1BL.A10(A0s);
            int size = A0s.size();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= size) {
                    break;
                }
                A10.add(((Kdq) A0s.get(i4)).A00);
                i3 = i4 + 1;
            }
            l54.A04(A10);
            jaS.A06();
        }
        JaT jaT = this.A0C;
        if (jaT.A01 == 0) {
            return;
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        int[] iArr = jaT.A02;
        long[] jArr2 = jaT.A03;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5;
                long j3 = jArr2[i6];
                if ((JQz.A0I(j3, 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A0G2 = JR0.A0G(i6, length2);
                    int i7 = 0;
                    while (true) {
                        int i8 = i7;
                        if (i8 >= A0G2) {
                            break;
                        }
                        if ((j3 & 255) < 128) {
                            AnonymousClass001.A1J(A0s2, iArr[(i6 << 3) + i8]);
                        }
                        j3 >>= 8;
                        i7 = i8 + 1;
                    }
                    if (A0G2 != 8) {
                        break;
                    }
                }
                if (i6 == length2) {
                    break;
                } else {
                    i5 = i6 + 1;
                }
            }
        }
        ArrayList A102 = 1BL.A10(A0s2);
        int size2 = A0s2.size();
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (i10 >= size2) {
                l54.A05(0QD.A0o(A102));
                jaT.A03();
                return;
            } else {
                4YU.A1W(A102, JQy.A0H(A0s2, i10));
                i9 = i10 + 1;
            }
        }
    }

    public static final void A01(AndroidContentCaptureManager androidContentCaptureManager, KgS kgS, LBT lbt) {
        List A08 = lbt.A08(false, true);
        int size = A08.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            LBT A0Q = JQz.A0Q(A08, i2);
            if (androidContentCaptureManager.A06().A04(A0Q.A02) && !kgS.A00.A02(A0Q.A02)) {
                androidContentCaptureManager.A04(A0Q);
            }
            i = i2 + 1;
        }
        JaS jaS = androidContentCaptureManager.A01;
        int[] iArr = jaS.A02;
        long[] jArr = jaS.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                long j = jArr[i4];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A082 = 8 - JQx.A08(i4, length);
                    for (int i5 = 0; i5 < A082; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = iArr[(i4 << 3) + i5];
                            if (!androidContentCaptureManager.A06().A04(i6)) {
                                JaS jaS2 = androidContentCaptureManager.A0B;
                                if (jaS2.A05(i6)) {
                                    jaS2.A07(i6);
                                } else {
                                    androidContentCaptureManager.A0C.A04(i6);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (A082 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i3 = i4 + 1;
                }
            }
        }
        List A083 = lbt.A08(false, true);
        int size2 = A083.size();
        for (int i7 = 0; i7 < size2; i7++) {
            LBT A0Q2 = JQz.A0Q(A083, i7);
            if (androidContentCaptureManager.A06().A04(A0Q2.A02) && jaS.A04(A0Q2.A02)) {
                Object A03 = jaS.A03(A0Q2.A02);
                if (A03 == null) {
                    throw AnonymousClass001.A0N("node not present in pruned tree before this change");
                }
                A01(androidContentCaptureManager, (KgS) A03, A0Q2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x015d, code lost:
    
        if (r301.A0A.add(r303.A04) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0160, code lost:
    
        r301.A0F.D5N(X.04S.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0176, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r301, X.KgS r302, X.LBT r303) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A02(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, X.KgS, X.LBT):void");
    }

    public static final void A03(AndroidContentCaptureManager androidContentCaptureManager, String str, int i) {
        L54 l54;
        if (Build.VERSION.SDK_INT < 29 || (l54 = androidContentCaptureManager.A03) == null) {
            return;
        }
        AutofillId A01 = l54.A01(i);
        if (A01 == null) {
            throw AnonymousClass001.A0N("Invalid content capture ID");
        }
        l54.A03(A01, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if (r309 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03f5, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A04(X.LBT r302) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A04(X.LBT):void");
    }

    private final void A05(LBT lbt) {
        if (this.A03 != null) {
            int i = lbt.A02;
            JaS jaS = this.A0B;
            if (jaS.A05(i)) {
                jaS.A07(i);
            } else {
                this.A0C.A04(i);
            }
            List A08 = lbt.A08(false, true);
            int size = A08.size();
            for (int i2 = 0; i2 < size; i2++) {
                A05(JQz.A0Q(A08, i2));
            }
        }
    }

    public final Kuh A06() {
        if (this.A06) {
            this.A06 = false;
            this.A07 = LD3.A00(this.A0D.A0q);
            this.A00 = System.currentTimeMillis();
        }
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3 A[Catch: all -> 0x017f, TRY_ENTER, TryCatch #1 {all -> 0x017f, blocks: (B:14:0x00c1, B:17:0x00cc, B:18:0x00d3, B:22:0x00eb, B:25:0x00f3, B:27:0x00fb, B:30:0x010a, B:32:0x0111, B:36:0x011b, B:38:0x0122, B:39:0x0127, B:41:0x0130, B:43:0x0138, B:44:0x013d, B:46:0x014d, B:47:0x0154, B:61:0x00e4), top: B:7:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x015f -> B:15:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A07(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A07(X.0DR):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.A03 = (L54) this.A08.invoke();
        A04(this.A0D.A0q.A00());
        A00();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        A05(this.A0D.A0q.A00());
        A00();
        this.A03 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.A09.removeCallbacks(this.A0E);
        this.A03 = null;
    }
}
