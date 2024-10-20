package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.user.model.User;

/* loaded from: Cuk.class */
public final class Cuk implements 6HP {
    public final /* synthetic */ CoU A00;
    public final /* synthetic */ User A01;

    public Cuk(CoU coU, User user) {
        this.A00 = coU;
        this.A01 = user;
    }

    public void CKc(ServiceException serviceException) {
        AlO alO = (AlO) this.A00.A01;
        Context context = alO.A01;
        if (context != null) {
            Toast.makeText(context, 2131954990, 0).show();
            AlO.A08(alO, this.A01, 0S2.A0C);
        }
    }

    public void CP4(OperationResult operationResult) {
        CoU coU = this.A00;
        AlO alO = (AlO) coU.A01;
        C9A A01 = CLq.A01(alO);
        A01.A00 = "remove_from_group";
        A01.A00();
        AlO.A08(alO, AlO.A06(alO), 0S2.A0C);
        coU.Bu9("remove_group_exit");
    }
}
