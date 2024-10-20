package X;

import com.facebook.location.platform.api.Location;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Ftm.class */
public final class Ftm implements GGj {
    public final F5i A00;

    public Ftm(F5i f5i) {
        this.A00 = f5i;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        long j;
        EEP eep = (AbstractC10314t5) obj;
        if (eep instanceof EEP) {
            EEP eep2 = eep;
            F5i f5i = this.A00;
            Integer num = eep2.A00;
            C00i c00i = f5i.A01;
            long generateNewFlowId = AbG.A0r(c00i).generateNewFlowId(866986654);
            UserFlowLogger A0r = AbG.A0r(c00i);
            String str = num.intValue() != 0 ? "token" : "headers";
            long j2 = F5i.A03;
            UserFlowConfig userFlowConfig = new UserFlowConfig(str, false);
            userFlowConfig.mTtlMs = j2;
            A0r.flowStart(generateNewFlowId, userFlowConfig);
            AbG.A0r(c00i).flowMarkPoint(generateNewFlowId, 0Pz.A0W(str, "_start"));
            r302.ANn(new EEZ(eep2, new Ejt(str, generateNewFlowId)));
            return;
        }
        if (!(eep instanceof EDu)) {
            if (eep instanceof EDv) {
                EDv eDv = (EDv) eep;
                boolean z = eDv.A02;
                F5i f5i2 = this.A00;
                Ejt ejt = eDv.A00;
                if (z) {
                    AbG.A0r(f5i2.A01).flowEndSuccess(ejt.A00);
                    return;
                } else {
                    AbG.A0r(f5i2.A01).flowEndFail(ejt.A00, eDv.A01, null);
                    return;
                }
            }
            return;
        }
        EDu eDu = (EDu) eep;
        F5i f5i3 = this.A00;
        Ejt ejt2 = eDu.A00;
        String str2 = eDu.A02;
        1QC r0 = eDu.A01;
        UserFlowLogger A0r2 = AbG.A0r(f5i3.A01);
        long j3 = ejt2.A00;
        if (r0 != null) {
            PointEditor markPointWithEditor = A0r2.markPointWithEditor(j3, str2);
            Iterator A00 = Fue.A00(r0);
            while (A00.hasNext()) {
                ET7 et7 = (ET7) A00.next();
                String str3 = (String) et7.A00;
                Object obj2 = et7.A01;
                if (str3 != null) {
                    markPointWithEditor.addPointData(str3, obj2 != null ? obj2.toString() : "");
                }
            }
            markPointWithEditor.markerEditingCompleted();
        } else {
            A0r2.flowMarkPoint(j3, str2);
        }
        String str4 = ejt2.A01;
        1UG A08 = 1BK.A08(1BK.A07(f5i3.A02), "zero_sdk_generic_event");
        if (A08.isSampled()) {
            if (r0 != null) {
                HashMap A0u = AnonymousClass001.A0u();
                Iterator A002 = Fue.A00(r0);
                while (A002.hasNext()) {
                    ET7 et72 = (ET7) A002.next();
                    A0u.put(et72.A00, 4YV.A0u(et72.A01));
                }
                A08.A6J(Location.EXTRAS, A0u);
            }
            A08.A7R("event_name", str2);
            A08.A7R("event_category", str4);
            try {
                j = Long.parseLong(DKE.A0t(f5i3.A00));
            } catch (NumberFormatException unused) {
                j = 0;
            }
            DKD.A1D(A08, j);
            A08.BZL();
        }
    }
}
