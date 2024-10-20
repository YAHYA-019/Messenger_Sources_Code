package X;

import android.os.Bundle;
import com.facebook.payments.p2p.service.model.cards.EditPaymentCardParams;
import kotlin.jvm.functions.Function1;

/* loaded from: GAi.class */
public final class GAi extends C00q implements Function1 {
    public final /* synthetic */ String $billingZip;
    public final /* synthetic */ String $credentialId;
    public final /* synthetic */ int $expiryMonth;
    public final /* synthetic */ int $expiryYear;
    public final /* synthetic */ Fch $paymentProtocolUtil;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAi(Fch fch, String str, String str2, int i, int i2) {
        super(1);
        this.$paymentProtocolUtil = fch;
        this.$credentialId = str;
        this.$expiryMonth = i;
        this.$expiryYear = i2;
        this.$billingZip = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5nf c5nf = (C5nf) obj;
        11T.A0F(c5nf, 0);
        Fch fch = this.$paymentProtocolUtil;
        String str = this.$credentialId;
        int i = this.$expiryMonth;
        int i2 = this.$expiryYear;
        String str2 = this.$billingZip;
        String str3 = (String) c5nf.A00;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("editPaymentCardParams", new EditPaymentCardParams(str, str2, str3, i, i2));
        return S4s.A00((0R3) c5nf.A01, Fvf.A00(Fch.A01(A05, fch, 1BJ.A00(1255)), fch, 31));
    }
}
