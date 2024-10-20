package X;

import android.content.Context;
import android.content.ReceiverCallNotAllowedException;
import android.view.WindowManager;
import com.facebook.acra.constants.ActionId;
import com.facebook.user.model.User;

/* loaded from: Cja.class */
public final class Cja implements JIM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Hsq A01;
    public final /* synthetic */ I7h A02;
    public final /* synthetic */ boolean A03;

    public Cja(Context context, Hsq hsq, I7h i7h, boolean z) {
        this.A00 = context;
        this.A02 = i7h;
        this.A01 = hsq;
        this.A03 = z;
    }

    public void onFailure(Throwable th) {
        4zI.A03.A06("RtcCallerWarningHelperImpl", "Failed to fetch user for caller warning dialog", AnonymousClass001.A1Z());
        this.A01.A01();
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        User user = (User) obj;
        11T.A0F(user, 0);
        String str = user.A0X.firstName;
        if (str == null && "page".equals(user.A1U)) {
            str = this.A00.getString(2131953732);
        }
        I7h i7h = this.A02;
        C5ic c5ic = (C5ic) 1Br.A0B(i7h.A03);
        Context context = this.A00;
        DR6 A02 = c5ic.A02(context);
        A02.A03(1BK.A0v(context, str, 2131953734));
        A02.A0J(1BK.A0v(context, str, 2131953730));
        String string = context.getString(2131953731);
        Hsq hsq = this.A01;
        CSG.A01(A02, string, hsq, ActionId.ASYNC_FAIL);
        CSG.A02(A02, context.getString(2131953733), hsq, ActionId.ON_ATTACH_FRAGMENT);
        JZj A04 = A02.A04();
        A04.setOnCancelListener(new CQx(hsq, 11));
        A04.setOnDismissListener(new IGV(i7h, this.A03));
        try {
            A04.show();
        } catch (ReceiverCallNotAllowedException | WindowManager.BadTokenException | SecurityException unused) {
            4zI.A03.A06("RtcCallerWarningHelperImpl", "Failed to show dialog", new Object[0]);
            hsq.A01();
        }
    }
}
