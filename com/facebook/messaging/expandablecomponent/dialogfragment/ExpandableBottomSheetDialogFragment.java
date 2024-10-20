package com.facebook.messaging.expandablecomponent.dialogfragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Br;
import X.1Iw;
import X.2Ov;
import X.2RH;
import X.2cK;
import X.2cM;
import X.3PT;
import X.4YU;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.BI9;
import X.C00g;
import X.C09s;
import X.C0W;
import X.C1rs;
import X.CZD;
import X.QDe;
import X.QIQ;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.media.mediatraydialogfragment.MediaTrayDialogFragment;
import com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: ExpandableBottomSheetDialogFragment.class */
public abstract class ExpandableBottomSheetDialogFragment extends 2Ov implements C00g {
    public ExpandableBottomSheetDialogFragmentContainer A00;
    public MigColorScheme A01;
    public final 1Br A02 = 7zN.A0I(this);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        return new BI9(getContext(), this, A0l());
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(827274913);
        super.onCreate(bundle);
        this.A01 = bundle != null ? (MigColorScheme) bundle.getParcelable(1BJ.A00(70)) : null;
        A0g(1, 2132608308);
        0FI.A08(1552974159, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1953099754);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541943, viewGroup, false);
        0FI.A08(432595298, A02);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable(1BJ.A00(70), this.A01);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        ExpandableBottomSheetDialogFragmentContainer A01 = C09s.A01(view, 2131363946);
        this.A00 = A01;
        if (A01 != null) {
            Context A08 = 4YU.A08(view);
            MediaTrayDialogFragment mediaTrayDialogFragment = (MediaTrayDialogFragment) this;
            mediaTrayDialogFragment.A00 = (SwipeableMediaTrayContainerView) C09s.A01(LayoutInflater.from(A08).inflate(2132543422, (ViewGroup) null, false), 2131367772);
            mediaTrayDialogFragment.A1C();
            A01.A0J.addView(mediaTrayDialogFragment.A00);
            ExpandableBottomSheetDialogFragmentContainer expandableBottomSheetDialogFragmentContainer = this.A00;
            if (expandableBottomSheetDialogFragmentContainer != null) {
                SwipeableMediaTrayContainerView swipeableMediaTrayContainerView = mediaTrayDialogFragment.A00;
                if (swipeableMediaTrayContainerView != null) {
                    View A012 = C09s.A01(swipeableMediaTrayContainerView, 2131367785);
                    ViewGroup viewGroup = (ViewGroup) A012.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(A012);
                    }
                    expandableBottomSheetDialogFragmentContainer.A0K.addView(A012);
                }
                ExpandableBottomSheetDialogFragmentContainer expandableBottomSheetDialogFragmentContainer2 = this.A00;
                if (expandableBottomSheetDialogFragmentContainer2 != null) {
                    1Iw A0W = 7zL.A0W(A08);
                    2cM A013 = 2cK.A01(A0W, (String) null, 0);
                    QDe qDe = new QDe(A0W, new QIQ());
                    MigColorScheme migColorScheme = this.A01;
                    if (migColorScheme == null) {
                        migColorScheme = 7zQ.A0m(this.A02);
                    }
                    QIQ qiq = qDe.A01;
                    qiq.A00 = migColorScheme;
                    BitSet bitSet = qDe.A02;
                    bitSet.set(0);
                    4YU.A1M(qDe, 2RH.A07);
                    qDe.A0L();
                    C1rs.A05(bitSet, qDe.A03, 1);
                    qDe.A0J();
                    A013.A2e(qiq);
                    7zO.A1G(A013, 2RH.A05);
                    expandableBottomSheetDialogFragmentContainer2.A0L.A0y(A013.A00);
                    ExpandableBottomSheetDialogFragmentContainer expandableBottomSheetDialogFragmentContainer3 = this.A00;
                    if (expandableBottomSheetDialogFragmentContainer3 != null) {
                        expandableBottomSheetDialogFragmentContainer3.A00 = 0.9f;
                        expandableBottomSheetDialogFragmentContainer3.A04 = false;
                        expandableBottomSheetDialogFragmentContainer3.A0V();
                        ExpandableBottomSheetDialogFragmentContainer expandableBottomSheetDialogFragmentContainer4 = this.A00;
                        if (expandableBottomSheetDialogFragmentContainer4 != null) {
                            MigColorScheme migColorScheme2 = this.A01;
                            if (migColorScheme2 == null) {
                                migColorScheme2 = 7zQ.A0m(this.A02);
                            }
                            expandableBottomSheetDialogFragmentContainer4.setBackgroundTintList(ColorStateList.valueOf(migColorScheme2.BDl()));
                            ExpandableBottomSheetDialogFragmentContainer expandableBottomSheetDialogFragmentContainer5 = this.A00;
                            if (expandableBottomSheetDialogFragmentContainer5 != null) {
                                expandableBottomSheetDialogFragmentContainer5.A03 = new C0W(this);
                                Dialog A0e = A0e();
                                MigColorScheme migColorScheme3 = this.A01;
                                if (migColorScheme3 == null) {
                                    migColorScheme3 = 7zQ.A0m(this.A02);
                                }
                                11T.A0F(migColorScheme3, 1);
                                Window window = A0e.getWindow();
                                if (window == null) {
                                    throw 1BK.A0h();
                                }
                                3PT.A00(window, migColorScheme3);
                                CZD.A01(C09s.A01(view, 2131363945), this, ActionId.ACTION_BAR_COMPLETE);
                                return;
                            }
                        }
                    }
                }
            }
        }
        11T.A0L("container");
        throw 0Q8.createAndThrow();
    }
}
