package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.inject.FbInjector;

/* renamed from: X.Gno, reason: case insensitive filesystem */
/* loaded from: Gno.class */
public final class C2771Gno extends IFM implements CallerContextable {
    public static final CallerContext A0A = CallerContext.A06(C2771Gno.class);
    public static final String __redex_internal_original_name = "CanvasOverlayMediaPickerPagingShortcut";
    public ImageView A00;
    public FbDraweeView A01;
    public Hdz A02;
    public boolean A03;
    public 1BY A04;
    public final C00i A05;
    public final C00i A06;
    public final JFG A07;
    public final C00i A08;
    public final 53U A09;

    public C2771Gno(ViewGroup viewGroup, AbR abR, 1BO r304, Hrw hrw, JFG jfg, 53U r307) {
        super(viewGroup, abR, hrw, C6x1.A02);
        1BV A0D = 7zN.A0D(572);
        this.A08 = A0D;
        this.A06 = 1BQ.A02(68021);
        this.A05 = 1BQ.A02(115999);
        this.A04 = 7zL.A0Q(r304);
        this.A07 = jfg;
        C1F6 c1f6 = (C1F6) A0D.get();
        HSi hSi = new HSi(this);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Hdz hdz = new Hdz(c1f6, hSi);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A02 = hdz;
            this.A09 = r307;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
