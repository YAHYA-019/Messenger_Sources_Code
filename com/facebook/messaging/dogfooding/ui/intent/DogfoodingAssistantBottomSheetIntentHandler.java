package com.facebook.messaging.dogfooding.ui.intent;

import X.0CU;
import X.1BJ;
import X.1BK;
import X.7zM;
import X.7zQ;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.dogfooding.data.DogfoodingAssistantDataModel;
import com.facebook.messaging.dogfooding.ui.bottomsheet.DogfoodingAssistantBottomSheetActivity;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;

/* loaded from: DogfoodingAssistantBottomSheetIntentHandler.class */
public final class DogfoodingAssistantBottomSheetIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            throw AnonymousClass001.A0N(AbstractC00603o4.A00(32));
        }
        if (!7zQ.A0v().A1a) {
            return null;
        }
        String str = null;
        String str2 = null;
        Intent A0D = C3o5.A0D(context, DogfoodingAssistantBottomSheetActivity.class);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(data.toString());
        ImmutableMap.Builder A0c = 1BK.A0c();
        Iterator<String> it = data.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            String queryParameter = data.getQueryParameter(A0i);
            if (queryParameter == null) {
                queryParameter = urlQuerySanitizer.getValue(A0i);
            }
            if (A0i.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                str2 = data.getQueryParameter(A0i);
            } else if (A0i.equals("min_app_version")) {
                str = data.getQueryParameter(A0i);
            } else if (0CU.A04(A0i, "mc", 0, false) == 0) {
                A0c.put(7zM.A1C(3, A0i.length() - 1, A0i), queryParameter);
            }
        }
        A0D.putExtra(1BJ.A00(1245), new DogfoodingAssistantDataModel(A0c.build(), str, str2));
        return A0D;
    }
}
