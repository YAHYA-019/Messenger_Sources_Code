package X;

import com.facebook.common.callercontext.CallerContext;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import kotlin.jvm.functions.Function1;

/* loaded from: GAh.class */
public final class GAh extends C00q implements Function1 {
    public final /* synthetic */ String $cardId;
    public final /* synthetic */ String $deviceKey;
    public final /* synthetic */ String $paymentType;
    public final /* synthetic */ String $pttString;
    public final /* synthetic */ FvL this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAh(FvL fvL, String str, String str2, String str3, String str4) {
        super(1);
        this.this$0 = fvL;
        this.$deviceKey = str;
        this.$cardId = str2;
        this.$pttString = str3;
        this.$paymentType = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SecurityProviderEphemeral securityProviderEphemeral = (SecurityProviderEphemeral) obj;
        11T.A0F(securityProviderEphemeral, 0);
        return ((1Rl) 1Br.A0B(this.this$0.A03)).A07((CallerContext) null, new FhZ(this.this$0, this.$deviceKey), (C04033zm) null, new 8Lu(new DqF(this.$cardId, "$e2ee", this.$pttString, this.$paymentType, 0), securityProviderEphemeral));
    }
}
