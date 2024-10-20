package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C1l.class */
public final class C1l {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(BroadcastFlowMnetItem broadcastFlowMnetItem, String str) {
        ArrayList A0s;
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "ls_mnet_conversion_share");
        if (A08.isSampled()) {
            int A00 = CJd.A00(broadcastFlowMnetItem.A0M);
            0DA r0 = new 0DA();
            7zN.A14(r0, "conversion_type", 0);
            r0.A03("is_search", false);
            if (A00 != ((-1) << (-1))) {
                7zN.A14(r0, Property.SYMBOL_Z_ORDER_SOURCE, A00);
            } else {
                r0.A07(Property.SYMBOL_Z_ORDER_SOURCE, (String) null);
            }
            long j = broadcastFlowMnetItem.A04;
            0DA r02 = new 0DA();
            r02.A06("absolute_position", 1BK.A0l(broadcastFlowMnetItem.A00));
            String valueOf = String.valueOf(j);
            r02.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, valueOf);
            r02.A06("relative_position", 1BK.A0l(broadcastFlowMnetItem.A02));
            r02.A01(CJd.A02(broadcastFlowMnetItem.A0P), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A08.A7T(r02, "item");
            0DA r03 = new 0DA();
            r03.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, valueOf);
            r03.A06("time_on_screen", 4YV.A0j());
            r03.A05("surface", 7);
            7zN.A14(r03, "section", CJd.A01(broadcastFlowMnetItem.A0K));
            r03.A05(Property.SYMBOL_Z_ORDER_SOURCE, 7);
            A08.A7T(r03, "impression");
            A08.A7T(r0, "conversion");
            A08.A7R("bcf_session_id", broadcastFlowMnetItem.A0C);
            A08.A7R("share_session_id", broadcastFlowMnetItem.A0L);
            A08.A5c(broadcastFlowMnetItem.A06, "sheet_state");
            A08.A5c(broadcastFlowMnetItem.A00(), "rank_section");
            0DA r04 = new 0DA();
            String str2 = broadcastFlowMnetItem.A0H;
            if (str2 == null) {
                str2 = "";
            }
            r04.A07(TraceFieldType.RequestID, str2);
            A08.A7T(r04, "rank_info");
            ImmutableMap immutableMap = broadcastFlowMnetItem.A07;
            if (immutableMap == null) {
                A0s = null;
            } else {
                A0s = AnonymousClass001.A0s();
                Iterator A14 = AbM.A14(immutableMap);
                while (A14.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A14);
                    0DA r05 = new 0DA();
                    r05.A06("recipient_id", (Long) A0z.getKey());
                    r05.A01((AnonymousClass550) A0z.getValue(), "interop_user_type");
                    A0s.add(r05);
                }
            }
            A08.A7h("recipient_info", A0s);
            AbL.A0v(A08, TraceFieldType.TransportType, broadcastFlowMnetItem.A03);
            A08.A7R("post_id", (String) null);
            A08.A7R("author_id", broadcastFlowMnetItem.A0B);
            A08.A7R("reshare_post_id", (String) null);
            A08.A7R("reshare_author_id", broadcastFlowMnetItem.A0I);
            A08.A7R("local_data_id", str);
            A08.A5H("is_e2ee_share_eligible", broadcastFlowMnetItem.A08);
            A08.BZL();
        }
    }
}
