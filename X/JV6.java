package X;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* loaded from: JV6.class */
public final class JV6 extends DataSetObserver {
    public final /* synthetic */ TabLayout A00;

    public JV6(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.A00.A04();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.A00.A04();
    }
}
