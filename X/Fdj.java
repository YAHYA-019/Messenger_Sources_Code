package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.phoneconfirmation.protocol.PhoneNumberParam;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: Fdj.class */
public final class Fdj implements 1Tu {
    public 1BY A00;
    public final Eoo A01;
    public final AnonymousClass241 A02;
    public final C15h A03;

    public Fdj(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        Eoo eoo = (Eoo) 1Bn.A0B(99381);
        G7K A01 = G7K.A01(this, 57);
        AnonymousClass241 anonymousClass241 = (AnonymousClass241) 1Bn.A0B(33114);
        this.A01 = eoo;
        this.A03 = A01;
        this.A02 = anonymousClass241;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.util.concurrent.Future] */
    public OperationResult BMQ(1TC r302) {
        SettableFuture A0j;
        String str = r302.A06;
        FbUserSession A05 = 1Fw.A05(this.A00);
        ?? equals = 1BJ.A00(1969).equals(str);
        try {
            if (equals != 0) {
                Bundle bundle = r302.A00;
                PhoneNumberParam phoneNumberParam = (PhoneNumberParam) bundle.getParcelable("phoneNumber");
                String string = bundle.getString("confirmationCode");
                Eoo eoo = this.A01;
                Q6y q6y = new Q6y();
                1Ew r0 = eoo.A01;
                r0.Auc().getClass();
                07S A0J = 4YU.A0J(GraphQlCallInput.A02, r0.Auc().A13, "account_id");
                07S.A00(A0J, eoo.A02.A02(), "device_id");
                07S.A00(A0J, phoneNumberParam.A02, "phone_number");
                07S.A00(A0J, string, "code");
                4YV.A1A(A0J, ((2Jf) q6y).A00, "input");
                5Dh r02 = new 5Dh(q6y);
                AbstractC05414dq A09 = 1VX.A09(1BK.A04(eoo.A03), A05);
                r02.A05 = AbK.A0F();
                ListenableFuture A04 = A09.A04(r02, 5Dj.A01);
                A0j = 4YU.A0j();
                1Kd.A0F(FwJ.A00(A0j, eoo, 18), A04, eoo.A04);
            } else {
                if (!1BJ.A00(533).equals(str)) {
                    throw 0Pz.A05("Invalid operation type ", str);
                }
                Bundle bundle2 = r302.A00;
                PhoneNumberParam phoneNumberParam2 = (PhoneNumberParam) bundle2.getParcelable("phoneNumber");
                String string2 = bundle2.getString("confirmationCode");
                Eoo eoo2 = this.A01;
                Q6x q6x = new Q6x();
                1Ew r03 = eoo2.A01;
                r03.Auc().getClass();
                07S A0J2 = 4YU.A0J(GraphQlCallInput.A02, r03.Auc().A13, "account_id");
                07S.A00(A0J2, eoo2.A02.A02(), "device_id");
                07S.A00(A0J2, phoneNumberParam2.A02, "phone_number");
                07S.A00(A0J2, string2, "code");
                4YV.A1A(A0J2, ((2Jf) q6x).A00, "input");
                5Dh r04 = new 5Dh(q6x);
                AbstractC05414dq A092 = 1VX.A09(1BK.A04(eoo2.A03), A05);
                r04.A05 = AbK.A0F();
                ListenableFuture A042 = A092.A04(r04, 5Dj.A01);
                A0j = 4YU.A0j();
                1Kd.A0F(FwJ.A00(A0j, eoo2, 19), A042, eoo2.A04);
            }
            A0j.get();
            User user = (User) this.A03.get();
            if (user != null) {
                this.A02.A00(user.A0k);
            }
            return OperationResult.A00;
        } catch (ExecutionException unused) {
            return new OperationResult(equals.getCause());
        }
    }
}
