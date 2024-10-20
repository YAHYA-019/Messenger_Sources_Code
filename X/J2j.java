package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.composer.CanvasEditorView;

/* loaded from: J2j.class */
public final class J2j implements Runnable {
    public static final String __redex_internal_original_name = "MultimediaEditorView$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ CanvasEditorView A04;

    public J2j(CanvasEditorView canvasEditorView, int i, int i2, int i3, int i4) {
        this.A04 = canvasEditorView;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        CanvasEditorView canvasEditorView = this.A04;
        int i = this.A03;
        int i2 = this.A00;
        int i3 = this.A02;
        int i4 = this.A01;
        HmH hmH = canvasEditorView.A09;
        if (hmH == null || i3 == 0 || i4 == 0) {
            return;
        }
        IWi iWi = hmH.A00;
        if (iWi.A0D == IWi.A0b) {
            IQ1 iq1 = iWi.A0W.A00;
            CallerContext callerContext = IQ1.A1m;
            iq1.A1C.A0T(i, i2);
        }
    }
}
