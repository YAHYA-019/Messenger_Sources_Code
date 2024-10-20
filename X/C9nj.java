package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.history.DeletionFlowFragment;
import com.facebook.messaging.internalprefs.presence.StatusInjectDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.messaging.storagemanagement.threadmanager.fragment.ThreadManagerSeeAllFragment;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9nj, reason: invalid class name */
/* loaded from: 9nj.class */
public final class C9nj implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C9nj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v217, types: [androidx.fragment.app.Fragment, com.facebook.messaging.storagemanagement.threadmanager.fragment.ThreadManagerSeeAllFragment, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                ((C1296Ad8) this.A01).A04(new CommunityMessagingLoggerModel(null, null, null, null, null, null, null, "channel_list", "community_intro_card_unpin_for_everyone_confirm", null, null, null));
                C2lh c2lh = (C2lh) this.A02;
                Boolean A0K = AnonymousClass001.A0K();
                c2lh.A02(A0K);
                C8bp c8bp = (C8bp) this.A03;
                c8bp.A04.invoke(c8bp.A01.A03, A0K);
                return;
            case 1:
                String obj = ((EditText) this.A02).getText().toString();
                9mT r0 = (9mT) this.A03;
                C00i c00i = r0.A0F.A00;
                String str = ((C9c4) c00i.get()).A02;
                if (str != null) {
                    C9rb.A00(((LB8) 1Br.A0B(r0.A0G)).A05(obj, str), this.A01, 4);
                    return;
                }
                Toast.makeText((Context) this.A01, "empty vd set or no hsm, refreshing vd set now", 1).show();
                ((C1wv) 1Br.A0B(r0.A0D)).A05("debug_menu");
                ((C9c4) c00i.get()).A01();
                return;
            case 2:
                7zL.A1T(this.A03, ((96N[]) this.A02)[((AtomicInteger) this.A01).get()]);
                return;
            case 3:
                DeletionFlowFragment deletionFlowFragment = (DeletionFlowFragment) this.A03;
                DeletionFlowFragment.A03(deletionFlowFragment).flowMarkPoint(deletionFlowFragment.A01, "delete_popup_delete_click");
                C9h7 c9h7 = (C9h7) this.A01;
                ImmutableSet immutableSet = (ImmutableSet) this.A02;
                c9h7.A01(immutableSet, new AWF(immutableSet, deletionFlowFragment, 3));
                return;
            case 4:
                0D2 r02 = (StatusInjectDialogFragment) this.A03;
                User user = r02.A00;
                if (user != null) {
                    String str2 = user.A13;
                    if (r02.A03 != null && r02.A01 != null && AnonymousClass001.A1U(r02.A02) == ((2TI) this.A02).A03()) {
                        MailboxFeature mailboxFeature = (MailboxFeature) 7zN.A0n(r02, (FbUserSession) this.A01, 33123);
                        User user2 = r02.A00;
                        if (user2 != null) {
                            long A0H = 7zQ.A0H(user2);
                            Rsk rsk = Rsk.A00;
                            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                            MailboxFutureImpl A0Q = 1BK.A0Q(AQV, rsk);
                            1Um.A02(AQV, new A1U(22, A0H, mailboxFeature, A0Q), A0Q, false);
                            11T.A0D(str2);
                            String str3 = r02.A03;
                            if (str3 == null) {
                                throw 1BK.A0h();
                            }
                            long A00 = 0J6.A00(str2, str3);
                            long parseLong = Long.parseLong(str2);
                            String str4 = r02.A03;
                            String str5 = r02.A02;
                            long A002 = 1Br.A00(r02.A05);
                            Long l = r02.A01;
                            11T.A0D(l);
                            long longValue = A002 + l.longValue();
                            1Um A0O = 1BK.A0O(mailboxFeature, 0);
                            MailboxFutureImpl A0P = 1BK.A0P(A0O);
                            1Um.A02(A0O, new N7R(A0P, mailboxFeature, str5, str4, 1, A00, parseLong, longValue), A0P, false);
                        }
                    }
                    StatusInjectDialogFragment.A05(r02);
                    r02.A0o();
                    return;
                }
                11T.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                throw 0Q8.createAndThrow();
            case 5:
                C9c5 c9c5 = (C9c5) this.A03;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                C00m c00m = (C00m) this.A02;
                Context context = c9c5.A01;
                11T.A09(context);
                9ZC r03 = (9ZC) 1Lm.A05(context, fbUserSession, 68588);
                SharedAlbumArgs sharedAlbumArgs = c9c5.A08;
                ThreadKey threadKey = sharedAlbumArgs.A01;
                long j = sharedAlbumArgs.A00;
                11T.A0F(threadKey, 0);
                4YV.A11(r03.A00).execute(new SDA(threadKey, r03, j));
                c00m.invoke();
                9nJ.A03(C98N.ALBUM_DELETE_DIALOG, 98L.A02, threadKey, 7zQ.A0j(c9c5.A05), "click", "button_delete", (List) null, (List) null, j);
                return;
            default:
                C9Oz c9Oz = (C9Oz) 7zO.A0p(this.A01);
                ?? r04 = (ThreadManagerSeeAllFragment) this.A03;
                Context requireContext = r04.requireContext();
                ImmutableCollection immutableCollection = (ImmutableCollection) this.A02;
                AV3 A003 = AV3.A00(r04, 21);
                5P8 r05 = (5P8) 1Lm.A05(requireContext, c9Oz.A00, 65961);
                LinkedHashMap A1C = 1BK.A1C();
                1Du it = immutableCollection.iterator();
                while (it.hasNext()) {
                    ThreadKey threadKey2 = (ThreadKey) it.next();
                    1Br.A0C(c9Oz.A01);
                    11T.A0D(threadKey2);
                    1BK.A1P(5QA.A00(threadKey2), A1C, ThreadKey.A00(threadKey2.A06));
                }
                r05.A0I(A1C).addResultCallback(new A1d((Function1) A003, ActionId.MESSENGER_QUEUE_CREATION));
                2On r06 = r04.A03;
                if (r06 != null) {
                    r06.ANO();
                    return;
                }
                return;
        }
    }
}
