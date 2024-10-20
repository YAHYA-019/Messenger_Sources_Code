package com.facebook.zero.internal;

import X.1BL;
import X.1BV;
import X.1CQ;
import X.1iF;
import X.3LH;
import X.AnonymousClass001;
import X.C00i;
import X.G6c;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.util.TriState;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: ZeroGatekeepersDebugActivity.class */
public class ZeroGatekeepersDebugActivity extends FbFragmentActivity {
    public C00i A00;

    public static Spanned A12(SortedSet sortedSet) {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            A0k.append(StringFormatUtil.formatStrLocaleSafe("<font color=\"#%s\">%s</font>", value == TriState.YES ? "008000" : value == TriState.NO ? "e83c3c" : "000000", key));
            A0k.append("<br/>");
        }
        String obj = A0k.toString();
        if (obj == null) {
            obj = "";
        }
        return Html.fromHtml(obj);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(453586272481763L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = 1BV.A00(98544);
        setContentView(2132543605);
        TextView textView = (TextView) findViewById(2131368485);
        TextView textView2 = (TextView) findViewById(2131368503);
        C00i c00i = this.A00;
        c00i.getClass();
        3LH r0 = (3LH) c00i.get();
        TreeMap treeMap = new TreeMap();
        C00i c00i2 = r0.A00;
        treeMap.put("enable_rewrite_for_heroplayer_killswitch", 1BL.A0K(c00i2, "fb4a_allow_carrier_signal_on_wifi", 1BL.A0K(c00i2, "zero_torque_traffic_enforcement", 1BL.A0K(c00i2, "zero_token_new_unknown_state_flow", 1BL.A0K(c00i2, "zero_header_send_state", 1BL.A0K(c00i2, "zero_token_header_response", 1BL.A0K(c00i2, "zero_backup_rewrite_rules", 1BL.A0K(c00i2, "mobile_zero_show_use_data_or_stay_free_screen", 1BL.A0K(c00i2, "fb_app_zero_rating", 1BL.A0K(c00i2, "disable_zero_token_conditional_worker", 1BL.A0K(c00i2, "disable_zero_optin_conditional_worker", 1BL.A0K(c00i2, "disable_zero_h_conditional_worker", 1BL.A0K(c00i2, "dialtone_android_eligibility", 1BL.A0K(c00i2, "android_zero_rating_header_request", 1BL.A0K(c00i2, "android_zero_optin_graphql_fetch", 1BL.A0K(c00i2, "android_fb4a_enable_zero_ip_test", ((1CQ) c00i2.get()).A05(6), treeMap).A05(32), treeMap).A05(33), treeMap).A05(53), treeMap).A05(54), treeMap).A05(55), treeMap).A05(56), treeMap).A05(64), treeMap).A05(76), treeMap).A05(94), treeMap).A05(97), treeMap).A05(95), treeMap).A05(98), treeMap).A05(99), treeMap).A05(61), treeMap).A05(60));
        TreeSet treeSet = new TreeSet(new G6c(21));
        treeSet.addAll(treeMap.entrySet());
        C00i c00i3 = this.A00;
        c00i3.getClass();
        3LH r02 = (3LH) c00i3.get();
        TreeMap treeMap2 = new TreeMap();
        C00i c00i4 = r02.A01;
        treeMap2.put("killswitch_header_config_ping_messenger", 1BL.A0K(c00i4, "zero_block_hping_on_wifi", 1BL.A0K(c00i4, "zero_header_transparency_fb4a_killswitch", 1BL.A0K(c00i4, "zero_sessionless_backup_rewrite_rules", ((1CQ) c00i4.get()).A05(ActionId.RTMP_CONNECTION_FAILED), treeMap2).A05(ActionId.RTMP_CONNECTION_CONNECTED), treeMap2).A05(ActionId.VIDEO_PLAYING), treeMap2).A05(74));
        TreeSet treeSet2 = new TreeSet(new G6c(21));
        treeSet2.addAll(treeMap2.entrySet());
        textView.setText(A12(treeSet));
        textView2.setText(A12(treeSet2));
    }
}
