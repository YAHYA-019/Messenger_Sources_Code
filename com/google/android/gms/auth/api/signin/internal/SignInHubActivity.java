package com.google.android.gms.auth.api.signin.internal;

import X.0FI;
import X.0NQ;
import X.0Pz;
import X.4YU;
import X.AbF;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.JQx;
import X.L2G;
import X.LCo;
import X.LRM;
import X.LsI;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexStore;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: SignInHubActivity.class */
public class SignInHubActivity extends FragmentActivity {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    private final void A00(int i) {
        Status status = new Status(i, null);
        Intent A052 = AbF.A05();
        A052.putExtra("googleSignInStatus", status);
        setResult(0, A052);
        finish();
        A05 = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException A0U;
        if (this.A03) {
            return;
        }
        setResult(0);
        if (i == 40962) {
            int i3 = 8;
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && (googleSignInAccount = signInAccount.zbc) != null) {
                    L2G A00 = L2G.A00(this);
                    GoogleSignInOptions googleSignInOptions = this.A02.A00;
                    synchronized (A00) {
                        LCo lCo = A00.A02;
                        AbstractC00481b7.A02(googleSignInOptions);
                        String str = googleSignInAccount.A08;
                        LCo.A03(lCo, "defaultGoogleSignInAccount", str);
                        AbstractC00481b7.A02(googleSignInOptions);
                        String A0j = 0Pz.A0j("googleSignInAccount", ":", str);
                        JSONObject A12 = AnonymousClass001.A12();
                        try {
                            String str2 = googleSignInAccount.A04;
                            if (str2 != null) {
                                A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                            }
                            String str3 = googleSignInAccount.A05;
                            if (str3 != null) {
                                A12.put("tokenId", str3);
                            }
                            String str4 = googleSignInAccount.A06;
                            if (str4 != null) {
                                A12.put("email", str4);
                            }
                            String str5 = googleSignInAccount.A07;
                            if (str5 != null) {
                                A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str5);
                            }
                            String str6 = googleSignInAccount.A09;
                            if (str6 != null) {
                                A12.put("givenName", str6);
                            }
                            String str7 = googleSignInAccount.A0A;
                            if (str7 != null) {
                                A12.put("familyName", str7);
                            }
                            Uri uri = googleSignInAccount.A03;
                            if (uri != null) {
                                A12.put("photoUrl", uri.toString());
                            }
                            String str8 = googleSignInAccount.A00;
                            if (str8 != null) {
                                A12.put("serverAuthCode", str8);
                            }
                            A12.put("expirationTime", googleSignInAccount.A02);
                            A12.put("obfuscatedIdentifier", str);
                            JSONArray jSONArray = new JSONArray();
                            List list = googleSignInAccount.A0B;
                            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                            Arrays.sort(scopeArr, LsI.A00);
                            for (Scope scope : scopeArr) {
                                jSONArray.put(scope.A01);
                            }
                            A12.put("grantedScopes", jSONArray);
                            A12.remove("serverAuthCode");
                            LCo.A03(lCo, A0j, A12.toString());
                            String A0j2 = 0Pz.A0j("googleSignInOptions", ":", str);
                            JSONObject A122 = AnonymousClass001.A12();
                            try {
                                JSONArray jSONArray2 = new JSONArray();
                                ArrayList arrayList = googleSignInOptions.A08;
                                Collections.sort(arrayList, GoogleSignInOptions.A0I);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put(((Scope) it.next()).A01);
                                }
                                A122.put("scopes", jSONArray2);
                                Account account = googleSignInOptions.A00;
                                if (account != null) {
                                    A122.put("accountName", account.name);
                                }
                                A122.put("idTokenRequested", googleSignInOptions.A05);
                                A122.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                A122.put("serverAuthRequested", googleSignInOptions.A09);
                                String str9 = googleSignInOptions.A01;
                                if (!TextUtils.isEmpty(str9)) {
                                    A122.put("serverClientId", str9);
                                }
                                String str10 = googleSignInOptions.A02;
                                if (!TextUtils.isEmpty(str10)) {
                                    A122.put("hostedDomain", str10);
                                }
                                LCo.A03(lCo, A0j2, A122.toString());
                                A00.A00 = googleSignInAccount;
                                A00.A01 = googleSignInOptions;
                            } catch (JSONException e) {
                                A0U = AnonymousClass001.A0U(e);
                                throw A0U;
                            }
                        } catch (JSONException e2) {
                            A0U = AnonymousClass001.A0U(e2);
                        }
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.A04 = true;
                    this.A00 = i2;
                    this.A01 = intent;
                    0NQ.A00(this).A03(new LRM(this));
                    A05 = false;
                    return;
                }
                if (intent.hasExtra("errorCode")) {
                    i3 = intent.getIntExtra("errorCode", 8);
                    if (i3 == 13) {
                        i3 = 12501;
                    }
                }
            }
            A00(i3);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = 0FI.A00(-1639906415);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            A00(12500);
            i = -1030414423;
        } else if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            A00(12500);
            i = -677715940;
        } else {
            boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
            if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                Bundle bundleExtra = intent.getBundleExtra(DexStore.CONFIG_FILENAME);
                if (bundleExtra == null) {
                    Log.e("AuthSignInClient", "Activity started with no configuration.");
                    setResult(0);
                    finish();
                    i = -1680183990;
                } else {
                    SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(DexStore.CONFIG_FILENAME);
                    if (signInConfiguration == null) {
                        Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                        setResult(0);
                        finish();
                        i = -1174643578;
                    } else {
                        this.A02 = signInConfiguration;
                        if (bundle != null) {
                            boolean z = bundle.getBoolean("signingInGoogleApiClients");
                            this.A04 = z;
                            if (z) {
                                this.A00 = bundle.getInt("signInResultCode");
                                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                                if (intent2 == null) {
                                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                                    setResult(0);
                                    finish();
                                    i = -541711958;
                                } else {
                                    this.A01 = intent2;
                                    0NQ.A00(this).A03(new LRM(this));
                                    A05 = false;
                                    i = -812549903;
                                }
                            } else {
                                i = -1067329039;
                            }
                        } else if (A05) {
                            setResult(0);
                            A00(12502);
                            i = -1314743039;
                        } else {
                            A05 = true;
                            Intent A0A = 4YU.A0A(action);
                            A0A.setPackage(equals ? "com.google.android.gms" : getPackageName());
                            A0A.putExtra(DexStore.CONFIG_FILENAME, this.A02);
                            try {
                                startActivityForResult(A0A, 40962);
                            } catch (ActivityNotFoundException unused) {
                                this.A03 = true;
                                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                                A00(17);
                            }
                            i = 1417466859;
                        }
                    }
                }
            } else {
                JQx.A1P("Unknown action: ", String.valueOf(intent.getAction()), "AuthSignInClient");
                finish();
                i = -417818207;
            }
        }
        0FI.A07(i, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = 0FI.A00(641151584);
        super.onDestroy();
        A05 = false;
        0FI.A07(489646596, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
