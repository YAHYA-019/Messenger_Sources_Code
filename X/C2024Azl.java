package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.facebook.messaging.search.singlepickerview.SinglePickerSearchView;

/* renamed from: X.Azl, reason: case insensitive filesystem */
/* loaded from: Azl.class */
public final class C2024Azl extends C1rj {
    public Bgk A00;
    public String A01;

    public C2024Azl() {
        super("AddParticipantsSearchComponent");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        LinearLayout.LayoutParams layoutParams = SinglePickerSearchView.A05;
        return new SinglePickerSearchView(new ContextThemeWrapper(context, 2132607872));
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        return false;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        1BK.A1K(r302, 0, c23p);
        c23p.A01 = View.MeasureSpec.getSize(i);
        c23p.A00 = 4YU.A0E(r302).getDimensionPixelSize(2132279342);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        SinglePickerSearchView singlePickerSearchView = (SinglePickerSearchView) obj;
        String str = this.A01;
        Bgk bgk = this.A00;
        1BL.A1H(singlePickerSearchView, str, bgk);
        singlePickerSearchView.A00 = CZF.A00(bgk, 53);
        SearchView searchView = singlePickerSearchView.A01;
        11T.A0A(searchView);
        searchView.onSearchClicked();
        searchView.setQueryHint(str);
        searchView.setQuery("", false);
        searchView.setInputType(8193);
        searchView.requestFocus();
        searchView.mOnQueryChangeListener = new CZe(bgk, 0);
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C2024Azl c2024Azl = (C2024Azl) r302;
            String str = this.A01;
            String str2 = c2024Azl.A01;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            Bgk bgk = this.A00;
            Bgk bgk2 = c2024Azl.A00;
            if (bgk != null) {
                if (!bgk.equals(bgk2)) {
                    return false;
                }
            } else if (bgk2 != null) {
                return false;
            }
        }
        return true;
    }
}
