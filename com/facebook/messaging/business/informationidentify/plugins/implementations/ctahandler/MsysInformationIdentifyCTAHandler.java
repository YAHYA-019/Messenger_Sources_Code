package com.facebook.messaging.business.informationidentify.plugins.implementations.ctahandler;

import X.0LS;
import X.11T;
import X.1BL;
import X.24X;
import X.2DM;
import X.2DO;
import X.2JY;
import X.4YU;
import X.6BJ;
import X.6BK;
import X.7zK;
import X.AbE;
import X.AnonymousClass001;
import X.AnonymousClass243;
import X.BSL;
import X.C3o5;
import X.EWI;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.business.common.calltoaction.model.CTAInformationIdentify;
import com.facebook.messaging.business.informationidentify.activity.PIIActivity;
import com.facebook.messaging.business.informationidentify.model.PIIQuestion;
import com.facebook.messaging.business.informationidentify.model.PIISinglePage;
import java.util.ArrayList;

/* loaded from: MsysInformationIdentifyCTAHandler.class */
public final class MsysInformationIdentifyCTAHandler {
    public final void A00(View view, 6BK r303) {
        6BJ r0;
        String A0r;
        2JY r02;
        String A0r2;
        if (r303 == null || (A0r = (r0 = (6BJ) r303).A0r(3575610)) == null || (A0r2 = (r02 = (2JY) r303).A0r(-1184643414)) == null) {
            return;
        }
        Context context = view.getContext();
        Intent A0D = C3o5.A0D(context, PIIActivity.class);
        A0D.putExtra("page_id", A0r2);
        String A0r3 = r0.A0r(-1151218932);
        if (A0r3 == null) {
            A0r3 = "";
        }
        String A0w = 4YU.A0w(r02);
        if (A0w == null) {
            A0w = "";
        }
        r02.A0r(110371416);
        24X A0I = AnonymousClass243.A00().A0I(A0r3);
        11T.A0A(A0I);
        2DO A09 = JSONUtil.A09(A0I, 2DM.class, "firstScreen");
        Iterable<24X> A0E = JSONUtil.A0E(A09, "questions");
        11T.A0A(A0E);
        ArrayList A0s = AnonymousClass001.A0s();
        for (24X r03 : A0E) {
            Integer A00 = EWI.A00(JSONUtil.A0G(r03, "format"));
            String A0G = JSONUtil.A0G(r03, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            11T.A0A(A0G);
            String A0G2 = JSONUtil.A0G(r03, "length");
            String A0G3 = JSONUtil.A0G(r03, "mask");
            String A0G4 = JSONUtil.A0G(r03, 7zK.A00(4));
            String A0G5 = JSONUtil.A0G(r03, "title");
            11T.A0A(A0G5);
            A0s.add(new PIIQuestion(A00, BSL.A00(JSONUtil.A0G(r03, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)), A0G, A0G2, A0G3, A0G4, JSONUtil.A0G(r03, "subtitle"), A0G5));
        }
        String A0G6 = JSONUtil.A0G(A0I, "color");
        String A0G7 = JSONUtil.A0G(A0I, "currentIndex");
        String A0G8 = JSONUtil.A0G(A0I, "formId");
        String A0G9 = JSONUtil.A0G(A0I, "numScreens");
        String A0G10 = JSONUtil.A0G(A09, AbE.A00(712));
        11T.A0A(A0G10);
        A0D.putExtra("information_identify", new CTAInformationIdentify(new PIISinglePage(1BL.A0a(A0s), A0G10), A0G6, A0G7, A0G8, A0G9, A0w));
        A0D.putExtra("cta_type", A0r.equals("xma_biz_inbox_form_send") ? "OPEN_BIZ_INBOX_FORM" : "OPEN_DIRECT_SEND_VIEW");
        0LS.A0A(context, A0D);
    }
}
