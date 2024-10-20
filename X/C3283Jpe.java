package X;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jpe, reason: case insensitive filesystem */
/* loaded from: Jpe.class */
public final class C3283Jpe extends JSq implements 2hW {
    public final Rect A00;
    public final RenderNode A01;
    public final RenderNode A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3283Jpe(Drawable drawable, ELr eLr, Float f, Object obj, float f2, float f3, int i) {
        super(drawable);
        float f4;
        int i2 = i;
        this.A03 = obj;
        Rect A0C = DKC.A0C();
        this.A00 = A0C;
        this.A02 = new RenderNode("content");
        this.A01 = new RenderNode("blur");
        A0C.set(drawable.getBounds());
        2yD A0c = DKE.A0c();
        float floatValue = f != null ? f.floatValue() : 1.0f;
        float f5 = 0.8f;
        if (A02(eLr)) {
            floatValue = (float) A0c.Ai7(73184361528361039L);
            f5 = (float) A0c.Ai7(73184361528229965L);
            f4 = (float) A0c.Ai7(73184361528295502L);
            try {
                i2 = KWT.A00(A0c.BCy(72902886552043655L));
            } catch (NumberFormatException unused) {
            }
        } else {
            f4 = 0.0f;
        }
        this.A01.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (i2 >>> 16) & 255, 0.0f, 0.0f, 0.0f, 0.0f, (i2 >>> 8) & 255, 0.0f, 0.0f, 0.0f, 0.0f, i2 & 255, 0.0f, 0.0f, 0.0f, f5, f4}))), RenderEffect.createBlurEffect(f2 * floatValue, f3 * floatValue, Shader.TileMode.CLAMP)));
    }

    private final void A00() {
        RenderNode renderNode = this.A02;
        Rect rect = this.A00;
        renderNode.setPosition(rect);
        Rect rect2 = new Rect(rect);
        rect2.inset(-(rect.width() / 8), -(rect.height() / 8));
        RenderNode renderNode2 = this.A01;
        renderNode2.setPosition(rect2);
        RecordingCanvas beginRecording = renderNode.beginRecording();
        11T.A0A(beginRecording);
        try {
            super.draw(beginRecording);
            renderNode.endRecording();
            RecordingCanvas beginRecording2 = renderNode2.beginRecording();
            11T.A0A(beginRecording2);
            try {
                beginRecording2.translate((rect2.width() / 2.0f) - (rect.width() / 2.0f), (rect2.height() / 2.0f) - (rect.height() / 2.0f));
                beginRecording2.drawRenderNode(renderNode);
            } finally {
                renderNode2.endRecording();
            }
        } catch (Throwable th) {
            renderNode.endRecording();
            throw th;
        }
    }

    public static final boolean A01(ELr eLr) {
        return A02(eLr);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    public static final boolean A02(ELr eLr) {
        long j;
        2yD A0c = DKE.A0c();
        if (eLr == null) {
            return false;
        }
        switch (eLr.ordinal()) {
            case 0:
                j = 72339936598952447L;
                return A0c.AZk(j);
            case 1:
                j = 72339936599804426L;
                return A0c.AZk(j);
            case 2:
                j = 72339936599935500L;
                return A0c.AZk(j);
            case 3:
                j = 72339936599869963L;
                return A0c.AZk(j);
            case 4:
                j = 72339936600066574L;
                return A0c.AZk(j);
            case 5:
                j = 72339936600001037L;
                return A0c.AZk(j);
            case 6:
                j = 72339936598493694L;
                return A0c.AZk(j);
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r0.equals(((X.C3283Jpe) r302).A03) == false) goto L8;
     */
    /* renamed from: BSD, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSF(X.2hW r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            boolean r0 = r0 instanceof X.C3283Jpe
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r301
            java.lang.Object r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L34
            r0 = r302
            X.Jpe r0 = (X.C3283Jpe) r0
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.A03
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L38
        L34:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L38:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3283Jpe.BSF(X.2hW):boolean");
    }

    public void draw(Canvas canvas) {
        11T.A0F(canvas, 0);
        if (!canvas.isHardwareAccelerated()) {
            super.draw(canvas);
            return;
        }
        RenderNode renderNode = this.A01;
        if (!renderNode.hasDisplayList() || !this.A02.hasDisplayList()) {
            A00();
        }
        canvas.drawRenderNode(renderNode);
        canvas.drawRenderNode(this.A02);
    }

    public Drawable.ConstantState getConstantState() {
        if (DKE.A0c().AZk(72339189283619110L)) {
            return new JVF(this);
        }
        return null;
    }

    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super.onBoundsChange(rect);
        this.A00.set(rect);
        A00();
    }
}
