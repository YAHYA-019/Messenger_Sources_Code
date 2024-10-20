package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Jhr, reason: case insensitive filesystem */
/* loaded from: Jhr.class */
public final class C3058Jhr extends 2Xd {
    public KfJ A00;
    public 1BY A02;
    public final AbR A03 = (AbR) 1Bn.A0B(790);
    public ImmutableList A01 = ImmutableList.of();

    public C3058Jhr(1BO r302) {
        this.A02 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        Q3Y q3y = (Q3Y) c2lb;
        KTN ktn = (KTN) this.A01.get(i);
        KfJ kfJ = this.A00;
        if (ktn != null) {
            q3y.A02.setImageURI(ktn.A00);
            TextView textView = q3y.A03;
            C00i c00i = q3y.A06;
            JR1.A1D(textView, (C22a) c00i.get(), ktn.A03);
            JR1.A1D(q3y.A04, (C22a) c00i.get(), ktn.A04);
            GlyphButton glyphButton = q3y.A05;
            glyphButton.setVisibility(8);
            View view = ktn.A02;
            View view2 = q3y.A01;
            if (view != null) {
                view2.setVisibility(0);
                R1Q.A00(view, (ViewGroup) view2);
            } else {
                view2.setVisibility(8);
            }
            q3y.A0I.setOnClickListener(new LKM(5, kfJ, q3y, ktn));
            glyphButton.setOnClickListener(new LKM(6, kfJ, q3y, ktn));
        }
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        View A08 = AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132542830);
        AbR abR = this.A03;
        Context A00 = 1Bf.A00(abR);
        try {
            C2lb q3y = new Q3Y(A08, abR);
            1Bn.A0K();
            FbInjector.A04(A00);
            return q3y;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public int getItemCount() {
        return this.A01.size();
    }
}
