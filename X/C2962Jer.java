package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContainer;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.Jer, reason: case insensitive filesystem */
/* loaded from: Jer.class */
public final class C2962Jer extends 0xW {
    public final int A00;
    public final Object A01;

    public C2962Jer(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onAnimationEnd(View view) {
        ViewGroup viewGroup;
        6QN r307;
        View view2;
        switch (this.A00) {
            case 0:
                r307 = ((LjW) this.A01).A00;
                r307.A0M.setAlpha(1.0f);
                r307.A0O.A08((0Sl) null);
                r307.A0O = null;
                return;
            case 1:
                r307 = (6QN) this.A01;
                r307.A0M.setAlpha(1.0f);
                r307.A0O.A08((0Sl) null);
                r307.A0O = null;
                return;
            case 2:
                6QN r0 = ((LLR) this.A01).A01;
                r0.A0M.setVisibility(8);
                PopupWindow popupWindow = r0.A0B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else {
                    JR2.A0c(r0);
                }
                r0.A0M.A04();
                r0.A0O.A08((0Sl) null);
                r0.A0O = null;
                viewGroup = r0.A09;
                viewGroup.requestApplyInsets();
                return;
            case 3:
                LLe lLe = (LLe) this.A01;
                if (lLe.A0C && (view2 = lLe.A02) != null) {
                    view2.setTranslationY(0.0f);
                    lLe.A07.setTranslationY(0.0f);
                }
                lLe.A07.setVisibility(8);
                ActionBarContainer actionBarContainer = lLe.A07;
                actionBarContainer.A04 = false;
                actionBarContainer.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                lLe.A06 = null;
                MJu mJu = lLe.A04;
                if (mJu != null) {
                    mJu.BtJ(lLe.A05);
                    lLe.A05 = null;
                    lLe.A04 = null;
                }
                viewGroup = lLe.A09;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.requestApplyInsets();
                return;
            default:
                LLe lLe2 = (LLe) this.A01;
                lLe2.A06 = null;
                lLe2.A07.requestLayout();
                return;
        }
    }

    public void onAnimationStart(View view) {
        switch (this.A00) {
            case 0:
                ((LjW) this.A01).A00.A0M.setVisibility(0);
                return;
            case 1:
                6QN r0 = (6QN) this.A01;
                r0.A0M.setVisibility(0);
                JR2.A0c(r0);
                return;
            default:
                super.onAnimationStart(view);
                return;
        }
    }
}
