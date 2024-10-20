package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.plugins.channellist.communityprofileimage.CommunityProfileImageClickHandlerImplementation;
import com.facebook.messaging.contextbanner.plugins.grouppromptaccessory.viewmembers.ViewMembersGroupPromptAccessoryImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.NotificationButtonImplementation;

/* loaded from: Cul.class */
public final class Cul implements DGA {
    public final int A00;
    public final Object A01;

    public Cul(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D1P(Intent intent) {
        C08d A0W;
        Context context;
        switch (this.A00) {
            case 0:
                intent.putExtra("extra_quit_thread_setting_on_back", true);
                A0W = 1BK.A0W();
                context = (Context) this.A01;
                break;
            case 1:
                intent.putExtra("extra_quit_thread_setting_on_back", true);
                A0W = 1BK.A0W();
                context = ((CommunityProfileImageClickHandlerImplementation) this.A01).A00;
                break;
            case 2:
                0LS.A0A(((ViewMembersGroupPromptAccessoryImplementation) this.A01).A00, intent);
                return;
            case 3:
                intent.putExtra("extra_quit_thread_setting_on_back", true);
                A0W = 1BK.A0W();
                context = ((Fragment) this.A01).getContext();
                break;
            case 4:
                intent.putExtra("extra_quit_thread_setting_on_back", true);
                A0W = 1BK.A0W();
                context = ((NotificationButtonImplementation) this.A01).A00;
                break;
            default:
                0LS.A05(intent, ((6FI) this.A01).A00, ActionId.ON_VIEW_CREATED_END);
                return;
        }
        A0W.A0A(context, intent);
    }
}
