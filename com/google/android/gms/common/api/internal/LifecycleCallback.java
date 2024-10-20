package com.google.android.gms.common.api.internal;

import X.4TH;
import X.AbstractDialogInterfaceOnCancelListenerC01053pk;
import X.AnonymousClass001;
import X.C01043pj;
import X.KRU;
import X.MKC;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: LifecycleCallback.class */
public class LifecycleCallback {
    public final MKC A00;

    public LifecycleCallback(MKC mkc) {
        this.A00 = mkc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r306.mRemoving != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r306 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (r306.isRemoving() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r306 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.MKC A00(java.lang.Object r301) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A00(java.lang.Object):X.MKC");
    }

    public static MKC getChimeraLifecycleFragmentImpl(KRU kru) {
        throw AnonymousClass001.A0N("Method not available in SDK.");
    }

    public void A02() {
        if (this instanceof C01043pj) {
            C01043pj c01043pj = (C01043pj) this;
            if (c01043pj.A00.isEmpty()) {
                return;
            }
            c01043pj.A01.A06(c01043pj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(int r302, int r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A03(int, int, android.content.Intent):void");
    }

    public void A04(Bundle bundle) {
        if (this instanceof AbstractDialogInterfaceOnCancelListenerC01053pk) {
            AbstractDialogInterfaceOnCancelListenerC01053pk abstractDialogInterfaceOnCancelListenerC01053pk = (AbstractDialogInterfaceOnCancelListenerC01053pk) this;
            if (bundle != null) {
                abstractDialogInterfaceOnCancelListenerC01053pk.A01.set(bundle.getBoolean("resolving_error", false) ? new 4TH(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
            }
        }
    }

    public void A05(Bundle bundle) {
        4TH r0;
        if (!(this instanceof AbstractDialogInterfaceOnCancelListenerC01053pk) || (r0 = (4TH) ((AbstractDialogInterfaceOnCancelListenerC01053pk) this).A01.get()) == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", r0.A00);
        ConnectionResult connectionResult = r0.A01;
        bundle.putInt("failed_status", connectionResult.A01);
        bundle.putParcelable("failed_resolution", connectionResult.A02);
    }

    public void A06() {
    }

    public void A07() {
    }

    public void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
