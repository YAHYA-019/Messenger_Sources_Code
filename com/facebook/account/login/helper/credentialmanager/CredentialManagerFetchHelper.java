package com.facebook.account.login.helper.credentialmanager;

import X.0DE;
import X.0DR;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.2aK;
import X.4YV;
import X.7zO;
import X.AnonymousClass001;
import X.C06w;
import X.C06z;
import X.DKE;
import X.EwA;
import X.FIO;
import X.GHT;
import X.JTs;
import X.KQm;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.account.login.model.LoginFlowData;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;

/* loaded from: CredentialManagerFetchHelper.class */
public final class CredentialManagerFetchHelper {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(CredentialManagerFetchHelper.class, "loginFlowData", "getLoginFlowData()Lcom/facebook/account/login/model/LoginFlowData;", 0), new C06w(CredentialManagerFetchHelper.class, "credentialManagerLogger", "getCredentialManagerLogger()Lcom/facebook/account/login/helper/credentialmanager/CredentialManagerLogger;", 0), new C06w(CredentialManagerFetchHelper.class, "caaLoginNativeLogger", "getCaaLoginNativeLogger()Lcom/facebook/caa/login/logging/CAALoginNativeLogger;", 0)};
    public final String PROVIDER_CLASS;
    public final String PROVIDER_PACKAGE;
    public final 1Br caaLoginNativeLogger$delegate;
    public final Context context;
    public final 1Br credentialManagerLogger$delegate;
    public final 1Br loginFlowData$delegate;
    public GHT retrieveCredentialResultListener;

    public CredentialManagerFetchHelper(Context context) {
        11T.A0F(context, 1);
        this.PROVIDER_PACKAGE = "com.google.android.gms";
        this.PROVIDER_CLASS = "com.google.android.gms.auth.api.credentials.credman.service.PasswordAndPasskeyService";
        this.context = context;
        this.loginFlowData$delegate = 1HG.A00(context, 131192);
        this.credentialManagerLogger$delegate = 1Bu.A00(100103);
        this.caaLoginNativeLogger$delegate = 1Bu.A00(99775);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchCredential(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.account.login.helper.credentialmanager.CredentialManagerFetchHelper.fetchCredential(X.0DR):java.lang.Object");
    }

    private final FIO getCaaLoginNativeLogger() {
        return (FIO) 1Br.A0B(this.caaLoginNativeLogger$delegate);
    }

    private final EwA getCredentialManagerLogger() {
        return (EwA) 1Br.A0B(this.credentialManagerLogger$delegate);
    }

    private final LoginFlowData getLoginFlowData() {
        return (LoginFlowData) 1Br.A0B(this.loginFlowData$delegate);
    }

    private final void handleCredentialFromCredentialManager() {
        getCredentialManagerLogger().A00();
        if (AnonymousClass001.A1O(getLoginFlowData().A0d.length())) {
            GHT ght = this.retrieveCredentialResultListener;
            if (ght != null) {
                ght.Bs6();
                return;
            }
        } else {
            QuickPerformanceLogger A0d = DKE.A0d();
            A0d.markerStart(2293785);
            A0d.markerAnnotate(2293785, "credential_type", "credential_manager");
            GHT ght2 = this.retrieveCredentialResultListener;
            if (ght2 != null) {
                ght2.Bs7(getLoginFlowData().A0d, getLoginFlowData().A0V);
                return;
            }
        }
        11T.A0L("retrieveCredentialResultListener");
        throw 0Q8.createAndThrow();
    }

    private final void handleGetCredentialException(KQm kQm) {
        GHT ght = this.retrieveCredentialResultListener;
        if (ght == null) {
            11T.A0L("retrieveCredentialResultListener");
            throw 0Q8.createAndThrow();
        }
        ght.Bs6();
        EwA credentialManagerLogger = getCredentialManagerLogger();
        String A01 = kQm.A01();
        String message = kQm.getMessage();
        11T.A0F(A01, 0);
        4YV.A0Z(credentialManagerLogger.A01).flowMarkError(credentialManagerLogger.A00, A01, message);
    }

    public final void initCredentialManagerFetch(GHT ght) {
        11T.A0F(ght, 0);
        getCredentialManagerLogger().A00();
        getCredentialManagerLogger().A01("init_fetch");
        FIO.A02(getCaaLoginNativeLogger(), 0S2.A0F, 0S2.A01, 0S2.A1G, 0S2.A15, (Long) null, (String) null, (HashMap) null);
        this.retrieveCredentialResultListener = ght;
        Object obj = this.context;
        11T.A0I(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        2aK.A03((Integer) null, (0DE) null, new JTs(this, (0DR) null, 28), 7zO.A16((LifecycleOwner) obj), 3);
    }
}
