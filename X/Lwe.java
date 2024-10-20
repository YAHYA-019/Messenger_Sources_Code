package X;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* loaded from: Lwe.class */
public final class Lwe implements WebMessageListenerBoundaryInterface {
    public MEd A00;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, X.Ke1] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        String data;
        L2J l2j;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) Kwo.A00(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        int length = ports.length;
        Ke1[] ke1Arr = new Ke1[length];
        for (int i = 0; i < length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            ?? obj = new Object();
            obj.A00 = (WebMessagePortBoundaryInterface) Kwo.A00(WebMessagePortBoundaryInterface.class, invocationHandler3);
            ke1Arr[i] = obj;
        }
        if (Kz5.A0Z.A01()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) Kwo.A00(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type == 1) {
                    l2j = new L2J(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), ke1Arr);
                    IsomorphicObjectBoundaryInterface isomorphicObjectBoundaryInterface = (IsomorphicObjectBoundaryInterface) Kwo.A00(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                    this.A00.CCz(uri, webView, l2j, (KoW) isomorphicObjectBoundaryInterface.getOrCreatePeer(new LtW(isomorphicObjectBoundaryInterface, 1)), z);
                }
                return;
            }
            data = webMessagePayloadBoundaryInterface.getAsString();
        } else {
            data = webMessageBoundaryInterface.getData();
        }
        l2j = new L2J(data, ke1Arr);
        IsomorphicObjectBoundaryInterface isomorphicObjectBoundaryInterface2 = (IsomorphicObjectBoundaryInterface) Kwo.A00(JsReplyProxyBoundaryInterface.class, invocationHandler2);
        this.A00.CCz(uri, webView, l2j, (KoW) isomorphicObjectBoundaryInterface2.getOrCreatePeer(new LtW(isomorphicObjectBoundaryInterface2, 1)), z);
    }
}
