package X;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8kc, reason: invalid class name */
/* loaded from: 8kc.class */
public final class C8kc extends C1rj {
    public int A00;
    public View.OnClickListener A01;
    public View.OnFocusChangeListener A02;
    public CharSequence A03;
    public List A04;
    public List A05;
    public boolean A06;

    public C8kc() {
        super("MigSimpleTextInput");
        this.A04 = Collections.emptyList();
        this.A05 = Collections.emptyList();
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A06), 0, null, this.A04, Integer.valueOf(this.A00), this.A01, this.A02, this.A03, this.A05};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A03;
        boolean z = this.A06;
        int i = this.A00;
        List list = this.A04;
        List list2 = this.A05;
        11T.A0F(r302, 0);
        7ZF A01 = 6rU.A01(r302, 0);
        A01.A2J("BaseInputKey");
        A01.A2g(charSequence);
        A01.A2h((CharSequence) null);
        6rU r0 = A01.A01;
        r0.A0i = z;
        A01.A2Y(i);
        r0.A02 = 0;
        A01.A2i(list);
        A01.A2j(list2);
        7zN.A1C(A01, r302, C8kc.class, "MigSimpleTextInput");
        A01.A1l(1LI.A09(r302, C8kc.class, "MigSimpleTextInput", -1974694341));
        return 7zR.A0T(A01);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1974694341) {
            C5r6 c5r6 = (C5r6) obj;
            1Is r0 = r302.A00.A01;
            View view = c5r6.A00;
            boolean z = c5r6.A01;
            View.OnFocusChangeListener onFocusChangeListener = ((C8kc) r0).A02;
            if (onFocusChangeListener == null) {
                return null;
            }
            onFocusChangeListener.onFocusChange(view, z);
            return null;
        }
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r02 = r302.A00.A01;
        View view2 = ((3xC) obj).A00;
        View.OnClickListener onClickListener = ((C8kc) r02).A01;
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view2);
        return null;
    }
}
