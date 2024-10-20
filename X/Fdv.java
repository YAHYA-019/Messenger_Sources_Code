package X;

import android.os.Parcelable;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.phoneconfirmation.protocol.RegisterMessengerOnlyUserResult;
import com.facebook.messaging.phoneconfirmation.protocol.RequestConfirmationCodeParams;

/* loaded from: Fdv.class */
public final class Fdv implements 1Tu, CallerContextable {
    public static final CallerContext A07 = CallerContext.A06(Fdv.class);
    public static final String __redex_internal_original_name = "PhoneConfirmationServiceHandler";
    public final C00i A05 = 1BQ.A02(84633);
    public final Fck A00 = (Fck) 1Bi.A03(100221);
    public final C00i A04 = 1BV.A00(100136);
    public final C00i A02 = 1BQ.A02(100137);
    public final C00i A03 = 1BQ.A02(85191);
    public final C00i A06 = 1BV.A00(84714);
    public final C00i A01 = 1BQ.A02(100138);

    public static final Fdv A00() {
        return new Fdv();
    }

    public OperationResult BMQ(1TC r302) {
        Parcelable parcelable;
        1Rl r303;
        C00i c00i;
        Object A072;
        String str = r302.A06;
        if (1BJ.A00(536).equals(str)) {
            Parcelable parcelable2 = r302.A00.getParcelable(AbE.A00(689));
            RegisterMessengerOnlyUserResult registerMessengerOnlyUserResult = (RegisterMessengerOnlyUserResult) ((1Rl) this.A05.get()).A07(A07, DKC.A0S(this.A03), (C04033zm) null, parcelable2);
            AuthenticationResult authenticationResult = registerMessengerOnlyUserResult.A01;
            A072 = registerMessengerOnlyUserResult;
            if (authenticationResult != null) {
                Fck fck = this.A00;
                fck.A1y(null, false);
                fck.A1R(authenticationResult, new EnC(str), null, false);
                A072 = registerMessengerOnlyUserResult;
            }
        } else {
            if (1BJ.A00(543).equals(str)) {
                RequestConfirmationCodeParams requestConfirmationCodeParams = (RequestConfirmationCodeParams) r302.A00.getParcelable("requestConfirmationCodeParams");
                boolean z = requestConfirmationCodeParams.A0B;
                r303 = (1Rl) this.A05.get();
                if (z) {
                    c00i = this.A02;
                    parcelable = requestConfirmationCodeParams;
                } else {
                    c00i = this.A04;
                    parcelable = requestConfirmationCodeParams;
                }
            } else {
                if (1BJ.A00(388).equals(str)) {
                    Parcelable parcelable3 = r302.A00.getParcelable("confirm_phone_params");
                    ((1Rl) this.A05.get()).A08(A07, DKC.A0S(this.A06), parcelable3);
                    return OperationResult.A00;
                }
                if (!1BJ.A00(482).equals(str)) {
                    throw 0Pz.A05("Invalid operation type ", str);
                }
                parcelable = r302.A00.getParcelable("checkConfirmationCodeParams");
                r303 = (1Rl) this.A05.get();
                c00i = this.A01;
            }
            1Rl r0 = r303;
            A072 = r0.A07(A07, DKC.A0S(c00i), (C04033zm) null, parcelable);
        }
        return OperationResult.A04(A072);
    }
}
