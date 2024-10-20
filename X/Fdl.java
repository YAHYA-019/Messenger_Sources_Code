package X;

import com.facebook.account.recovery.common.protocol.AccountRecoverySendConfirmationCodeMethod$Result;
import com.facebook.account.recovery.common.protocol.AccountRecoveryValidateCodeMethod$Params;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.http.protocol.ApiErrorResult;

/* loaded from: Fdl.class */
public final class Fdl implements 1Tu {
    public static String A0D;
    public 1BY A00;
    public final C15h A0C = G7K.A01(this, 3);
    public final C00i A08 = 1BV.A01((1BY) null, 99808);
    public final C00i A09 = 1BV.A01((1BY) null, 99809);
    public final C00i A0A = 1BV.A01((1BY) null, 100115);
    public final C00i A0B = 1BV.A01((1BY) null, 98884);
    public final C00i A04 = 1BV.A01((1BY) null, 98886);
    public final C00i A06 = 1BV.A01((1BY) null, 85278);
    public final C00i A03 = 1BV.A01((1BY) null, 84731);
    public final C00i A02 = 1BV.A01((1BY) null, 98889);
    public final C00i A01 = 1BV.A01((1BY) null, 98885);
    public final C00i A05 = 1BV.A01((1BY) null, 100113);
    public final C00i A07 = 1BV.A01((1BY) null, 100112);

    public Fdl(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static 1Rl A00(Fdl fdl) {
        return (1Rl) fdl.A0C.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OperationResult BMQ(1TC r302) {
        Object parcelable;
        1Rl A00;
        C00i c00i;
        AccountRecoverySendConfirmationCodeMethod$Result accountRecoverySendConfirmationCodeMethod$Result;
        String str = r302.A06;
        if (!1BJ.A00(41).equals(str)) {
            if (1BJ.A00(73).equals(str)) {
                accountRecoverySendConfirmationCodeMethod$Result = (AccountRecoverySendConfirmationCodeMethod$Result) A00(this).A07(r302.A02, DKC.A0S(this.A09), (C04033zm) null, r302.A00.getParcelable("accountRecoverySendCodeParamsKey"));
                String str2 = accountRecoverySendConfirmationCodeMethod$Result.mAutoConfMetadata;
                if (str2 != null) {
                    A0D = str2;
                }
                if (!accountRecoverySendConfirmationCodeMethod$Result.mSuccess.booleanValue()) {
                    return OperationResult.A01(29B.A0H);
                }
            } else {
                if (1BJ.A00(74).equals(str)) {
                    AccountRecoveryValidateCodeMethod$Params accountRecoveryValidateCodeMethod$Params = (AccountRecoveryValidateCodeMethod$Params) r302.A00.getParcelable(AbE.A00(ActionId.HEADER_DATA_LOADED));
                    FEg fEg = (FEg) this.A07.get();
                    boolean AZk = 1BK.A0N(((ErU) this.A05.get()).A00).AZk(2324140901334716611L);
                    String str3 = accountRecoveryValidateCodeMethod$Params.A0D;
                    String str4 = str3;
                    if (AZk) {
                        str4 = FEg.A01(fEg, str3);
                    }
                    accountRecoverySendConfirmationCodeMethod$Result = null;
                    int i = 0;
                    int i2 = 0;
                    do {
                        try {
                            C00i c00i2 = fEg.A02;
                            FIO.A03(c00i2, i2);
                            accountRecoverySendConfirmationCodeMethod$Result = A00(this).A07(r302.A02, DKC.A0S(this.A0A), (C04033zm) null, new AccountRecoveryValidateCodeMethod$Params(accountRecoveryValidateCodeMethod$Params.A0C, accountRecoveryValidateCodeMethod$Params.A09, str4, accountRecoveryValidateCodeMethod$Params.A0E, accountRecoveryValidateCodeMethod$Params.A01, accountRecoveryValidateCodeMethod$Params.A00, accountRecoveryValidateCodeMethod$Params.A08, accountRecoveryValidateCodeMethod$Params.A03, accountRecoveryValidateCodeMethod$Params.A05, accountRecoveryValidateCodeMethod$Params.A0A, accountRecoveryValidateCodeMethod$Params.A02, accountRecoveryValidateCodeMethod$Params.A06, accountRecoveryValidateCodeMethod$Params.A04, A0D, Boolean.valueOf(accountRecoveryValidateCodeMethod$Params.A0B).booleanValue(), accountRecoveryValidateCodeMethod$Params.A0F));
                            FIO.A04(c00i2, i2);
                            break;
                        } catch (2L0 e) {
                            ApiErrorResult apiErrorResult = e.result;
                            if (apiErrorResult != null) {
                                if (apiErrorResult.A00() == 418) {
                                    FIO.A01(fEg, 418, i2);
                                    if (i2 == 0) {
                                        str4 = FEg.A00(fEg, e, str3);
                                    } else {
                                        if (i2 != 1) {
                                            throw e;
                                        }
                                        str4 = str3;
                                    }
                                    i2++;
                                } else {
                                    i = apiErrorResult.A00();
                                }
                            }
                            FIO.A01(fEg, i, i2);
                            throw e;
                        }
                    } while (i2 < 3);
                }
                if (1BJ.A00(916).equals(str)) {
                    parcelable = r302.A00.getParcelable("accountRecoveryValidateFlashCallParamsKey");
                    A00 = A00(this);
                    c00i = this.A0B;
                } else {
                    if (1BJ.A00(915).equals(str)) {
                        return new OperationResult(A00(this).A07(r302.A02, DKC.A0S(this.A04), (C04033zm) null, r302.A00.getParcelable("accountRecoveryAppActivationsParamsKey")).toString(), null);
                    }
                    if (1BJ.A00(207).equals(str)) {
                        parcelable = r302.A00.getParcelable(AbE.A00(648));
                        A00 = A00(this);
                        c00i = this.A06;
                    } else if (1BJ.A00(918).equals(str)) {
                        parcelable = r302.A00.getString("url");
                        A00 = A00(this);
                        c00i = this.A03;
                    } else if (1BJ.A00(914).equals(str)) {
                        parcelable = r302.A00.getParcelable("accountRecoveryAddNewEmailParamsKey");
                        A00 = A00(this);
                        c00i = this.A02;
                    } else {
                        if (!1BJ.A00(917).equals(str)) {
                            throw new RuntimeException(str);
                        }
                        parcelable = r302.A00.getParcelable("accountRecoveryLaraEndpointParamsKey");
                        A00 = A00(this);
                        c00i = this.A01;
                    }
                }
            }
            return OperationResult.A04(accountRecoverySendConfirmationCodeMethod$Result);
        }
        parcelable = r302.A00.getParcelable(AbE.A00(ActionId.VIDEO_SET_RENDERER_CONTEXT));
        A00 = A00(this);
        c00i = this.A08;
        accountRecoverySendConfirmationCodeMethod$Result = A00.A07(r302.A02, DKC.A0S(c00i), (C04033zm) null, parcelable);
        return OperationResult.A04(accountRecoverySendConfirmationCodeMethod$Result);
    }
}
