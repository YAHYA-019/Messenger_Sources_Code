package X;

import com.facebook.messaging.rtc.analytics.model.RtcListItemTrackableItem;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: Chr.class */
public final class Chr implements 2YE {
    public final int A00;
    public final Object A01;

    public Chr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bbs(Collection collection) {
        switch (this.A00) {
            case 0:
                0fH.A0i(Integer.valueOf(collection.size()), "OmnipickerImpressionItemAccumulator", "Log impression, size : %d");
                ArrayList arrayList = ((CIq) this.A01).A0B;
                arrayList.clear();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                return;
            case 1:
                11T.A0F(collection, 0);
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    C2k8 c2k8 = (C2k8) it2.next();
                    RtcListItemTrackableItem rtcListItemTrackableItem = (RtcListItemTrackableItem) c2k8.A05;
                    if (rtcListItemTrackableItem != null) {
                        CDR cdr = (CDR) this.A01;
                        if (CDR.A00(cdr, rtcListItemTrackableItem) != null) {
                            CDQ cdq = (CDQ) 1Br.A0B(cdr.A01);
                            if (c2k8.A05 != null) {
                                AbstractC01593ro A07 = AbF.A07(AgP.A00(AbI.A08(cdq.A01)), AbstractC00603o4.A00(248), false);
                                if (A07.A0B()) {
                                    BVD.A00(A07, (RtcListItemTrackableItem) c2k8.A05);
                                    A07.A06("surface", "video_tab");
                                    A07.A05("session_id", CDQ.A00(cdq));
                                    A07.A05(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, c2k8.A02);
                                    A07.A0A();
                                }
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append("Impression ");
                                0fH.A0j("RtcAnalyticsLogger", AnonymousClass001.A0a(c2k8.A05, A0k));
                            }
                        }
                    }
                }
                return;
            case 2:
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    C2k8 c2k82 = (C2k8) it3.next();
                    C1ps c1ps = c2k82.A05;
                    if (c1ps != null) {
                        CIH cih = (CIH) this.A01;
                        L1Q l1q = cih.A00;
                        l1q.A00.A0C(((AnonymousClass584) c1ps).AsR(), l1q);
                        0fH.A0i(Long.valueOf(((AnonymousClass584) c2k82.A05).AsR()), cih.A02, "Impression for: %d");
                    }
                }
                return;
            default:
                CHE che = (CHE) this.A01;
                0fH.A0i(Integer.valueOf(collection.size()), "TrackableNullStateImpressionItemAccumulator", "Log impression, size : %d");
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    C2k8 c2k83 = (C2k8) it4.next();
                    C1ps c1ps2 = c2k83.A05;
                    if (c1ps2 != null) {
                        try {
                            L1Q l1q2 = che.A01;
                            long parseLong = Long.parseLong(((C1326Ae4) c1ps2).A0C);
                            C00p c00p = l1q2.A00;
                            if (c00p.A01(parseLong) < 0) {
                                che.A02.add(c2k83);
                                c00p.A0C(Long.parseLong(((C1326Ae4) c2k83.A05).A0C), l1q2);
                            }
                        } catch (NumberFormatException e) {
                            0fH.A14("TrackableNullStateImpressionItemAccumulator", "Failed to parse id %s", new Object[]{((C1326Ae4) c2k83.A05).A0C, e});
                        }
                    }
                }
                return;
        }
    }
}
