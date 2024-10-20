package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.1rj, reason: invalid class name */
/* loaded from: 1rj.class */
public abstract class C1rj extends 1LI implements C1rk, 1Iq, 1Is, C1rl {
    public static final C1rn[] A03 = new C1rn[0];
    public C1ti A00;
    public String A01;
    public final String A02;

    public C1rj(int i, String str) {
        super(i);
        this.A02 = str;
    }

    public C1rj(String str) {
        this.A02 = str;
    }

    public C1tp A0Y(1tH r302, 1tT r303, 1JB r304, int i, int i2) {
        C1sr c1sr;
        Integer A01 = 1LZ.A01("Litho.Resolve.ComponentRendered");
        boolean BWo = ComponentsSystrace.A00.BWo();
        1Iw r0 = r303.A04;
        Integer A0m = A0m();
        Integer num = 0S2.A00;
        boolean z = false;
        if (A0m != num) {
            z = true;
        }
        try {
            if (z) {
                c1sr = new C1sr();
                c1sr.A0V = 1tZ.A01;
                if (A01 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("component", A0a());
                    hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0a());
                    1LZ.A04("Litho.Resolve.ComponentRendered", String.valueOf(r302.A06), hashMap, A01.intValue());
                }
                if (BWo) {
                    ComponentsSystrace.A02(0Pz.A0W("render:", A0a()));
                }
                A1F(r0);
                if (BWo) {
                    ComponentsSystrace.A01();
                }
                if (A01 != null) {
                    int intValue = A01.intValue();
                    03W r02 = 03W.A00;
                    11T.A0I(r02, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    1LZ.A02(intValue, r02);
                }
            } else if (A0m() == num) {
                if (A01 != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("component", A0a());
                    hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0a());
                    1LZ.A04("Litho.Resolve.ComponentRendered", String.valueOf(r302.A06), hashMap2, A01.intValue());
                }
                if (BWo) {
                    ComponentsSystrace.A02(0Pz.A0W("render:", A0a()));
                }
                1LI A0z = 1LI.A0K(this) ? A0z(r0, i, i2) : A0y(r0);
                if (BWo) {
                    ComponentsSystrace.A01();
                }
                if (A01 != null) {
                    int intValue2 = A01.intValue();
                    03W r03 = 03W.A00;
                    11T.A0I(r03, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    1LZ.A02(intValue2, r03);
                }
                c1sr = A0z != null ? 1tL.A02(A0z, r0, r302) : new C1sr();
                if (c1sr != null) {
                    int i3 = 1tL.A00;
                }
            } else {
                c1sr = null;
            }
            return new C1tp(this.A00, c1sr);
        } catch (Throwable th) {
            if (BWo) {
                ComponentsSystrace.A01();
            }
            if (A01 != null) {
                1BL.A1D(A01);
            }
            throw th;
        }
    }

    public final String A0a() {
        1LI A0x = A0x();
        if (A0x == null) {
            return this.A02;
        }
        String str = this.A02;
        while (A0x instanceof C1rj) {
            C1rj c1rj = (C1rj) A0x;
            if (c1rj.A0x() == null) {
                break;
            }
            A0x = c1rj.A0x();
        }
        return 0Pz.A0v(str, "(", A0x.A0a(), ")");
    }

    public final boolean A0g(1LI r302) {
        return A1a(r302, false);
    }

    public int A0s(AnonymousClass274 anonymousClass274) {
        if (!(this instanceof 2KZ)) {
            return 0;
        }
        boolean z = ((2KZ) this).A0d;
        ClickableSpan[] clickableSpanArr = ((2Ki) anonymousClass274).A08;
        if (!z || clickableSpanArr == null) {
            return 0;
        }
        return clickableSpanArr.length;
    }

    public int A0t(AnonymousClass274 anonymousClass274, int i, int i2) {
        int i3;
        if (this instanceof 2KZ) {
            CharSequence charSequence = ((2KZ) this).A0c;
            2Ki r0 = (2Ki) anonymousClass274;
            Layout layout = r0.A01;
            ClickableSpan[] clickableSpanArr = r0.A08;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                int i4 = 0;
                while (true) {
                    i3 = i4;
                    if (i3 >= clickableSpanArr.length) {
                        break;
                    }
                    ClickableSpan clickableSpan = clickableSpanArr[i3];
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    Path path = 2KZ.A0l;
                    layout.getSelectionPath(spanStart, spanEnd, path);
                    RectF rectF = 2KZ.A0n;
                    path.computeBounds(rectF, true);
                    if (rectF.contains(i, i2)) {
                        break;
                    }
                    i4 = i3 + 1;
                }
                return i3;
            }
        }
        i3 = (-1) << (-1);
        return i3;
    }

    public final SparseArray A0u() {
        C1ti A0v = A0v();
        SparseArray sparseArray = A0v.A05;
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            A0v.A05 = sparseArray;
        }
        return sparseArray;
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [java.lang.Object, X.1ti] */
    public final C1ti A0v() {
        C1ti c1ti = this.A00;
        C1ti c1ti2 = c1ti;
        if (c1ti == null) {
            ?? obj = new Object();
            this.A00 = obj;
            c1ti2 = obj;
        }
        return c1ti2;
    }

    public 3lE A0w(3lE r302, 1Iw r303) {
        return null;
    }

    public 1LI A0x() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00dc, code lost:
    
        if (r0.showCutoutForBadge != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x16d7, code lost:
    
        if (r339 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x035c, code lost:
    
        if (r0.showCutoutForBadge != false) goto L54;
     */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 11118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rj.A0y(X.1Iw):X.1LI");
    }

    public 1LI A0z(1Iw r302, int i, int i2) {
        if (!(this instanceof DwV)) {
            return 2cK.A01(r302, (String) null, 0).A00;
        }
        Function2 function2 = ((DwV) this).A00;
        11T.A0F(r302, 0);
        11T.A0F(function2, 3);
        1tH r0 = (1tI) r302.A0F.get();
        return (1LI) function2.invoke(new C2k5(r302, r0 instanceof 1tH ? r0 : null), new C26P(23U.A00(i, i2)));
    }

    public AnonymousClass274 A10() {
        return null;
    }

    public InterfaceC00783om A11() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2Yv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2Yv, java.lang.Object] */
    public 2Yv A12() {
        if (!(this instanceof 2lG) && !(this instanceof 2Kg)) {
            throw AnonymousClass001.A0T("createStateContainer has not been implemented!");
        }
        return new Object();
    }

    public C3s9 A13(1Iw r302) {
        return null;
    }

    public C1qp A14(1Iw r302, C1qp c1qp) {
        return c1qp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02ef, code lost:
    
        if (r0.length() == 0) goto L49;
     */
    /* JADX WARN: Type inference failed for: r0v495, types: [java.lang.Throwable, X.3Ps] */
    /* JADX WARN: Type inference failed for: r0v534, types: [X.1Q5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 2685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rj.A15(X.1Im, java.lang.Object):java.lang.Object");
    }

    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (!(this instanceof C2kV)) {
            return null;
        }
        int i = c2ko.A02;
        if (i == -1505688212) {
            throw AnonymousClass001.A0Q("position");
        }
        if (i == -1017305181) {
            1tT r0 = c2ko.A00.A06;
            r0.getClass();
            ((C2kp) r0.A00()).A04.A03();
            return null;
        }
        if (i != -238194236) {
            return null;
        }
        1Iw r02 = c2ko.A00;
        int i2 = ((9HA) obj).A00;
        1tT r03 = r02.A06;
        r03.getClass();
        2Xo r04 = ((C2kp) r03.A00()).A01;
        3J5 r05 = new 3J5(i2);
        if (!r04.A0F) {
            return null;
        }
        synchronized (r04) {
            r04.A09.AEX(r05);
        }
        return null;
    }

    public void A17(int i, Object obj, Object obj2) {
        throw AnonymousClass001.A0T("Components that have dynamic Props must override this method");
    }

    public void A18(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 1Iw r304, AnonymousClass274 anonymousClass274) {
        if (this instanceof C2qf) {
            accessibilityNodeInfoCompat.A07("android.widget.ImageView");
            return;
        }
        if (this instanceof 2KZ) {
            2KZ r0 = (2KZ) this;
            CharSequence charSequence = r0.A0c;
            boolean z = r0.A0f;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if (charSequence instanceof Spanned) {
                int i = 0;
                C32w[] c32wArr = (C32w[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C32w.class);
                int length = c32wArr.length;
                if (length != 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    do {
                        C32w c32w = c32wArr[i];
                        String str = c32w.A00;
                        if (!TextUtils.isEmpty(str)) {
                            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c32w), spannableStringBuilder.getSpanEnd(c32w), (CharSequence) str);
                        }
                        i++;
                    } while (i < length);
                    charSequence = spannableStringBuilder.toString();
                }
            }
            CharSequence charSequence2 = charSequence;
            if (contentDescription != null) {
                charSequence2 = contentDescription;
            }
            accessibilityNodeInfo.setText(charSequence2);
            if (contentDescription == null) {
                contentDescription = charSequence;
            }
            accessibilityNodeInfo.setContentDescription(contentDescription);
            accessibilityNodeInfoCompat.A04(256);
            accessibilityNodeInfoCompat.A04(512);
            accessibilityNodeInfo.setMovementGranularities(11);
            if (z) {
                return;
            }
            accessibilityNodeInfo.setMultiLine(true);
        }
    }

    public void A19(View view, AnonymousClass274 anonymousClass274, int i) {
        if ((this instanceof 2KZ) && (((2Ki) anonymousClass274).A08[i] instanceof DO7)) {
            view.invalidate();
        }
    }

    public void A1A(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AnonymousClass274 anonymousClass274, int i, int i2, int i3) {
        if (this instanceof 2KZ) {
            CharSequence charSequence = ((2KZ) this).A0c;
            2Ki r0 = (2Ki) anonymousClass274;
            Layout layout = r0.A01;
            DO7[] do7Arr = r0.A08;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                DO7 do7 = do7Arr[i];
                int spanStart = spanned.getSpanStart(do7);
                int spanEnd = spanned.getSpanEnd(do7);
                int lineForOffset = layout.getLineForOffset(spanStart);
                int lineVisibleEnd = lineForOffset == layout.getLineForOffset(spanEnd) ? spanEnd : layout.getLineVisibleEnd(lineForOffset);
                Path path = 2KZ.A0l;
                layout.getSelectionPath(spanStart, lineVisibleEnd, path);
                RectF rectF = 2KZ.A0n;
                path.computeBounds(rectF, true);
                Rect rect = 2KZ.A0m;
                rect.set(((int) rectF.left) + i2, ((int) rectF.top) + i3, i2 + ((int) rectF.right), i3 + ((int) rectF.bottom));
                if (rect.isEmpty()) {
                    rect.set(0, 0, 1, 1);
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    accessibilityNodeInfo.setContentDescription("");
                    return;
                }
                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.A02;
                accessibilityNodeInfo2.setBoundsInParent(rect);
                accessibilityNodeInfoCompat.A0C(true);
                accessibilityNodeInfo2.setFocusable(true);
                accessibilityNodeInfo2.setEnabled(true);
                accessibilityNodeInfo2.setVisibleToUser(true);
                accessibilityNodeInfo2.setText(spanned.subSequence(spanStart, spanEnd));
                if (do7 instanceof DO7) {
                    DO7 do72 = do7;
                    String str = do72.A00;
                    String str2 = do72.A02;
                    String str3 = do72.A01;
                    if (str != null) {
                        accessibilityNodeInfo2.setContentDescription(str);
                    }
                    if (str2 != null) {
                        accessibilityNodeInfoCompat.A08(str2);
                    }
                    if (str3 != null) {
                        accessibilityNodeInfoCompat.A07(str3);
                        return;
                    }
                }
                accessibilityNodeInfoCompat.A07("android.widget.Button");
            }
        }
    }

    public void A1B(3lE r302) {
    }

    public void A1C(1Iw r302) {
    }

    public void A1D(1Iw r302) {
        if (this instanceof C2kV) {
            1tT r0 = r302.A06;
            r0.getClass();
            ((C2kp) r0.A00()).A05.AN3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v304, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v306, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v308, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v310, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v312, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v314, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v316, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v318, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v320, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v322, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v324, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v326, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v328, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v330, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v332, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v334, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v336, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v338, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v340, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v342, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v344, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v346, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v348, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v350, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v352, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v354, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v356, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, X.66W] */
    public void A1E(1Iw r302) {
        if (this instanceof 2qK) {
            2qK r0 = (2qK) this;
            ComponentsSystrace.A02("onLoadStyle");
            TypedArray A02 = r302.A02(0, C1oo.A2r);
            Drawable drawable = A02.getDrawable(0);
            A02.recycle();
            TypedArray A022 = r302.A02(0, C1oo.A2q);
            int dimensionPixelSize = A022.getDimensionPixelSize(4, 0);
            Integer valueOf = Integer.valueOf(dimensionPixelSize);
            boolean z = A022.getBoolean(0, false);
            Boolean valueOf2 = Boolean.valueOf(z);
            float dimension = A022.getDimension(1, 0.0f);
            Float valueOf3 = Float.valueOf(dimension);
            boolean z2 = A022.getBoolean(3, false);
            Boolean valueOf4 = Boolean.valueOf(z2);
            int color = A022.getColor(2, 2qN.A0W);
            Integer valueOf5 = Integer.valueOf(color);
            A022.recycle();
            TypedArray A023 = r302.A02(0, C1oo.A09);
            Context context = r302.A0D;
            C2qh A00 = AbstractC05644eg.A00(context, A023);
            A023.recycle();
            TypedArray A024 = r302.A02(0, C1oo.A2p);
            C2qa c2qa = C2qa.values()[A024.getInt(2, 0)];
            int color2 = A024.getColor(1, context.getColor(2132213991));
            Integer valueOf6 = Integer.valueOf(color2);
            float dimensionPixelSize2 = A024.getDimensionPixelSize(0, C0A8.A05(context.getResources(), 2132279515));
            Float valueOf7 = Float.valueOf(dimensionPixelSize2);
            A024.recycle();
            ComponentsSystrace.A01();
            if (valueOf2 != null) {
                r0.A0F = z;
            }
            if (valueOf != null) {
                r0.A05 = dimensionPixelSize;
            }
            if (valueOf5 != null) {
                r0.A04 = color;
            }
            if (valueOf4 != null) {
                r0.A0H = z2;
            }
            if (drawable != null) {
                r0.A09 = drawable;
            }
            if (c2qa != null) {
                r0.A0D = c2qa;
            }
            if (valueOf6 != null) {
                r0.A06 = color2;
            }
            if (valueOf7 != null) {
                r0.A01 = dimensionPixelSize2;
            }
            if (valueOf3 != null) {
                r0.A00 = dimension;
            }
            r0.A0C = A00;
            return;
        }
        if (this instanceof 2KZ) {
            2KZ r02 = (2KZ) this;
            ?? obj = new Object();
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            ?? obj4 = new Object();
            ?? obj5 = new Object();
            ?? obj6 = new Object();
            ?? obj7 = new Object();
            ?? obj8 = new Object();
            ?? obj9 = new Object();
            ?? obj10 = new Object();
            ?? obj11 = new Object();
            ?? obj12 = new Object();
            ?? obj13 = new Object();
            ?? obj14 = new Object();
            ?? obj15 = new Object();
            ?? obj16 = new Object();
            ?? obj17 = new Object();
            ?? obj18 = new Object();
            ?? obj19 = new Object();
            ?? obj20 = new Object();
            ?? obj21 = new Object();
            ?? obj22 = new Object();
            ?? obj23 = new Object();
            ?? obj24 = new Object();
            ?? obj25 = new Object();
            ?? obj26 = new Object();
            ?? obj27 = new Object();
            C6ok.A02(r302, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27);
            Object obj28 = ((66W) obj).A00;
            if (obj28 != null) {
                r02.A0V = (TextUtils.TruncateAt) obj28;
            }
            Object obj29 = ((66W) obj2).A00;
            if (obj29 != null) {
                r02.A01 = ((Number) obj29).floatValue();
            }
            Object obj30 = ((66W) obj3).A00;
            if (obj30 != null) {
                r02.A0h = AnonymousClass001.A1V(obj30);
            }
            Object obj31 = ((66W) obj4).A00;
            if (obj31 != null) {
                r02.A08 = ((Number) obj31).floatValue();
            }
            Object obj32 = ((66W) obj5).A00;
            if (obj32 != null) {
                r02.A0K = ((Number) obj32).intValue();
            }
            Object obj33 = ((66W) obj6).A00;
            if (obj33 != null) {
                r02.A0H = ((Number) obj33).intValue();
            }
            Object obj34 = ((66W) obj7).A00;
            if (obj34 != null) {
                r02.A0J = AnonymousClass001.A03(obj34);
            }
            Object obj35 = ((66W) obj8).A00;
            if (obj35 != null) {
                r02.A0G = AnonymousClass001.A03(obj35);
            }
            Object obj36 = ((66W) obj9).A00;
            if (obj36 != null) {
                r02.A0L = AnonymousClass001.A03(obj36);
            }
            Object obj37 = ((66W) obj10).A00;
            if (obj37 != null) {
                r02.A0I = AnonymousClass001.A03(obj37);
            }
            Object obj38 = ((66W) obj11).A00;
            if (obj38 != null) {
                r02.A0f = ((Boolean) obj38).booleanValue();
            }
            Object obj39 = ((66W) obj12).A00;
            if (obj39 != null) {
                r02.A0c = (CharSequence) obj39;
            }
            Object obj40 = ((66W) obj13).A00;
            if (obj40 != null) {
                r02.A0S = (ColorStateList) obj40;
            }
            Object obj41 = ((66W) obj14).A00;
            if (obj41 != null) {
                r02.A0F = ((Number) obj41).intValue();
            }
            Object obj42 = ((66W) obj15).A00;
            if (obj42 != null) {
                r02.A0A = ((Number) obj42).intValue();
            }
            Object obj43 = ((66W) obj16).A00;
            if (obj43 != null) {
                r02.A0Q = ((Number) obj43).intValue();
            }
            Object obj44 = ((66W) obj17).A00;
            if (obj44 != null) {
                r02.A0Y = (2KG) obj44;
            }
            Object obj45 = ((66W) obj18).A00;
            if (obj45 != null) {
                r02.A09 = AnonymousClass001.A03(obj45);
            }
            Object obj46 = ((66W) obj19).A00;
            if (obj46 != null) {
                r02.A0D = AnonymousClass001.A03(obj46);
            }
            Object obj47 = ((66W) obj20).A00;
            if (obj47 != null) {
                r02.A0E = AnonymousClass001.A03(obj47);
            }
            Object obj48 = ((66W) obj21).A00;
            if (obj48 != null) {
                r02.A0R = ((Number) obj48).intValue();
            }
            Object obj49 = ((66W) obj22).A00;
            if (obj49 != null) {
                r02.A07 = ((Number) obj49).floatValue();
            }
            Object obj50 = ((66W) obj23).A00;
            if (obj50 != null) {
                r02.A05 = ((Number) obj50).floatValue();
            }
            Object obj51 = ((66W) obj24).A00;
            if (obj51 != null) {
                r02.A06 = ((Number) obj51).floatValue();
            }
            Object obj52 = ((66W) obj25).A00;
            if (obj52 != null) {
                r02.A0O = ((Number) obj52).intValue();
            }
            Object obj53 = ((66W) obj26).A00;
            if (obj53 != null) {
                r02.A0Z = (2K4) obj53;
            }
            Object obj54 = ((66W) obj27).A00;
            if (obj54 != null) {
                r02.A0T = (Typeface) obj54;
                return;
            }
            return;
        }
        if (this instanceof 2Kh) {
            2Kh r03 = (2Kh) this;
            Drawable drawable2 = null;
            ImageView.ScaleType scaleType = null;
            TypedArray A025 = r302.A02(0, C53r.A02);
            int indexCount = A025.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = A025.getIndex(i);
                if (index == 0) {
                    drawable2 = r302.A0D.getResources().getDrawable(A025.getResourceId(index, 0));
                } else if (index == 1) {
                    float f = 0.0f / 0.0f;
                    scaleType = 2Kh.A03[A025.getInteger(index, -1)];
                }
            }
            A025.recycle();
            if (drawable2 != null) {
                r03.A00 = drawable2;
            }
            if (scaleType != null) {
                r03.A01 = scaleType;
                return;
            }
            return;
        }
        if (this instanceof 2KW) {
            2KW r04 = (2KW) this;
            ?? obj55 = new Object();
            ?? obj56 = new Object();
            ?? obj57 = new Object();
            ?? obj58 = new Object();
            ?? obj59 = new Object();
            ?? obj60 = new Object();
            ?? obj61 = new Object();
            ?? obj62 = new Object();
            ?? obj63 = new Object();
            ?? obj64 = new Object();
            ?? obj65 = new Object();
            ?? obj66 = new Object();
            ?? obj67 = new Object();
            ?? obj68 = new Object();
            ?? obj69 = new Object();
            ?? obj70 = new Object();
            ?? obj71 = new Object();
            ?? obj72 = new Object();
            ?? obj73 = new Object();
            ?? obj74 = new Object();
            ?? obj75 = new Object();
            ?? obj76 = new Object();
            ?? obj77 = new Object();
            ?? obj78 = new Object();
            ?? obj79 = new Object();
            ?? obj80 = new Object();
            ?? obj81 = new Object();
            C6ok.A02(r302, obj55, obj56, obj57, obj58, obj59, obj60, obj61, obj62, obj63, obj64, obj65, obj66, obj67, obj68, obj69, obj70, obj71, obj72, obj73, obj74, obj75, obj76, obj77, obj78, obj79, obj80, obj81);
            Object obj82 = ((66W) obj55).A00;
            if (obj82 != null) {
                r04.A0P = (TextUtils.TruncateAt) obj82;
            }
            Object obj83 = ((66W) obj56).A00;
            if (obj83 != null) {
                r04.A00 = ((Number) obj83).floatValue();
            }
            Object obj84 = ((66W) obj57).A00;
            if (obj84 != null) {
                r04.A0b = AnonymousClass001.A1V(obj84);
            }
            Object obj85 = ((66W) obj58).A00;
            if (obj85 != null) {
                r04.A05 = ((Number) obj85).floatValue();
            }
            Object obj86 = ((66W) obj59).A00;
            if (obj86 != null) {
                r04.A0F = AnonymousClass001.A03(obj86);
            }
            Object obj87 = ((66W) obj60).A00;
            if (obj87 != null) {
                r04.A0C = AnonymousClass001.A03(obj87);
            }
            Object obj88 = ((66W) obj61).A00;
            if (obj88 != null) {
                r04.A0E = AnonymousClass001.A03(obj88);
            }
            Object obj89 = ((66W) obj62).A00;
            if (obj89 != null) {
                r04.A0B = AnonymousClass001.A03(obj89);
            }
            Object obj90 = ((66W) obj63).A00;
            if (obj90 != null) {
                r04.A0G = AnonymousClass001.A03(obj90);
            }
            Object obj91 = ((66W) obj64).A00;
            if (obj91 != null) {
                r04.A0D = AnonymousClass001.A03(obj91);
            }
            Object obj92 = ((66W) obj65).A00;
            if (obj92 != null) {
                r04.A0Z = AnonymousClass001.A1V(obj92);
            }
            Object obj93 = ((66W) obj66).A00;
            if (obj93 != null) {
                r04.A0W = (CharSequence) obj93;
            }
            Object obj94 = ((66W) obj67).A00;
            if (obj94 != null) {
                r04.A0M = (ColorStateList) obj94;
            }
            Object obj95 = ((66W) obj68).A00;
            if (obj95 != null) {
                r04.A0A = AnonymousClass001.A03(obj95);
            }
            Object obj96 = ((66W) obj69).A00;
            if (obj96 != null) {
                r04.A07 = AnonymousClass001.A03(obj96);
            }
            Object obj97 = ((66W) obj70).A00;
            if (obj97 != null) {
                r04.A0K = AnonymousClass001.A03(obj97);
            }
            Object obj98 = ((66W) obj71).A00;
            if (obj98 != null) {
                r04.A0S = (2KG) obj98;
            }
            Object obj99 = ((66W) obj72).A00;
            if (obj99 != null) {
                r04.A06 = AnonymousClass001.A03(obj99);
            }
            Object obj100 = ((66W) obj73).A00;
            if (obj100 != null) {
                r04.A08 = AnonymousClass001.A03(obj100);
            }
            Object obj101 = ((66W) obj74).A00;
            if (obj101 != null) {
                r04.A09 = AnonymousClass001.A03(obj101);
            }
            Object obj102 = ((66W) obj75).A00;
            if (obj102 != null) {
                r04.A0L = AnonymousClass001.A03(obj102);
            }
            Object obj103 = ((66W) obj76).A00;
            if (obj103 != null) {
                r04.A04 = ((Number) obj103).floatValue();
            }
            Object obj104 = ((66W) obj77).A00;
            if (obj104 != null) {
                r04.A02 = ((Number) obj104).floatValue();
            }
            Object obj105 = ((66W) obj78).A00;
            if (obj105 != null) {
                r04.A03 = ((Number) obj105).floatValue();
            }
            Object obj106 = ((66W) obj79).A00;
            if (obj106 != null) {
                r04.A0I = AnonymousClass001.A03(obj106);
            }
            Object obj107 = ((66W) obj80).A00;
            if (obj107 != null) {
                r04.A0T = (2K4) obj107;
            }
            Object obj108 = ((66W) obj81).A00;
            if (obj108 != null) {
                r04.A0N = (Typeface) obj108;
            }
        }
    }

    public void A1F(1Iw r302) {
    }

    public void A1G(1Iw r302, 1sE r303) {
    }

    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        int intrinsicHeight;
        if (this instanceof C2qf) {
            intrinsicHeight = ((C2qf) this).A04;
            Context context = r302.A0D;
            int i3 = 2qN.A0W;
            if (intrinsicHeight <= 0) {
                intrinsicHeight = C0A8.A00(context, 50.0f);
            }
            if (intrinsicHeight > 0) {
                if (View.MeasureSpec.getMode(i) != 0 || View.MeasureSpec.getMode(i2) != 0) {
                    C2ra.A03(c23p, 1.0f, i, i2, intrinsicHeight, intrinsicHeight);
                    return;
                } else {
                    c23p.A01 = intrinsicHeight;
                    c23p.A00 = intrinsicHeight;
                    return;
                }
            }
            c23p.A01 = 0;
            c23p.A00 = 0;
            return;
        }
        if (this instanceof 2Kh) {
            2Kh r0 = (2Kh) this;
            Drawable drawable = r0.A00;
            boolean z = r0.A02;
            if (drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                intrinsicHeight = drawable.getIntrinsicHeight();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
                    c23p.A01 = intrinsicWidth;
                    c23p.A00 = intrinsicHeight;
                    return;
                }
                float f = intrinsicWidth / intrinsicHeight;
                if (z) {
                    C2ra.A03(c23p, f, i, i2, intrinsicWidth, intrinsicHeight);
                    return;
                } else {
                    C2ra.A02(c23p, f, i, i2);
                    return;
                }
            }
            c23p.A01 = 0;
            c23p.A00 = 0;
            return;
        }
        if (this instanceof 2Kc) {
            return;
        }
        if (this instanceof 2Ke) {
            11T.A0F(c23p, 4);
            C2ra.A04(c23p, i, i2);
            return;
        }
        if (this instanceof 2Kg) {
            C2X2 c2x2 = ((2Kg) this).A01;
            c2x2.Bdw((c2x2.ADb() || c2x2.BXQ()) ? 1LI.A09(r302, 2Kg.class, "LegacyRecycler", 946341036) : null, c23p, C2lz.A00(i, 0), C2lz.A00(i2, 0));
            Integer valueOf = Integer.valueOf(c23p.A01);
            Integer valueOf2 = Integer.valueOf(c23p.A00);
            C3Yo c3Yo = (C3Yo) anonymousClass274;
            c3Yo.A01 = valueOf;
            c3Yo.A00 = valueOf2;
            return;
        }
        if (!(this instanceof 2JJ)) {
            throw 1BL.A0h(this, "You must override onMeasure() if you return true in canMeasure(), Component is: ", AnonymousClass001.A0k());
        }
        2JJ r02 = (2JJ) this;
        int i4 = 0;
        11T.A0F(r302, 0);
        11T.A0F(c23p, 4);
        Context context2 = r302.A0D;
        11T.A0A(context2);
        View ALI = r02.A02.ALI(context2, (ViewGroup) null);
        11T.A0I(ALI, "null cannot be cast to non-null type V of com.facebook.litho.ViewCompatComponent");
        ALI.setLayoutParams(new ViewGroup.LayoutParams(c23p.A01, c23p.A00));
        3Fn r03 = r02.A01;
        if (r03 == null) {
            throw 1BK.A0h();
        }
        r03.A01(ALI);
        if (ALI.getVisibility() == 8) {
            c23p.A01 = 0;
        } else {
            ALI.measure(i, i2);
            c23p.A01 = ALI.getMeasuredWidth();
            i4 = ALI.getMeasuredHeight();
        }
        c23p.A00 = i4;
        if (r02.A01 == null) {
            throw 1BK.A0h();
        }
    }

    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
    }

    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v145, types: [java.lang.Throwable, android.widget.ImageView, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.1Iw r302, X.AnonymousClass274 r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rj.A1K(X.1Iw, X.274, java.lang.Object):void");
    }

    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        if (!(this instanceof 2Kg)) {
            if (this instanceof 2JJ) {
                11T.A0F(obj, 1);
                if (((2JJ) this).A01 == null) {
                    throw 1BK.A0h();
                }
                return;
            }
            return;
        }
        2Z6 r0 = (2Z6) obj;
        List<2O4> list = ((2Kg) this).A04;
        r0.A01 = null;
        C2m7 c2m7 = (C2m7) r0.A04;
        if (c2m7 == null) {
            throw AnonymousClass001.A0N("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        if (list != null) {
            for (2O4 r02 : list) {
                if (r02 != null) {
                    c2m7.A1G(r02);
                }
            }
        }
        c2m7.A00 = null;
        r0.A0C = null;
    }

    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C2kr c2kr;
        if (this instanceof C28u) {
            ComponentHost componentHost = (ComponentHost) obj;
            if (componentHost.isPressed()) {
                componentHost.setPressed(false);
            }
            componentHost.A0F = false;
            return;
        }
        if (this instanceof 2Ka) {
            11T.A0F(obj, 1);
        } else {
            if (this instanceof C2qf) {
                1tT r0 = r302.A06;
                r0.getClass();
                c2kr = (C2kr) obj;
                2qN A00 = ((C2qi) r0.A00()).A00.A00();
                A00.A07();
                A00.A05();
                c2kr.A01();
            }
            if (!(this instanceof 2Kh)) {
                if (this instanceof 2KZ) {
                    C2ku c2ku = (C2ku) obj;
                    DNx dNx = ((2KZ) this).A0c;
                    c2ku.A07();
                    if (dNx instanceof C2kw) {
                        DNx dNx2 = (C2kw) dNx;
                        if (c2ku == dNx2.A00) {
                            dNx2.A00 = null;
                        }
                        dNx2.A04();
                        return;
                    }
                    return;
                }
                if (this instanceof 2Kc) {
                    ViewGroup viewGroup = (ViewGroup) obj;
                    viewGroup.setOnTouchListener(null);
                    viewGroup.removeAllViews();
                    return;
                }
                if (this instanceof 2Kd) {
                    ((C2qz) obj).A03(null);
                    return;
                }
                if (this instanceof 2Kg) {
                    2Kg r02 = (2Kg) this;
                    2Z6 r03 = (2Z6) obj;
                    C2X2 c2x2 = r02.A01;
                    List<2kG> list = r02.A03;
                    RecyclerView recyclerView = r03.A04;
                    if (recyclerView == null) {
                        throw AnonymousClass001.A0N("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
                    }
                    recyclerView.setId(-1);
                    recyclerView.A1A(r03.A00);
                    r03.A00 = null;
                    if (list != null) {
                        for (2kG r04 : list) {
                            if (r04 instanceof C2mc) {
                                2JB.A02((String) null);
                                ((C2mc) r04).A00 = null;
                            }
                            recyclerView.A1C(r04);
                        }
                    }
                    c2x2.D5n(recyclerView);
                    return;
                }
                return;
            }
        }
        c2kr = (C2kr) obj;
        c2kr.A01();
    }

    public void A1N(1Iw r302, 2Yv r303) {
        int i;
        if (!(this instanceof 2lG)) {
            if (this instanceof 2Kg) {
                37B r0 = (37B) r303;
                3jI r02 = new 3jI(((2Kg) this).A01, 1);
                r0.A00 = 0;
                r0.A01 = r02;
                return;
            }
            return;
        }
        3yA r03 = (3yA) r303;
        11T.A0F(r302, 0);
        2TI r04 = (2TI) 1Bn.A0A(66725);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        int Auy = (int) r04.A00.Auy(72622317813826082L);
        if (Auy != 0) {
            boolean z = true;
            if (Auy == 1) {
                i = 2131962242;
            } else if (Auy == 2) {
                i = 2131962188;
            } else if (Auy != 3) {
                if (Auy == 4) {
                    z = false;
                }
                Integer[] numArr = r04.A02() ? new Integer[]{2131962187, 2131962184, 2131962183, 2131962186} : new Integer[]{2131962187, 2131962184, 2131962183};
                int A032 = z ? 07C.A03(C07y.A00, new 07E(0, numArr.length - 1)) : fbSharedPreferences.ArU(1G3.A01(1G0.A00, "notes_creation_hint_text_index"), 0);
                1Ql edit = fbSharedPreferences.edit();
                1G2 A0D = 1G0.A00.A0D("notes_creation_hint_text_index");
                int length = (A032 + 1) % numArr.length;
                edit.CaE(A0D, length);
                edit.commit();
                i = numArr[length].intValue();
            } else {
                i = 2131962189;
            }
        } else {
            i = 2131962184;
        }
        1Ql edit2 = fbSharedPreferences.edit();
        edit2.CaE(1G0.A00.A0D("notes_creation_hint_text"), i);
        edit2.commit();
        Context context = r302.A0D;
        11T.A0A(context);
        Object A0E = 1Bn.A0E(context, (1BY) null, 32840);
        if (A0E != null) {
            r03.A00 = (3yB) A0E;
        }
    }

    public void A1O(AnonymousClass274 anonymousClass274, AnonymousClass274 anonymousClass2742) {
        if (this instanceof 2KZ) {
            2Ki r0 = (2Ki) anonymousClass274;
            2Ki r02 = (2Ki) anonymousClass2742;
            r0.A08 = r02.A08;
            r0.A05 = r02.A05;
            r0.A09 = r02.A09;
            r0.A00 = r02.A00;
            r0.A06 = r02.A06;
            r0.A07 = r02.A07;
            r0.A02 = r02.A02;
            r0.A01 = r02.A01;
            r0.A03 = r02.A03;
            r0.A04 = r02.A04;
            return;
        }
        if (this instanceof 2Kh) {
            C2jh c2jh = (C2jh) anonymousClass274;
            C2jh c2jh2 = (C2jh) anonymousClass2742;
            c2jh.A01 = c2jh2.A01;
            c2jh.A00 = c2jh2.A00;
            c2jh.A02 = c2jh2.A02;
            return;
        }
        if (this instanceof C2qf) {
            C2qm c2qm = (C2qm) anonymousClass274;
            C2qm c2qm2 = (C2qm) anonymousClass2742;
            c2qm.A00 = c2qm2.A00;
            c2qm.A01 = c2qm2.A01;
            c2qm.A02 = c2qm2.A02;
            c2qm.A03 = c2qm2.A03;
            return;
        }
        if (this instanceof 2Kg) {
            C3Yo c3Yo = (C3Yo) anonymousClass274;
            C3Yo c3Yo2 = (C3Yo) anonymousClass2742;
            c3Yo.A00 = c3Yo2.A00;
            c3Yo.A01 = c3Yo2.A01;
        }
    }

    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        if (this instanceof 2Kd) {
            ((C3Yr) interfaceC00783om).A00 = ((C3Yr) interfaceC00783om2).A00;
        }
    }

    public boolean A1Q() {
        return false;
    }

    public boolean A1R() {
        return false;
    }

    public boolean A1S() {
        return false;
    }

    public boolean A1T() {
        return false;
    }

    public boolean A1U() {
        return false;
    }

    public boolean A1V() {
        return false;
    }

    public boolean A1W() {
        return false;
    }

    public boolean A1X() {
        return false;
    }

    public boolean A1Y() {
        return false;
    }

    public boolean A1Z(View view, AnonymousClass274 anonymousClass274, int i, int i2) {
        if (!(this instanceof 2KZ)) {
            return false;
        }
        ClickableSpan[] clickableSpanArr = ((2Ki) anonymousClass274).A08;
        if (i2 != 16) {
            return false;
        }
        clickableSpanArr[i].onClick(view);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0dec, code lost:
    
        X.C0s8.A18();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0df2, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v279, types: [int] */
    /* JADX WARN: Type inference failed for: r0v281, types: [int] */
    /* JADX WARN: Type inference failed for: r0v476, types: [int] */
    /* JADX WARN: Type inference failed for: r0v478, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1a(X.1LI r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 3571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rj.A1a(X.1LI, boolean):boolean");
    }

    public C1rn[] A1b() {
        return A03;
    }

    @Override // X.C1rl
    public final Object A3l(C2ko c2ko, Object obj, Object[] objArr) {
        try {
            return A16(c2ko, obj, objArr);
        } catch (Exception e) {
            1Iw r0 = c2ko.A00;
            if (r0 == null) {
                throw e;
            }
            C4Cv.A03(r0, e);
            return null;
        }
    }

    @Override // X.C1rk
    public boolean ADe() {
        if ((this instanceof 2KZ) || (this instanceof 2Kh)) {
            return true;
        }
        return this instanceof C28u ? ((C28u) this).A02.A00 : this instanceof 2Ka;
    }

    @Override // X.C1rk
    public Object AJK(Context context) {
        Object A0Z = A0Z(context);
        if (A0Z != null) {
            return A0Z;
        }
        throw 0Pz.A08("Component created null mount content, but mount content must never be null! Component: ", A0a());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ANs(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rj.ANs(X.1Im, java.lang.Object):java.lang.Object");
    }

    public final 1Iq Akd() {
        return this;
    }

    @Override // X.C1rk
    public Object B3t() {
        return getClass();
    }

    @Override // X.C1rk
    public /* synthetic */ 1Ii B3u() {
        return C29N.A00;
    }

    @Override // X.C1rk
    public Integer B6x() {
        Integer A0m = A0m();
        Integer num = 0S2.A01;
        if (A0m == num) {
            num = 0S2.A00;
        }
        return num;
    }

    @Override // X.C1rk
    public C3m7 Brt(int i) {
        return new 2zK(getClass(), i);
    }

    @Override // X.C1rk
    public int CXj() {
        int i;
        if (this instanceof C28u) {
            i = C02A.hostComponentPoolSize;
        } else {
            if (!(this instanceof 2JJ)) {
                return 3;
            }
            i = ((2JJ) this).A00;
            if (i == -1) {
                return 3;
            }
        }
        return i;
    }
}
