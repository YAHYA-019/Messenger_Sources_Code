package X;

import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DexStore;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Fpz.class */
public abstract class Fpz implements GKe {
    public final FIT A00;
    public final GKd A01;
    public final Context A02;
    public final 1pK A03;
    public final FAX A04;
    public final GGG A05;

    public Fpz(1pK r302, FIT fit, FAX fax, GKd gKd, GGG ggg) {
        7zR.A1O(fit, fax);
        this.A01 = gKd;
        this.A00 = fit;
        this.A04 = fax;
        this.A05 = ggg;
        this.A03 = r302;
        this.A02 = 7zM.A0A();
    }

    public static final String A00(String str, JSONObject jSONObject) {
        String str2 = null;
        if (!jSONObject.isNull(str)) {
            try {
                str2 = jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return str2;
    }

    public static final String A01(JSONObject jSONObject) {
        return DKC.A1A("promiseID", jSONObject.getJSONObject("content"));
    }

    public static void A02(FIT fit, Object obj, String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(obj);
        fit.A0I("javascript_interface_error", sb.toString(), th);
    }

    public static final void A03(Fpz fpz, String str) {
        fpz.A05.Ccf(str, "Missing or malformed object data", "INVALID_PARAM");
    }

    @Override // X.GKe
    public void BkK(JSONObject jSONObject) {
        try {
            this.A01.BkJ(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onAuthorizeAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void BlR(JSONObject jSONObject) {
        try {
            this.A01.BlQ(jSONObject.getInt("content"));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onBeginLoad: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void Bmi(JSONObject jSONObject) {
        try {
            this.A01.Bmh(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onCanCreateShortcutAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void Bnf(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            try {
                String string = DKG.A1C(jSONObject).getString("contextTokenID");
                GKd gKd = this.A01;
                11T.A0D(string);
                gKd.Bne(A01, string);
            } catch (JSONException unused) {
                A03(this, A01);
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onChangeContextAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void Bqy(JSONObject jSONObject) {
        try {
            JSONObject A1C = DKG.A1C(jSONObject);
            String string = A1C.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            String string2 = A1C.getString("print");
            if ("error".equals(string)) {
                0fH.A14("QuicksilverAndroid", "Received javascript errors: %s", new Object[]{string2});
            } else {
                0fH.A0g(string2, "QuicksilverAndroid", "Received javascript debug log: %s");
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onConsole: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void Br1(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            String string = DKG.A1C(jSONObject).getString("token");
            GKd gKd = this.A01;
            11T.A0D(string);
            gKd.Br0(A01, string);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onConsumePurchaseAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void BrO(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            this.A01.BrP(this.A04.A01(jSONObject), A01);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onContextChooseAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void BrR(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            String A01 = A01(jSONObject);
            try {
                JSONObject A1C = DKG.A1C(jSONObject);
                if (A1C.has("playerIDs")) {
                    jSONArray = A1C.getJSONArray("playerIDs");
                } else {
                    new JSONArray();
                }
                boolean z = A1C.has("shouldCreateGroup") ? A1C.getBoolean("shouldCreateGroup") : false;
                GKd gKd = this.A01;
                11T.A0D(jSONArray);
                gKd.BrQ(A01, jSONArray, z);
            } catch (JSONException unused) {
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onContextCreateAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void BrU(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            try {
                String string = DKG.A1C(jSONObject).getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                GKd gKd = this.A01;
                11T.A0D(string);
                gKd.BrT(A01, string);
            } catch (JSONException unused) {
                A03(this, A01);
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onContextSwitchAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void Bs0(JSONObject jSONObject) {
        try {
            this.A01.Brz(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onCreateShortcutAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void Bvy(JSONObject jSONObject) {
        if (jSONObject.has("content")) {
            try {
                this.A01.CSf(DKC.A1G("content", jSONObject));
            } catch (JSONException e) {
                A02(this.A00, jSONObject, "Invalid JSON content received by onEndGame: ", AnonymousClass001.A0k(), e);
            }
        }
    }

    @Override // X.GKe
    public void By1(JSONObject jSONObject) {
        try {
            this.A01.By0(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onFetchCatalogAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void By4(JSONObject jSONObject) {
        try {
            this.A01.By3(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onFetchContextPlayersAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void ByB(JSONObject jSONObject) {
        try {
            this.A01.ByA(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onFetchPurchasesAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void ByH(JSONObject jSONObject) {
        try {
            this.A01.ByG(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onFetchSubscribableCatalogAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void BzC(JSONObject jSONObject) {
        try {
            this.A01.BzB(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onContextSwitchAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0N(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            JSONObject A1C = DKG.A1C(jSONObject);
            String string = A1C.getString("request");
            String string2 = A1C.getString("sdkVersion");
            String string3 = A1C.getString("data");
            GKd gKd = this.A01;
            11T.A0D(string);
            11T.A0D(string2);
            11T.A0D(string3);
            gKd.C0M(A01, string, string2, string3);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGenericDialogAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0P(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            JSONObject A1C = DKG.A1C(jSONObject);
            String string = A1C.getString("request");
            String string2 = A1C.getString("sdkVersion");
            String string3 = A1C.getString("data");
            GKd gKd = this.A01;
            11T.A0D(string);
            11T.A0D(string2);
            11T.A0D(string3);
            gKd.C0O(A01, string, string2, string3);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGenericDialogAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0T(JSONObject jSONObject) {
        try {
            this.A01.C0S(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGetClipboardTextAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0V(JSONObject jSONObject) {
        try {
            this.A01.C0U(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGetConnectedPlayersAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0Z(JSONObject jSONObject) {
        try {
            this.A01.C0Y(A01(jSONObject), DKC.A1A("placementID", DKG.A1C(jSONObject)));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGetInterstitialAdAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0c(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("content").getJSONArray(PublicKeyStoreImplKt.DEVICE_TO_DEVICE_KEYS_VALUE);
                ArrayList A0y = 7zO.A0y(jSONArray);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    11T.A0A(string);
                    A0y.add(string);
                }
                this.A01.C0b(A01, A0y);
            } catch (JSONException unused) {
                A03(this, A01);
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGetPlayerDataAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0e(JSONObject jSONObject) {
        try {
            this.A01.C0d(A01(jSONObject), DKC.A1A("placementID", DKG.A1C(jSONObject)));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGetRewardedInterstitialAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0g(JSONObject jSONObject) {
        try {
            this.A01.C0f(A01(jSONObject), DKC.A1A("placementID", DKG.A1C(jSONObject)));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGetRewardedVideoAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C0i(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            String string = DKG.A1C(jSONObject).getString("requestPayload");
            GKd gKd = this.A01;
            11T.A0D(string);
            gKd.C0h(A01, string);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onGetSignedPlayerInfoAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C11(JSONObject jSONObject) {
        try {
            this.A01.C10(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onHideBannerAdAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C1i(JSONObject jSONObject) {
        String str;
        try {
            GKd gKd = this.A01;
            String A01 = A01(jSONObject);
            try {
                str = DKC.A1A("sdkVersion", DKG.A1C(jSONObject));
            } catch (JSONException unused) {
                str = "";
            }
            gKd.C1h(A01, str);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onInitializeAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C3n(JSONObject jSONObject) {
        try {
            this.A01.C3m(A01(jSONObject), DKC.A1A("adInstanceID", DKG.A1C(jSONObject)));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onLoadAdAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C3p(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            String A1A = DKC.A1A("placementID", DKC.A1G("content", jSONObject));
            String str = "BOTTOM";
            try {
                str = DKC.A1A("bannerPosition", DKC.A1G("content", jSONObject));
            } catch (JSONException unused) {
            }
            this.A01.C3o(A01, A1A, str);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onLoadBannerAdAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C5k(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        try {
            JSONObject A1C = DKG.A1C(jSONObject);
            GKd gKd = this.A01;
            String A01 = A01(jSONObject);
            String A00 = A00("matchTag", A1C);
            String A002 = A00("dialogTitle", A1C);
            String A003 = A00("dialogTextLineOne", A1C);
            String A004 = A00("dialogTextLineTwo", A1C);
            String A005 = A00("dialogButtonText", A1C);
            String A006 = A00("bannerSearchText", A1C);
            String A007 = A00("bannerRetryText", A1C);
            String A008 = A00("bannerMatchFoundText", A1C);
            String A009 = A00("bannerUserAlreadyInThreadText", A1C);
            try {
                z = A1C.getBoolean("switchContextWhenMatched");
            } catch (JSONException unused) {
                z = false;
            }
            try {
                z2 = A1C.getBoolean("offlineMatch");
            } catch (JSONException unused2) {
                z2 = false;
            }
            gKd.C5j(A01, A00, A002, A003, A004, A005, A006, A007, A008, A009, z, z2);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onMatchPlayerAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void C8V(JSONObject jSONObject) {
        String str;
        try {
            Context context = this.A02;
            A01(jSONObject);
            JSONObject A1G = DKC.A1G("content", jSONObject);
            String string = A1G.getString("effectID");
            String string2 = A1G.getString("payload");
            String string3 = A1G.getString("app_id");
            String A00 = MRk.A00(48);
            try {
                str = DKC.A1A("cameraType", jSONObject.getJSONObject("content"));
            } catch (JSONException unused) {
                str = "FEED_COMPOSER";
            }
            Intent A05 = AbF.A05();
            A05.setClassName(context, "com.facebook.inspiration.urilauncher.InspirationUriLauncherActivity");
            A05.putExtra("effect_id", string);
            A05.putExtra("reason", "feed_cta");
            A05.putExtra("ar_game_id", string3);
            A05.putExtra("ar_game_payload", string2);
            A05.putExtra("device_position", "front");
            A05.putExtra(A00, str);
            0LS.A05(A05, this.A03, ENf.A02.code);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onOpenCameraWithEffectAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CBG(JSONObject jSONObject) {
        try {
            this.A01.CBF(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onPerformHapticFeedbackAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CEO(JSONObject jSONObject) {
        try {
            this.A01.CEN(jSONObject.getInt("content"));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onProgressLoad: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CEo(JSONObject jSONObject) {
        try {
            JSONObject A1G = DKC.A1G(DexStore.CONFIG_FILENAME, jSONObject.getJSONObject("content"));
            String A01 = A01(jSONObject);
            String string = A1G.getString("productID");
            String A00 = A00("developerPayload", A1G);
            GKd gKd = this.A01;
            11T.A0D(string);
            gKd.CEn(A01, string, A00);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onPurchaseAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CEu(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            JSONObject A1C = DKG.A1C(jSONObject);
            String string = A1C.getString("productID");
            String A00 = A00("developerPayload", A1C);
            GKd gKd = this.A01;
            11T.A0D(string);
            gKd.CEt(A01, string, A00);
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onPurchaseSubscriptionAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CFC(JSONObject jSONObject) {
        this.A01.CFD();
    }

    @Override // X.GKe
    public void CG0(JSONObject jSONObject) {
        this.A01.CFz();
    }

    @Override // X.GKe
    public void CIt(JSONObject jSONObject) {
        try {
            jSONObject.getInt("content");
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onScore: ", AnonymousClass001.A0k(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r0.A08(r0) == false) goto L36;
     */
    @Override // X.GKe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CKX(org.json.JSONObject r302) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fpz.CKX(org.json.JSONObject):void");
    }

    @Override // X.GKe
    public void CKp(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            try {
                String string = DKG.A1C(jSONObject).getString("text");
                GKd gKd = this.A01;
                11T.A0D(string);
                gKd.CKo(A01, string);
            } catch (JSONException unused) {
                A03(this, A01);
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onSetClipboardTextAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CKw(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            try {
                this.A01.CKv(A01, DKC.A1G("data", jSONObject.getJSONObject("content")));
            } catch (JSONException unused) {
                A03(this, A01);
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onSetPlayerDataAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CKz(JSONObject jSONObject) {
        try {
            this.A01.CKy(DKC.A1A("content", jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onSetSessionData: ", AnonymousClass001.A0k(), e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v3 ??, still in use, count: 2, list:
          (r309v3 ??) from 0x0156: PHI (r309v2 ??) = (r309v1 ??), (r309v3 ??) binds: [B:76:0x0151, B:65:0x013d] A[DONT_GENERATE, DONT_INLINE]
          (r309v3 ?? I:com.facebook.quicksilver.common.sharing.InstantGameVideoShareMedia) from 0x013f: IPUT (r0v73 ?? I:android.net.Uri), (r309v3 ?? I:com.facebook.quicksilver.common.sharing.InstantGameVideoShareMedia) A[Catch: JSONException -> 0x017a] com.facebook.quicksilver.common.sharing.InstantGameVideoShareMedia.A00 android.net.Uri
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // X.GKe
    public void CL7(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v3 ??, still in use, count: 2, list:
          (r309v3 ??) from 0x0156: PHI (r309v2 ??) = (r309v1 ??), (r309v3 ??) binds: [B:76:0x0151, B:65:0x013d] A[DONT_GENERATE, DONT_INLINE]
          (r309v3 ?? I:com.facebook.quicksilver.common.sharing.InstantGameVideoShareMedia) from 0x013f: IPUT (r0v73 ?? I:android.net.Uri), (r309v3 ?? I:com.facebook.quicksilver.common.sharing.InstantGameVideoShareMedia) A[Catch: JSONException -> 0x017a] com.facebook.quicksilver.common.sharing.InstantGameVideoShareMedia.A00 android.net.Uri
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    @Override // X.GKe
    public void CLO(JSONObject jSONObject) {
        try {
            this.A01.CLN(A01(jSONObject), DKC.A1A("adInstanceID", DKG.A1C(jSONObject)));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onShowAdAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void COK(JSONObject jSONObject) {
        try {
            this.A01.COJ(A01(jSONObject));
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onSubscribeBotAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void CPf(JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            try {
                JSONObject A1C = DKG.A1C(jSONObject);
                String string = A1C.getString("app_id");
                String string2 = A1C.getString("payload");
                GKd gKd = this.A01;
                11T.A0D(string);
                11T.A0D(string2);
                gKd.CPe(A01, string, string2);
            } catch (JSONException unused) {
                A03(this, A01);
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Invalid JSON content received by onChangeContextAsync: ", AnonymousClass001.A0k(), e);
        }
    }

    @Override // X.GKe
    public void Cce(String str, String str2, JSONObject jSONObject) {
        try {
            String A01 = A01(jSONObject);
            if (A01.length() != 0) {
                this.A05.Ccf(A01, str, str2);
            }
        } catch (JSONException e) {
            A02(this.A00, jSONObject, "Trying to reject a message with invalid JSON: ", AnonymousClass001.A0k(), e);
        }
    }
}
