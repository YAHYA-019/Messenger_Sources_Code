package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.communitymessaging.plugins.memberactions.removememberfromchatmenuitem.RemoveMemberFromChatMenuItemImplementation;
import java.util.ListIterator;

/* loaded from: Cuj.class */
public final class Cuj implements 6HP {
    public final /* synthetic */ RemoveMemberFromChatMenuItemImplementation A00;

    public Cuj(RemoveMemberFromChatMenuItemImplementation removeMemberFromChatMenuItemImplementation) {
        this.A00 = removeMemberFromChatMenuItemImplementation;
    }

    public void CKc(ServiceException serviceException) {
        RemoveMemberFromChatMenuItemImplementation removeMemberFromChatMenuItemImplementation = this.A00;
        String localizedMessage = serviceException.getLocalizedMessage();
        Context A0A = 7zL.A0A(removeMemberFromChatMenuItemImplementation.A05);
        6HM r0 = (6HM) 1Hv.A02(A0A, 50020);
        Resources A0C = 4YU.A0C(A0A);
        String string = A0C.getString(2131957316);
        if (localizedMessage == null) {
            localizedMessage = 4YU.A0t(A0C, 2131957310);
        }
        r0.A02(new COW((Activity) null, Rii.A00, (ServiceException) null, localizedMessage, string, -1));
    }

    public void CP4(OperationResult operationResult) {
        Object obj;
        RemoveMemberFromChatMenuItemImplementation removeMemberFromChatMenuItemImplementation = this.A00;
        removeMemberFromChatMenuItemImplementation.A07.Bu9("remove_from_chat_success");
        ListIterator A1F = AbH.A1F(7zP.A0x(removeMemberFromChatMenuItemImplementation.A04));
        while (true) {
            if (!A1F.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = A1F.previous();
                if (((Fragment) obj).getActivity() != null) {
                    break;
                }
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            Context context = removeMemberFromChatMenuItemImplementation.A03;
            ((CMk) 1Bu.A06(context, 83105)).A02(fragment.requireActivity(), removeMemberFromChatMenuItemImplementation.A08, AbK.A13(context, removeMemberFromChatMenuItemImplementation.A09.A0X.firstName, 2131964314), false);
        }
    }
}
