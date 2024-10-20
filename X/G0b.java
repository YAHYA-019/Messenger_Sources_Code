package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.graphql.enums.GraphQLGamesInstantPlaySupportedOrientation;

/* loaded from: G0b.class */
public abstract class G0b implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverFragment$ValidatedRunnable";
    public final /* synthetic */ DZW A00;

    public G0b(DZW dzw) {
        this.A00 = dzw;
    }

    @Override // java.lang.Runnable
    public void run() {
        DZW dzw;
        DQi dQi;
        View rootView;
        RelativeLayout.LayoutParams layoutParams;
        GKb gKb;
        String str;
        String str2;
        String str3;
        if (!this.A00.A0O) {
            if (!(this instanceof E86)) {
                if (this instanceof E85) {
                    E85 e85 = (E85) this;
                    e85.A00.A00.A0A.A0H(e85.A01);
                    return;
                }
                if (this instanceof E8B) {
                    E8B e8b = (E8B) this;
                    e8b.A00.A00.A0A.A0P(e8b.A01, e8b.A02);
                    return;
                }
                if (this instanceof E8A) {
                    E8A e8a = (E8A) this;
                    e8a.A00.A00.A0A.A0O(e8a.A01, e8a.A02);
                    return;
                }
                if (this instanceof E89) {
                    E89 e89 = (E89) this;
                    e89.A00.A00.A0A.A0L(e89.A01, e89.A02);
                    return;
                }
                if (this instanceof E7y) {
                    ((E7y) this).A00.A00.A07.A01();
                    return;
                }
                if (this instanceof E84) {
                    E84 e84 = (E84) this;
                    Ezv ezv = e84.A01.A00.A07;
                    int i = e84.A00;
                    FHM fhm = ezv.A01;
                    if (fhm != null) {
                        fhm.A02.Cqp(i);
                        return;
                    }
                    return;
                }
                if (this instanceof E88) {
                    E88 e88 = (E88) this;
                    FpE fpE = e88.A00;
                    gKb = fpE.A00.A00.A0E;
                    str = fpE.A01;
                    str2 = e88.A02;
                    str3 = e88.A01;
                } else {
                    if (this instanceof E83) {
                        E83 e83 = (E83) this;
                        FpE fpE2 = e83.A00;
                        fpE2.A00.A00.A0E.Ci7(fpE2.A01, e83.A01);
                        return;
                    }
                    if (this instanceof E82) {
                        E82 e82 = (E82) this;
                        DZW dzw2 = e82.A00.A00;
                        Context context = dzw2.getContext();
                        if (context != null) {
                            C00i c00i = dzw2.A0z;
                            Eq7 A01 = ((F8O) c00i.get()).A01(context, dzw2.A0E, e82.A01);
                            F8O f8o = (F8O) c00i.get();
                            ((EtP) f8o.A01.get()).A00(A01);
                            DKF.A0c(f8o.A02).A0C("bot_subscribe_dialog_shown");
                            return;
                        }
                        gKb = dzw2.A0E;
                        str = e82.A01;
                        str2 = "Invalid Game State";
                        str3 = "INVALID_OPERATION";
                    } else {
                        if (this instanceof E81) {
                            E81 e81 = (E81) this;
                            Ezv ezv2 = e81.A01.A00.A07;
                            int i2 = e81.A00;
                            FHM fhm2 = ezv2.A01;
                            if (fhm2 != null) {
                                fhm2.A02.Cr2(i2);
                                return;
                            }
                            return;
                        }
                        if (this instanceof E80) {
                            E80 e80 = (E80) this;
                            Fpy fpy = e80.A00;
                            DZW dzw3 = fpy.A00;
                            View view = dzw3.A00;
                            ViewGroup viewGroup = dzw3.A01;
                            if (viewGroup != null) {
                                viewGroup.removeView(view);
                            }
                            ((GKQ) dzw3.A0t.get()).BNv(new FpE(fpy, e80.A01));
                            return;
                        }
                        if (this instanceof E8C) {
                            E8C e8c = (E8C) this;
                            Fpy fpy2 = e8c.A01;
                            DZW dzw4 = fpy2.A00;
                            View view2 = dzw4.A00;
                            if (view2 != null) {
                                ViewGroup viewGroup2 = dzw4.A01;
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(view2);
                                }
                                ((GKQ) dzw4.A0t.get()).BNv((GIQ) null);
                            }
                            GKQ gkq = (GKQ) dzw4.A0t.get();
                            Activity activity = e8c.A00;
                            String str4 = e8c.A03;
                            String str5 = dzw4.A0A.A07;
                            String str6 = dzw4.A09.A0D;
                            if (str6 == null) {
                                str6 = "";
                            }
                            FpE fpE3 = new FpE(fpy2, e8c.A04);
                            String str7 = e8c.A02;
                            dzw4.A00 = gkq.BYa(activity, fpE3, str4, str5, str6, str7);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                            int i3 = 12;
                            if ("TOP".equalsIgnoreCase(str7)) {
                                i3 = 10;
                            }
                            layoutParams2.addRule(i3, -1);
                            DZW.A07(dzw4.A00, dzw4.A01, layoutParams2, dzw4);
                            return;
                        }
                        if (this instanceof E8E) {
                            E8E e8e = (E8E) this;
                            DZW dzw5 = e8e.A00;
                            Er6 er6 = dzw5.A09.A03;
                            if (er6 != null) {
                                RelativeLayout relativeLayout = dzw5.A0I;
                                if (relativeLayout == null) {
                                    GraphQLGamesInstantPlaySupportedOrientation graphQLGamesInstantPlaySupportedOrientation = er6.A0A;
                                    if (graphQLGamesInstantPlaySupportedOrientation == null) {
                                        return;
                                    }
                                    relativeLayout = new RelativeLayout(dzw5.getContext(), null, 0);
                                    GraphQLGamesInstantPlaySupportedOrientation graphQLGamesInstantPlaySupportedOrientation2 = GraphQLGamesInstantPlaySupportedOrientation.LANDSCAPE;
                                    Context context2 = relativeLayout.getContext();
                                    int i4 = 2132543204;
                                    if (graphQLGamesInstantPlaySupportedOrientation == graphQLGamesInstantPlaySupportedOrientation2) {
                                        i4 = 2132543205;
                                    }
                                    View.inflate(context2, i4, relativeLayout);
                                    dzw5.A0I = relativeLayout;
                                }
                                DZW.A07(relativeLayout, dzw5.A01, new RelativeLayout.LayoutParams(-1, -1), dzw5);
                                dzw5.A0I.A00(new FqI(e8e), er6.A0j, e8e.A08, e8e.A06, e8e.A07, e8e.A05);
                                return;
                            }
                            return;
                        }
                        if (this instanceof E8D) {
                            E8D e8d = (E8D) this;
                            DZW dzw6 = e8d.A00;
                            ((FJ0) dzw6.A0m.get()).A0A(dzw6.getContext(), (ViewGroup) C09s.A00(dzw6.requireActivity(), 2131366796), new FqG(e8d), dzw6.A0L, e8d.A03, e8d.A02, e8d.A01, e8d.A04, e8d.A06, e8d.A05);
                            return;
                        }
                        if (!(this instanceof E7z)) {
                            E87 e87 = (E87) this;
                            ETr eTr = e87.A02;
                            DZW dzw7 = e87.A01;
                            DZW.A07(eTr.A00(), dzw7.A01, new RelativeLayout.LayoutParams(-1, -1), dzw7);
                            eTr.A01(e87.A00);
                            return;
                        }
                        E7z e7z = (E7z) this;
                        dzw = e7z.A01;
                        dQi = dzw.A0G.A09;
                        rootView = dzw.A01.getRootView();
                        layoutParams = e7z.A00;
                    }
                }
                gKb.Ccf(str, str2, str3);
                return;
            }
            E86 e86 = (E86) this;
            dzw = e86.A01.A00.A00;
            dQi = dzw.A0B.A0C;
            rootView = dzw.A01.getRootView();
            layoutParams = e86.A00;
            DZW.A07(dQi, rootView, layoutParams, dzw);
        }
    }
}
