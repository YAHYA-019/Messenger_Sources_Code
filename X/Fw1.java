package X;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.bugreporter.activity.BugReportActivity;
import com.facebook.bugreporter.core.model.BugReport;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.graphql.enums.GraphQLXFBAIMModelAssetCompressionType;
import com.facebook.graphql.enums.GraphQLXFBCoplayDifficulty;
import com.facebook.messaging.attribution.ChatHeadsReplyFlowHandlerActivity;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.rapidreporting.model.DialogStateData;
import com.facebook.stickers.model.StickerCapabilities;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.store.StickerStoreFragment;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Optional;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: Fw1.class */
public final class Fw1 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Fw1(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v159, types: [com.facebook.stickers.store.StickerStoreFragment, androidx.fragment.app.Fragment] */
    public void onFailure(Throwable th) {
        FHh fHh;
        GJj gJj;
        DKc A05;
        C01s A04;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                fHh = (FHh) this.A01;
                gJj = (GJj) this.A02;
                A05 = DKM.A05(DKM.A00(), 04R.A0G());
                FEK.A00(fHh, A05, gJj);
                return;
            case 2:
                ((GEJ) this.A02).Bpw((Exception) th, (List) this.A03, (java.util.Map) null);
                return;
            case 3:
                ((1FX) this.A02).setException(th);
                ((Fbq) this.A01).A02.remove(this.A03);
                return;
            case 4:
                A04 = 1Br.A04(((9TC) this.A03).A02);
                str = "GamingLoginOpenGamingProfileCardInformationDialogHelper";
                str2 = "Fetch failed for NT Gaming Profile Card Information Dialog";
                A04.softReport(str, str2, th);
                7zN.A1a((Function1) this.A02, false);
                return;
            case 5:
                A04 = 1Br.A04(((Eus) this.A03).A02);
                str = "GamingLoginWinbackExperienceHelper";
                str2 = "Fetch failed for NT Winback dialog";
                A04.softReport(str, str2, th);
                7zN.A1a((Function1) this.A02, false);
                return;
            case 6:
                ((InterfaceC01753sq) this.A02).BQ9(th);
                return;
            case 7:
                EBN.A00((FbUserSession) this.A02, (EBN) this.A03, 0S2.A00);
                0fH.A0k("GuidedActionController", "undo-negative-feedback-action-failure");
                return;
            case 8:
                ChatHeadsReplyFlowHandlerActivity chatHeadsReplyFlowHandlerActivity = (ChatHeadsReplyFlowHandlerActivity) this.A01;
                DMV dmv = chatHeadsReplyFlowHandlerActivity.A02;
                if (dmv != null && dmv.isShowing()) {
                    chatHeadsReplyFlowHandlerActivity.A02.dismiss();
                }
                1BK.A09(chatHeadsReplyFlowHandlerActivity.A09).softReport("ChatHeadsReplyFlowHandlerActivity", th);
                C2121Dea A03 = C2121Dea.A03(chatHeadsReplyFlowHandlerActivity);
                A03.A06(2131956708);
                A03.A05(2131956706);
                DKS.A02(A03, this, 8, 2131956707);
                A03.A0C(false);
                A03.A04();
                return;
            case 9:
                fHh = (FHh) this.A01;
                gJj = (GJj) this.A02;
                A05 = DKc.A01;
                FEK.A00(fHh, A05, gJj);
                return;
            case 10:
                ((FAS) this.A01).A0A = false;
                E1q.A01((FbUserSession) this.A02, (E1q) this.A03);
                return;
            case 11:
                ServiceException A00 = ServiceException.A00(th);
                FoR foR = (FoR) this.A01;
                6Gx r0 = foR.A0B;
                FHR A002 = F7K.A00(foR.A03, "fail");
                A002.A04(ER3.A0B);
                String obj = A00.getCause() == null ? null : A00.getCause().toString();
                DUC duc = A002.A00;
                duc.A0D("error_message", obj);
                duc.A0D(TraceFieldType.ErrorCode, A00.errorCode.toString());
                r0.A05(A002);
                FI9.A04(foR.A05, FI9.A00, th);
                return;
            case 12:
                EjO ejO = (EjO) this.A01;
                ejO.A00.A00.A0E.Ccf(ejO.A01, "A network error has occurred", "NETWORK_FAILURE");
                return;
            case 13:
            case 14:
            default:
                ((FHK) this.A03).A07(0S2.A00);
                return;
            case 15:
                ArrayAdapter arrayAdapter = (ArrayAdapter) this.A02;
                StickerPack stickerPack = (StickerPack) this.A03;
                arrayAdapter.add(stickerPack);
                StickerCapabilities stickerCapabilities = stickerPack.A06;
                ?? r02 = (StickerStoreFragment) this.A01;
                (stickerCapabilities.A01((C6xd) r02.A0F.get()) ? r02.A0G : r02.A0H).put(stickerPack.A0B, stickerPack);
                6HM r03 = r02.A0A;
                C8S c8s = new C8S(7zO.A0D((Fragment) r02));
                c8s.A05 = AbK.A12(r02.requireContext());
                c8s.A00(2131957317);
                COW.A01(c8s, r03);
                0fH.A0H(StickerStoreFragment.class, "Deleting downloaded sticker pack failed", th);
                1BK.A09(r02.A0P).softReport(StickerStoreFragment.class.getName(), "Deleting downloaded sticker pack failed", th);
                return;
            case 16:
                0fH.A0y("Survey Remix: ", "Event %s at phase %s Logged Failed", th, new Object[]{R3X.A00((Integer) this.A02), (Qpw) this.A03});
                return;
            case 17:
                Emb emb = (Emb) this.A02;
                String message = th.getMessage();
                ((Eju) this.A01).A00.get();
                emb.A00.ANn(new EEe(emb.A01, message, ((5SL) 1Lo.A06((FbUserSession) this.A03, 49727)).A02(), 1));
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Throwable A0N;
        Object obj2;
        int intValue;
        IllegalStateException A0z;
        Object[] objArr;
        String str;
        2JX r310;
        Object obj3;
        Context context;
        Function1 function1;
        F9o f9o;
        boolean z;
        Object obj4;
        String str2;
        2JY r0;
        2JY A0B;
        Object obj5;
        Object obj6;
        2JY r02;
        2JY A0B2;
        2JX A0L;
        switch (this.A00) {
            case 0:
                BugReport bugReport = (BugReport) obj;
                5TL r03 = (5TL) this.A01;
                Context context2 = (Context) this.A02;
                Optional optional = (Optional) this.A03;
                C00i c00i = r03.A0A;
                FbH fbH = (GKR) c00i.get();
                if (optional.isPresent()) {
                    fbH = new FbH((GKR) c00i.get(), AnonymousClass001.A05(optional.get()));
                }
                Intent A12 = BugReportActivity.A12(context2, fbH, bugReport);
                A12.putExtra(1BJ.A00(13), Qyn.A00(bugReport));
                if (AnonymousClass016.A00(context2, Service.class) != null) {
                    A12.addFlags(268435456);
                }
                0LS.A0A(context2, A12);
                return;
            case 1:
                java.util.Map map = (java.util.Map) obj;
                if (map != null) {
                    EnG enG = (EnG) this.A03;
                    Iterator A0y = AnonymousClass001.A0y(map);
                    while (A0y.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(A0y);
                        ((Ezs) 1Br.A0B(enG.A01)).A04(AnonymousClass001.A0j(A0z2), 1BK.A16(A0z2));
                    }
                }
                FEK.A00((FHh) this.A01, DKM.A08(map), (GJj) this.A02);
                return;
            case 2:
                ((GEJ) this.A02).Bpw((Exception) null, (List) this.A03, (java.util.Map) obj);
                return;
            case 3:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null) {
                    A0N = AnonymousClass001.A0N("server response is null");
                } else {
                    2JY A0B3 = 1BK.A0B((2JY) obj2, 2JX.class, 1290476773, 301758099);
                    if (A0B3 == null) {
                        A0N = AnonymousClass001.A0N("Server returns empty manifest.");
                    } else {
                        ImmutableList A0c = A0B3.A0c(-1068799382, 2JX.class, 1670636976);
                        if (A0c == null) {
                            A0N = AnonymousClass001.A0N("Server returns empty model list.");
                        } else {
                            int size = A0c.size();
                            Set set = (Set) this.A03;
                            if (size == set.size()) {
                                HashMap hashMap = new HashMap(set.size());
                                1Du it = A0c.iterator();
                                while (it.hasNext()) {
                                    2JY A0P = 7zL.A0P(it);
                                    String A0j = A0P.A0j();
                                    if (A0j == null) {
                                        A0N = AnonymousClass001.A0N("NMLML model name is null.");
                                    } else {
                                        VersionedCapability fromServerValue = VersionedCapability.fromServerValue(A0j);
                                        if (fromServerValue == null) {
                                            A0N = DKG.A0z(A0j, "cannot create VersionedCapability out of server NMLML model name: %s");
                                        } else if (!set.contains(fromServerValue)) {
                                            A0N = AnonymousClass001.A0N(StringFormatUtil.formatStrLocaleSafe("client does not request a capability that server sends. requested capabilities: %s but received %s", set, fromServerValue));
                                        } else if (!A0P.hasFieldValue(351608024) || (intValue = A0P.getIntValue(351608024)) == -1) {
                                            A0N = DKG.A0z(fromServerValue.toServerValue(), "Version is not valid for %s");
                                        } else {
                                            ImmutableList A0c2 = A0P.A0c(-1408207997, 2JX.class, -308866877);
                                            if (A0c2 == null) {
                                                A0N = DKG.A0z(fromServerValue, "Asset list is null for model: %s");
                                            } else {
                                                try {
                                                    ArrayList A0s = AnonymousClass001.A0s();
                                                    1Du it2 = A0c2.iterator();
                                                    while (it2.hasNext()) {
                                                        2JY A0N2 = 7zL.A0N(7zL.A0P(it2), 2JX.class, -224170649, 256633444);
                                                        String A0j2 = A0N2.A0j();
                                                        if (A0j2 != null) {
                                                            String A0k = A0N2.A0k();
                                                            if (A0k != null) {
                                                                2JY A0B4 = 1BK.A0B(A0N2, 2JX.class, -450004177, 358774898);
                                                                String A0r = A0B4 != null ? A0B4.A0r(-1316467858) : "";
                                                                String A0m = A0N2.A0m();
                                                                if (A0m != null) {
                                                                    Enum A0g = A0N2.A0g(GraphQLXFBAIMModelAssetCompressionType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -2051744141);
                                                                    ARRequestAsset.CompressionMethod fromString = ARRequestAsset.CompressionMethod.fromString(A0g != null ? A0g.toString() : ARRequestAsset.CompressionMethod.NONE.toString());
                                                                    Object obj7 = Eah.A01.get(AbJ.A1A(A0j2));
                                                                    HC6 hc6 = null;
                                                                    if (obj7 == null) {
                                                                        objArr = new Object[]{A0r};
                                                                        str = "graphQLModelAssetType is null, file name: %s";
                                                                    } else {
                                                                        hc6 = (HC6) Eah.A00.get(obj7);
                                                                        if (hc6 == null) {
                                                                            objArr = new Object[]{obj7};
                                                                            str = "Could not convert GraphQL model asset type: %s";
                                                                        }
                                                                        if (Platform.stringIsNullOrEmpty(A0r) || hc6 != null) {
                                                                            A0s.add(new ARRequestAsset(ARAssetType.SUPPORT, fromString, null, null, hc6, null, fromServerValue, 0S2.A00, A0k, null, A0r, A0r, A0m, A0N2.A0r(1152095023), null, A0N2.A0r(2146135736), null, null, null, intValue, A0N2.getIntValue(1681295657), 0L, false, false, false));
                                                                        } else {
                                                                            A0z = DKG.A0z(A0m, "File name and model asset type are both null. Invalid model metadata. Model uri: %s");
                                                                        }
                                                                    }
                                                                    0fH.A18("ARModelMetadataNMLMLUnifiedDownloader", str, objArr);
                                                                    if (Platform.stringIsNullOrEmpty(A0r)) {
                                                                    }
                                                                    A0s.add(new ARRequestAsset(ARAssetType.SUPPORT, fromString, null, null, hc6, null, fromServerValue, 0S2.A00, A0k, null, A0r, A0r, A0m, A0N2.A0r(1152095023), null, A0N2.A0r(2146135736), null, null, null, intValue, A0N2.getIntValue(1681295657), 0L, false, false, false));
                                                                }
                                                            } else {
                                                                A0z = DKG.A0z(A0j2, "Asset id is null for %s");
                                                            }
                                                        } else {
                                                            A0z = DKG.A0z(fromServerValue.name(), "Asset name is not set for %s");
                                                        }
                                                        throw A0z;
                                                    }
                                                    hashMap.put(fromServerValue, A0s);
                                                } catch (IllegalStateException e) {
                                                    onFailure(e);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                AbF.A1W(this.A02, hashMap);
                                return;
                            }
                            A0N = AnonymousClass001.A0N(StringFormatUtil.formatStrLocaleSafe("# of capabilities requested and received are different. requested: %s, received: %s", set, A0c));
                        }
                    }
                }
                onFailure(A0N);
                return;
            case 4:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                r310 = null;
                if (abstractC08294mh2 != null && (obj3 = abstractC08294mh2.A03) != null) {
                    9TC r04 = (9TC) this.A03;
                    context = (Context) this.A01;
                    2JY r05 = (2JY) obj3;
                    if (r05 != null) {
                        r310 = DKI.A0B(r05, DhU.class, 138906628, -437238491);
                    }
                    function1 = (Function1) this.A02;
                    if (r310 != null) {
                        f9o = r04.A04;
                        new Rsz(r310, f9o.A01(DKC.A16(r310)).A00(context)).A00();
                        z = true;
                        7zN.A1a(function1, z);
                        return;
                    }
                    7zN.A1a(function1, false);
                    z = true;
                    7zN.A1a(function1, z);
                    return;
                }
                function1 = (Function1) this.A02;
                z = false;
                7zN.A1a(function1, z);
                return;
            case 5:
                AbstractC08294mh abstractC08294mh3 = (AbstractC08294mh) obj;
                r310 = null;
                if (abstractC08294mh3 != null && (obj4 = abstractC08294mh3.A03) != null) {
                    Eus eus = (Eus) this.A03;
                    context = (Context) this.A01;
                    2JY r06 = (2JY) obj4;
                    if (r06 != null) {
                        r310 = DKI.A0B(r06, DhW.class, 1838877490, 1914353041);
                    }
                    function1 = (Function1) this.A02;
                    if (r310 != null) {
                        f9o = eus.A04;
                        new Rsz(r310, f9o.A01(DKC.A16(r310)).A00(context)).A00();
                        z = true;
                        7zN.A1a(function1, z);
                        return;
                    }
                    7zN.A1a(function1, false);
                    z = true;
                    7zN.A1a(function1, z);
                    return;
                }
                function1 = (Function1) this.A02;
                z = false;
                7zN.A1a(function1, z);
                return;
            case 6:
                AbstractC08294mh abstractC08294mh4 = (AbstractC08294mh) obj;
                if (abstractC08294mh4 != null) {
                    ((InterfaceC01743sp) this.A03).BQ3(abstractC08294mh4);
                    return;
                }
                return;
            case 7:
                ((EBN) this.A03).A0E((FbUserSession) this.A02);
                0fH.A0l("GuidedActionController", "undo-negative-feedback-action-success");
                return;
            case 8:
                List list = (List) obj;
                02W.A04(AnonymousClass001.A1Q(list.size(), 1));
                MediaResource mediaResource = (MediaResource) list.get(0);
                Intent intent = (Intent) this.A02;
                intent.setDataAndType(mediaResource.A0E, intent.getType());
                intent.putExtra("IS_URI_COPIED", true);
                Intent intent2 = (Intent) this.A03;
                intent2.putExtra(C1xj.A0U, intent);
                ChatHeadsReplyFlowHandlerActivity chatHeadsReplyFlowHandlerActivity = (ChatHeadsReplyFlowHandlerActivity) this.A01;
                DMV dmv = chatHeadsReplyFlowHandlerActivity.A02;
                if (dmv != null && dmv.isShowing()) {
                    chatHeadsReplyFlowHandlerActivity.A02.dismiss();
                }
                ChatHeadsReplyFlowHandlerActivity.A01(intent2, chatHeadsReplyFlowHandlerActivity);
                return;
            case 9:
                3MN r07 = (3MN) obj;
                if (r07 != null && (str2 = r07.A03) != null) {
                    FEK.A00((FHh) this.A01, DKM.A08(str2), (GJj) this.A03);
                    return;
                } else {
                    A0N = AbF.A1D("null secure FDID");
                    onFailure(A0N);
                    return;
                }
            case 10:
                AbstractC08294mh abstractC08294mh5 = (AbstractC08294mh) obj;
                FAS fas = (FAS) this.A01;
                fas.A0A = false;
                if (abstractC08294mh5 == null || (r02 = (2JY) abstractC08294mh5.A03) == null || (A0B2 = 1BK.A0B(r02, 2JX.class, 1841525425, 178385879)) == null || (A0L = 1BL.A0L(A0B2, 96801, 1082548640)) == null) {
                    return;
                }
                fas.A03((GraphQLXFBCoplayDifficulty) A0B2.A0g(GraphQLXFBCoplayDifficulty.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, 1829500859), A0L.A23(), DKG.A13(A0B2, 173778819), A0B2.A0r(98240899), A0B2.getIntValue(-1140089659), A0B2.getIntValue(-462657065));
                return;
            case 11:
                FoR foR = (FoR) this.A01;
                foR.A0A.A01(4RT.A03, (P2pPaymentConfig) this.A02, (P2pPaymentData) this.A03);
                6Gx r08 = foR.A0B;
                FHR A00 = F7K.A00(foR.A03, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
                A00.A04(ER3.A0B);
                r08.A05(A00);
                FHd.A01((Bundle) null, foR.A04, 0S2.A00);
                return;
            case 12:
                AbstractC08294mh abstractC08294mh6 = (AbstractC08294mh) obj;
                EvU evU = (EvU) this.A03;
                Context context3 = (Context) this.A02;
                if (context3 != null) {
                    C2209Dh1 c2209Dh1 = null;
                    if (abstractC08294mh6 != null && (r0 = (2JY) abstractC08294mh6.A03) != null && (A0B = 1BK.A0B(r0, DjH.class, 1919226592, 891200636)) != null) {
                        c2209Dh1 = (C2209Dh1) A0B.A0M(-2040325063, C2209Dh1.class, 523235254);
                    }
                    1Br.A0C(evU.A02);
                    EU9.A00(context3);
                    C2049DaC A002 = EUZ.A00(context3);
                    EoK A003 = FGD.A00(c2209Dh1, (50F) 1Br.A0B(evU.A01));
                    if (A003 == null) {
                        throw AnonymousClass001.A0L("Couldn't parse action fragment");
                    }
                    FAv.A02(context3, A003, A002, DKc.A01, 04R.A0G());
                }
                EjO ejO = (EjO) this.A01;
                ejO.A00.A00.A0E.Ci7(ejO.A01, AnonymousClass001.A12());
                return;
            case 13:
                AbstractC08294mh abstractC08294mh7 = (AbstractC08294mh) obj;
                if (abstractC08294mh7 == null || (obj5 = abstractC08294mh7.A03) == null) {
                    FHK.A02(this.A03);
                    return;
                } else {
                    ((DialogStateData) this.A02).A02 = (2JX) obj5;
                    ((FHK) this.A03).A03();
                    return;
                }
            case 14:
                AbstractC08294mh abstractC08294mh8 = (AbstractC08294mh) obj;
                if (abstractC08294mh8 == null || (obj6 = abstractC08294mh8.A03) == null) {
                    FHK.A02(this.A03);
                    return;
                } else {
                    ((DialogStateData) this.A02).A01 = (2JX) obj6;
                    ((FHK) this.A03).A03();
                    return;
                }
            case 15:
                return;
            case 16:
                OperationResult operationResult = (OperationResult) obj;
                if (operationResult == null) {
                    0fH.A0o("Survey Remix: ", "Failed to get a valid response when sending event");
                    return;
                } else if (operationResult.success) {
                    0fH.A0Y("Survey Remix: ", "RemixSurveyFlowAnalytics", R3X.A00((Integer) this.A02), this.A03, "Survey Remix: ", "%s %s: Event %s at phase %s Logged Successfully");
                    return;
                } else {
                    if (operationResult.errorCode == 29B.A02) {
                        ((FcY) this.A01).A04.A00("remix_net_tessa_event_bad_request");
                        return;
                    }
                    return;
                }
            default:
                Ei1 ei1 = (Ei1) obj;
                Emb emb = (Emb) this.A02;
                int i = ei1.A00;
                String str3 = ei1.A01;
                ((Eju) this.A01).A00.get();
                emb.A00.ANn(new EEe(emb.A01, str3, ((5SL) 1Lo.A06((FbUserSession) this.A03, 49727)).A02(), i));
                return;
        }
    }
}
