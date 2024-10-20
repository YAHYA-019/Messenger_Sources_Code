package androidx.compose.ui.platform;

import X.03Y;
import X.04S;
import X.0AE;
import X.0Cs;
import X.0Pz;
import X.0QD;
import X.0RC;
import X.0TD;
import X.0WH;
import X.0Z9;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.7zO;
import X.7zU;
import X.AbE;
import X.AbI;
import X.AbstractC2938JdR;
import X.AnonymousClass001;
import X.C00m;
import X.C0Bd;
import X.C0s8;
import X.C0ty;
import X.C1A9;
import X.C2817JaQ;
import X.C2818Jaa;
import X.C2964Jet;
import X.C4G6;
import X.C4G7;
import X.DKC;
import X.DKH;
import X.ExZ;
import X.G6f;
import X.JQx;
import X.JQy;
import X.JQz;
import X.JR0;
import X.JR1;
import X.JR6;
import X.JaR;
import X.JaS;
import X.JaT;
import X.KMW;
import X.KTa;
import X.KUn;
import X.KV8;
import X.KZD;
import X.KZE;
import X.KdT;
import X.KdW;
import X.KgS;
import X.KgT;
import X.Kia;
import X.KlH;
import X.Kpf;
import X.Ku3;
import X.Kuh;
import X.KvH;
import X.Ky4;
import X.L29;
import X.L3n;
import X.L3v;
import X.L4S;
import X.L5L;
import X.L5R;
import X.L5h;
import X.LBT;
import X.LD3;
import X.LE0;
import X.LK9;
import X.LKv;
import X.LKw;
import X.LPQ;
import X.LPW;
import X.Lie;
import X.Lj1;
import X.LrO;
import X.LsE;
import X.LsF;
import X.LsG;
import X.LsJ;
import X.M6m;
import X.M7s;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: AndroidComposeViewAccessibilityDelegateCompat.class */
public final class AndroidComposeViewAccessibilityDelegateCompat extends 0Cs {
    public static final KTa A0X;
    public int A00;
    public int A01;
    public int A02;
    public C2817JaQ A03;
    public C2817JaQ A04;
    public JaS A05;
    public JaT A06;
    public 0AE A07;
    public 0AE A08;
    public KlH A09;
    public KgS A0A;
    public AccessibilityNodeInfoCompat A0B;
    public Integer A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Kuh A0H;
    public C2964Jet A0I;
    public Function1 A0J = M6m.A00(this, 27);
    public final Handler A0K;
    public final AccessibilityManager.AccessibilityStateChangeListener A0L;
    public final AccessibilityManager.TouchExplorationStateChangeListener A0M;
    public final AccessibilityManager A0N;
    public final JaS A0O;
    public final JaS A0P;
    public final AndroidComposeView A0Q;
    public final Kia A0R;
    public final Runnable A0S;
    public final List A0T;
    public final 0WH A0U;
    public final Function1 A0V;
    public final C4G7 A0W;

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.JaR, X.KTa] */
    static {
        int[] iArr = new int[32];
        boolean A1W = 1BK.A1W(new int[]{2131361814, 2131361815, 2131361826, 2131361837, 2131361840, 2131361841, 2131361842, 2131361843, 2131361844, 2131361845, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361823, 2131361824, 2131361825, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361832, 2131361833}, iArr);
        System.arraycopy(new int[]{2131361834, 2131361835, 2131361836, 2131361838, 2131361839}, A1W ? 1 : 0, iArr, 27, 5);
        KTa kTa = KZD.A00;
        ?? obj = new Object();
        ((KTa) obj).A01 = new int[32];
        int i = ((KTa) obj).A00;
        if (i < 0 || i > i) {
            throw new IndexOutOfBoundsException(0Pz.A0C(i, i, "Index ", " must be in 0.."));
        }
        JaR.A00((JaR) obj, i + 32);
        int[] iArr2 = ((KTa) obj).A01;
        int i2 = ((KTa) obj).A00;
        if (i != i2) {
            C1A9.A0G(iArr2, iArr2, i + 32, i, i2);
        }
        C1A9.A0G(iArr, iArr2, i, A1W ? 1 : 0, 32);
        ((KTa) obj).A00 += 32;
        A0X = obj;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [X.JaQ, X.L4S] */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.JaQ, X.L4S] */
    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.A0Q = androidComposeView;
        int i = (-1) << (-1);
        this.A02 = i;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        11T.A0I(systemService, 1BJ.A00(19));
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.A0N = accessibilityManager;
        this.A0L = new LKv(this);
        this.A0M = new LKw(this);
        this.A0D = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.A0K = AnonymousClass001.A07();
        this.A0I = new C2964Jet(this);
        this.A01 = i;
        this.A0O = new JaS(6);
        this.A0P = new JaS(6);
        this.A07 = new 0AE(10);
        this.A08 = new 0AE(10);
        this.A00 = -1;
        this.A0U = AbI.A07();
        this.A0W = new C4G6(1);
        this.A0F = true;
        JaS jaS = KZE.A00;
        11T.A0I(jaS, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A0H = jaS;
        Ku3 ku3 = new Ku3();
        C2818Jaa c2818Jaa = Ky4.A01;
        JaT.A01(ku3, 6);
        this.A06 = ku3;
        ?? l4s = new L4S();
        C2817JaQ.A01(l4s, 6);
        this.A04 = l4s;
        ?? l4s2 = new L4S();
        C2817JaQ.A01(l4s2, 6);
        this.A03 = l4s2;
        this.A0R = new Kia();
        this.A05 = new JaS(6);
        LBT A00 = androidComposeView.A0q.A00();
        11T.A0I(jaS, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A0A = new KgS(jaS, A00);
        androidComposeView.addOnAttachStateChangeListener(new LK9(this, 2));
        this.A0S = new LrO(this);
        this.A0T = AnonymousClass001.A0s();
        this.A0V = M6m.A00(this, 28);
    }

    public static final int A00(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        if (i == androidComposeViewAccessibilityDelegateCompat.A0Q.A0q.A00().A02) {
            i = -1;
        }
        return i;
    }

    public static final int A01(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LBT lbt) {
        Lj1 lj1 = lbt.A05;
        L29 l29 = KdW.A02;
        Map map = lj1.A02;
        if (!map.containsKey(l29)) {
            L29 l292 = KdW.A0Q;
            if (map.containsKey(l292)) {
                return JR0.A0I(((L3n) lj1.A01(l292)).A00);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    public static final int A02(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LBT lbt) {
        Lj1 lj1 = lbt.A05;
        L29 l29 = KdW.A02;
        Map map = lj1.A02;
        if (!map.containsKey(l29)) {
            L29 l292 = KdW.A0Q;
            if (map.containsKey(l292)) {
                return JQz.A0C(((L3n) lj1.A01(l292)).A00);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    public static final Rect A03(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, KgT kgT) {
        Rect rect = kgT.A00;
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0Q;
        long BZD = androidComposeView.BZD(KvH.A00(rect.left, rect.top));
        long BZD2 = androidComposeView.BZD(KvH.A00(rect.right, rect.bottom));
        return new Rect((int) Math.floor(DKH.A00(BZD)), (int) Math.floor(JR1.A02(BZD)), (int) Math.ceil(DKH.A00(BZD2)), (int) Math.ceil(JR1.A02(BZD2)));
    }

    public static final AccessibilityEvent A04(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2) {
        KgT kgT;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0Q;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        if (A0L(androidComposeViewAccessibilityDelegateCompat) && (kgT = (KgT) A06(androidComposeViewAccessibilityDelegateCompat).A03(i)) != null) {
            obtain.setPassword(Lj1.A00(kgT.A01.A05, KdW.A0I));
        }
        return obtain;
    }

    public static final AccessibilityEvent A05(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, CharSequence charSequence, Integer num, Integer num2, Integer num3, int i) {
        AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, i, 8192);
        if (num != null) {
            A04.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            A04.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            A04.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            A04.getText().add(charSequence);
        }
        return A04;
    }

    public static final Kuh A06(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0F) {
            androidComposeViewAccessibilityDelegateCompat.A0F = false;
            androidComposeViewAccessibilityDelegateCompat.A0H = LD3.A00(androidComposeViewAccessibilityDelegateCompat.A0Q.A0q);
            if (A0L(androidComposeViewAccessibilityDelegateCompat)) {
                C2817JaQ c2817JaQ = androidComposeViewAccessibilityDelegateCompat.A04;
                c2817JaQ.A02();
                C2817JaQ c2817JaQ2 = androidComposeViewAccessibilityDelegateCompat.A03;
                c2817JaQ2.A02();
                KgT kgT = (KgT) A06(androidComposeViewAccessibilityDelegateCompat).A03(-1);
                LBT lbt = kgT != null ? kgT.A01 : null;
                11T.A0D(lbt);
                int i = 1;
                ArrayList A0B = androidComposeViewAccessibilityDelegateCompat.A0B(C0s8.A11(lbt), AnonymousClass001.A1W(lbt.A04.A0D, KMW.A02));
                int A0I = JQy.A0I(A0B);
                if (1 <= A0I) {
                    while (true) {
                        int i2 = ((LBT) A0B.get(i - 1)).A02;
                        int i3 = ((LBT) A0B.get(i)).A02;
                        c2817JaQ.A03(i2, i3);
                        c2817JaQ2.A03(i3, i2);
                        if (i == A0I) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x0c5d, code lost:
    
        if (r0 == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x1611, code lost:
    
        if (X.11T.A0O(X.L5h.A02(r0, r0), true) != false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0bd9, code lost:
    
        if (r0.containsKey(X.KdW.A0A) != false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1437  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x149f  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x1130  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x114b  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x1212  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x122d  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1282  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x12a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0609  */
    /* JADX WARN: Type inference failed for: r0v445, types: [java.lang.Object, X.JaR, X.KTa] */
    /* JADX WARN: Type inference failed for: r342v1 */
    /* JADX WARN: Type inference failed for: r342v2 */
    /* JADX WARN: Type inference failed for: r342v3 */
    /* JADX WARN: Type inference failed for: r342v4 */
    /* JADX WARN: Type inference failed for: r342v6, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r342v7, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat A07(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r301, int r302) {
        /*
            Method dump skipped, instructions count: 6090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A07(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
    }

    public static final CharSequence A08(CharSequence charSequence) {
        int i = 100000;
        if (charSequence != null && charSequence.length() != 0 && charSequence.length() > 100000) {
            if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(LocationComponentCompassEngine.SENSOR_DELAY_MICROS))) {
                i = 99999;
            }
            charSequence = charSequence.subSequence(0, i);
            11T.A0I(charSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x023d, code lost:
    
        if (r314 == 0.0f) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String A09(X.LBT r302) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A09(X.LBT):java.lang.String");
    }

    public static final String A0A(LBT lbt) {
        Object A0E;
        String str = null;
        Lj1 lj1 = lbt.A05;
        L29 l29 = KdW.A02;
        Map map = lj1.A02;
        if (map.containsKey(l29)) {
            str = KV8.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, (List) lj1.A01(l29));
        } else {
            L29 l292 = KdW.A04;
            if (map.containsKey(l292)) {
                A0E = L5h.A02(lj1, l292);
            } else {
                List list = (List) L5h.A02(lj1, KdW.A0P);
                if (list != null) {
                    A0E = 0QD.A0E(list);
                }
            }
            Lie lie = (Lie) A0E;
            if (lie != null) {
                return lie.A00;
            }
        }
        return str;
    }

    private final ArrayList A0B(List list, boolean z) {
        JaS jaS = KZE.A00;
        JaS A01 = JaS.A01();
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0E(A01, JQz.A0Q(list, i), A0s);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        int A0I = JQy.A0I(A0s);
        int i2 = 0;
        if (A0I >= 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                LBT lbt = (LBT) A0s.get(i4);
                if (i4 != 0) {
                    float f = lbt.A04().A03;
                    float f2 = lbt.A04().A00;
                    boolean A1S = 1BL.A1S((f > f2 ? 1 : (f == f2 ? 0 : -1)));
                    int A0I2 = JQy.A0I(A0s2);
                    if (A0I2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            L5L l5l = (L5L) ((03Y) A0s2.get(i5)).first;
                            boolean A1S2 = 1BL.A1S((l5l.A03 > l5l.A00 ? 1 : (l5l.A03 == l5l.A00 ? 0 : -1)));
                            if (!A1S && !A1S2) {
                                float f3 = l5l.A03;
                                float max = Math.max(f, f3);
                                float f4 = l5l.A00;
                                if (max < Math.min(f2, f4)) {
                                    A0s2.set(i5, 1BK.A1G(new L5L(Math.max(l5l.A01, 0.0f), Math.max(f3, f), Math.min(l5l.A02, 1.0f / 0.0f), Math.min(f4, f2)), ((03Y) A0s2.get(i5)).second));
                                    ((List) ((03Y) A0s2.get(i5)).second).add(lbt);
                                    break;
                                }
                            }
                            if (i5 == A0I2) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
                7zU.A1Y(lbt.A04(), C0s8.A11(lbt), A0s2);
                if (i4 == A0I) {
                    break;
                }
                i3 = i4 + 1;
            }
        }
        0RC.A0y(A0s2, LsG.A00);
        ArrayList A0s3 = AnonymousClass001.A0s();
        int size2 = A0s2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            03Y r0 = (03Y) A0s2.get(i6);
            LsJ.A00(new G6f(LPQ.A0W, z ? LsF.A00 : LsE.A00, 0), (List) r0.second, 5);
            A0s3.addAll((Collection) r0.second);
        }
        LsJ.A00(M7s.A00, A0s3, 4);
        while (i2 <= JQy.A0I(A0s3)) {
            List list2 = (List) A01.A03(((LBT) A0s3.get(i2)).A02);
            if (list2 != null) {
                if (A0Q((LBT) A0s3.get(i2))) {
                    i2++;
                } else {
                    A0s3.remove(i2);
                }
                A0s3.addAll(i2, list2);
                i2 += list2.size();
            } else {
                i2++;
            }
        }
        return A0s3;
    }

    public static final void A0C(Bundle bundle, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, int i) {
        int i2;
        RectF rectF;
        C2817JaQ c2817JaQ;
        int i3;
        KgT kgT = (KgT) A06(androidComposeViewAccessibilityDelegateCompat).A03(i);
        if (kgT != null) {
            LBT lbt = kgT.A01;
            String A0A = A0A(lbt);
            float f = 0.0f / 0.0f;
            if (11T.A0O(str, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL")) {
                c2817JaQ = androidComposeViewAccessibilityDelegateCompat.A04;
            } else {
                if (!11T.A0O(str, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL")) {
                    Lj1 lj1 = lbt.A05;
                    L29 l29 = KdT.A08;
                    Map map = lj1.A02;
                    if (!map.containsKey(l29) || bundle == null || !11T.A0O(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                        L29 l292 = KdW.A0O;
                        if (!map.containsKey(l292) || bundle == null || !11T.A0O(str, "androidx.compose.ui.semantics.testTag")) {
                            if (11T.A0O(str, "androidx.compose.ui.semantics.id")) {
                                accessibilityNodeInfoCompat.A02.getExtras().putInt(str, lbt.A02);
                                return;
                            }
                            return;
                        } else {
                            String str2 = (String) L5h.A02(lj1, l292);
                            if (str2 != null) {
                                accessibilityNodeInfoCompat.A02.getExtras().putCharSequence(str, str2);
                                return;
                            }
                            return;
                        }
                    }
                    int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i5 > 0 && i4 >= 0) {
                        if (A0A != null) {
                            i2 = A0A.length();
                        } else {
                            i2 = (-1) >>> 1;
                            float f2 = 0.0f / 0.0f;
                        }
                        if (i4 < i2) {
                            L5R A01 = LD3.A01(lj1);
                            if (A01 != null) {
                                ArrayList A0s = AnonymousClass001.A0s();
                                int i6 = 0;
                                do {
                                    int i7 = i4 + i6;
                                    if (i7 >= A01.A04.A03.length()) {
                                        rectF = null;
                                    } else {
                                        L5L A04 = A01.A04(i7);
                                        rectF = null;
                                        AbstractC2938JdR A05 = lbt.A05();
                                        L5L A02 = A04.A02((A05 == null || !A05.A0P().A08) ? 0L : A05.BZC(0L));
                                        L5L A03 = lbt.A03();
                                        if (A02.A02 > A03.A01 && A03.A02 > A02.A01 && A02.A00 > A03.A03 && A03.A00 > A02.A03) {
                                            L5L A032 = A02.A03(A03);
                                            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0Q;
                                            long BZD = androidComposeView.BZD(KvH.A00(A032.A01, A032.A03));
                                            long BZD2 = androidComposeView.BZD(KvH.A00(A032.A02, A032.A00));
                                            rectF = new RectF(DKH.A00(BZD), JR1.A02(BZD), DKH.A00(BZD2), JR1.A02(BZD2));
                                        }
                                    }
                                    A0s.add(rectF);
                                    i6++;
                                } while (i6 < i5);
                                accessibilityNodeInfoCompat.A02.getExtras().putParcelableArray(str, (Parcelable[]) A0s.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                c2817JaQ = androidComposeViewAccessibilityDelegateCompat.A03;
            }
            int A022 = L4S.A02(c2817JaQ, i);
            if (A022 < 0 || (i3 = c2817JaQ.A03[A022]) == -1) {
                return;
            }
            accessibilityNodeInfoCompat.A02.getExtras().putInt(str, i3);
        }
    }

    public static final void A0D(AccessibilityEvent accessibilityEvent, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (A0L(androidComposeViewAccessibilityDelegateCompat)) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                androidComposeViewAccessibilityDelegateCompat.A0G = true;
            }
            try {
                androidComposeViewAccessibilityDelegateCompat.A0J.invoke(accessibilityEvent);
            } finally {
                androidComposeViewAccessibilityDelegateCompat.A0G = false;
            }
        }
    }

    private final void A0E(JaS jaS, LBT lbt, ArrayList arrayList) {
        boolean A1W = AnonymousClass001.A1W(lbt.A04.A0D, KMW.A02);
        Object obj = lbt.A05.A02.get(KdW.A0E);
        if (obj == null) {
            obj = 1BK.A0d();
        }
        boolean A1V = AnonymousClass001.A1V(obj);
        if (A1V || A0Q(lbt)) {
            Kuh A06 = A06(this);
            int i = lbt.A02;
            if (A06.A05(i)) {
                arrayList.add(lbt);
            }
            if (A1V) {
                jaS.A08(i, A0B(7zO.A10(lbt.A08(!lbt.A06, false), 0), A1W));
                return;
            }
        }
        List A08 = lbt.A08(!lbt.A06, false);
        int size = A08.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0E(jaS, JQz.A0Q(A08, i2), arrayList);
        }
    }

    public static final void A0F(LPQ lpq, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0U.add(lpq)) {
            androidComposeViewAccessibilityDelegateCompat.A0W.D5N(04S.A00);
        }
    }

    public static final void A0G(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        KlH klH = androidComposeViewAccessibilityDelegateCompat.A09;
        if (klH != null) {
            int i2 = klH.A05.A02;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - klH.A04 <= 1000) {
                AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i2), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                A04.setFromIndex(klH.A01);
                A04.setToIndex(klH.A03);
                A04.setAction(klH.A00);
                A04.setMovementGranularity(klH.A02);
                A04.getText().add(A0A(klH.A05));
                A0D(A04, androidComposeViewAccessibilityDelegateCompat);
            }
        }
        androidComposeViewAccessibilityDelegateCompat.A09 = null;
    }

    public static final void A0H(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LPW lpw) {
        if (lpw.A05.contains(lpw)) {
            androidComposeViewAccessibilityDelegateCompat.A0Q.A0g.A00(lpw, new JR6(androidComposeViewAccessibilityDelegateCompat, lpw, 9), androidComposeViewAccessibilityDelegateCompat.A0V);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0148, code lost:
    
        A0F(r303.A04, r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0154, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0I(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r301, X.KgS r302, X.LBT r303) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0I(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, X.KgS, X.LBT):void");
    }

    public static final void A0J(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Integer num, List list, int i, int i2) {
        if (i == ((-1) << (-1)) || !A0L(androidComposeViewAccessibilityDelegateCompat)) {
            return;
        }
        AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, i, i2);
        if (num != null) {
            A04.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            A04.setContentDescription(KV8.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        }
        0Z9.A01("sendEvent", -1657607598);
        try {
            A0D(A04, androidComposeViewAccessibilityDelegateCompat);
            0Z9.A00(-90792937);
        } catch (Throwable th) {
            0Z9.A00(-1109672564);
            throw th;
        }
    }

    public static final void A0K(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i, int i2) {
        AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i), 32);
        A04.setContentChangeTypes(i2);
        if (str != null) {
            A04.getText().add(str);
        }
        A0D(A04, androidComposeViewAccessibilityDelegateCompat);
    }

    public static final boolean A0L(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        return androidComposeViewAccessibilityDelegateCompat.A0N.isEnabled() && 1BK.A1Y(androidComposeViewAccessibilityDelegateCompat.A0D);
    }

    public static final boolean A0M(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LBT lbt, int i, int i2, boolean z) {
        Integer num;
        Lj1 lj1 = lbt.A05;
        L29 l29 = KdT.A0M;
        boolean z2 = false;
        if (Lj1.A00(lj1, l29) && KUn.A00(lbt)) {
            C0Bd c0Bd = (C0Bd) ((L3v) lj1.A01(l29)).A01;
            if (c0Bd != null) {
                z2 = AnonymousClass001.A1V(c0Bd.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z)));
            }
        } else {
            if (i == i2 && i2 == androidComposeViewAccessibilityDelegateCompat.A00) {
                return false;
            }
            String A0A = A0A(lbt);
            if (A0A != null) {
                if (i < 0 || i != i2 || i2 > A0A.length()) {
                    i = -1;
                }
                androidComposeViewAccessibilityDelegateCompat.A00 = i;
                int length = A0A.length();
                if (length > 0) {
                    z2 = true;
                }
                int i3 = lbt.A02;
                int A00 = A00(androidComposeViewAccessibilityDelegateCompat, i3);
                Integer num2 = null;
                if (z2) {
                    num = Integer.valueOf(i);
                    num2 = Integer.valueOf(length);
                } else {
                    num = null;
                }
                A0D(A05(androidComposeViewAccessibilityDelegateCompat, A0A, num, num, num2, A00), androidComposeViewAccessibilityDelegateCompat);
                A0G(androidComposeViewAccessibilityDelegateCompat, i3);
                return true;
            }
        }
        return z2;
    }

    public static final boolean A0N(Kpf kpf) {
        C00m c00m = kpf.A01;
        if (JQy.A02(c00m) <= 0.0f || kpf.A02) {
            return JQy.A02(c00m) < JQy.A02(kpf.A00) && kpf.A02;
        }
        return true;
    }

    public static final boolean A0O(Kpf kpf) {
        C00m c00m = kpf.A01;
        if (JQy.A02(c00m) >= JQy.A02(kpf.A00) || kpf.A02) {
            return JQy.A02(c00m) > 0.0f && kpf.A02;
        }
        return true;
    }

    public static final boolean A0P(Kpf kpf, float f) {
        if (f >= 0.0f || JQy.A02(kpf.A01) <= 0.0f) {
            return f > 0.0f && JQy.A02(kpf.A01) < JQy.A02(kpf.A00);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (A0R(r302) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0Q(X.LBT r302) {
        /*
            r301 = this;
            r0 = r302
            X.Lj1 r0 = r0.A05
            r303 = r0
            X.L29 r0 = X.KdW.A02
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = X.L5h.A01(r0, r1)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L57
            X.L29 r0 = X.KdW.A04
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = X.L5h.A02(r0, r1)
            r306 = r0
            r0 = r306
            r307 = r0
            X.L29 r0 = X.KdW.A0P
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = X.L5h.A01(r0, r1)
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L37
            r0 = r304
            r307 = r0
        L37:
            r0 = r307
            if (r0 != 0) goto L57
            r0 = r301
            r1 = r302
            java.lang.String r0 = r0.A09(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L57
            r0 = r302
            boolean r0 = A0R(r0)
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = 0
            r307 = r0
            r0 = r308
            if (r0 == 0) goto L5a
        L57:
            r0 = 1
            r309 = r0
        L5a:
            r0 = r303
            boolean r0 = r0.A01
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L75
            r0 = r302
            boolean r0 = r0.A09()
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L78
            r0 = r309
            if (r0 == 0) goto L78
        L75:
            r0 = 1
            r305 = r0
        L78:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0Q(X.LBT):boolean");
    }

    public static final boolean A0R(LBT lbt) {
        Lj1 lj1 = lbt.A05;
        Object A02 = L5h.A02(lj1, KdW.A0S);
        ExZ exZ = (ExZ) L5h.A02(lj1, KdW.A0K);
        boolean A1T = AnonymousClass001.A1T(A02);
        if (L5h.A02(lj1, KdW.A0M) == null) {
            return A1T;
        }
        if (exZ == null || exZ.A00 != 4) {
            return true;
        }
        return A1T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v2, types: [java.util.AbstractCollection] */
    public static final boolean A0S(List list) {
        List list2;
        Object A0D;
        if (list.size() >= 2) {
            if (list.size() == 0 || list.size() == 1) {
                list2 = C0ty.A00;
            } else {
                list2 = AnonymousClass001.A0s();
                Object obj = list.get(0);
                int A04 = AnonymousClass001.A04(list);
                int i = 0;
                while (i < A04) {
                    i++;
                    Object obj2 = list.get(i);
                    LBT lbt = (LBT) obj2;
                    LBT lbt2 = (LBT) obj;
                    list2.add(new LE0(KvH.A00(DKC.A01(DKH.A00(lbt2.A03().A00()), DKH.A00(lbt.A03().A00())), DKC.A01(JR1.A02(lbt2.A03().A00()), JR1.A02(lbt.A03().A00())))));
                    obj = obj2;
                }
            }
            if (list2.size() == 1) {
                A0D = 0QD.A0D(list2);
            } else {
                if (list2.isEmpty()) {
                    throw AnonymousClass001.A0q(AbE.A00(266));
                }
                A0D = 0QD.A0D(list2);
                int A042 = AnonymousClass001.A04(list2);
                if (1 <= A042) {
                    int i2 = 1;
                    while (true) {
                        int i3 = i2;
                        A0D = new LE0(LE0.A04(((LE0) A0D).A00, ((LE0) list2.get(i3)).A00));
                        if (i3 == A042) {
                            break;
                        }
                        i2 = i3 + 1;
                    }
                }
            }
            long j = ((LE0) A0D).A00;
            if (JR1.A02(j) >= DKH.A00(j)) {
                return false;
            }
        }
        return true;
    }

    public 0TD A0b(View view) {
        return this.A0I;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v0 ??, still in use, count: 2, list:
          (r314v0 ??) from 0x00ff: PHI (r314v2 ??) = (r314v0 ??), (r314v1 ??), (r314v1 ??), (r314v4 ??) binds: [B:207:0x00f4, B:29:0x013f, B:183:0x03f3, B:14:0x00fa] A[DONT_GENERATE, DONT_INLINE]
          (r314v0 ?? I:X.JaT) from 0x00e2: INVOKE (r314v0 ?? I:X.JaT), (r0v23 ?? I:int) STATIC call: X.JaT.A01(X.JaT, int):void A[Catch: all -> 0x040b]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x03f3 -> B:15:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x013f -> B:15:0x00ff). Please report as a decompilation issue!!! */
    public final java.lang.Object A0c(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v0 ??, still in use, count: 2, list:
          (r314v0 ??) from 0x00ff: PHI (r314v2 ??) = (r314v0 ??), (r314v1 ??), (r314v1 ??), (r314v4 ??) binds: [B:207:0x00f4, B:29:0x013f, B:183:0x03f3, B:14:0x00fa] A[DONT_GENERATE, DONT_INLINE]
          (r314v0 ?? I:X.JaT) from 0x00e2: INVOKE (r314v0 ?? I:X.JaT), (r0v23 ?? I:int) STATIC call: X.JaT.A01(X.JaT, int):void A[Catch: all -> 0x040b]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public final boolean A0d(int i, long j, boolean z) {
        boolean z2;
        Kpf kpf;
        if (JQy.A1Y(Looper.getMainLooper())) {
            Kuh A06 = A06(this);
            if (j != 9205357640488583168L && LE0.A09(j)) {
                L29 l29 = z ? KdW.A0U : KdW.A08;
                Object[] objArr = A06.A04;
                long[] jArr = A06.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    z2 = false;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((JQy.A0L(j2) & (-9187201950435737472L)) != -9187201950435737472L) {
                            int A08 = 8 - JQx.A08(i2, length);
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= A08) {
                                    break;
                                }
                                if ((j2 & 255) < 128) {
                                    KgT kgT = (KgT) JQx.A0t(objArr, i2, i4);
                                    Rect rect = kgT.A00;
                                    float f = rect.left;
                                    float f2 = rect.top;
                                    float f3 = rect.right;
                                    float f4 = rect.bottom;
                                    float A00 = DKH.A00(j);
                                    if (A00 >= f && A00 < f3) {
                                        float A02 = JR1.A02(j);
                                        if (A02 >= f2 && A02 < f4 && (kpf = (Kpf) L5h.A02(kgT.A01.A05, l29)) != null) {
                                            boolean z3 = kpf.A02;
                                            int i5 = i;
                                            if (z3) {
                                                i5 = -i;
                                            }
                                            if (!(i == 0 && z3) && i5 >= 0) {
                                                if (JQy.A02(kpf.A01) >= JQy.A02(kpf.A00)) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (JQy.A02(kpf.A01) <= 0.0f) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                                j2 >>= 8;
                                i3 = i4 + 1;
                            }
                            if (A08 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                    return z2;
                }
            }
        }
        z2 = false;
        return z2;
    }
}
