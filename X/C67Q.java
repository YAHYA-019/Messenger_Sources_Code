package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.67Q, reason: invalid class name */
/* loaded from: 67Q.class */
public final class C67Q {
    public 1BY A00;
    public static final ImmutableList A0C = ImmutableList.of((Object) "com.facebook.katana", (Object) "com.facebook.wakizashi", (Object) "com.facebook.work", (Object) "com.facebook.workdev", (Object) "com.facebook.auth.login");
    public static final ImmutableList A0B = ImmutableList.of((Object) "com.facebook.katana", (Object) "com.facebook.wakizashi", (Object) "com.facebook.lite", (Object) "com.facebook.work", (Object) "com.facebook.workdev", (Object) "com.facebook.auth.login");
    public final C00i A0A = new 1BV((1BY) null, 49964);
    public final C00i A06 = new 1BQ(49965);
    public final 1CO A07 = (1CO) 1Bi.A03(16387);
    public final 1EZ A08 = (1EZ) 1Bn.A0E((Context) null, (1BY) null, 16428);
    public final C00i A03 = new 1BV((1BY) null, 68320);
    public final C00i A04 = new 1BQ(82975);
    public final C00i A01 = new 1BQ(16885);
    public final C00i A09 = new 1BV((1BY) null, 147488);
    public final C00i A05 = new 1BV((1BY) null, 68733);
    public final C00i A02 = new 1BV((1BY) null, 83296);

    public C67Q(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static ListenableFuture A00(DFF dff, C67Q c67q, boolean z) {
        67R r0 = (67R) c67q.A0A.get();
        if (z) {
            return 2FP.A02(new D2o(dff, c67q, 2), r0.A03(false, false), 1JU.A01);
        }
        ArrayList arrayList = new ArrayList(67R.A01(r0, false, false));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(C4DT.A03((Context) r0.A03.get(), arrayList));
        arrayList2.addAll(67R.A00(r0));
        return 1Kd.A0A(Boolean.valueOf(dff.CMb(arrayList2)));
    }

    public static boolean A01(C67Q c67q, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FirstPartySsoSessionInfo firstPartySsoSessionInfo = (FirstPartySsoSessionInfo) it.next();
            c67q.A06.get();
            Set set = C68t.A0Q;
            if (A0B.contains(firstPartySsoSessionInfo.A04.A03)) {
                return str.equals(firstPartySsoSessionInfo.A08);
            }
        }
        return false;
    }

    public ListenableFuture A02(final Context context, final Intent intent, final Uri uri, final Uri uri2, final FbUserSession fbUserSession, final Integer num, String str) {
        String str2;
        1hM A00;
        String str3;
        String str4 = str;
        C00i c00i = this.A03;
        CMu cMu = (CMu) c00i.get();
        final long generateNewFlowId = CMu.A01(cMu).generateNewFlowId(5512275);
        cMu.A00 = generateNewFlowId;
        UserFlowLogger A01 = CMu.A01(cMu);
        switch (num.intValue()) {
            case 0:
                str2 = "community_messaging_admin_assist";
                break;
            case 1:
                str2 = "community_messaging_admin_reporting";
                break;
            case 2:
                str2 = "community_messaging_channel";
                break;
            case 3:
                str2 = "events_sticker";
                break;
            case 4:
                str2 = "facebook_entry_point_in_call";
                break;
            case 5:
                str2 = "facebook_entry_point_nav_bar";
                break;
            case 6:
                str2 = "facebook_entry_point_settings";
                break;
            case 7:
                str2 = "fundraiser_page";
                break;
            case 8:
                str2 = "group";
                break;
            case 9:
                str2 = "growth_upsell_generic_admin_message";
                break;
            case 10:
                str2 = "job_application";
                break;
            case 11:
                str2 = "link_handling_helper_third_party";
                break;
            case 12:
                str2 = GOm.A00(272);
                break;
            case 13:
                str2 = "marketplace_banner_similar_action";
                break;
            case 14:
                str2 = "mention_target";
                break;
            case 15:
                str2 = "messenger_kids_profile";
                break;
            case 16:
                str2 = "neo_links";
                break;
            case 17:
                str2 = "payments_onboarding";
                break;
            case 18:
                str2 = "profile_about";
                break;
            case 19:
                str2 = "profile_timeline";
                break;
            case 20:
                str2 = "sale_item_post";
                break;
            case 21:
                str2 = "seller_page_tab";
                break;
            case 22:
                str2 = "seller_profile_thread_settings";
                break;
            case 23:
                str2 = "facebook_feed_friend_update";
                break;
            case 24:
                str2 = "facebook_feed_highlights_tab";
                break;
            case 25:
                str2 = "reshare_hub_media_picker_null_state";
                break;
            case 26:
                str2 = "disabled_channel";
                break;
            case 27:
                str2 = "gaming";
                break;
            case 28:
                str2 = "notes";
                break;
            default:
                str2 = "messenger_stories_viewer";
                break;
        }
        A01.flowStart(generateNewFlowId, new UserFlowConfig(str2, false));
        if (str == null || str4.isEmpty()) {
            str4 = ((1G1) fbUserSession).A02;
        }
        C9B A002 = ((C4R) this.A04.get()).A00(str4);
        if (A002.A00.asBoolean(false)) {
            CMu.A01((CMu) c00i.get()).flowAnnotate(generateNewFlowId, "other_user_logged_in", 1);
        }
        boolean z = A002.A05;
        boolean A1Y = 1BK.A1Y(F4o.A00(intent, context.getApplicationInfo(), context.getPackageManager()));
        CMu.A01((CMu) c00i.get()).flowAnnotate(generateNewFlowId, "iab_account_match_account_cache", z);
        CMu.A01((CMu) c00i.get()).flowAnnotate(generateNewFlowId, "internally_resolvable_intent_cache", A1Y);
        if (z && A1Y) {
            1CO r0 = this.A07;
            if (r0.AZk(72340692512346144L)) {
                if (r0.AZk(72340692512411681L)) {
                    if (A07()) {
                        str3 = "com.facebook.wakizashi";
                        intent.setPackage(((C0B5) this.A01.get()).A01(str3, 0) == null ? "com.facebook.katana" : "com.facebook.wakizashi");
                    }
                }
                0LS.A0B(context, intent);
                ((CMu) c00i.get()).A02(generateNewFlowId, true);
                A00 = C3o5.A0K(true);
                1Kd.A0E(new ABm(this, generateNewFlowId, 0), A00);
                return A00;
            }
        }
        final String str5 = str4;
        A00 = A00(new DFF() { // from class: X.Clr
            /* JADX WARN: Code restructure failed: missing block: B:4:0x00b1, code lost:
            
                if (X.FE6.A01(r0, r0) == false) goto L6;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean CMb(java.util.List r302) {
                /*
                    Method dump skipped, instructions count: 988
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.Clr.CMb(java.util.List):boolean");
            }
        }, this, ((CG7) this.A05.get()).A00.AZk(36319261362304871L));
        1Kd.A0E(new ABm(this, generateNewFlowId, 0), A00);
        return A00;
    }

    public ListenableFuture A03(Context context, Uri uri, Uri uri2, Integer num) {
        return A02(context, 4YU.A09(uri), uri, uri2, 1Fw.A04(this.A08), num, null);
    }

    public ListenableFuture A04(Context context, FbUserSession fbUserSession) {
        return (0Kh.A03(context.getPackageManager(), "com.facebook.katana") || (((C0B5) this.A01.get()).A01("com.facebook.lite", 0) != null && this.A07.AZk(72340692512673829L))) ? A00(new Clp(fbUserSession, this), this, ((CG7) this.A05.get()).A00.AZk(36319261362370408L)) : C3o5.A0K(true);
    }

    public void A05(Context context, Uri uri) {
        if (uri == null) {
            this.A09.get();
            uri = 4YU.A0F("https://m.facebook.com");
        }
        ((C68t) this.A06.get()).A0E(context, uri);
    }

    public void A06(Context context, Uri uri, Uri uri2, FbUserSession fbUserSession, Integer num) {
        A02(context, 4YU.A09(uri), uri, uri2, fbUserSession, num, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (((X.C0B5) r0.get()).A01("com.facebook.wakizashi", 0) != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.0B5 r0 = (X.C0B5) r0
            r303 = r0
            r0 = r303
            java.lang.String r1 = "com.facebook.katana"
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.A01(r1, r2)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L34
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.0B5 r0 = (X.C0B5) r0
            java.lang.String r1 = "com.facebook.wakizashi"
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.A01(r1, r2)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L37
        L34:
            r0 = 1
            r305 = r0
        L37:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67Q.A07():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (A07() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.0B5 r0 = (X.C0B5) r0
            r302 = r0
            java.lang.String r0 = "com.facebook.lite"
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.A01(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2d
            r0 = r301
            boolean r0 = r0.A07()
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L30
        L2d:
            r0 = 1
            r306 = r0
        L30:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67Q.A08():boolean");
    }

    public boolean A09(Context context) {
        6Ki r0 = (6Ki) 1Bn.A0E((Context) null, this.A00, 50069);
        if (!r0.A06() || !r0.A07()) {
            return false;
        }
        r0.A04(context, "com.facebook.katana");
        return true;
    }
}
