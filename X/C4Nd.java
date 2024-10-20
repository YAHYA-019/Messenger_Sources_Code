package X;

import android.net.Uri;
import com.facebook.messaging.business.common.calltoaction.model.CTACustomerFeedback;
import com.facebook.messaging.business.common.calltoaction.model.CTAInformationIdentify;
import com.facebook.messaging.business.common.calltoaction.model.CTAPaymentInfo;
import com.facebook.messaging.business.common.calltoaction.model.CTAUserConfirmation;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.common.calltoaction.model.CallToActionSimpleTarget;
import com.facebook.messaging.business.mdotme.model.PlatformRefParams;
import com.facebook.xapp.messaging.browser.model.MessengerWebViewParams;

/* renamed from: X.4Nd, reason: invalid class name */
/* loaded from: 4Nd.class */
public class C4Nd {
    public Uri A00;
    public Uri A01;
    public CTACustomerFeedback A02;
    public CTAInformationIdentify A03;
    public CTAPaymentInfo A04;
    public CTAUserConfirmation A05;
    public C4Ne A06;
    public C4Nc A07;
    public CallToActionSimpleTarget A08;
    public PlatformRefParams A09;
    public MessengerWebViewParams A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C1AJ A0M = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1AJ, java.lang.Object] */
    public C4Nd() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1AJ, java.lang.Object] */
    public C4Nd(CallToAction callToAction) {
        this.A0E = callToAction.A0E;
        this.A0I = callToAction.A0I;
        this.A00 = callToAction.A00;
        this.A01 = callToAction.A01;
        this.A07 = callToAction.A07;
        this.A08 = callToAction.A08;
        this.A0L = callToAction.A0K;
        this.A0J = callToAction.A0J;
        this.A05 = callToAction.A05;
        this.A04 = callToAction.A04;
        this.A03 = callToAction.A03;
        this.A09 = callToAction.A09;
        String str = callToAction.A0F;
        this.A0F = str;
        this.A0A = callToAction.A0A;
        this.A06 = callToAction.A06;
        this.A0K = callToAction.A0L;
        this.A0G = callToAction.A0G;
        this.A02 = callToAction.A02;
        this.A0D = callToAction.A0D;
        this.A0B = callToAction.A0B;
        this.A0H = str;
        this.A0C = callToAction.A0C;
    }

    public final void A00(String str) {
        this.A00 = (str == null || str.length() == 0) ? null : C0A2.A00(this.A0M, str);
    }

    public final void A01(String str) {
        this.A01 = (str == null || str.length() == 0) ? null : C0A2.A00(this.A0M, str);
    }
}
