package X;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aka, reason: case insensitive filesystem */
/* loaded from: Aka.class */
public abstract class AbstractC1522Aka extends 1pK {
    public static final String __redex_internal_original_name = "AbstractOmnipickerGroupCentricFragment";
    public DHH A00;

    public static AbstractC1522Aka A03(M4OmnipickerParam m4OmnipickerParam, ImmutableList immutableList, String str) {
        B7A b79 = m4OmnipickerParam.A0S ? new B79() : m4OmnipickerParam.A0J ? new B7A() : m4OmnipickerParam.A0G ? new B7E() : m4OmnipickerParam.A0K ? new B7C() : m4OmnipickerParam.A0N ? new B7D() : new B7D();
        C00j.A05("AbstractOmnipickerGroupCentricFragment.createNewInstance()", 854577004);
        try {
            Bundle A05 = 1BK.A05();
            A05.putParcelableArrayList("prepicked_users", 1BK.A17(immutableList));
            A05.putParcelable("omnipicker_param", m4OmnipickerParam);
            A05.putString("query_text", str);
            b79.setArguments(A05);
            C00j.A01(456787324);
            return b79;
        } catch (Throwable th) {
            C00j.A01(936713605);
            throw th;
        }
    }

    public void A1X() {
        DHH dhh;
        if (this instanceof B7D) {
            B7D b7d = (B7D) this;
            if (b7d.getChildFragmentManager().A0U() > 0) {
                b7d.getChildFragmentManager().A0w();
                return;
            }
            if (b7d.A0W) {
                B7D.A0J(b7d);
                return;
            }
            if (b7d.A13.size() >= 2) {
                1Bn.A0A(67527);
                DR6 A01 = C5ic.A01(b7d.A03, AbF.A0p(b7d.A0i));
                A01.A00(2131963346);
                A01.A06(2131963344);
                A01.A0K(true);
                CSG.A04(A01, b7d, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES, 2131963345);
                CSG.A05(A01, b7d, 125, 2131963343);
                7zN.A13(A01);
                return;
            }
            AbI.A1P((C9kO) b7d.A0j.get(), 26);
            dhh = b7d.A00;
        } else if (this instanceof B79) {
            B79 b79 = (B79) this;
            7zR.A12(b79.A02, (InputMethodManager) b79.A09.get());
            Bg3 bg3 = b79.A03;
            if (bg3 != null) {
                B7D b7d2 = bg3.A00;
                if (b7d2.getChildFragmentManager().A0U() > 0) {
                    b7d2.getChildFragmentManager().A0w();
                    LithoView lithoView = b7d2.A0A;
                    if (lithoView != null) {
                        lithoView.setImportantForAccessibility(1);
                        return;
                    }
                    return;
                }
                dhh = b7d2.A00;
            } else {
                dhh = ((AbstractC1522Aka) b79).A00;
            }
        } else {
            if (!(this instanceof B7A)) {
                B7E b7e = (B7E) this;
                if (b7e.A06.A0C) {
                    B7E.A09(b7e);
                    return;
                }
                DHH dhh2 = b7e.A00;
                if (dhh2 != null) {
                    dhh2.C8W();
                }
                if (b7e.A06.A0V.A0w()) {
                    B3q b3q = (B3q) b7e.A0F.get();
                    b3q.A04(4YV.A0Z(b3q.A00), CancelReason.USER_CANCELLED);
                    return;
                }
                return;
            }
            dhh = this.A00;
        }
        dhh.C8W();
    }
}
