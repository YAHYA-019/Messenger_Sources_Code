package X;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.ipc.media.data.MimeType;

/* loaded from: C3z.class */
public final class C3z {
    public 1BY A00;
    public final Context A01 = 7zP.A0J();
    public final C00i A02 = 1BQ.A00();

    public C3z(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public boolean A00(DialogInterface.OnClickListener onClickListener, String str, long j) {
        if (MimeType.A00(str) != MimeType.A03) {
            return false;
        }
        int A00 = C1Ur.A00((1CO) this.A02.get(), 20, 36591927361077443L);
        if (j <= 1048576 * A00) {
            return false;
        }
        if (onClickListener == null) {
            return true;
        }
        Context context = this.A01;
        C2121Dea c2121Dea = new C2121Dea(context);
        c2121Dea.A06(2131957370);
        c2121Dea.A0A(1BK.A0v(context, Integer.valueOf(A00), 2131957369));
        c2121Dea.A0E(onClickListener, R.string.ok);
        c2121Dea.A0C(false);
        c2121Dea.A04();
        return true;
    }
}
