package X;

import android.os.Bundle;
import com.facebook.messaging.graph.contactmanagement.AllContactsActivity;

/* loaded from: Ckl.class */
public final class Ckl implements DGu {
    public final /* synthetic */ AllContactsActivity A00;

    public Ckl(AllContactsActivity allContactsActivity) {
        this.A00 = allContactsActivity;
    }

    @Override // X.DGu
    public void AQi() {
        C06c A0D = 7zU.A0D(this.A00);
        2Ok r0 = new 2Ok();
        Bundle A05 = 1BK.A05();
        A05.putInt(1BJ.A00(1405), 2131965529);
        A05.putString("thread_nav_trigger", "icon_contact_search");
        r0.setArguments(A05);
        A0D.A0P(r0, "search_contacts_fragment", 2131364232);
        AbJ.A1K(A0D, "search_contacts_fragment");
    }

    @Override // X.DGu
    public void ARV() {
        super/*com.facebook.base.activity.FbFragmentActivity*/.onBackPressed();
    }
}
