package X;

import com.facebook.messaging.nativepagereply.plugins.savedreplies.keyboard.BusinessInboxSavedRepliesComposerKeyboardImplementation;
import com.facebook.messaging.nativepagereply.savedreplies.creation.ui.SwipeableSavedRepliesTrayCreationView;
import com.facebook.messaging.nativepagereply.savedreplies.keyboard.ui.SwipeableSavedRepliesTrayKeyboardView;

/* loaded from: B4a.class */
public final class B4a extends 7kE {
    public final /* synthetic */ BusinessInboxSavedRepliesComposerKeyboardImplementation A00;

    public B4a(BusinessInboxSavedRepliesComposerKeyboardImplementation businessInboxSavedRepliesComposerKeyboardImplementation) {
        this.A00 = businessInboxSavedRepliesComposerKeyboardImplementation;
    }

    public /* bridge */ /* synthetic */ C7yv A00() {
        return new IV9();
    }

    public String A01() {
        return "saved_replies_popup";
    }

    public String A02() {
        return ((C2ib) 1Br.A0B(this.A00.A01)).A04() ? "business_tools" : "saved_reply_v2";
    }

    public String A03() {
        if (((C2ib) 1Br.A0B(this.A00.A01)).A04()) {
            return "SAVED_REPLIES";
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A04(C7yv c7yv) {
        IV9 iv9 = (IV9) c7yv;
        11T.A0F(iv9, 0);
        BusinessInboxSavedRepliesComposerKeyboardImplementation businessInboxSavedRepliesComposerKeyboardImplementation = this.A00;
        06Z r0 = businessInboxSavedRepliesComposerKeyboardImplementation.A00;
        SwipeableSavedRepliesTrayKeyboardView swipeableSavedRepliesTrayKeyboardView = (SwipeableSavedRepliesTrayKeyboardView) iv9.A00;
        BIc bIc = swipeableSavedRepliesTrayKeyboardView.A02;
        if (bIc != null) {
            bIc.A00 = r0;
            RNm rNm = bIc.A06;
            if (rNm != null) {
                rNm.A00 = r0;
                SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView = rNm.A01;
                if (swipeableSavedRepliesTrayCreationView != null) {
                    swipeableSavedRepliesTrayCreationView.A02 = r0;
                }
            }
        }
        6Qf r02 = businessInboxSavedRepliesComposerKeyboardImplementation.A02;
        if (bIc != null) {
            bIc.A05 = r02;
        }
        CkW ckW = new CkW(businessInboxSavedRepliesComposerKeyboardImplementation);
        swipeableSavedRepliesTrayKeyboardView.A0d(swipeableSavedRepliesTrayKeyboardView.A00, null, ckW);
        swipeableSavedRepliesTrayKeyboardView.A0d(swipeableSavedRepliesTrayKeyboardView.A01, null, ckW);
    }
}
