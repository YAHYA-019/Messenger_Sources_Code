package com.facebook.messaging.rtc.plugins.bloks.action.watch;

import X.0Pz;
import X.0S2;
import X.11T;
import X.1BK;
import X.4YU;
import X.AbM;
import X.C14m;
import X.DKB;
import X.DKc;
import X.DLQ;
import X.FyG;
import android.content.Context;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.cowatch.intent.model.CowatchShareModel;
import com.facebook.messaging.cowatch.intent.model.CowatchShareSheetOptions;

/* loaded from: OpenPrecallDiscoverySheet.class */
public final class OpenPrecallDiscoverySheet {
    public final Object A00(DKc dKc) {
        Object A01 = dKc.A01(0);
        String A00 = DKB.A00(477);
        11T.A0I(A01, A00);
        DLQ dlq = (DLQ) A01;
        Object A002 = dKc.A00();
        11T.A0I(A002, DKB.A00(ActionId.HEADER_DATA_LOADED));
        FyG fyG = (FyG) A002;
        Object A012 = dKc.A01(2);
        11T.A0I(A012, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A012;
        Object A013 = dKc.A01(3);
        11T.A0I(A013, A00);
        DLQ dlq2 = (DLQ) A013;
        Object A014 = dKc.A01(4);
        11T.A0I(A014, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A014;
        String BCx = dlq2.BCx(38, "");
        11T.A0A(BCx);
        String A0A = dlq2.A0A();
        String BCx2 = dlq2.BCx(36, "");
        11T.A0A(BCx2);
        CowatchShareSheetOptions cowatchShareSheetOptions = new CowatchShareSheetOptions(BCx, A0A, BCx2);
        String A0A2 = dlq.A0A();
        String A0B = dlq.A0B();
        Context context = fyG.A00;
        11T.A0A(context);
        if (!11T.A0O(str, "call")) {
            if (11T.A0O(str, "message")) {
                throw new C14m("Precall Discovery send is not supported.");
            }
            throw 0Pz.A05("Unknown Precall Discovery action: ", str);
        }
        CowatchShareModel cowatchShareModel = new CowatchShareModel(cowatchShareSheetOptions, 0S2.A01, str2, A0B, A0A2, null);
        Bundle A05 = 1BK.A05();
        A05.putString("ShareType", "ShareType.cowatchShareType");
        A05.putParcelable("parcelable_share_extras", cowatchShareModel);
        AbM.A0k(A05, "com.facebook.orca.notify.SECURE_VIEW", 0).BXk(context, 4YU.A0F("fb-messenger://share"));
        return null;
    }
}
