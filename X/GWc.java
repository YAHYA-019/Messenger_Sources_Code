package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: GWc.class */
public final class GWc extends 2Xd {
    public ImmutableList A00 = 1BK.A0b();
    public final View.OnClickListener A01;
    public final View.OnClickListener A02;

    public GWc(HxI hxI) {
        this.A01 = IKE.A00(hxI, ActionId.MESSENGER_DELTA_REQUEST);
        this.A02 = IKE.A00(hxI, ActionId.APP_FIRST_VIEW_CONTROLLER);
    }

    public static void A00(Context context, ViewGroup viewGroup) {
        LayoutInflater.from(context).inflate(2132541702, viewGroup);
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(resources.getDimensionPixelSize(2132279368), resources.getDimensionPixelSize(2132279368));
        marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(2132279305));
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Type inference failed for: r312v3, types: [X.HV3, java.lang.Object] */
    public void BlZ(C2lb c2lb, int i) {
        HV3 hv3;
        11T.A0F(c2lb, 0);
        int i2 = c2lb.A01;
        if (i2 != 1) {
            if (i2 == 0) {
                View.OnClickListener onClickListener = this.A02;
                View view = c2lb.A0I;
                view.setOnClickListener(onClickListener);
                11T.A0I(view, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.impl.chiclet.SelfParticipantChicletContainer");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Context A08 = 4YU.A08(view);
                11T.A0D(layoutParams);
                layoutParams.width = A08.getResources().getDimensionPixelSize(2132279368);
                layoutParams.height = DKG.A01(A08, 2132279368);
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        String str = (String) 4YU.A0q(this.A00, i);
        View.OnClickListener onClickListener2 = this.A01;
        11T.A0F(str, 0);
        View view2 = c2lb.A0I;
        11T.A0I(view2, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.impl.chiclet.ChicletParticipantContainer");
        C00i c00i = ((H5H) view2).A00;
        if (c00i == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        Gqc gqc = (Gqc) c00i.get();
        if (!str.equals(gqc.A00)) {
            gqc.A00 = str;
            JDB jdb = ((GS2) gqc).A01;
            if (AbM.A1a(jdb)) {
                IZZ izz = (IZZ) AbM.A0r(jdb);
                ?? obj = new Object();
                izz.getClass();
                ((HV3) obj).A00 = izz.A00;
                hv3 = obj;
            } else {
                hv3 = new HV3();
            }
            hv3.A00 = str;
            gqc.A0Z(new IZZ(hv3));
        }
        view2.setOnClickListener(onClickListener2);
        11T.A0I(view2, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.impl.chiclet.ChicletParticipantContainer");
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        Context A082 = 4YU.A08(view2);
        11T.A0D(layoutParams2);
        layoutParams2.width = A082.getResources().getDimensionPixelSize(2132279368);
        layoutParams2.height = DKG.A01(A082, 2132279368);
        view2.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [com.facebook.widget.CustomFrameLayout, android.view.View, X.H4E, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.widget.CustomFrameLayout, android.view.View, X.H5H, android.view.ViewGroup] */
    public C2lb Bs3(ViewGroup viewGroup, int i) {
        String str;
        11T.A0F(viewGroup, 0);
        if (i != 0) {
            List list = C2lb.A0J;
            ?? customFrameLayout = new CustomFrameLayout(4YU.A08(viewGroup));
            customFrameLayout.A00 = 1Bu.A00(115707);
            Context A08 = 4YU.A08((View) customFrameLayout);
            customFrameLayout.A01 = 1HG.A00(A08, 115350);
            A00(A08, customFrameLayout);
            customFrameLayout.A02 = (FbFrameLayout) DKG.A0B((View) customFrameLayout, 2131366310);
            return new C2lb(customFrameLayout);
        }
        ?? customFrameLayout2 = new CustomFrameLayout(4YU.A08(viewGroup));
        customFrameLayout2.A01 = (Hkr) 1Bn.A0A(115704);
        Context context = customFrameLayout2.getContext();
        A00(context, customFrameLayout2);
        customFrameLayout2.setImportantForAccessibility(2);
        customFrameLayout2.A02 = (FbFrameLayout) DKG.A0B((View) customFrameLayout2, 2131366310);
        Hkr hkr = customFrameLayout2.A01;
        if (hkr == null) {
            str = "participantViewCreator";
        } else {
            H5G A00 = hkr.A00(context, IDw.A01((View) customFrameLayout2, "SelfParticipantChicletContainer"), 4);
            FbFrameLayout fbFrameLayout = customFrameLayout2.A02;
            if (fbFrameLayout != null) {
                fbFrameLayout.addView(A00);
                customFrameLayout2.A00 = A00;
                return new C2lb(customFrameLayout2);
            }
            str = "selfViewHolder";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public int getItemCount() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        return 7zL.A1X(this.A00.get(i), "SELF_ID") ? 1 : 0;
    }
}
