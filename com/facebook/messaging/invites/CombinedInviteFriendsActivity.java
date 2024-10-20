package com.facebook.messaging.invites;

import X.1BK;
import X.1BY;
import X.1Bn;
import X.1JF;
import X.1Kd;
import X.1Lo;
import X.1pK;
import X.2Jy;
import X.4YU;
import X.4iI;
import X.53S;
import X.7zN;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbK;
import X.AbL;
import X.AnonymousClass001;
import X.BHt;
import X.BLn;
import X.Bef;
import X.Beg;
import X.Bei;
import X.BxV;
import X.C1396Ag3;
import X.C1526Akf;
import X.C1550Al5;
import X.C1kw;
import X.C1t1;
import X.C1t3;
import X.C2J3;
import X.C5iw;
import X.C5yw;
import X.Cbt;
import X.Cx9;
import X.CxE;
import X.D4H;
import X.DEF;
import X.QpR;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.contactpicker.ContactPickerParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.google.common.collect.ImmutableList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: CombinedInviteFriendsActivity.class */
public class CombinedInviteFriendsActivity extends FbFragmentActivity implements DEF {
    public static final RequestPermissionsConfig A0C;
    public C1526Akf A00;
    public C1550Al5 A01;
    public BxV A02;
    public Bei A03;
    public 4iI A04;
    public ViewGroup A05;
    public FbUserSession A06;
    public LithoView A07;
    public QpR A08;
    public 53S A09;
    public String A0A;
    public final C1t1 A0B = new Cx9(this, 3);

    static {
        C5iw c5iw = new C5iw();
        c5iw.A00 = 1;
        c5iw.A06 = true;
        A0C = new RequestPermissionsConfig(c5iw);
    }

    public static void A12(CombinedInviteFriendsActivity combinedInviteFriendsActivity) {
        53S r0 = combinedInviteFriendsActivity.A09;
        r0.getClass();
        r0.A00(combinedInviteFriendsActivity).AHQ(A0C, new BHt(combinedInviteFriendsActivity, 1), new String[]{"android.permission.READ_CONTACTS"});
    }

    public static void A15(CombinedInviteFriendsActivity combinedInviteFriendsActivity) {
        MigColorScheme A0d = AbI.A0d(combinedInviteFriendsActivity);
        AbG.A1H(combinedInviteFriendsActivity.A07, A0d);
        LithoView lithoView = combinedInviteFriendsActivity.A07;
        C5yw A0b = 7zN.A0b(lithoView.A09, false);
        A0b.A2b(A0d);
        A0b.A2f(1JF.A0B(combinedInviteFriendsActivity.A0A) ? combinedInviteFriendsActivity.getString(2131954348) : combinedInviteFriendsActivity.A0A);
        CxE.A01(A0b, combinedInviteFriendsActivity, 55);
        AbH.A1R(lithoView, A0b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof C1550Al5) {
            C1550Al5 c1550Al5 = (C1550Al5) fragment;
            this.A01 = c1550Al5;
            c1550Al5.A02 = new Beg(this);
            c1550Al5.A00 = new Cbt(this, 8);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        ((C1t3) 1Lo.A04(this, this.A06, (1BY) null, 33086)).A01(this.A0B);
        super.A2l();
    }

    /* JADX WARN: Type inference failed for: r0v92, types: [androidx.fragment.app.Fragment, X.Al5] */
    /* JADX WARN: Type inference failed for: r305v9, types: [X.1pK, X.Akf] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        ((C1t3) 1Lo.A04(this, this.A06, (1BY) null, 33086)).A00(this.A0B);
        Intent intent = getIntent();
        setContentView(2132541717);
        AbstractMap abstractMap = (AbstractMap) intent.getSerializableExtra("ShareType.invitedUsersMap");
        this.A08 = (QpR) intent.getExtras().get("ShareType.inviteEntryPoint");
        BxV bxV = this.A02;
        bxV.getClass();
        bxV.A00 = this;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            ArrayList A17 = 1BK.A17(abstractMap.keySet());
            BxV bxV2 = this.A02;
            bxV2.getClass();
            HashMap A0u = AnonymousClass001.A0u();
            1Kd.A0F(new D4H(6, bxV2, A17, A0u), bxV2.A02.A01(A17, (List) null), bxV2.A04);
        }
        Object A0b = BDe().A0b("invite_combined_contact_picker_fragment");
        if (A0b instanceof C1550Al5) {
            this.A01 = (C1550Al5) A0b;
        } else if (A0b instanceof C1526Akf) {
            this.A00 = (C1526Akf) A0b;
        }
        if (this.A01 == null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            if (abstractMap != null) {
                4iI r0 = this.A04;
                r0.getClass();
                Iterator A19 = 1BK.A19(abstractMap);
                while (A19.hasNext()) {
                    builder.m11011add((Object) r0.A02(Long.parseLong(AnonymousClass001.A0i(A19))));
                }
            }
            ContactPickerParams contactPickerParams = new ContactPickerParams(BLn.A05, null, builder.build(), true, false, false, true, true, true, true, false, false);
            ?? c1550Al5 = new C1550Al5();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("params", contactPickerParams);
            c1550Al5.setArguments(A05);
            this.A01 = c1550Al5;
        }
        C1526Akf c1526Akf = this.A00;
        C1526Akf c1526Akf2 = c1526Akf;
        if (c1526Akf == null) {
            ?? r305 = new 1pK();
            this.A00 = r305;
            c1526Akf2 = r305;
        }
        c1526Akf2.A01 = new Bef(this);
        A12(this);
        this.A0A = intent.getStringExtra("title");
        this.A05 = (ViewGroup) A2c(2131363109);
        LayoutInflater from = LayoutInflater.from(this);
        AbK.A1D(this, this.A06);
        this.A07 = (LithoView) AbG.A08(from, this.A05, 2132541718);
        A15(this);
        this.A05.addView(this.A07);
        this.A03.getClass();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A06 = AbL.A08(this);
        this.A02 = (BxV) 1Bn.A0E(this, (1BY) null, 84369);
        this.A09 = (53S) 1Bn.A0E(this, (1BY) null, 49478);
        this.A03 = (Bei) 1Bn.A0A(84370);
        this.A04 = AbI.A0Z(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.2J3, X.Ag3] */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Bei bei = this.A03;
        bei.getClass();
        QpR qpR = this.A08;
        2Jy A0H = 4YU.A0H("invite_sheet_closed");
        A0H.A0D("pigeon_reserved_keyword_module", "messages");
        A0H.A0D("entry_point", qpR.toString());
        A0H.A0D("click_point", "back_press");
        C1kw c1kw = bei.A00;
        if (C1396Ag3.A00 == null) {
            synchronized (C1396Ag3.class) {
                if (C1396Ag3.A00 == null) {
                    C1396Ag3.A00 = new C2J3(c1kw);
                }
            }
        }
        C1396Ag3.A00.A03(A0H);
        super.onBackPressed();
    }
}
