package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Bwt.class */
public final class Bwt {
    public final 7QJ A00;
    public final 1Br A01;
    public final 1Br A02;
    public final DHO A03;
    public final boolean A04;
    public final View A05;
    public final MigColorScheme A06;

    public Bwt(View view, DHO dho, MigColorScheme migColorScheme, boolean z, boolean z2) {
        11T.A0F(migColorScheme, 5);
        this.A05 = view;
        this.A03 = dho;
        this.A04 = z;
        this.A06 = migColorScheme;
        1Br A00 = 1Bu.A00(67678);
        this.A02 = A00;
        this.A01 = 7zM.A0U();
        1Br.A0C(A00);
        8Ca A002 = C9kp.A00(view, migColorScheme, 0);
        JXV jZn = new JZn(A002.A00);
        Menu menu = ((7QJ) A002).A04;
        jZn.inflate(2131623939, menu);
        menu.findItem(2131364130).setIcon(7zO.A0F(z ? C1u3.A4n : C1u3.A1C, 7zP.A0S(this.A01), migColorScheme)).setTitle(z ? 2131953714 : 2131953715);
        if (z && z2) {
            Drawable A08 = 7zP.A0S(this.A01).A08(C1u3.A1C, migColorScheme.Ahu());
            SpannableString spannableString = new SpannableString(view.getContext().getString(2131953715));
            spannableString.setSpan(new ForegroundColorSpan(migColorScheme.Ahv()), 0, spannableString.length(), 33);
            menu.findItem(2131367197).setIcon(A08).setTitle(spannableString).setEnabled(false);
        } else {
            menu.findItem(2131367197).setIcon(7zO.A0F(!z ? C1u3.A4n : C1u3.A1C, 7zP.A0S(this.A01), migColorScheme)).setTitle(z ? 2131953715 : 2131953714);
        }
        ((7QJ) A002).A01 = new CZW(this, 3);
        if (Build.VERSION.SDK_INT >= 29) {
            KuI kuI = ((7QJ) A002).A05;
            kuI.A05 = true;
            LLb lLb = kuI.A03;
            if (lLb != null) {
                lLb.A02(true);
            }
        }
        this.A00 = A002;
    }
}
