package X;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.service.model.SetSettingsParams;
import com.facebook.messenger.plugins.entityenrichmentplugin.EntityEnrichmentPluginPostmailbox;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: B8I.class */
public abstract class B8I extends 1Te {
    public static OperationResult A0C(Object obj) {
        OperationResult A04 = OperationResult.A04(obj);
        Bundle bundle = A04.resultDataBundle;
        if (bundle != null) {
            bundle.putString(Property.SYMBOL_Z_ORDER_SOURCE, EntityEnrichmentPluginPostmailbox.DB_FILE_EXTENSION);
        }
        return A04;
    }

    public static OperationResult A0D(Object obj) {
        OperationResult A04 = OperationResult.A04(obj);
        Bundle bundle = A04.resultDataBundle;
        if (bundle != null) {
            bundle.putString(Property.SYMBOL_Z_ORDER_SOURCE, "cache");
        }
        return A04;
    }

    public static C4z1 A0E(B8G b8g) {
        return (C4z1) b8g.A02.get();
    }

    public static C4yz A0F(B8H b8h) {
        return (C4yz) b8h.A03.get();
    }

    public static 4yH A0G(B8H b8h) {
        return (4yH) b8h.A05.get();
    }

    public OperationResult A10(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A11(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00c3, code lost:
    
        if (r0.A05(X.0Pz.A0W("first_", r0.dbName)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A12(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 1681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8I.A12(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:355:0x0942, code lost:
    
        if (r0 == 0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0928, code lost:
    
        if (((X.4dO) r304).A03 == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x09cf, code lost:
    
        if (r0.A01.size() < r0) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0398, code lost:
    
        if (A0F(r0).A01 != false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x09a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A13(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 2592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8I.A13(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A14(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A15(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a0, code lost:
    
        if (r0.A21 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A16(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8I.A16(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A17(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A18(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A19(1Tu r302, 1TC r303) {
        NotificationSetting notificationSetting;
        if (!(this instanceof B8H)) {
            return r302.BMQ(r303);
        }
        B8H b8h = (B8H) this;
        OperationResult BMQ = r302.BMQ(r303);
        if (BMQ.success && (notificationSetting = ((SetSettingsParams) r303.A00.getParcelable(1BJ.A00(550))).A00) != null) {
            1Ql A0V = 1BL.A0V(b8h.A09);
            A0V.CaH(1NK.A3l, notificationSetting.A00());
            A0V.commit();
        }
        return BMQ;
    }
}
