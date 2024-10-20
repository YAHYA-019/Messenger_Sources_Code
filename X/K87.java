package X;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;

/* loaded from: K87.class */
public final class K87 extends JgS {
    public static final String __redex_internal_original_name = "MaterialCalendar";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public CalendarConstraints A04;
    public Km4 A05;
    public DateSelector A06;
    public Month A07;
    public Integer A08;
    public int A09;
    public static final Object A0A = "MONTHS_VIEW_GROUP_TAG";
    public static final Object A0C = "NAVIGATION_PREV_TAG";
    public static final Object A0B = "NAVIGATION_NEXT_TAG";
    public static final Object A0D = "SELECTOR_TOGGLE_TAG";

    public void A00(Month month) {
        RecyclerView recyclerView = this.A02;
        C3059Jhs c3059Jhs = (C3059Jhs) recyclerView.A0C;
        int A0H = c3059Jhs.A0H(month);
        int A0H2 = A0H - c3059Jhs.A0H(this.A07);
        boolean z = true;
        boolean A1X = 4YV.A1X(Math.abs(A0H2), 3);
        if (A0H2 <= 0) {
            z = false;
        }
        this.A07 = month;
        if (A1X) {
            int i = A0H + 3;
            if (z) {
                i = A0H - 3;
            }
            recyclerView.A0u(i);
        }
        this.A02.post(new Los(this, A0H));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1119060977);
        super/*androidx.fragment.app.Fragment*/.onCreate(bundle);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        this.A09 = bundle.getInt("THEME_RES_ID_KEY");
        this.A06 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A04 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.A07 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        0FI.A08(505573587, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-299430201);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.A09);
        this.A05 = new Km4(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.A04.A05;
        int i = 2132542780;
        int i2 = 0;
        if (JgQ.A08(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = 2132542785;
            i2 = 1;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(2131365872);
        C0Ad.A0B(gridView, new C2957Jek(this, 1));
        gridView.setAdapter((ListAdapter) new JYS());
        gridView.setNumColumns(month.A02);
        gridView.setEnabled(false);
        this.A02 = (RecyclerView) inflate.findViewById(2131365875);
        this.A02.A1D(new C3053Jhm(getContext(), this, i2, i2));
        this.A02.setTag("MONTHS_VIEW_GROUP_TAG");
        C3059Jhs c3059Jhs = new C3059Jhs(contextThemeWrapper, this.A04, this.A06, new LeQ(this));
        this.A02.A16(c3059Jhs);
        int integer = contextThemeWrapper.getResources().getInteger(2131427365);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131365878);
        this.A03 = recyclerView;
        if (recyclerView != null) {
            recyclerView.A0T = true;
            recyclerView.A1D(new GridLayoutManager((Context) contextThemeWrapper, false, integer, 1));
            this.A03.A16(new C3055Jho(this));
            this.A03.A1B(new C3062Jhv(this));
        }
        if (inflate.findViewById(2131365822) != null) {
            TextView A06 = AbF.A06(inflate, 2131365822);
            A06.setTag("SELECTOR_TOGGLE_TAG");
            C0Ad.A0B(A06, new C2957Jek(this, 2));
            View findViewById = inflate.findViewById(2131365824);
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(2131365823);
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.A01 = inflate.findViewById(2131365878);
            this.A00 = inflate.findViewById(2131365871);
            this.A08 = 0S2.A00;
            this.A01.setVisibility(8);
            this.A00.setVisibility(0);
            A00(this.A07);
            A06.setText(this.A07.A02(inflate.getContext()));
            this.A02.A1F(new 8Du(0, this, A06, c3059Jhs));
            LKO.A01(A06, this, ActionId.ABORTED);
            LKL.A00(findViewById2, this, c3059Jhs, 28);
            LKL.A00(findViewById, this, c3059Jhs, 29);
        }
        if (!JgQ.A08(contextThemeWrapper, R.attr.windowFullscreen)) {
            new 3wX().A05(this.A02);
        }
        this.A02.A0u(c3059Jhs.A0H(this.A07));
        0FI.A08(1761182305, A02);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A09);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.A06);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A04);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A07);
    }
}
