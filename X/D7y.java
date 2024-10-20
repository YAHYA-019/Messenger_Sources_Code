package X;

import com.facebook.messaging.nativepagereply.savedreplies.creation.ui.SwipeableSavedRepliesTrayCreationView;

/* loaded from: D7y.class */
public final class D7y implements Runnable {
    public static final String __redex_internal_original_name = "SwipeableSavedRepliesTrayCreationView$8$2";
    public final /* synthetic */ CnE A00;
    public final /* synthetic */ Throwable A01;

    public D7y(CnE cnE, Throwable th) {
        this.A00 = cnE;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView = this.A00.A00;
        swipeableSavedRepliesTrayCreationView.A0W();
        swipeableSavedRepliesTrayCreationView.A0X(this.A01);
    }
}
