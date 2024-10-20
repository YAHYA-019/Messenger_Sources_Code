package androidx.compose.ui.platform;

import X.04S;
import X.0DE;
import X.0FI;
import X.0Pz;
import X.0Z9;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.7zU;
import X.AQz;
import X.AnonymousClass001;
import X.C00m;
import X.C05s;
import X.C0Ad;
import X.C14m;
import X.C1A9;
import X.C1ol;
import X.C2818Jaa;
import X.C2877Jbx;
import X.C2889JcD;
import X.C2897Jch;
import X.C2926JdE;
import X.C2937JdQ;
import X.DKC;
import X.DKH;
import X.FXu;
import X.GCK;
import X.GOn;
import X.GOp;
import X.JQx;
import X.JQy;
import X.JQz;
import X.JR0;
import X.JR1;
import X.JXv;
import X.JY0;
import X.JY4;
import X.JYL;
import X.JaX;
import X.KMW;
import X.KUo;
import X.KUp;
import X.KUr;
import X.KV1;
import X.KV5;
import X.KZZ;
import X.KZq;
import X.Kdh;
import X.Kdi;
import X.Kdn;
import X.Kdo;
import X.KgO;
import X.KgR;
import X.KgU;
import X.KgY;
import X.KiV;
import X.Kmi;
import X.Kp7;
import X.KqC;
import X.KqP;
import X.Kqb;
import X.KsG;
import X.KsI;
import X.KsL;
import X.Ktp;
import X.KuF;
import X.Kuj;
import X.KvA;
import X.KvG;
import X.KvH;
import X.KvL;
import X.KvP;
import X.Kx6;
import X.KzP;
import X.L0x;
import X.L1t;
import X.L1u;
import X.L3H;
import X.L3O;
import X.L3g;
import X.L56;
import X.L5L;
import X.L7Z;
import X.L7i;
import X.L9A;
import X.LBd;
import X.LC6;
import X.LCW;
import X.LD0;
import X.LE6;
import X.LKj;
import X.LKs;
import X.LKt;
import X.LNq;
import X.LO7;
import X.LOB;
import X.LOI;
import X.LOM;
import X.LON;
import X.LOZ;
import X.LOa;
import X.LOg;
import X.LOh;
import X.LOk;
import X.LPQ;
import X.LPR;
import X.LPU;
import X.LPV;
import X.LPa;
import X.LPb;
import X.LPe;
import X.LPf;
import X.LPh;
import X.LPi;
import X.LPo;
import X.LPr;
import X.LPu;
import X.LQ4;
import X.Ljr;
import X.LtK;
import X.M0Q;
import X.M0R;
import X.M0s;
import X.M0u;
import X.M11;
import X.M3K;
import X.M5B;
import X.M5J;
import X.M5K;
import X.M5L;
import X.M6m;
import X.M9F;
import X.MBZ;
import X.MBe;
import X.MBf;
import X.MBg;
import X.MBh;
import X.MBl;
import X.MEE;
import X.MEH;
import X.MEJ;
import X.MEM;
import X.MEN;
import X.MET;
import X.MJP;
import X.MKS;
import X.ML3;
import X.MLE;
import X.MLj;
import X.MN3;
import X.MN4;
import X.MNF;
import X.MNh;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AndroidComposeView.class */
public final class AndroidComposeView extends ViewGroup implements MNF, DefaultLifecycleObserver, MEN, MBe {
    public static Class A1G;
    public static Method A1H;
    public long A00;
    public long A01;
    public long A02;
    public MotionEvent A03;
    public AndroidContentCaptureManager A04;
    public 0DE A05;
    public Function1 A06;
    public Function1 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public JY4 A0F;
    public JY0 A0G;
    public Constraints A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final MN4 A0O;
    public final MN4 A0P;
    public final MN4 A0Q;
    public final MN4 A0R;
    public final MEE A0S;
    public final LtK A0T;
    public final KiV A0U;
    public final Kdh A0V;
    public final GCK A0W;
    public final MJP A0X;
    public final MEJ A0Y;
    public final MBZ A0Z;
    public final LOh A0a;
    public final MEM A0b;
    public final L7i A0c;
    public final LPQ A0d;
    public final LOa A0e;
    public final LE6 A0f;
    public final Kqb A0g;
    public final Kdn A0h;
    public final Kdo A0i;
    public final Ljr A0j;
    public final AndroidComposeViewAccessibilityDelegateCompat A0k;
    public final MET A0l;
    public final MBf A0m;
    public final MBg A0n;
    public final MKS A0o;
    public final KzP A0p;
    public final Kp7 A0q;
    public final MBh A0r;
    public final KgY A0s;
    public final float[] A0t;
    public final float[] A0u;
    public final ViewTreeObserver.OnGlobalLayoutListener A0v;
    public final ViewTreeObserver.OnScrollChangedListener A0w;
    public final ViewTreeObserver.OnTouchModeChangeListener A0x;
    public final MLj A0y;
    public final MLj A0z;
    public final Kdi A10;
    public final KqP A11;
    public final KqC A12;
    public final MBe A13;
    public final FXu A14;
    public final KgU A15;
    public final LPi A16;
    public final EmptySemanticsElement A17;
    public final C2897Jch A18;
    public final LPu A19;
    public final Runnable A1A;
    public final List A1B;
    public final AtomicReference A1C;
    public final C00m A1D;
    public final float[] A1E;
    public final int[] A1F;

    /* JADX WARN: Type inference failed for: r0v17, types: [X.LPR, X.Jch] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.ui.semantics.EmptySemanticsElement, X.MLj] */
    public AndroidComposeView(Context context, 0DE r303) {
        super(context);
        this.A0E = 9205357640488583168L;
        this.A0N = true;
        LPi lPi = null;
        this.A0e = new LOa((LOZ) null, (DefaultConstructorMarker) null, 1);
        LQ4 A00 = KV5.A00(context);
        LNq lNq = LNq.A00;
        this.A0P = LO7.A02(lNq, A00, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        ?? lpr = new LPR();
        this.A18 = lpr;
        ?? emptySemanticsElement = new EmptySemanticsElement(lpr);
        this.A17 = emptySemanticsElement;
        this.A0X = new LOI(new M0R(this, 2), new M0R(this, 3), new M9F(this, 0), new M0s(this, 0), new M0s(this, 1), new M0u(this, 0));
        FXu fXu = new FXu(new M11(this, 0));
        this.A14 = fXu;
        this.A05 = r303;
        this.A0W = fXu;
        this.A0p = new KzP();
        LOB keyInputElement = new KeyInputElement(M6m.A00(this, 25));
        this.A0y = keyInputElement;
        LOB rotaryInputElement = new RotaryInputElement(M5L.A00);
        this.A0z = rotaryInputElement;
        this.A10 = new Kdi();
        LPQ lpq = new LPQ(false, KZq.A00.addAndGet(1));
        lpq.Cr3(C2937JdQ.A00);
        lpq.Co4((MNh) this.A0P.getValue());
        lpq.CrI(emptySemanticsElement.D4B(rotaryInputElement).D4B(keyInputElement).D4B(this.A0X.A02).D4B(fXu.A01));
        this.A0d = lpq;
        this.A13 = this;
        this.A0q = new Kp7(lpq, lpr);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.A0k = androidComposeViewAccessibilityDelegateCompat;
        this.A04 = new AndroidContentCaptureManager(this, new M0Q(this));
        this.A0h = new Kdn(context);
        this.A0Y = new LON(this);
        this.A0V = new Kdh();
        this.A1B = AnonymousClass001.A0s();
        this.A11 = new KqP();
        this.A12 = new KqC(this.A0d);
        this.A06 = M5J.A00;
        this.A0U = new KiV(this, this.A0V);
        this.A0i = new Kdo(context);
        this.A0g = new Kqb(M6m.A00(this, 26));
        this.A0f = new LE6(this.A0d);
        this.A0o = new LPh(ViewConfiguration.get(context));
        int i = (-1) >>> 1;
        this.A0D = JR1.A0S(i, i);
        this.A1F = new int[]{0, 0};
        float[] A04 = LBd.A04();
        this.A1E = A04;
        this.A0t = LBd.A04();
        this.A0u = LBd.A04();
        this.A00 = -1;
        this.A02 = 9187343241974906880L;
        this.A0L = true;
        this.A0O = KvA.A01((Object) null);
        this.A0S = new C2877Jbx(null, M3K.A00(this, 45));
        this.A0v = new LKj(this, 4);
        this.A0w = new LKs(this, 0);
        this.A0x = new LKt(this);
        LPu lPu = new LPu(this, this);
        this.A19 = lPu;
        this.A0s = new KgY((MBl) Kx6.A00.invoke(lPu));
        this.A1C = GOn.A1L((Object) null);
        this.A0m = new LPe(this.A0s);
        this.A0r = new LPo(context);
        AndroidFontLoader androidFontLoader = new AndroidFontLoader(context);
        int i2 = Build.VERSION.SDK_INT;
        FontFamilyResolverImpl fontFamilyResolverImpl = new FontFamilyResolverImpl(androidFontLoader, new LPr(i2 >= 31 ? KV1.A00(context) : 0));
        11T.A0I(lNq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        this.A0Q = new ParcelableSnapshotMutableState(lNq, fontFamilyResolverImpl);
        this.A0C = i2 >= 31 ? 4YU.A0B(context).fontWeightAdjustment : 0;
        int layoutDirection = 4YU.A0B(context).getLayoutDirection();
        this.A0R = KvA.A01(layoutDirection != 0 ? layoutDirection != 1 ? KMW.A01 : KMW.A02 : KMW.A01);
        this.A0Z = new LOg(this);
        this.A0a = new LOh(M6m.A00(this, 22), GOp.A02(isInTouchMode() ? 1 : 0));
        this.A0c = new L7i(this);
        this.A0n = new LPf(this);
        this.A15 = new KgU();
        this.A0T = LtK.A02(new C00m[16]);
        this.A0j = new Ljr(this);
        this.A1A = new Runnable() { // from class: X.Ljq
            public static final String __redex_internal_original_name = "AndroidComposeView$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.A08 = false;
                MotionEvent motionEvent = androidComposeView.A03;
                11T.A0D(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw AnonymousClass001.A0N("The ACTION_HOVER_EXIT event was not cleared.");
                }
                AndroidComposeView.A01(motionEvent, androidComposeView);
            }
        };
        this.A1D = M3K.A00(this, 44);
        this.A0l = (MET) (i2 < 29 ? new LPb(A04) : new LPa());
        addOnAttachStateChangeListener(this.A04);
        setWillNotDraw(false);
        setFocusable(true);
        setFocusable(1);
        setDefaultFocusHighlightEnabled(false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C0Ad.A0B(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(fXu);
        this.A0d.A0Y(this);
        if (i2 >= 29) {
            KUo.A00(this);
            if (i2 >= 31) {
                lPi = new LPi();
            }
        }
        this.A16 = lPi;
        this.A0b = new LOk(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x02d1, code lost:
    
        if (r328 != r0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
    
        if (r0.getToolType(0) != 3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A00(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A00(android.view.MotionEvent):int");
    }

    public static final int A01(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        Object obj;
        if (androidComposeView.A0M) {
            androidComposeView.A0M = false;
            KzP.A01.Cvx(new KsL(motionEvent.getMetaState()));
        }
        KqP kqP = androidComposeView.A11;
        KgO A00 = kqP.A00(motionEvent, androidComposeView);
        if (A00 == null) {
            KqC kqC = androidComposeView.A12;
            if (kqC.A00) {
                return 0;
            }
            kqC.A02.A00.A07();
            Kuj kuj = kqC.A01.A01;
            kuj.A00();
            kuj.A00.A06();
            return 0;
        }
        List list = A00.A01;
        int A04 = AnonymousClass001.A04(list);
        if (A04 >= 0) {
            while (true) {
                int i = A04 - 1;
                obj = list.get(A04);
                if (!((Ktp) obj).A0A) {
                    if (i < 0) {
                        break;
                    }
                    A04 = i;
                } else {
                    break;
                }
            }
        }
        obj = null;
        Ktp ktp = (Ktp) obj;
        if (ktp != null) {
            androidComposeView.A0E = ktp.A04;
        }
        int A002 = androidComposeView.A12.A00(A00, androidComposeView, androidComposeView.A0G(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && (A002 & 1) == 0) {
            int A0F = JQx.A0F(motionEvent);
            kqP.A03.delete(A0F);
            kqP.A04.delete(A0F);
        }
        return A002;
    }

    private final long A02(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != ((-1) << (-1))) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw JQx.A0o();
                }
                long j = size;
                return j | (j << 32);
            }
            size = (-1) >>> 1;
        }
        return size | (0 << 32);
    }

    private final View A03(View view, int i) {
        View view2;
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (11T.A0O(AnonymousClass001.A0S(view, declaredMethod), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    view2 = A03(viewGroup.getChildAt(i2), i);
                    if (view2 != null) {
                        break;
                    }
                }
            }
        }
        view2 = null;
        return view2;
    }

    public static final L3g A04(int i) {
        int i2;
        if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 1;
        } else if (i == 17) {
            i2 = 3;
        } else if (i == 33) {
            i2 = 5;
        } else if (i == 66) {
            i2 = 4;
        } else {
            if (i != 130) {
                return null;
            }
            i2 = 6;
        }
        return new L3g(i2);
    }

    public static final L5L A05(AndroidComposeView androidComposeView) {
        if (androidComposeView.isFocused()) {
            C2889JcD A00 = L9A.A00(androidComposeView.A0X.A01);
            if (A00 != null) {
                return L9A.A02(A00);
            }
            return null;
        }
        View findFocus = androidComposeView.findFocus();
        if (findFocus == null) {
            return null;
        }
        int[] iArr = KZZ.A00;
        findFocus.getLocationInWindow(iArr);
        float A0M = JQx.A0M(iArr);
        return new L5L(A0M, iArr[1], A0M + DKC.A02(findFocus), iArr[1] + DKC.A03(findFocus));
    }

    public static final void A06(MotionEvent motionEvent, AndroidComposeView androidComposeView, int i, long j, boolean z) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (1BL.A1S(i3) ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i4 = 0; i4 < pointerCount; i4++) {
                pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
            }
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 >= pointerCount) {
                    break;
                }
                if (i3 >= 0) {
                    i2 = 1;
                    if (i7 >= i3) {
                        int i8 = i2 + i7;
                        motionEvent.getPointerProperties(i8, pointerPropertiesArr[i7]);
                        MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
                        motionEvent.getPointerCoords(i8, pointerCoords);
                        long BZD = androidComposeView.BZD(KvH.A00(pointerCoords.x, pointerCoords.y));
                        pointerCoords.x = DKH.A00(BZD);
                        pointerCoords.y = JR1.A02(BZD);
                        i6 = i7 + 1;
                    }
                }
                i2 = 0;
                int i82 = i2 + i7;
                motionEvent.getPointerProperties(i82, pointerPropertiesArr[i7]);
                MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr[i7];
                motionEvent.getPointerCoords(i82, pointerCoords2);
                long BZD2 = androidComposeView.BZD(KvH.A00(pointerCoords2.x, pointerCoords2.y));
                pointerCoords2.x = DKH.A00(BZD2);
                pointerCoords2.y = JR1.A02(BZD2);
                i6 = i7 + 1;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            KgO A00 = androidComposeView.A11.A00(obtain, androidComposeView);
            11T.A0D(A00);
            androidComposeView.A12.A00(A00, androidComposeView, true);
            obtain.recycle();
        }
    }

    private final void A07(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).Bvx();
            } else if (childAt instanceof ViewGroup) {
                A07((ViewGroup) childAt);
            }
            i = i2 + 1;
        }
    }

    private final void A08(LPQ lpq) {
        lpq.A0M();
        LtK A0D = lpq.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                A08((LPQ) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    private final void A09(LPQ lpq) {
        int i = 0;
        this.A0f.A0C(lpq, false);
        LtK A0D = lpq.A0D();
        int i2 = A0D.A00;
        if (i2 > 0) {
            Object[] objArr = A0D.A02;
            do {
                A09((LPQ) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r302.A0B != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r0 = r301.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r0 = ((X.L56) r0.A0T.A06).A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (androidx.compose.ui.unit.Constraints.A0B(r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (androidx.compose.ui.unit.Constraints.A0A(r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r301 != r302.A0d) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r302.requestLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r301 = r301.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r301 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r302.getWidth() == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r302.getHeight() == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        r302.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r301 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r301.A0R.A0J.A09 != X.0S2.A00) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0A(X.LPQ r301, androidx.compose.ui.platform.AndroidComposeView r302) {
        /*
            r0 = r302
            boolean r0 = r0.isLayoutRequested()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L75
            r0 = r302
            boolean r0 = r0.isAttachedToWindow()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L75
            r0 = r301
            if (r0 == 0) goto L82
        L16:
            r0 = r301
            X.L3O r0 = r0.A0R
            X.JdE r0 = r0.A0J
            java.lang.Integer r0 = r0.A09
            r304 = r0
            java.lang.Integer r0 = X.0S2.A00
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L65
            r0 = r302
            boolean r0 = r0.A0B
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L76
            r0 = r301
            X.LPQ r0 = r0.A0E()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L65
            r0 = r305
            X.LDS r0 = r0.A0T
            X.Je7 r0 = r0.A06
            r305 = r0
            r0 = r305
            long r0 = r0.A04
            r306 = r0
            r0 = r306
            boolean r0 = androidx.compose.ui.unit.Constraints.A0B(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L76
            r0 = r306
            boolean r0 = androidx.compose.ui.unit.Constraints.A0A(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L76
        L65:
            r0 = r302
            X.LPQ r0 = r0.A0d
            r305 = r0
            r0 = r301
            r1 = r305
            if (r0 != r1) goto L82
        L71:
            r0 = r302
            r0.requestLayout()
        L75:
            return
        L76:
            r0 = r301
            X.LPQ r0 = r0.A0E()
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L65
            goto L16
        L82:
            r0 = r302
            int r0 = r0.getWidth()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L71
            r0 = r302
            int r0 = r0.getHeight()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L71
            r0 = r302
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A0A(X.LPQ, androidx.compose.ui.platform.AndroidComposeView):void");
    }

    public static final void A0B(AndroidComposeView androidComposeView) {
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            super.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.view.View] */
    public static final void A0C(AndroidComposeView androidComposeView) {
        if (androidComposeView.A0J) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != androidComposeView.A00) {
            androidComposeView.A00 = currentAnimationTimeMillis;
            MET met = androidComposeView.A0l;
            float[] fArr = androidComposeView.A0t;
            met.ADJ(androidComposeView, fArr);
            KUp.A00(fArr, androidComposeView.A0u);
            ViewParent parent = androidComposeView.getParent();
            AndroidComposeView androidComposeView2 = androidComposeView;
            while (parent instanceof ViewGroup) {
                androidComposeView2 = (View) parent;
                parent = androidComposeView2.getParent();
            }
            int[] iArr = androidComposeView.A1F;
            androidComposeView2.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            androidComposeView2.getLocationInWindow(iArr);
            androidComposeView.A02 = KvH.A00(f - iArr[0], f2 - iArr[1]);
        }
    }

    public static final void A0D(AndroidComposeView androidComposeView) {
        int[] iArr = androidComposeView.A1F;
        androidComposeView.getLocationOnScreen(iArr);
        long j = androidComposeView.A0D;
        int A0C = JQz.A0C(j);
        int A0I = JR0.A0I(j);
        boolean z = false;
        int i = iArr[0];
        if (A0C != i || A0I != iArr[1]) {
            androidComposeView.A0D = JR1.A0S(i, iArr[1]);
            int i2 = (-1) >>> 1;
            if (A0C != i2 && A0I != i2) {
                androidComposeView.A0d.A0R.A0J.A0M();
                z = true;
            }
        }
        LE6 le6 = androidComposeView.A0f;
        if (z) {
            L1u l1u = le6.A06;
            LPQ lpq = le6.A05;
            LtK ltK = l1u.A01;
            ltK.A06();
            ltK.A0C(lpq);
            lpq.A0J = true;
        }
        le6.A06.A01();
    }

    public static final boolean A0E() {
        boolean z = false;
        try {
            Object obj = null;
            if (A1G == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                A1G = cls;
                A1H = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = A1H;
            if (method != null) {
                obj = method.invoke(null, "debug.layout", false);
            }
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
        } catch (Exception unused) {
        }
        return z;
    }

    private final boolean A0G(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= DKC.A02(this) && 0.0f <= y && y <= DKC.A03(this);
    }

    private final boolean A0H(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z = true;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A03) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
            z = false;
        }
        return z;
    }

    public static final boolean A0I(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z = false;
                        int pointerCount = motionEvent.getPointerCount();
                        int i = 1;
                        while (true) {
                            int i2 = i;
                            if (i2 >= pointerCount) {
                                break;
                            }
                            float x2 = motionEvent.getX(i2);
                            if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
                                float y2 = motionEvent.getY(i2);
                                if (Float.isInfinite(y2) || Float.isNaN(y2) || (Build.VERSION.SDK_INT >= 29 && !KUr.A00(motionEvent, i2))) {
                                    break;
                                }
                                i = i2 + 1;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        z = true;
        return z;
    }

    public static final boolean A0J(L3g l3g, L5L l5l, AndroidComposeView androidComposeView) {
        Integer A00;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((l3g == null || (A00 = KvG.A00(l3g.A00)) == null) ? 130 : A00.intValue(), l5l != null ? JQy.A0N(l5l) : null);
    }

    public final JY4 A0K() {
        if (this.A0F == null) {
            JY4 jy4 = new JY4(getContext());
            this.A0F = jy4;
            addView((View) jy4, -1);
            requestLayout();
        }
        JY4 jy42 = this.A0F;
        11T.A0D(jy42);
        return jy42;
    }

    public final void A0L(ML3 ml3) {
        if (this.A0G != null) {
            boolean z = JXv.A0G;
        }
        KgU kgU = this.A15;
        while (true) {
            ReferenceQueue referenceQueue = kgU.A01;
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                kgU.A00.A0C(new WeakReference(ml3, referenceQueue));
                return;
            }
            kgU.A00.A0E(poll);
        }
    }

    public final void A0M(ML3 ml3, boolean z) {
        List list;
        boolean z2 = this.A0K;
        if (z) {
            if (z2) {
                list = this.A0I;
                if (list == null) {
                    list = AnonymousClass001.A0s();
                    this.A0I = list;
                }
            } else {
                list = this.A1B;
            }
            list.add(ml3);
            return;
        }
        if (z2) {
            return;
        }
        this.A1B.remove(ml3);
        List list2 = this.A0I;
        if (list2 != null) {
            list2.remove(ml3);
        }
    }

    public final boolean A0N() {
        LPi lPi;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 31 && (lPi = this.A16) != null) {
            z = lPi.A02();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ML3 AJz(GraphicsLayer graphicsLayer, C00m c00m, Function2 function2) {
        Object obj;
        LPV jXv;
        ViewGroup viewGroup;
        if (graphicsLayer != null) {
            return new LPV((MEJ) null, graphicsLayer, this, c00m, function2);
        }
        KgU kgU = this.A15;
        while (true) {
            Reference poll = kgU.A01.poll();
            if (poll == null) {
                break;
            }
            kgU.A00.A0E(poll);
        }
        while (true) {
            LtK ltK = kgU.A00;
            int i = ltK.A00;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) ltK.A05(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        ML3 ml3 = (ML3) obj;
        if (ml3 != null) {
            ml3.Cib(c00m, function2);
            return ml3;
        }
        if (!isHardwareAccelerated() || Build.VERSION.SDK_INT == 28) {
            if (isHardwareAccelerated() && this.A0L) {
                try {
                    return new LPU(this, c00m, function2);
                } catch (Throwable unused) {
                    this.A0L = false;
                }
            }
            if (this.A0G == null) {
                Kmi kmi = JXv.A0J;
                if (!JXv.A0G) {
                    kmi.A00(new View(getContext()));
                }
                boolean z = JXv.A0H;
                Context context = getContext();
                if (z) {
                    viewGroup = new ViewGroup(context);
                    viewGroup.setClipChildren(false);
                    viewGroup.setTag(2131364482, AnonymousClass001.A0K());
                } else {
                    viewGroup = new ViewGroup(context);
                    viewGroup.setClipChildren(false);
                    viewGroup.setTag(2131364482, AnonymousClass001.A0K());
                }
                this.A0G = viewGroup;
                addView(viewGroup, -1);
            }
            boolean z2 = JXv.A0G;
            JY0 jy0 = this.A0G;
            11T.A0D(jy0);
            jXv = new JXv(this, jy0, c00m, function2);
        } else {
            MEJ mej = this.A0Y;
            jXv = new LPV(mej, mej.AJq(), this, c00m, function2);
        }
        return (ML3) jXv;
    }

    public long BZD(long j) {
        A0C(this);
        long A00 = LBd.A00(this.A0t, j);
        float A002 = DKH.A00(A00);
        long j2 = this.A02;
        return KvH.A00(A002 + DKH.A00(j2), JR1.A02(A00) + JR1.A02(j2));
    }

    public void Be0(boolean z) {
        LE6 le6 = this.A0f;
        if ((!L1t.A00(le6.A04)) || le6.A06.A01.A00 != 0) {
            0Z9.A01("AndroidOwner:measureAndLayout", 767398991);
            C00m c00m = null;
            if (z) {
                try {
                    c00m = this.A1D;
                } catch (Throwable th) {
                    0Z9.A00(1535746549);
                    throw th;
                }
            }
            if (le6.A0D(c00m)) {
                requestLayout();
            }
            le6.A06.A01();
            0Z9.A00(-969295948);
        }
    }

    public void Be1(LPQ lpq, long j) {
        String str;
        0Z9.A01("AndroidOwner:measureAndLayout", 1618529064);
        try {
            LE6 le6 = this.A0f;
            if (!lpq.A0I) {
                LPQ lpq2 = le6.A05;
                if (!(!lpq.equals(lpq2))) {
                    str = "measureAndLayout called on root";
                } else if (lpq2.A0A == null) {
                    str = "performMeasureAndLayout called with unattached root";
                } else if (!lpq2.A0R.A0J.A0E) {
                    str = "performMeasureAndLayout called with unplaced root";
                } else if (!le6.A02) {
                    if (le6.A00 != null) {
                        le6.A02 = true;
                        le6.A01 = false;
                        try {
                            L1t l1t = le6.A04;
                            l1t.A00.A00(lpq);
                            l1t.A01.A00(lpq);
                            if ((LE6.A08(lpq, new Constraints(j)) || lpq.A0R.A0E) && 1BK.A1X(lpq.A0G(), true)) {
                                lpq.A0P();
                            }
                            LE6.A00(lpq, le6);
                            LE6.A09(lpq, new Constraints(j));
                            L3O l3o = lpq.A0R;
                            if (l3o.A0A && l3o.A0J.A0E) {
                                lpq.A0S();
                                le6.A06.A01.A0C(lpq);
                                lpq.A0J = true;
                            }
                            LE6.A05(le6);
                            le6.A02 = false;
                            le6.A01 = false;
                        } catch (Throwable th) {
                            th = th;
                            le6.A02 = false;
                            le6.A01 = false;
                        }
                    }
                    LE6.A04(le6);
                } else {
                    str = "performMeasureAndLayout called during measure layout";
                }
                th = AnonymousClass001.A0L(str);
                throw th;
            }
            if (!(!L1t.A00(le6.A04))) {
                le6.A06.A01();
            }
            0Z9.A00(642791449);
        } catch (Throwable th2) {
            0Z9.A00(-1499958399);
            throw th2;
        }
    }

    public void Bvx() {
        if (this.A09) {
            L3H l3h = this.A0g.A00;
            M5B m5b = M5B.A00;
            LtK ltK = l3h.A05;
            synchronized (ltK) {
                int i = ltK.A00;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    L0x l0x = (L0x) ltK.A02[i3];
                    C2818Jaa c2818Jaa = l0x.A04;
                    long[] jArr = c2818Jaa.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4;
                            long j = jArr[i5];
                            if ((((j ^ (-1)) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int A0G = JR0.A0G(i5, length);
                                int i6 = 0;
                                while (true) {
                                    int i7 = i6;
                                    if (i7 >= A0G) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        Object obj = c2818Jaa.A03[i8];
                                        JaX jaX = (JaX) c2818Jaa.A04[i8];
                                        boolean A1V = AnonymousClass001.A1V(m5b.invoke(obj));
                                        if (A1V) {
                                            Object[] objArr = ((KuF) jaX).A04;
                                            long[] jArr2 = ((KuF) jaX).A03;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = 0;
                                                while (true) {
                                                    long j2 = jArr2[i9];
                                                    if ((JQz.A0I(j2, 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int A0G2 = JR0.A0G(i9, length2);
                                                        for (int i10 = 0; i10 < A0G2; i10++) {
                                                            if ((j2 & 255) < 128) {
                                                                Object A0t = JQx.A0t(objArr, i9, i10);
                                                                KsG ksG = l0x.A09;
                                                                ksG.A02(A0t, obj);
                                                                if ((A0t instanceof MN3) && !ksG.A00.A03(A0t)) {
                                                                    l0x.A08.A00(A0t);
                                                                    l0x.A0A.remove(A0t);
                                                                }
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (A0G2 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    } else {
                                                        i9++;
                                                    }
                                                }
                                            }
                                        }
                                        if (A1V) {
                                            c2818Jaa.A06(i8);
                                        }
                                    }
                                    j >>= 8;
                                    i6 = i7 + 1;
                                }
                                if (A0G != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i4 = i5 + 1;
                            }
                        }
                    }
                    if (l0x.A04.A01 == 0) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr2 = ltK.A02;
                        objArr2[i3 - i2] = objArr2[i3];
                    }
                }
                Object[] objArr3 = ltK.A02;
                int i11 = i - i2;
                C1A9.A0H(objArr3, i11, i);
                ltK.A00 = i11;
            }
            this.A09 = false;
        }
        JY4 jy4 = this.A0F;
        if (jy4 != null) {
            A07(jy4);
        }
        while (true) {
            LtK ltK2 = this.A0T;
            int i12 = ltK2.A00;
            if (i12 == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                int i14 = i13;
                if (i14 < i12) {
                    Object[] objArr4 = ltK2.A02;
                    C00m c00m = (C00m) objArr4[i14];
                    objArr4[i14] = null;
                    if (c00m != null) {
                        c00m.invoke();
                    }
                    i13 = i14 + 1;
                }
            }
            ltK2.A07(0, i12);
        }
    }

    public void C3P(LPQ lpq) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0k;
        androidComposeViewAccessibilityDelegateCompat.A0F = true;
        if (AndroidComposeViewAccessibilityDelegateCompat.A0L(androidComposeViewAccessibilityDelegateCompat)) {
            AndroidComposeViewAccessibilityDelegateCompat.A0F(lpq, androidComposeViewAccessibilityDelegateCompat);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.A04;
        androidContentCaptureManager.A06 = true;
        if (androidContentCaptureManager.A03 == null || !androidContentCaptureManager.A0A.add(lpq)) {
            return;
        }
        androidContentCaptureManager.A0F.D5N(04S.A00);
    }

    public void CKK() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0k;
        androidComposeViewAccessibilityDelegateCompat.A0F = true;
        if (AndroidComposeViewAccessibilityDelegateCompat.A0L(androidComposeViewAccessibilityDelegateCompat) && !androidComposeViewAccessibilityDelegateCompat.A0E) {
            androidComposeViewAccessibilityDelegateCompat.A0E = true;
            androidComposeViewAccessibilityDelegateCompat.A0K.post(androidComposeViewAccessibilityDelegateCompat.A0S);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.A04;
        androidContentCaptureManager.A06 = true;
        if (androidContentCaptureManager.A03 == null || androidContentCaptureManager.A05) {
            return;
        }
        androidContentCaptureManager.A05 = true;
        androidContentCaptureManager.A09.post(androidContentCaptureManager.A0E);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        11T.A0D(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addView(view, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        KiV kiV = this.A0U;
        if (kiV == null) {
            return;
        }
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            int keyAt = sparseArray.keyAt(i2);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            if (autofillValue.isText()) {
                Kdh kdh = kiV.A02;
                autofillValue.getTextValue().toString();
                kdh.A00.get(Integer.valueOf(keyAt));
            } else {
                if (autofillValue.isDate()) {
                    throw new C14m(0Pz.A0W("An operation is not implemented: ", "b/138604541: Add onFill() callback for date"));
                }
                if (autofillValue.isList()) {
                    throw new C14m(0Pz.A0W("An operation is not implemented: ", "b/138604541: Add onFill() callback for list"));
                }
                if (autofillValue.isToggle()) {
                    throw new C14m(0Pz.A0W("An operation is not implemented: ", "b/138604541:  Add onFill() callback for toggle"));
                }
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.A0k.A0d(i, this.A0E, false);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.A0k.A0d(i, this.A0E, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            A08(this.A0d);
        }
        Be0(true);
        LCW.A04();
        this.A0K = true;
        MLE mle = this.A10.A00;
        Canvas canvas2 = ((LOM) mle).A00;
        ((LOM) mle).A00 = canvas;
        this.A0d.A0T.A04.A0Y(mle, null);
        ((LOM) mle).A00 = canvas2;
        List list = this.A1B;
        if (1BK.A1Y(list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ML3) list.get(i)).D6r();
            }
        }
        if (JXv.A0H) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        list.clear();
        this.A0K = false;
        List list2 = this.A0I;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x031d, code lost:
    
        if (r323 == 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cb, code lost:
    
        if (r323 == 1) goto L49;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0213, code lost:
    
        if (r312 == r311) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:
    
        if (super.dispatchKeyEvent(r302) != false) goto L8;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isFocused()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L56
            r0 = r302
            int r0 = r0.getMetaState()
            r304 = r0
            X.MN4 r0 = X.KzP.A01
            r305 = r0
            X.KsL r0 = new X.KsL
            r306 = r0
            r0 = r306
            r1 = r304
            r0.<init>(r1)
            r0 = r305
            r1 = r306
            r0.Cvx(r1)
            r0 = r301
            X.MJP r0 = r0.A0X
            r305 = r0
            X.M1W r0 = X.M1W.A00
            r306 = r0
            r0 = r305
            r1 = r302
            r2 = r306
            boolean r0 = r0.ANr(r1, r2)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L52
            r0 = r301
            r1 = r302
            boolean r0 = super.dispatchKeyEvent(r1)
            r307 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r307
            if (r0 == 0) goto L54
        L52:
            r0 = 1
            r303 = r0
        L54:
            r0 = r303
            return r0
        L56:
            r0 = r301
            X.MJP r0 = r0.A0X
            r308 = r0
            X.JR6 r0 = new X.JR6
            r306 = r0
            r0 = r306
            r1 = r301
            r2 = r302
            r3 = 8
            r0.<init>(r1, r2, r3)
            r0 = r308
            r1 = r302
            r2 = r306
            boolean r0 = r0.ANr(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        if (r313 == 1) goto L37;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent r302) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEventPreIme(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.A08) {
            Runnable runnable = this.A1A;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.A03;
            11T.A0D(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A08 = false;
            } else {
                runnable.run();
            }
        }
        if (!A0I(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || A0H(motionEvent))) {
            int A00 = A00(motionEvent);
            if ((A00 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            z = true;
            if ((A00 & 1) == 0) {
                return false;
            }
        }
        return z;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (invoke instanceof View) {
                    return (View) invoke;
                }
            } else {
                view = A03(this, i);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        if (view != null) {
            int[] iArr = KZZ.A00;
            view.getLocationInWindow(iArr);
            float A0M = JQx.A0M(iArr);
            L5L l5l = new L5L(A0M, iArr[1], A0M + DKC.A02(view), iArr[1] + DKC.A03(view));
            L3g A04 = A04(i);
            if (1BK.A1X(this.A0X.ATS(l5l, M5K.A00, A04 != null ? A04.A00 : 6), true)) {
                return this;
            }
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        L5L A05 = A05(this);
        if (A05 == null) {
            super.getFocusedRect(rect);
            return;
        }
        rect.left = Math.round(A05.A01);
        rect.top = Math.round(A05.A03);
        rect.right = Math.round(A05.A02);
        rect.bottom = Math.round(A05.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IllegalStateException A0N;
        int i;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        LifecycleOwner lifecycleOwner;
        int A06 = 0FI.A06(-1959921902);
        super.onAttachedToWindow();
        7zU.A13(this.A0p.A00, hasWindowFocus());
        LPQ lpq = this.A0d;
        A09(lpq);
        A08(lpq);
        L3H l3h = this.A0g.A00;
        l3h.A00 = LCW.A01(l3h.A08);
        KiV kiV = this.A0U;
        if (kiV != null) {
            kiV.A01.registerCallback(JYL.A00);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        C05s A00 = C1ol.A00(this);
        MEE mee = this.A0S;
        KgR kgR = (KgR) mee.getValue();
        if (kgR == null || (lifecycleOwner2 != null && A00 != null && (lifecycleOwner2 != (lifecycleOwner = kgR.A00) || A00 != lifecycleOwner))) {
            if (lifecycleOwner2 == null) {
                A0N = AnonymousClass001.A0N("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                i = 300320207;
            } else if (A00 != null) {
                if (kgR != null && (lifecycle = kgR.A00.getLifecycle()) != null) {
                    lifecycle.removeObserver(this);
                }
                lifecycleOwner2.getLifecycle().addObserver(this);
                KgR kgR2 = new KgR(lifecycleOwner2, A00);
                this.A0O.Cvx(kgR2);
                Function1 function1 = this.A07;
                if (function1 != null) {
                    function1.invoke(kgR2);
                }
                this.A07 = null;
            } else {
                A0N = AnonymousClass001.A0N("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                i = -1768683960;
            }
            0FI.A0C(i, A06);
            throw A0N;
        }
        this.A0a.A00.Cvx(new KsI(GOp.A02(isInTouchMode() ? 1 : 0)));
        KgR kgR3 = (KgR) mee.getValue();
        if (kgR3 == null || (lifecycle2 = kgR3.A00.getLifecycle()) == null) {
            throw AnonymousClass001.A0N("No lifecycle owner exists");
        }
        lifecycle2.addObserver(this);
        lifecycle2.addObserver(this.A04);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A0v);
        getViewTreeObserver().addOnScrollChangedListener(this.A0w);
        getViewTreeObserver().addOnTouchModeChangeListener(this.A0x);
        if (Build.VERSION.SDK_INT >= 31) {
            KvL.A01(this);
        }
        0FI.A0C(-1067590519, A06);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        this.A0P.Cvx(KV5.A00(context));
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 31 ? configuration.fontWeightAdjustment : 0;
        if (i2 != this.A0C) {
            this.A0C = i2;
            this.A0Q.Cvx(new FontFamilyResolverImpl(new AndroidFontLoader(context), new LPr(i >= 31 ? KV1.A00(context) : 0)));
        }
        this.A06.invoke(configuration);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        LC6.A02(this.A04, consumer, jArr);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Lifecycle lifecycle;
        int A06 = 0FI.A06(-1116022190);
        super.onDetachedFromWindow();
        L3H l3h = this.A0g.A00;
        MEH meh = l3h.A00;
        if (meh != null) {
            meh.dispose();
        }
        l3h.A01();
        KgR kgR = (KgR) this.A0S.getValue();
        if (kgR == null || (lifecycle = kgR.A00.getLifecycle()) == null) {
            throw AnonymousClass001.A0N("No lifecycle owner exists");
        }
        lifecycle.removeObserver(this.A04);
        lifecycle.removeObserver(this);
        KiV kiV = this.A0U;
        if (kiV != null) {
            kiV.A01.unregisterCallback(JYL.A00);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A0v);
        getViewTreeObserver().removeOnScrollChangedListener(this.A0w);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.A0x);
        if (Build.VERSION.SDK_INT >= 31) {
            KvL.A00(this);
        }
        0FI.A0C(-1851654044, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = 0FI.A06(-860137054);
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            LOI loi = this.A0X;
            L7Z l7z = loi.A04;
            if (l7z.A00) {
                LD0.A05(loi.A01, true);
            } else {
                try {
                    l7z.A00 = true;
                    LD0.A05(loi.A01, true);
                } finally {
                    L7Z.A01(l7z);
                }
            }
        }
        0FI.A0C(977271201, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0f.A0D(this.A1D);
        this.A0H = null;
        A0D(this);
        if (this.A0F != null) {
            A0K().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        String str;
        IllegalArgumentException th;
        0Z9.A01("AndroidOwner:onMeasure", 1325845068);
        try {
            if (!isAttachedToWindow()) {
                A09(this.A0d);
            }
            long A02 = A02(i);
            int i3 = (int) (A02 >>> 32);
            int i4 = (int) (A02 & 4294967295L);
            long A022 = A02(i2);
            long A00 = KvP.A00(i3, i4, (int) (A022 >>> 32), (int) (4294967295L & A022));
            Constraints constraints = this.A0H;
            if (constraints == null) {
                this.A0H = new Constraints(A00);
                this.A0B = false;
            } else if (constraints.A00 != A00) {
                this.A0B = true;
            }
            LE6 le6 = this.A0f;
            Constraints constraints2 = le6.A00;
            boolean z = false;
            if (constraints2 == null || constraints2.A00 != A00) {
                if (!(!le6.A02)) {
                    str = "updateRootConstraints called while measuring";
                    th = AnonymousClass001.A0L(str);
                    throw th;
                }
                le6.A00 = new Constraints(A00);
                LPQ lpq = le6.A05;
                LPQ lpq2 = lpq.A08;
                if (lpq2 != null) {
                    lpq.A0R.A0G = true;
                }
                lpq.A0R.A0H = true;
                L1t l1t = le6.A04;
                if (lpq2 != null) {
                    z = true;
                }
                l1t.A01(lpq, z);
            }
            L1t l1t2 = le6.A04;
            if (!L1t.A00(l1t2)) {
                LPQ lpq3 = le6.A05;
                if (lpq3.A0A == null) {
                    str = "performMeasureAndLayout called with unattached root";
                } else if (!lpq3.A0R.A0J.A0E) {
                    str = "performMeasureAndLayout called with unplaced root";
                } else if (!(!le6.A02)) {
                    str = "performMeasureAndLayout called during measure layout";
                } else if (le6.A00 != null) {
                    le6.A02 = true;
                    le6.A01 = false;
                    try {
                        if (!l1t2.A00.A00.isEmpty()) {
                            if (lpq3.A08 == null) {
                                LE6.A01(lpq3, le6);
                            } else if (!lpq3.A0I) {
                                Constraints constraints3 = le6.A00;
                                11T.A0D(constraints3);
                                LE6.A08(lpq3, constraints3);
                            }
                        }
                        if (!lpq3.A0I) {
                            Constraints constraints4 = le6.A00;
                            11T.A0D(constraints4);
                            LE6.A09(lpq3, constraints4);
                        }
                        le6.A02 = false;
                        le6.A01 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        le6.A02 = false;
                        le6.A01 = false;
                    }
                }
                th = AnonymousClass001.A0L(str);
                throw th;
            }
            C2926JdE c2926JdE = this.A0d.A0R.A0J;
            setMeasuredDimension(((L56) c2926JdE).A01, ((L56) c2926JdE).A00);
            if (this.A0F != null) {
                JQx.A1A(A0K(), ((L56) c2926JdE).A00, 1073741824, View.MeasureSpec.makeMeasureSpec(((L56) c2926JdE).A01, 1073741824));
            }
            0Z9.A00(134025815);
        } catch (Throwable th3) {
            0Z9.A00(-1463227767);
            throw th3;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        KiV kiV;
        if (viewStructure == null || (kiV = this.A0U) == null) {
            return;
        }
        Map map = kiV.A02.A00;
        int addChildCount = viewStructure.addChildCount(map.size());
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            int A03 = AnonymousClass001.A03(A0z.getKey());
            A0z.getValue();
            ViewStructure newChild = viewStructure.newChild(addChildCount);
            if (newChild != null) {
                AutofillId autofillId = viewStructure.getAutofillId();
                11T.A0D(autofillId);
                newChild.setAutofillId(autofillId, A03);
                newChild.setId(A03, kiV.A00.getContext().getPackageName(), null, null);
                newChild.setAutofillType(1);
                throw AnonymousClass001.A0Q("getAutofillTypes");
            }
            addChildCount++;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        this.A0A = A0E();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (this.A0N) {
            this.A0R.Cvx((i == 0 || i != 1) ? KMW.A01 : KMW.A02);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        LPi lPi;
        if (Build.VERSION.SDK_INT < 31 || (lPi = this.A16) == null) {
            return;
        }
        lPi.A01(this, this.A0q, consumer, this.A05);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        LC6.A00.A03(longSparseArray, this.A04);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean A0E;
        int A06 = 0FI.A06(-1134802228);
        7zU.A13(this.A0p.A00, z);
        this.A0M = true;
        super.onWindowFocusChanged(z);
        if (z && this.A0A != (A0E = A0E())) {
            this.A0A = A0E;
            A08(this.A0d);
        }
        0FI.A0C(-192035441, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        LOI loi = this.A0X;
        int A00 = C2889JcD.A00(loi.A01);
        if (A00 == 2 || A00 == 0 || A00 == 1) {
            return super.requestFocus(i, rect);
        }
        if (A00 != 3) {
            throw 1BK.A1F();
        }
        L3g A04 = A04(i);
        int i2 = A04 != null ? A04.A00 : 7;
        return JR0.A1U(loi.ATS(rect != null ? new L5L(rect.left, rect.top, rect.right, rect.bottom) : null, new AQz(i2, 0), i2));
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
