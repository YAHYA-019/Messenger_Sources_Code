package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.bugreporter.activity.chooser.ChooserOption;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.messaging.fxcal.identity.model.FxImScreenContentModel;
import com.facebook.messenger.bugreporter.bottomsheet.MessengerBugReporterMenuBottomSheetDialogFragment;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: Fk2.class */
public final class Fk2 implements C5ww {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fk2(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v120, types: [X.E1N, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v266, types: [androidx.fragment.app.Fragment, X.E1T] */
    @Override // X.C5ww
    public void onClick(View view) {
        String A0r;
        String A0r2;
        String A0r3;
        String A0r4;
        String A0r5;
        String A0r6;
        F8U f8u;
        String A0r7;
        String A0r8;
        String str;
        2JY A0B;
        String A0o;
        switch (this.A00) {
            case 0:
                1Iw r0 = (1Iw) this.A02;
                AccountProfileModel accountProfileModel = (AccountProfileModel) this.A01;
                String str2 = accountProfileModel.A0B;
                str = "";
                if (str2 == null) {
                    str2 = str;
                }
                String str3 = accountProfileModel.A0D;
                str = str3 != null ? str3 : "";
                if (r0.A02 != null) {
                    r0.A0G(DKH.A0S(str2, str), "updateState:FxImBottomSheet.updateSelectedProfileAndPhotoState");
                    return;
                }
                return;
            case 1:
                Eok eok = (Eok) this.A02;
                AccountProfileModel accountProfileModel2 = (AccountProfileModel) this.A01;
                2JX r02 = eok.A00;
                String str4 = "";
                if (r02 == null) {
                    A0r = str4;
                    A0r2 = str4;
                    A0r3 = str4;
                    A0r4 = str4;
                    A0r5 = str4;
                    A0r6 = str4;
                } else {
                    A0r = r02.A0r(-878272620);
                    A0r2 = r02.A0r(-1829196280);
                    A0r3 = r02.A0r(-524473729);
                    A0r4 = r02.A0r(-1635301445);
                    A0r5 = r02.A0r(-562845885);
                    A0r6 = r02.A0r(1471841658);
                    str4 = r02.A0r(-387515373);
                }
                FxImScreenContentModel fxImScreenContentModel = new FxImScreenContentModel(null, A0r2, A0r3, A0r4, A0r5, str4, A0r6, null, null, A0r, eok.A03, true, true, false);
                FragmentActivity requireActivity = eok.A02.requireActivity();
                ArrayList<String> arrayList = eok.A04;
                Bundle A05 = 1BK.A05();
                A05.putParcelable("profile", accountProfileModel2);
                A05.putParcelable("screen_content", fxImScreenContentModel);
                A05.putStringArrayList("id_list", arrayList);
                A05.putString("entry_point", "profile_setting");
                E1K e1k = new E1K();
                e1k.setArguments(A05);
                String A0X = AnonymousClass001.A0X(e1k);
                f8u = new F8U(requireActivity);
                f8u.A05 = e1k;
                f8u.A06 = A0X;
                break;
            case 2:
                ElL elL = (ElL) this.A01;
                AccountProfileModel accountProfileModel3 = (AccountProfileModel) this.A02;
                if (!1JF.A0B(accountProfileModel3.A06)) {
                    BJB bjb = elL.A01;
                    LegacyMigBottomSheetDialogFragment A052 = LegacyMigBottomSheetDialogFragment.A05(bjb.A01, false);
                    new 1Iw(bjb.getContext());
                    06Z r03 = bjb.mFragmentManager;
                    MigColorScheme migColorScheme = bjb.A01;
                    String str5 = accountProfileModel3.A03;
                    ImmutableList of = ImmutableList.of((Object) new RIv(accountProfileModel3.A01, (String) null, (String) null));
                    String str6 = accountProfileModel3.A05;
                    String str7 = accountProfileModel3.A02;
                    FXt fXt = new FXt(20, accountProfileModel3, bjb, A052);
                    FXs A00 = FXs.A00(A052, bjb, 19);
                    7zR.A1N(migColorScheme, of);
                    A052.A1C(r03, new 8dH(fXt, A00, (1LI) null, migColorScheme, of, str5, str6, str7), E1N.__redex_internal_original_name);
                    return;
                }
                2JX r04 = elL.A00;
                String str8 = "";
                if (r04 == null) {
                    A0r7 = str8;
                    A0r8 = str8;
                } else {
                    A0r7 = r04.A0r(-878272620);
                    A0r8 = r04.A0r(-1829196280);
                    str8 = r04.A0r(-524473729);
                }
                ?? r05 = elL.A01;
                FxImScreenContentModel fxImScreenContentModel2 = new FxImScreenContentModel(null, A0r8, str8, null, null, null, null, null, null, A0r7, null, false, 1BL.A0L(r05.A01, 1089017719, -777056793).getBooleanValue(-1676713615), false);
                FragmentActivity requireActivity2 = r05.requireActivity();
                ArrayList<String> arrayList2 = elL.A02;
                Bundle A053 = 1BK.A05();
                A053.putParcelable("profile", accountProfileModel3);
                A053.putParcelable("screen_content", fxImScreenContentModel2);
                A053.putStringArrayList("id_list", arrayList2);
                A053.putString("entry_point", "profiles_view");
                E1K e1k2 = new E1K();
                e1k2.setArguments(A053);
                String A0X2 = AnonymousClass001.A0X(e1k2);
                f8u = new F8U(requireActivity2);
                f8u.A05 = e1k2;
                f8u.A06 = A0X2;
                f8u.A01();
                break;
            case 3:
                Edu edu = (Edu) this.A02;
                String A2L = ((2JX) this.A01).A2L();
                E1L e1l = edu.A00;
                String str9 = e1l.A02;
                String A01 = AbstractC11504wo.A01();
                Bundle A054 = 1BK.A05();
                if (str9 != null) {
                    A054.putString("details", str9);
                }
                if (A2L != null) {
                    A054.putString("account_type", A2L);
                }
                A054.putString("session_id", A01);
                BJB e1t = new E1T();
                e1t.setArguments(A054);
                f8u = new F8U(e1l.requireActivity());
                f8u.A06 = AnonymousClass001.A0X(e1t);
                f8u.A05 = e1t;
                f8u.A08 = true;
                f8u.A00 = 2130772065;
                f8u.A01 = 2130772071;
                f8u.A03 = 2130772064;
                f8u.A04 = 2130772072;
                break;
            case 4:
                Edv edv = (Edv) this.A02;
                2JX r06 = (2JX) this.A01;
                E1T e1t2 = edv.A00;
                e1t2.A1e();
                2JX A02 = FJ2.A02((2JX) 1BK.A0r(e1t2.A02.A1U().A2C()), e1t2.A03);
                Ewx ewx = (Ewx) e1t2.A0H.get();
                FbUserSession fbUserSession = e1t2.A01;
                fbUserSession.getClass();
                ewx.A00(fbUserSession, r06, A02, FwK.A01(e1t2, 3), E1T.A06(e1t2));
                return;
            case 5:
                EiP eiP = (EiP) this.A02;
                if (eiP != null) {
                    MigColorScheme migColorScheme2 = (MigColorScheme) this.A01;
                    ?? r07 = eiP.A01;
                    1Iw r08 = eiP.A00;
                    2JX r09 = r07.A02;
                    if (r09 != null) {
                        2JX A012 = FJ2.A01(r09);
                        Euc euc = (Euc) r07.A0F.get();
                        Context context = r07.getContext();
                        2JY A0O = 7zL.A0O(A012, 2JX.class, -992052352, 1502644825, -1754688526);
                        if (A0O == null || (A0B = 1BK.A0B(A0O, 2JX.class, 1738720219, 100899174)) == null || (A0o = A0B.A0o()) == null) {
                            throw AnonymousClass001.A0N("SSO Services is missing required information.");
                        }
                        String A0h = A0B.A0h();
                        if (A0h == null) {
                            throw AnonymousClass001.A0N("SSO Services is missing required information.");
                        }
                        String A0r9 = A0B.A0r(-1539833028);
                        if (A0r9 == null) {
                            throw AnonymousClass001.A0N("SSO Services is missing required information.");
                        }
                        if (A0B.A0r(-1539833028) == null) {
                            throw AnonymousClass001.A0N("SSO Services is missing required information.");
                        }
                        ImmutableList A0c = A0B.A0c(102977465, 2JX.class, 1735178755);
                        11T.A0F(r08, 0);
                        LegacyMigBottomSheetDialogFragment A055 = LegacyMigBottomSheetDialogFragment.A05(migColorScheme2, false);
                        C1em c1em = (C1em) AnonymousClass016.A00(context, C1em.class);
                        06Z BDe = c1em != null ? c1em.BDe() : null;
                        String obj = 8dH.class.toString();
                        ImmutableList A0e = 7zN.A0e(new RIv(A0h, (String) null, (String) null));
                        FXr A022 = FXr.A02(A055, 83);
                        2cM A013 = 2cK.A01(r08, (String) null, 0);
                        if (A0c != null && !A0c.isEmpty()) {
                            1Du it = A0c.iterator();
                            while (it.hasNext()) {
                                2JX A0D = AbG.A0D(it);
                                11T.A0D(A0D);
                                55N A002 = 55M.A00(r08);
                                AnonymousClass557 anonymousClass557 = new AnonymousClass557();
                                anonymousClass557.A05(migColorScheme2);
                                C1u2 A0S = 7zP.A0S(euc.A02);
                                String A2L2 = A0D.A2L();
                                if (A2L2 == null) {
                                    throw AnonymousClass001.A0N("Bottom Sheet is missing required information");
                                }
                                anonymousClass557.A05 = C58x.A00(A0S.A03(A2L2.equals("INSTAGRAM") ? C1u3.A0F : A2L2.equals("FACEBOOK") ? C1u3.A0C : C1u3.A3u), migColorScheme2.AjC(), migColorScheme2.B4h());
                                String A0r10 = DKF.A0r(A0D);
                                if (A0r10 == null) {
                                    throw AnonymousClass001.A0N("Bottom Sheet is missing required information");
                                }
                                anonymousClass557.A08(A0r10);
                                anonymousClass557.A01();
                                String A0i = A0D.A0i();
                                if (A0i == null) {
                                    throw AnonymousClass001.A0N("Bottom Sheet is missing required information");
                                }
                                anonymousClass557.A04 = new Fk6(migColorScheme2, A0i);
                                anonymousClass557.A01 = new Fk5(10, r08, A0D, euc);
                                A002.A2X(anonymousClass557.A00());
                                A013.A2e(A002.A2W());
                            }
                        }
                        A055.A1C(BDe, new 8dH(A022, (View.OnClickListener) null, A013.A00, migColorScheme2, A0e, A0o, A0r9, (String) null), obj);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                EiP eiP2 = (EiP) this.A01;
                if (eiP2 != null) {
                    E1T.A0A(eiP2.A01, null, null, !Dyb.A00((2JX) this.A02));
                    return;
                }
                return;
            default:
                MessengerBugReporterMenuBottomSheetDialogFragment messengerBugReporterMenuBottomSheetDialogFragment = (MessengerBugReporterMenuBottomSheetDialogFragment) this.A01;
                Activity A16 = messengerBugReporterMenuBottomSheetDialogFragment.A16();
                if (A16 != null) {
                    String str10 = ((ChooserOption) this.A02).A03;
                    if (ChooserOption.A08.equals(str10)) {
                        CallerContext callerContext = MessengerBugReporterMenuBottomSheetDialogFragment.A0F;
                        0LS.A09(A16, (Intent) messengerBugReporterMenuBottomSheetDialogFragment.A06.get());
                        return;
                    } else if (ChooserOption.A09.equals(str10)) {
                        CallerContext callerContext2 = MessengerBugReporterMenuBottomSheetDialogFragment.A0F;
                        ((FIu) messengerBugReporterMenuBottomSheetDialogFragment.A07.get()).A08(A16, C0A2.A03(7zK.A00(332)));
                        return;
                    } else {
                        if ("placeholder_uiqr_uri".equals(str10)) {
                            CallerContext callerContext3 = MessengerBugReporterMenuBottomSheetDialogFragment.A0F;
                            1Bn.A0A(82098);
                            messengerBugReporterMenuBottomSheetDialogFragment.A0o();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
        F8U.A00(f8u, 0S2.A01);
    }
}
