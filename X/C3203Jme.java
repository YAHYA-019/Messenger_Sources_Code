package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;

/* renamed from: X.Jme, reason: case insensitive filesystem */
/* loaded from: Jme.class */
public final class C3203Jme extends KeG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203Jme(LDF ldf, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
        super(ldf);
        this.A00 = 4;
        this.A01 = ldf;
        this.A03 = browserLiteJSBridgeCall;
        this.A02 = browserLiteJSBridgeCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203Jme(Bundle bundle, LDF ldf, OnShopsLiteCallback onShopsLiteCallback) {
        super(ldf);
        this.A00 = 3;
        this.A01 = ldf;
        this.A02 = bundle;
        this.A03 = onShopsLiteCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203Jme(Bundle bundle, LDF ldf, java.util.Map map, int i) {
        super(ldf);
        this.A00 = i;
        this.A01 = ldf;
        this.A02 = map;
        this.A03 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203Jme(Bundle bundle, LDF ldf, long[] jArr) {
        super(ldf);
        this.A00 = 0;
        this.A01 = ldf;
        this.A02 = jArr;
        this.A03 = bundle;
    }
}
