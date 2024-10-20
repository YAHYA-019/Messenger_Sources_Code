package X;

import android.R;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Che.class */
public final class Che implements DGc {
    public final /* synthetic */ PageAccountSwitchActivity A00;

    public Che(PageAccountSwitchActivity pageAccountSwitchActivity) {
        this.A00 = pageAccountSwitchActivity;
    }

    @Override // X.DGc
    public void onFailure(Throwable th) {
        PageAccountSwitchActivity pageAccountSwitchActivity = this.A00;
        PageAccountSwitchActivity.A1F(pageAccountSwitchActivity, 0Pz.A1B("Login failed. ", th));
        PageAccountSwitchActivity.A1G(pageAccountSwitchActivity, th);
    }

    @Override // X.DGc
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Serializable serializable;
        PageAccountSwitchActivity pageAccountSwitchActivity = this.A00;
        if (pageAccountSwitchActivity.A0E.A00() != BLO.A02) {
            1PE.A00((1PE) pageAccountSwitchActivity.A0M.get(), 1BJ.A00(1499));
        }
        6E0 r0 = (6E0) pageAccountSwitchActivity.A0H.get();
        1Ho newInstance_DEPRECATED = 4YU.A0L(pageAccountSwitchActivity.A03).newInstance_DEPRECATED("ensure_sync", 1BK.A05(), 0, CallerContext.A0B("PageAccountSwitchActivity"));
        newInstance_DEPRECATED.A0A = true;
        r0.A01(newInstance_DEPRECATED);
        Bundle bundle = ActivityOptions.makeCustomAnimation(pageAccountSwitchActivity, 0, R.anim.fade_out).toBundle();
        Intent A00 = ((Et9) pageAccountSwitchActivity.A08.get()).A00();
        A00.putExtra(1BJ.A00(691), true);
        HashMap A002 = BS0.A00(pageAccountSwitchActivity);
        if (A002 != null && (!A002.isEmpty()) && 1BL.A0Q().AZk(36318995074266665L)) {
            Iterator A19 = 1BK.A19(A002);
            while (A19.hasNext()) {
                String A0i = AnonymousClass001.A0i(A19);
                Object obj2 = A002.get(A0i);
                if (obj2 instanceof String) {
                    A00.putExtra(A0i, 4YU.A16(A0i, A002));
                } else {
                    if (obj2 instanceof Boolean) {
                        serializable = (Boolean) A002.get(A0i);
                    } else if (obj2 instanceof Integer) {
                        serializable = (Integer) A002.get(A0i);
                    } else if (obj2 instanceof Parcelable) {
                        A00.putExtra(A0i, (Parcelable) A002.get(A0i));
                    } else {
                        0fH.A0l(AbstractC00603o4.A00(364), 0Pz.A0W("cannot get value of key: ", A0i));
                    }
                    A00.putExtra(A0i, serializable);
                }
            }
        }
        AbK.A0q(pageAccountSwitchActivity.A0T).A0K(pageAccountSwitchActivity, A00, bundle);
        ((1SG) pageAccountSwitchActivity.A0N.get()).A0K("ACCOUNT_SWITCH_COMPLETED");
        pageAccountSwitchActivity.finishAffinity();
    }
}
