package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;
import com.facebook.messaging.montage.util.customimage.MontageCustomImageUtil;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Gnj, reason: case insensitive filesystem */
/* loaded from: Gnj.class */
public final class C2766Gnj extends IFM {
    public int A00;
    public View A01;
    public Ih2 A02;
    public DLP A03;
    public final C00i A04;
    public final HSs A05;
    public final MontageCustomImageUtil A06;
    public final Executor A07;

    public C2766Gnj(ViewGroup viewGroup, FbUserSession fbUserSession, AbR abR, Hrw hrw, HSs hSs, C6x1 c6x1) {
        super(viewGroup, abR, hrw, c6x1);
        this.A00 = 0;
        this.A04 = 1BQ.A02(115988);
        hSs.getClass();
        this.A05 = hSs;
        this.A06 = (MontageCustomImageUtil) 1Lo.A06(fbUserSession, 68409);
        this.A07 = AbJ.A1D();
    }

    public static void A00(C2766Gnj c2766Gnj) {
        GradientDrawable gradientDrawable;
        C2630Gjf c2630Gjf;
        if (c2766Gnj.A09() != null) {
            View requireViewById = c2766Gnj.A01.requireViewById(2131363103);
            LayerDrawable layerDrawable = (LayerDrawable) requireViewById.getBackground();
            MontageCustomImageUtil montageCustomImageUtil = c2766Gnj.A06;
            List list = montageCustomImageUtil.A02;
            Integer valueOf = (list == null || (c2630Gjf = (C2630Gjf) list.get(montageCustomImageUtil.A00)) == null) ? null : Integer.valueOf(c2630Gjf.A01);
            if (layerDrawable == null) {
                gradientDrawable = null;
            } else {
                gradientDrawable = (GradientDrawable) layerDrawable.findDrawableByLayerId(2131363104);
                if (gradientDrawable != null) {
                    gradientDrawable.setStroke(C0A8.A00(c2766Gnj.A01.getContext(), 2.0f), -1);
                }
            }
            if (!C1ub.A03()) {
                if (layerDrawable == null || valueOf == null) {
                    return;
                }
                layerDrawable.setDrawableByLayerId(2131362338, c2766Gnj.A01.getContext().getDrawable(valueOf.intValue()));
                layerDrawable.invalidateSelf();
                return;
            }
            Context context = c2766Gnj.A01.getContext();
            11T.A0F(context, 0);
            Integer num = 0S2.A00;
            C3kz A01 = 2aK.A01(num, 0DL.A00, new AJi(context, montageCustomImageUtil, null, 47), 2Zy.A01(2Zo.A02(num)));
            C3e5 c3e5 = new C3e5(A01);
            A01.BQH(new C3km(A01, c3e5, 2));
            1Kd.A0F(new Inh(3, gradientDrawable, requireViewById, c2766Gnj), c3e5, c2766Gnj.A07);
        }
    }

    public static void A01(C2766Gnj c2766Gnj, MontageBackgroundColor montageBackgroundColor) {
        if (c2766Gnj.A09() != null) {
            LayerDrawable layerDrawable = (LayerDrawable) c2766Gnj.A01.requireViewById(2131363103).getBackground();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, montageBackgroundColor.A01);
            gradientDrawable.setShape(1);
            if (layerDrawable != null) {
                layerDrawable.setDrawableByLayerId(2131362338, gradientDrawable);
                layerDrawable.invalidateSelf();
            }
        }
    }
}
