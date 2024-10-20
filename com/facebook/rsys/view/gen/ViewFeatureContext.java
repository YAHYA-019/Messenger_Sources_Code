package com.facebook.rsys.view.gen;

import X.AbstractC2327GOs;
import X.AnonymousClass001;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ViewFeatureContext.class */
public class ViewFeatureContext {
    public final ViewProxy proxy;

    public ViewFeatureContext(ViewProxy viewProxy) {
        viewProxy.getClass();
        this.proxy = viewProxy;
    }

    public static native ViewFeatureContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewFeatureContext) {
            return this.proxy.equals(((ViewFeatureContext) obj).proxy);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.proxy.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ViewFeatureContext{proxy=");
        return AbstractC2327GOs.A0U(this.proxy, A0k);
    }
}
