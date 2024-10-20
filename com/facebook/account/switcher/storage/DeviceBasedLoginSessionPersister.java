package com.facebook.account.switcher.storage;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Fe;
import X.1JF;
import X.2yD;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.C00i;
import X.C10514tn;
import X.C15h;
import X.C67Z;
import X.EMr;
import X.EnA;
import X.F5b;
import X.FFq;
import X.FIm;
import X.G6T;
import X.G7G;
import X.InterfaceC00051a0;
import android.content.Context;
import com.facebook.auth.credentials.DBLLocalAuthCredentials;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest;

/* loaded from: DeviceBasedLoginSessionPersister.class */
public final class DeviceBasedLoginSessionPersister {
    public final C00i A03 = new 1BQ(16496);
    public final C00i A01 = new 1BV(82041);
    public final C00i A08 = new 1BQ(68335);
    public final C00i A07 = new 1BQ(16511);
    public final C00i A00 = new 1BQ(99390);
    public final C00i A02 = new 1BQ(49344);
    public final C00i A04 = new 1BV(100120);
    public final C00i A05 = new 1BQ(16386);
    public final C15h A06 = new G7G(this, 0);

    public static DBLLocalAuthCredentials A00(DeviceBasedLoginSessionPersister deviceBasedLoginSessionPersister, String str) {
        if (1JF.A0B(str)) {
            return null;
        }
        String string = ((1Fe) deviceBasedLoginSessionPersister.A03.get()).A00(0Pz.A0j("dbl_local_auth", "_", str)).getString("credentials", (String) null);
        if (1JF.A0B(string)) {
            return null;
        }
        try {
            return (DBLLocalAuthCredentials) ((AnonymousClass244) deviceBasedLoginSessionPersister.A08.get()).A0V(string, DBLLocalAuthCredentials.class);
        } catch (IOException e) {
            1BK.A09(deviceBasedLoginSessionPersister.A07).softReport("DeviceBasedLoginSessionPersister", "Unable to read localauth credentials from preferences", e);
            return null;
        }
    }

    public static boolean A01(DeviceBasedLoginSessionPersister deviceBasedLoginSessionPersister, String str) {
        if (1JF.A0B(str)) {
            return false;
        }
        C10514tn c10514tn = (C10514tn) deviceBasedLoginSessionPersister.A02.get();
        if (((2yD) c10514tn.A06.get()).AZk(36315851158267421L)) {
            ((Executor) 1Bi.A03(16477)).execute(new G6T(c10514tn, str));
        }
        DBLLocalAuthCredentials A00 = A00(deviceBasedLoginSessionPersister, str);
        if (A00 != null) {
            EnA enA = (EnA) deviceBasedLoginSessionPersister.A06.get();
            String str2 = A00.uid;
            if (str2 != null) {
                FFq fFq = (FFq) enA.A02.get();
                Context context = (Context) enA.A01.get();
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add(new F5b(str2, C67Z.FACEBOOK, EMr.A04));
                ReplicatedStorageRequest replicatedStorageRequest = new ReplicatedStorageRequest(A0s);
                fFq.A01(context, 1BK.A0t(), "DblToFamilyAccessStorageConnector", (FIm) enA.A00.get(), replicatedStorageRequest);
            }
        }
        InterfaceC00051a0 AP5 = ((1Fe) deviceBasedLoginSessionPersister.A03.get()).A00(0Pz.A0W("dbl_local_auth_", str)).AP5();
        AP5.Cdi("credentials");
        AP5.Cdi("persisted_ts");
        AP5.Cdi("new_localauth_expiry");
        AP5.commit();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008f, code lost:
    
        if (((X.InterfaceC10464ti) r0.get()).CiT(r302).mIsPinSet.booleanValue() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A05
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 2324155268000274196(0x20410ee700025714, double:2.5445191891097335E-153)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L92
            r0 = r301
            X.00i r0 = r0.A01
            r308 = r0
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.4ti r0 = (X.InterfaceC10464ti) r0
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.BS9(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L92
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.4ti r0 = (X.InterfaceC10464ti) r0
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.BUr(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L92
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.4ti r0 = (X.InterfaceC10464ti) r0
            r1 = r302
            com.facebook.auth.credentials.DBLFacebookCredentials r0 = r0.CiT(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L92
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.4ti r0 = (X.InterfaceC10464ti) r0
            r1 = r302
            com.facebook.auth.credentials.DBLFacebookCredentials r0 = r0.CiT(r1)
            java.lang.Boolean r0 = r0.mIsPinSet
            r303 = r0
            r0 = r303
            boolean r0 = r0.booleanValue()
            r307 = r0
            r0 = 1
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L98
        L92:
            r0 = 0
            r309 = r0
            r0 = 0
            r308 = r0
        L98:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.account.switcher.storage.DeviceBasedLoginSessionPersister.A02(java.lang.String):boolean");
    }

    public boolean A03(String str) {
        if (1BL.A08(this.A00) - ((1Fe) this.A03.get()).A00(0Pz.A0W("dbl_local_auth_", str)).getLong("persisted_ts", Long.MAX_VALUE) <= 31536000000L && A02(str)) {
            return false;
        }
        0fH.A0j("DeviceBasedLoginSessionPersister", "clearPersistedSessionIfUserIneligibleOrRefreshIntervalElapsed");
        return A01(this, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if ((!X.1JF.A0B(((X.1Fe) r301.A03.get()).A00(X.0Pz.A0W("dbl_local_auth_", r302)).getString("credentials", (java.lang.String) null))) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.A02(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4d
            r0 = r302
            boolean r0 = X.1JF.A0B(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4d
            r0 = r301
            X.00i r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.1Fe r0 = (X.1Fe) r0
            r304 = r0
            java.lang.String r0 = "dbl_local_auth_"
            r1 = r302
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r305 = r0
            r0 = r304
            r1 = r305
            X.1Fi r0 = r0.A00(r1)
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            java.lang.String r1 = "credentials"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r305 = r0
            r0 = r305
            boolean r0 = X.1JF.A0B(r0)
            r1 = 1
            r0 = r0 ^ r1
            r303 = r0
            r0 = 1
            r307 = r0
            r0 = r303
            if (r0 != 0) goto L52
        L4d:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
        L52:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.account.switcher.storage.DeviceBasedLoginSessionPersister.A04(java.lang.String):boolean");
    }
}
