package com.facebook.browser.lite.bridge;

import X.0Q8;
import X.11T;
import X.AbstractC3252Jnp;
import X.DKf;
import X.L2P;
import X.Lqr;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: BrowserLiteJSBridgeProxy.class */
public class BrowserLiteJSBridgeProxy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(50);
    public Bundle A00;
    public String A01;
    public AbstractC3252Jnp A02;
    public String A03;

    public BrowserLiteJSBridgeProxy(Parcel parcel) {
        11T.A0F(parcel, 1);
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            this.A00 = parcel.readBundle();
        }
    }

    public Context A07() {
        AbstractC3252Jnp A09 = A09();
        if (A09 != null) {
            return SystemWebView.A00(A09);
        }
        return null;
    }

    public final Bundle A08() {
        Bundle bundle;
        synchronized (this) {
            bundle = this.A00;
        }
        return bundle;
    }

    public final AbstractC3252Jnp A09() {
        AbstractC3252Jnp abstractC3252Jnp;
        synchronized (this) {
            abstractC3252Jnp = this.A02;
        }
        return abstractC3252Jnp;
    }

    public final String A0A() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        11T.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        throw 0Q8.createAndThrow();
    }

    public final String A0B() {
        String str;
        synchronized (this) {
            str = this.A03;
        }
        return str;
    }

    public void A0C(L2P l2p, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, String str) {
        11T.A0F(str, 1);
        AbstractC3252Jnp A09 = A09();
        if (A09 == null || l2p == null) {
            return;
        }
        ((SystemWebView) A09).A03.post(new Lqr(this, l2p, browserLiteJSBridgeCall, A09, str));
    }

    public final void A0D(AbstractC3252Jnp abstractC3252Jnp) {
        synchronized (this) {
            this.A02 = abstractC3252Jnp;
            if (abstractC3252Jnp != null) {
                this.A03 = abstractC3252Jnp.A08();
            }
        }
    }

    public final void A0E(String str) {
        synchronized (this) {
            11T.A0F(str, 0);
            this.A03 = str;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        String str = this.A01;
        if (str == null) {
            11T.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            throw 0Q8.createAndThrow();
        }
        parcel.writeString(str);
        parcel.writeBundle(this.A00);
    }
}
