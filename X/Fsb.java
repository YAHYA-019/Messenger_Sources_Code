package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: Fsb.class */
public final class Fsb implements GL6, GIi {
    public GGc A00;
    public ErO A01;
    public ImmutableList A02;
    public boolean A03;
    public final Toolbar A04;
    public final View.OnClickListener A05;
    public final View.OnTouchListener A06;
    public final MDw A07;

    public Fsb(Toolbar toolbar) {
        if (toolbar == null) {
            throw 1BK.A0h();
        }
        this.A04 = toolbar;
        ImmutableList immutableList = RXM.A00;
        this.A02 = ImmutableList.of();
        this.A03 = true;
        FXq A00 = FXq.A00(this, ActionId.MESSENGER_THREAD_LIST_DISPLAYED);
        this.A05 = A00;
        View.OnTouchListener fy5 = new FY5(this, 7);
        this.A06 = fy5;
        FYe fYe = new FYe(this, 4);
        this.A07 = fYe;
        toolbar.A0Q(A00);
        View findViewById = toolbar.findViewById(2131368256);
        if (findViewById != null) {
            findViewById.setOnTouchListener(fy5);
        }
        toolbar.A0I = fYe;
    }

    private final void A00(int i) {
        Toolbar toolbar = this.A04;
        Context context = toolbar.getContext();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            C1uv c1uv = C1uu.A03;
            drawable.setColorFilter(C1uv.A00(0NA.A01(context, 2130969146, 7zM.A02(context, 2MR.A1Z))));
        }
        toolbar.A0P(drawable);
    }

    @Override // X.GIi
    public void BOE() {
        this.A04.setVisibility(8);
    }

    @Override // X.GL6
    public void Cm8(View.OnClickListener onClickListener) {
        throw AnonymousClass001.A0q("Not supported. Try setHasBackButton().");
    }

    @Override // X.GL6
    public void CmO(List list) {
        if (list == null) {
            list = ImmutableList.of();
        }
        this.A02 = ImmutableList.copyOf((Collection) list);
        LQD A0F = this.A04.A0F();
        A0F.clear();
        ImmutableList immutableList = RXM.A00;
        ImmutableList immutableList2 = this.A02;
        11T.A09(immutableList2);
        EY2.A00(A0F, immutableList2);
        RXM.A00(A0F, this.A01, this.A02);
    }

    @Override // X.GL6
    public void CpM(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            if (z) {
                A00(2131230726);
            } else {
                this.A04.A0P(null);
            }
        }
    }

    @Override // X.GL6
    public void Crl(GGc gGc) {
        11T.A0F(gGc, 0);
        this.A00 = gGc;
    }

    @Override // X.GL6
    public void Cs3(ErO erO) {
        this.A01 = erO;
    }

    @Override // X.GL6
    public void CvU(int i) {
        CvV(DKD.A0q(this.A04, i));
    }

    @Override // X.GL6
    public void CvV(CharSequence charSequence) {
        this.A04.A0T(charSequence);
    }

    @Override // X.GL6
    public void CvZ(View.OnClickListener onClickListener) {
        CpM(false);
        A00(2132345138);
        Crl(new FsZ(this, onClickListener, 8));
    }

    @Override // X.GIi
    public void D0S() {
        this.A04.setVisibility(0);
    }
}
