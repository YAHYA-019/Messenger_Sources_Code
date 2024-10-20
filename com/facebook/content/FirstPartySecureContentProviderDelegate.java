package com.facebook.content;

import X.02P;
import X.02Q;
import X.09Q;
import X.0KC;
import X.0RF;
import X.0fH;
import X.1BV;
import X.1CQ;
import X.AnonymousClass053;
import X.C00i;
import X.C02D;
import X.C0w6;
import X.C4Sl;
import X.DKL;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import com.facebook.messaging.provider.FamilyAppsUserValuesProvider;
import com.facebook.secure.content.DeferredInitAbstractContentProviderDIDelegate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: FirstPartySecureContentProviderDelegate.class */
public abstract class FirstPartySecureContentProviderDelegate extends DeferredInitAbstractContentProviderDIDelegate {
    public 02Q A00;
    public final C00i A01;

    public FirstPartySecureContentProviderDelegate(0RF r302) {
        super(r302);
        this.A01 = new 1BV(131260);
    }

    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    public final boolean A0d() {
        boolean z;
        boolean z2;
        02Q r302;
        Context context = ((AnonymousClass053) this).A00.getContext();
        try {
            z = 09Q.A04(context, context.getApplicationInfo().uid, Binder.getCallingUid());
        } catch (SecurityException unused) {
            z = false;
        }
        boolean z3 = true;
        if (!z) {
            C00i c00i = this.A01;
            boolean A09 = ((1CQ) c00i.get()).A09(0, false);
            if (!((1CQ) c00i.get()).A09(5, false)) {
                Set set = DKL.A00;
                Set set2 = C4Sl.A01;
                int callingUid = Binder.getCallingUid();
                PackageManager packageManager = context.getPackageManager();
                String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
                int length = packagesForUid.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        0fH.A0j("PermissionChecks", "package validation failed");
                        z2 = false;
                        break;
                    }
                    String str = packagesForUid[i];
                    if (set.contains(str)) {
                        try {
                            Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                            if (signatureArr != null && signatureArr.length == 1) {
                                String A02 = 0KC.A02(signatureArr[0].toByteArray());
                                0fH.A0d(str, A02, "PermissionChecks", "package %s is asking for access token for SSO, its signature is %s");
                                if (set2.contains(A02)) {
                                    0fH.A0g(str, "PermissionChecks", "package %s validated");
                                    z2 = true;
                                    break;
                                }
                                continue;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    i++;
                }
            } else {
                synchronized (this) {
                    r302 = this.A00;
                    if (r302 == null) {
                        r302 = 02P.A03(Collections.unmodifiableSet(new HashSet(Arrays.asList(C02D.A0d, C02D.A0u, C02D.A1G, C02D.A1f))));
                        this.A00 = r302;
                    }
                }
                z2 = r302.A03(context);
            }
            if (A09) {
                if (!z2) {
                    FamilyAppsUserValuesProvider.Impl impl = (FamilyAppsUserValuesProvider.Impl) this;
                    if (impl.A03.A02(((AnonymousClass053) impl).A00.getContext(), (Intent) null, (C0w6) null)) {
                        return true;
                    }
                }
            }
            z3 = false;
        }
        return z3;
    }
}
