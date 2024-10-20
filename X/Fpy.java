package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.quicksilver.QuicksilverActivity;
import com.facebook.quicksilver.common.sharing.GamesContextPickerFilterParams;
import com.facebook.quicksilver.common.sharing.InstantGameImageShareMedia;
import com.facebook.quicksilver.common.sharing.InstantGameShareMedia;
import com.facebook.quicksilver.screenshot.QuicksilverScreenshotDetector;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Fpy.class */
public class Fpy implements GKd {
    public final /* synthetic */ DZW A00;

    public Fpy(DZW dzw) {
        this.A00 = dzw;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0w6, java.lang.Object] */
    public static void A00(Fpy fpy, String str, String str2, String str3) {
        String str4;
        if (str == null || TextUtils.isEmpty(str)) {
            DZW dzw = fpy.A00;
            FAX fax = dzw.A09;
            str = fax.A0F;
            if (str == null) {
                Er6 er6 = fax.A03;
                if (er6 == null || (str4 = er6.A0g) == null) {
                    FIT fit = dzw.A08;
                    if (fit != null) {
                        fit.A0G("async_share_failure", "No link or game ID could be found for share url");
                    }
                } else {
                    str = 0Pz.A0W("https://fb.gg/play/", str4);
                }
            }
            if (str2 != null && 1BK.A0N(dzw.A0Y).AZk(72339919418886639L)) {
                if (str == null) {
                    str = null;
                } else {
                    try {
                        Uri A00 = C0A2.A00(new Object(), str);
                        if (A00 != null) {
                            Uri.Builder buildUpon = A00.buildUpon();
                            buildUpon.appendQueryParameter("payload", str2);
                            str = buildUpon.build().toString();
                        }
                    } catch (NullPointerException e) {
                        FIT fit2 = dzw.A08;
                        if (fit2 != null) {
                            fit2.A0I("json_exception", "Error appending json payload to url", e);
                        }
                    }
                }
            }
        }
        DZW dzw2 = fpy.A00;
        Er6 er62 = dzw2.A09.A03;
        if (str == null || er62 == null) {
            dzw2.A0E.Ccf(str3, "There was an error while opening the share dialog", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        } else {
            1Bn.A0A(147783);
        }
    }

    public static void A01(DZW dzw, String str) {
        dzw.A0E.Ccf(str, "Client does not support ads in Instant Games", "CLIENT_REQUIRES_UPDATE");
    }

    @Override // X.GKd
    public void BkJ(String str) {
        GKb gKb;
        String str2;
        DZW dzw = this.A00;
        ETr A03 = DZW.A03(dzw);
        if (A03 != null && A03.A07 != null) {
            gKb = dzw.A0E;
            str2 = "ToS already active";
        } else {
            if (!F4Q.A00(dzw.A0n)) {
                GKb gKb2 = dzw.A0E;
                FJB fjb = dzw.A0A;
                JSONObject A01 = FJB.A01(fjb);
                try {
                    String str3 = fjb.A07;
                    if (str3 != null) {
                        A01.put("playerID", str3);
                    }
                } catch (JSONException unused) {
                }
                gKb2.Ci7(str, A01);
                return;
            }
            Context context = dzw.getContext();
            ETr A032 = DZW.A03(dzw);
            if (context != null && A032 != null) {
                A032.A03 = new FpD(dzw, A032);
                A032.A07 = str;
                DKG.A0E(dzw).Ciz(new E87(context, dzw, A032));
                return;
            }
            gKb = dzw.A0E;
            str2 = "Failed due to unknown error";
        }
        gKb.Ccf(str, str2, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
    }

    @Override // X.GKd
    public void BlQ(int i) {
        DZW dzw = this.A00;
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("loading_started");
        }
        DKG.A0E(dzw).Ciz(new E81(this, i));
    }

    @Override // X.GKd
    public void Bmh(String str) {
        DZW dzw;
        JSONObject A12 = AnonymousClass001.A12();
        try {
            dzw = this.A00;
            A12.put("canCreateShortcut", ((FcN) dzw.A10.get()).A01());
        } catch (JSONException unused) {
            dzw = this.A00;
            dzw.A0E.Ccf(str, "Unknown client error", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        }
        dzw.A0E.Ci7(str, A12);
    }

    @Override // X.GKd
    public void Bne(String str, String str2) {
        this.A00.A0A.A0M(str, str2);
    }

    @Override // X.GKd
    public void Br0(String str, String str2) {
        DZW dzw = this.A00;
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("consume_initiated");
        }
        FFy fFy = (FFy) dzw.A0q.get();
        FbUserSession fbUserSession = dzw.A02;
        fbUserSession.getClass();
        fFy.A03(fbUserSession, str, str2);
    }

    @Override // X.GKd
    public void BrP(GamesContextPickerFilterParams gamesContextPickerFilterParams, String str) {
        DZW dzw = this.A00;
        try {
            if (FHN.A02(dzw)) {
                JSONObject A12 = AnonymousClass001.A12();
                Eyl eyl = dzw.A09.A05;
                int ordinal = eyl.A00().ordinal();
                if (ordinal == 7) {
                    A12.put("thread_id", eyl.A00);
                } else if (ordinal == 2) {
                    A12.put("group_id", eyl.A00);
                }
                ImmutableMap of = ImmutableMap.of((Object) "game_play_context", (Object) A12);
                if (gamesContextPickerFilterParams == null) {
                    dzw.A1c("context_choose", str, "NT Context Choose Dialog", of, (C00m) null);
                    return;
                }
                JSONObject A122 = AnonymousClass001.A12();
                A122.put("min_thread_size", gamesContextPickerFilterParams.A02);
                A122.put("max_thread_size", gamesContextPickerFilterParams.A01);
                DKD.A1Q("filters", gamesContextPickerFilterParams.A00, A122);
                of.put("filter_params", A122);
                throw null;
            }
            DKG.A1R(dzw);
            JSONObject A01 = ((F87) dzw.A0p.get()).A01("context_choose", str, null);
            JSONObject A123 = AnonymousClass001.A12();
            Eyl eyl2 = dzw.A09.A05;
            int ordinal2 = eyl2.A00().ordinal();
            if (ordinal2 == 7) {
                A123.put("thread_id", eyl2.A00);
            } else if (ordinal2 == 2) {
                A123.put("group_id", eyl2.A00);
            }
            A01.put("game_play_context", A123);
            if (gamesContextPickerFilterParams != null) {
                JSONObject A124 = AnonymousClass001.A12();
                A124.put("min_thread_size", gamesContextPickerFilterParams.A02);
                A124.put("max_thread_size", gamesContextPickerFilterParams.A01);
                DKD.A1Q("filters", gamesContextPickerFilterParams.A00, A124);
                A01.put("filter_params", A124);
            }
            dzw.A0G.A02(dzw.A0C, new Fq4(this, 4), DZW.A06(dzw), "context_choose", A01.toString(), str);
        } catch (JSONException e) {
            FIT A00 = F9N.A00(dzw);
            if (A00 != null) {
                A00.A0I("json_exception", "Error parsing JSON payload for NT Context Choose dialog", e);
            }
        }
    }

    @Override // X.GKd
    public void BrQ(String str, JSONArray jSONArray, boolean z) {
        DZW dzw = this.A00;
        if (FHN.A02(dzw)) {
            dzw.A1c("context_create", str, "NT Context Create Dialog", ImmutableMap.of((Object) "participant_ids", (Object) new JSONArray((Collection) dzw.A0A.A0C(dzw.A0A.A0D(jSONArray)))), (C00m) null);
            return;
        }
        DKG.A1R(dzw);
        try {
            JSONObject A01 = ((F87) dzw.A0p.get()).A01("context_create", str, null);
            DKD.A1Q("participant_ids", dzw.A0A.A0C(dzw.A0A.A0D(jSONArray)), A01);
            dzw.A0G.A02(dzw.A0C, new Fq4(this, 6), DZW.A06(dzw), "context_create", A01.toString(), str);
        } catch (JSONException e) {
            FIT A00 = F9N.A00(dzw);
            if (A00 != null) {
                A00.A0I("json_exception", "Error rendering NT Context Create Dialog", e);
            }
        }
    }

    @Override // X.GKd
    public void BrT(String str, String str2) {
        DZW dzw = this.A00;
        if (FHN.A02(dzw)) {
            dzw.A1c("context_switch", (String) null, "NT Context Switch Dialog", ImmutableMap.of((Object) "context_token_id", (Object) str2), (C00m) null);
            return;
        }
        DKG.A1R(dzw);
        try {
            JSONObject A01 = ((F87) dzw.A0p.get()).A01("context_switch", str, null);
            A01.put("context_token_id", str2);
            A01.put("source_context_token_id", dzw.A09.A09);
            dzw.A0G.A02(dzw.A0C, new Fq4(this, 5), DZW.A06(dzw), "context_switch", A01.toString(), str);
        } catch (JSONException e) {
            FIT A00 = F9N.A00(dzw);
            if (A00 != null) {
                A00.A0I("json_exception", "Error rendering NT Context Switch Dialog", e);
            }
        }
    }

    @Override // X.GKd
    public void Brz(String str) {
        DZW dzw = this.A00;
        C00i c00i = dzw.A10;
        if (!((FcN) c00i.get()).A01()) {
            dzw.A0E.Ccf(str, "User cannot create shortcut", "INVALID_OPERATION");
            return;
        }
        Integer num = 0S2.A00;
        ((FcN) c00i.get()).A00();
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0E("shortcut_dialog_accepted", num, str);
        }
        dzw.A0E.Ci7(str, AnonymousClass001.A12());
        Er6 er6 = dzw.A09.A03;
        if (er6 != null && er6.A0g != null) {
            ((C3X) dzw.A0l.get()).A00(er6.A0g);
        }
        ((FcN) c00i.get()).A00 = true;
    }

    @Override // X.GKd
    public void By0(String str) {
        ((FFy) this.A00.A0q.get()).A06(str, "ONE_TIME_PAYMENT");
    }

    @Override // X.GKd
    public void By3(String str) {
        this.A00.A0A.A0I(str);
    }

    @Override // X.GKd
    public void ByA(String str) {
        ((FFy) this.A00.A0q.get()).A05(str);
    }

    @Override // X.GKd
    public void ByG(String str) {
        ((FFy) this.A00.A0q.get()).A06(str, "SUBSCRIBABLE");
    }

    @Override // X.GKd
    public void BzB(String str) {
        DKG.A0E(this.A00).Ciz(new E85(this, str));
    }

    @Override // X.GKd
    public void C07() {
        DZW dzw = this.A00;
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("game_ready");
        }
        DKG.A0E(dzw).Ciz(new E7y(this));
    }

    @Override // X.GKd
    public void C0M(String str, String str2, String str3, String str4) {
        DZW dzw = this.A00;
        if (dzw.A09.A03 == null) {
            dzw.A0E.Ccf(str, "game information is unavailable", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
            return;
        }
        EvU evU = (EvU) dzw.A0k.get();
        FbUserSession fbUserSession = dzw.A02;
        fbUserSession.getClass();
        Context context = dzw.getContext();
        FAX fax = dzw.A09;
        String str5 = fax.A03.A0g;
        String str6 = fax.A09;
        String str7 = fax.A0D;
        if (str7 == null) {
            str7 = "";
        }
        EjO ejO = new EjO(this, str);
        1BL.A11(0, fbUserSession, str2, str3);
        1BK.A1L(str4, 5, str7);
        1FV A00 = evU.A00(fbUserSession, str, str2, str3, str4, str5, str6, str7, (String) null);
        1Br.A0D(evU.A00, new Fw1(12, context, ejO, evU), A00);
    }

    @Override // X.GKd
    public void C0O(String str, String str2, String str3, String str4) {
        DZW dzw = this.A00;
        Er6 er6 = dzw.A09.A03;
        if (er6 == null) {
            dzw.A0E.Ccf(str, "Unable to perform this operation in this game session.", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
            return;
        }
        if (FHN.A02(dzw)) {
            ImmutableList immutableList = er6.A0G;
            if (str2 == null || immutableList == null || !immutableList.contains(DKC.A18(str2))) {
                C00i c00i = dzw.A0j;
                if (c00i.get() != null) {
                    ((FHy) c00i.get()).A06(str4);
                }
                dzw.A1c(str2, str, "NT Generic Dialog", ImmutableMap.of((Object) "data", (Object) str4), new LuJ(str, this, 0));
                return;
            }
        } else {
            DKG.A1R(dzw);
            ImmutableList immutableList2 = er6.A0G;
            if (str2 == null || immutableList2 == null || !immutableList2.contains(DKC.A18(str2))) {
                try {
                    JSONObject A01 = ((F87) dzw.A0p.get()).A01(str2, str, str3);
                    A01.put("data", str4);
                    C00i c00i2 = dzw.A0j;
                    if (c00i2.get() != null) {
                        ((FHy) c00i2.get()).A06(str4);
                    }
                    dzw.A0G.A02(dzw.A0C, new Fq5(str, this, 1), DZW.A06(dzw), str2, A01.toString(), str);
                    return;
                } catch (JSONException e) {
                    dzw.A0G.A01();
                    dzw.A0E.Ccf(str, "Something went wrong", "INVALID_PARAM");
                    FIT fit = dzw.A08;
                    if (fit != null) {
                        fit.A0I("json_exception", "Error rendering NT Generic Dialog", e);
                        return;
                    }
                    return;
                }
            }
        }
        dzw.A0G.A01();
        dzw.A0E.Ccf(str, "Unable to perform this operation in this game session.", "OPERATION_SUPPRESSED");
    }

    @Override // X.GKd
    public void C0S(String str) {
        CharSequence charSequence;
        ClipData primaryClip;
        DZW dzw = this.A00;
        Context context = dzw.getContext();
        if (context != null) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            boolean z = false;
            if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || primaryClip.getItemAt(0) == null) {
                charSequence = "";
            } else {
                charSequence = primaryClip.getItemAt(0).getText();
                z = true;
            }
            try {
                if (!z || charSequence == null) {
                    dzw.A0E.Ccf(str, "Can't read text from Android clipboard", "CLIENT_UNSUPPORTED_OPERATION");
                    return;
                }
                String A00 = Qzl.A00(charSequence.toString(), FHN.A00(dzw.A0o).Auy(36594263828989886L));
                JSONObject A12 = AnonymousClass001.A12();
                A12.put("text", A00);
                dzw.A0E.Ci7(str, A12);
            } catch (JSONException unused) {
                dzw.A0E.Ccf(str, "Can't read text from Android clipboard", "CLIENT_UNSUPPORTED_OPERATION");
            }
        }
    }

    @Override // X.GKd
    public void C0U(String str) {
        this.A00.A0A.A0J(str);
    }

    @Override // X.GKd
    public void C0Y(String str, String str2) {
        DZW dzw = this.A00;
        FragmentActivity activity = dzw.getActivity();
        if (F5Y.A00(dzw.A0u)) {
            C00i c00i = dzw.A0t;
            if (c00i.get() != null && activity != null) {
                ((GKQ) c00i.get()).BP6(activity, new FpE(this, str), str2);
                return;
            }
        }
        A01(dzw, str);
    }

    @Override // X.GKd
    public void C0b(String str, List list) {
        DKG.A0E(this.A00).Ciz(new E8A(this, str, list));
    }

    @Override // X.GKd
    public void C0d(String str, String str2) {
        DZW dzw = this.A00;
        FragmentActivity activity = dzw.getActivity();
        if (F5Y.A00(dzw.A0u)) {
            C00i c00i = dzw.A0t;
            if (c00i.get() != null && activity != null) {
                ((GKQ) c00i.get()).BP9(activity, new FpE(this, str), str2);
                return;
            }
        }
        A01(dzw, str);
    }

    @Override // X.GKd
    public void C0f(String str, String str2) {
        DZW dzw = this.A00;
        FragmentActivity activity = dzw.getActivity();
        if (F5Y.A00(dzw.A0u)) {
            C00i c00i = dzw.A0t;
            if (c00i.get() != null && activity != null) {
                ((GKQ) c00i.get()).BPA(activity, new FpE(this, str), str2);
                return;
            }
        }
        A01(dzw, str);
    }

    @Override // X.GKd
    public void C0h(String str, String str2) {
        this.A00.A0A.A0K(str, str2);
    }

    @Override // X.GKd
    public void C10(String str) {
        DZW dzw = this.A00;
        if (dzw.A0t.get() == null || dzw.A00 == null) {
            A01(dzw, str);
        } else {
            DKG.A0E(dzw).Ciz(new E80(this, str));
        }
    }

    @Override // X.GKd
    public void C1h(String str, String str2) {
        DZW dzw = this.A00;
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("init_async");
        }
        DKG.A0E(dzw).Ciz(new E89(this, str, str2));
    }

    @Override // X.GKd
    public void C3m(String str, String str2) {
        DZW dzw = this.A00;
        if (F5Y.A00(dzw.A0u)) {
            C00i c00i = dzw.A0t;
            if (c00i.get() != null) {
                GKQ gkq = (GKQ) c00i.get();
                String str3 = dzw.A0A.A07;
                String str4 = dzw.A09.A0D;
                if (str4 == null) {
                    str4 = "";
                }
                gkq.BYY(new FpE(this, str), str2, str3, str4);
                return;
            }
        }
        A01(dzw, str);
    }

    @Override // X.GKd
    public void C3o(String str, String str2, String str3) {
        DZW dzw = this.A00;
        FragmentActivity activity = dzw.getActivity();
        if (!F5Y.A00(dzw.A0u) || dzw.A0t.get() == null || activity == null) {
            A01(dzw, str);
        } else {
            DKG.A0E(dzw).Ciz(new E8C(activity, this, str2, str, str3));
        }
    }

    @Override // X.GKd
    public void C5j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        DZW dzw = this.A00;
        if (dzw.A0K != null) {
            dzw.A0E.Ccf(str, "Existing request pending", "PENDING_REQUEST");
            return;
        }
        dzw.A0K = str;
        dzw.A0L = str2;
        ((1GU) dzw.A0Z.get()).Ciz(new E8E(dzw, str7, str8, str9, str10, str3, str4, str5, str6, z, z2));
    }

    @Override // X.GKd
    public void CBF(String str) {
        Vibrator vibrator;
        Context context = this.A00.getContext();
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null || !vibrator.hasVibrator()) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createOneShot(100, -1));
    }

    @Override // X.GKd
    public void CEN(int i) {
        DKG.A0E(this.A00).Ciz(new E84(this, i));
    }

    @Override // X.GKd
    public void CEn(String str, String str2, String str3) {
        DZW dzw = this.A00;
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("purchase_initiated");
        }
        if (dzw.getActivity() != null) {
            ((FFy) dzw.A0q.get()).A02(dzw.getActivity(), str, str2, str3);
        }
    }

    @Override // X.GKd
    public void CEt(String str, String str2, String str3) {
        0fH.A0n("QuicksilverFragment", "onPurchaseSubscriptionAsync initiatePurchase");
        DZW dzw = this.A00;
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("purchase_initiated");
        }
        if (dzw.getActivity() != null) {
            FFy fFy = (FFy) dzw.A0q.get();
            FbUserSession fbUserSession = dzw.A02;
            fbUserSession.getClass();
            FragmentActivity activity = dzw.getActivity();
            GIY giy = fFy.A00;
            if (giy != null) {
                Integer num = 0S2.A0u;
                if (FFy.A01(giy, fFy, num, str)) {
                    if (0S2.A01.equals(fFy.A06.A07)) {
                        ((EvG) fFy.A03.get()).A00(fbUserSession, new Fpk(activity, fFy, str, str3), str2);
                        return;
                    } else {
                        FFy.A00(fFy).A06("game_not_started");
                        fFy.A00.Bxj(num, str, "Cannot call purchaseSubscriptionAsync before startGameAsync resolves", "INVALID_OPERATION");
                        return;
                    }
                }
            }
            FFy.A00(fFy).A06("payments_not_initialized");
        }
    }

    @Override // X.GKd
    public void CFD() {
        this.A00.A1Y();
    }

    @Override // X.GKd
    public void CFz() {
        DZW dzw = this.A00;
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("register_screenshot_provider");
        }
        C00i c00i = dzw.A0y;
        ((5FE) c00i.get()).A01();
        QuicksilverScreenshotDetector quicksilverScreenshotDetector = (QuicksilverScreenshotDetector) c00i.get();
        quicksilverScreenshotDetector.A00.add(new FqA(this));
        EjN ejN = dzw.A06;
        if (ejN != null) {
            QuicksilverActivity quicksilverActivity = ejN.A01;
            quicksilverActivity.A0L = true;
            2Wo r0 = quicksilverActivity.A0I;
            if (r0 != null && r0.A04()) {
                QuicksilverActivity.A1F(quicksilverActivity);
            } else if (quicksilverActivity.A0C != null) {
                QuicksilverActivity.A1J(quicksilverActivity, true);
            }
        }
    }

    @Override // X.GKd
    public void CKW(String str, String str2, String str3, String str4, boolean z) {
        this.A00.A0A.A0N(str, str2, str3, str4, z);
    }

    @Override // X.GKd
    public void CKo(String str, String str2) {
        DZW dzw = this.A00;
        Context context = dzw.getContext();
        if (context != null) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                dzw.A0E.Ccf(str, "Can't write text in Android clipboard", "CLIENT_UNSUPPORTED_OPERATION");
            } else {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Copied text from the game", str2));
                dzw.A0E.Ci7(str, AnonymousClass001.A12());
            }
        }
    }

    @Override // X.GKd
    public void CKv(String str, JSONObject jSONObject) {
        DKG.A0E(this.A00).Ciz(new E8B(this, str, jSONObject));
    }

    @Override // X.GKd
    public void CKy(String str) {
        this.A00.A09.A0C = str;
    }

    @Override // X.GKd
    public void CL8(InstantGameShareMedia instantGameShareMedia, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, boolean z) {
        DZW A00;
        Context context;
        DZW dzw;
        FIT fit;
        String str6;
        if (!(instantGameShareMedia instanceof InstantGameImageShareMedia)) {
            DZW dzw2 = this.A00;
            E8K e8k = dzw2.A0C;
            ArrayList A0s = AnonymousClass001.A0s();
            EsM esM = (EsM) e8k.A05.get();
            if (esM != null && (A00 = esM.A00()) != null && (context = A00.getContext()) != null) {
                A0s.add(new RQv(2132345168, 4YU.A0t(context.getResources(), 2131964089), 2131964089));
                if (((C6h) 1Br.A0B(e8k.A02)).A00()) {
                    A0s.add(new RQv(2132410689, 4YU.A0t(context.getResources(), 2131964088), 120609));
                }
            }
            if (A0s.size() < 2) {
                dzw2.A0C.A01(instantGameShareMedia, str, str2, str3);
                return;
            }
            dzw2.A0r.get();
            View view = (View) dzw2.A0E;
            Integer num = 0S2.A0C;
            11T.A0F(view, 0);
            Q68 q68 = new Q68(view.getContext());
            q68.A0A(view);
            q68.A0H(num);
            DPb A0K = q68.A0K();
            11T.A0A(A0K);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                RQv rQv = (RQv) it.next();
                FXN fxn = new FXN(A0K, rQv.A02, rQv.A00, 0);
                A0K.A01(fxn);
                fxn.A02(rQv.A01.intValue());
            }
            FXq.A01(view, q68, ActionId.CONTROLLER_INITIATED);
            ((Q69) q68).A02 = new Eox(this, instantGameShareMedia, str, str2, str3);
            ((FIU) q68).A0K = new Fe1(this, str);
            q68.A07();
            return;
        }
        try {
            String str7 = ((InstantGameImageShareMedia) instantGameShareMedia).A00;
            dzw = this.A00;
            C00i c00i = dzw.A0j;
            if (c00i != null && c00i.get() != null) {
                if (str7 != null) {
                    jSONObject.put("image", str7);
                }
                ((FHy) c00i.get()).A06(jSONObject.toString());
            }
        } catch (Exception e) {
            dzw = this.A00;
            FIT fit2 = dzw.A08;
            if (fit2 != null) {
                fit2.A0I("json_exception", "Error rendering share dialog", e);
            }
        }
        if (!z) {
            C00i c00i2 = dzw.A0Y;
            if (1BK.A0N(c00i2).AZk(72339919418296809L)) {
                boolean AZk = 1BK.A0N(c00i2).AZk(72339919418362346L);
                if (!1BK.A0N(c00i2).AZk(72339919418952176L)) {
                    dzw.requireContext();
                    A00(this, null, str3, str);
                    return;
                }
                Context requireContext = dzw.requireContext();
                String str8 = null;
                if (AZk) {
                    str8 = str2;
                }
                Er6 er6 = dzw.A09.A03;
                if (er6 == null) {
                    fit = dzw.A08;
                    if (fit == null) {
                        return;
                    } else {
                        str6 = "game information is null";
                    }
                } else {
                    if (dzw.A0D == null) {
                        A00(this, null, str3, str);
                        return;
                    }
                    C03z c03z = GraphQlCallInput.A02;
                    07S A0J = 4YU.A0J(c03z, str3 != null ? str3 : "{}", "payload");
                    07S.A00(A0J, str2, "preview_description");
                    String str9 = er6.A0g;
                    if (str9 != null) {
                        07S A0J2 = 4YU.A0J(c03z, str9, "app_id");
                        A0J2.A0H(A0J, "link_params");
                        Ezm ezm = dzw.A0D;
                        Fpq fpq = new Fpq(requireContext, this, instantGameShareMedia, str8, str2, str3, str);
                        GraphQlQueryParamSet A0M = 7zL.A0M();
                        4YV.A1A(A0J2, A0M, "input");
                        Context context2 = ezm.A00;
                        1Vd A0A = DKI.A0A(context2, context2);
                        5Dh A002 = 5Dh.A00(A0M, new C01643sd(Dkb.class, "FBGamingCreatePlayLinkMutation", null, "input", "fbandroid", -1890021152, 384, 3641187944L, 3641187944L, false, true));
                        DKH.A1H(A002);
                        ezm.A01.CY3(new G4B(fpq, ezm, A0A.A09(A002)));
                        return;
                    }
                    fit = dzw.A08;
                    if (fit == null) {
                        return;
                    } else {
                        str6 = "game id is null";
                    }
                }
                fit.A0G("share_link_data_fetch_error", str6);
                return;
            }
        }
        DKG.A0E(dzw).Ciz(new G6I(this, instantGameShareMedia, str, str2, str3, str4, str5, z));
    }

    @Override // X.GKd
    public void CLN(String str, String str2) {
        GKb gKb;
        String str3;
        String str4;
        Integer num = 0S2.A01;
        DZW dzw = this.A00;
        if (num.equals(dzw.A09.A07)) {
            if (F5Y.A00(dzw.A0u)) {
                C00i c00i = dzw.A0t;
                if (c00i.get() != null) {
                    ((GKQ) c00i.get()).CzL(new FpE(this, str), str2);
                    return;
                }
            }
            gKb = dzw.A0E;
            str3 = "Client does not support ads in Instant Games";
            str4 = "CLIENT_REQUIRES_UPDATE";
        } else {
            gKb = dzw.A0E;
            str3 = "Cannot call showAd before startGameAsync resolves";
            str4 = "INVALID_OPERATION";
        }
        gKb.Ccf(str, str3, str4);
    }

    @Override // X.GKd
    public void COJ(String str) {
        DKG.A0E(this.A00).Ciz(new E82(this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r308 == null) goto L6;
     */
    @Override // X.GKd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CPe(java.lang.String r302, java.lang.String r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fpy.CPe(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.GKd
    public void CSf(JSONObject jSONObject) {
        DZW dzw = this.A00;
        dzw.A0A.A0H((String) null);
        FHy fHy = (FHy) dzw.A0j.get();
        FbUserSession fbUserSession = dzw.A02;
        fbUserSession.getClass();
        fHy.A05(fbUserSession, jSONObject);
        dzw.A0E.Ckm(EOz.A0L, dzw.A0A.A0F());
    }
}
