package com.facebook.chatheads.view.bubble;

import X.0FI;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1G2;
import X.1Od;
import X.1Qc;
import X.1hM;
import X.2LK;
import X.4YU;
import X.AbR;
import X.AnonymousClass001;
import X.C00i;
import X.C08134lz;
import X.C09s;
import X.C1Oj;
import X.C32a;
import X.C62j;
import X.C66h;
import X.C66i;
import X.JQx;
import X.JQy;
import X.JU3;
import X.Jvf;
import X.KNB;
import X.KeT;
import X.KeU;
import X.Kf7;
import X.KlX;
import X.Kr5;
import X.LV6;
import X.MKX;
import X.ML5;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.messaging.chatheads.view.ChatHeadsFullView;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: BubbleView.class */
public class BubbleView extends CustomFrameLayout implements 2LK {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ViewGroup A05;
    public ImageView A06;
    public KNB A07;
    public MKX A08;
    public JU3 A09;
    public KeU A0A;
    public AbR A0B;
    public KlX A0C;
    public Kf7 A0D;
    public C66i A0E;
    public SettableFuture A0F;
    public boolean A0G;
    public boolean A0H;
    public C1Oj A0I;
    public C62j A0J;
    public boolean A0K;
    public final 1Qc A0L;
    public final Map A0M;
    public final KeT A0N;
    public final C00i A0O;
    public final C00i A0P;
    public static final C66h A0R = C66h.A03(150.0d, 12.0d);
    public static final C66h A0Q = C66h.A03(65.0d, 8.5d);

    public BubbleView(Context context) {
        this(context, null);
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0M = AnonymousClass001.A0u();
        this.A0O = 1BQ.A02(99807);
        this.A0P = 1BQ.A02(49233);
        this.A0L = (1Qc) 1Bi.A03(65837);
        this.A07 = KNB.A08;
        this.A0N = new KeT(this);
        this.A0G = !1BK.A0K().AZk(36315769553823237L);
        this.A0I = (C1Oj) 1Bn.A0A(67324);
        this.A0J = (C62j) 1Bi.A03(66182);
        this.A0B = (AbR) 1Bn.A0A(359);
        A04(this);
        this.A0H = false;
        this.A0A = new KeU(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [com.google.common.util.concurrent.ListenableFuture] */
    public static ListenableFuture A00(BubbleView bubbleView, boolean z) {
        if (!bubbleView.A0H) {
            Object obj = bubbleView.A0F;
            if (obj == null) {
                obj = 1hM.A01;
            }
            return obj;
        }
        bubbleView.A01();
        SettableFuture settableFuture = bubbleView.A0F;
        if (settableFuture != null) {
            settableFuture.cancel(false);
        }
        Kf7 kf7 = bubbleView.A0D;
        if (kf7 != null) {
            ChatHeadsFullView chatHeadsFullView = kf7.A00;
            if (chatHeadsFullView.A0A != 0S2.A00) {
                ChatHeadsFullView.A02(chatHeadsFullView);
            }
        }
        ML5 A0U = JQy.A0U(bubbleView);
        if (A0U != null) {
            A0U.Bl5();
        }
        bubbleView.A0F = 4YU.A0j();
        C66i c66i = bubbleView.A0E;
        c66i.A09(A0Q);
        c66i.A06 = true;
        c66i.A07(0.0d);
        if (z || !bubbleView.A0K || !bubbleView.A0G) {
            C66i c66i2 = bubbleView.A0E;
            c66i2.A06(0.0d);
            c66i2.A02();
        }
        if (bubbleView.A0E.A0C()) {
            bubbleView.A0F.set((Object) null);
            A05(bubbleView);
        }
        bubbleView.A0H = false;
        return bubbleView.A0F;
    }

    private void A01() {
        if (this.A0E == null) {
            C66i c66i = new C66i(this.A0J);
            c66i.A09(A0R);
            c66i.A02 = 0.004999999888241291d;
            c66i.A00 = 0.004999999888241291d;
            c66i.A0A(new Jvf(this));
            this.A0E = c66i;
        }
    }

    private void A02() {
        Resources resources = getResources();
        this.A01 = resources.getDimensionPixelOffset(2131165200);
        this.A00 = resources.getDimensionPixelOffset(2131165199);
        this.A06 = (ImageView) C09s.A01(this, 2131365673);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v4 ??, still in use, count: 2, list:
          (r310v4 ??) from 0x0194: PHI (r310v5 ??) = (r310v0 ??), (r310v1 ??), (r310v2 ??), (r310v3 ??), (r310v4 ??), (r310v6 ??) binds: [B:24:0x0188, B:23:0x014a, B:22:0x0108, B:21:0x00d1, B:16:0x00b2, B:8:0x005f] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ?? I:X.81r) from 0x00c0: IPUT (r0v60 ?? I:X.9He), (r310v4 ?? I:X.81r) X.81r.A02 X.9He
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
    public static void A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v4 ??, still in use, count: 2, list:
          (r310v4 ??) from 0x0194: PHI (r310v5 ??) = (r310v0 ??), (r310v1 ??), (r310v2 ??), (r310v3 ??), (r310v4 ??), (r310v6 ??) binds: [B:24:0x0188, B:23:0x014a, B:22:0x0108, B:21:0x00d1, B:16:0x00b2, B:8:0x005f] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ?? I:X.81r) from 0x00c0: IPUT (r0v60 ?? I:X.9He), (r310v4 ?? I:X.81r) X.81r.A02 X.9He
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
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

    public static void A04(BubbleView bubbleView) {
        bubbleView.removeAllViewsInLayout();
        ViewGroup viewGroup = bubbleView.A05;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        bubbleView.A0U(2131558415);
        bubbleView.A05 = (ViewGroup) C09s.A01(bubbleView, 2131363335);
        bubbleView.A01();
        Resources resources = bubbleView.getResources();
        bubbleView.A03 = resources.getDimensionPixelOffset(2131165201);
        bubbleView.A04 = resources.getDimensionPixelOffset(2131165202);
        bubbleView.A09 = bubbleView.A0B.A02(bubbleView);
        if (bubbleView.A0G) {
            bubbleView.setScaleX(0.0f);
            bubbleView.setScaleY(0.0f);
            bubbleView.setAlpha(0.0f);
            bubbleView.A09.A00 = new LV6(bubbleView);
        }
        bubbleView.A02();
        bubbleView.A02();
        bubbleView.A03 = resources.getDimensionPixelOffset(2131165201);
        bubbleView.A04 = resources.getDimensionPixelOffset(2131165202);
        bubbleView.A01 = resources.getDimensionPixelOffset(2131165200);
        bubbleView.A00 = resources.getDimensionPixelOffset(2131165199);
    }

    public static void A05(BubbleView bubbleView) {
        ML5 A0U = JQy.A0U(bubbleView);
        if (A0U != null) {
            A0U.BrC();
        }
        1Od r0 = bubbleView.A0I.A00;
        1G2 r02 = 1Od.A0s;
        if (!r0.A0n && r0.A0q) {
            r0.A02 = ((ScheduledExecutorService) r0.A0L.get()).schedule(r0.A0O, 5000L, TimeUnit.MILLISECONDS);
        }
        synchronized (r0) {
            int i = r0.A00;
            if (i > 0) {
                int i2 = i - 1;
                r0.A00 = i2;
                0fH.A0d(Integer.valueOf(i2), Integer.valueOf(r0.A0X), "AppStateManager", "decreaseFloatingWindowsShown, activeFloatingWindowsCount=%d, activeActivitiesCount=%d");
            }
        }
        r0.A0B.get();
        r0.A0q = false;
        r0.A0k = 1BL.A09(r0.A0K);
    }

    public static void A06(BubbleView bubbleView) {
        boolean A0G;
        Kf7 kf7 = bubbleView.A0D;
        if (kf7 != null) {
            ChatHeadsFullView chatHeadsFullView = kf7.A00;
            Integer num = chatHeadsFullView.A0A;
            if (num == 0S2.A0C) {
                ChatHeadsFullView.A00(chatHeadsFullView);
            } else if (num == 0S2.A01) {
                ChatHeadsFullView.A01(chatHeadsFullView);
            }
        }
        ML5 A0U = JQy.A0U(bubbleView);
        if (A0U != null) {
            A0U.BrK();
        }
        1Od r0 = bubbleView.A0I.A00;
        1G2 r02 = 1Od.A0s;
        synchronized (r0) {
            A0G = r0.A0G();
            r0.A00++;
        }
        ScheduledFuture scheduledFuture = r0.A02;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            r0.A02 = null;
        } else if (!A0G) {
            1Od.A00(r0);
            r0.A0f = 1BL.A09(r0.A0K);
            r0.A0g = 1BL.A08(r0.A09);
        }
        0fH.A0d(Integer.valueOf(r0.A00), Integer.valueOf(r0.A0X), "AppStateManager", "increaseFloatingWindowsShown, activeFloatingWindowsCount=%d, activeActivitiesCount=%d");
        r0.A0B.get();
        r0.A0q = true;
        r0.A0l = 1BL.A09(r0.A0K);
    }

    public static void A07(BubbleView bubbleView) {
        C66i c66i = bubbleView.A0E;
        float f = 0.0f;
        float f2 = c66i != null ? (float) c66i.A09.A00 : 0.0f;
        if (bubbleView.A0G) {
            bubbleView.setScaleX(f2);
            bubbleView.setScaleY(f2);
            bubbleView.setAlpha(JQx.A03(f2, 1.0f, 0.0f));
        } else {
            if (f2 <= 0.0f) {
                f = 10000.0f;
            }
            bubbleView.setTranslationX(f);
        }
    }

    public static void A08(BubbleView bubbleView) {
        C66i c66i;
        if (((C08134lz) bubbleView.A0P.get()).A03()) {
            JU3 ju3 = bubbleView.A09;
            if (!ju3.A05.A0C() || !ju3.A06.A0C() || ((c66i = bubbleView.A0E) != null && !c66i.A0C())) {
                ((Kr5) bubbleView.A0O.get()).A01(bubbleView);
                return;
            }
        }
        ((Kr5) bubbleView.A0O.get()).A00(bubbleView);
    }

    public static void A09(BubbleView bubbleView, float f, float f2) {
        float signum = Math.signum(bubbleView.A01) * f;
        float signum2 = Math.signum(bubbleView.A00) * f2;
        bubbleView.A06.setTranslationX(signum - (r0 / 2));
        bubbleView.A06.setTranslationY(signum2 - (bubbleView.A00 / 2));
        bubbleView.setPivotX(f + bubbleView.A03);
        bubbleView.setPivotY(f2 + bubbleView.A04);
    }

    public static void A0A(BubbleView bubbleView, boolean z) {
        if (bubbleView.A0H) {
            return;
        }
        SettableFuture settableFuture = bubbleView.A0F;
        if (settableFuture != null) {
            settableFuture.cancel(false);
        }
        bubbleView.A0H = true;
        bubbleView.A0F = 4YU.A0j();
        bubbleView.A01();
        ML5 A0U = JQy.A0U(bubbleView);
        if (A0U != null) {
            A0U.Bl6();
        }
        C66i c66i = bubbleView.A0E;
        c66i.A09(A0R);
        c66i.A06 = false;
        c66i.A07(1.0d);
        if (z || !bubbleView.A0K || !bubbleView.A0G) {
            C66i c66i2 = bubbleView.A0E;
            c66i2.A06(1.0d);
            c66i2.A02();
        }
        if (bubbleView.A0E.A0C()) {
            A06(bubbleView);
            bubbleView.A0F.set((Object) null);
        }
    }

    public void A0V(int i) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2132279435) / 2;
        PointF B00 = this.A08.B00(i);
        float f = B00.x;
        float f2 = dimensionPixelOffset;
        float f3 = f + f2;
        B00.x = f3;
        float f4 = B00.y + f2;
        B00.y = f4;
        A09(this, f3, f4);
        this.A02 = i;
    }

    public Map Agf() {
        2LK A0U = JQy.A0U(this);
        if (A0U instanceof 2LK) {
            return A0U.Agf();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C66i c66i = this.A0E;
        if (c66i != null && c66i.A0C() && c66i.A01 == 1.0d) {
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (NullPointerException unused) {
            }
        }
        return true;
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1418793535);
        super.onAttachedToWindow();
        this.A0K = true;
        0FI.A0C(-899786653, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1941520769);
        super.onDetachedFromWindow();
        this.A0K = false;
        C66i c66i = this.A0E;
        if (c66i != null) {
            c66i.A01();
            this.A0E = null;
        }
        SettableFuture settableFuture = this.A0F;
        if (settableFuture != null) {
            settableFuture.cancel(false);
            this.A0F = null;
        }
        Map map = this.A0M;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            C32a c32a = (C32a) ((ML5) A1A.next());
            if (c32a.A00 != null) {
                C32a.A01(c32a);
            }
            c32a.A05.get();
        }
        map.clear();
        0FI.A0C(-17929140, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            A07(this);
        }
    }
}
