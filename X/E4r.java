package X;

import com.facebook.fbservice.service.ServiceException;
import com.facebook.pages.app.message.p2p.markaspaid.model.PagesMarkAsPaidP2pPaymentData;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.invoice.creation.v2.model.InvoiceData;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.model.P2pThemeOrGiftWrap;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* loaded from: E4r.class */
public final class E4r extends ETm {
    public final /* synthetic */ E65 A00;

    public E4r(E65 e65) {
        this.A00 = e65;
    }

    public void A01(ServiceException serviceException) {
        this.A00.A03.A00();
    }

    public void A02(EtE etE) {
        ELo eLo = etE.A00;
        if (eLo != ELo.A03) {
            RQD rqd = this.A00.A01;
            String A00 = etE.A00();
            FoS foS = rqd.A00.A00.A05;
            P2pPaymentData p2pPaymentData = foS.A00;
            p2pPaymentData.getClass();
            CurrencyAmount currencyAmount = p2pPaymentData.A01;
            String str = p2pPaymentData.A08;
            String str2 = p2pPaymentData.A09;
            PaymentMethod paymentMethod = p2pPaymentData.A04;
            InvoiceData invoiceData = p2pPaymentData.A02;
            String str3 = p2pPaymentData.A0A;
            MediaResource mediaResource = p2pPaymentData.A05;
            String str4 = p2pPaymentData.A0B;
            PagesMarkAsPaidP2pPaymentData pagesMarkAsPaidP2pPaymentData = p2pPaymentData.A00;
            String str5 = p2pPaymentData.A0C;
            String str6 = p2pPaymentData.A0D;
            String str7 = p2pPaymentData.A0E;
            ImmutableList immutableList = p2pPaymentData.A06;
            P2pThemeOrGiftWrap p2pThemeOrGiftWrap = p2pPaymentData.A03;
            Long l = p2pPaymentData.A07;
            HashSet A1E = AbF.A1E(p2pPaymentData.A0F);
            int ordinal = eLo.ordinal();
            if (ordinal == 1) {
                str5 = A00;
            } else if (ordinal == 2) {
                str3 = A00;
            } else if (ordinal == 3) {
                str = A00;
            } else if (ordinal == 5) {
                str6 = A00;
            }
            P2pPaymentData p2pPaymentData2 = new P2pPaymentData(pagesMarkAsPaidP2pPaymentData, currencyAmount, invoiceData, p2pThemeOrGiftWrap, paymentMethod, mediaResource, immutableList, l, str, str2, str3, str4, str5, str6, str7, A1E);
            foS.A00 = p2pPaymentData2;
            Euz euz = foS.A08;
            euz.A01 = p2pPaymentData2;
            1Du it = euz.A04.iterator();
            while (it.hasNext()) {
                ((Ezy) it.next()).A0H(p2pPaymentData2);
            }
            euz.A00();
        }
        this.A00.A04.set(ELQ.A04);
    }
}
