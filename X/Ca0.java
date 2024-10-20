package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.messaging.communitymessaging.communitynickname.SetCommunityNicknameDialogFragment;
import com.facebook.messaging.communitymessaging.model.MemberActionsState;
import com.facebook.messaging.communitymessaging.plugins.adminactions.admodremovemessagecta.AdmodRemoveMessageCtaImplementation;
import com.facebook.messaging.communitymessaging.plugins.memberactions.resetcommunitynicknamemenuitem.ResetCommunityNicknameMenuItemImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Ca0.class */
public final class Ca0 implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public Ca0(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                BKv bKv = (BKv) obj;
                if (bKv != null && bKv.ordinal() == 0) {
                    CMk A0J = AbN.A0J();
                    Activity activity = (Activity) this.A01;
                    MigColorScheme migColorScheme = ((SetCommunityNicknameDialogFragment) this.A02).A02;
                    if (migColorScheme == null) {
                        11T.A0L("colorScheme");
                        throw 0Q8.createAndThrow();
                    }
                    A0J.A02(activity, migColorScheme, this.A03, false);
                    return;
                }
                str = "SetCommunityNicknameDialogFragment";
                break;
            case 1:
                MemberActionsState memberActionsState = (MemberActionsState) obj;
                11T.A0F(memberActionsState, 0);
                AbM.A1E(this, this.A01);
                Long l = memberActionsState.A00;
                if (l == null || l.longValue() != 0 || memberActionsState.A02 || memberActionsState.A03) {
                    AdmodRemoveMessageCtaImplementation admodRemoveMessageCtaImplementation = (AdmodRemoveMessageCtaImplementation) this.A02;
                    ((AnonymousClass472) 1Bu.A06(admodRemoveMessageCtaImplementation.A00, 67579)).A00(1BK.A0X(this.A03)).A02(new Cjw(memberActionsState, admodRemoveMessageCtaImplementation, 0));
                    return;
                }
                AdmodRemoveMessageCtaImplementation admodRemoveMessageCtaImplementation2 = (AdmodRemoveMessageCtaImplementation) this.A02;
                1Bn.A0A(67527);
                Context context = admodRemoveMessageCtaImplementation2.A00;
                DR6 A01 = C5ic.A01(context, 5zD.A00(admodRemoveMessageCtaImplementation2.A05));
                AbG.A1E(context.getResources(), A01, 2131952275);
                AbM.A1A(context.getResources(), A01, 2131952274);
                A01.A0C(CRl.A00, 2131952273);
                7zN.A13(A01);
                return;
            default:
                BKv bKv2 = (BKv) obj;
                if (bKv2 != null && bKv2.ordinal() == 0) {
                    Activity activity2 = (Activity) this.A01;
                    ((CMk) 1Bu.A06(activity2, 83105)).A02(activity2, ((ResetCommunityNicknameMenuItemImplementation) this.A02).A07, this.A03, false);
                    return;
                } else {
                    str = "ResetCommunityNicknameMenuItemImplementation";
                    break;
                }
        }
        0fH.A0k(str, "Failure when editing nickname.");
    }
}
