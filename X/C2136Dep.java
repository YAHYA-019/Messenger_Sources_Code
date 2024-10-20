package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import com.facebook.fbui.popover.PopoverViewFlipper;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.Dep, reason: case insensitive filesystem */
/* loaded from: Dep.class */
public final class C2136Dep extends FIU {
    public int A00;
    public DPx A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Handler A07;
    public final Runnable A08;

    public C2136Dep(Context context) {
        super(context, 0);
        this.A08 = new S7S(this);
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelOffset(R.dimen.mapbox_four_dp);
        this.A05 = resources.getDimensionPixelOffset(2132279369);
        this.A06 = resources.getDimensionPixelOffset(2132279305);
        this.A07 = AnonymousClass001.A07();
        ((FIU) this).A0I.setBackgroundResource(0);
        A0G(" ");
        if (((FIU) this).A00 != 0.0f) {
            ((FIU) this).A00 = 0.0f;
        }
        if (this.A02) {
            A0I(false);
        }
        ((FIU) this).A0Q = false;
    }

    public void A06() {
        super.A06();
        if (this.A03) {
            this.A07.removeCallbacks(this.A08);
            this.A03 = false;
        }
    }

    public void A07() {
        super.A07();
        if (((FIU) this).A0Z) {
            return;
        }
        if (this.A03) {
            this.A07.removeCallbacks(this.A08);
        }
        if (this.A02) {
            Context context = ((FIU) this).A0F;
            11T.A0A(context);
            if (1rB.A00(context)) {
                Handler handler = this.A07;
                Runnable runnable = this.A08;
                int i = this.A00;
                if (i == 0) {
                    i = 8000;
                }
                handler.postDelayed(runnable, i);
                return;
            }
        }
        if (this.A00 > 0) {
            Context context2 = ((FIU) this).A0F;
            11T.A0A(context2);
            if (1rB.A00(context2)) {
                return;
            }
            this.A07.postDelayed(this.A08, this.A00);
            this.A03 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.GHn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.GJo, java.lang.Object] */
    public void A09() {
        PopoverViewFlipper popoverViewFlipper = ((FIU) this).A0I;
        ?? obj = new Object();
        popoverViewFlipper.setAlpha(1.0f);
        popoverViewFlipper.setScaleX(1.0f);
        popoverViewFlipper.setScaleY(1.0f);
        popoverViewFlipper.A04 = obj;
        PopoverViewFlipper popoverViewFlipper2 = ((FIU) this).A0I;
        popoverViewFlipper2.A03 = new Object();
        popoverViewFlipper2.setPadding(popoverViewFlipper2.getPaddingLeft(), ((FIU) this).A0F.getResources().getDimensionPixelOffset(R.dimen.mapbox_four_dp), ((FIU) this).A0I.getPaddingRight(), ((FIU) this).A0I.getPaddingBottom());
    }

    public void A0B(View view) {
        11T.A0F(view, 0);
        if (!(view instanceof DPx)) {
            throw AnonymousClass001.A0L("Expecting View to be of type FDSTooltipView");
        }
        super.A0B(view);
        if (!this.A02) {
            Context context = ((FIU) this).A0F;
            11T.A0A(context);
            if (1rB.A00(context)) {
                FXr.A03(view, this, 43);
            }
        }
        ((FIU) this).A0I.setClipToPadding(false);
        ((FIU) this).A0I.setClipChildren(false);
        this.A01 = (DPx) view;
    }
}
