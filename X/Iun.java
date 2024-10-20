package X;

import com.facebook.widget.refreshableview.RefreshableListViewContainer;

/* loaded from: Iun.class */
public final class Iun implements Runnable {
    public static final String __redex_internal_original_name = "RefreshableViewContainer$2";
    public final /* synthetic */ RefreshableListViewContainer A00;

    public Iun(RefreshableListViewContainer refreshableListViewContainer) {
        this.A00 = refreshableListViewContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A0C();
    }
}
