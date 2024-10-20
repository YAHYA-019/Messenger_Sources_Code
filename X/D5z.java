package X;

import com.facebook.messaging.nativepagereply.savedreplies.creation.ui.SwipeableSavedRepliesTrayCreationView;

/* loaded from: D5z.class */
public final class D5z implements Runnable {
    public static final String __redex_internal_original_name = "SwipeableSavedRepliesTrayCreationView$11$1";
    public final /* synthetic */ CnD A00;

    public D5z(CnD cnD) {
        this.A00 = cnD;
    }

    @Override // java.lang.Runnable
    public void run() {
        SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView = this.A00.A00;
        Bfh bfh = swipeableSavedRepliesTrayCreationView.A08;
        if (bfh != null) {
            bfh.A00.A0W(0S2.A00);
        }
        swipeableSavedRepliesTrayCreationView.A0W();
    }
}
