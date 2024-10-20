package com.facebook.messenger.intents;

import X.0S2;
import X.0Zh;
import X.1vZ;
import X.2Kl;
import X.C00i;
import X.C1xf;
import X.C4Dk;
import X.C4Dp;
import X.C4Dr;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: AbstractIntentHandlerActivity.class */
public abstract class AbstractIntentHandlerActivity extends FbFragmentActivity implements C1xf, 1vZ, 2Kl {
    public boolean A00;
    public C4Dr A01;
    public C00i A02;
    public C4Dp A03;
    public C4Dk A04;
    public ListenableFuture A05;
    public Executor A06;
    public boolean A07 = false;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x02be, code lost:
    
        if (r0.equals(r311) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x02e3, code lost:
    
        if ("com.facebook.orca".equals(r0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x02e6, code lost:
    
        r0 = r302.getDataString();
        r0 = r302.getStringExtra("funlid");
        r0 = r302.getStringExtra("source_surface");
        r0 = r302.getStringExtra("dest_intended_surface");
        r0 = new X.2Jy("opened_from_family_app");
        r0.A0D("pigeon_reserved_keyword_module", "family_bridges");
        r0.A0D("source_package", r0);
        r0.A0D("dest_type", "android");
        r303 = "funnel_id";
        r0.A0D(r303, r0);
        r0.A0D("source_surface", r0);
        r0.A0D("dest_intended_surface", r0);
        r0.A0D("url", r0);
        r303 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0379, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x037c, code lost:
    
        r0 = X.C0A2.A01(new java.lang.Object(), r0);
        r303 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0391, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0394, code lost:
    
        r303 = r0.getQueryParameter("funlid");
        r0.A0D("funnel_id_from_url", r303);
        r303 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x03a9, code lost:
    
        r0 = (X.C1kw) r0.A01.A00.get();
        r303 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x03c2, code lost:
    
        if (X.4FT.A00 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x03c5, code lost:
    
        r303 = X.4FT.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x03ca, code lost:
    
        monitor-enter(r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03d2, code lost:
    
        if (X.4FT.A00 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x03e3, code lost:
    
        X.4FT.A00 = new X.C2J3(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03e6, code lost:
    
        r303 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03e7, code lost:
    
        monitor-exit(r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03f7, code lost:
    
        r311 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03f9, code lost:
    
        r0 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03fd, code lost:
    
        throw r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03eb, code lost:
    
        X.4FT.A00.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02d2, code lost:
    
        if (r0.equals("com.facebook.orca") != false) goto L49;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00aa. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024d  */
    /* JADX WARN: Type inference failed for: r0v205, types: [X.0w6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r313v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A12(android.content.Intent r302) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.intents.AbstractIntentHandlerActivity.A12(android.content.Intent):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        ListenableFuture listenableFuture = this.A05;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        A12(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        if (bundle != null) {
            this.A00 = bundle.getBoolean("waiting_for_result_key");
        }
        if (this.A00 || this.A07) {
            return;
        }
        A12(getIntent());
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x01b2, code lost:
    
        if ("com.google.appcrawler".equals(r0) == false) goto L59;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A30(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.intents.AbstractIntentHandlerActivity.A30(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    public Integer A3B() {
        return ((this instanceof SecureIntentHandlerActivity) || (!(this instanceof IntentHandlerActivity) && (this instanceof SecureSameTaskIntentHandlerActivity))) ? 0S2.A00 : 0S2.A0C;
    }

    @Override // X.C1xf
    public Integer Ac6() {
        return 0S2.A0N;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        setResult(i2, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("waiting_for_result_key", this.A00);
        0Zh.A00(getApplicationContext());
    }
}
