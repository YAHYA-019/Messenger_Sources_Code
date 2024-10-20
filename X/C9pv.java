package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.appointments.plugins.xmactas.disclosurecta.ServicesBookingLiabilityDisclosureAdminMessageCta;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.business.agent.plugins.biim.hintcard.AiAgentComposerBlockHintCardImplementation;
import com.facebook.messaging.business.agent.plugins.biim.takeoverbottomsheet.AiAgentTakeOverBottomSheetDialogModel;
import com.facebook.messaging.business.plugins.businessinitiatedcalling.admintextfrommissedcallsdontallowcalls.DontAllowCallsTextUpdateBusinessCallingPermissionHandler;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.customthreads.plugins.core.theme.adminmessagecta.ChangeThemeAdminMessageCta;
import com.facebook.messaging.integrity.plugins.featurelimits.hintcard.MessengerOnlyAccountsHintCardImplementation;
import com.facebook.messaging.interop.plugins.banner.xacsunset.XacSunsetImplementation;
import com.facebook.messaging.magicwords.plugins.production.adminmessagecta.MagicWordsAdminMessageCta;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;
import com.facebook.messaging.threadview.messagelist.item.video.ThreadViewVideoAttachmentRichPlayer;
import com.facebook.messaging.wellbeing.enforcementfairness.plugins.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.video.player.RichVideoPlayer;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Set;

/* renamed from: X.9pv, reason: invalid class name */
/* loaded from: 9pv.class */
public final class C9pv implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C9pv(6PP r302, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = r302;
        } else {
            this.A01 = r302;
        }
    }

    public C9pv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(6cM r301) {
        C6eh c6eh = (C6eh) r301.A0i.get();
        String str = r301.A0m.A1g;
        c6eh.A00 = str;
        c6eh.A01.remove(str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        ThreadKey threadKey;
        ThreadKey threadKey2;
        Message message;
        String str;
        Message message2;
        String str2;
        switch (this.A00) {
            case 0:
                A05 = 0FI.A05(-1297405169);
                ServicesBookingLiabilityDisclosureAdminMessageCta servicesBookingLiabilityDisclosureAdminMessageCta = (ServicesBookingLiabilityDisclosureAdminMessageCta) this.A01;
                DKT.A05(servicesBookingLiabilityDisclosureAdminMessageCta.A00, servicesBookingLiabilityDisclosureAdminMessageCta.A01, 7zQ.A0P(), new CP0("com.bloks.www.biim.appointment.legal_disclaimer").A03(), 40, 75);
                i = -1268146092;
                0FI.A0B(i, A05);
                return;
            case 1:
                A05 = 0FI.A05(990193112);
                7Hy r0 = ((7Hv) this.A01).A00;
                if (r0 != null) {
                    r0.A00.A05(null);
                }
                i = 825400031;
                0FI.A0B(i, A05);
                return;
            case 2:
                A05 = 0FI.A05(-2079186894);
                AiAgentComposerBlockHintCardImplementation aiAgentComposerBlockHintCardImplementation = (AiAgentComposerBlockHintCardImplementation) this.A01;
                String A00 = 1BJ.A00(233);
                1UG A08 = 1BK.A08(4YV.A0B(), "bm_genai_agent_event");
                if (A08.isSampled()) {
                    ThreadSummary threadSummary = aiAgentComposerBlockHintCardImplementation.A02.A03;
                    String valueOf = String.valueOf((threadSummary == null || (threadKey2 = threadSummary.A0n) == null) ? null : Long.valueOf(threadKey2.A02));
                    A08.A7R("event_type", "click");
                    A08.A7R(AbE.A00(29), "business_takeover");
                    A08.A7R("ui_surface", A00);
                    A08.A7R("consumer_id", valueOf);
                    A08.BZL();
                }
                7zN.A11(view);
                ThreadSummary threadSummary2 = aiAgentComposerBlockHintCardImplementation.A02.A03;
                if (threadSummary2 != null && (threadKey = threadSummary2.A0n) != null) {
                    String valueOf2 = String.valueOf(threadKey.A05);
                    C1pq.A08("pageId", valueOf2);
                    String A0w = 1BK.A0w(threadKey);
                    C1pq.A08("threadId", A0w);
                    String A0z = 4YU.A0z(threadKey);
                    C1pq.A08("userId", A0z);
                    AiAgentTakeOverBottomSheetDialogModel aiAgentTakeOverBottomSheetDialogModel = new AiAgentTakeOverBottomSheetDialogModel(valueOf2, A0w, A0z);
                    94S r02 = MigBottomSheetDialogFragment.A01;
                    Bundle A052 = 1BK.A05();
                    A052.putParcelable("AiAgentTakeOverBottomSheetDialogModel", new OpaqueParcelable(aiAgentTakeOverBottomSheetDialogModel));
                    2Ov baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                    baseMigBottomSheetDialogFragment.setArguments(A052);
                    baseMigBottomSheetDialogFragment.A0m(aiAgentComposerBlockHintCardImplementation.A01, "AiAgentTakeOverBottomSheetDialogFragment");
                }
                i = 491959083;
                0FI.A0B(i, A05);
                return;
            case 3:
                A05 = 0FI.A05(1757406844);
                DontAllowCallsTextUpdateBusinessCallingPermissionHandler dontAllowCallsTextUpdateBusinessCallingPermissionHandler = (DontAllowCallsTextUpdateBusinessCallingPermissionHandler) this.A01;
                Context context = dontAllowCallsTextUpdateBusinessCallingPermissionHandler.A00;
                FbUserSession fbUserSession = dontAllowCallsTextUpdateBusinessCallingPermissionHandler.A01;
                MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(context, fbUserSession, 67399);
                long A0r = dontAllowCallsTextUpdateBusinessCallingPermissionHandler.A03.A0r();
                long A0C = 7zO.A0C(fbUserSession);
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new A1W(0, A0r, A0C, mailboxFeature, A0P), A0P, false);
                i = 2123771848;
                0FI.A0B(i, A05);
                return;
            case 4:
                OneLineComposerView.A08(view, ((6PP) this.A01).A0Q.A00, 0S2.A0N);
                return;
            case 5:
                A05 = 0FI.A05(-1929749062);
                Set set = OneLineComposerView.A1Z;
                i = -312156045;
                0FI.A0B(i, A05);
                return;
            case 6:
                A05 = 0FI.A05(-863977198);
                ChangeThemeAdminMessageCta changeThemeAdminMessageCta = (ChangeThemeAdminMessageCta) this.A01;
                6NA r03 = (6NA) 1Br.A0B(changeThemeAdminMessageCta.A01);
                ThreadKey threadKey3 = changeThemeAdminMessageCta.A05;
                r03.A05(threadKey3, "admin_msg");
                9XW r04 = (9XW) 1Br.A0B(changeThemeAdminMessageCta.A02);
                06Z r05 = changeThemeAdminMessageCta.A00;
                5zD r06 = changeThemeAdminMessageCta.A03;
                r04.A00(r05, 3Do.A03, threadKey3, r06.AgN(), r06.Axg(), r06.BEz(), "admin_msg");
                i = -2120752221;
                0FI.A0B(i, A05);
                return;
            case 7:
                A05 = 0FI.A05(1466072585);
                ((6Nz) this.A01).ANa((AXn) null, 0S2.A01);
                i = -609275157;
                0FI.A0B(i, A05);
                return;
            case 8:
                A05 = 0FI.A05(-2117680624);
                ((63D) this.A01).CWO(1012);
                i = 1151050912;
                0FI.A0B(i, A05);
                return;
            case 9:
                A05 = 0FI.A05(-1834748734);
                ((63D) this.A01).CWO(1012);
                i = 419012164;
                0FI.A0B(i, A05);
                return;
            case 10:
                A05 = 0FI.A05(-734027720);
                Context context2 = ((MessengerOnlyAccountsHintCardImplementation) this.A01).A00;
                7zU.A0u(context2, (FIu) 1Bu.A06(context2, 100011), "https://www.messenger.com/messenger_only/migration/terms_updated/");
                i = -361763672;
                0FI.A0B(i, A05);
                return;
            case 11:
                A05 = 0FI.A05(-477999757);
                Context context3 = ((XacSunsetImplementation) this.A01).A01;
                7zU.A0u(context3, (FIu) 1Bu.A06(context3, 100011), "https://www.facebook.com/help/messenger-app/619453488713104?ref=learn_more");
                i = -897835537;
                0FI.A0B(i, A05);
                return;
            case 12:
                A05 = 0FI.A05(671837240);
                MagicWordsAdminMessageCta magicWordsAdminMessageCta = (MagicWordsAdminMessageCta) this.A01;
                11T.A0D(view);
                1pI A002 = 1vD.A00(view);
                if (A002.BVa()) {
                    ThreadKey threadKey4 = magicWordsAdminMessageCta.A03;
                    CAf.A00(A002, threadKey4, "admin text");
                    ((AcY) 1Br.A0B(magicWordsAdminMessageCta.A01)).A05(magicWordsAdminMessageCta.A00, threadKey4, "admin text");
                }
                i = 305034758;
                0FI.A0B(i, A05);
                return;
            case 13:
                A05 = 0FI.A05(284281541);
                6O9 r07 = ((6uY) this.A01).A06;
                11T.A0D(view);
                r07.Bm1(view, (String) null, 32);
                i = -1173152536;
                0FI.A0B(i, A05);
                return;
            case 14:
                A05 = 0FI.A05(-530077219);
                9VP r08 = (9VP) this.A01;
                FHL fhl = r08.A01;
                fhl.A05((java.util.Map) null);
                if (BXh.A00(fhl.A0B.primaryAction)) {
                    r08.A00.onClick(view);
                }
                i = 628724356;
                0FI.A0B(i, A05);
                return;
            case 15:
                A05 = 0FI.A05(-482223597);
                9VP r09 = (9VP) this.A01;
                FHL fhl2 = r09.A01;
                fhl2.A06((java.util.Map) null);
                if (BXh.A00(fhl2.A0B.secondaryAction)) {
                    r09.A00.onClick(view);
                }
                i = 2052924269;
                0FI.A0B(i, A05);
                return;
            case 16:
                A05 = 0FI.A05(252936054);
                MessageReactionsOverlayFragment.A08((MessageReactionsOverlayFragment) this.A01, true);
                i = 1143124989;
                0FI.A0B(i, A05);
                return;
            case 17:
                A05 = 0FI.A05(1620315229);
                6cM r010 = (6cM) this.A01;
                C00i c00i = 6cM.A1j;
                if (r010.A0m.A1g != null) {
                    RichVideoPlayer richVideoPlayer = r010.A0q.A07;
                    boolean BWa = richVideoPlayer.BWa();
                    C52j c52j = C52j.A2Z;
                    if (BWa) {
                        richVideoPlayer.CWm(c52j);
                        C6eh c6eh = (C6eh) r010.A0i.get();
                        String str3 = r010.A0m.A1g;
                        c6eh.A01.add(str3);
                        if (str3.equals(c6eh.A00)) {
                            c6eh.A00 = null;
                        }
                        6cM.A0E(r010);
                    } else {
                        RichVideoPlayer.A02(c52j, richVideoPlayer, richVideoPlayer.Afn());
                        A00(r010);
                        6cM.A0D(r010);
                    }
                }
                i = 1347145615;
                0FI.A0B(i, A05);
                return;
            case 18:
                A05 = 0FI.A05(1643249848);
                6cM r011 = (6cM) this.A01;
                C00i c00i2 = 6cM.A1j;
                if (r011.A1A) {
                    i = 1116259957;
                } else if (6cM.A0R(r011)) {
                    ThreadKey threadKey5 = r011.A0m.A0V;
                    threadKey5.getClass();
                    ((CQo) r011.A1P.get()).A0I(1, ActionId.ACTIVITY_RESUME, threadKey5.A04);
                    r011.A1O.get();
                    06Z r012 = r011.A0D;
                    AnonymousClass622 anonymousClass622 = r011.A0z;
                    str = "";
                    CAt.A00(r012, threadKey5, anonymousClass622 != null ? anonymousClass622.A04.A02("thread_entrypoint", str) : "");
                    i = -1775757881;
                } else if (6cM.A0S(r011)) {
                    i = -1262891514;
                } else {
                    if (!((C6kc) r011.A0S.get()).A03(r011.A0m.A0V) || r011.A0r == null || (message = r011.A0m) == null || message.A08 != null) {
                        6cM.A0L(r011);
                        RichVideoPlayer richVideoPlayer2 = r011.A0q.A07;
                        boolean isPlaying = richVideoPlayer2.isPlaying();
                        C52j c52j2 = C52j.A2Z;
                        if (isPlaying) {
                            richVideoPlayer2.CWm(c52j2);
                        } else {
                            richVideoPlayer2.CXU(c52j2);
                            A00(r011);
                        }
                        if (r011.A0m != null) {
                            ((C9mX) r011.A0U.get()).A04(6Pq.A04, r011.A0m);
                            ((6KB) r011.A1Q.get()).A01(r011.A0E, r011.A0m);
                        }
                    } else {
                        RichVideoPlayer richVideoPlayer3 = r011.A0q.A07;
                        if (richVideoPlayer3.isPlaying()) {
                            C52j c52j3 = C52j.A2Z;
                            richVideoPlayer3.CWm(c52j3);
                            r011.A0r.C1m(r011.A0m, richVideoPlayer3.Afn());
                            richVideoPlayer3.CkD(c52j3, 0);
                        } else {
                            VideoAttachmentData videoAttachmentData = r011.A0k;
                            if (videoAttachmentData != null && videoAttachmentData.A0Q) {
                                richVideoPlayer3.CrU(C52j.A1M, false);
                            }
                            richVideoPlayer3.CXU(C52j.A2Z);
                            A00(r011);
                        }
                    }
                    i = -1730894769;
                }
                0FI.A0B(i, A05);
                return;
            case 19:
                A05 = 0FI.A05(623374833);
                6cM r013 = (6cM) this.A01;
                C00i c00i3 = 6cM.A1j;
                if (r013.A1A) {
                    i = -1956069997;
                } else if (6cM.A0R(r013)) {
                    ThreadKey threadKey6 = r013.A0m.A0V;
                    threadKey6.getClass();
                    ((CQo) r013.A1P.get()).A0I(1, ActionId.ACTIVITY_RESUME, threadKey6.A04);
                    r013.A1O.get();
                    06Z r014 = r013.A0D;
                    AnonymousClass622 anonymousClass6222 = r013.A0z;
                    str2 = "";
                    CAt.A00(r014, threadKey6, anonymousClass6222 != null ? anonymousClass6222.A04.A02("thread_entrypoint", str2) : "");
                    i = 191810923;
                } else if (6cM.A0S(r013)) {
                    i = -1190873631;
                } else {
                    r013.A1S.get();
                    if (!((C6kc) r013.A0S.get()).A03(r013.A0m.A0V) || r013.A0r == null || (message2 = r013.A0m) == null || message2.A08 != null) {
                        if (r013.A10.A01 == 0.0d) {
                            if (!r013.A0q.A07.isPlaying()) {
                                6Sp r015 = (6Sp) r013.A0W.get();
                                Message message3 = r013.A0m;
                                r015.A02(r013.A0D, r013.A1W, message3 != null ? message3.A0V : null, (Object) null, 1BJ.A00(52));
                            }
                            if (r013.A0m != null) {
                                A00(r013);
                            }
                            r013.A17 = true;
                            r013.A17 = false;
                            6cM.A0C(r013);
                        } else {
                            6cM.A05(r013);
                        }
                        ((C9mX) r013.A0U.get()).A04(6Pq.A04, r013.A0m);
                        if (r013.A0m != null) {
                            ((6KB) r013.A1Q.get()).A01(r013.A0E, r013.A0m);
                        }
                        i = 648156666;
                    } else {
                        ThreadViewVideoAttachmentRichPlayer threadViewVideoAttachmentRichPlayer = r013.A0q;
                        C52j c52j4 = C52j.A2Z;
                        RichVideoPlayer richVideoPlayer4 = threadViewVideoAttachmentRichPlayer.A07;
                        richVideoPlayer4.CWm(c52j4);
                        r013.A0r.C1m(r013.A0m, (r013.A0k.A0Q && richVideoPlayer4.BUR()) ? 0 : richVideoPlayer4.Afn());
                        richVideoPlayer4.CkD(c52j4, 0);
                        i = 475353048;
                    }
                }
                0FI.A0B(i, A05);
                return;
            case 20:
                A05 = 0FI.A05(-1317991232);
                final 6cM r016 = (6cM) this.A01;
                C00i c00i4 = 6cM.A1j;
                81Q r017 = 81Q.$redex_init_class;
                int intValue = 6cM.A01(r016).intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        81M r018 = r016.A0r;
                        if (r018 != null) {
                            r018.BxU();
                        }
                        9Pi r019 = (9Pi) r016.A0d.get();
                        Message message4 = r016.A0m;
                        VideoAttachmentData videoAttachmentData2 = r016.A0k;
                        2Jy r020 = new 2Jy(AbstractC00603o4.A00(285));
                        r020.A0D("pigeon_reserved_keyword_module", "video_upload");
                        String A0F = r019.A01.A0F();
                        r020.A0D(1BJ.A00(497), A0F);
                        Enum r310 = A0F;
                        if (message4 != null) {
                            r020.A09(message4.A0V, "thread_key");
                            r020.A0D("message_id", message4.A1V);
                            r020.A0D(1BJ.A00(ActionId.LEGACY_MARKER), message4.A1g);
                            Enum A04 = message4.A04();
                            r020.A09(A04, "message_type");
                            r310 = A04;
                        }
                        Enum r3102 = r310;
                        if (videoAttachmentData2 != null) {
                            Enum r3103 = videoAttachmentData2.A0H;
                            r020.A09(r3103, Property.SYMBOL_Z_ORDER_SOURCE);
                            r020.A0B(AnonymousClass000.A00(55), videoAttachmentData2.A04);
                            r020.A0B("filesize", videoAttachmentData2.A06);
                            r3102 = r3103;
                        }
                        C1kw c1kw = r019.A00;
                        Object obj = r3102;
                        if (8EP.A00 == null) {
                            obj = 8EP.class;
                            synchronized (obj) {
                                try {
                                    if (8EP.A00 == null) {
                                        8EP.A00 = new C2J3(c1kw);
                                    }
                                    obj = obj;
                                } catch (Throwable th) {
                                    Object obj2 = obj;
                                    throw th;
                                }
                            }
                        }
                        8EP.A00.A03(r020);
                    } else if (intValue != 3) {
                        if (intValue == 5) {
                            ((82O) r016.A0c.get()).A03(r016.getContext(), new AXS() { // from class: X.9rt
                                public void BoD() {
                                    6cM r021 = r016;
                                    C00i c00i5 = 6cM.A1j;
                                    C00i c00i6 = r021.A0j;
                                    if (c00i6 != null) {
                                        ((C60e) c00i6.get()).A00 = r021.A0m.A1V;
                                    }
                                    r021.A1K.onClick(r021.A11);
                                }
                            }, r016.A0m.A1V).A00("video_placeholder_click");
                        }
                    }
                    i = 1421202365;
                    0FI.A0B(i, A05);
                    return;
                }
                r016.A1K.onClick(r016.A11);
                i = 1421202365;
                0FI.A0B(i, A05);
                return;
            default:
                A05 = 0FI.A05(691350658);
                ReadOnlyFeatureLimitHintCardImplementation.A01((ReadOnlyFeatureLimitHintCardImplementation) this.A01);
                i = 586268461;
                0FI.A0B(i, A05);
                return;
        }
    }
}
