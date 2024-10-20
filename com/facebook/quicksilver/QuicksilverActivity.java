package com.facebook.quicksilver;

import X.06Z;
import X.0CU;
import X.0FI;
import X.0LS;
import X.0OC;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1GD;
import X.1HH;
import X.1Hv;
import X.1Iw;
import X.1Wa;
import X.1iF;
import X.1lN;
import X.1tJ;
import X.2JX;
import X.2Jf;
import X.2Wo;
import X.2vC;
import X.2vD;
import X.2yD;
import X.4YU;
import X.4YV;
import X.5TL;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zR;
import X.7zT;
import X.7zU;
import X.Aak;
import X.AbE;
import X.AbF;
import X.AbH;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass046;
import X.AnonymousClass047;
import X.AnonymousClass243;
import X.C00i;
import X.C06c;
import X.C0B7;
import X.C0D1;
import X.C0et;
import X.C0ty;
import X.C2125Dee;
import X.C2v7;
import X.C2vn;
import X.C3o5;
import X.C67Q;
import X.DKD;
import X.DKF;
import X.DKG;
import X.DQk;
import X.DZV;
import X.DZW;
import X.Dky;
import X.ENU;
import X.EXd;
import X.Efo;
import X.Efp;
import X.Efv;
import X.EiQ;
import X.EjM;
import X.EjN;
import X.EpS;
import X.Eq8;
import X.Er6;
import X.EsP;
import X.EtM;
import X.EtS;
import X.EuZ;
import X.F3o;
import X.F5Y;
import X.F6C;
import X.F90;
import X.FAX;
import X.FFa;
import X.FGt;
import X.FHD;
import X.FHN;
import X.FHq;
import X.FIT;
import X.FbD;
import X.FpJ;
import X.Fq3;
import X.FsG;
import X.FsH;
import X.FwL;
import X.G2h;
import X.G2j;
import X.GDK;
import X.GDL;
import X.GE5;
import X.GKb;
import X.IKS;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.games.dmaconsent.optoutbottomsheet.FBGamingDMAOptoutSheetActivity;
import com.facebook.graphql.enums.GraphQLCloudGamingSupportedFeature;
import com.facebook.graphql.enums.GraphQLGamesInstantPlaySupportedOrientation;
import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import com.facebook.litho.LithoView;
import com.facebook.quicksilver.model.QuicksilverIntentExtras;
import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: QuicksilverActivity.class */
public class QuicksilverActivity extends FbFragmentActivity implements 1lN, GDL, GE5, ComponentCallbacks2, C2vn, GDK {
    public long A01;
    public Fragment A02;
    public C2125Dee A03;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public 1Iw A0B;
    public LithoView A0C;
    public DZW A0E;
    public FGt A0F;
    public FAX A0G;
    public DZV A0H;
    public 2Wo A0I;
    public C00i A0P;
    public C00i A0Q;
    public C00i A0R;
    public C00i A0S;
    public C00i A0T;
    public C00i A0U;
    public C00i A0V;
    public C00i A0W;
    public int A00 = 1;
    public boolean A0Y = false;
    public boolean A0X = false;
    public boolean A0L = false;
    public boolean A0N = false;
    public boolean A0K = false;
    public boolean A0M = false;
    public final Aak A0c = new FpJ(this);
    public final View.OnSystemUiVisibilityChangeListener A0Z = new IKS(this, 2);
    public final FHN A0d = (FHN) 1Bi.A03(85203);
    public final C00i A0a = 1BQ.A02(16387);
    public final C00i A0b = 1BQ.A01();
    public final Efv A0j = (Efv) 1Bi.A03(98399);
    public final C00i A0f = 1BQ.A02(98393);
    public final C00i A0g = 1BQ.A02(98392);
    public final C00i A0h = 1BQ.A02(98367);
    public final C00i A0i = 1BQ.A02(98346);
    public final Queue A0e = new ConcurrentLinkedQueue();
    public boolean A0O = true;
    public Runnable A0J = null;
    public EiQ A0D = (EiQ) 1Hv.A02(this, 98396);
    public EuZ A04 = (EuZ) 1Hv.A02(this, 98394);

    private QuicksilverIntentExtras A12() {
        GraphQLInstantGameContextType graphQLInstantGameContextType;
        String str;
        Integer num;
        String A16;
        String str2 = null;
        ImmutableList immutableList = null;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("app_id");
        String stringExtra2 = intent.getStringExtra(Property.SYMBOL_Z_ORDER_SOURCE);
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            stringExtra2 = "unknown";
        }
        Serializable serializableExtra = intent.getSerializableExtra("source_context");
        if (serializableExtra instanceof String) {
            String obj = serializableExtra.toString();
            11T.A0D(obj);
            graphQLInstantGameContextType = GraphQLInstantGameContextType.valueOf(obj);
        } else {
            graphQLInstantGameContextType = (GraphQLInstantGameContextType) serializableExtra;
        }
        String stringExtra3 = intent.getStringExtra("source_id");
        if (graphQLInstantGameContextType == null || stringExtra3 == null || stringExtra3.length() == 0) {
            graphQLInstantGameContextType = GraphQLInstantGameContextType.SOLO;
        }
        String stringExtra4 = intent.getStringExtra("invitation_id");
        int longExtra = (int) intent.getLongExtra("game_type", -1);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(AbE.A00(697));
        if (stringArrayListExtra != null) {
            immutableList = ImmutableList.copyOf((Collection) stringArrayListExtra);
        }
        String stringExtra5 = intent.getStringExtra("entry_point_data");
        if (stringExtra5 == null || !11T.A0P("%", 1, stringExtra5)) {
            str2 = stringExtra5;
        } else {
            try {
                str2 = URLDecoder.decode(stringExtra5, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String stringExtra6 = intent.getStringExtra("game_link");
        boolean booleanExtra = intent.getBooleanExtra("tab_redirection", false);
        boolean booleanExtra2 = intent.getBooleanExtra("open_tab_on_close", false);
        boolean booleanExtra3 = intent.getBooleanExtra("open_play_pivot_tab_on_close", false);
        boolean z = false;
        boolean z2 = false;
        String stringExtra7 = intent.getStringExtra("cloud_binary_id");
        String stringExtra8 = intent.getStringExtra("cgreferral");
        String stringExtra9 = intent.getStringExtra("cloud_session_id");
        String stringExtra10 = intent.getStringExtra("coplay_session_id");
        if (stringExtra9 == null) {
            stringExtra9 = String.valueOf(new Random().nextInt());
        }
        String stringExtra11 = intent.getStringExtra("instant_tournament_sticker_id");
        String stringExtra12 = intent.getStringExtra("entrypoint_video_id");
        String stringExtra13 = intent.getStringExtra("custom_update_id");
        String stringExtra14 = intent.getStringExtra(AbE.A00(ActionId.FUTURE_LISTENERS_COMPLETE));
        String stringExtra15 = intent.getStringExtra(AbE.A00(ActionId.APP_DID_FINISH_LAUNCHING));
        String A00 = AbE.A00(ActionId.ON_ATTACH_FRAGMENT);
        String stringExtra16 = intent.getStringExtra(A00);
        String stringExtra17 = intent.getStringExtra(AbE.A00(68));
        intent.getBooleanExtra("intent_is_coplay", false);
        String stringExtra18 = intent.getStringExtra("play_style");
        String stringExtra19 = intent.getStringExtra("environment_type");
        String stringExtra20 = getIntent().getStringExtra(Property.SYMBOL_Z_ORDER_SOURCE);
        if ("home_screen_shortcut".equals(stringExtra20)) {
            this.A0P.get();
            Integer num2 = 0S2.A03;
            Integer num3 = 0S2.A0Z;
            11T.A0F(num3, 3);
            stringExtra2 = EXd.A00(num3, num2);
            str = "ANDROID_INSTANT_GAME_SHORTCUT";
        } else {
            str = "IG_REDIRECTION";
            if ("fb_reels".equals(stringExtra20)) {
                String upperCase = getIntent().getStringExtra(A00).toUpperCase(Locale.ROOT);
                if (upperCase.equals("A2U_ARCADE_UNIT")) {
                    num = 0S2.A00;
                } else if (upperCase.equals("A2U_BOT_MENU")) {
                    num = 0S2.A01;
                } else if (upperCase.equals("A2U_BOT_MESSAGE")) {
                    num = 0S2.A0C;
                } else if (upperCase.equals("A2U_FEED_UNIT")) {
                    num = 0S2.A0N;
                } else if (upperCase.equals("A2U_JEWEL_NOTIFICATION")) {
                    num = 0S2.A0Y;
                } else if (upperCase.equals("A2U_QUICK_PROMOTION")) {
                    num = 0S2.A0j;
                } else if (upperCase.equals("A2U_TAB_NOTIFICATION")) {
                    num = 0S2.A0u;
                } else if (upperCase.equals("ADMIN_MESSAGE")) {
                    num = 0S2.A15;
                } else if (upperCase.equals("ADS")) {
                    num = 0S2.A1G;
                } else if (upperCase.equals("ALOHA_GAMEHOST")) {
                    num = 0S2.A1J;
                } else if (upperCase.equals("APP_ATTRIBUTION")) {
                    num = 0S2.A02;
                } else if (upperCase.equals("AYMT")) {
                    num = 0S2.A03;
                } else if (upperCase.equals("BOT_MENU")) {
                    num = 0S2.A04;
                } else if (upperCase.equals("BOT_NULL_STATE")) {
                    num = 0S2.A05;
                } else if (upperCase.equals("BRACKETS")) {
                    num = 0S2.A06;
                } else if (upperCase.equals("CANVAS")) {
                    num = 0S2.A07;
                } else if (upperCase.equals("CHAINING")) {
                    num = 0S2.A08;
                } else if (upperCase.equals("CLOUD_REENGAGEMENT_NOTIFICATION")) {
                    num = 0S2.A09;
                } else if (upperCase.equals("CONTEXT_CHOOSE")) {
                    num = 0S2.A0A;
                } else if (upperCase.equals("CONTEXT_CREATE")) {
                    num = 0S2.A0B;
                } else if (upperCase.equals("CONTEXT_UPDATE")) {
                    num = 0S2.A0D;
                } else if (upperCase.equals("COPLAY")) {
                    num = 0S2.A0E;
                } else if (upperCase.equals("CUSTOM_SHARE")) {
                    num = 0S2.A0F;
                } else if (upperCase.equals("CUSTOM_UPDATE")) {
                    num = 0S2.A0G;
                } else if (upperCase.equals("CUSTOM_INVITE")) {
                    num = 0S2.A0H;
                } else if (upperCase.equals("CUSTOM_INVITE_SHARE")) {
                    num = 0S2.A0I;
                } else if (upperCase.equals("DATA_BUG")) {
                    num = 0S2.A0J;
                } else if (upperCase.equals("EMBEDDED_PLAYER")) {
                    num = 0S2.A0K;
                } else if (upperCase.equals("EMOJI_EASTER_EGG")) {
                    num = 0S2.A0L;
                } else if (upperCase.equals("FB_REDIRECTION_TAB")) {
                    num = 0S2.A0M;
                } else if (upperCase.equals("FB_GG_LINK")) {
                    num = 0S2.A0O;
                } else if (upperCase.equals("GAME_PUSH_NOTIFICATION")) {
                    num = 0S2.A0P;
                } else if (upperCase.equals("GAME_SHARE")) {
                    num = 0S2.A0Q;
                } else if (upperCase.equals("GAME_SWITCH")) {
                    num = 0S2.A0R;
                } else if (upperCase.equals("GAMEHUB")) {
                    num = 0S2.A0S;
                } else if (upperCase.equals("GAMEHUB_BOOKMARKS")) {
                    num = 0S2.A0T;
                } else if (upperCase.equals("GAMES_HUB_SEARCH")) {
                    num = 0S2.A0U;
                } else if (upperCase.equals("GAMES_TAB_NOTIFICATION")) {
                    num = 0S2.A0V;
                } else if (upperCase.equals("GROUP_GAMES_TAB")) {
                    num = 0S2.A0W;
                } else if (upperCase.equals("GROUP_TOURNAMENTS")) {
                    num = 0S2.A0X;
                } else if (upperCase.equals("HOME_SCREEN_SHORTCUT")) {
                    num = 0S2.A0Z;
                } else if (upperCase.equals("INSTANT_TOURNAMENT_STICKER")) {
                    num = 0S2.A0a;
                } else if (upperCase.equals("LEADERBOARDS")) {
                    num = 0S2.A0b;
                } else if (upperCase.equals("LIVE_VIDEO")) {
                    num = 0S2.A0c;
                } else if (upperCase.equals("M_ME_LINK")) {
                    num = 0S2.A0d;
                } else if (upperCase.equals("M_SUGGESTIONS")) {
                    num = 0S2.A0e;
                } else if (upperCase.equals("MESSENGER_BUSINESS_ATTACHMENT")) {
                    num = 0S2.A0f;
                } else if (upperCase.equals("MESSENGER_COMPOSER")) {
                    num = 0S2.A0g;
                } else if (upperCase.equals("MESSENGER_COMPOSER_SMS")) {
                    num = 0S2.A0h;
                } else if (upperCase.equals("MESSENGER_DIODING")) {
                    num = 0S2.A0i;
                } else if (upperCase.equals("MESSENGER_DIODING_TAB")) {
                    num = 0S2.A0k;
                } else if (upperCase.equals("MESSENGER_ONE_LINE_COMPOSER")) {
                    num = 0S2.A0l;
                } else if (upperCase.equals("MESSENGER_SIDEBAR")) {
                    num = 0S2.A0m;
                } else if (upperCase.equals("MINI_CHAINING")) {
                    num = 0S2.A0n;
                } else if (upperCase.equals("NEW_FRIEND_MESSAGE_RECOMMENDATION")) {
                    num = 0S2.A0o;
                } else if (upperCase.equals("NON_MESSENGER_WAP_NOTIFICATION")) {
                    num = 0S2.A0p;
                } else if (upperCase.equals("PAGE_PLAY_GAME_BUTTON")) {
                    num = 0S2.A0q;
                } else if (upperCase.equals("PLAY_FROM_POST_EDGE_STORY")) {
                    num = 0S2.A0r;
                } else if (upperCase.equals("PLAYED_FROM_POST_NOTIFICATION")) {
                    num = 0S2.A0s;
                } else if (upperCase.equals("PRESENCE")) {
                    num = 0S2.A0t;
                } else if (upperCase.equals("QUICK_PROMOTION")) {
                    num = 0S2.A0v;
                } else if (upperCase.equals("RATINGS")) {
                    num = 0S2.A0w;
                } else if (upperCase.equals("REELS_LABEL")) {
                    num = 0S2.A0x;
                } else if (upperCase.equals("REELS_PUNCHLINE")) {
                    num = 0S2.A0y;
                } else if (upperCase.equals("REELS_BOTTOMSHEET")) {
                    num = 0S2.A0z;
                } else if (upperCase.equals("REELS_AGGREGATION_PAGE")) {
                    num = 0S2.A10;
                } else if (upperCase.equals("REELS_AR_GAME_PROFILE_PAGE_META_TEXT")) {
                    num = 0S2.A11;
                } else if (upperCase.equals("REELS_AR_GAME_PROFILE_PAGE_PLAY_BUTTON")) {
                    num = 0S2.A12;
                } else if (upperCase.equals("REELS_AR_GAME_AUGMENT_TRY_IT_BUTTON")) {
                    num = 0S2.A13;
                } else if (upperCase.equals("REAL_TIME_COMMUNICATION")) {
                    num = 0S2.A14;
                } else if (upperCase.equals("RECENTLY_PLAYED")) {
                    num = 0S2.A16;
                } else if (upperCase.equals(1BJ.A00(851))) {
                    num = 0S2.A17;
                } else if (upperCase.equals("STALE_THREAD_RESURRECTION")) {
                    num = 0S2.A18;
                } else if (upperCase.equals("STICKERS")) {
                    num = 0S2.A19;
                } else if (upperCase.equals("STREAMER_DASHBOARD")) {
                    num = 0S2.A1A;
                } else if (upperCase.equals("AR_GAME_STORY_MIDCARD")) {
                    num = 0S2.A1B;
                } else if (upperCase.equals("TOASTS")) {
                    num = 0S2.A1C;
                } else if (upperCase.equals("TOURNAMENT_MENU_NOTIFICATION")) {
                    num = 0S2.A1D;
                } else if (upperCase.equals("TOURNAMENTS")) {
                    num = 0S2.A1E;
                } else {
                    if (!upperCase.equals("TURN_REMINDER_NOTIFICATION")) {
                        throw AnonymousClass001.A0L(upperCase);
                    }
                    num = 0S2.A1F;
                }
                this.A0P.get();
                Integer num4 = 0S2.A07;
                11T.A0F(num, 3);
                stringExtra2 = EXd.A00(num, num4);
                z = true;
            }
            if ("ar_game_story_cta".equals(stringExtra20)) {
                z2 = true;
            }
        }
        String stringExtra21 = getIntent().getStringExtra("app_id");
        if (stringExtra21 != null && (A16 = A16(stringExtra21)) != null) {
            stringExtra = A16;
        }
        return new QuicksilverIntentExtras(graphQLInstantGameContextType, immutableList, stringExtra15, stringExtra7, stringExtra8, stringExtra9, stringExtra14, stringExtra3, stringExtra10, stringExtra13, str2, stringExtra16, str, stringExtra12, stringExtra, stringExtra6, stringExtra17, stringExtra19, stringExtra11, stringExtra4, stringExtra18, stringExtra2, longExtra, z2, z, false, false, booleanExtra, booleanExtra3, booleanExtra2);
    }

    public static final String A15(QuicksilverActivity quicksilverActivity) {
        return 7zO.A0H(quicksilverActivity) != null ? quicksilverActivity.A16(7zO.A0H(quicksilverActivity).getString("app_id", "")) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Map] */
    private String A16(String str) {
        if (str == null) {
            str = "";
        } else {
            FHN fhn = this.A0d;
            HashMap A0u = AnonymousClass001.A0u();
            try {
                Object A0V = AnonymousClass243.A00().A0V(1Br.A06(fhn.A00).BCy(36874093871366415L), Map.class);
                11T.A0I(A0V, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String?, kotlin.String?>");
                ?? A02 = C0B7.A02(A0V);
                if (A02 != 0) {
                    A0u = A02;
                }
            } catch (IOException unused) {
            }
            if (A0u.containsKey(str)) {
                return AnonymousClass001.A0b(str, A0u);
            }
        }
        return str;
    }

    public static void A1D(Bundle bundle, QuicksilverActivity quicksilverActivity) {
        View findViewById;
        C67Q c67q;
        quicksilverActivity.A0M = false;
        quicksilverActivity.A0b.get();
        String stringExtra = quicksilverActivity.getIntent().getStringExtra("app_id");
        if (stringExtra != null) {
            quicksilverActivity.A16(stringExtra);
        }
        EsP esP = (EsP) quicksilverActivity.A0V.get();
        String stringExtra2 = quicksilverActivity.getIntent().getStringExtra("app_id");
        if (stringExtra2 != null) {
            stringExtra2 = quicksilverActivity.A16(stringExtra2);
        }
        esP.A00(stringExtra2);
        if (4YU.A0B(quicksilverActivity).orientation == 1) {
            quicksilverActivity.A00 = 1;
        } else {
            quicksilverActivity.A00 = 11;
        }
        int intExtra = quicksilverActivity.getIntent().getIntExtra("extra_game_orientation", quicksilverActivity.A00);
        quicksilverActivity.A00 = intExtra;
        quicksilverActivity.setRequestedOrientation(intExtra);
        DKD.A0C(quicksilverActivity).setSystemUiVisibility(5894);
        quicksilverActivity.getWindow().addFlags(128);
        int i = 2132543200;
        if (quicksilverActivity.A00 == 11) {
            i = 2132543201;
        }
        quicksilverActivity.setContentView(i);
        String A15 = A15(quicksilverActivity);
        boolean A1N = A1N(quicksilverActivity);
        ((EtS) quicksilverActivity.A0T.get()).A00();
        QuicksilverIntentExtras A12 = quicksilverActivity.A12();
        C00i c00i = quicksilverActivity.A0h;
        FbD fbD = (FbD) c00i.get();
        String str = A12.A0B;
        fbD.A02 = str;
        FbD fbD2 = (FbD) c00i.get();
        String str2 = A12.A0F;
        fbD2.A04 = str2;
        FbD fbD3 = (FbD) c00i.get();
        String str3 = A12.A0M;
        fbD3.A05 = str3;
        ((FbD) c00i.get()).A01 = Boolean.valueOf(A1N);
        FHN fhn = quicksilverActivity.A0d;
        11T.A0F(fhn, 1);
        Object A03 = 1Bi.A03(83604);
        C0et c0et = C0et.A0P;
        if (A03 == c0et && (c67q = (C67Q) 1Bn.A0E(quicksilverActivity, (1BY) null, 49963)) != null && c67q.A07()) {
            1Br r0 = fhn.A00;
            if (1Br.A06(r0).AZk(36311126695283096L)) {
                String A02 = 2yD.A02(1Br.A06(r0), 36874076648767755L);
                String A022 = 2yD.A02(1Br.A06(r0), 36874076648636682L);
                if (A1S(str3, A02) || A1S(str3, A022)) {
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme("fb");
                    builder.authority(AnonymousClass000.A00(ActionId.NEW_START_FOUND));
                    builder.appendQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE, str3);
                    builder.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str2);
                    builder.appendQueryParameter("payload", str);
                    GraphQLInstantGameContextType graphQLInstantGameContextType = A12.A01;
                    if (graphQLInstantGameContextType != null) {
                        builder.appendQueryParameter("context_type", String.valueOf(graphQLInstantGameContextType));
                    }
                    builder.appendQueryParameter("context_id", A12.A08);
                    String str4 = A12.A0L;
                    if (str4 != null) {
                        builder.appendQueryParameter("play_style", str4);
                    }
                    0LS.A09(quicksilverActivity, 4YU.A09(builder.build()));
                    quicksilverActivity.finish();
                    return;
                }
            }
        }
        if (quicksilverActivity.A3E(A15, A1N)) {
            quicksilverActivity.A3B();
            return;
        }
        C00i c00i2 = quicksilverActivity.A0i;
        DKF.A0f(c00i2).A0F = false;
        quicksilverActivity.A0Y = false;
        DKF.A0f(c00i2).A0A();
        if (bundle == null) {
            if (C0D1.A01(quicksilverActivity.BDe())) {
                try {
                    DZW dzw = new DZW();
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable("param_intent_extras", A12);
                    dzw.setArguments(A05);
                    quicksilverActivity.A0E = dzw;
                    C06c A0D = 7zU.A0D(quicksilverActivity);
                    A0D.A0L(quicksilverActivity.A0E, 2131366793);
                    A0D.A04();
                } catch (IllegalArgumentException | IllegalStateException e) {
                    0fH.A0w("instant_games", "exception while setting up quicksilver activity", e);
                }
            }
            quicksilverActivity.finish();
            return;
        }
        quicksilverActivity.A0B = 7zL.A0W(quicksilverActivity);
        quicksilverActivity.A0I = 2Wo.A00((ViewStub) quicksilverActivity.A2c(2131365933));
        if (!fhn.A06()) {
            A1F(quicksilverActivity);
        }
        if (quicksilverActivity.A0U.get() == c0et) {
            0OC r02 = 0OC.A05;
            synchronized (r02) {
                0fH.A0j("MessengerExperienceStats", "recordGamesStart called");
                r02.A02 = r02.A04.now();
            }
        }
        if (fhn.A06() && (findViewById = quicksilverActivity.findViewById(2131362097)) != null) {
            findViewById.setVisibility(0);
        }
        quicksilverActivity.A0X = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x006d, code lost:
    
        if (r0.A0j == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A1F(com.facebook.quicksilver.QuicksilverActivity r301) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.QuicksilverActivity.A1F(com.facebook.quicksilver.QuicksilverActivity):void");
    }

    public static void A1G(QuicksilverActivity quicksilverActivity) {
        if (F3o.A00()) {
            Intent A0D = C3o5.A0D(quicksilverActivity, FBGamingDMAOptoutSheetActivity.class);
            A0D.putExtras(quicksilverActivity.getIntent());
            A0D.setFlags(1342242816);
            0LS.A0A(quicksilverActivity, A0D);
        }
        quicksilverActivity.finish();
    }

    public static void A1H(QuicksilverActivity quicksilverActivity) {
        long j;
        C00i c00i;
        View inflate;
        TextView A06;
        FHN fhn = quicksilverActivity.A0d;
        if (fhn.A06()) {
            if (fhn.A09(A1O(quicksilverActivity)) && ((c00i = quicksilverActivity.A06) == null || ((FHD) c00i.get()).A05 == null)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - quicksilverActivity.A01 <= 5000) {
                    C00i c00i2 = quicksilverActivity.A09;
                    if (c00i2 != null) {
                        DKF.A0c(c00i2).A0K(true);
                        A1L(quicksilverActivity, true);
                        return;
                    }
                    return;
                }
                quicksilverActivity.A01 = elapsedRealtime;
                String string = quicksilverActivity.getString(2131957127);
                if (TextUtils.isEmpty(string) || (A06 = AbF.A06((inflate = View.inflate(quicksilverActivity, 2132542082, null)), 2131364296)) == null) {
                    return;
                }
                A06.setText(string);
                Toast toast = new Toast(quicksilverActivity);
                toast.setView(inflate);
                toast.setDuration(0);
                toast.show();
                return;
            }
            DZW dzw = quicksilverActivity.A0E;
            if (dzw != null) {
                dzw.A1Z(ENU.A03);
            }
            DKG.A0p(quicksilverActivity).A04 = true;
            String str = null;
            C00i c00i3 = quicksilverActivity.A09;
            if (c00i3 != null) {
                FIT A0c = DKF.A0c(c00i3);
                synchronized (A0c) {
                    j = A0c.A01;
                }
                str = Long.toString(j);
            }
            Aak aak = quicksilverActivity.A0c;
            boolean A3E = quicksilverActivity.A3E(A15(quicksilverActivity), A1N(quicksilverActivity));
            boolean A1O = A1O(quicksilverActivity);
            11T.A0F(aak, 0);
            DZV dzv = new DZV();
            dzv.A03 = aak;
            String str2 = dzv.A04;
            if (str2 == null || str2.length() == 0) {
                dzv.A04 = str;
            }
            dzv.A06 = false;
            dzv.A07 = A3E;
            dzv.A05 = A1O;
            quicksilverActivity.A0H = dzv;
            06Z BDe = quicksilverActivity.BDe();
            quicksilverActivity.A0O = false;
            try {
                C06c A0G = 7zL.A0G(BDe);
                int i = 2131362096;
                if (fhn.A09(A1O(quicksilverActivity))) {
                    i = 2131362466;
                }
                A0G.A0L(quicksilverActivity.A0H, i);
                A0G.A04();
            } catch (IllegalStateException e) {
                AnonymousClass047 ACu = ((AnonymousClass046) quicksilverActivity.A0W.get()).ACu("instant_game_arcade_open_failure", 817893797);
                ACu.A8K("product", "instant_games");
                ACu.Cmr(e);
                ACu.report();
                quicksilverActivity.finish();
            }
        }
    }

    public static void A1I(QuicksilverActivity quicksilverActivity) {
        06Z BDe = quicksilverActivity.BDe();
        if (quicksilverActivity.A0H != null) {
            try {
                C06c A0G = 7zL.A0G(BDe);
                A0G.A0I(quicksilverActivity.A0H);
                A0G.A04();
            } catch (IllegalStateException e) {
                1BK.A09(quicksilverActivity.A0b).softReport("instant_game", "Arcade Fragment is in a bad state", e);
                quicksilverActivity.finish();
            }
        }
        DZW dzw = quicksilverActivity.A0E;
        if (dzw != null) {
            dzw.A1a(ENU.A03);
        }
        DKG.A0p(quicksilverActivity).A04 = false;
    }

    public static void A1J(QuicksilverActivity quicksilverActivity, Boolean bool) {
        if (!quicksilverActivity.A0d.A06() || quicksilverActivity.A0C == null || quicksilverActivity.A0B == null) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        quicksilverActivity.A0O = booleanValue;
        A1K(quicksilverActivity, bool, null);
        F90 f90 = (F90) quicksilverActivity.A0Q.get();
        if (f90.A01 == null) {
            f90.A01 = 1BK.A0t();
        }
        f90.A01("start_arcade_session", "game_launched");
        LithoView lithoView = quicksilverActivity.A0C;
        FGt fGt = quicksilverActivity.A0F;
        1Iw r0 = quicksilverActivity.A0B;
        boolean A1Q = AnonymousClass001.A1Q(quicksilverActivity.A00, 11);
        boolean A1O = A1O(quicksilverActivity);
        DZW dzw = quicksilverActivity.A0E;
        lithoView.A0x(fGt.A03((Dky) null, dzw != null ? dzw.A1X().A01 : null, r0, quicksilverActivity.A0c, 0, A1Q, A1O, booleanValue, A1Q(quicksilverActivity), 0S2.A01.equals(quicksilverActivity.A0G.A07), true, A1R(quicksilverActivity), A1P(quicksilverActivity)));
        ((FHD) quicksilverActivity.A06.get()).A03 = new EjM(quicksilverActivity, bool);
        ((FHD) quicksilverActivity.A06.get()).A04(4YV.A0D(quicksilverActivity));
    }

    public static void A1K(QuicksilverActivity quicksilverActivity, Boolean bool, String str) {
        Er6 er6 = quicksilverActivity.A0G.A03;
        DZW dzw = quicksilverActivity.A0E;
        if (dzw != null) {
            dzw.A1X().A01(new Fq3(quicksilverActivity, bool), quicksilverActivity.A16(er6 == null ? null : er6.A0g), quicksilverActivity.A0G.A09, str);
        }
    }

    public static void A1L(QuicksilverActivity quicksilverActivity, boolean z) {
        if (!quicksilverActivity.A0d.A06() || z) {
            super.onBackPressed();
            return;
        }
        if (((F90) quicksilverActivity.A0Q.get()).A00() == null) {
            F90 f90 = (F90) quicksilverActivity.A0Q.get();
            if (f90.A01 == null) {
                f90.A01 = 1BK.A0t();
            }
        }
        ((F90) quicksilverActivity.A0Q.get()).A01("open_arcade", "os_back_button");
        A1H(quicksilverActivity);
        A1J(quicksilverActivity, 1BK.A0d());
    }

    private void A1M(Runnable runnable) {
        if (this.A03 == null) {
            C2125Dee c2125Dee = new C2125Dee(this);
            this.A03 = c2125Dee;
            c2125Dee.A04(getResources().getString(2131957324));
        }
        this.A03.show();
        EiQ eiQ = this.A0D;
        EtM etM = new EtM(this, runnable);
        if (((1Wa) 1Bi.A03(66347)).A00()) {
            A1G(etM.A00);
            return;
        }
        FbUserSession A0E = 4YV.A0E(this);
        EuZ euZ = eiQ.A00;
        11T.A0F(A0E, 0);
        euZ.A01 = etM;
        1Br.A0D(euZ.A03, FwL.A00(euZ, 15), 7zR.A0n(euZ.A02, 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "FBGamingDMAInfo", (String) null, "fbandroid", 1023670313, 0, 4053499868L, 4053499868L, false, true))));
    }

    public static boolean A1N(QuicksilverActivity quicksilverActivity) {
        int longExtra = (int) quicksilverActivity.getIntent().getLongExtra("game_type", -1);
        boolean z = true;
        if (longExtra != 1 && longExtra != 2) {
            z = false;
        }
        return z;
    }

    public static boolean A1O(QuicksilverActivity quicksilverActivity) {
        Er6 er6;
        FAX fax = quicksilverActivity.A0G;
        boolean z = false;
        if (fax != null && (er6 = fax.A03) != null && er6.A0A == GraphQLGamesInstantPlaySupportedOrientation.LANDSCAPE) {
            z = true;
        }
        return z;
    }

    public static boolean A1P(QuicksilverActivity quicksilverActivity) {
        DZW dzw;
        Er6 er6;
        GKb gKb;
        if (!quicksilverActivity.A0K || (dzw = quicksilverActivity.A0E) == null || (er6 = quicksilverActivity.A0G.A03) == null || !er6.A0u || er6.A05 != 2 || (gKb = dzw.A0E) == null) {
            return false;
        }
        return gKb.BUH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.quicksilver.model.CloudGamingSupportedFeature, java.lang.Object] */
    public static boolean A1Q(QuicksilverActivity quicksilverActivity) {
        Er6 er6;
        ImmutableList immutableList;
        if (quicksilverActivity.A0L) {
            return true;
        }
        FAX fax = quicksilverActivity.A0G;
        if (fax == null || (er6 = fax.A03) == null || (immutableList = er6.A0H) == 0) {
            return false;
        }
        GraphQLCloudGamingSupportedFeature graphQLCloudGamingSupportedFeature = GraphQLCloudGamingSupportedFeature.TAKE_SCREENSHOT;
        ?? obj = new Object();
        obj.A00 = graphQLCloudGamingSupportedFeature;
        return immutableList.contains(obj);
    }

    public static boolean A1R(QuicksilverActivity quicksilverActivity) {
        Er6 er6 = quicksilverActivity.A0G.A03;
        boolean z = false;
        if (er6 != null && er6.A0u && er6.A05 == 2) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.List] */
    public static final boolean A1S(String str, String str2) {
        C0ty c0ty;
        if (str == null || str.length() == 0 || str2.length() == 0) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String A18 = 4YU.A18(locale, str);
        List A0U = C3o5.A0U(4YU.A18(locale, str2), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        if (!A0U.isEmpty()) {
            ListIterator A1F = AbH.A1F(A0U);
            while (A1F.hasPrevious()) {
                if (C3o5.A06(A1F) != 0) {
                    c0ty = C3o5.A0V(A0U, A1F);
                    break;
                }
            }
        }
        c0ty = C0ty.A00;
        String[] A0n = C3o5.A0n(c0ty);
        int length = A0n.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return false;
            }
            String str3 = A0n[i2];
            int length2 = str3.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length2) {
                int i4 = length2;
                if (!z) {
                    i4 = i3;
                }
                boolean A1Z = 7zT.A1Z(str3, i4);
                if (z) {
                    if (!A1Z) {
                        break;
                    }
                    length2--;
                } else if (A1Z) {
                    i3++;
                } else {
                    z = true;
                }
            }
            String obj = str3.subSequence(i3, length2 + 1).toString();
            if (obj != null && obj.length() != 0 && 0CU.A0T(A18, obj, false)) {
                return true;
            }
            i = i2 + 1;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        this.A02 = fragment;
        if (fragment instanceof DZW) {
            this.A0E = (DZW) fragment;
            getIntent();
            FbUserSession A0D = 4YV.A0D(this);
            this.A0E.A06 = new EjN(A0D, this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0H();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:5)|6|(1:10)|11|(16:15|16|17|(15:21|22|23|24|25|26|27|28|29|30|31|32|(2:34|184)|59|60)|68|25|26|27|28|29|30|31|32|(0)|59|60)|71|17|(16:19|21|22|23|24|25|26|27|28|29|30|31|32|(0)|59|60)|68|25|26|27|28|29|30|31|32|(0)|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0124, code lost:
    
        r310 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        com.facebook.breakpad.BreakpadManager.setCustomData("historical_instant_games", r309.toString(), X.AnonymousClass001.A1Z());
        com.facebook.breakpad.BreakpadManager.removeCustomData("current_instant_game");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
    
        throw r310;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2l() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.QuicksilverActivity.A2l():void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        if (!this.A0M || !1Br.A07(F3o.A00).AZk(36322001551901690L)) {
            if (!this.A0X) {
                return;
            }
            if (!this.A0Y) {
                G2j g2j = new G2j(intent, this);
                if (1Br.A07(F3o.A00).AZk(2342165010765267961L)) {
                    A1M(g2j);
                    return;
                } else {
                    A3C(intent);
                    return;
                }
            }
        }
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        getIntent();
        boolean booleanExtra = getIntent().getBooleanExtra("skip_consent_check_for_orientation_recreation", false);
        G2h g2h = new G2h(bundle, this);
        A15(this);
        A1N(this);
        if (!1Br.A07(F3o.A00).AZk(2342165010765267961L) || booleanExtra) {
            this.A0J = g2h;
            getIntent().removeExtra("skip_consent_check_for_orientation_recreation");
            A1D(bundle, this);
        } else {
            this.A0M = true;
            getIntent().removeExtra("skip_consent_check_for_orientation_recreation");
            A1M(g2h);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A07 = AbF.A0Q(this, 98386);
        this.A0Q = AbF.A0Q(this, 98381);
        this.A0F = (FGt) 1Bn.A0A(98401);
        this.A0V = 1BV.A00(98369);
        this.A0U = 1BQ.A02(83604);
        this.A05 = 7zL.A0R(this, 98328);
        this.A0A = 1BV.A00(16430);
        this.A0R = AbH.A0Z();
        this.A0P = AbF.A0Q(this, 98387);
        this.A0W = 1BV.A00(16669);
        1HH A0Q = AbF.A0Q(this, 82751);
        this.A0S = A0Q;
        this.A09 = DKG.A0R(this);
        this.A08 = AbF.A0Q(this, 98354);
        this.A0T = AbF.A0Q(this, 98398);
        this.A06 = AbF.A0Q(this, 98400);
        this.A0G = ((F6C) A0Q.get()).A00;
        EpS epS = (EpS) this.A0f.get();
        Efo efo = new Efo(this);
        if (!epS.A05) {
            String A0t = 1BK.A0t();
            FFa fFa = (FFa) epS.A04.get();
            Integer num = 0S2.A0W;
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("entrypoint", "QuicksilverActivity");
            A0u.put("is_loaded", String.valueOf(epS.A05));
            fFa.A02(num, ConstantsKt.CAMERA_ID_FRONT, (String) null, A0t, (String) null, (Throwable) null, A0u);
            2vD A00 = ((C2v7) epS.A01.get()).A00(2vC.A03);
            A00.A02("cgnativeplayer");
            A00.A01().A05(new FsH(epS, efo, A0t, 1), 1BK.A1E(epS.A02));
        }
        F5Y f5y = (F5Y) this.A0g.get();
        2vD A002 = ((C2v7) f5y.A01.get()).A00(2vC.A03);
        A002.A02("instantgamesads");
        A002.A01().A05(new FsG(f5y, 0), 1BK.A1E(f5y.A02));
        FbD fbD = (FbD) this.A0h.get();
        if (fbD.A06) {
            return;
        }
        ((5TL) 1Br.A0B(fbD.A07)).A04.A03(fbD);
        fbD.A06 = true;
    }

    public void A3B() {
        C00i c00i = this.A0i;
        DKF.A0f(c00i).A0F = true;
        DKF.A0f(c00i).A02 = 7zL.A14(this);
        this.A0Y = true;
        Intent A0D = C3o5.A0D(this, QuicksilverWebviewService.class);
        A0D.putExtra("quicksilver_intent", A12());
        try {
            0LS.A00(this, A0D);
        } catch (Exception e) {
            DKG.A0p(this).A0I("webview_service_start_fail", "Webview service start exception", e);
            finish();
        }
        this.A0X = true;
    }

    public void A3C(Intent intent) {
        String A16;
        setIntent(intent);
        String stringExtra = getIntent().getStringExtra("app_id");
        if (stringExtra != null) {
            stringExtra = A16(stringExtra);
        }
        Er6 er6 = this.A0G.A03;
        if (er6 != null && (A16 = A16(er6.A0g)) != null && A16.equals(stringExtra)) {
            Integer num = 0S2.A0C;
            FAX fax = this.A0G;
            if (!num.equals(fax.A07) && fax.A03.A0u) {
                return;
            }
        }
        try {
            Fragment A0Y = BDe().A0Y(2131366793);
            if (A0Y != null) {
                C06c A0D = 7zU.A0D(this);
                A0D.A0I(A0Y);
                A0D.A04();
            }
            06Z BDe = BDe();
            int i = 2131362096;
            if (this.A0d.A09(A1O(this))) {
                i = 2131362466;
            }
            Fragment A0Y2 = BDe.A0Y(i);
            if (A0Y2 != null) {
                C06c A0D2 = 7zU.A0D(this);
                A0D2.A0I(A0Y2);
                A0D2.A04();
            }
            QuicksilverIntentExtras A12 = A12();
            DZW dzw = new DZW();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("param_intent_extras", A12);
            dzw.setArguments(A05);
            this.A0E = dzw;
            C06c A0D3 = 7zU.A0D(this);
            A0D3.A0L(this.A0E, 2131366793);
            A0D3.A04();
            BDe().A0t();
        } catch (IllegalArgumentException | IllegalStateException e) {
            0fH.A0w("instant_games", "exception while restarting quicksilver fragment", e);
            finish();
        }
        getIntent();
        ((EsP) this.A0V.get()).A00(stringExtra);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r308 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A3D(int r302, long r303) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.QuicksilverActivity.A3D(int, long):boolean");
    }

    public boolean A3E(String str, boolean z) {
        if (str == null || z) {
            return false;
        }
        String stringExtra = getIntent().getStringExtra(Property.SYMBOL_Z_ORDER_SOURCE);
        Boolean valueOf = Boolean.valueOf("fb_reels".equals(stringExtra));
        if (stringExtra != null) {
            String[] split = stringExtra.split("%7E");
            if (split.length > 1 && "reels".equals(split[1])) {
                valueOf = true;
            }
        }
        boolean equals = "ar_game_story_cta".equals(stringExtra);
        if (valueOf.booleanValue() || equals) {
            return true;
        }
        FHN fhn = this.A0d;
        boolean equals2 = str.equals("");
        if (!equals2 && 0CU.A0T(2yD.A02(1Br.A06(fhn.A00), 36874093876150548L), str, false)) {
            return false;
        }
        this.A0R.get();
        if (!equals2) {
            String BDB = 1Br.A06(fhn.A00).BDB(1GD.A07, 36874093871169806L);
            11T.A0A(BDB);
            if (0CU.A0T(BDB, str, false)) {
                return false;
            }
        }
        this.A0R.get();
        return false;
    }

    @Override // X.GE5
    public /* synthetic */ boolean ANL() {
        return false;
    }

    public String AWg() {
        1lN r0 = this.A02;
        return r0 instanceof 1lN ? r0.AWg() : "instant_game_player";
    }

    public Long Am7() {
        1lN r0 = this.A02;
        if (r0 instanceof 1lN) {
            return r0.Am7();
        }
        return 216762292783668L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (findViewById(2131366792) != null && !this.A0M) {
            DZW dzw = this.A0E;
            if (dzw != null) {
                if (!dzw.A0M) {
                    if (dzw.getContext() != null && dzw.A0e.get() != null) {
                        DZW dzw2 = this.A0E;
                        Eq8 eq8 = dzw2.getContext() == null ? null : (Eq8) dzw2.A0e.get();
                        DQk dQk = eq8.A01;
                        if (dQk != null && dQk.getVisibility() == 0) {
                            DQk dQk2 = eq8.A01;
                            if (dQk2 != null && eq8.A00 != null) {
                                1Br.A0C(eq8.A03);
                                FHq.A03(dQk2, eq8, 2);
                            }
                            Efp efp = eq8.A00;
                            if (efp != null) {
                                FragmentActivity activity = efp.A00.getActivity();
                                if (activity instanceof QuicksilverActivity) {
                                    A1L((QuicksilverActivity) activity, true);
                                }
                            }
                            Efp efp2 = eq8.A00;
                            if (efp2 != null) {
                                efp2.A00.A1b(0S2.A0c);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            06Z BDe = BDe();
            int i = 2131362096;
            if (this.A0d.A09(A1O(this))) {
                i = 2131362466;
            }
            if (BDe.A0Y(i) == null) {
                A1L(this, false);
                return;
            }
            ((F90) this.A0Q.get()).A01("resume_game", "os_back_button");
            A1I(this);
            A1J(this, AnonymousClass001.A0K());
            return;
        }
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(2057313258);
        super.onPause();
        DKD.A0C(this).setOnSystemUiVisibilityChangeListener(null);
        0FI.A07(-383288469, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (Build.VERSION.SDK_INT < 35 || getApplicationInfo().targetSdkVersion < 35 || getWindow() == null) {
            return;
        }
        1tJ.A06(getWindow(), getColor(2132214622));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        DZW dzw;
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean z = true;
        if (i != 1 || (dzw = this.A0E) == null) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            z = false;
        }
        this.A0K = z;
        boolean z2 = this.A0N;
        GKb gKb = dzw.A0E;
        if (gKb != null) {
            gKb.Cqq(z2);
        }
        DZW.A0B(this.A0E);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1212656621);
        super.onResume();
        if (this.A0d.A06()) {
            ((FHD) this.A06.get()).A04(4YV.A0D(this));
        }
        DKD.A0C(this).setOnSystemUiVisibilityChangeListener(this.A0Z);
        0FI.A07(1685317706, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-2136539780);
        super.onStart();
        0FI.A07(1392394466, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(717874187);
        C00i c00i = this.A06;
        if (c00i != null && c00i.get() != null) {
            ((FHD) this.A06.get()).A03();
        }
        super.onStop();
        0FI.A07(2068215956, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            DKD.A0C(this).setSystemUiVisibility(5894);
        }
    }
}
