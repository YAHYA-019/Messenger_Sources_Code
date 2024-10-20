package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.composer.ui.EditorToolsIcon;
import com.facebook.widget.FbImageView;
import java.util.Set;

/* loaded from: Htr.class */
public final class Htr {
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Set A05 = AbI.A07();
    public HAP A00 = HAP.A03;
    public boolean A04 = true;

    public final void A00(boolean z) {
        this.A01 = z;
        for (Object obj : this.A05) {
            if (obj instanceof C2792Go9) {
                GnK gnK = ((C2792Go9) obj).A00;
                Hrw hrw = gnK.A01;
                if (hrw != null && hrw.A01() != gnK.A0A.A01 && gnK.A1b()) {
                    ICU icu = gnK.A01.A01;
                    if (icu.A0j.get()) {
                        icu.A07 = false;
                        Ida.A00(icu.A0C).D3r();
                    }
                }
            } else if (obj instanceof C2789Go6) {
                C2770Gnn.A00(((C2789Go6) obj).A00);
            }
        }
    }

    public final void A01(boolean z) {
        this.A04 = z;
        for (Object obj : this.A05) {
            if (obj instanceof C2792Go9) {
                GnK gnK = ((C2792Go9) obj).A00;
                boolean z2 = gnK.A0A.A04;
                if (gnK.A1b()) {
                    gnK.A01.A01.A0C.A0A(z2);
                }
            } else if (obj instanceof C2789Go6) {
                C2770Gnn.A00(((C2789Go6) obj).A00);
            }
        }
    }

    public final void A02(boolean z) {
        C2764Gnh c2764Gnh;
        IE8 ie8;
        Htr htr;
        this.A03 = z;
        for (GoA goA : this.A05) {
            if (goA instanceof GoA) {
                IQ1 iq1 = goA.A00;
                CallerContext callerContext = IQ1.A1m;
                IWN iwn = iq1.A1Q;
                iwn.A02.A0I = iq1.A1R.A03;
                if (iwn.BTm()) {
                    iwn.D1v();
                    iq1.A0H();
                }
            } else if (goA instanceof C2791Go8) {
                C2757Gna.A00(((C2791Go8) goA).A00);
            } else if ((goA instanceof C2790Go7) && (ie8 = (c2764Gnh = ((C2790Go7) goA).A00).A00) != null && (htr = c2764Gnh.A09) != null) {
                Drawable A07 = GOn.A0M(ie8.A0F).A07(htr.A03 ? C1u3.A0b : C1u3.A0c);
                EditorToolsIcon editorToolsIcon = ie8.A0a;
                FbImageView fbImageView = editorToolsIcon.A06;
                fbImageView.setImageDrawable(A07);
                fbImageView.setBackgroundResource(editorToolsIcon.A01);
            }
        }
    }
}
