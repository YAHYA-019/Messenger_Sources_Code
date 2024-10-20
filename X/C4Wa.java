package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messenger.intents.AbstractIntentHandlerActivity;
import com.facebook.smartcapture.logging.SmartCaptureQpl;
import com.mapbox.mapboxsdk.style.layers.Property;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Wa, reason: invalid class name */
/* loaded from: 4Wa.class */
public final class C4Wa implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C4Wa(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                ((1K9) this.A02).onFailure(th);
                return;
            case 1:
                Intent intent = (Intent) this.A02;
                AbstractIntentHandlerActivity abstractIntentHandlerActivity = (AbstractIntentHandlerActivity) this.A01;
                0fH.A18("AbstractIntentHandlerActivity", "Future failed for intent %s. Waiting for result: %b.", new Object[]{intent, Boolean.valueOf(abstractIntentHandlerActivity.A00)});
                abstractIntentHandlerActivity.finish();
                return;
            default:
                ((1K9) this.A02).onFailure(th);
                return;
        }
    }

    public void onSuccess(Object obj) {
        TreeJNI treeJNI;
        String queryParameter;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                ((1K9) this.A01).onSuccess((abstractC08294mh == null || (treeJNI = (TreeJNI) abstractC08294mh.A03) == null) ? null : Boolean.valueOf(treeJNI.getBooleanValue(-934426595)));
                return;
            case 1:
                AbstractIntentHandlerActivity abstractIntentHandlerActivity = (AbstractIntentHandlerActivity) this.A01;
                if (abstractIntentHandlerActivity.getCallingActivity() != null) {
                    abstractIntentHandlerActivity.A00 = true;
                    return;
                }
                Uri data = ((Intent) this.A02).getData();
                if (data != null && (queryParameter = data.getQueryParameter("_notif_data")) != null) {
                    try {
                        if (new JSONObject(queryParameter).getString(SmartCaptureQpl.ANNOTATION_KEY_MEDIUM).equals("email")) {
                            4OL.A00((4OL) 1Bn.A0A(98666), (Boolean) null, "email", data.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
                        }
                    } catch (JSONException e) {
                        0fH.A18("AbstractIntentHandlerActivity", "failed to convert \"%s\" to JSON.\nException: %s", new Object[]{queryParameter, e});
                    }
                }
                abstractIntentHandlerActivity.finish();
                return;
            default:
                ((1K9) this.A02).onSuccess(((OperationResult) obj).A07());
                return;
        }
    }
}
