package X;

import com.facebook.widget.listview.BetterListView;
import java.lang.ref.WeakReference;

/* renamed from: X.6mr, reason: invalid class name */
/* loaded from: 6mr.class */
public final class C6mr {
    public final BetterListView A00;
    public final java.util.Map A01 = AnonymousClass001.A0u();

    public C6mr(BetterListView betterListView) {
        this.A00 = betterListView;
        betterListView.setTag(2131367126, new WeakReference(this));
    }

    public int A00() {
        BetterListView betterListView = this.A00;
        if (betterListView.getAdapter() == null) {
            return 0;
        }
        return betterListView.getAdapter().getCount();
    }
}
