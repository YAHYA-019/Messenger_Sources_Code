package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jen, reason: case insensitive filesystem */
/* loaded from: Jen.class */
public final class C2960Jen extends 0Cs {
    public static final java.util.Map A05;
    public static final java.util.Map A06;
    public static final java.util.Map A07;
    public static final java.util.Map A08;
    public int A00;
    public final GL7 A01;
    public final GL7 A02;
    public final FyG A03;
    public final java.util.Map A04;

    static {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("button", "android.widget.Button");
        A0u.put("checkbox", "android.widget.CompoundButton");
        A0u.put("checked_text_view", "android.widget.CheckedTextView");
        A0u.put("drop_down_list", "android.widget.Spinner");
        A0u.put("edit_text", "android.widget.EditText");
        A0u.put("grid", "android.widget.GridView");
        A0u.put("image", "android.widget.ImageView");
        A0u.put("list", "android.widget.AbsListView");
        A0u.put("pager", "androidx.viewpager.widget.ViewPager");
        A0u.put("radio_button", "android.widget.RadioButton");
        A0u.put("seek_control", "android.widget.SeekBar");
        A0u.put("switch", "android.widget.Switch");
        A0u.put("tab_bar", "android.widget.TabWidget");
        A0u.put("toggle_button", "android.widget.ToggleButton");
        A0u.put("view_group", "android.view.ViewGroup");
        A0u.put("web_view", "android.webkit.WebView");
        A0u.put("progress_bar", "android.widget.ProgressBar");
        A0u.put("action_bar_tab", "android.app.ActionBar$Tab");
        A0u.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        A0u.put("sliding_drawer", "android.widget.SlidingDrawer");
        A0u.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        A0u.put("toast", "android.widget.Toast$TN");
        A0u.put("alert_dialog", "android.app.AlertDialog");
        A0u.put("date_picker_dialog", "android.app.DatePickerDialog");
        A0u.put("time_picker_dialog", "android.app.TimePickerDialog");
        A0u.put("date_picker", "android.widget.DatePicker");
        A0u.put("time_picker", "android.widget.TimePicker");
        A0u.put("number_picker", "android.widget.NumberPicker");
        A0u.put("scroll_view", "android.widget.ScrollView");
        A0u.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        A0u.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        A0u.put("none", "");
        A08 = Collections.unmodifiableMap(A0u);
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put("click", A00(0Oe.A08));
        A0u2.put("long_click", A00(0Oe.A0L));
        A0u2.put("scroll_forward", A00(0Oe.A0Z));
        A0u2.put("scroll_backward", A00(0Oe.A0X));
        A0u2.put("expand", A00(0Oe.A0H));
        A0u2.put("collapse", A00(0Oe.A09));
        A0u2.put("dismiss", A00(0Oe.A0D));
        A0u2.put("scroll_up", A00(0Oe.A0e));
        A0u2.put("scroll_left", A00(0Oe.A0b));
        A0u2.put("scroll_down", A00(0Oe.A0Y));
        A0u2.put("scroll_right", A00(0Oe.A0c));
        A0u2.put("custom", 7zN.A0h());
        A05 = Collections.unmodifiableMap(A0u2);
        HashMap A0u3 = AnonymousClass001.A0u();
        A0u3.put("percent", 2);
        Integer A0i = 7zN.A0i();
        A0u3.put("float", A0i);
        Integer A0k = 4YU.A0k();
        A0u3.put("int", A0k);
        A07 = Collections.unmodifiableMap(A0u3);
        HashMap A0u4 = AnonymousClass001.A0u();
        A0u4.put("none", A0k);
        A0u4.put("single", A0i);
        A0u4.put("multiple", 2);
        A06 = Collections.unmodifiableMap(A0u4);
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [X.KSi, java.lang.Object] */
    public C2960Jen(GL7 gl7, GL7 gl72, FyG fyG) {
        this.A00 = 1056964608;
        this.A01 = gl7;
        this.A02 = gl72;
        this.A03 = fyG;
        HashMap A0u = AnonymousClass001.A0u();
        List<GL7> AcV = gl7.AcV(55);
        if (AcV != null && !AcV.isEmpty()) {
            for (GL7 gl73 : AcV) {
                String string = gl73.getString(35);
                String string2 = gl73.getString(36);
                GJj AlB = gl73.AlB(38);
                if (string != null) {
                    java.util.Map map = A05;
                    if (map.containsKey(string)) {
                        int A0F = JQy.A0F(string, map);
                        if (map.containsKey("custom") && A0F == JQy.A0F("custom", map)) {
                            A0F = this.A00;
                            this.A00 = A0F + 1;
                        }
                        Integer valueOf = Integer.valueOf(A0F);
                        ?? obj = new Object();
                        ((KSi) obj).A02 = string2;
                        ((KSi) obj).A00 = A0F;
                        ((KSi) obj).A01 = AlB;
                        A0u.put(valueOf, obj);
                    }
                }
            }
        }
        this.A04 = A0u;
    }

    public static Integer A00(0Oe r301) {
        C0k4.A00(r301);
        return Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) r301.A03).getId());
    }

    public boolean A0X(View view, int i, Bundle bundle) {
        GJj gJj;
        KSi kSi = (KSi) 7zN.A0r(this.A04, i);
        if (kSi == null || (gJj = kSi.A01) == null) {
            return super.A0X(view, i, bundle);
        }
        GL7 gl7 = this.A02;
        DKM dkm = new DKM();
        dkm.A0J(gl7, 0);
        Object A01 = FAv.A01(gl7, this.A03, dkm.A0G(), gJj);
        if ((A01 instanceof Number) || (A01 instanceof Boolean)) {
            return FB1.A02(A01);
        }
        FGT.A02("bk.components.AndroidNativeAccessibilityExtension", AnonymousClass001.A0e(A01 != null ? "Got a non-boolean result while evaluating action " : "Got a null result while evaluating action ", AnonymousClass001.A0k(), i));
        return false;
    }

    public void A0a(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Number A0o;
        Number A0o2;
        super.A0a(view, accessibilityNodeInfoCompat);
        GL7 gl7 = this.A01;
        boolean z = gl7.getBoolean(41, false);
        boolean z2 = gl7.getBoolean(49, false);
        boolean z3 = gl7.getBoolean(51, false);
        boolean z4 = gl7.getBoolean(36, false);
        String string = gl7.getString(50);
        String string2 = gl7.getString(45);
        String string3 = gl7.getString(46);
        String string4 = gl7.getString(58);
        String string5 = gl7.getString(57);
        GL7 Ay2 = gl7.Ay2(52);
        GL7 Ay22 = gl7.Ay2(53);
        GL7 Ay23 = gl7.Ay2(54);
        if (Ay2 != null) {
            String string6 = Ay2.getString(40);
            float Amm = Ay2.Amm(38, -1.0f);
            float Amm2 = Ay2.Amm(36, -1.0f);
            float Amm3 = Ay2.Amm(35, -1.0f);
            if (Amm >= 0.0f && Amm3 >= 0.0f && Amm2 >= 0.0f && (A0o2 = 1BK.A0o(string6, A07)) != null) {
                accessibilityNodeInfoCompat.A02.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(A0o2.intValue(), Amm, Amm2, Amm3));
            }
        }
        float f = 0.0f / 0.0f;
        if (Ay22 != null) {
            int i = Ay22.getInt(35, -1);
            int i2 = Ay22.getInt(38, -1);
            boolean z5 = Ay22.getBoolean(36, false);
            String BCx = Ay22.BCx(40, "none");
            if (i >= -1 && i2 >= -1 && (A0o = 1BK.A0o(BCx, A06)) != null) {
                accessibilityNodeInfoCompat.A02.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, z5, A0o.intValue()));
            }
        }
        if (Ay23 != null) {
            int i3 = Ay23.getInt(35, -1);
            int i4 = Ay23.getInt(38, -1);
            int i5 = Ay23.getInt(36, -1);
            int i6 = Ay23.getInt(40, -1);
            if (i3 >= 0 && i4 >= 0 && i5 >= 0 && i6 >= 0) {
                accessibilityNodeInfoCompat.A02.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i6, i3, i5, z, z2));
            }
        }
        Iterator A1A = 1BK.A1A(this.A04);
        while (A1A.hasNext()) {
            KSi kSi = (KSi) A1A.next();
            int i7 = kSi.A00;
            java.util.Map map = A05;
            if (map.containsKey("click") && i7 == JQy.A0F("click", map)) {
                accessibilityNodeInfoCompat.A0C(true);
            } else if (map.containsKey("long_click") && i7 == JQy.A0F("long_click", map)) {
                accessibilityNodeInfoCompat.A02.setLongClickable(true);
            }
            String str = kSi.A02;
            if (str != null) {
                accessibilityNodeInfoCompat.A05(new 0Oe(i7, str));
            } else {
                accessibilityNodeInfoCompat.A04(i7);
            }
        }
        if (z3) {
            accessibilityNodeInfoCompat.A0A(true);
            accessibilityNodeInfoCompat.A0B(z4);
        }
        if (string != null) {
            accessibilityNodeInfoCompat.A02.setTooltipText(string);
        }
        if (string2 != null && !string2.equals("none")) {
            java.util.Map map2 = A08;
            if (map2.containsKey(string2)) {
                accessibilityNodeInfoCompat.A07((CharSequence) map2.get(string2));
            }
        }
        if (string3 != null) {
            accessibilityNodeInfoCompat.A08(string3);
        }
        if (string4 != null) {
            accessibilityNodeInfoCompat.A09(string4);
        }
        if (string5 == null || string5.isEmpty()) {
            return;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
        accessibilityNodeInfo.setContentInvalid(true);
        accessibilityNodeInfo.setError(string5);
    }
}
