package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityCreationState;
import com.facebook.messaging.nativepagereply.savedreplies.creation.ui.SwipeableSavedRepliesTrayCreationView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.threadview.iconpicker.ThreadIconPickerActivity;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.List;

/* loaded from: Cm3.class */
public final class Cm3 implements JJz {
    public final int A00;
    public final Object A01;

    public Cm3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JJz
    public void Bn5() {
        if (4 - this.A00 == 0) {
            ((FbFragmentActivity) this.A01).finish();
        }
    }

    @Override // X.JJz
    public void CBb(List list) {
        CommunityCreationState A00;
        String str;
        switch (this.A00) {
            case 0:
                11T.A0F(list, 0);
                MediaResource mediaResource = (MediaResource) 0QD.A0E(list);
                if (mediaResource != null) {
                    1Br r0 = ((AlT) this.A01).A09;
                    CPh cPh = (CPh) 1Br.A0B(r0);
                    String obj = mediaResource.A0E.toString();
                    CommunityCreationState A01 = CPh.A01(cPh);
                    if (A01 != null) {
                        A00 = CommunityCreationState.A00(null, A01, null, null, null, null, null, null, null, null, null, obj, null, null, null, 32703, false);
                        CPh.A02(A00, cPh);
                    }
                    CPh cPh2 = (CPh) 1Br.A0B(r0);
                    CommunityCreationState A012 = CPh.A01(cPh2);
                    if (A012 != null) {
                        CPh.A02(CommunityCreationState.A00(null, A012, null, null, mediaResource, null, null, null, null, null, null, null, null, null, null, 32255, false), cPh2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                11T.A0F(list, 0);
                MediaResource mediaResource2 = (MediaResource) 0QD.A0E(list);
                if (mediaResource2 != null) {
                    AlF alF = (AlF) this.A01;
                    Bct bct = alF.A0N;
                    Uri uri = mediaResource2.A0E;
                    11T.A09(uri);
                    AlF alF2 = bct.A00;
                    alF2.A00 = uri;
                    AlF.A03(uri, alF2);
                    if (alF.A07 != null) {
                        ((6KV) alF.A0O.getValue()).A02();
                        BzM bzM = (BzM) 1Br.A0B(alF.A0L);
                        Context requireContext = alF.requireContext();
                        FbUserSession fbUserSession = alF.A02;
                        if (fbUserSession != null) {
                            Long l = alF.A07;
                            if (l == null) {
                                throw 1BK.A0h();
                            }
                            bzM.A00(requireContext, fbUserSession, mediaResource2, l.longValue(), true);
                            FbUserSession fbUserSession2 = alF.A02;
                            if (fbUserSession2 != null) {
                                C1284Aco c1284Aco = (C1284Aco) 7zN.A0m(alF, fbUserSession2, 82370);
                                CfG cfG = alF.A03;
                                if (cfG == null) {
                                    str = "dialogBasedProgressIndicator";
                                    11T.A0L(str);
                                    throw 0Q8.createAndThrow();
                                }
                                cfG.ABm();
                                Long l2 = alF.A07;
                                if (l2 == null) {
                                    throw 1BK.A0h();
                                }
                                LiveData A002 = c1284Aco.A00(l2.longValue());
                                alF.A01 = A002;
                                if (A002 != null) {
                                    A002.observe(alF.getViewLifecycleOwner(), alF.A0G);
                                    return;
                                }
                                return;
                            }
                        }
                        str = "fbUserSession";
                        11T.A0L(str);
                        throw 0Q8.createAndThrow();
                    }
                    return;
                }
                return;
            case 2:
                if (list.isEmpty()) {
                    return;
                }
                SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView = (SwipeableSavedRepliesTrayCreationView) this.A01;
                swipeableSavedRepliesTrayCreationView.A0A = (MediaResource) 1BK.A0r(list);
                SwipeableSavedRepliesTrayCreationView.A01(swipeableSavedRepliesTrayCreationView);
                return;
            case 3:
                if (list.isEmpty()) {
                    return;
                }
                NuxFragment nuxFragment = (NuxFragment) this.A01;
                Uri uri2 = ((MediaResource) 1BK.A0r(list)).A0E;
                Bundle A05 = 1BK.A05();
                A05.putParcelable(GOm.A00(25), uri2);
                A05.putSerializable("back_action", H9L.A01);
                nuxFragment.A1d(A05, DKB.A00(75), "nux_profile_pic_choose_from_gallery");
                return;
            default:
                ThreadIconPickerActivity.A12((ThreadIconPickerActivity) this.A01, (MediaResource) 1BK.A0r(list));
                return;
        }
    }

    @Override // X.JJz
    public void onError() {
        switch (this.A00) {
            case 2:
                AbN.A1Q(AbF.A0v(((SwipeableSavedRepliesTrayCreationView) this.A01).A06), 2131957337);
                return;
            case 4:
                ((FbFragmentActivity) this.A01).finish();
                return;
            default:
                return;
        }
    }
}
