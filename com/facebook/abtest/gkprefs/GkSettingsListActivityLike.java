package com.facebook.abtest.gkprefs;

import X.0CU;
import X.0Pz;
import X.0RC;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Bx;
import X.1CQ;
import X.1G0;
import X.1G2;
import X.1G3;
import X.1Ql;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.C04t;
import X.C0ty;
import X.C3o5;
import X.DKE;
import X.DNe;
import X.DYR;
import X.ETn;
import X.FWZ;
import X.FWf;
import X.FWh;
import X.FYa;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.widget.EditText;
import com.facebook.gk.store.GatekeeperWriter;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: GkSettingsListActivityLike.class */
public final class GkSettingsListActivityLike extends DYR {
    public static final 1G2 A09 = 1G3.A00(1G0.A05, "gk_editor_history_v2/");
    public String A00;
    public List A01;
    public final 1Br A04 = 1BK.A0E();
    public final 1CQ A07 = (1CQ) 1Bn.A0A(131254);
    public final 1CQ A08 = (1CQ) 1Bn.A0A(131262);
    public final 1Bx A05 = (1Bx) 1Bi.A03(131249);
    public final 1Bx A06 = (1Bx) 1Bi.A03(131249);
    public final GatekeeperWriter A02 = (GatekeeperWriter) 1Bn.A0A(131255);
    public final GatekeeperWriter A03 = (GatekeeperWriter) 1Bn.A0A(131259);

    private final Preference A00(String str, boolean z) {
        1CQ r308;
        GatekeeperWriter gatekeeperWriter;
        Preference preference = new Preference(((ETn) this).A00);
        if (z) {
            r308 = this.A08;
            gatekeeperWriter = this.A03;
        } else {
            r308 = this.A07;
            gatekeeperWriter = this.A02;
        }
        preference.setOnPreferenceClickListener(new FWf(this, r308, gatekeeperWriter, str, z));
        preference.setTitle(0Pz.A0W(str, z ? " (sessionless)" : ""));
        preference.setSummary(r308.A06(str).toString());
        return preference;
    }

    public static final void A01(GkSettingsListActivityLike gkSettingsListActivityLike) {
        List list;
        PreferenceManager preferenceManager = ((PreferenceActivity) ((ETn) gkSettingsListActivityLike).A00).getPreferenceManager();
        11T.A0A(preferenceManager);
        PreferenceScreen createPreferenceScreen = preferenceManager.createPreferenceScreen(((ETn) gkSettingsListActivityLike).A00);
        DNe dNe = new DNe(((ETn) gkSettingsListActivityLike).A00);
        String str = gkSettingsListActivityLike.A00;
        if (str != null) {
            dNe.setText(str);
        }
        dNe.setTitle("Search Gatekeepers");
        String str2 = gkSettingsListActivityLike.A00;
        if (str2 == null || str2.length() < 3) {
            str2 = "press to start searching";
        }
        dNe.setSummary(str2);
        EditText editText = dNe.getEditText();
        editText.setSelectAllOnFocus(true);
        editText.setSingleLine();
        editText.setImeOptions(3);
        FYa.A00(editText, dNe, 2);
        FWZ.A00(dNe, createPreferenceScreen, gkSettingsListActivityLike, 0);
        String str3 = gkSettingsListActivityLike.A00;
        if (str3 != null && str3.length() >= 3) {
            PreferenceCategory preferenceCategory = new PreferenceCategory(((ETn) gkSettingsListActivityLike).A00);
            preferenceCategory.setTitle(gkSettingsListActivityLike.A00);
            createPreferenceScreen.addPreference(preferenceCategory);
            Iterator it = gkSettingsListActivityLike.A05.Anl().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                11T.A0D(A0i);
                String str4 = gkSettingsListActivityLike.A00;
                11T.A0D(str4);
                if (0CU.A0T(A0i, str4, false)) {
                    createPreferenceScreen.addPreference(gkSettingsListActivityLike.A00(A0i, false));
                }
            }
            Iterator it2 = gkSettingsListActivityLike.A06.Anl().iterator();
            while (it2.hasNext()) {
                String A0i2 = AnonymousClass001.A0i(it2);
                11T.A0D(A0i2);
                String str5 = gkSettingsListActivityLike.A00;
                11T.A0D(str5);
                if (0CU.A0T(A0i2, str5, false)) {
                    createPreferenceScreen.addPreference(gkSettingsListActivityLike.A00(A0i2, true));
                }
            }
        }
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(((ETn) gkSettingsListActivityLike).A00);
        preferenceCategory2.setTitle("Recently Edited: ");
        createPreferenceScreen.addPreference(preferenceCategory2);
        List list2 = gkSettingsListActivityLike.A01;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                List A0U = C3o5.A0U(AnonymousClass001.A0i(it3), ":", 0);
                if (!A0U.isEmpty()) {
                    ListIterator A1F = AbH.A1F(A0U);
                    while (A1F.hasPrevious()) {
                        if (C3o5.A06(A1F) != 0) {
                            list = C3o5.A0V(A0U, A1F);
                            break;
                        }
                    }
                }
                list = C0ty.A00;
                String[] A0n = C3o5.A0n(list);
                createPreferenceScreen.addPreference(gkSettingsListActivityLike.A00(A0n[0], 11T.A0O(A0n[1], ConstantsKt.CAMERA_ID_BACK)));
            }
        }
        Preference preference = new Preference(((ETn) gkSettingsListActivityLike).A00);
        preference.setTitle("Clear");
        FWh.A01(preference, gkSettingsListActivityLike, 0);
        createPreferenceScreen.addPreference(preference);
        ((PreferenceActivity) ((ETn) gkSettingsListActivityLike).A00).setPreferenceScreen(createPreferenceScreen);
    }

    public static final void A02(GkSettingsListActivityLike gkSettingsListActivityLike, String str, boolean z) {
        if (1CQ.A01(z ? gkSettingsListActivityLike.A08 : gkSettingsListActivityLike.A07).A01.get(str) == null) {
            return;
        }
        String A0W = 0Pz.A0W(str, z ? ":1" : ":0");
        List list = gkSettingsListActivityLike.A01;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (11T.A0O(it.next(), A0W)) {
                return;
            }
        }
        List list2 = gkSettingsListActivityLike.A01;
        11T.A0D(list2);
        list2.add(0, A0W);
        while (true) {
            List list3 = gkSettingsListActivityLike.A01;
            11T.A0D(list3);
            if (list3.size() <= 10) {
                return;
            }
            List list4 = gkSettingsListActivityLike.A01;
            11T.A0D(list4);
            List list5 = gkSettingsListActivityLike.A01;
            11T.A0D(list5);
            list4.remove(AnonymousClass001.A04(list5));
        }
    }

    public void A04() {
        List list = this.A01;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                1Ql A08 = 1Br.A08(this.A04);
                1G2 A01 = 1G3.A01(A09, String.valueOf(i));
                List list2 = this.A01;
                11T.A0D(list2);
                A08.CaL(A01, 1BK.A14(list2, i));
                A08.commit();
            }
        }
        super/*X.ETn*/.A04();
    }

    public void A05(Bundle bundle) {
        List list;
        super/*X.ETn*/.A05(bundle);
        this.A00 = "";
        this.A01 = AnonymousClass001.A0s();
        C00i c00i = this.A04.A00;
        FbSharedPreferences A0S = 1BK.A0S(c00i);
        1G2 r0 = A09;
        Set Asu = A0S.Asu(r0);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = Asu.iterator();
        while (it.hasNext()) {
            String A092 = ((1G3) it.next()).A09(r0);
            11T.A0A(A092);
            A0s.add(A092);
        }
        0RC.A0x(A0s);
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            String A0i = AnonymousClass001.A0i(it2);
            String BD0 = 1BK.A0S(c00i).BD0(1G3.A01(r0, A0i));
            if (BD0 == null) {
                BD0 = "";
            }
            List A03 = new C04t(":").A03(BD0, 0);
            if (!A03.isEmpty()) {
                ListIterator A1F = AbH.A1F(A03);
                while (A1F.hasPrevious()) {
                    if (C3o5.A06(A1F) != 0) {
                        list = C3o5.A0V(A03, A1F);
                        break;
                    }
                }
            }
            list = C0ty.A00;
            String[] A0n = C3o5.A0n(list);
            A02(this, A0n[0], 11T.A0O(A0n[1], ConstantsKt.CAMERA_ID_BACK));
            DKE.A1L(r0, 1BL.A0U(c00i), A0i);
        }
        A01(this);
    }
}
