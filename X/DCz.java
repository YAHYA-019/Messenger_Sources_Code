package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation;
import com.facebook.messaging.storagemanagement.mediamanager.fragment.FullScreenMediaViewFragment;
import com.facebook.messaging.storagemanagement.mediamanager.model.MediaItem;
import com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* loaded from: DCz.class */
public final class DCz extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCz(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C01h A00(Object obj, int i) {
        return C01g.A01(new DCz(obj, i));
    }

    public static void A01(By6 by6, BjO bjO) {
        bjO.A00.add(new D1s(new D21(by6.A00, null, by6.A02, by6.A07.A01)));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v156, types: [com.facebook.messaging.threadlist.threaditemmenu.bottomsheet.SimpleUserControlBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.Fragment, X.8v5] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Parcelable parcelable;
        Object obj;
        int i;
        Object obj2;
        int i2;
        D1y d1y;
        BjO bjO;
        D1w A00;
        By6 by6;
        CuL cuL;
        int i3;
        String str;
        int i4;
        Parcelable parcelable2;
        2pZ parcelableExtra;
        switch (this.A00) {
            case 0:
                return Integer.valueOf(2yD.A00(1Br.A07(((AdvancedCryptoSharedMediaTabContentImplementation) this.A01).A0H), 36603906024806819L));
            case 1:
                return 2yD.A01(1Br.A07(((AdvancedCryptoSharedMediaTabContentImplementation) this.A01).A0H), 36322521242682995L);
            case 2:
                parcelableExtra = ((FbFragmentActivity) this.A01).getIntent().getParcelableExtra("thread_key");
                if (parcelableExtra == null) {
                    throw 1BK.A0h();
                }
                return parcelableExtra;
            case 3:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle == null || (parcelable = bundle.getParcelable("thread_key")) == null) {
                    throw 1BK.A0e();
                }
                return parcelable;
            case 4:
                Ig4 ig4 = (Ig4) this.A01;
                1Br.A0C(ig4.A02);
                return new HeraMessengerHostCallEngine(7zL.A09(), ig4.A05);
            case 5:
                return 1Br.A0B(((Ig4) this.A01).A01);
            case 6:
                return new 9Kd((FullScreenMediaViewFragment) this.A01);
            case 7:
                final 8GL r0 = (8GL) this.A01;
                return new AYE() { // from class: X.9xj
                    public void C69(MediaItem mediaItem) {
                        11T.A0F(mediaItem, 0);
                        8GL r02 = r0;
                        C9hr c9hr = r02.A00;
                        if (c9hr != null) {
                            AnonymousClass966 anonymousClass966 = (AnonymousClass966) c9hr.A05.getValue();
                            if (anonymousClass966 == null) {
                                return;
                            }
                            int ordinal = anonymousClass966.ordinal();
                            if (ordinal == 3) {
                                0fH.A0j("MediaManagerGalleryFragment", "viewFullScreenMediaItem");
                                2Ov fullScreenMediaViewFragment = new FullScreenMediaViewFragment();
                                Bundle A05 = 1BK.A05();
                                A05.putParcelable("media_item_key", mediaItem);
                                fullScreenMediaViewFragment.setArguments(A05);
                                fullScreenMediaViewFragment.A0m(r02.mFragmentManager, "MediaManagerGalleryFragment");
                                return;
                            }
                            if (ordinal != 4) {
                                return;
                            }
                            C9hr c9hr2 = r02.A00;
                            if (c9hr2 != null) {
                                if (c9hr2.A05.getValue() == AnonymousClass966.A06) {
                                    MutableLiveData mutableLiveData = c9hr2.A04;
                                    List list = (List) mutableLiveData.getValue();
                                    if (list == null) {
                                        list = AnonymousClass001.A0s();
                                    }
                                    ArrayList A0s = AnonymousClass001.A0s();
                                    if (list.indexOf(mediaItem) >= 0) {
                                        for (Object obj3 : list) {
                                            if (((MediaItem) obj3).A02 != mediaItem.A02) {
                                                A0s.add(obj3);
                                            }
                                        }
                                    } else {
                                        A0s.addAll(list);
                                        A0s.add(mediaItem);
                                    }
                                    7zP.A0O(c9hr2.A06).A00(mutableLiveData, A0s);
                                    return;
                                }
                                return;
                            }
                        }
                        11T.A0L("viewData");
                        throw 0Q8.createAndThrow();
                    }
                };
            case 8:
                return new 9Ke((8GL) this.A01);
            case 9:
                ?? r02 = ((8fZ) this.A01).A00.A00;
                C9a7 c9a7 = r02.A00;
                if (c9a7 != null) {
                    Context requireContext = r02.requireContext();
                    ((C9aj) 1Br.A0B(c9a7.A0B)).A00("DEVICE_SETTINGS_CLICK");
                    ((C08f) ((08O) 1Br.A0B(c9a7.A08)).A01.get()).A0A(requireContext, 4YU.A0A(1BJ.A00(150)));
                    return 04S.A00;
                }
                11T.A0L("viewData");
                throw 0Q8.createAndThrow();
            case 10:
                C9a7 c9a72 = ((8fZ) this.A01).A00.A00.A00;
                if (c9a72 != null) {
                    c9a72.A00(1Br.A07(((9Kc) 1Br.A0B(c9a72.A0A)).A00).Auy(36607797265309515L));
                    return 04S.A00;
                }
                11T.A0L("viewData");
                throw 0Q8.createAndThrow();
            case 11:
                return new Bi8((C8v5) this.A01);
            case 12:
            case 13:
                9Zn r03 = (9Zn) this.A01;
                C1x1 A0O = 7zP.A0O(r03.A03);
                2bX r04 = r03.A00;
                A0O.A01(r04, Long.valueOf(AnonymousClass001.A05(r04.getValue()) + 1));
                return 04S.A00;
            case 14:
                ((C8W3) this.A01).A00.A01();
                return 04S.A00;
            case 15:
                return new 9Kf((8GQ) this.A01);
            case 16:
                C2741Gms c2741Gms = (C2741Gms) this.A01;
                2S4 r05 = c2741Gms.A05;
                11T.A0A(((IV9) c2741Gms).A00.getContext());
                return r05.A00(68179);
            case 17:
                Hmj hmj = ((C2735Gmk) this.A01).A01;
                if (hmj == null) {
                    return "";
                }
                parcelableExtra = ((OneLineComposerView) hmj.A00.A06.A00).A0Z.A0R.A01().A00;
                if (parcelableExtra == null) {
                    parcelableExtra = "";
                }
                if (parcelableExtra == null) {
                    return "";
                }
                return parcelableExtra;
            case 18:
                obj = this.A01;
                i = 2;
                return new H47(obj, i);
            case 19:
                obj2 = this.A01;
                i2 = 22;
                return new AV3(obj2, i2);
            case 20:
                obj = this.A01;
                i = 3;
                return new H47(obj, i);
            case 21:
                obj2 = this.A01;
                i2 = 23;
                return new AV3(obj2, i2);
            case 22:
                obj2 = this.A01;
                i2 = 24;
                return new AV3(obj2, i2);
            case 23:
                final MigColorScheme migColorScheme = (MigColorScheme) this.A01;
                return new C2ot(migColorScheme) { // from class: X.3cy
                    public final MigColorScheme A00;

                    {
                        11T.A0F(migColorScheme, 1);
                        this.A00 = migColorScheme;
                    }

                    @Override // X.C2ot
                    public /* bridge */ /* synthetic */ 1LI CfM(1Iw r302, Object obj3, Object obj4) {
                        C2fr c2fr = ((C2oe) obj3).A00;
                        11T.A0F(r302, 0);
                        C2pz A002 = C2px.A00(r302);
                        A002.A2Z(c2fr);
                        A002.A0F("android.widget.ImageView");
                        A002.A2Y(this.A00);
                        A002.A2X(C2q0.A08);
                        A002.A12(2RH.A05.A00());
                        A002.A15(2RH.A03.A00());
                        C1rq A003 = C1rg.A00(r302);
                        A003.A2e(A002);
                        A003.A2c();
                        C1ro c1ro = C1ro.CENTER;
                        A003.A2h(c1ro);
                        A003.A2g(c1ro);
                        C1rq A004 = C1rg.A00(r302);
                        A004.A2f(A003.A00);
                        A004.A2g(c1ro);
                        A004.A2h(c1ro);
                        Context context = r302.A0D;
                        A004.A1U(context.getResources().getDimensionPixelSize(2132279328));
                        A004.A1S(context.getResources().getDimensionPixelSize(2132279316));
                        A004.A0S();
                        return A004.A00;
                    }
                };
            case 24:
                final MigColorScheme migColorScheme2 = (MigColorScheme) this.A01;
                return new C2ot(migColorScheme2) { // from class: X.3cx
                    public final MigColorScheme A00;

                    {
                        11T.A0F(migColorScheme2, 1);
                        this.A00 = migColorScheme2;
                    }

                    @Override // X.C2ot
                    public /* bridge */ /* synthetic */ 1LI CfM(1Iw r302, Object obj3, Object obj4) {
                        C2og c2og = (C2og) obj3;
                        11T.A0H(r302, c2og);
                        C2q1 c2q1 = C2q0.A08;
                        C2pz A002 = C2px.A00(r302);
                        A002.A2X(c2q1);
                        A002.A2Z(c2og.A01);
                        A002.A2Y(this.A00);
                        A002.A0F("android.view.View");
                        A002.A0S();
                        C2px A2W = A002.A2W();
                        boolean z = c2og.A03;
                        boolean z2 = c2og.A02;
                        7QI r06 = c2og.A00;
                        Integer num = 0S2.A00;
                        11T.A0D(c2q1);
                        2lQ r07 = 2lO.A02;
                        return new C8ce(A2W, new 2lO(new 2lO((2lO) null, new C02963wp(0S2.A0F, Double.doubleToRawLongBits(2RH.A05.A00()))), new C02963wp(0S2.A09, Double.doubleToRawLongBits(2RH.A03.A00()))), r06, c2q1, num, z, z2);
                    }
                };
            case 25:
                final MigColorScheme migColorScheme3 = (MigColorScheme) this.A01;
                return new C2ot(migColorScheme3) { // from class: X.2os
                    public final MigColorScheme A00;

                    {
                        11T.A0F(migColorScheme3, 1);
                        this.A00 = migColorScheme3;
                    }

                    @Override // X.C2ot
                    public /* bridge */ /* synthetic */ 1LI CfM(1Iw r302, Object obj3, Object obj4) {
                        C2g3 c2g3 = (C2g3) obj3;
                        11T.A0F(r302, 0);
                        11T.A0F(c2g3, 1);
                        C2zn c2zn = new C2zn(r302, new C2ou());
                        C2fr c2fr = c2g3.A00;
                        C2ou c2ou = c2zn.A01;
                        c2ou.A01 = c2fr;
                        BitSet bitSet = c2zn.A02;
                        bitSet.set(1);
                        c2ou.A02 = c2g3.A01;
                        c2ou.A00 = this.A00;
                        bitSet.set(0);
                        c2zn.A24(C26z.VERTICAL, 2RH.A05.A00());
                        c2zn.A24(C26z.END, 2RH.A03.A00());
                        c2zn.A0k(0.0f);
                        C1rs.A05(bitSet, c2zn.A03, 2);
                        c2zn.A0J();
                        return c2ou;
                    }
                };
            case 26:
            case 27:
            default:
                parcelableExtra = new 2pZ(C1u7.A0A, (MigColorScheme) this.A01, false);
                return parcelableExtra;
            case 28:
                return new A9I((MigColorScheme) this.A01);
            case 29:
                ?? baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                Bwz bwz = ((C8t) this.A01).A00;
                11T.A0F(bwz, 0);
                baseMigBottomSheetDialogFragment.A00 = bwz;
                baseMigBottomSheetDialogFragment.A00 = bwz.A03;
                return baseMigBottomSheetDialogFragment;
            case 30:
                parcelableExtra = ((FbFragmentActivity) this.A01).getIntent().getParcelableExtra("params");
                if (parcelableExtra == null) {
                    throw 1BK.A0h();
                }
                return parcelableExtra;
            case 31:
                By6 by62 = ((Bz4) this.A01).A03;
                d1y = new D1y(by62, "MenuItemsWithoutViewer");
                bjO = new BjO();
                D21.A00(by62.A00, by62.A01, by62.A02, by62.A07.A01, bjO);
                DJX djx = DJX.A00;
                11T.A0B(djx);
                bjO.A00.add(BWm.A00(djx, by62, "Advanced_Crypto_Group_Without_Viewer_More_Actions", 1, -1));
                11T.A0B(djx);
                A00 = BWm.A00(djx, by62, "Advanced_Crypto_Group_Without_Viewer_Privacy", 4, -1);
                List list = bjO.A00;
                list.add(A00);
                return new 8Lu(25, new D1t(list), d1y);
            case 32:
                By6 by63 = ((Bz4) this.A01).A03;
                d1y = new D1y(by63, "Advanced_Crypto_One_To_One");
                bjO = new BjO();
                A01(by63, bjO);
                DJX djx2 = DJX.A00;
                11T.A0B(djx2);
                D20.A00(djx2, by63, bjO, "Advanced_Crypto_Message_Request");
                bjO.A00.add(BWm.A00(djx2, by63, "Advanced_Crypto_One_To_One_Primary", -1, -1));
                A00 = BWm.A00(djx2, by63, "Advanced_Crypto_Message_Request_Privacy", 4, 1);
                List list2 = bjO.A00;
                list2.add(A00);
                return new 8Lu(25, new D1t(list2), d1y);
            case 33:
                by6 = ((Bz4) this.A01).A03;
                d1y = new D1y(by6, "Advanced_Crypto_One_To_One");
                bjO = new BjO();
                D21.A00(by6.A00, by6.A01, by6.A02, by6.A07.A01, bjO);
                cuL = DJX.A00;
                11T.A0B(cuL);
                D20.A00(cuL, by6, bjO, "Advanced_Crypto_One_To_One_Viewer_Blocked");
                i3 = -1;
                bjO.A00.add(BWm.A00(cuL, by6, "Advanced_Crypto_One_To_One_Viewer_Blocked_Privacy", 4, -1));
                str = "Advanced_Crypto_One_To_One_Viewer_Blocked_More_Actions";
                i4 = 1;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list22 = bjO.A00;
                list22.add(A00);
                return new 8Lu(25, new D1t(list22), d1y);
            case 34:
                by6 = ((Bz4) this.A01).A03;
                d1y = new D1y(by6, "Ai_Bot");
                bjO = new BjO();
                A01(by6, bjO);
                cuL = DJX.A00;
                11T.A0B(cuL);
                D20.A00(cuL, by6, bjO, "Ai_Bot");
                D1w A002 = BWm.A00(cuL, by6, "Ai_Bot_Info", 22, -1);
                List list3 = bjO.A00;
                list3.add(A002);
                i3 = -1;
                list3.add(BWm.A00(cuL, by6, "Ai_Bot_Privacy", 19, -1));
                str = "Ai_Bot_More_Actions";
                i4 = 1;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list222 = bjO.A00;
                list222.add(A00);
                return new 8Lu(25, new D1t(list222), d1y);
            case 35:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItems");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "One_To_One");
                i3 = -1;
                D1w A003 = BWm.A00(cuL, by6, "Canonical_One_To_One_Top", -1, -1);
                List list4 = bjO.A00;
                list4.add(A003);
                list4.add(BWm.A00(cuL, by6, "Canonical_One_To_One_More_Actions", 1, -1));
                list4.add(BWm.A00(cuL, by6, "Orders", 8, -1));
                str = "Canonical_One_To_One_Privacy";
                i4 = 4;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list2222 = bjO.A00;
                list2222.add(A00);
                return new 8Lu(25, new D1t(list2222), d1y);
            case 36:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItems");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "One_To_One");
                i3 = -1;
                bjO.A00.add(BWm.A00(cuL, by6, "Canonical_One_To_One_Message_Request_Top", -1, -1));
                str = "Canonical_One_To_One_Message_Request_Privacy";
                i4 = 4;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list22222 = bjO.A00;
                list22222.add(A00);
                return new 8Lu(25, new D1t(list22222), d1y);
            case 37:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItems");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "Page");
                i3 = -1;
                D1w A004 = BWm.A00(cuL, by6, "Page_About", 6, -1);
                List list5 = bjO.A00;
                list5.add(A004);
                list5.add(BWm.A00(cuL, by6, "Canonical_One_To_One_Page_Privacy", -1, -1));
                list5.add(BWm.A00(cuL, by6, "Page_Photos", 10, -1));
                list5.add(BWm.A00(cuL, by6, "Page_Products", 17, -1));
                list5.add(BWm.A00(cuL, by6, "About_Business", 12, -1));
                list5.add(BWm.A00(cuL, by6, "Page_Bottom_Photos", 10, -1));
                list5.add(BWm.A00(cuL, by6, "Canonical_One_To_One_Page_More_Actions", 1, -1));
                str = "Orders";
                i4 = 8;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list222222 = bjO.A00;
                list222222.add(A00);
                return new 8Lu(25, new D1t(list222222), d1y);
            case 38:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItems");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "One_To_One");
                i3 = -1;
                D1w A005 = BWm.A00(cuL, by6, "Canonical_One_To_One_Top", -1, -1);
                List list6 = bjO.A00;
                list6.add(A005);
                list6.add(BWm.A00(cuL, by6, "Canonical_One_To_One_Viewer_Blocked_Privacy", 4, -1));
                str = "Canonical_One_To_One_Viewer_Blocked_More_Actions";
                i4 = 1;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list2222222 = bjO.A00;
                list2222222.add(A00);
                return new 8Lu(25, new D1t(list2222222), d1y);
            case 39:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "Community_Info");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "Community_Channel");
                i3 = -1;
                D1w A006 = BWm.A00(cuL, by6, "Canonical_Group_Top", -1, -1);
                List list7 = bjO.A00;
                list7.add(A006);
                list7.add(BWm.A00(cuL, by6, "Community_Profile", -1, -1));
                list7.add(BWm.A00(cuL, by6, "Community_Info", 13, -1));
                str = "Community_Privacy_And_Support";
                i4 = 14;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list22222222 = bjO.A00;
                list22222222.add(A00);
                return new 8Lu(25, new D1t(list22222222), d1y);
            case 40:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItems");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "Group");
                i3 = -1;
                D1w A007 = BWm.A00(cuL, by6, "Canonical_Group_Message_Request_Top", -1, -1);
                List list8 = bjO.A00;
                list8.add(A007);
                list8.add(BWm.A00(cuL, by6, "Canonical_Group_Message_Request_Group_Info", 2, -1));
                str = "Canonical_Group_Message_Request_Privacy";
                i4 = 4;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list222222222 = bjO.A00;
                list222222222.add(A00);
                return new 8Lu(25, new D1t(list222222222), d1y);
            case 41:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItemsWithoutViewer");
                bjO = new BjO();
                A01(by6, bjO);
                i3 = -1;
                bjO.A00.add(BWm.A00(cuL, by6, "Canonical_Group_Without_Viewer_More_Actions", 1, -1));
                str = "Canonical_Group_Without_Viewer_Privacy";
                i4 = 4;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list2222222222 = bjO.A00;
                list2222222222.add(A00);
                return new 8Lu(25, new D1t(list2222222222), d1y);
            case 42:
                by6 = ((Bz4) this.A01).A03;
                d1y = new D1y(by6, "Interop_One_To_One");
                bjO = new BjO();
                D21.A00(by6.A00, by6.A01, by6.A02, by6.A07.A01, bjO);
                cuL = DJX.A00;
                11T.A0B(cuL);
                D20.A00(cuL, by6, bjO, "Interop_One_To_One");
                i3 = -1;
                bjO.A00.add(BWm.A00(cuL, by6, "Interop_One_To_One_Privacy", 4, -1));
                str = "Internal_Settings";
                i4 = 9;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list22222222222 = bjO.A00;
                list22222222222.add(A00);
                return new 8Lu(25, new D1t(list22222222222), d1y);
            case 43:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "Public_Chat");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "Public_Chat");
                i3 = -1;
                D1w A008 = BWm.A00(cuL, by6, "Public_Chats_Customization", 16, -1);
                List list9 = bjO.A00;
                list9.add(A008);
                list9.add(BWm.A00(cuL, by6, "Public_Chats_Info", 2, -1));
                list9.add(BWm.A00(cuL, by6, "Public_Chats_More_Actions", 1, -1));
                str = "Public_Chats_Privacy_Support";
                i4 = 4;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list222222222222 = bjO.A00;
                list222222222222.add(A00);
                return new 8Lu(25, new D1t(list222222222222), d1y);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItems");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "Sms");
                i3 = -1;
                bjO.A00.add(BWm.A00(cuL, by6, "Sms_Group_Members", 3, -1));
                str = "Sms_Group_More_Actions";
                i4 = 1;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list2222222222222 = bjO.A00;
                list2222222222222.add(A00);
                return new 8Lu(25, new D1t(list2222222222222), d1y);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                by6 = ((Bz4) this.A01).A03;
                cuL = new CuL(by6);
                d1y = new D1y(by6, "MenuItems");
                bjO = new BjO();
                A01(by6, bjO);
                D20.A00(cuL, by6, bjO, "Sms");
                i3 = -1;
                D1w A009 = BWm.A00(cuL, by6, "Sms_One_To_One_Top", -1, -1);
                List list10 = bjO.A00;
                list10.add(A009);
                list10.add(BWm.A00(cuL, by6, "Sms_One_To_One_More_Actions", 1, -1));
                str = "Sms_One_To_One_Privacy_And_Support";
                i4 = 4;
                A00 = BWm.A00(cuL, by6, str, i4, i3);
                List list22222222222222 = bjO.A00;
                list22222222222222.add(A00);
                return new 8Lu(25, new D1t(list22222222222222), d1y);
            case 46:
                By6 by64 = ((Bz4) this.A01).A03;
                d1y = new D1y(by64, "Ai_Bot");
                bjO = new BjO();
                A01(by64, bjO);
                DJX djx3 = DJX.A00;
                11T.A0B(djx3);
                D20.A00(djx3, by64, bjO, "Ai_Bot");
                D1w A0010 = BWm.A00(djx3, by64, "Ai_Bot_Creator_Info", 20, -1);
                List list11 = bjO.A00;
                list11.add(A0010);
                list11.add(BWm.A00(djx3, by64, "Ai_Bot_More_Actions", 21, -1));
                list11.add(BWm.A00(djx3, by64, "Ai_Bot_Info", 22, -1));
                A00 = BWm.A00(djx3, by64, "Ai_Bot_Privacy", 4, -1);
                List list222222222222222 = bjO.A00;
                list222222222222222.add(A00);
                return new 8Lu(25, new D1t(list222222222222222), d1y);
            case ActionId.ON_START_END /* 47 */:
                return new D2F((FbUserSession) this.A01);
            case ActionId.QUEUED /* 48 */:
                int i5 = BBc.A09;
                Fragment fragment = (Fragment) this.A01;
                11T.A0F(fragment, 0);
                Bundle bundle2 = fragment.mArguments;
                if (bundle2 == null || (parcelable2 = bundle2.getParcelable("params")) == null) {
                    throw 1BK.A0e();
                }
                return parcelable2;
            case ActionId.IN_PROGRESS /* 49 */:
                ((MN4) this.A01).Cvx(AnonymousClass001.A0K());
                return 04S.A00;
        }
    }
}
