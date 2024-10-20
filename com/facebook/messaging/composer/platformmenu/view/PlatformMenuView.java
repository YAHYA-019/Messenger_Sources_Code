package com.facebook.messaging.composer.platformmenu.view;

import X.0K6;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1CO;
import X.1Du;
import X.1Fj;
import X.4YU;
import X.6PY;
import X.7zO;
import X.7zP;
import X.7zR;
import X.9Hr;
import X.9Hs;
import X.C09964s0;
import X.C0A8;
import X.C2kx;
import X.C4Ne;
import X.C9ne;
import X.QC0;
import X.QJC;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.platformmenu.row.PlatformMenuHandleBarRow;
import com.facebook.messaging.composer.platformmenu.row.PlatformMenuRow;
import com.facebook.messaging.composer.platformmenu.row.PlatformMenuSendMessageRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: PlatformMenuView.class */
public final class PlatformMenuView extends CustomLinearLayout {
    public int A00;
    public int A01;
    public LithoView A02;
    public 9Hr A03;
    public boolean A04;
    public int A05;
    public VelocityTracker A06;
    public boolean A07;
    public final C2kx A08;
    public final 1CO A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformMenuView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A08 = new C2kx();
        this.A04 = true;
        1CO A0i = 7zR.A0i();
        this.A09 = A0i;
        this.A0A = A0i.AZk(72341345347310170L);
        LithoView A0V = 7zO.A0V(context);
        this.A02 = A0V;
        addView(A0V);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A08 = new C2kx();
        this.A04 = true;
        1CO A0i = 7zR.A0i();
        this.A09 = A0i;
        this.A0A = A0i.AZk(72341345347310170L);
        LithoView A0V = 7zO.A0V(context);
        this.A02 = A0V;
        addView(A0V);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A08 = new C2kx();
        this.A04 = true;
        1CO A0i = 7zR.A0i();
        this.A09 = A0i;
        this.A0A = A0i.AZk(72341345347310170L);
        LithoView A0V = 7zO.A0V(context);
        this.A02 = A0V;
        addView(A0V);
    }

    public static final int A00(PlatformMenuView platformMenuView) {
        LithoView lithoView = platformMenuView.A02;
        if (lithoView != null) {
            return lithoView.getLayoutParams().height;
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }

    public static final int A01(PlatformMenuView platformMenuView) {
        int A00;
        int i = platformMenuView.A01;
        Context context = platformMenuView.getContext();
        if (i < 4) {
            11T.A0A(context);
            A00 = C0A8.A00(context, ((platformMenuView.A01 + (platformMenuView.A07 ? 1 : 0)) * 48) + 18 + 2);
        } else {
            11T.A0A(context);
            int A002 = C0A8.A00(context, 48.0f);
            A00 = C0A8.A00(context, 164.0f);
            double d = A00 + (A002 * 0.55d);
            if (d < A00(platformMenuView)) {
                return (int) d;
            }
        }
        return A00;
    }

    private final void A02(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.A06;
        if (velocityTracker != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            velocityTracker.addMovement(obtain);
        }
    }

    public static final void A03(PlatformMenuView platformMenuView, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(platformMenuView.getLayoutParams().height, i);
        ofInt.setDuration(100);
        C9ne.A00(ofInt, platformMenuView, 1);
        0K6.A00(ofInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bd, code lost:
    
        if (r312 == null) goto L78;
     */
    /* JADX WARN: Failed to calculate best type for var: r310v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r310v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 310, insn: 0x01f4: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r310 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:94:0x01f4 */
    /* JADX WARN: Type inference failed for: r310v0, types: [com.facebook.fury.context.ReqContext] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A04(boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.platformmenu.view.PlatformMenuView.A04(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0E(C09964s0 c09964s0, C4Ne c4Ne, 6PY r304, MigColorScheme migColorScheme, ImmutableList immutableList) {
        PlatformMenuSendMessageRow platformMenuSendMessageRow;
        1BK.A1M(immutableList, c4Ne);
        int A06 = 7zP.A06(r304, c09964s0, 2);
        11T.A0F(migColorScheme, 4);
        C4Ne c4Ne2 = C4Ne.A02;
        boolean z = true;
        this.A04 = 1BK.A1V(c4Ne, c4Ne2);
        Context A08 = 4YU.A08(this);
        int size = immutableList.size();
        int i = 66;
        if (c4Ne != c4Ne2) {
            i = (size * 48) + 18 + 2;
        }
        int A00 = C0A8.A00(A08, i);
        LithoView lithoView = this.A02;
        if (lithoView == null) {
            11T.A0L("lithoView");
            throw 0Q8.createAndThrow();
        }
        lithoView.getLayoutParams().height = Math.min(A00, (int) (c09964s0.A06() * 0.5f));
        1Du it = immutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                platformMenuSendMessageRow = null;
                break;
            }
            PlatformMenuRow platformMenuRow = (PlatformMenuRow) it.next();
            if (platformMenuRow instanceof PlatformMenuSendMessageRow) {
                platformMenuSendMessageRow = (PlatformMenuSendMessageRow) platformMenuRow;
                break;
            }
        }
        if (platformMenuSendMessageRow == null) {
            z = false;
        }
        this.A07 = z;
        QC0 qc0 = new QC0(lithoView.A09, new QJC());
        qc0.A0R();
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it2 = immutableList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(next instanceof PlatformMenuHandleBarRow) && !(next instanceof PlatformMenuSendMessageRow)) {
                A0h.m11011add(next);
            }
        }
        ImmutableList A01 = 1Fj.A01(A0h);
        QJC qjc = qc0.A01;
        qjc.A07 = A01;
        BitSet bitSet = qc0.A02;
        bitSet.set(A06);
        qjc.A02 = r304;
        bitSet.set(2);
        qjc.A01 = c4Ne;
        bitSet.set(5);
        qjc.A06 = migColorScheme;
        bitSet.set(0);
        qjc.A00 = this.A08;
        bitSet.set(4);
        qjc.A05 = new 9Hs(this);
        bitSet.set(1);
        qjc.A03 = c4Ne == c4Ne2 ? null : new Object();
        qjc.A04 = platformMenuSendMessageRow;
        7zP.A15(qc0, bitSet, qc0.A03);
        lithoView.A0y(qjc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (r0 != 4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        if (r304 < r309) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        r304 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        r301.A05 = r0;
        r0 = X.AnonymousClass001.A1Q(r0, A00(r301));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        if (r0 <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        if (r301.A00 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010b, code lost:
    
        if (r0 == r304) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        r0.height = r304;
        requestLayout();
        r301.A08.A05(0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012d, code lost:
    
        if (r0 >= A00(r301)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0136, code lost:
    
        if (r301.A00 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r304 > r309) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fb, code lost:
    
        if (r0 > 0.0f) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d3, code lost:
    
        r310 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fe, code lost:
    
        A04(r310, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0206, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cd, code lost:
    
        if (r0.height < ((A00(r301) + A01(r301)) / 2)) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.platformmenu.view.PlatformMenuView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
