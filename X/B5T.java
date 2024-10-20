package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.nativepagereply.savedreplies.keyboard.model.SavedRepliesKeyboardOpenParams;
import com.facebook.messaging.nativepagereply.savedreplies.keyboard.ui.SwipeableSavedRepliesTrayKeyboardView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: B5T.class */
public final class B5T extends IV9 {
    public /* bridge */ /* synthetic */ View A01(ViewGroup viewGroup) {
        return AbG.A08(LayoutInflater.from(viewGroup.getContext()), viewGroup, 2132543434);
    }

    public boolean Bkd() {
        return ((H4B) ((IV9) this).A00).A0l();
    }

    public void C37() {
        ((H4B) ((IV9) this).A00).A0X();
    }

    public void C38() {
        COe cOe;
        BIc bIc = ((SwipeableSavedRepliesTrayKeyboardView) ((IV9) this).A00).A02;
        if (bIc == null || (cOe = bIc.A08) == null) {
            return;
        }
        FbUserSession fbUserSession = cOe.A08;
        cOe.A09.A01();
        ((CNh) 1Lo.A04((Context) null, fbUserSession, cOe.A01, 83950)).A04();
    }

    public void C3B() {
        ((H4B) ((IV9) this).A00).A0Y();
    }

    public void C3C(ParcelableSecondaryData parcelableSecondaryData) {
        SavedRepliesKeyboardOpenParams savedRepliesKeyboardOpenParams;
        SwipeableSavedRepliesTrayKeyboardView swipeableSavedRepliesTrayKeyboardView = (SwipeableSavedRepliesTrayKeyboardView) ((IV9) this).A00;
        C5fi.A01(((H4B) swipeableSavedRepliesTrayKeyboardView).A03);
        if (parcelableSecondaryData == null || (savedRepliesKeyboardOpenParams = (SavedRepliesKeyboardOpenParams) ParcelableSecondaryData.A00(parcelableSecondaryData, SavedRepliesKeyboardOpenParams.class, null)) == null) {
            return;
        }
        SwipeableSavedRepliesTrayKeyboardView.A01(savedRepliesKeyboardOpenParams, swipeableSavedRepliesTrayKeyboardView);
    }

    public void C3D(ParcelableSecondaryData parcelableSecondaryData) {
        SavedRepliesKeyboardOpenParams savedRepliesKeyboardOpenParams;
        SwipeableSavedRepliesTrayKeyboardView swipeableSavedRepliesTrayKeyboardView = (SwipeableSavedRepliesTrayKeyboardView) ((IV9) this).A00;
        C5fi.A01(((H4B) swipeableSavedRepliesTrayKeyboardView).A03);
        if (parcelableSecondaryData == null || (savedRepliesKeyboardOpenParams = (SavedRepliesKeyboardOpenParams) ParcelableSecondaryData.A00(parcelableSecondaryData, SavedRepliesKeyboardOpenParams.class, null)) == null) {
            return;
        }
        SwipeableSavedRepliesTrayKeyboardView.A01(savedRepliesKeyboardOpenParams, swipeableSavedRepliesTrayKeyboardView);
    }

    public void C3G() {
        H4B h4b = (H4B) ((IV9) this).A00;
        C5fi.A01(h4b.A03);
        h4b.A0Z();
    }

    public void Cn1(MigColorScheme migColorScheme) {
        ((H4B) ((IV9) this).A00).A0f(migColorScheme);
    }

    public boolean Cxv() {
        return !((H4B) ((IV9) this).A00).A0j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (X.C2o7.A01(r304) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D8C(X.6fA r302) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5T.D8C(X.6fA):void");
    }
}
