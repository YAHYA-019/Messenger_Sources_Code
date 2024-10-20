package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2ku, reason: invalid class name */
/* loaded from: 2ku.class */
public final class C2ku extends Drawable implements Drawable.Callback, C2ks, TextContent {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Path A07;
    public Path A08;
    public Handler A09;
    public Layout A0A;
    public InterfaceC02083tw A0B;
    public C3hd A0C;
    public C7Za A0D;
    public CharSequence A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public ClickableSpan[] A0J;
    public float A0K;
    public float A0L;
    public ColorStateList A0M;
    public Paint A0N;
    public C03453y3 A0O;
    public boolean A0P;
    public ImageSpan[] A0Q;

    private int A00(int i, int i2) {
        float width;
        float f;
        int lineForVertical = this.A0A.getLineForVertical(i2);
        Layout.Alignment alignment = this.A0A.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = this.A0A;
        if (alignment == alignment2) {
            width = layout.getLineLeft(lineForVertical);
            f = this.A0A.getLineRight(lineForVertical);
        } else {
            int paragraphDirection = layout.getParagraphDirection(lineForVertical);
            Layout.Alignment paragraphAlignment = this.A0A.getParagraphAlignment(lineForVertical);
            boolean z = true;
            if (paragraphDirection != -1 ? !(paragraphDirection == 1 && paragraphAlignment == Layout.Alignment.ALIGN_OPPOSITE) : paragraphAlignment != Layout.Alignment.ALIGN_NORMAL) {
                z = false;
                width = this.A0A.getParagraphLeft(lineForVertical);
            } else {
                width = this.A0A.getWidth() - this.A0A.getLineMax(lineForVertical);
            }
            f = z ? r0.getParagraphRight(lineForVertical) : this.A0A.getLineMax(lineForVertical);
        }
        float f2 = i;
        if (f2 >= width && f2 <= f) {
            try {
                return this.A0A.getOffsetForHorizontal(lineForVertical, f2);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public static C03453y3 A01(C2ku c2ku) {
        Layout layout = c2ku.A0A;
        if (layout == null) {
            return null;
        }
        C03453y3 c03453y3 = c2ku.A0O;
        if (c03453y3 == null) {
            CharSequence charSequence = c2ku.A0E;
            layout.getPaint().getTextSize();
            Typeface typeface = layout.getPaint().getTypeface();
            c2ku.A0A.getPaint().getColor();
            layout.getPaint().getFontMetricsInt(null);
            layout.getSpacingMultiplier();
            layout.getSpacingAdd();
            layout.getLineCount();
            c03453y3 = new C03453y3(typeface, c2ku, charSequence);
            c2ku.A0O = c03453y3;
        }
        return c03453y3;
    }

    public static List A02(Object obj) {
        C03453y3 A01 = A01((C2ku) ((TextContent) obj));
        return A01 == null ? Collections.emptyList() : Collections.singletonList(A01.A02);
    }

    private void A03() {
        Handler handler = this.A09;
        if (handler != null) {
            handler.removeCallbacks(this.A0C);
            this.A0C = null;
        }
        this.A0G = false;
    }

    private void A04(int i, int i2) {
        if (Color.alpha(this.A02) != 0) {
            if (this.A05 == i && this.A04 == i2) {
                return;
            }
            this.A05 = i;
            this.A04 = i2;
            Paint paint = this.A0N;
            if (paint == null) {
                paint = new Paint();
                this.A0N = paint;
            }
            paint.setColor(this.A02);
            this.A0H = true;
            invalidateSelf();
        }
    }

    private void A05(Canvas canvas) {
        if (this.A01 > 0.0f) {
            TextPaint paint = this.A0A.getPaint();
            int color = paint.getColor();
            Paint.Style style = paint.getStyle();
            float strokeWidth = paint.getStrokeWidth();
            Paint.Join strokeJoin = paint.getStrokeJoin();
            paint.setStrokeJoin(Paint.Join.ROUND);
            int i = this.A03;
            if (i == 0) {
                i = C3Oq.A00(paint);
            }
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A01);
            this.A0A.draw(canvas);
            paint.setStrokeWidth(strokeWidth);
            paint.setStyle(style);
            paint.setColor(color);
            paint.setStrokeJoin(strokeJoin);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A06(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.getActionMasked()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L1b
            r0 = 0
            r307 = r0
            r0 = r303
            if (r0 != 0) goto L1e
        L1b:
            r0 = 1
            r307 = r0
        L1e:
            r0 = r301
            boolean r0 = r0.A0I
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L56
            r0 = r301
            android.graphics.Rect r0 = r0.getBounds()
            r308 = r0
            r0 = r302
            float r0 = r0.getX()
            int r0 = (int) r0
            r309 = r0
            r0 = r302
            float r0 = r0.getY()
            r306 = r0
            r0 = r306
            int r0 = (int) r0
            r305 = r0
            r0 = r308
            r1 = r309
            r2 = r305
            boolean r0 = r0.contains(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L56
            r0 = r307
            if (r0 != 0) goto L64
        L56:
            r0 = 3
            r305 = r0
            r0 = 3
            r306 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L66
        L64:
            r0 = 1
            r304 = r0
        L66:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ku.A06(android.view.MotionEvent):boolean");
    }

    public void A07() {
        this.A0O = null;
        this.A0A = null;
        this.A0L = 0.0f;
        this.A0E = null;
        this.A0J = null;
        this.A0I = false;
        this.A02 = 0;
        this.A0B = null;
        this.A0M = null;
        this.A06 = 0;
        ImageSpan[] imageSpanArr = this.A0Q;
        if (imageSpanArr == null) {
            return;
        }
        int length = imageSpanArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                this.A0Q = null;
                return;
            }
            Drawable drawable = this.A0Q[i2].getDrawable();
            drawable.setCallback(null);
            drawable.setVisible(false, false);
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r308.length <= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A08(android.content.res.ColorStateList r302, android.text.Layout r303, X.InterfaceC02083tw r304, X.C7Za r305, java.lang.CharSequence r306, java.lang.String r307, android.text.style.ClickableSpan[] r308, android.text.style.ImageSpan[] r309, float r310, float r311, float r312, float r313, int r314, int r315, int r316, int r317, boolean r318) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ku.A08(android.content.res.ColorStateList, android.text.Layout, X.3tw, X.7Za, java.lang.CharSequence, java.lang.String, android.text.style.ClickableSpan[], android.text.style.ImageSpan[], float, float, float, float, int, int, int, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0345, code lost:
    
        if (r317 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        if (r301.A0C.A00 != r317) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ef, code lost:
    
        if (r317 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0358, code lost:
    
        if (r0 != 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x035b, code lost:
    
        A04(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0363, code lost:
    
        if (r0 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0366, code lost:
    
        r0 = r301.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x036e, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x037f, code lost:
    
        if (r0.BoV(r317, r302) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0382, code lost:
    
        r317.onClick(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0391, code lost:
    
        if (r301.A0D == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x039d, code lost:
    
        if ((r317 instanceof X.8Bj) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x03a0, code lost:
    
        r0 = (X.8Bj) r317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x03a9, code lost:
    
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03ac, code lost:
    
        r0 = (X.C92x) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03be, code lost:
    
        if (r303.getAction() != 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03c1, code lost:
    
        r0 = r0.A01.A01;
        r0 = r303.getRawX();
        r0 = r303.getRawY();
        r0 = r0.A00;
        X.11T.A0F(r0, 2);
        r0 = r0.A00.BdK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03f9, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03fc, code lost:
    
        r0 = java.lang.Integer.valueOf(X.0KF.A01(r0));
        r0 = java.lang.Integer.valueOf(X.0KF.A01(r0));
        r0 = new com.facebook.messaging.msys.thread.aibot.citations.contextmenu.AiSearchCitationContextMenuFragment();
        r0.setArguments(X.0PK.A00(new X.03Y[]{X.1BK.A1G(X.7zK.A00(55), r0), X.1BK.A1G(X.7zK.A00(56), r0), X.1BK.A1G("AiSearchCitationContextMenuFragment.arg_search_source", r0)}));
        r0.A0m(r0, "AiBotCitationsContextMenuFragment_tag");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0471, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0475, code lost:
    
        if (r0 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0481, code lost:
    
        if ((r317 instanceof X.C6nn) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0484, code lost:
    
        r0 = new X.C3hd(r302, (X.C6nn) r317, r301);
        r301.A0C = r0;
        r301.A09.postDelayed(r0, android.view.ViewConfiguration.getLongPressTimeout());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x04bd, code lost:
    
        r0 = (android.text.Spanned) r301.A0E;
        A04(r0.getSpanStart(r317), r0.getSpanEnd(r317));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v295, types: [android.text.style.ClickableSpan[]] */
    /* JADX WARN: Type inference failed for: r0v301 */
    @Override // X.C2ks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CR6(android.view.View r302, android.view.MotionEvent r303) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ku.CR6(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C2ks
    public boolean Cxj(MotionEvent motionEvent) {
        if (A06(motionEvent)) {
            return true;
        }
        return (!this.A0I || this.A09 == null || motionEvent.getAction() == 0) ? false : true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 2, list:
          (r313v3 ??) from 0x00d0: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??) binds: [B:28:0x00bd, B:31:0x00cb] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:android.graphics.Path) from 0x00cd: IPUT (r313v3 ?? I:android.graphics.Path), (r301v0 'this' ?? I:X.2ku A[IMMUTABLE_TYPE, THIS]) A[Catch: IndexOutOfBoundsException -> 0x010d] X.2ku.A07 android.graphics.Path
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
    @Override // android.graphics.drawable.Drawable
    public void draw(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 2, list:
          (r313v3 ??) from 0x00d0: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??) binds: [B:28:0x00bd, B:31:0x00cb] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:android.graphics.Path) from 0x00cd: IPUT (r313v3 ?? I:android.graphics.Path), (r301v0 'this' ?? I:X.2ku A[IMMUTABLE_TYPE, THIS]) A[Catch: IndexOutOfBoundsException -> 0x010d] X.2ku.A07 android.graphics.Path
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

    @Override // com.facebook.litho.TextContent
    public List getItems() {
        C03453y3 A01 = A01(this);
        return A01 == null ? Collections.emptyList() : Collections.singletonList(A01);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        boolean z = false;
        if (this.A0M != null) {
            z = true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Layout layout;
        if (this.A0M != null && (layout = this.A0A) != null) {
            int color = layout.getPaint().getColor();
            int colorForState = this.A0M.getColorForState(iArr, this.A06);
            if (colorForState != color) {
                this.A0A.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
