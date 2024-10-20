package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.model.GraphQLPage;
import com.facebook.graphql.modelutil.BaseModel;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.facebook.graphservice.factory.GraphQLServiceFactory;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

/* loaded from: N4s.class */
public abstract class N4s {
    public final TreeJNI mFromTree;
    public final int mTypeTag;
    public SparseArray A01 = new SparseArray(8);
    public SparseArray A00 = new SparseArray(8);
    public boolean A02 = false;

    public N4s(TreeJNI treeJNI, int i) {
        this.mTypeTag = i;
        this.mFromTree = treeJNI;
    }

    public static MSn A0o(TreeJNI treeJNI, TreeJNI treeJNI2, int i) {
        N4s n4s = new N4s(treeJNI, i);
        n4s.A1u(treeJNI2.getTypeName());
        return n4s;
    }

    public static MSm A0p(TreeJNI treeJNI, TreeJNI treeJNI2, int i) {
        N4s n4s = new N4s(treeJNI, i);
        n4s.A1u(treeJNI2.getTypeName());
        return n4s;
    }

    public static MSo A0q(TreeJNI treeJNI, TreeJNI treeJNI2, int i) {
        N4s n4s = new N4s(treeJNI, i);
        n4s.A1u(treeJNI2.getTypeName());
        return n4s;
    }

    public static final C2x5 A0r(N4s n4s, GraphQLServiceFactory graphQLServiceFactory, String str) {
        TreeJNI treeJNI = n4s.mFromTree;
        if (treeJNI != null) {
            return graphQLServiceFactory.newTreeBuilder(str, TreeBuilderJNI.class, 0, treeJNI);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = n4s.A00;
            if (i2 >= sparseArray.size()) {
                n4s.A00 = n4s.A01;
                return graphQLServiceFactory.newTreeBuilder(str);
            }
            int keyAt = sparseArray.keyAt(i2);
            n4s.A01.put(keyAt, n4s.A00.get(keyAt));
            i = i2 + 1;
        }
    }

    public static String A0s(N4s n4s) {
        String str = (String) n4s.A00.get(-2073950043);
        if (str == null) {
            str = (String) n4s.A01.get(-2073950043);
        }
        return str;
    }

    public static void A0t(N4s n4s, BaseModelWithTree baseModelWithTree) {
        n4s.A1Y(3355, baseModelWithTree.A0a(3355));
    }

    public static void A0u(N4s n4s, BaseModelWithTree baseModelWithTree) {
        n4s.A1Y(3373707, baseModelWithTree.A0a(3373707));
    }

    public static void A0v(N4s n4s, BaseModelWithTree baseModelWithTree) {
        n4s.A1X(94851343, baseModelWithTree.A0I(94851343));
        n4s.A1W();
    }

    public static void A0w(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A00.put(i, baseModelWithTree.A0R(i));
    }

    public static void A0x(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A00.put(i, baseModelWithTree.A0a(i));
    }

    public static void A0y(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1a(baseModelWithTree.A0M(i), i);
        n4s.A1W();
    }

    public static void A0z(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1X(i, baseModelWithTree.A0I(i));
        n4s.A1W();
    }

    public static void A10(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1Z(i, baseModelWithTree.A0b(i));
    }

    public static void A11(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1a(baseModelWithTree.A0P(i), i);
    }

    public static void A12(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1Y(i, baseModelWithTree.A0a(i));
        n4s.A1W();
    }

    public static void A13(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A00.put(i, baseModelWithTree.A0a(i));
    }

    public static void A14(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1a(baseModelWithTree.A0O(i), i);
    }

    public static void A15(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1Y(i, baseModelWithTree.A0a(i));
        n4s.A00.put(116079, baseModelWithTree.A0a(116079));
    }

    public static void A16(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1a(baseModelWithTree.A0P(i), i);
    }

    public static void A17(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1Y(i, baseModelWithTree.A0a(i));
    }

    public static void A18(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A00.put(i, Double.valueOf(baseModelWithTree.A0H(i)));
    }

    public static void A19(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1a(baseModelWithTree.A0N(i), i);
    }

    public static void A1A(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A00.put(i, Long.valueOf(baseModelWithTree.A0J(i)));
    }

    public static void A1B(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1X(i, baseModelWithTree.A0I(i));
    }

    public static void A1C(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1Z(i, baseModelWithTree.A0b(i));
        n4s.A1W();
    }

    public static void A1D(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A00.put(i, baseModelWithTree.A0S(i));
    }

    public static void A1E(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A1a(baseModelWithTree.A0M(i), i);
    }

    public static void A1F(N4s n4s, BaseModelWithTree baseModelWithTree, int i) {
        n4s.A00.put(i, baseModelWithTree.A0a(i));
        n4s.A1W();
    }

    public static void A1G(N4s n4s, BaseModelWithTree baseModelWithTree, Class cls, int i, int i2) {
        n4s.A00.put(i, baseModelWithTree.A0T(i, cls, i2));
        n4s.A1W();
    }

    public static void A1H(N4s n4s, BaseModelWithTree baseModelWithTree, Class cls, int i, int i2) {
        n4s.A1a(baseModelWithTree.A0Q(cls, i, i2), i);
    }

    public static void A1I(N4s n4s, BaseModelWithTree baseModelWithTree, Class cls, int i, int i2) {
        n4s.A1a(baseModelWithTree.A0Q(cls, i, i2), i);
        n4s.A1W();
    }

    public static void A1J(N4s n4s, BaseModelWithTree baseModelWithTree, Class cls, int i, int i2) {
        n4s.A00.put(i, baseModelWithTree.A0T(i, cls, i2));
    }

    public static void A1K(N4s n4s, BaseModelWithTree baseModelWithTree, Enum r303, int i) {
        n4s.A00.put(i, baseModelWithTree.A0U(r303, i));
    }

    public static void A1L(N4s n4s, MSt mSt, int i) {
        n4s.A1a((GraphQLPage) mSt.A0Q(GraphQLPage.class, i, 423427227), i);
    }

    public static void A1M(N4s n4s, C2x5 c2x5) {
        n4s.A1c(c2x5);
    }

    public static void A1N(N4s n4s, C2x5 c2x5) {
        n4s.A1d(c2x5);
    }

    public static void A1O(N4s n4s, C2x5 c2x5) {
        n4s.A1d(c2x5);
        n4s.A1p(c2x5, "image", 100313435);
    }

    public static void A1P(N4s n4s, C2x5 c2x5) {
        n4s.A1e(c2x5);
    }

    public static void A1Q(N4s n4s, C2x5 c2x5) {
        n4s.A1k(c2x5, "count", 94851343);
    }

    public static void A1R(N4s n4s, C2x5 c2x5) {
        n4s.A1p(c2x5, "page", 3433103);
    }

    public static void A1S(N4s n4s, C2x5 c2x5, String str, int i) {
        n4s.A1p(c2x5, str, i);
        n4s.A1p(c2x5, "feedback", -191501435);
    }

    public static void A1T(N4s n4s, C2x5 c2x5, String str, int i) {
        n4s.A1p(c2x5, str, i);
        n4s.A1p(c2x5, "profile_picture", 1782764648);
    }

    private final void A1c(C2x5 c2x5) {
        A1m(c2x5, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 3373707);
    }

    private final void A1d(C2x5 c2x5) {
        A1m(c2x5, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 3355);
    }

    private final void A1e(C2x5 c2x5) {
        A1r(c2x5, "url", 116079);
    }

    public final Tree A1U(String str, Class cls, int i) {
        GraphQLServiceFactory A00 = 2tS.A00();
        C2x5 A0r = A0r(this, A00, str);
        A1b(A00, A0r);
        return A0r.getResult(cls, i);
    }

    public final Tree A1V(String str, Class cls, int i) {
        GraphQLServiceFactory A00 = 2tS.A00();
        C2x5 A0r = A0r(this, A00, str);
        this.A02 = true;
        A1b(A00, A0r);
        this.A02 = false;
        return A0r.getResult(cls, i);
    }

    public void A1W() {
        this.A01 = this.A00.clone();
        this.A00.clear();
    }

    public final void A1X(int i, int i2) {
        this.A00.put(i, Integer.valueOf(i2));
    }

    public final void A1Y(int i, String str) {
        this.A00.put(i, str);
    }

    public final void A1Z(int i, boolean z) {
        this.A00.put(i, Boolean.valueOf(z));
    }

    public final void A1a(C23u c23u, int i) {
        this.A00.put(i, c23u);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void A1b(GraphQLServiceFactory graphQLServiceFactory, C2x5 c2x5) {
        int i;
        String str;
        int i2;
        String str2;
        int i3;
        String A00;
        int i4;
        String str3;
        int i5;
        String str4;
        int i6;
        String str5;
        int i7;
        String str6;
        int i8;
        String str7;
        switch (this.mTypeTag) {
            case -2056063518:
                i6 = 1284144495;
                str5 = "predicted_watch_time_second";
                A1j(c2x5, str5, i6);
                return;
            case -1867945479:
                A1p(c2x5, "chevron_menu_control_data", 1921506088);
                A1p(c2x5, "inline_control_data", 951229746);
                A1m(c2x5, "log_data", 2013228997);
                A1p(c2x5, "long_press_menu_control_data", -99379603);
                i2 = -2112855163;
                str2 = "smsl_state";
                A1p(c2x5, str2, i2);
                return;
            case -1844194482:
                i = -1133610173;
                str = "was_self_disclosed_as_ai_generated";
                A1f(c2x5, str, i);
                return;
            case -1817217133:
                i3 = -660095873;
                A00 = "nux_string";
                A1m(c2x5, A00, i3);
                return;
            case -1698577941:
                A1m(c2x5, "contextual_text", 1516006747);
                A1p(c2x5, "negative_button_data", 198964109);
                A1p(c2x5, "positive_button_data", -1611859119);
                i8 = 1503093179;
                str7 = "triggers";
                A1q(c2x5, str7, i8);
                return;
            case -1640964695:
                A1m(c2x5, "body_text", 1253013930);
                A1m(c2x5, "body_text_for_stateful_undo", -61643348);
                A1m(c2x5, "click_toast_text", 1657828188);
                A1m(c2x5, "title_text", -1773366604);
                A1m(c2x5, "title_text_for_stateful_undo", 652480566);
                A1m(c2x5, "undo_button_text", -881686721);
                i3 = -1332100857;
                A00 = "undo_from_chevron_menu_toast_text";
                A1m(c2x5, A00, i3);
                return;
            case -1613781022:
                i3 = 3355;
                A00 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                A1m(c2x5, A00, i3);
                return;
            case -1613607996:
                A1Q(this, c2x5);
                i8 = 104993457;
                str7 = "nodes";
                A1q(c2x5, str7, i8);
                return;
            case -1389043135:
                A1h(c2x5, "destination_app", -1762249104);
                A1m(c2x5, "destination_id", 912984812);
                A1h(c2x5, "destination_surface", -333846148);
                A1f(c2x5, "eligibility_check_result", -542926170);
                i4 = -1285460811;
                str3 = "sharing_status";
                A1h(c2x5, str3, i4);
                return;
            case -1065104500:
                i8 = -1446666299;
                str7 = "keyframes";
                A1q(c2x5, str7, i8);
                return;
            case -958840806:
                A1f(c2x5, "enable_animation", 1696494536);
                A1h(c2x5, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 3373707);
                A1h(c2x5, "pivot_style", 1498780532);
                A1m(c2x5, "pivot_usecase_type", -807148001);
                i5 = 384313320;
                str4 = "trigger_time_s";
                A1k(c2x5, str4, i5);
                return;
            case -840078747:
                A1m(c2x5, "topic_title", -92376248);
                i4 = -834248630;
                str3 = "topic_type";
                A1h(c2x5, str3, i4);
                return;
            case -787600294:
                A1h(c2x5, "top_action", -1172930464);
                i2 = 3599307;
                str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                A1p(c2x5, str2, i2);
                return;
            case -677119113:
                A1h(c2x5, "state", 109757585);
                i3 = 1717754021;
                A00 = "story_id";
                A1m(c2x5, A00, i3);
                return;
            case -613304270:
                A1p(c2x5, 1BJ.A00(209), 512462487);
                i8 = -648752041;
                str7 = "triggered";
                A1q(c2x5, str7, i8);
                return;
            case -574342171:
                i4 = 3575610;
                str3 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                A1h(c2x5, str3, i4);
                return;
            case 78437685:
                i8 = 104993457;
                str7 = "nodes";
                A1q(c2x5, str7, i8);
                return;
            case 91846172:
                A1f(c2x5, "broadcaster_forced_playback", 1385454512);
                A1f(c2x5, "is_video_eligible", 1769298128);
                i7 = -515410099;
                str6 = "subscription_url";
                A1r(c2x5, str6, i7);
                return;
            case 327529191:
                A1N(this, c2x5);
                A1f(c2x5, JQw.A00(87), -2052343406);
                i2 = -942103664;
                str2 = "text_with_mentions";
                A1p(c2x5, str2, i2);
                return;
            case 463546237:
                A1m(c2x5, "interest_id", 1973387856);
                i6 = 109264530;
                str5 = "score";
                A1j(c2x5, str5, i6);
                return;
            case 469526138:
                A1k(c2x5, "end_time_ms", -557632268);
                A1q(c2x5, "license_music", -1555701593);
                i5 = 1106770299;
                str4 = "start_time_ms";
                A1k(c2x5, str4, i5);
                return;
            case 471252091:
                i7 = 116079;
                str6 = "url";
                A1r(c2x5, str6, i7);
                return;
            case 584386647:
                A1k(c2x5, "pitch", 106677056);
                A1o(c2x5, "timestamp", 55126294);
                i5 = 119407;
                str4 = "yaw";
                A1k(c2x5, str4, i5);
                return;
            case 589518240:
                A1m(c2x5, "button_text", -1759410662);
                A1m(c2x5, "click_toast_text", 1657828188);
                A1m(c2x5, "click_undo_text", -1937405519);
                i3 = -1390617967;
                A00 = "icon_name";
                A1m(c2x5, A00, i3);
                return;
            case 724608069:
                i8 = -634609193;
                str7 = "destinaton_info_list_response";
                A1q(c2x5, str7, i8);
                return;
            case 765115426:
                A1p(c2x5, "action_link", 1583504483);
                A1m(c2x5, "contextual_text", 1516006747);
                A1f(c2x5, "display_ui", -914519247);
                A1p(c2x5, "negative_button_data", 198964109);
                A1p(c2x5, "positive_button_data", -1611859119);
                A1h(c2x5, "rendering_position", 1390248316);
                i4 = -1997386178;
                str3 = "rendering_style";
                A1h(c2x5, str3, i4);
                return;
            case 808345251:
                A1p(c2x5, "action_link", 1583504483);
                A1m(c2x5, "body_text", 1253013930);
                A1p(c2x5, "primary_button_data", 1931782618);
                A1h(c2x5, "rendering_style", -1997386178);
                i2 = 1686663756;
                str2 = "secondary_button_data";
                A1p(c2x5, str2, i2);
                return;
            case 857529263:
                A1j(c2x5, "mute_end_time_in_sec", -510524321);
                i6 = 934616806;
                str5 = "mute_start_time_in_sec";
                A1j(c2x5, str5, i6);
                return;
            case 901883999:
                A1m(c2x5, "feedback_text", -1949663833);
                i3 = -1949644876;
                A00 = AbstractC00603o4.A00(31);
                A1m(c2x5, A00, i3);
                return;
            case 916565684:
                A1p(c2x5, "image", 100313435);
                i4 = -88231890;
                str3 = "work_major_event_media_type";
                A1h(c2x5, str3, i4);
                return;
            case 939722485:
                A1m(c2x5, "title", 110371416);
                i2 = 1352467182;
                str2 = "video_list_poster_art";
                A1p(c2x5, str2, i2);
                return;
            case 988266878:
                A1m(c2x5, "save_link_title", 1940751829);
                A1m(c2x5, "shipping_info", 543071391);
                i3 = 1040011804;
                A00 = "unsave_link_title";
                A1m(c2x5, A00, i3);
                return;
            case 1065879590:
                A1N(this, c2x5);
                i3 = 1634460456;
                A00 = 7zK.A00(ActionId.QUERY_READY);
                A1m(c2x5, A00, i3);
                return;
            case 1345457267:
                A1m(c2x5, "contextual_text", 1516006747);
                A1f(c2x5, "display_ui", -914519247);
                A1p(c2x5, "negative_button_data", 198964109);
                i2 = -1611859119;
                str2 = "positive_button_data";
                A1p(c2x5, str2, i2);
                return;
            case 1481419358:
                i = -2116193879;
                str = "is_active_account";
                A1f(c2x5, str, i);
                return;
            case 1798702935:
                A1m(c2x5, "hashtag_representation", -1681360480);
                i3 = 3355;
                A00 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                A1m(c2x5, A00, i3);
                return;
            case 1870161736:
                A1i(c2x5, "moderation_assist_upsell_suggestions", 949099994);
                i2 = 1531022064;
                str2 = "tombstone_upsell_title";
                A1p(c2x5, str2, i2);
                return;
            case 1893375257:
                A1i(c2x5, "gen_ai_provenance_type", -1061168688);
                A1h(c2x5, "gen_ai_transparency_type", 1875234041);
                i = 1916708350;
                str = "was_detected_as_ai_generated";
                A1f(c2x5, str, i);
                return;
            case 2122006329:
                A1m(c2x5, "animated_icon_url", 1677032389);
                i4 = 1638774433;
                str3 = "icon_id";
                A1h(c2x5, str3, i4);
                return;
            default:
                return;
        }
    }

    public final void A1f(C2x5 c2x5, String str, int i) {
        Object obj = this.A00.get(i, null);
        if (obj != null) {
            c2x5.setBoolean(str, (Boolean) obj);
        }
    }

    public final void A1g(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            c2x5.setString(str, (String) obj2);
        }
    }

    public final void A1h(C2x5 c2x5, String str, int i) {
        Object obj = this.A00.get(i, null);
        if (obj != null) {
            c2x5.setString(str, ((Enum) obj).name());
        }
    }

    public final void A1i(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (obj2 != null) {
                1Du it = ((ImmutableCollection) obj2).iterator();
                while (it.hasNext()) {
                    builder.m11011add((Object) ((Enum) it.next()).name());
                }
            }
            c2x5.setStringList(str, builder.build());
        }
    }

    public final void A1j(C2x5 c2x5, String str, int i) {
        Object obj = this.A00.get(i, null);
        if (obj != null) {
            c2x5.setDouble(str, (Double) obj);
        }
    }

    public final void A1k(C2x5 c2x5, String str, int i) {
        Object obj = this.A00.get(i, null);
        if (obj != null) {
            c2x5.setInt(str, (Integer) obj);
        }
    }

    public final void A1l(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            c2x5.setIntList(str, (ImmutableCollection) obj2);
        }
    }

    public final void A1m(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            c2x5.setString(str, (String) obj2);
        }
    }

    public final void A1n(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            c2x5.setStringList(str, (ImmutableCollection) obj2);
        }
    }

    public final void A1o(C2x5 c2x5, String str, int i) {
        Object obj = this.A00.get(i, null);
        if (obj != null) {
            c2x5.setTime(str, (Long) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    public final void A1p(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        ?? r307 = this.A00.get(i, obj);
        if (r307 != obj) {
            2JZ r3072 = r307;
            if (r307 != 0) {
                boolean isValidGraphServicesJNIModel = ((Tree) r307).isValidGraphServicesJNIModel();
                r3072 = r307;
                if (!isValidGraphServicesJNIModel) {
                    BaseModelWithTree baseModelWithTree = (BaseModelWithTree) r307;
                    r3072 = this.A02 ? baseModelWithTree.A0K() : baseModelWithTree.A0L();
                }
            }
            Tree tree = (Tree) r3072;
            if (this.A02) {
                c2x5.setTreeFaster_UNSAFE(str, tree);
            } else {
                c2x5.setTree(str, tree);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v1, types: [com.facebook.graphservice.interfaces.Tree] */
    /* JADX WARN: Type inference failed for: r305v2 */
    /* JADX WARN: Type inference failed for: r305v4 */
    /* JADX WARN: Type inference failed for: r305v5 */
    public final void A1q(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (obj2 != null) {
                1Du it = ((ImmutableCollection) obj2).iterator();
                while (it.hasNext()) {
                    Object obj3 = (Tree) it.next();
                    if (!obj3.isValidGraphServicesJNIModel()) {
                        BaseModelWithTree baseModelWithTree = (BaseModelWithTree) obj3;
                        obj3 = this.A02 ? baseModelWithTree.A0K() : baseModelWithTree.A0L();
                    }
                    builder.m11011add(obj3);
                }
            }
            boolean z = this.A02;
            ImmutableList build = builder.build();
            if (z) {
                c2x5.setTreeListFaster_UNSAFE(str, build);
            } else {
                c2x5.setTreeList(str, build);
            }
        }
    }

    public final void A1r(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            c2x5.setString(str, (String) obj2);
        }
    }

    public final void A1s(C2x5 c2x5, String str, int i) {
        Object obj = BaseModel.A00;
        Object obj2 = this.A00.get(i, obj);
        if (obj2 != obj) {
            c2x5.setStringList(str, (ImmutableCollection) obj2);
        }
    }

    public final void A1t(Enum r302, int i) {
        this.A00.put(i, r302);
    }

    public final void A1u(String str) {
        A1Y(-2073950043, str);
    }
}
