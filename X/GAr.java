package X;

import android.os.Bundle;
import com.facebook.payments.p2p.service.model.cards.AddPaymentCardParams;
import kotlin.jvm.functions.Function1;

/* loaded from: GAr.class */
public final class GAr extends C00q implements Function1 {
    public final /* synthetic */ String $billingCountry;
    public final /* synthetic */ String $billingZip;
    public final /* synthetic */ int $expiryMonth;
    public final /* synthetic */ int $expiryYear;
    public final /* synthetic */ String $firstSix;
    public final /* synthetic */ String $lastFour;
    public final /* synthetic */ Fch $paymentProtocolUtil;
    public final /* synthetic */ String $productID;
    public final /* synthetic */ String $productType;
    public final /* synthetic */ String $userID;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAr(Fch fch, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2) {
        super(1);
        this.$paymentProtocolUtil = fch;
        this.$expiryMonth = i;
        this.$expiryYear = i2;
        this.$billingZip = str;
        this.$billingCountry = str2;
        this.$userID = str3;
        this.$productType = str4;
        this.$productID = str5;
        this.$firstSix = str6;
        this.$lastFour = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5nf c5nf = (C5nf) obj;
        11T.A0F(c5nf, 0);
        Fch fch = this.$paymentProtocolUtil;
        int i = this.$expiryMonth;
        int i2 = this.$expiryYear;
        String str = this.$billingZip;
        String str2 = this.$billingCountry;
        String str3 = this.$userID;
        String str4 = this.$productType;
        String str5 = this.$productID;
        String str6 = (String) c5nf.A00;
        String str7 = this.$firstSix;
        String str8 = this.$lastFour;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("addPaymentCardParams", new AddPaymentCardParams(str, str2, str3, str4, str5, str6, str7, str8, i, i2));
        return S4s.A00((0R3) c5nf.A01, Fvf.A00(Fch.A01(A05, fch, 1BJ.A00(927)), fch, 30));
    }
}
