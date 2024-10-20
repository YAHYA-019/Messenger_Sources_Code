package X;

import android.net.Uri;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.model.attribution.AttributionVisibility;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;

/* loaded from: Cht.class */
public final class Cht implements C7yr {
    public C7k1 A00;
    public Uri A01;
    public final CallToAction A02;
    public final Message A03;
    public final Integer A04;

    public Cht(Message message, Integer num) {
        this.A03 = message;
        ContentAppAttribution contentAppAttribution = message.A09;
        if (contentAppAttribution == null) {
            throw 1BK.A0h();
        }
        this.A04 = num;
        this.A02 = contentAppAttribution.A00;
    }

    public void A00(Uri uri) {
        C7k1 c7k1;
        Uri uri2 = this.A01;
        boolean z = true;
        if (uri2 != null ? uri2.equals(uri) : uri2 == uri) {
            z = false;
        }
        this.A01 = uri;
        if (!z || (c7k1 = this.A00) == null) {
            return;
        }
        1Iw r0 = c7k1.A00;
        if (r0.A02 != null) {
            r0.A0H(7zR.A0N(), "updateState:GenericAttributionComponent.onDataChanged");
        }
    }

    @Override // X.C7yr
    public CallToAction AXe() {
        return this.A02;
    }

    @Override // X.C7yr
    public AttributionVisibility AXf() {
        AttributionVisibility attributionVisibility;
        ContentAppAttribution contentAppAttribution = this.A03.A09;
        if (contentAppAttribution == null || (attributionVisibility = contentAppAttribution.A01) == null) {
            throw 1BK.A0h();
        }
        return attributionVisibility;
    }

    @Override // X.C7yr
    public Integer Aau() {
        return this.A04;
    }

    @Override // X.C7yr
    public Uri Apj() {
        String str;
        ContentAppAttribution contentAppAttribution = this.A03.A09;
        if (contentAppAttribution != null && (str = contentAppAttribution.A09) != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            if (uri != null) {
                return uri;
            }
        }
        return this.A01;
    }

    @Override // X.C7yr
    public Message Awk() {
        return this.A03;
    }

    @Override // X.C7yr
    public void Cns(C7k1 c7k1) {
        synchronized (this) {
            this.A00 = c7k1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // X.C7yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getIdentifier() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            com.facebook.messaging.model.attribution.ContentAppAttribution r0 = r0.A09
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L15
            r0 = r302
            java.lang.String r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L18
        L15:
            java.lang.String r0 = ""
            r302 = r0
        L18:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cht.getIdentifier():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // X.C7yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getName() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            com.facebook.messaging.model.attribution.ContentAppAttribution r0 = r0.A09
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L15
            r0 = r302
            java.lang.String r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L18
        L15:
            java.lang.String r0 = ""
            r302 = r0
        L18:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cht.getName():java.lang.String");
    }
}
