package com.facebook.messaging.browser;

import X.04J;
import X.08O;
import X.09X;
import X.0CU;
import X.0CV;
import X.0D7;
import X.0DA;
import X.0Df;
import X.0FI;
import X.0LS;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Ex;
import X.1Fv;
import X.1Fw;
import X.1G2;
import X.1G3;
import X.1GU;
import X.1Hv;
import X.1I7;
import X.1Kd;
import X.1Od;
import X.1Ql;
import X.1ZG;
import X.1pK;
import X.20O;
import X.2CU;
import X.3zS;
import X.4YT;
import X.4YU;
import X.4YV;
import X.5TL;
import X.5Yu;
import X.69J;
import X.7zN;
import X.7zP;
import X.7zT;
import X.7zU;
import X.AbF;
import X.AbG;
import X.AbL;
import X.AbM;
import X.AbR;
import X.AbstractC00603o4;
import X.AbstractC01593ro;
import X.AnonymousClass001;
import X.C00i;
import X.C01s;
import X.C06c;
import X.C0A2;
import X.C0s8;
import X.C1AJ;
import X.C1cx;
import X.C1lM;
import X.C2050DaD;
import X.C2rm;
import X.C3254Jnr;
import X.C3255Jns;
import X.C3256Jnt;
import X.C3o5;
import X.C48s;
import X.C4O;
import X.C4O5;
import X.C4v;
import X.C5id;
import X.C5ua;
import X.C5ub;
import X.C5ud;
import X.C5ue;
import X.DGV;
import X.DKB;
import X.DKC;
import X.DKD;
import X.EPO;
import X.EUa;
import X.Ebt;
import X.EcF;
import X.EhN;
import X.EpJ;
import X.Exk;
import X.F6F;
import X.FFj;
import X.Fax;
import X.Fw1;
import X.Fwu;
import X.G6w;
import X.GOm;
import X.GOq;
import X.HnO;
import X.IMd;
import X.JQy;
import X.JTB;
import X.KOk;
import X.KOz;
import X.KSV;
import X.KWF;
import X.KWG;
import X.Kak;
import X.Kis;
import X.Kk4;
import X.Kl0;
import X.Km7;
import X.Km8;
import X.Koj;
import X.KpF;
import X.Kpm;
import X.KqW;
import X.KxJ;
import X.KzA;
import X.L04;
import X.L0l;
import X.L1z;
import X.L4p;
import X.L5x;
import X.L7l;
import X.LXr;
import X.Ley;
import X.LnY;
import X.LpU;
import X.LyX;
import X.Lyc;
import X.MFA;
import X.MIJ;
import X.MIS;
import X.MMa;
import X.MNu;
import X.Qyp;
import X.RDn;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.view.MotionEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.IsUrlSavedCallback;
import com.facebook.browser.lite.ipc.MoreInfoCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.browserextensions.ipc.GetUserIDJSBridgeCall;
import com.facebook.browserextensions.ipc.HasCapabilityJSBridgeCall;
import com.facebook.browserextensions.ipc.ProcessPaymentJSBridgeCall;
import com.facebook.browserextensions.ipc.RequestAuthorizedCredentialsJSBridgeCall;
import com.facebook.browserextensions.ipc.RequestCloseBrowserJSBridgeCall;
import com.facebook.browserextensions.ipc.RequestCredentialsJSBridgeCall;
import com.facebook.browserextensions.ipc.commerce.PurchaseCompleteJSBridgeCall;
import com.facebook.browserextensions.ipc.commerce.ResetCartJSBridgeCall;
import com.facebook.browserextensions.ipc.commerce.UpdateCartJSBridgeCall;
import com.facebook.browserextensions.ipc.login.ShowLoginDialogJSBridgeCall;
import com.facebook.browserextensions.ipc.messengerplatform.GetContextJSBridgeCall;
import com.facebook.browserextensions.ipc.messengerplatform.GetEnvironmentJSBridgeCall;
import com.facebook.browserextensions.ipc.messengerplatform.GetSupportedFeaturesJSBridgeCall;
import com.facebook.browserextensions.ipc.messengerplatform.GetVersionJSBridgeCall;
import com.facebook.browserextensions.ipc.messengerplatform.permission.AskPermissionJSBridgeCall;
import com.facebook.browserextensions.ipc.messengerplatform.permission.GetGrantedPermissionsJSBridgeCall;
import com.facebook.browserextensions.ipc.payments.CanMakePaymentJSBridgeCall;
import com.facebook.browserextensions.ipc.payments.PaymentsChargeRequestCall;
import com.facebook.browserextensions.ipc.payments.PaymentsCheckoutJSBridgeCall;
import com.facebook.browserextensions.ipc.payments.PaymentsShippingChangeCall;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.GetUserContextJSBridgeCall;
import com.facebook.businessextension.jscalls.InitJSBridgeCall;
import com.facebook.businessextension.jscalls.InitJSBridgeCallData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.facebook.iabeventlogging.model.IABCopyLinkEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABFirstPauseEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.iabeventlogging.model.IABOpenExternalEvent;
import com.facebook.iabeventlogging.model.IABWebviewEndEvent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2m.asynccontroller.asyncControllerActivity;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.google.common.base.Platform;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: MessengerBrowserLiteCallbackService.class */
public final class MessengerBrowserLiteCallbackService extends C2rm {
    public static final String A0L = 0Pz.A0W("fb-messenger", "://closeWindow");
    public 1I7 A00;
    public KSV A01;
    public AbR A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public DummyBrowserActivity A07;
    public Set A08;
    public final L7l A0J = new L7l(this);
    public final Km7 A0D = (Km7) 1Bi.A03(98445);
    public final F6F A0C = (F6F) 1Bi.A03(100034);
    public final 2CU A0B = (2CU) 1Bi.A03(16939);
    public final 3zS A09 = (3zS) 1Bi.A03(32846);
    public final 1Br A0F = 1Bq.A00(100014);
    public final 1Od A0E = (1Od) 1Bi.A03(16616);
    public final 04J A0A = (04J) 1Bi.A03(16634);
    public final 1Br A0H = 1BK.A0C();
    public final C1AJ A0K = new Object();
    public final 1Br A0G = 1Bq.A00(16511);
    public final Koj A0I = new Koj(this);

    /* loaded from: MessengerBrowserLiteCallbackService$BrowserLiteCallbackImpl.class */
    public final class BrowserLiteCallbackImpl extends BrowserLiteCallback.Stub {
        public Km8 A00;
        public Kl0 A01;
        public String A02;
        public String A03;
        public String A04;
        public boolean A05;

        public BrowserLiteCallbackImpl() {
            0FI.A09(1309637067, 0FI.A03(-575371703));
        }

        public BrowserLiteCallbackImpl() {
            this();
            0FI.A09(-993181316, 0FI.A03(-211351327));
        }

        private final ZonePolicy A03(Bundle bundle) {
            int A03 = 0FI.A03(-647014581);
            ZonePolicy zonePolicy = (bundle == null || bundle.getBoolean("Tracking.ENABLED", true)) ? ZonePolicy.A03 : ZonePolicy.A0C;
            0FI.A09(-1369645396, A03);
            return zonePolicy;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:43:0x01a0. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void A04(Bundle bundle, IABEvent iABEvent, BrowserLiteCallbackImpl browserLiteCallbackImpl) {
            String str;
            int i;
            0D7 A08;
            String A00;
            String str2;
            IABEvent iABEvent2;
            IABLandingPageFinishedEvent iABLandingPageFinishedEvent;
            IABLandingPageFinishedEvent iABLandingPageFinishedEvent2;
            IABEvent iABEvent3 = iABEvent;
            int A03 = 0FI.A03(839367952);
            if (11T.A0O(IABEvent.A04, iABEvent)) {
                i = 2115719597;
            } else {
                String str3 = null;
                if (bundle != null) {
                    str = bundle.getString("tracking_codes");
                    str3 = bundle.getString("BrowserLiteIntent.MessengerExtras.EXTRA_SOURCE_TYPE");
                } else {
                    str = null;
                }
                String A002 = DKB.A00(255);
                if (str3 != null && !str3.equalsIgnoreCase("null") && !str3.equalsIgnoreCase(C5id.A10.toString())) {
                    1ZG r313 = str == null ? 1ZG.A01 : 1ZG.A02;
                    MessengerBrowserLiteCallbackService messengerBrowserLiteCallbackService = MessengerBrowserLiteCallbackService.this;
                    KSV ksv = messengerBrowserLiteCallbackService.A01;
                    if (ksv != null) {
                        boolean z = false;
                        if (ksv.A00) {
                            KOk kOk = iABEvent3.A02;
                            int ordinal = kOk.ordinal();
                            if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                                z = true;
                            }
                            0fH.A0V(kOk, KSV.class, "iabEvent.type %s; shouldSkipLogging  %s", Boolean.valueOf(z));
                            if (z) {
                                i = -1987798040;
                            }
                        }
                        if (bundle == null) {
                            1Br.A04(messengerBrowserLiteCallbackService.A0G).D0v(A002, "null tracking object when logging IAB events.");
                            i = 1879651248;
                        } else {
                            boolean z2 = bundle.getBoolean("Tracking.ENABLED", false);
                            L7l l7l = messengerBrowserLiteCallbackService.A0J;
                            KSV ksv2 = messengerBrowserLiteCallbackService.A01;
                            if (ksv2 != null) {
                                Km7 km7 = messengerBrowserLiteCallbackService.A0D;
                                Koj koj = messengerBrowserLiteCallbackService.A0I;
                                7zP.A1L(r313, 2, km7);
                                11T.A0F(koj, 7);
                                if (z2) {
                                    switch (iABEvent3.A02.ordinal()) {
                                        case 0:
                                            IABWebviewEndEvent iABWebviewEndEvent = (IABWebviewEndEvent) iABEvent3;
                                            ArrayList A0s = AnonymousClass001.A0s();
                                            Iterator it = iABWebviewEndEvent.A0a.iterator();
                                            while (it.hasNext()) {
                                                AbstractList abstractList = (AbstractList) it.next();
                                                A0s.add(C0s8.A14(Double.valueOf(AnonymousClass001.A05(abstractList.get(0))), Double.valueOf(AnonymousClass001.A05(abstractList.get(1)))));
                                            }
                                            0DA r0 = new 0DA();
                                            Double valueOf = Double.valueOf(iABWebviewEndEvent.A0D);
                                            r0.A04("js_based_dom_loaded_event_ts", valueOf);
                                            Double valueOf2 = Double.valueOf(iABWebviewEndEvent.A0H);
                                            r0.A04("loading_finished_ts", valueOf2);
                                            r0.A04("estimated_progress_finished_ts", Double.valueOf(iABWebviewEndEvent.A0E));
                                            r0.A04("content_size_changed_ts", Double.valueOf(iABWebviewEndEvent.A0C));
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_webview_end"), ActionId.SERVICE_ON_START_COMMAND);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABWebviewEndEvent);
                                                A08.A0E("click_source", str3);
                                                A07(A08, Double.valueOf(iABWebviewEndEvent.A0M), "user_click_ts");
                                                A07(A08, Double.valueOf(iABWebviewEndEvent.A0A), "browser_open_ts");
                                                String str4 = iABWebviewEndEvent.A0Z;
                                                if (ksv2.A00 && str4 != null) {
                                                    0fH.A0V(str4, KSV.class, "getEpdCompliantValue  originalValue %s ; modifiedValue %s", "[Sanitized for ePD Compliance]");
                                                    str4 = "[Sanitized for ePD Compliance]";
                                                }
                                                A08.A0E("initial_land_url", koj.A00(str4));
                                                A06(A08, koj, iABWebviewEndEvent.A0P);
                                                A07(A08, Double.valueOf(iABWebviewEndEvent.A0N), "web_request_started_ts");
                                                A08.A0F("background_time_pairs", A0s);
                                                A07(A08, valueOf, "landing_page_dom_content_loaded_ts");
                                                A08.A0A(r0, "landing_page_loading_stages");
                                                A08.A0D("scroll_ready_ts", Long.valueOf(iABWebviewEndEvent.A0L));
                                                A07(A08, valueOf2, "landing_page_loaded_ts");
                                                A07(A08, Double.valueOf(iABWebviewEndEvent.A0J), "landing_page_end_view_ts");
                                                A07(A08, Double.valueOf(iABWebviewEndEvent.A09), "browser_close_ts");
                                                A08.A0D("interaction_count", 1BK.A0l(iABWebviewEndEvent.A03));
                                                A08.A0E("browser_user_agent", iABWebviewEndEvent.A0T);
                                                A08.A0D("landing_page_status_code", 1BK.A0l(iABWebviewEndEvent.A05));
                                                A08.A0D("ssl_error_code", 1BK.A0l(iABWebviewEndEvent.A06));
                                                A08.A0D("dismiss_method", 1BK.A0l(iABWebviewEndEvent.A02));
                                                A07(A08, Double.valueOf(((IABEvent) iABWebviewEndEvent).A01), "event_ts");
                                                A08.A0B("initial_url_is_open_app", Boolean.valueOf(iABWebviewEndEvent.A0j));
                                                A08.A0E(AbstractC00603o4.A00(56), koj.A00(iABWebviewEndEvent.A0V));
                                                A08.A0E("tracking_token", str);
                                                A08.A0B("google_oauth2_encountered", Boolean.valueOf(iABWebviewEndEvent.A0f));
                                                A08.A0B("google_oauth2_error_encountered", Boolean.valueOf(iABWebviewEndEvent.A0g));
                                                A08.A0B("google_oauth2_is_redirect_url_schema_storagerelay", Boolean.valueOf(iABWebviewEndEvent.A0i));
                                                A08.A0B("e2ee_black_hole_enforcement_unsafe_browsing_encountered", Boolean.valueOf(iABWebviewEndEvent.A0d));
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 1:
                                            IABLaunchEvent iABLaunchEvent = (IABLaunchEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_launch"), ActionId.APPLY_FINISHED_LIST);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABLaunchEvent);
                                                A08.A0E("click_source", str3);
                                                A06(A08, koj, iABLaunchEvent.A03);
                                                A07(A08, Double.valueOf(iABLaunchEvent.A01), "user_click_ts");
                                                iABEvent2 = iABLaunchEvent;
                                                A07(A08, Double.valueOf(iABEvent2.A01), "event_ts");
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            IABLandingPageStartedEvent iABLandingPageStartedEvent = (IABLandingPageStartedEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_landing_page_started"), ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABLandingPageStartedEvent);
                                                A06(A08, koj, iABLandingPageStartedEvent.A00);
                                                iABEvent2 = iABLandingPageStartedEvent;
                                                A07(A08, Double.valueOf(iABEvent2.A01), "event_ts");
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 3:
                                            IABLandingPageInteractiveEvent iABLandingPageInteractiveEvent = (IABLandingPageInteractiveEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_landing_page_interactive"), 150);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABLandingPageInteractiveEvent);
                                                A06(A08, koj, iABLandingPageInteractiveEvent.A02);
                                                A07(A08, Double.valueOf(((IABEvent) iABLandingPageInteractiveEvent).A01), "event_ts");
                                                A08.A0D(4YT.A00(179), 1BK.A0l(iABLandingPageInteractiveEvent.A01));
                                                A08.A0D("page_content_width", 1BK.A0l(iABLandingPageInteractiveEvent.A00));
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 4:
                                            IABLandingPageFinishedEvent iABLandingPageFinishedEvent3 = (IABLandingPageFinishedEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_landing_page_finished"), ActionId.PRIVACY_VIOLATION);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABLandingPageFinishedEvent3);
                                                A06(A08, koj, iABLandingPageFinishedEvent3.A00);
                                                String str5 = iABLandingPageFinishedEvent3.A01;
                                                if (ksv2.A00 && str5 != null) {
                                                    0fH.A0V(str5, KSV.class, "getEpdCompliantValue  originalValue %s ; modifiedValue %s", "[Sanitized for ePD Compliance]");
                                                    str5 = "[Sanitized for ePD Compliance]";
                                                }
                                                A00 = koj.A00(str5);
                                                str2 = "initial_land_url";
                                                iABLandingPageFinishedEvent = iABLandingPageFinishedEvent3;
                                                A08.A0E(str2, A00);
                                                iABEvent2 = iABLandingPageFinishedEvent;
                                                A07(A08, Double.valueOf(iABEvent2.A01), "event_ts");
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 5:
                                            IABLandingPageViewEndedEvent iABLandingPageViewEndedEvent = (IABLandingPageViewEndedEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_landing_page_view_ended"), ActionId.APPLY_OPTIMISTICS);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABLandingPageViewEndedEvent);
                                                A06(A08, koj, iABLandingPageViewEndedEvent.A00);
                                                iABEvent2 = iABLandingPageViewEndedEvent;
                                                A07(A08, Double.valueOf(iABEvent2.A01), "event_ts");
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 6:
                                            IABOpenExternalEvent iABOpenExternalEvent = (IABOpenExternalEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_open_external"), ActionId.APPLY_FINISHED_LIST_AGAIN);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABOpenExternalEvent);
                                                A08.A0E("reason", iABOpenExternalEvent.A00);
                                                A00 = koj.A00(iABOpenExternalEvent.A01);
                                                iABLandingPageFinishedEvent2 = iABOpenExternalEvent;
                                                str2 = "target_url";
                                                iABLandingPageFinishedEvent = iABLandingPageFinishedEvent2;
                                                A08.A0E(str2, A00);
                                                iABEvent2 = iABLandingPageFinishedEvent;
                                                A07(A08, Double.valueOf(iABEvent2.A01), "event_ts");
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 7:
                                            IABCopyLinkEvent iABCopyLinkEvent = (IABCopyLinkEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_copy_link"), ActionId.FILE_SYSTEM_FAIL);
                                            if (4YU.A1X(A08)) {
                                                A00 = koj.A00(iABCopyLinkEvent.A00);
                                                if (A00 == null) {
                                                    A00 = "";
                                                }
                                                A05(A08, iABCopyLinkEvent);
                                                iABLandingPageFinishedEvent2 = iABCopyLinkEvent;
                                                str2 = "target_url";
                                                iABLandingPageFinishedEvent = iABLandingPageFinishedEvent2;
                                                A08.A0E(str2, A00);
                                                iABEvent2 = iABLandingPageFinishedEvent;
                                                A07(A08, Double.valueOf(iABEvent2.A01), "event_ts");
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 8:
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), "iab_open_menu"), ActionId.FUTURE_LISTENERS_COMPLETE);
                                            if (4YU.A1X(A08)) {
                                                A05(A08, iABEvent3);
                                                iABEvent2 = iABEvent3;
                                                A07(A08, Double.valueOf(iABEvent2.A01), "event_ts");
                                                A08.A0E("tracking_token", str);
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        default:
                                            throw AnonymousClass001.A0q("encountered unsupported IABEvent");
                                        case 13:
                                            IABFirstPauseEvent iABFirstPauseEvent = (IABFirstPauseEvent) iABEvent3;
                                            A08 = AbF.A08(AbG.A0A(r313, 1Br.A02(l7l.A00), 1BJ.A00(1413)), ActionId.FORMAT_ERROR);
                                            if (4YU.A1X(A08)) {
                                                String str6 = ((IABEvent) iABFirstPauseEvent).A03;
                                                A08.A0E("iab_session_id", str6);
                                                A08.A0E("click_source", str3);
                                                A07(A08, Double.valueOf(iABFirstPauseEvent.A0D), "user_click_ts");
                                                A07(A08, Double.valueOf(iABFirstPauseEvent.A05), "browser_open_ts");
                                                String str7 = iABFirstPauseEvent.A0I;
                                                if (ksv2.A00 && str7 != null) {
                                                    0fH.A0V(str7, KSV.class, "getEpdCompliantValue  originalValue %s ; modifiedValue %s", "[Sanitized for ePD Compliance]");
                                                    str7 = "[Sanitized for ePD Compliance]";
                                                }
                                                A08.A0E("initial_land_url", koj.A00(str7));
                                                A06(A08, koj, iABFirstPauseEvent.A0F);
                                                A07(A08, Double.valueOf(iABFirstPauseEvent.A0E), "web_request_started_ts");
                                                A07(A08, Double.valueOf(iABFirstPauseEvent.A06), "landing_page_dom_content_loaded_ts");
                                                A08.A0D("scroll_ready_ts", Long.valueOf(iABFirstPauseEvent.A0C));
                                                A07(A08, Double.valueOf(iABFirstPauseEvent.A09), "landing_page_loaded_ts");
                                                A07(A08, Double.valueOf(iABFirstPauseEvent.A0A), "landing_page_end_view_ts");
                                                A07(A08, Double.valueOf(iABFirstPauseEvent.A04), "browser_close_ts");
                                                A08.A0D("interaction_count", 1BK.A0l(iABFirstPauseEvent.A01));
                                                A08.A0D("landing_page_status_code", 1BK.A0l(iABFirstPauseEvent.A02));
                                                A08.A0D("ssl_error_code", 1BK.A0l(iABFirstPauseEvent.A03));
                                                A08.A0D("dismiss_method", 1BK.A0l(iABFirstPauseEvent.A00));
                                                A07(A08, Double.valueOf(((IABEvent) iABFirstPauseEvent).A01), "event_ts");
                                                A08.A0B("initial_url_is_open_app", Boolean.valueOf(iABFirstPauseEvent.A0K));
                                                A08.A0E(AbstractC00603o4.A00(56), koj.A00(iABFirstPauseEvent.A0H));
                                                A08.A0E("tracking_token", str);
                                                A08.A0B("should_use_ledesign", Boolean.valueOf(iABFirstPauseEvent.A0L));
                                                11T.A09(str6);
                                                A08.A0E(1BJ.A00(344), AnonymousClass001.A0b(str6, km7.A02));
                                                A08.BZL();
                                                break;
                                            }
                                            break;
                                    }
                                }
                                i = -1677272200;
                            }
                        }
                    }
                    11T.A0L("epdPolicyEnforcer");
                    throw 0Q8.createAndThrow();
                }
                1Br.A04(MessengerBrowserLiteCallbackService.this.A0G).D0v(A002, 0Pz.A0W("Received IAB events for messenger with invalid clickSource=", str3));
                i = 468793789;
            }
            0FI.A09(i, A03);
        }

        public static void A05(0D7 r301, IABEvent iABEvent) {
            r301.A0E("iab_session_id", iABEvent.A03);
        }

        public static void A06(0D7 r301, Koj koj, ZonedValue zonedValue) {
            r301.A0E(DKB.A00(ActionId.ON_VIEW_CREATED_END), koj.A00((String) zonedValue.A01));
        }

        public static void A07(0D7 r301, Double d, String str) {
            r301.A00.A5Z(str, d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
        
            if (X.1Br.A07(r301.A06.A0H).AZk(36315962827875938L) == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean A08() {
            /*
                r301 = this;
                r0 = 1514522404(0x5a45c724, float:1.3917382E16)
                r302 = r0
                r0 = r302
                int r0 = X.0FI.A03(r0)
                r303 = r0
                X.5ue r0 = X.C5ub.A00
                r304 = r0
                r0 = r304
                if (r0 != 0) goto L15
                X.5ud r0 = X.C5ud.A00
                r304 = r0
            L15:
                r0 = r304
                boolean r0 = r0.isEnabled()
                r302 = r0
                r0 = r302
                if (r0 == 0) goto L44
                r0 = r301
                com.facebook.messaging.browser.MessengerBrowserLiteCallbackService r0 = com.facebook.messaging.browser.MessengerBrowserLiteCallbackService.this
                X.1Br r0 = r0.A0H
                r304 = r0
                r0 = r304
                X.2yD r0 = X.1Br.A07(r0)
                r305 = r0
                r0 = 36315962827875938(0x81052d00082662, double:3.029699352769047E-306)
                r306 = r0
                r0 = r305
                r1 = r306
                boolean r0 = r0.AZk(r1)
                r302 = r0
                r0 = 1
                r308 = r0
                r0 = r302
                if (r0 != 0) goto L47
            L44:
                r0 = 0
                r308 = r0
            L47:
                r0 = 1260119314(0x4b1be512, float:1.0216722E7)
                r1 = r303
                X.0FI.A09(r0, r1)
                r0 = r308
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.browser.MessengerBrowserLiteCallbackService.BrowserLiteCallbackImpl.A08():boolean");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Type inference failed for: r0v225, types: [com.facebook.messaging.browser.MessengerBrowserLiteCallbackService, android.content.Context] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void ACb(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
            Km8 km8;
            C01s A09;
            String str2;
            String str3;
            KOz kOz;
            ArrayList A03;
            1G2 A00;
            String str4;
            Km8 km82;
            int A032 = 0FI.A03(-367579902);
            11T.A0H(str, map);
            switch (str.hashCode()) {
                case -2124883230:
                    if (str.equals("INTEGRITY_LOGGER")) {
                        MessengerBrowserLiteCallbackService messengerBrowserLiteCallbackService = MessengerBrowserLiteCallbackService.this;
                        boolean z = false;
                        if (bundle != null) {
                            z = bundle.getBoolean("Tracking.ENABLED", false);
                        }
                        L7l l7l = messengerBrowserLiteCallbackService.A0J;
                        ZonePolicy zonePolicy2 = null;
                        if (zonePolicy != null) {
                            C00i c00i = l7l.A02.A00;
                            if (!1BK.A0M(c00i).AZk(36315962827941475L) || !1BK.A0M(c00i).AZk(36315962827875938L)) {
                                zonePolicy = null;
                            }
                            zonePolicy2 = zonePolicy;
                        }
                        Kpm kpm = new Kpm(l7l, map, z);
                        11T.A0F(KxJ.A00, 2);
                        if (zonePolicy2 == null) {
                            kpm.A00();
                        } else {
                            try {
                                C5ua.A00(new LXr(kpm, 1), zonePolicy2);
                            } catch (C48s unused) {
                            }
                        }
                    }
                    0FI.A09(-1752158579, A032);
                case -1667028512:
                    if (str.equals("AUTOFILL_BAR_ACCEPTED") && (km82 = this.A00) != null) {
                        BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) map.get("autofill_accepted_value");
                        Object obj = map.get("autofill_callback_id");
                        if (browserExtensionsAutofillData != null && obj != null) {
                            L0l l0l = km82.A02;
                            Iterator it = l0l.A05.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A09 = 1BK.A09(l0l.A04);
                                    str2 = "BrowserExtensionsJSBridge";
                                    str3 = "Request autofill handler not found for callback";
                                    break;
                                } else {
                                    MIJ mij = (MIJ) it.next();
                                    if (mij instanceof C3255Jns) {
                                        C3255Jns c3255Jns = (C3255Jns) mij;
                                        Qyp.A00();
                                        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = c3255Jns.A01;
                                        if (requestAutofillJSBridgeCall == null || requestAutofillJSBridgeCall.Aaz() == null || !c3255Jns.A01.Aaz().equals(obj)) {
                                            A09 = 1BK.A09(c3255Jns.A06);
                                            str2 = "RequestAutofillJSBridgeCallHandler";
                                            str3 = "Autofill callback ID does not match";
                                            break;
                                        } else {
                                            JSONObject A12 = AnonymousClass001.A12();
                                            try {
                                                Iterator A0x = AnonymousClass001.A0x(browserExtensionsAutofillData.A02());
                                                while (A0x.hasNext()) {
                                                    AbL.A19(A0x, A12);
                                                }
                                            } catch (JSONException e) {
                                                1BK.A09(c3255Jns.A06).softReport("RequestAutofillJSBridgeCallHandler", "JSON exception creating autofill result", e);
                                            }
                                            new LyX(KOz.A05, browserExtensionsAutofillData.A02().keySet());
                                            RequestAutofillJSBridgeCall requestAutofillJSBridgeCall2 = c3255Jns.A01;
                                            requestAutofillJSBridgeCall2.AGv(BusinessExtensionJSBridgeCall.A01(requestAutofillJSBridgeCall2.Aaz(), A12));
                                            c3255Jns.A01 = null;
                                        }
                                    }
                                }
                            }
                        } else {
                            A09 = 1BK.A09(km82.A03);
                            str2 = "BrowserExtensionsEventDispatcher";
                            str3 = "Missing autofill value or callback ID";
                            break;
                        }
                    }
                    0FI.A09(-1752158579, A032);
                case -382600864:
                    if (str.equals("LOGOUT_USER")) {
                        ?? r0 = MessengerBrowserLiteCallbackService.this;
                        C00i c00i2 = r0.A06;
                        String str5 = "loggedInUserAuthDataStore";
                        if (c00i2 != null) {
                            if (!((1Ex) c00i2.get()).BU1()) {
                                C00i c00i3 = r0.A06;
                                if (c00i3 != null) {
                                    if (((1Ex) c00i3.get()).BTw()) {
                                        C00i c00i4 = r0.A05;
                                        if (c00i4 == null) {
                                            str5 = "launchAuthActivityUtil";
                                        } else {
                                            ((20O) c00i4.get()).A01((Context) r0);
                                        }
                                    }
                                }
                            }
                        }
                        11T.A0L(str5);
                        throw 0Q8.createAndThrow();
                    }
                    0FI.A09(-1752158579, A032);
                case 95821983:
                    if (str.equals("SAVE_AUTOFILL_DIALOG_COMPLETED") && (km8 = this.A00) != null) {
                        Object obj2 = map.get("save_autofill_callback_id");
                        ArrayList arrayList = (ArrayList) map.get("save_autofill_data");
                        Boolean bool = (Boolean) map.get("save_autofill_accepted");
                        if (obj2 != null && arrayList != null && bool != null) {
                            L0l l0l2 = km8.A02;
                            boolean booleanValue = bool.booleanValue();
                            Iterator it2 = l0l2.A05.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    A09 = 1BK.A09(l0l2.A04);
                                    str2 = "BrowserExtensionsJSBridge";
                                    str3 = "Save autofill handler not found for callback";
                                    break;
                                } else {
                                    MIJ mij2 = (MIJ) it2.next();
                                    if (mij2 instanceof C3256Jnt) {
                                        C3256Jnt c3256Jnt = (C3256Jnt) mij2;
                                        Qyp.A00();
                                        SaveAutofillDataJSBridgeCall saveAutofillDataJSBridgeCall = c3256Jnt.A01;
                                        if (saveAutofillDataJSBridgeCall == null || saveAutofillDataJSBridgeCall.Aaz() == null || !c3256Jnt.A01.Aaz().equals(obj2)) {
                                            A09 = 1BK.A09(c3256Jnt.A06);
                                            str2 = "SaveAutofillDataJSBridgeCallHandler";
                                            str3 = "Save autofill callback ID does not match";
                                            break;
                                        } else {
                                            if (booleanValue) {
                                                Bundle bundle2 = c3256Jnt.A01.A02;
                                                Integer A002 = bundle2 == null ? 0S2.A0Y : KWG.A00(bundle2.getString("JS_BRIDGE_EXTENSION_TYPE"));
                                                if (1BK.A0N(c3256Jnt.A04.A00).AZk(36314266315333423L) && A002 == 0S2.A0N) {
                                                    Iterator it3 = arrayList.iterator();
                                                    while (it3.hasNext()) {
                                                        if (it3.next() instanceof NameAutofillData) {
                                                            L4p l4p = c3256Jnt.A0A;
                                                            l4p.A02.AFq(new Lyc(l4p));
                                                        }
                                                    }
                                                }
                                                Kk4 kk4 = c3256Jnt.A00;
                                                Iterator it4 = arrayList.iterator();
                                                while (it4.hasNext()) {
                                                    BrowserExtensionsAutofillData browserExtensionsAutofillData2 = (BrowserExtensionsAutofillData) it4.next();
                                                    L4p l4p2 = kk4.A02;
                                                    11T.A0I(browserExtensionsAutofillData2, "null cannot be cast to non-null type com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData<*, *>");
                                                    if (browserExtensionsAutofillData2 instanceof NameAutofillData) {
                                                        A03 = l4p2.A03();
                                                        A00 = L4p.A00(l4p2);
                                                        str4 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
                                                    } else if (browserExtensionsAutofillData2 instanceof TelephoneAutofillData) {
                                                        A03 = l4p2.A04();
                                                        A00 = L4p.A00(l4p2);
                                                        str4 = "telephone";
                                                    } else if (browserExtensionsAutofillData2 instanceof AddressAutofillData) {
                                                        A03 = l4p2.A01();
                                                        A00 = L4p.A00(l4p2);
                                                        str4 = "address";
                                                    } else if (browserExtensionsAutofillData2 instanceof EmailAutofillData) {
                                                        A03 = l4p2.A02();
                                                        A00 = L4p.A00(l4p2);
                                                        str4 = "email";
                                                    } else {
                                                        l4p2.A00.D0v("FbAutofillDataStore", 0Pz.A0W("Unexpected type:", AnonymousClass001.A0X(browserExtensionsAutofillData2)));
                                                    }
                                                    1G2 A01 = 1G3.A01(A00, str4);
                                                    ArrayList A0s = AnonymousClass001.A0s();
                                                    Iterator it5 = A03.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            BrowserExtensionsAutofillData browserExtensionsAutofillData3 = (BrowserExtensionsAutofillData) it5.next();
                                                            if (browserExtensionsAutofillData3.A05(browserExtensionsAutofillData2)) {
                                                                A03.remove(browserExtensionsAutofillData3);
                                                            }
                                                        }
                                                    }
                                                    A0s.add(browserExtensionsAutofillData2);
                                                    A0s.addAll(A03);
                                                    JSONArray jSONArray = new JSONArray();
                                                    Iterator it6 = A0s.iterator();
                                                    while (it6.hasNext()) {
                                                        try {
                                                            jSONArray.put(((BrowserExtensionsAutofillData) it6.next()).A04());
                                                        } catch (JSONException e2) {
                                                            l4p2.A00.softReport("FbAutofillDataStore", e2);
                                                        }
                                                    }
                                                    1Ql edit = l4p2.A02.edit();
                                                    edit.CaL(A01, jSONArray.toString());
                                                    edit.commit();
                                                }
                                                kOz = KOz.A05;
                                            } else {
                                                kOz = KOz.A06;
                                            }
                                            new LyX(kOz, KzA.A00(arrayList));
                                            c3256Jnt.A01 = null;
                                        }
                                    }
                                }
                            }
                        } else {
                            A09 = 1BK.A09(km8.A03);
                            str2 = "BrowserExtensionsEventDispatcher";
                            str3 = "Missing save autofill data, accepted, or callback ID";
                            break;
                        }
                    }
                    0FI.A09(-1752158579, A032);
                default:
                    0FI.A09(-1752158579, A032);
            }
            A09.D0v(str2, str3);
            0FI.A09(-1752158579, A032);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void AS2(AutofillContactDataCallback autofillContactDataCallback) {
            0FI.A09(256299002, 0FI.A03(1192884843));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void AS3(AutofillScriptCallback autofillScriptCallback) {
            0FI.A09(1465260460, 0FI.A03(-1112053442));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public PrefetchCacheEntry B4A(String str) {
            0FI.A09(87199060, 0FI.A03(929274541));
            return null;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public ArrayList B4B() {
            int A03 = 0FI.A03(1447282565);
            ArrayList A0s = AnonymousClass001.A0s();
            0FI.A09(-1931923237, A03);
            return A0s;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BLg(String str) {
            0FI.A09(-408469849, 0FI.A03(-1142490030));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BLl(String str) {
            0FI.A09(-176787226, 0FI.A03(-1705701740));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BLm(String str, String str2) {
            0FI.A09(-1670599841, 0FI.A03(-1466790102));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public int BM8(String str) {
            int A03 = 0FI.A03(-45733868);
            int i = 0;
            11T.A0F(str, 0);
            if (0CV.A0b(str, Kak.A00, false) || 0CV.A0b(str, MessengerBrowserLiteCallbackService.A0L, false)) {
                i = 2;
            }
            0FI.A09(357583579, A03);
            return i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v39, types: [com.facebook.messaging.browser.MessengerBrowserLiteCallbackService, android.content.Context] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public boolean BMB(Bundle bundle, ZonePolicy zonePolicy, String str) {
            int A03 = 0FI.A03(538065371);
            11T.A0F(str, 0);
            if (zonePolicy == null) {
                zonePolicy = ZonePolicy.A03;
            }
            ZonedValue zonedValue = new ZonedValue(zonePolicy, str);
            int A032 = 0FI.A03(-2075817569);
            int A033 = 0FI.A03(80535926);
            try {
                Uri A034 = C0A2.A03((String) KWF.A00(zonedValue, 0S2.A0H, A08()));
                if (A034 != null) {
                    ZonedValue zonedValue2 = new ZonedValue(zonedValue.A00, 11T.A02(AbM.A0A(A034.buildUpon(), AbstractC00603o4.A00(87), 4YT.A00(355))));
                    0FI.A09(-1325943924, A033);
                    ?? r0 = MessengerBrowserLiteCallbackService.this;
                    boolean z = false;
                    if (bundle != null) {
                        z = bundle.getBoolean("Tracking.ENABLED", false);
                    }
                    L7l l7l = r0.A0J;
                    if (z) {
                        if (L7l.A01(l7l)) {
                            ZonePolicy zonePolicy2 = ZonePolicy.A07;
                            String A0Y = AnonymousClass001.A0Y(l7l);
                            11T.A0A(A0Y);
                            C5ua.A03(new JTB(l7l, zonedValue2), zonePolicy2, A0Y);
                        } else {
                            ((HnO) 1Br.A0B(l7l.A01)).A00((String) zonedValue2.A01, "browser");
                        }
                    }
                    Intent A05 = AbG.A05();
                    Uri uri = null;
                    try {
                        uri = C0A2.A03((String) KWF.A00(zonedValue2, 0S2.A0G, A08()));
                    } catch (SecurityException unused) {
                    }
                    A05.setData(uri);
                    A05.setFlags(268435456);
                    09X.A00().A04().A0A(r0, A05);
                    0FI.A09(1533094651, A032);
                    0FI.A09(-403473761, A03);
                    return true;
                }
            } catch (SecurityException unused2) {
            }
            IllegalStateException A0h = 1BK.A0h();
            0FI.A09(869102945, A033);
            throw A0h;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public boolean BMP(String str) {
            boolean z;
            Uri A03;
            int A0E = JQy.A0E(str, 224603781);
            Km8 km8 = this.A00;
            if (km8 != null) {
                Context applicationContext = MessengerBrowserLiteCallbackService.this.getApplicationContext();
                for (L04 l04 : km8.A04) {
                    Bundle bundle = km8.A01;
                    if ("instant_experience".equals(bundle.getString("JS_BRIDGE_EXTENSION_TYPE")) && (Platform.stringIsNullOrEmpty(str) || (A03 = C0A2.A03(str)) == null || !69J.A00(A03))) {
                        if (!l04.A01.A01(bundle, str, bundle.getStringArrayList("JS_BRIDGE_WHITELISTED_DOMAINS"))) {
                            Intent intent = new Intent("android.intent.action.VIEW", C0A2.A03(str));
                            intent.putExtra(DKB.A00(25), "fbbrowser_instant_experience");
                            intent.addFlags(268435456);
                            ((08O) l04.A02.get()).A03().A0A(applicationContext, intent);
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            0FI.A09(554303433, A0E);
            return z;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public boolean BMh(String str, String str2) {
            0FI.A09(315074015, 0FI.A03(-912463218));
            return false;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BOX() {
            0FI.A09(987024084, 0FI.A03(-1411856793));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BWz(IsUrlSavedCallback isUrlSavedCallback, String str) {
            0FI.A09(612304677, 0FI.A03(180124853));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BY6(String str) {
            0FI.A09(-1819443970, 0FI.A03(1728441582));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BZc(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
            0FI.A09(1603773014, 0FI.A03(-553093026));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BZd(String str, String str2, Map map, long j) {
            0FI.A09(1345818656, 0FI.A03(1933518626));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BZe(String str, String str2, Map map, long j) {
            0FI.A09(-637403683, 0FI.A03(1513845033));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BZy(String str) {
            int A03 = 0FI.A03(-48857295);
            11T.A0F(str, 0);
            FbUserSession A0E = 1BL.A0E();
            L7l l7l = MessengerBrowserLiteCallbackService.this.A0J;
            11T.A0F(A0E, 0);
            ((KqW) 1Br.A0B(l7l.A05)).A00(A0E, str);
            0FI.A09(1443804839, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BaG(Bundle bundle, String str, String str2, boolean z) {
            0FI.A09(-215265787, 0FI.A03(-1855237240));
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00fd, code lost:
        
            if (r317 != r0) goto L22;
         */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void BaH(android.os.Bundle r302, com.facebook.privacy.zone.policy.ZonePolicy r303, java.lang.String r304, java.lang.String r305, java.util.Map r306, java.util.Map r307, int r308, long r309, long r311, long r313, long r315, long r317, boolean r319, boolean r320, boolean r321, boolean r322) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.browser.MessengerBrowserLiteCallbackService.BrowserLiteCallbackImpl.BaH(android.os.Bundle, com.facebook.privacy.zone.policy.ZonePolicy, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, long, long, long, long, long, boolean, boolean, boolean, boolean):void");
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BaO(Bundle bundle, String str, String str2, long j, boolean z) {
            0FI.A09(1927363037, 0FI.A03(-681448462));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BaT(Bundle bundle) {
            0FI.A09(-437423769, 0FI.A03(504798289));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00e9  */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void BbR(java.lang.String r302, java.lang.String r303) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.browser.MessengerBrowserLiteCallbackService.BrowserLiteCallbackImpl.BbR(java.lang.String, java.lang.String):void");
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void Bbi(Bundle bundle, Map map) {
            0FI.A09(-1154190541, 0FI.A03(537070342));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public String BdW(String str) {
            0FI.A09(1384972062, 0FI.A03(-696227133));
            return null;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void BkM(AutofillOptOutCallback autofillOptOutCallback, String str) {
            0FI.A09(1306143953, 0FI.A03(725850517));
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01de  */
        /* JADX WARN: Type inference failed for: r0v50, types: [X.Kl0, java.lang.Object] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void Brn(java.lang.String r302, android.os.Bundle r303) {
            /*
                Method dump skipped, instructions count: 655
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.browser.MessengerBrowserLiteCallbackService.BrowserLiteCallbackImpl.Brn(java.lang.String, android.os.Bundle):void");
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void Bx2(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map) {
            String str3;
            int A03 = 0FI.A03(1840755402);
            7zT.A1S(str, str2, map);
            if (zonePolicy == null) {
                zonePolicy = ZonePolicy.A03;
            }
            new ZonedValue(zonePolicy, str);
            int A032 = 0FI.A03(-249466641);
            map.get("total_navigation_number");
            map.get("same_domain_navigation_number");
            map.get("number_scrolls");
            Km8 km8 = this.A00;
            if (km8 != null) {
                Bundle bundle2 = km8.A01;
                bundle2.putString("JS_BRIDGE_WEB_TITLE", str2);
                for (MNu mNu : km8.A05) {
                    if (mNu.BNb(bundle2)) {
                        mNu.Bx0(bundle2);
                    }
                }
            }
            MessengerBrowserLiteCallbackService messengerBrowserLiteCallbackService = MessengerBrowserLiteCallbackService.this;
            if (bundle != null) {
                bundle.getBoolean("Tracking.ENABLED", false);
            }
            Km7 km7 = messengerBrowserLiteCallbackService.A0D;
            Map map2 = km7.A03;
            map2.get(km7.A01);
            EpJ epJ = (EpJ) 1Br.A0B(messengerBrowserLiteCallbackService.A0F);
            synchronized (epJ) {
                epJ.A00 = 1;
                epJ.A01 = GOq.A0I(epJ.A05.A00);
                epJ.A02 = 0L;
                epJ.A03 = 0L;
            }
            String str4 = km7.A01;
            map2.remove(str4);
            km7.A05.remove(str4);
            km7.A06.remove(str4);
            km7.A04.remove(str4);
            km7.A02.remove(str4);
            int A033 = 0FI.A03(696772045);
            Intent A0A = 4YU.A0A("com.facebook.orca.ACTION_IN_APP_BROWSER_EXIT");
            A0A.putExtra("browser_source_type", this.A04);
            String str5 = this.A02;
            if (str5 == null) {
                str3 = "pageId";
            } else {
                A0A.putExtra("admined_page_id", str5);
                A0A.putExtra("IN_APP_BROWSER_REACHED_LANDING_PAGE", this.A05);
                Kl0 kl0 = this.A01;
                if (kl0 == null) {
                    str3 = "loggerParam";
                } else {
                    A0A.putExtra("messenger_ads_tracking_code", kl0.A03);
                    1I7 r0 = messengerBrowserLiteCallbackService.A00;
                    if (r0 != null) {
                        r0.CkS(A0A);
                        0FI.A09(1120840552, A033);
                        0FI.A09(1625553525, A032);
                        0FI.A09(-506036623, A03);
                        return;
                    }
                    str3 = "fbBroadcastManager";
                }
            }
            11T.A0L(str3);
            throw 0Q8.createAndThrow();
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void Bz1() {
            int A03 = 0FI.A03(-710420358);
            Km7 km7 = MessengerBrowserLiteCallbackService.this.A0D;
            Kis kis = (Kis) km7.A03.get(km7.A01);
            if (kis != null) {
                kis.A02.add(new EhN(new ZonedValue(ZonePolicy.A03, "TOUCH"), true));
                if (kis.A00 == -1) {
                    km7.A07.get();
                    kis.A00 = System.currentTimeMillis();
                }
            }
            0FI.A09(-731254601, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void C1C(String str, List list) {
            0FI.A09(2014928252, 0FI.A03(206142598));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
        
            if (X.1Br.A07(r0.A0H).AZk(36315962827875938L) == false) goto L15;
         */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void C1E(android.os.Bundle r302, com.facebook.iabeventlogging.model.IABEvent r303, com.facebook.privacy.zone.policy.ZonePolicy r304) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.browser.MessengerBrowserLiteCallbackService.BrowserLiteCallbackImpl.C1E(android.os.Bundle, com.facebook.iabeventlogging.model.IABEvent, com.facebook.privacy.zone.policy.ZonePolicy):void");
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void C2t(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
            AbstractC01593ro A00;
            int A03 = 0FI.A03(-1888752614);
            11T.A0H(browserLiteJSBridgeCall, browserLiteJSBridgeCallback);
            Km8 km8 = this.A00;
            if (km8 != null) {
                Context applicationContext = MessengerBrowserLiteCallbackService.this.getApplicationContext();
                for (IMd iMd : km8.A06) {
                    if (iMd.BNb(km8.A01) && (A00 = IMd.A00(browserLiteJSBridgeCall.A02, iMd, "browser_extensions_native_bridge_called")) != null) {
                        A00.A06("api_endpoint", browserLiteJSBridgeCall.A05);
                        A00.A0A();
                    }
                }
                L0l l0l = km8.A02;
                String str = browserLiteJSBridgeCall.A04;
                if (str != null) {
                    String str2 = browserLiteJSBridgeCall.A05;
                    if (!Platform.stringIsNullOrEmpty(str2) && str.equals("_FBExtensions") && !"saveAutofillData".equals(str2) && !"requestAutoFill".equals(str2) && !"hideAutoFillBar".equals(str2)) {
                        List list = (List) browserLiteJSBridgeCall.A04("JS_BRIDGE_WHITELISTED_DOMAINS");
                        L1z l1z = l0l.A02;
                        String str3 = browserLiteJSBridgeCall.A06;
                        if ((!Platform.stringIsNullOrEmpty(str3) && str2.equals("showDialog")) || l1z.A01(browserLiteJSBridgeCall.A02, str3, list)) {
                            Iterator it = l0l.A05.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                MIJ mij = (MIJ) it.next();
                                if (str2.equals(mij.Asb())) {
                                    ImmutableMap immutableMap = L0l.A07;
                                    if (immutableMap == null) {
                                        ImmutableMap.Builder A0c = 1BK.A0c();
                                        A0c.put("requestCredentials", RequestCredentialsJSBridgeCall.CREATOR);
                                        A0c.put("requestAuthorizedCredentials", RequestAuthorizedCredentialsJSBridgeCall.CREATOR);
                                        A0c.put("processPayment", ProcessPaymentJSBridgeCall.CREATOR);
                                        A0c.put("updateCart", UpdateCartJSBridgeCall.CREATOR);
                                        A0c.put("resetCart", ResetCartJSBridgeCall.CREATOR);
                                        A0c.put("purchase_complete", PurchaseCompleteJSBridgeCall.CREATOR);
                                        A0c.put("getUserID", GetUserIDJSBridgeCall.CREATOR);
                                        A0c.put("canMakePayment", CanMakePaymentJSBridgeCall.CREATOR);
                                        A0c.put("requestCloseBrowser", RequestCloseBrowserJSBridgeCall.CREATOR);
                                        A0c.put("hasCapability", HasCapabilityJSBridgeCall.CREATOR);
                                        A0c.put("paymentsCheckout", PaymentsCheckoutJSBridgeCall.CREATOR);
                                        A0c.put("paymentShippingChange", PaymentsShippingChangeCall.CREATOR);
                                        A0c.put("paymentsChargeRequst", PaymentsChargeRequestCall.CREATOR);
                                        A0c.put("getGrantedPermissions", GetGrantedPermissionsJSBridgeCall.CREATOR);
                                        A0c.put("askPermission", AskPermissionJSBridgeCall.CREATOR);
                                        A0c.put("getSupportedFeatures", GetSupportedFeaturesJSBridgeCall.CREATOR);
                                        A0c.put("getContext", GetContextJSBridgeCall.CREATOR);
                                        A0c.put("showDialog", ShowLoginDialogJSBridgeCall.CREATOR);
                                        A0c.put("getEnvironment", GetEnvironmentJSBridgeCall.CREATOR);
                                        A0c.put("getVersion", GetVersionJSBridgeCall.CREATOR);
                                        A0c.put("requestAutoFill", RequestAutofillJSBridgeCall.CREATOR);
                                        A0c.put("saveAutofillData", SaveAutofillDataJSBridgeCall.CREATOR);
                                        A0c.put("getUserContext", GetUserContextJSBridgeCall.CREATOR);
                                        immutableMap = AbG.A10(A0c, "init", InitJSBridgeCall.CREATOR);
                                        L0l.A07 = immutableMap;
                                    }
                                    MMa mMa = (MMa) immutableMap.get(str2);
                                    if (mMa != null) {
                                        BusinessExtensionJSBridgeCall AIs = mMa.AIs(applicationContext, browserLiteJSBridgeCall.A02, browserLiteJSBridgeCall.A03, str, str3);
                                        AIs.A00 = new KpF(browserLiteJSBridgeCallback, l0l);
                                        if ((AIs instanceof InitJSBridgeCall) && (mij instanceof C3254Jnr)) {
                                            C3254Jnr c3254Jnr = (C3254Jnr) mij;
                                            InitJSBridgeCallData initJSBridgeCallData = (InitJSBridgeCallData) AIs.A05("initData");
                                            if (initJSBridgeCallData != null && initJSBridgeCallData.A00 != null) {
                                                if (AIs.A04("JS_BRIDGE_PAGE_ID") != null) {
                                                    String str4 = AIs.A06;
                                                    if (C0A2.A03(str4).toString() != null && 1BK.A0N(c3254Jnr.A02).AZk(36312067292073814L)) {
                                                        FbUserSession A05 = 1Fw.A05(c3254Jnr.A00);
                                                        C4O c4o = c3254Jnr.A01;
                                                        InitJSBridgeCallData initJSBridgeCallData2 = (InitJSBridgeCallData) AIs.A05("initData");
                                                        c4o.A00(A05, (DGV) null, initJSBridgeCallData2 == null ? null : initJSBridgeCallData2.A00, (String) AIs.A04("JS_BRIDGE_PAGE_ID"), C0A2.A03(str4).toString());
                                                    }
                                                }
                                                InitJSBridgeCallData initJSBridgeCallData3 = (InitJSBridgeCallData) AIs.A05("initData");
                                                l0l.A00 = new RDn(initJSBridgeCallData3 == null ? null : initJSBridgeCallData3.A00);
                                            }
                                        } else {
                                            mij.BM9(AIs, l0l.A00);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0FI.A09(-363198599, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void C7c(String str, String str2) {
            0FI.A09(-1478203258, 0FI.A03(1186095708));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void C7d(MoreInfoCallback moreInfoCallback, String str, String str2, String str3, String str4, boolean z) {
            0FI.A09(-1793167387, 0FI.A03(1731520365));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void C9s(Map map) {
            int A0E = JQy.A0E(map, 1749239830);
            Intent A05 = AbF.A05();
            0Df r0 = MessengerBrowserLiteCallbackService.this;
            A05.setClass(r0.getApplicationContext(), P2MTransparentActivity.class);
            A05.setFlags(268435456);
            Iterator A0x = AnonymousClass001.A0x((AbstractMap) map);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                A05.putExtra(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
            }
            0LS.A0A(r0.getApplicationContext(), A05);
            0FI.A09(1747691830, A0E);
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [com.facebook.messaging.browser.MessengerBrowserLiteCallbackService, android.content.Context] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CAZ(int i, String str, Bundle bundle) {
            Object obj;
            int A03 = 0FI.A03(76298613);
            11T.A0F(str, 0);
            ZonedValue zonedValue = new ZonedValue(A03(bundle), str);
            int A032 = 0FI.A03(1930858942);
            int A033 = 0FI.A03(1342468910);
            ?? r0 = MessengerBrowserLiteCallbackService.this;
            if (1Br.A07(r0.A0H).AZk(36315962827875938L)) {
                Integer num = 0S2.A1G;
                C5ue c5ue = C5ub.A00;
                if (c5ue == null) {
                    c5ue = C5ud.A00;
                }
                obj = c5ue.D6M(zonedValue, num);
            } else {
                obj = zonedValue.A01;
            }
            boolean A0T = 0CU.A0T((String) obj, "messenger.com/closeWindow", false);
            0FI.A09(680764092, A033);
            if (A0T) {
                L5x.A01(r0.getApplicationContext(), F6F.A00(r0.A0C), DKB.A00(36), false, false);
            }
            0FI.A09(-160189025, A032);
            0FI.A09(-1135441023, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CAb(Bundle bundle, String str, int i, long j) {
            int A0E = JQy.A0E(str, -552110684);
            new ZonedValue(A03(bundle), str);
            0FI.A09(-299175203, 0FI.A03(-1614674741));
            0FI.A09(-1036251459, A0E);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CAj(Bundle bundle, String str, String str2) {
            int A03 = 0FI.A03(536447008);
            11T.A0F(str2, 1);
            ZonedValue zonedValue = new ZonedValue(A03(bundle), str2);
            int A032 = 0FI.A03(-1055883645);
            Km7 km7 = MessengerBrowserLiteCallbackService.this.A0D;
            Kis kis = (Kis) km7.A03.get(km7.A01);
            if (kis != null) {
                kis.A02.add(new EhN(zonedValue, false));
            }
            0FI.A09(-373218846, A032);
            0FI.A09(348477895, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CAz(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z) {
            String str2;
            Kis kis;
            int A03 = 0FI.A03(-822689692);
            11T.A0F(str, 0);
            if (zonePolicy == null) {
                zonePolicy = ZonePolicy.A03;
            }
            new ZonedValue(zonePolicy, str);
            int A032 = 0FI.A03(-197746351);
            MessengerBrowserLiteCallbackService messengerBrowserLiteCallbackService = MessengerBrowserLiteCallbackService.this;
            boolean z2 = false;
            if (bundle != null) {
                z2 = bundle.getBoolean("Tracking.ENABLED", false);
            }
            EpJ epJ = (EpJ) 1Br.A0B(messengerBrowserLiteCallbackService.A0F);
            synchronized (epJ) {
                epJ.A04 = true;
            }
            FbUserSession A0E = 1BL.A0E();
            C00i c00i = messengerBrowserLiteCallbackService.A03;
            if (c00i == null) {
                str2 = "androidThreadUtil";
            } else {
                ((1GU) c00i.get()).Ciz(new LpU(A0E, messengerBrowserLiteCallbackService, z2));
                Km8 km8 = this.A00;
                if (km8 != null) {
                    Iterator it = km8.A05.iterator();
                    while (it.hasNext()) {
                        ((MFA) it.next()).BNb(km8.A01);
                    }
                }
                Km7 km7 = messengerBrowserLiteCallbackService.A0D;
                Map map = km7.A03;
                if (map.containsKey(km7.A01) && (kis = (Kis) map.get(km7.A01)) != null) {
                    long j = kis.A01;
                    km7.A07.get();
                    kis.A01 = j + (System.currentTimeMillis() - km7.A00);
                }
                int A033 = 0FI.A03(2031468628);
                Intent A0A = 4YU.A0A("com.facebook.orca.ACTION_IN_APP_BROWSER_PAUSE");
                A0A.putExtra("browser_source_type", this.A04);
                1I7 r0 = messengerBrowserLiteCallbackService.A00;
                if (r0 != null) {
                    r0.CkS(A0A);
                    0FI.A09(194628173, A033);
                    0FI.A09(-2033885480, A032);
                    0FI.A09(-1664184257, A03);
                    return;
                }
                str2 = "fbBroadcastManager";
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.messaging.browser.MessengerBrowserLiteCallbackService, android.content.Context, java.lang.Object] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CFI(Map map) {
            int A03 = 0FI.A03(-1515437873);
            11T.A0F(map, 0);
            ?? r0 = MessengerBrowserLiteCallbackService.this;
            C00i c00i = r0.A04;
            if (c00i == null) {
                11T.A0L("bugReporter");
                throw 0Q8.createAndThrow();
            }
            EcF ecF = (EcF) c00i.get();
            Uri uri = (Uri) map.get("screenshot_uri");
            ArrayList A0s = AnonymousClass001.A0s();
            if (uri != null) {
                5Yu[] r02 = BugReportAttachment.A05;
                BugReportAttachment A00 = BugReportAttachment.Companion.A00(uri, BugReportAttachmentMediaSource.A04, BugReportAttachmentMediaType.A04, "FbBrowserBugReporter");
                if (A00 != null) {
                    A0s.add(A00);
                }
            }
            Map map2 = (Map) map.get(GOm.A00(237));
            if (map2 != null) {
                ImmutableMap.Builder A0c = 1BK.A0c();
                Iterator A1B = 1BK.A1B(map2);
                while (A1B.hasNext()) {
                    Object next = A1B.next();
                    if (next != null && map2.get(next) != null) {
                        Object obj = map2.get(next);
                        DKC.A1U(obj);
                        A0c.put(next, obj);
                    }
                }
                Uri uri2 = (Uri) map.get(GOm.A00(331));
                Map map3 = (Map) map.get(GOm.A00(190));
                5TL r03 = ecF.A00;
                EPO epo = EPO.A07;
                RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
                Long l = 210094942460077L;
                l.getClass();
                Present present = new Present(l);
                ListenableFuture A02 = 5TL.A02((Context) r0, r03, new G6w(r0, uri2, r03, epo, A0c.build(), regularImmutableSet, A0s, map3));
                1Kd.A0D(r03.A0L, new Fw1(0, r0, r03, present), A02);
            }
            0FI.A09(414657251, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CHs(Bundle bundle, ZonePolicy zonePolicy, String str) {
            int i;
            String str2;
            int A03 = 0FI.A03(1634119161);
            4YV.A1N(str, zonePolicy);
            ZonedValue zonedValue = new ZonedValue(zonePolicy, str);
            int A032 = 0FI.A03(1153368304);
            MessengerBrowserLiteCallbackService messengerBrowserLiteCallbackService = MessengerBrowserLiteCallbackService.this;
            DummyBrowserActivity dummyBrowserActivity = messengerBrowserLiteCallbackService.A07;
            if (dummyBrowserActivity == null) {
                str2 = "dummyBrowserActivity";
            } else {
                boolean A08 = A08();
                dummyBrowserActivity.A00 = zonedValue;
                dummyBrowserActivity.A01 = A08;
                EpJ epJ = (EpJ) 1Br.A0B(messengerBrowserLiteCallbackService.A0F);
                synchronized (epJ) {
                    epJ.A04 = false;
                }
                boolean z = bundle != null ? bundle.getBoolean("Tracking.ENABLED", false) : false;
                C00i c00i = messengerBrowserLiteCallbackService.A03;
                if (c00i != null) {
                    ((1GU) c00i.get()).Ciz(new LnY(messengerBrowserLiteCallbackService, z));
                    if (bundle == null) {
                        i = -212373039;
                    } else {
                        String str3 = this.A03;
                        if (str3 != null) {
                            Km7 km7 = messengerBrowserLiteCallbackService.A0D;
                            km7.A01 = str3;
                            km7.A07.get();
                            km7.A00 = System.currentTimeMillis();
                        }
                        if (this.A00 == null && KWG.A00(bundle.getString("JS_BRIDGE_EXTENSION_TYPE")) != 0S2.A0Y) {
                            AbR abR = messengerBrowserLiteCallbackService.A02;
                            if (abR == null) {
                                str2 = "extensionsEventDispatcherProvider";
                            } else {
                                this.A00 = abR.A01(bundle);
                            }
                        }
                        Km8 km8 = this.A00;
                        if (km8 != null) {
                            for (MNu mNu : km8.A05) {
                                Bundle bundle2 = km8.A01;
                                if (mNu.BNb(bundle2)) {
                                    mNu.CHp(bundle2);
                                }
                            }
                        }
                        i = 1218474285;
                    }
                    0FI.A09(i, A032);
                    0FI.A09(1622544995, A03);
                    return;
                }
                str2 = "androidThreadUtil";
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CKa() {
            int A03 = 0FI.A03(-109886056);
            EpJ epJ = (EpJ) 1Br.A0B(MessengerBrowserLiteCallbackService.this.A0F);
            synchronized (epJ) {
                epJ.A00 = 3;
                epJ.A03 = GOq.A0I(epJ.A05.A00);
            }
            0FI.A09(352787794, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CT4(String str, Bundle bundle) {
            0FI.A09(206300710, 0FI.A03(544802460));
        }

        /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.messaging.browser.MessengerBrowserLiteCallbackService, android.content.Context] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CT8(Bundle bundle, Map map) {
            int i;
            int A0E = JQy.A0E(map, -340902244);
            if (map.containsKey("action") && (map.get("action") instanceof String)) {
                String valueOf = String.valueOf(map.get("action"));
                ?? r0 = MessengerBrowserLiteCallbackService.this;
                Set<MIS> set = r0.A08;
                if (set == null) {
                    11T.A0L("messengerBrowserMenuItemHandlers");
                    throw 0Q8.createAndThrow();
                }
                for (MIS mis : set) {
                    if (0CV.A0a(mis.Awg(), valueOf, true)) {
                        mis.BMD(r0.getApplicationContext(), bundle, map);
                        i = -1279498501;
                        break;
                    }
                }
            }
            i = 2127123462;
            0FI.A09(i, A0E);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CW2() {
            0FI.A09(397700084, 0FI.A03(-790650524));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CWF(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback) {
            0FI.A09(-281629331, 0FI.A03(622028992));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void CWG(Bundle bundle) {
            0FI.A09(-867509026, 0FI.A03(-765905216));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void Cge(Bundle bundle, long[] jArr) {
            int A0E = JQy.A0E(jArr, 2084203154);
            int length = jArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    0FI.A09(1827846651, A0E);
                    return;
                }
                MessengerBrowserLiteCallbackService messengerBrowserLiteCallbackService = MessengerBrowserLiteCallbackService.this;
                messengerBrowserLiteCallbackService.A0B.CQy(jArr[i2]);
                messengerBrowserLiteCallbackService.A09.CQy(jArr[i2]);
                i = i2 + 1;
            }
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void ChX() {
            0FI.A09(259457405, 0FI.A03(-1064494157));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void Cok() {
            0FI.A09(-1703263372, 0FI.A03(873357050));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public void D3v() {
            0FI.A09(-1331864639, 0FI.A03(-576232422));
        }
    }

    /* loaded from: MessengerBrowserLiteCallbackService$DummyBrowserActivity.class */
    public final class DummyBrowserActivity extends Activity implements C1lM {
        public ZonedValue A00;
        public boolean A01;

        @Override // X.C1lM
        public Map AWe() {
            Object obj;
            ZonedValue zonedValue = this.A00;
            Map map = null;
            if (zonedValue != null) {
                try {
                    obj = this.A01 ? C5ua.A02(zonedValue) : zonedValue.A01;
                } catch (C48s unused) {
                    obj = null;
                }
                if (obj != null) {
                    map = 1BK.A1D(1BJ.A00(1231), obj);
                }
            }
            return map;
        }

        public String AWg() {
            return "webview";
        }

        public Long Am7() {
            return 331919734849099L;
        }
    }

    /* loaded from: MessengerBrowserLiteCallbackService$P2MTransparentActivity.class */
    public final class P2MTransparentActivity extends FbFragmentActivity {
        public boolean A00;

        @Override // com.facebook.base.activity.FbFragmentActivity
        public void A2y(Bundle bundle) {
            super.A2y(bundle);
            Fragment fragment = new 1pK();
            C06c A0D = 7zU.A0D(this);
            A0D.A0O(fragment, "MessengerBrowserLiteCallbackService");
            A0D.A04();
        }

        @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            if (i == 1) {
                finish();
            }
        }

        @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
        public void onPostCreate(Bundle bundle) {
            super.onPostCreate(bundle);
            String stringExtra = getIntent().getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if (!11T.A0O(stringExtra, "pre_txn")) {
                if (11T.A0O(stringExtra, "iab_app_switch")) {
                    String stringExtra2 = getIntent().getStringExtra("extra_p2m_deeplink");
                    if (stringExtra2 == null) {
                        throw 1BK.A0h();
                    }
                    Uri A0C = 7zU.A0C(stringExtra2);
                    Intent flags = C3o5.A0D(this, asyncControllerActivity.class).putExtra("action_type", A0C.getQueryParameter("action_type")).putExtra("entry_point", A0C.getQueryParameter("entry_point")).putExtra("target_id", A0C.getQueryParameter("target_id")).putExtra("extra_data", A0C.getQueryParameter("extra_data")).setFlags(536870912);
                    11T.A0A(flags);
                    startActivityForResult(flags, 1);
                    return;
                }
                return;
            }
            Ebt ebt = (Ebt) 1Bn.A0A(99780);
            MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(getApplicationContext(), 16979);
            Fragment A0b = BDe().A0b("MessengerBrowserLiteCallbackService");
            if (A0b == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            C2050DaD A00 = EUa.A00(A0b, ebt, migColorScheme, (Exk) null, (FFj) null, 24);
            HashMap A0u = AnonymousClass001.A0u();
            HashMap A0u2 = AnonymousClass001.A0u();
            BitSet A18 = 1BK.A18(3);
            String stringExtra3 = getIntent().getStringExtra("seller_id");
            if (stringExtra3 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A0u.put("seller_id", stringExtra3);
            A18.set(2);
            String stringExtra4 = getIntent().getStringExtra("redirect_url");
            if (stringExtra4 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A0u.put("redirect_url", stringExtra4);
            A18.set(1);
            String stringExtra5 = getIntent().getStringExtra("order_ref");
            if (stringExtra5 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A0u.put("order_ref", stringExtra5);
            A18.set(0);
            Context applicationContext = getApplicationContext();
            Fwu fwu = new Fwu(this, 0);
            if (A18.nextClearBit(0) < 3) {
                throw DKD.A0k();
            }
            C4O5.A01(fwu, "com.bloks.www.payments.person_to_merchant.third_party_platform.action", A0u, A0u2).A00(applicationContext, A00);
            A00.A00().A00(new Fax(this));
        }

        @Override // android.app.Activity
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!this.A00) {
                return true;
            }
            finish();
            return true;
        }
    }

    public IBinder A10(Intent intent) {
        return new BrowserLiteCallbackImpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.facebook.messaging.browser.MessengerBrowserLiteCallbackService$DummyBrowserActivity, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.KSV, java.lang.Object] */
    @Override // X.C2rm
    public void A12() {
        int A04 = 0FI.A04(-544921163);
        super.A12();
        C1cx.A00(this);
        this.A02 = (AbR) 1Bn.A0E(this, (1BY) null, 339);
        Set set = (Set) 1Bn.A0E(this, (1BY) null, 244);
        11T.A0A(set);
        this.A08 = set;
        this.A04 = 1Bu.A00(100019);
        this.A00 = (1I7) 1Hv.A02(this, 65728);
        this.A05 = 1Bq.A00(33179);
        this.A06 = 1Bq.A00(83426);
        this.A03 = 1Bq.A00(16458);
        this.A07 = new Activity();
        ?? obj = new Object();
        ((KSV) obj).A00 = false;
        0fH.A07(KSV.class, false, "mShouldApplyEpdPolicy %s");
        this.A01 = obj;
        C4v c4v = (C4v) 1Bn.A0E(this, (1BY) null, 82297);
        Ley ley = new Ley(this, 3);
        ((1Fv) 1Bi.A03(66351)).A04();
        c4v.A00(ley);
        0FI.A0A(1888622914, A04);
    }
}
