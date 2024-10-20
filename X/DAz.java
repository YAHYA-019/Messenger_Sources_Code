package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.widget.EditText;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.pages.common.requesttime.shared.cancelappointment.RejectAppointmentActivity;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

/* loaded from: DAz.class */
public final class DAz implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public DAz(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        AbstractMap A0u;
        Account[] accountArr;
        switch (this.A00) {
            case 0:
                String A00 = DKB.A00(64);
                String A002 = DKB.A00(513);
                FGk fGk = (FGk) this.A01;
                String str = this.A02;
                try {
                    1kF.A01(0Pz.A0Y(A00, A002, ':'));
                    fGk.A01.A00.remove(str);
                    Object obj = fGk.A05.get();
                    11T.A0A(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(04R.A0D((java.util.Map) obj));
                    linkedHashMap.remove(str);
                    FGk.A01(fGk, 04R.A0C(linkedHashMap));
                    1kF.A00();
                    A0u = 04S.A00;
                    break;
                } catch (Throwable th) {
                    1kF.A00();
                    throw th;
                }
            case 1:
                Context context = (Context) this.A01;
                String str2 = this.A02;
                A0u = AnonymousClass001.A0u();
                if (context.checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS") == 0) {
                    accountArr = AccountManager.get(context).getAccountsByType("com.google");
                    11T.A0A(accountArr);
                } else {
                    accountArr = new Account[0];
                }
                for (Account account : accountArr) {
                    String str3 = null;
                    try {
                        String A0W = 0Pz.A0W(DKB.A00(307), str2);
                        LDn.A07(context, LDn.A03(account, context, A0W));
                        str3 = LDn.A03(account, context, A0W);
                    } catch (Exception unused) {
                    }
                    String str4 = account.name;
                    11T.A09(str4);
                    if (str3 == null) {
                        str3 = "";
                    }
                    A0u.put(str4, str3);
                }
                break;
            default:
                RejectAppointmentActivity rejectAppointmentActivity = (RejectAppointmentActivity) this.A01;
                C63p.A00(rejectAppointmentActivity.A0D, "profservices_booking_admin_decline_request", rejectAppointmentActivity.A03, rejectAppointmentActivity.A04, rejectAppointmentActivity.A06);
                07S A0J = 4YU.A0J(GraphQlCallInput.A02, rejectAppointmentActivity.A06, "appointment_id");
                07S.A00(A0J, rejectAppointmentActivity.A03, "page_id");
                EditText editText = rejectAppointmentActivity.A00;
                07S.A00(A0J, String.valueOf(editText != null ? editText.getText() : null), "message_text");
                GraphQlQueryParamSet A0N = 4YU.A0N(A0J, this.A02, "recurrence_cancellation_type");
                4YV.A1A(A0J, A0N, "input");
                DKN A0K = AbK.A0K(rejectAppointmentActivity);
                if (rejectAppointmentActivity.A02 != null) {
                    return AbL.A0Z(A0K.A02(), AbO.A09(A0N, new C01643sd(Q8p.class, "RecurringAppointmentCancelMutation", null, "input", "fbandroid", -826320920, 384, 2136848324L, 2136848324L, false, true)), 719088512172496L);
                }
                7zL.A1C();
                throw 0Q8.createAndThrow();
        }
        return A0u;
    }
}
