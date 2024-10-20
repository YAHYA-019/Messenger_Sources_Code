package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/* renamed from: X.Afb, reason: case insensitive filesystem */
/* loaded from: Afb.class */
public final class C1369Afb extends 2Xd {
    public List A00 = ImmutableList.of();

    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        C7q c7q = (C7q) this.A00.get(i);
        BIj bIj = c2lb.A0I;
        String str = c7q.A01;
        if (str != null) {
            bIj.A03.setText(str);
        }
        Long l = c7q.A00;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                bIj.A02.setText(7zO.A0w("%s %s", new Object[]{bIj.getContext().getString(2131957760), DateFormat.getDateInstance().format(new Date(longValue))}));
            }
        }
        bIj.A01.setText(c7q.A02);
        bIj.A01.setTextIsSelectable(true);
        if (c7q.A03) {
            bIj.A00.setVisibility(0);
        }
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        List list = C2lb.A0J;
        CustomLinearLayout customLinearLayout = new CustomLinearLayout(viewGroup.getContext());
        ((BIj) customLinearLayout).A04 = 7zL.A0R(customLinearLayout.getContext(), 16979);
        ((BIj) customLinearLayout).A05 = AbH.A0Q();
        customLinearLayout.A0D(2132543500);
        customLinearLayout.setOrientation(1);
        ((BIj) customLinearLayout).A03 = AbG.A09(customLinearLayout, 2131364540);
        ((BIj) customLinearLayout).A02 = AbG.A09(customLinearLayout, 2131364539);
        ((BIj) customLinearLayout).A01 = AbG.A09(customLinearLayout, 2131364538);
        ((BIj) customLinearLayout).A00 = (ImageView) C09s.A01(customLinearLayout, 2131364536);
        ((BIj) customLinearLayout).A03.setTextColor(((MigColorScheme) 4YU.A0p(((BIj) customLinearLayout).A04)).B9N());
        ((BIj) customLinearLayout).A02.setTextColor(((MigColorScheme) 4YU.A0p(((BIj) customLinearLayout).A04)).BEj());
        AbH.A1M(((BIj) customLinearLayout).A01, (MigColorScheme) 4YU.A0p(((BIj) customLinearLayout).A04));
        AbH.A1K(((BIj) customLinearLayout).A01, ((MigColorScheme) 4YU.A0p(((BIj) customLinearLayout).A04)).AjC());
        int i2 = -16777216;
        if (0AT.A02(((MigColorScheme) 4YU.A0p(((BIj) customLinearLayout).A04)).BDl())) {
            i2 = -1;
        }
        ((BIj) customLinearLayout).A00.setImageDrawable(((C1u2) 4YU.A0p(((BIj) customLinearLayout).A05)).A08(C1u3.A63, i2));
        ((BIj) customLinearLayout).A00.setVisibility(4);
        return new C2lb(customLinearLayout);
    }

    public int getItemCount() {
        return this.A00.size();
    }
}
