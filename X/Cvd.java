package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.messengerkids.plugins.core.mesettings.MessengerKidsProfileSetting;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.storagemanagement.mediamanager.activity.MediaManagerActivity;
import com.facebook.messaging.usernamesetting.plugins.mesetting.usernamesetting.UsernameSettingImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Cvd.class */
public final class Cvd implements C5ww {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public Cvd(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj4;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A01 = obj5;
    }

    @Override // X.C5ww
    public void onClick(View view) {
        switch (this.A00) {
            case 0:
                Intent A05 = AbF.A05();
                A05.setAction("android.intent.action.VIEW");
                A05.addFlags(335544320);
                String str = C1ic.A0h;
                C9W c9w = (C9W) this.A03;
                String A00 = c9w.A00();
                String A0v = 0Pz.A0v(str, "&fbid=", A00, "&referrer=android_messenger_me_tab");
                11T.A0A(A0v);
                MessengerKidsProfileSetting messengerKidsProfileSetting = (MessengerKidsProfileSetting) this.A05;
                Bf4 bf4 = (Bf4) 1Br.A0B(messengerKidsProfileSetting.A05);
                int i = c9w.A00;
                1UG A08 = 1BK.A08(1Br.A02(bf4.A00), "mk_messenger_me_tab");
                if (A08.isSampled()) {
                    AbF.A1M(A08, "mk_kid_tapped");
                    A08.A5q("badge_count", Integer.valueOf(i));
                    A08.A7R("kid_id", A00);
                    A08.BZL();
                }
                C9W c9w2 = new C9W(c9w.A01, c9w.A02, c9w.A03, AbF.A1E(c9w.A04), 0);
                List list = (List) this.A02;
                int indexOf = list.indexOf(c9w);
                list.remove(c9w);
                list.add(indexOf, c9w2);
                FbUserSession fbUserSession = messengerKidsProfileSetting.A02;
                Context context = (Context) this.A01;
                ((Bvx) 1Lm.A05(context, fbUserSession, 83730)).A03 = list;
                ((DFp) this.A04).D7z();
                Uri A0D = 7zM.A0D(A0v);
                ((C67Q) 1Br.A0B(messengerKidsProfileSetting.A03)).A02(context, A05.setData(A0D), A0D, Uri.parse("https://m.facebook.com/neo/fallback"), fbUserSession, 0S2.A07, null);
                return;
            case 1:
                BmU bmU = (BmU) this.A03;
                HGA hga = (HGA) this.A04;
                ThreadKey threadKey = (ThreadKey) this.A05;
                1F9 r0 = (1F9) this.A02;
                User user = hga.A00;
                if (user == null) {
                    user = 7zN.A0d(AbF.A0y(), hga.A00().id);
                }
                2Ov r02 = bmU.A00;
                ((7XU) 7zO.A0l(r02, 50218)).A03(r02.requireContext(), r02.getParentFragmentManager(), r0, threadKey, user, (ParcelableSecondaryData) null, AbM.A0m((ThreadKey) null, RegularImmutableMap.A03, "cm_reactions", ""));
                return;
            case 2:
                ((9YB) 7zO.A0p(this.A04)).A00("THREAD_MANAGER_THREAD_CLICKED");
                C00i c00i = ((1Br) this.A03).A00;
                String A002 = ((9YC) c00i.get()).A00();
                9YC r03 = (9YC) c00i.get();
                8K5 r04 = ((C8W5) this.A05).A00;
                String A0d = 0Pz.A0d(A002, ", ", r04.A00);
                11T.A0F(A0d, 0);
                1Ql A082 = 1Br.A08(r03.A00);
                A082.CaL(C7Zf.A00((C1wg) 1Br.A0B(r03.A01), 1NK.A6A), A0d);
                A082.commitImmediately();
                Context A0L = 7zP.A0L((C2k6) this.A02);
                Intent A0D2 = C3o5.A0D(A0L, MediaManagerActivity.class);
                A0D2.putExtra(7zK.A00(441), r04.A03);
                7zT.A12(A0L, A0D2, (1Br) this.A01);
                return;
            default:
                UsernameSettingImplementation usernameSettingImplementation = (UsernameSettingImplementation) this.A05;
                Context context2 = (Context) this.A02;
                1G1 r05 = (FbUserSession) this.A03;
                06Z r06 = (06Z) this.A04;
                MigColorScheme migColorScheme = (MigColorScheme) this.A01;
                Bgh bgh = (Bgh) 1Lm.A05(context2, r05, 83966);
                ((C6q) 1Br.A0B(usernameSettingImplementation.A02)).A00("Username");
                String str2 = r05.A02;
                3yM r07 = 3yM.A03;
                3yU r08 = 3yU.A09;
                3yV r09 = 3yV.A0H;
                3yQ r010 = 3yQ.A02;
                Long A0e = 0CW.A0e(str2);
                BOo bOo = BOo.A0U;
                2R2 A083 = AbF.A08(1BK.A08(1Br.A02(bgh.A00), 1BJ.A00(1706)), 200);
                if (4YU.A1X(A083)) {
                    A083.A09(r07, "event_type");
                    0DA r011 = new 0DA();
                    AbJ.A1L(r08, r09, r011);
                    r011.A01((C07n) null, "entry_point");
                    A083.A0A(r011, "surface");
                    0DA r012 = new 0DA();
                    r012.A01(r010, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    0DA r013 = new 0DA();
                    r013.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0e);
                    r012.A02(r013, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    0DA r014 = new 0DA();
                    r014.A01(bOo, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    r012.A02(r014, "button");
                    A083.A0A(r012, "target");
                    A083.BZL();
                }
                ((C6m) 1Lm.A05(context2, r05, 83647)).A01(context2);
                BwF bwF = new BwF(context2, r06, migColorScheme);
                usernameSettingImplementation.A00 = bwF;
                IaH iaH = new IaH(bwF, 3);
                06Z r015 = bwF.A02;
                Bwz A003 = 9DO.A00(r015);
                A003.A03 = bwF.A05;
                ArrayList A0s = AnonymousClass001.A0s();
                C00i c00i2 = bwF.A04.A00;
                A0s.add(new CuA((C1u3) null, bwF, AnonymousClass001.A1O(((9aM) c00i2.get()).A00().length()) ^ true ? 0Pz.A0W("m.me/", ((9aM) c00i2.get()).A00()) : "m.me/", 0));
                Context context3 = bwF.A01;
                A0s.add(new CuA(C1u3.A3C, bwF, 4YU.A0t(context3.getResources(), 2131962639), 2131962639));
                A0s.add(new CuA(C1u3.A1u, bwF, 4YU.A0t(context3.getResources(), 2131962627), 2131962627));
                A003.A04 = 1BL.A0a(A0s);
                A003.A02 = iaH;
                C8t c8t = new C8t(A003);
                bwF.A00 = c8t;
                c8t.A02();
                r015.A0t();
                C8t c8t2 = bwF.A00;
                if (c8t2 != null) {
                    c8t2.A01();
                    return;
                }
                return;
        }
    }
}
