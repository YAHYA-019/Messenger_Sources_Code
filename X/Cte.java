package X;

import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.OpenGraphShareIntentModel;
import com.facebook.share.model.LinksPreview;
import com.facebook.share.model.ShareItem;
import com.google.common.collect.ImmutableList;

/* loaded from: Cte.class */
public final class Cte implements DHZ {
    public Class BDh() {
        return OpenGraphShareIntentModel.class;
    }

    public /* bridge */ /* synthetic */ CDU BYN(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        DFr csy;
        OpenGraphShareIntentModel openGraphShareIntentModel = (OpenGraphShareIntentModel) broadcastFlowIntentModel;
        LinksPreview linksPreview = openGraphShareIntentModel.A00;
        if (linksPreview != null) {
            str = linksPreview.A00();
            str2 = linksPreview.name;
            str3 = linksPreview.description;
            str4 = linksPreview.caption;
            str5 = linksPreview.A01();
        } else {
            ImmutableList immutableList = openGraphShareIntentModel.A02;
            if (immutableList != null) {
                csy = new Csy(immutableList);
                return new CDU(csy);
            }
            ShareItem shareItem = openGraphShareIntentModel.A01;
            if (shareItem == null) {
                return new CDU(0S2.A00, AbF.A1D("No link, media, or share in platform share"));
            }
            str = shareItem.A03;
            str2 = shareItem.A08;
            str3 = shareItem.A06;
            str4 = shareItem.A07;
            str5 = null;
        }
        csy = new Ct1(str, str2, str3, str4, str5);
        return new CDU(csy);
    }
}
