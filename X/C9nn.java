package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.Executor;

/* renamed from: X.9nn, reason: invalid class name */
/* loaded from: 9nn.class */
public final class C9nn implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public C9nn(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.A00 = i;
        this.A01 = obj7;
        this.A08 = obj8;
        this.A05 = obj3;
        this.A04 = obj5;
        this.A02 = obj;
        this.A07 = obj4;
        this.A03 = obj6;
        this.A06 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                CallToAction callToAction = (CallToAction) this.A01;
                if (callToAction != null && (str = callToAction.A0G) != null && (str2 = callToAction.A0E) != null) {
                    ((E18) this.A08).A05.A01((Uri) this.A05, str, str2, 0);
                }
                E18 e18 = (E18) this.A08;
                E18.A00((Context) this.A02, (Intent) this.A06, (Uri) this.A07, (FbUserSession) this.A04, (CallToActionContextParams) this.A03, e18);
                return;
            case 1:
                dialogInterface.dismiss();
                C5fv c5fv = ((8Nb) this.A02).A00;
                76D r0 = (76D) this.A07;
                ((Executor) this.A03).execute(new AH9(((6RU) this.A01).A00, (FbUserSession) this.A04, (ThreadKey) this.A06, (ThreadKey) this.A08, r0, c5fv));
                2Oh r02 = (Fragment) this.A05;
                if (r02 instanceof 2Oh) {
                    r02.CfF();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
