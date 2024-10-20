package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.settings.mesettings.surface.MessengerMePreferenceActivity;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Afg, reason: case insensitive filesystem */
/* loaded from: Afg.class */
public final class C1374Afg extends 2O4 {
    public final int A00;
    public final Object A01;

    public C1374Afg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A06(RecyclerView recyclerView, int i) {
        AfT afT;
        CNi cNi;
        DPX dpx;
        switch (this.A00) {
            case 0:
                if (i == 0) {
                    AlS alS = (AlS) this.A01;
                    int i2 = AlS.A0f;
                    CIq cIq = alS.A08;
                    String str = "impressionItemAccumulator";
                    if (cIq != null) {
                        1Du it = cIq.A02().iterator();
                        while (it.hasNext()) {
                            CHk.A00(alS, it);
                        }
                        CIq cIq2 = alS.A08;
                        if (cIq2 != null) {
                            cIq2.A0B.clear();
                            CZt cZt = alS.A05;
                            if (cZt != null) {
                                afT = cZt.A0A;
                                break;
                            } else {
                                str = "viewDataModel";
                            }
                        }
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                return;
            case 1:
                if (i == 0) {
                    afT = ((AlU) this.A01).A09;
                    break;
                } else {
                    return;
                }
            case 2:
                if (i != 0) {
                    AlB.A06((AlB) this.A01);
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
            default:
                super.A06(recyclerView, i);
                return;
            case 7:
                if (i != 0) {
                    B7E.A0A((B7E) this.A01);
                    return;
                }
                return;
            case 8:
                if (i != 0) {
                    B7D b7d = (B7D) this.A01;
                    if (b7d.A0W) {
                        BRu.A00(b7d.A0A, "omnipicker_search_bar_tag");
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (i == 0 || (dpx = (cNi = ((C1557Alb) this.A01).A0G).A0C) == null) {
                    return;
                }
                7zR.A12(dpx, cNi.A0J);
                return;
            case 10:
                ((AlO) this.A01).A00 = recyclerView.computeVerticalScrollOffset();
                return;
            case 12:
                if (i != 0) {
                    7zR.A12(recyclerView, AbI.A06(recyclerView.getContext()));
                    recyclerView.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                    recyclerView.requestFocus();
                    return;
                }
                return;
        }
        if (afT != null) {
            afT.A02();
        }
    }

    public void A07(RecyclerView recyclerView, int i, int i2) {
        int i3;
        switch (this.A00) {
            case 3:
                11T.A0F(recyclerView, 0);
                AmL amL = (AmL) this.A01;
                ImmutableList immutableList = AmL.A0X;
                1Br.A0C(amL.A0M);
                return;
            case 4:
                boolean A1X = AbJ.A1X(recyclerView);
                B5I b5i = (B5I) this.A01;
                if (A1X != b5i.A03) {
                    b5i.A03 = A1X;
                    B5I.A03(b5i);
                    return;
                }
                return;
            case 5:
                11T.A0F(recyclerView, 0);
                ((C6R) this.A01).A03 = recyclerView.canScrollVertically(-1);
                return;
            case 6:
                ((COe) this.A01).A06 = recyclerView.canScrollVertically(-1);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                super.A07(recyclerView, i, i2);
                return;
            case 11:
                if (i2 != 0) {
                    B0Y.A00((1Iw) this.A01);
                    return;
                }
                return;
            case 12:
                boolean A1X2 = AbJ.A1X(recyclerView);
                AlE alE = (AlE) this.A01;
                C3Ni c3Ni = alE.A09;
                if (c3Ni == null || alE.A0J == A1X2) {
                    return;
                }
                alE.A0J = A1X2;
                c3Ni.A00(A1X2 ? AlE.A0R : AlE.A0S);
                return;
            case 13:
                boolean A1X3 = AbJ.A1X(recyclerView);
                AlW alW = (AlW) this.A01;
                if (A1X3 != alW.A09) {
                    alW.A09 = A1X3;
                    BhV bhV = alW.A07;
                    if (bhV != null) {
                        MessengerMePreferenceActivity messengerMePreferenceActivity = bhV.A00;
                        boolean z = !messengerMePreferenceActivity.A03.A09;
                        ViewGroup viewGroup = messengerMePreferenceActivity.A00;
                        if (viewGroup != null) {
                            if (z) {
                                switch (MessengerMePreferenceActivity.A0B.intValue()) {
                                    case 1:
                                        i3 = 1;
                                        break;
                                    case 2:
                                        i3 = 2;
                                        break;
                                    case 3:
                                        i3 = 3;
                                        break;
                                    default:
                                        i3 = 4;
                                        break;
                                }
                            } else {
                                i3 = 0;
                            }
                            C2ru.A00(viewGroup, i3);
                        }
                    }
                    2O4 r0 = alW.A00;
                    if (r0 != null) {
                        r0.A07(recyclerView, i, i2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
