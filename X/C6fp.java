package X;

import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.aibot.plugins.core.imagine.composerentrypoint.button.ImagineComposerEntryPoint;
import com.facebook.messaging.aibot.plugins.core.imagine.composerentrypoint.overflow.ImagineComposerOverflowEntryPoint;
import com.facebook.messaging.aibot.plugins.core.promptsheet.composerentrypoint.MetaAIPromptSheetComposerEntryPointImpl;
import com.facebook.messaging.audio.plugins.voiceclip.composerentrypoint.VoiceClipComposerEntryPointImplementation;
import com.facebook.messaging.composer.avatar.plugins.stickersuggestions.entrypoint.StickerSuggestionsComposerEntryPointImplementation;
import com.facebook.messaging.composer.combinedexpression.plugins.buttons.entrypoint.ExpressionEditorActionEntryPoint;
import com.facebook.messaging.composer.writewithai.plugins.entrypoint.WriteWithAiEntryPoint;
import com.facebook.messaging.games.plugins.composerentrypoint.discoverycomposerentrypoint.GamesDiscoveryComposerEntryPointImplementation;
import com.facebook.messaging.media.plugins.mediapicker.composerentrypoint.MediaPickerComposerEntryPointImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.plugins.montagecamera.composerentrypoint.MontageCameraComposerEntryPointImplementation;
import com.facebook.messaging.nativepagereply.plugins.businesstools.composerentrypoint.BusinessToolsComposerEntryPointImplementation;
import com.facebook.messaging.nativepagereply.plugins.catalog.composerentrypoint.CatalogComposerEntryPointImplementation;
import com.facebook.messaging.nativepagereply.plugins.savedreplies.composerentrypoint.BusinessInboxSavedRepliesComposerEntryPointImplementation;
import com.facebook.messaging.payments.plugins.core.composerentrypoint.P2pPaymentComposerEntryPointImplementation;
import com.facebook.messaging.publicchats.plugins.events.createeventcomposerentrypoint.CreateEventComposerEntryPointImplementation;
import com.facebook.messaging.publicchats.plugins.polls.composerentrypoint.CreatePollComposerEntryPointImplementation;
import com.facebook.messaging.rollcall.plugins.rollcall.composerentrypoint.RollCallComposerEntryPointImplementation;
import com.facebook.messaging.suggestedkeyboard.plugins.core.entrypoint.SuggestedEditorActionEntryPoint;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6fp, reason: invalid class name */
/* loaded from: 6fp.class */
public final class C6fp {
    public final C6fr A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C6fp(final Context context, final 06Z r303, final FbUserSession fbUserSession, final 2S4 r305, final 6Qh r306, final 6Qi r307, final 6Qf r308, final C6fo c6fo, final ThreadKey threadKey, final ThreadSummary threadSummary, final MigColorScheme migColorScheme, final 53U r313, final Capabilities capabilities, String str) {
        Rmh rmg;
        switch (str.hashCode()) {
            case -2109576456:
                if (str.equals("TestMoreDrawer")) {
                    rmg = new Rmh(context, r303, fbUserSession, r305, r306, r307, r308, threadKey, threadSummary, migColorScheme, r313, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            case -2092731939:
                if (str.equals("ActionBar")) {
                    rmg = new C6fr(context, r303, fbUserSession, r305, r306, r307, r308, c6fo, threadKey, threadSummary, migColorScheme, r313, capabilities) { // from class: X.6ft
                        public 6gE A01;
                        public C6g9 A02;
                        public 5yY A03;
                        public VoiceClipComposerEntryPointImplementation A04;
                        public MediaPickerComposerEntryPointImplementation A05;
                        public MontageCameraComposerEntryPointImplementation A06;
                        public BusinessToolsComposerEntryPointImplementation A07;
                        public CatalogComposerEntryPointImplementation A08;
                        public BusinessInboxSavedRepliesComposerEntryPointImplementation A09;
                        public P2pPaymentComposerEntryPointImplementation A0A;
                        public C1v5 A0B;
                        public CreatePollComposerEntryPointImplementation A0C;
                        public Object A0D;
                        public Object A0E;
                        public Object A0F;
                        public Object A0G;
                        public Object A0H;
                        public Object A0I;
                        public Object A0J;
                        public Object A0K;
                        public boolean A0L;
                        public String[] A0M;
                        public final Context A0N;
                        public final 06Z A0O;
                        public final FbUserSession A0P;
                        public final 2S4 A0Q;
                        public final 6Qh A0R;
                        public final 6Qi A0S;
                        public final 6Qf A0T;
                        public final C6fo A0U;
                        public final ThreadKey A0V;
                        public final ThreadSummary A0W;
                        public final MigColorScheme A0Y;
                        public final 53U A0Z;
                        public final Capabilities A0a;
                        public int A00 = -1;
                        public final 1YC A0X = 1YC.A03;

                        {
                            this.A0N = context;
                            this.A0P = fbUserSession;
                            this.A0Q = r305;
                            this.A0T = r308;
                            this.A0U = c6fo;
                            this.A0V = threadKey;
                            this.A0W = threadSummary;
                            this.A0a = capabilities;
                            this.A0R = r306;
                            this.A0O = r303;
                            this.A0S = r307;
                            this.A0Z = r313;
                            this.A0Y = migColorScheme;
                        }

                        private void A00() {
                            synchronized (this) {
                                if (!this.A0L) {
                                    if (this.A0N == null) {
                                        throw AnonymousClass001.A0Q("The context passed in the ComposerEntryPointInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                    }
                                    this.A0B = C1v5.A01;
                                    this.A0L = true;
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x00d1 A[Catch: Exception -> 0x0141, all -> 0x015a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0141, blocks: (B:5:0x004c, B:9:0x0059, B:12:0x0065, B:15:0x00d1, B:16:0x00d7, B:17:0x00dd, B:18:0x00e3, B:19:0x00e9, B:20:0x00ef, B:21:0x00f5, B:22:0x00fb, B:23:0x0101, B:25:0x011a, B:26:0x0120, B:27:0x0125, B:27:0x0125, B:30:0x012b, B:35:0x0133, B:37:0x0139, B:38:0x006f, B:39:0x0074, B:42:0x0080, B:45:0x008a, B:46:0x0094, B:49:0x009f, B:51:0x00ac, B:52:0x00b3, B:54:0x00bb, B:57:0x00c5), top: B:4:0x004c, outer: #1 }] */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x018f  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0133 A[Catch: Exception -> 0x0141, all -> 0x015a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0141, blocks: (B:5:0x004c, B:9:0x0059, B:12:0x0065, B:15:0x00d1, B:16:0x00d7, B:17:0x00dd, B:18:0x00e3, B:19:0x00e9, B:20:0x00ef, B:21:0x00f5, B:22:0x00fb, B:23:0x0101, B:25:0x011a, B:26:0x0120, B:27:0x0125, B:27:0x0125, B:30:0x012b, B:35:0x0133, B:37:0x0139, B:38:0x006f, B:39:0x0074, B:42:0x0080, B:45:0x008a, B:46:0x0094, B:49:0x009f, B:51:0x00ac, B:52:0x00b3, B:54:0x00bb, B:57:0x00c5), top: B:4:0x004c, outer: #1 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A01() {
                            /*
                                Method dump skipped, instructions count: 450
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A01():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x00c1 A[Catch: Exception -> 0x011a, all -> 0x0131, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x011a, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x00c1, B:16:0x00c7, B:17:0x00cd, B:18:0x00d3, B:19:0x00d9, B:20:0x00df, B:21:0x00e5, B:23:0x00f4, B:24:0x00fa, B:25:0x00fe, B:25:0x00fe, B:28:0x0104, B:33:0x010c, B:35:0x0112, B:36:0x0068, B:37:0x006d, B:40:0x0079, B:43:0x0081, B:44:0x008a, B:47:0x0093, B:49:0x00a0, B:50:0x00a6, B:52:0x00ac, B:55:0x00b5), top: B:4:0x004b, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x010c A[Catch: Exception -> 0x011a, all -> 0x0131, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x011a, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x00c1, B:16:0x00c7, B:17:0x00cd, B:18:0x00d3, B:19:0x00d9, B:20:0x00df, B:21:0x00e5, B:23:0x00f4, B:24:0x00fa, B:25:0x00fe, B:25:0x00fe, B:28:0x0104, B:33:0x010c, B:35:0x0112, B:36:0x0068, B:37:0x006d, B:40:0x0079, B:43:0x0081, B:44:0x008a, B:47:0x0093, B:49:0x00a0, B:50:0x00a6, B:52:0x00ac, B:55:0x00b5), top: B:4:0x004b, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A02() {
                            /*
                                Method dump skipped, instructions count: 405
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A02():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x010e A[Catch: Exception -> 0x0169, all -> 0x0180, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0169, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x010e, B:16:0x0114, B:17:0x011a, B:18:0x0120, B:20:0x0129, B:21:0x012f, B:22:0x0133, B:22:0x0133, B:25:0x0139, B:30:0x0141, B:32:0x0147, B:33:0x0068, B:34:0x006d, B:37:0x0079, B:40:0x0081, B:41:0x008a, B:46:0x00ff, B:46:0x00ff, B:48:0x0103, B:49:0x0099, B:51:0x00aa, B:66:0x00fa, B:74:0x0156, B:76:0x0161, B:78:0x0168), top: B:4:0x004b, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x01bc  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0141 A[Catch: Exception -> 0x0169, all -> 0x0180, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0169, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x010e, B:16:0x0114, B:17:0x011a, B:18:0x0120, B:20:0x0129, B:21:0x012f, B:22:0x0133, B:22:0x0133, B:25:0x0139, B:30:0x0141, B:32:0x0147, B:33:0x0068, B:34:0x006d, B:37:0x0079, B:40:0x0081, B:41:0x008a, B:46:0x00ff, B:46:0x00ff, B:48:0x0103, B:49:0x0099, B:51:0x00aa, B:66:0x00fa, B:74:0x0156, B:76:0x0161, B:78:0x0168), top: B:4:0x004b, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A03() {
                            /*
                                Method dump skipped, instructions count: 488
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A03():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A04() {
                            /*
                                Method dump skipped, instructions count: 316
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A04():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A05() {
                            /*
                                Method dump skipped, instructions count: 316
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A05():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A06() {
                            /*
                                Method dump skipped, instructions count: 316
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A06():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A07() {
                            /*
                                Method dump skipped, instructions count: 316
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A07():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x00eb, all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00eb, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:17:0x00a5, B:18:0x00aa, B:19:0x00b0, B:20:0x00b6, B:22:0x00c5, B:23:0x00ca, B:24:0x00cf, B:24:0x00cf, B:27:0x00d5, B:32:0x00dd, B:34:0x00e3, B:35:0x0067, B:36:0x006c, B:39:0x0078, B:42:0x0080, B:44:0x008d), top: B:4:0x004a, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[Catch: Exception -> 0x00eb, all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00eb, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:17:0x00a5, B:18:0x00aa, B:19:0x00b0, B:20:0x00b6, B:22:0x00c5, B:23:0x00ca, B:24:0x00cf, B:24:0x00cf, B:27:0x00d5, B:32:0x00dd, B:34:0x00e3, B:35:0x0067, B:36:0x006c, B:39:0x0078, B:42:0x0080, B:44:0x008d), top: B:4:0x004a, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A08() {
                            /*
                                Method dump skipped, instructions count: 348
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.A08():boolean");
                        }

                        @Override // X.C6fr
                        public C6g3 AdN(String str2) {
                            int andIncrement;
                            String str3;
                            C6g3 A00;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement2 = atomicInteger.getAndIncrement();
                            1YC r0 = this.A0X;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement2);
                            Exception e = null;
                            try {
                                A00();
                                try {
                                    try {
                                        if (str2.equals("public_chats_create_poll") && A08()) {
                                            andIncrement = atomicInteger.getAndIncrement();
                                            str3 = "messaging.publicchats.polls.composerentrypoint.CreatePollComposerEntryPointImplementation";
                                            r0.A0A("com.facebook.messaging.publicchats.plugins.polls.composerentrypoint.CreatePollComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.publicchats.plugins.polls.PublicchatsPollsKillSwitch", "getComposerButton");
                                            CreatePollComposerEntryPointImplementation createPollComposerEntryPointImplementation = this.A0C;
                                            C1u3 c1u3 = C1u3.A54;
                                            String string = createPollComposerEntryPointImplementation.A00.getString(2131963429);
                                            C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, string);
                                            new C6g3(null, c1u3, null, null, null, string, "public_chats_create_poll", false, false, false);
                                        } else if (str2.equals("camera") && A03()) {
                                            andIncrement = atomicInteger.getAndIncrement();
                                            str3 = "messaging.montage.montagecamera.composerentrypoint.MontageCameraComposerEntryPointImplementation";
                                            r0.A0A("com.facebook.messaging.montage.plugins.montagecamera.composerentrypoint.MontageCameraComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.montage.plugins.montagecamera.MontageCameraKillSwitch", "getComposerButton");
                                            MontageCameraComposerEntryPointImplementation montageCameraComposerEntryPointImplementation = this.A06;
                                            C1u3 c1u32 = C1u3.A1K;
                                            String string2 = montageCameraComposerEntryPointImplementation.A00.getString(2131954659);
                                            C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, string2);
                                            new C6g3(null, c1u32, null, null, null, string2, "camera", false, false, false);
                                        } else if (str2.equals("gallery") && A02()) {
                                            andIncrement = atomicInteger.getAndIncrement();
                                            str3 = "messaging.media.mediapicker.composerentrypoint.MediaPickerComposerEntryPointImplementation";
                                            r0.A0A("com.facebook.messaging.media.plugins.mediapicker.composerentrypoint.MediaPickerComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.media.plugins.mediapicker.MediaPickerKillSwitchKillSwitch", "getComposerButton");
                                            MediaPickerComposerEntryPointImplementation mediaPickerComposerEntryPointImplementation = this.A05;
                                            C1u3 c1u33 = C1u3.A4t;
                                            String string3 = mediaPickerComposerEntryPointImplementation.A00.getString(2131954667);
                                            C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, string3);
                                            new C6g3(null, c1u33, null, null, null, string3, "gallery", false, false, false);
                                        } else if (str2.equals("saved_reply_v2") && A06()) {
                                            andIncrement = atomicInteger.getAndIncrement();
                                            str3 = "messaging.nativepagereply.savedreplies.composerentrypoint.BusinessInboxSavedRepliesComposerEntryPointImplementation";
                                            r0.A0A("com.facebook.messaging.nativepagereply.plugins.savedreplies.composerentrypoint.BusinessInboxSavedRepliesComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.savedreplies.NativepagereplySavedrepliesKillSwitch", "getComposerButton");
                                            Context context2 = this.A0N;
                                            11T.A0F(context2, 0);
                                            new C6g3(null, C1u3.A4M, null, null, null, 4YV.A0n(context2, 2131954674), "saved_reply_v2", false, false, false);
                                        } else {
                                            if (str2.equals("payment") && A07()) {
                                                int andIncrement3 = atomicInteger.getAndIncrement();
                                                String A10 = 4YU.A10(r0, "getComposerButton", andIncrement3);
                                                try {
                                                    try {
                                                        A00 = this.A0A.A01(this.A0N, this.A0P, this.A0U, this.A0V, this.A0W);
                                                        r0.A04((Exception) null, A10, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement3);
                                                        r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement2);
                                                        return A00;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        throw e;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r0.A04(e, A10, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement3);
                                                    throw th;
                                                }
                                            }
                                            if (str2.equals("voice_clip") && A01()) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str3 = "messaging.audio.voiceclip.composerentrypoint.VoiceClipComposerEntryPointImplementation";
                                                r0.A0A("com.facebook.messaging.audio.plugins.voiceclip.composerentrypoint.VoiceClipComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.audio.plugins.voiceclip.VoiceClipComposerEntryPointCoreKillSwitch", "getComposerButton");
                                                A00 = this.A04.A00();
                                            } else if (str2.equals("business_tools") && A04()) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str3 = "messaging.nativepagereply.businesstools.composerentrypoint.BusinessToolsComposerEntryPointImplementation";
                                                r0.A0A("com.facebook.messaging.nativepagereply.plugins.businesstools.composerentrypoint.BusinessToolsComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.businesstools.BusinessToolsKillSwitch", "getComposerButton");
                                                Context context3 = this.A0N;
                                                C1u3 c1u34 = C1u3.A10;
                                                String string4 = context3.getString(2131954658);
                                                C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, string4);
                                                new C6g3(null, c1u34, null, null, null, string4, "business_tools", false, false, false);
                                            } else {
                                                if (!str2.equals("catalog") || !A05()) {
                                                    r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement2);
                                                    return null;
                                                }
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str3 = "messaging.nativepagereply.catalog.composerentrypoint.CatalogComposerEntryPointImplementation";
                                                r0.A0A("com.facebook.messaging.nativepagereply.plugins.catalog.composerentrypoint.CatalogComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.catalog.BusinessInboxCatalogKillSwitch", "getComposerButton");
                                                Context context4 = this.A0N;
                                                11T.A0F(context4, 0);
                                                new C6g3(null, C1u3.A5t, null, null, null, 4YV.A0n(context4, 2131954660), "catalog", false, false, false);
                                            }
                                        }
                                        r0.A04((Exception) null, str3, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement);
                                        r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement2);
                                        return A00;
                                    } catch (Exception e3) {
                                        throw e3;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r0.A04((Exception) null, str3, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement);
                                }
                            } catch (Throwable th3) {
                                r0.A02(e, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "getComposerButton", andIncrement2);
                                throw th3;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v100, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v102, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v104, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v106, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v108, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v96, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v98, types: [int] */
                        /* JADX WARN: Type inference failed for: r303v1 */
                        /* JADX WARN: Type inference failed for: r303v38 */
                        /* JADX WARN: Type inference failed for: r303v39 */
                        @Override // X.C6fr
                        public String[] Ayr() {
                            String[] strArr = this.A0M;
                            if (strArr == null) {
                                int i = this.A00;
                                int i2 = i;
                                if (i == -1) {
                                    boolean A08 = A08();
                                    boolean z = A08;
                                    if (A03()) {
                                        z = (A08 ? 1 : 0) + 1;
                                    }
                                    boolean z2 = z;
                                    if (A02()) {
                                        z2 = (z ? 1 : 0) + 1;
                                    }
                                    boolean z3 = z2;
                                    if (A06()) {
                                        z3 = (z2 ? 1 : 0) + 1;
                                    }
                                    boolean z4 = z3;
                                    if (A07()) {
                                        z4 = (z3 ? 1 : 0) + 1;
                                    }
                                    boolean z5 = z4;
                                    if (A01()) {
                                        z5 = (z4 ? 1 : 0) + 1;
                                    }
                                    boolean z6 = z5;
                                    if (A04()) {
                                        z6 = (z5 ? 1 : 0) + 1;
                                    }
                                    boolean z7 = z6;
                                    if (A05()) {
                                        z7 = (z6 ? 1 : 0) + 1;
                                    }
                                    this.A00 = z7 ? 1 : 0;
                                    i2 = z7;
                                }
                                int i3 = 0;
                                strArr = new String[i2];
                                if (A08()) {
                                    strArr[0] = "public_chats_create_poll";
                                    i3 = 1;
                                }
                                if (A03()) {
                                    strArr[i3] = "camera";
                                    i3++;
                                }
                                if (A02()) {
                                    strArr[i3] = "gallery";
                                    i3++;
                                }
                                if (A06()) {
                                    strArr[i3] = "saved_reply_v2";
                                    i3++;
                                }
                                if (A07()) {
                                    strArr[i3] = "payment";
                                    i3++;
                                }
                                if (A01()) {
                                    strArr[i3] = "voice_clip";
                                    i3++;
                                }
                                if (A04()) {
                                    strArr[i3] = "business_tools";
                                    i3++;
                                }
                                if (A05()) {
                                    strArr[i3] = "catalog";
                                }
                                this.A0M = strArr;
                            }
                            return strArr;
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r318v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r318v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 316, insn: 0x05e8: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:254:0x05e8 */
                        /* JADX WARN: Not initialized variable reg: 318, insn: 0x05d3: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r318 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:253:0x05cb */
                        @Override // X.C6fr
                        public boolean BVH(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 1550
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.BVH(java.lang.String):boolean");
                        }

                        @Override // X.C6fr
                        public boolean Bht(Intent intent, String str2, int i, int i2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0X;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                            try {
                                A00();
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                                return false;
                            } catch (Throwable th) {
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                                throw th;
                            }
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r328v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 314, insn: 0x0944: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:397:0x0944 */
                        /* JADX WARN: Not initialized variable reg: 316, insn: 0x092e: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:396:0x0926 */
                        /* JADX WARN: Not initialized variable reg: 328, insn: 0x0969: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r328 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:389:0x0969 */
                        @Override // X.C6fr
                        public void BoT(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 2446
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.BoT(java.lang.String):void");
                        }

                        @Override // X.C6fr
                        public void C7Z(String str2) {
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement = atomicInteger.getAndIncrement();
                            1YC r0 = this.A0X;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement);
                            Exception e = null;
                            try {
                                A00();
                                if (str2.equals("payment") && A07()) {
                                    int andIncrement2 = atomicInteger.getAndIncrement();
                                    String A10 = 4YU.A10(r0, "onMoreDrawerKeyboardOpened", andIncrement2);
                                    try {
                                        try {
                                            this.A0A.A03(this.A0P, this.A0U);
                                            r0.A09(A10, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement2);
                                        } catch (Exception e2) {
                                            e = e2;
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        r0.A04(e, A10, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement2);
                                        throw th;
                                    }
                                }
                                r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement);
                            } catch (Throwable th2) {
                                r0.A02(e, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement);
                                throw th2;
                            }
                        }

                        @Override // X.C6fr
                        public void C7a(String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0X;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", A00);
                            try {
                                A00();
                            } finally {
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", A00);
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:125:0x02e0, code lost:
                        
                            if (r331 == false) goto L119;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:133:0x02fc, code lost:
                        
                            if (r331 == false) goto L200;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:137:0x03c5, code lost:
                        
                            if (com.facebook.messaging.nativepagereply.plugins.businesstools.composerentrypoint.BusinessToolsComposerEntryPointImplementation.A01(r0, r0, 2131953671) == false) goto L200;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:140:0x03d8, code lost:
                        
                            r0 = (X.Bc3) r0.A00.get();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:143:0x03ea, code lost:
                        
                            r0 = java.lang.String.valueOf(r0.A05);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:144:0x03f1, code lost:
                        
                            r0 = X.4YU.A0z(r0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:148:0x040b, code lost:
                        
                            r0 = X.1BK.A08(X.1Br.A02(r0.A00), "services_booking_mobile_client_event");
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:151:0x041b, code lost:
                        
                            if (r0.isSampled() == false) goto L194;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:153:0x0427, code lost:
                        
                            r0.A7R("page_id", r0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:155:0x0435, code lost:
                        
                            r0.A7R("consumer_id", r0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:157:0x0447, code lost:
                        
                            r0.A7R("referrer_ui_component", "biim_composer");
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:159:0x0458, code lost:
                        
                            r0.A7R("referrer_ui_surface", "message");
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:161:0x0469, code lost:
                        
                            r0.A7R("event", "booking_admin_biim_appointment_tab_tooltip_impression");
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:163:0x046f, code lost:
                        
                            r0.BZL();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:167:0x0482, code lost:
                        
                            r312 = X.3TE.A00((X.3TE) r0.get());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:168:0x0489, code lost:
                        
                            r303 = X.C2bv.A02;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:181:0x03b1, code lost:
                        
                            if (r331 != false) goto L164;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:191:0x037a, code lost:
                        
                            if (r0 != false) goto L153;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:201:0x0343, code lost:
                        
                            if (r0 != false) goto L142;
                         */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:697)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
                        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
                        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Not initialized variable reg: 314, insn: 0x0619: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:264:0x0611 */
                        @Override // X.C6fr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void CQT(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 1624
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6ft.CQT(java.lang.String):void");
                        }

                        @Override // X.C6fr
                        public boolean CVK(Integer num, Object obj, String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0X;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                            try {
                                A00();
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                                return false;
                            } catch (Throwable th) {
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                                throw th;
                            }
                        }

                        @Override // X.C6fr
                        public boolean CVL(Integer num, Object obj, String str2) {
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement = atomicInteger.getAndIncrement();
                            1YC r0 = this.A0X;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogConfirm", andIncrement);
                            try {
                                A00();
                                boolean z = false;
                                if (str2.equals("payment") && A07()) {
                                    int andIncrement2 = atomicInteger.getAndIncrement();
                                    String A10 = 4YU.A10(r0, "onZeroRatingDialogConfirm", andIncrement2);
                                    try {
                                        try {
                                            z = this.A0A.A04(this.A0N, this.A0P, this.A0R, this.A0U, this.A0V, this.A0W, num, obj);
                                            r0.A04((Exception) null, A10, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogConfirm", andIncrement2);
                                        } catch (Exception e) {
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        r0.A04((Exception) null, A10, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogConfirm", andIncrement2);
                                        throw th;
                                    }
                                }
                                r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogConfirm", andIncrement);
                                return z;
                            } catch (Throwable th2) {
                                r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogConfirm", andIncrement);
                                throw th2;
                            }
                        }
                    };
                    break;
                }
                throw 1BL.A0l(str);
            case -1424598493:
                if (str.equals("EditorAction")) {
                    rmg = new C6fr(context, r303, fbUserSession, r305, r306, r307, r308, threadKey, threadSummary, migColorScheme, r313, capabilities) { // from class: X.6fu
                        public ImagineComposerEntryPoint A01;
                        public StickerSuggestionsComposerEntryPointImplementation A02;
                        public ExpressionEditorActionEntryPoint A03;
                        public WriteWithAiEntryPoint A04;
                        public SuggestedEditorActionEntryPoint A05;
                        public Object A06;
                        public Object A07;
                        public Object A08;
                        public Object A09;
                        public Object A0A;
                        public String[] A0B;
                        public final Context A0C;
                        public final 06Z A0D;
                        public final FbUserSession A0E;
                        public final 2S4 A0F;
                        public final 6Qh A0G;
                        public final 6Qi A0H;
                        public final 6Qf A0I;
                        public final ThreadKey A0J;
                        public final ThreadSummary A0K;
                        public final MigColorScheme A0M;
                        public final 53U A0N;
                        public final Capabilities A0O;
                        public int A00 = -1;
                        public final 1YC A0L = 1YC.A03;

                        {
                            this.A0C = context;
                            this.A0E = fbUserSession;
                            this.A0F = r305;
                            this.A0I = r308;
                            this.A0J = threadKey;
                            this.A0K = threadSummary;
                            this.A0O = capabilities;
                            this.A0G = r306;
                            this.A0D = r303;
                            this.A0H = r307;
                            this.A0N = r313;
                            this.A0M = migColorScheme;
                        }

                        private boolean A00() {
                            Object obj;
                            boolean z = true;
                            if (this.A06 == null) {
                                AtomicInteger atomicInteger = C1Y6.A04;
                                int andIncrement = atomicInteger.getAndIncrement();
                                1YC r0 = this.A0L;
                                r0.A0B("com.facebook.messaging.aibot.plugins.core.imagine.composerentrypoint.button.ImagineComposerEntryPoint", "messaging.aibot.core.imagine.composerentrypoint.button.ImagineComposerEntryPoint", "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", andIncrement);
                                Exception exc = null;
                                try {
                                    try {
                                        int i = C1Y6.A00;
                                        Boolean A00 = 5yD.A00(i);
                                        if (A00 != null ? A00.booleanValue() : 5yD.A01(r0, atomicInteger, i)) {
                                            this.A01 = new ImagineComposerEntryPoint(this.A0C, this.A0I, this.A0J, this.A0O);
                                            obj = C1Y6.A02;
                                            this.A06 = obj;
                                        } else {
                                            obj = C1Y6.A03;
                                            this.A06 = obj;
                                        }
                                        boolean z2 = false;
                                        if (obj != C1Y6.A03) {
                                            z2 = true;
                                        }
                                        r0.A03((Exception) null, "messaging.aibot.core.imagine.composerentrypoint.button.ImagineComposerEntryPoint", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, z2);
                                    } catch (Exception e) {
                                        this.A06 = C1Y6.A03;
                                        try {
                                            throw e;
                                        } catch (Throwable th) {
                                            th = th;
                                            exc = e;
                                            r0.A03(exc, "messaging.aibot.core.imagine.composerentrypoint.button.ImagineComposerEntryPoint", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r0.A03(exc, "messaging.aibot.core.imagine.composerentrypoint.button.ImagineComposerEntryPoint", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
                                    throw th;
                                }
                            }
                            if (this.A06 == C1Y6.A03) {
                                z = false;
                            }
                            return z;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[Catch: Exception -> 0x00af, all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x0070, B:17:0x0076, B:18:0x007b, B:19:0x0081, B:21:0x0089, B:22:0x008f, B:23:0x0093, B:23:0x0093, B:26:0x0099, B:31:0x00a1, B:33:0x00a7, B:35:0x0064), top: B:5:0x003f, outer: #1 }] */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: Exception -> 0x00af, all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x0070, B:17:0x0076, B:18:0x007b, B:19:0x0081, B:21:0x0089, B:22:0x008f, B:23:0x0093, B:23:0x0093, B:26:0x0099, B:31:0x00a1, B:33:0x00a7, B:35:0x0064), top: B:5:0x003f, outer: #1 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A01() {
                            /*
                                Method dump skipped, instructions count: 285
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fu.A01():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[Catch: Exception -> 0x00a7, all -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a7, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x0070, B:17:0x0075, B:18:0x007b, B:20:0x0081, B:21:0x0087, B:22:0x008b, B:22:0x008b, B:25:0x0091, B:30:0x0099, B:32:0x009f, B:34:0x0064), top: B:5:0x003f, outer: #2 }] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: Exception -> 0x00a7, all -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a7, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x0070, B:17:0x0075, B:18:0x007b, B:20:0x0081, B:21:0x0087, B:22:0x008b, B:22:0x008b, B:25:0x0091, B:30:0x0099, B:32:0x009f, B:34:0x0064), top: B:5:0x003f, outer: #2 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A02() {
                            /*
                                Method dump skipped, instructions count: 277
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fu.A02():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[Catch: Exception -> 0x00b7, all -> 0x00cb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b7, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x0070, B:17:0x0076, B:18:0x007c, B:19:0x0081, B:20:0x0087, B:22:0x0091, B:23:0x0097, B:24:0x009b, B:24:0x009b, B:27:0x00a1, B:32:0x00a9, B:34:0x00af, B:36:0x0064), top: B:5:0x003f, outer: #2 }] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[Catch: Exception -> 0x00b7, all -> 0x00cb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b7, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x0070, B:17:0x0076, B:18:0x007c, B:19:0x0081, B:20:0x0087, B:22:0x0091, B:23:0x0097, B:24:0x009b, B:24:0x009b, B:27:0x00a1, B:32:0x00a9, B:34:0x00af, B:36:0x0064), top: B:5:0x003f, outer: #2 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A03() {
                            /*
                                Method dump skipped, instructions count: 293
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fu.A03():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: Exception -> 0x00a1, all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a1, blocks: (B:5:0x003f, B:6:0x0044, B:9:0x0050, B:12:0x0058, B:15:0x0070, B:16:0x0076, B:18:0x007b, B:19:0x0081, B:20:0x0085, B:20:0x0085, B:23:0x008b, B:28:0x0093, B:30:0x0099, B:32:0x0064), top: B:4:0x003f, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: Exception -> 0x00a1, all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a1, blocks: (B:5:0x003f, B:6:0x0044, B:9:0x0050, B:12:0x0058, B:15:0x0070, B:16:0x0076, B:18:0x007b, B:19:0x0081, B:20:0x0085, B:20:0x0085, B:23:0x008b, B:28:0x0093, B:30:0x0099, B:32:0x0064), top: B:4:0x003f, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A04() {
                            /*
                                Method dump skipped, instructions count: 271
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fu.A04():boolean");
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 314, insn: 0x03f6: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:149:0x03f6 */
                        /* JADX WARN: Not initialized variable reg: 316, insn: 0x03e1: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:148:0x03d9 */
                        @Override // X.C6fr
                        public X.C6g3 AdN(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 1052
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fu.AdN(java.lang.String):X.6g3");
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v63, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v65, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v67, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v69, types: [int] */
                        /* JADX WARN: Type inference failed for: r303v1 */
                        /* JADX WARN: Type inference failed for: r303v23 */
                        /* JADX WARN: Type inference failed for: r303v24 */
                        @Override // X.C6fr
                        public String[] Ayr() {
                            String[] strArr = this.A0B;
                            if (strArr == null) {
                                int i = this.A00;
                                int i2 = i;
                                if (i == -1) {
                                    boolean A02 = A02();
                                    boolean z = A02;
                                    if (A00()) {
                                        z = (A02 ? 1 : 0) + 1;
                                    }
                                    boolean z2 = z;
                                    if (A01()) {
                                        z2 = (z ? 1 : 0) + 1;
                                    }
                                    boolean z3 = z2;
                                    if (A04()) {
                                        z3 = (z2 ? 1 : 0) + 1;
                                    }
                                    boolean z4 = z3;
                                    if (A03()) {
                                        z4 = (z3 ? 1 : 0) + 1;
                                    }
                                    this.A00 = z4 ? 1 : 0;
                                    i2 = z4;
                                }
                                int i3 = 0;
                                strArr = new String[i2];
                                if (A02()) {
                                    strArr[0] = "expression";
                                    i3 = 1;
                                }
                                if (A00()) {
                                    strArr[i3] = "imagine";
                                    i3++;
                                }
                                if (A01()) {
                                    strArr[i3] = "sticker_suggestions";
                                    i3++;
                                }
                                if (A04()) {
                                    strArr[i3] = "expression_search";
                                    i3++;
                                }
                                if (A03()) {
                                    strArr[i3] = "write_with_ai";
                                }
                                this.A0B = strArr;
                            }
                            return strArr;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:81:0x01d1, code lost:
                        
                            if (((X.C6fe) X.1Br.A0B(r0.A02)).A00().AZk(36321898472162205L) == false) goto L74;
                         */
                        @Override // X.C6fr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public boolean BVH(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 770
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fu.BVH(java.lang.String):boolean");
                        }

                        @Override // X.C6fr
                        public boolean Bht(Intent intent, String str2, int i, int i2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0L;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                            r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                            return false;
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 314, insn: 0x0571: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:223:0x0571 */
                        /* JADX WARN: Not initialized variable reg: 316, insn: 0x055c: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:222:0x0554 */
                        @Override // X.C6fr
                        public void BoT(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 1430
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fu.BoT(java.lang.String):void");
                        }

                        @Override // X.C6fr
                        public void C7Z(String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0L;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", A00);
                            r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", A00);
                        }

                        @Override // X.C6fr
                        public void C7a(String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0L;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", A00);
                            r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", A00);
                        }

                        @Override // X.C6fr
                        public void CQT(String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0L;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", A00);
                            r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", A00);
                        }

                        @Override // X.C6fr
                        public boolean CVK(Integer num, Object obj, String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0L;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                            r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                            return false;
                        }

                        @Override // X.C6fr
                        public boolean CVL(Integer num, Object obj, String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0L;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogConfirm", A00);
                            r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogConfirm", A00);
                            return false;
                        }
                    };
                    break;
                }
                throw 1BL.A0l(str);
            case 1599891654:
                if (str.equals("MoreDrawer")) {
                    rmg = new C6fr(context, r303, fbUserSession, r305, r306, r307, r308, c6fo, threadKey, threadSummary, migColorScheme, r313, capabilities) { // from class: X.6fq
                        public 6gE A01;
                        public 5yY A02;
                        public ImagineComposerOverflowEntryPoint A03;
                        public MetaAIPromptSheetComposerEntryPointImpl A04;
                        public VoiceClipComposerEntryPointImplementation A05;
                        public GamesDiscoveryComposerEntryPointImplementation A06;
                        public P2pPaymentComposerEntryPointImplementation A07;
                        public C1v5 A08;
                        public CreateEventComposerEntryPointImplementation A09;
                        public RollCallComposerEntryPointImplementation A0A;
                        public Object A0B;
                        public Object A0C;
                        public Object A0D;
                        public Object A0E;
                        public Object A0F;
                        public Object A0G;
                        public Object A0H;
                        public Object A0I;
                        public Object A0J;
                        public Object A0K;
                        public Object A0L;
                        public boolean A0M;
                        public String[] A0N;
                        public final Context A0O;
                        public final 06Z A0P;
                        public final FbUserSession A0Q;
                        public final 2S4 A0R;
                        public final 6Qh A0S;
                        public final 6Qi A0T;
                        public final 6Qf A0U;
                        public final C6fo A0V;
                        public final ThreadKey A0W;
                        public final ThreadSummary A0X;
                        public final MigColorScheme A0Z;
                        public final 53U A0a;
                        public final Capabilities A0b;
                        public int A00 = -1;
                        public final 1YC A0Y = 1YC.A03;

                        {
                            this.A0O = context;
                            this.A0Q = fbUserSession;
                            this.A0R = r305;
                            this.A0U = r308;
                            this.A0V = c6fo;
                            this.A0W = threadKey;
                            this.A0X = threadSummary;
                            this.A0b = capabilities;
                            this.A0S = r306;
                            this.A0P = r303;
                            this.A0T = r307;
                            this.A0a = r313;
                            this.A0Z = migColorScheme;
                        }

                        private void A00() {
                            synchronized (this) {
                                if (!this.A0M) {
                                    if (this.A0O == null) {
                                        throw AnonymousClass001.A0Q("The context passed in the ComposerEntryPointInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                    }
                                    this.A08 = C1v5.A01;
                                    this.A0M = true;
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x0087, B:16:0x008d, B:17:0x0093, B:18:0x0098, B:19:0x009e, B:21:0x00a9, B:22:0x00ae, B:23:0x00b2, B:23:0x00b2, B:26:0x00b8, B:31:0x00c0, B:33:0x00c6, B:34:0x0060, B:35:0x0065, B:38:0x006f, B:40:0x007b), top: B:4:0x0043, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x00c0 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x0087, B:16:0x008d, B:17:0x0093, B:18:0x0098, B:19:0x009e, B:21:0x00a9, B:22:0x00ae, B:23:0x00b2, B:23:0x00b2, B:26:0x00b8, B:31:0x00c0, B:33:0x00c6, B:34:0x0060, B:35:0x0065, B:38:0x006f, B:40:0x007b), top: B:4:0x0043, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A01() {
                            /*
                                Method dump skipped, instructions count: 316
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A01():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[Catch: Exception -> 0x00e6, all -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e6, blocks: (B:6:0x0047, B:10:0x0051, B:13:0x005b, B:16:0x008c, B:17:0x0092, B:18:0x0098, B:19:0x009e, B:20:0x00a4, B:21:0x00aa, B:22:0x00af, B:24:0x00bf, B:25:0x00c5, B:26:0x00ca, B:26:0x00ca, B:29:0x00d0, B:34:0x00d8, B:36:0x00de, B:37:0x0064, B:38:0x0069, B:41:0x0073, B:43:0x0080), top: B:5:0x0047, outer: #2 }] */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[Catch: Exception -> 0x00e6, all -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e6, blocks: (B:6:0x0047, B:10:0x0051, B:13:0x005b, B:16:0x008c, B:17:0x0092, B:18:0x0098, B:19:0x009e, B:20:0x00a4, B:21:0x00aa, B:22:0x00af, B:24:0x00bf, B:25:0x00c5, B:26:0x00ca, B:26:0x00ca, B:29:0x00d0, B:34:0x00d8, B:36:0x00de, B:37:0x0064, B:38:0x0069, B:41:0x0073, B:43:0x0080), top: B:5:0x0047, outer: #2 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A02() {
                            /*
                                Method dump skipped, instructions count: 343
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A02():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x00d1 A[Catch: Exception -> 0x0141, all -> 0x015a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0141, blocks: (B:5:0x004c, B:9:0x0059, B:12:0x0065, B:15:0x00d1, B:16:0x00d7, B:17:0x00dd, B:18:0x00e3, B:19:0x00e9, B:20:0x00ef, B:21:0x00f5, B:22:0x00fb, B:23:0x0101, B:25:0x011a, B:26:0x0120, B:27:0x0125, B:27:0x0125, B:30:0x012b, B:35:0x0133, B:37:0x0139, B:38:0x006f, B:39:0x0074, B:42:0x0080, B:45:0x008a, B:46:0x0094, B:49:0x009f, B:51:0x00ac, B:52:0x00b3, B:54:0x00bb, B:57:0x00c5), top: B:4:0x004c, outer: #1 }] */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x018f  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0133 A[Catch: Exception -> 0x0141, all -> 0x015a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0141, blocks: (B:5:0x004c, B:9:0x0059, B:12:0x0065, B:15:0x00d1, B:16:0x00d7, B:17:0x00dd, B:18:0x00e3, B:19:0x00e9, B:20:0x00ef, B:21:0x00f5, B:22:0x00fb, B:23:0x0101, B:25:0x011a, B:26:0x0120, B:27:0x0125, B:27:0x0125, B:30:0x012b, B:35:0x0133, B:37:0x0139, B:38:0x006f, B:39:0x0074, B:42:0x0080, B:45:0x008a, B:46:0x0094, B:49:0x009f, B:51:0x00ac, B:52:0x00b3, B:54:0x00bb, B:57:0x00c5), top: B:4:0x004c, outer: #1 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A03() {
                            /*
                                Method dump skipped, instructions count: 450
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A03():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[Catch: Exception -> 0x00ad, all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ad, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x0091, B:17:0x0097, B:22:0x009f, B:24:0x00a5, B:25:0x0060, B:26:0x0065, B:29:0x0071, B:32:0x0079, B:34:0x0085), top: B:4:0x0043, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[Catch: Exception -> 0x00ad, all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ad, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x0091, B:17:0x0097, B:22:0x009f, B:24:0x00a5, B:25:0x0060, B:26:0x0065, B:29:0x0071, B:32:0x0079, B:34:0x0085), top: B:4:0x0043, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A04() {
                            /*
                                Method dump skipped, instructions count: 283
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A04():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x00eb, all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00eb, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:17:0x00a5, B:18:0x00ab, B:19:0x00b1, B:20:0x00b6, B:22:0x00c5, B:23:0x00ca, B:24:0x00cf, B:24:0x00cf, B:27:0x00d5, B:32:0x00dd, B:34:0x00e3, B:35:0x0067, B:36:0x006c, B:39:0x0078, B:42:0x0080, B:44:0x008d), top: B:4:0x004a, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[Catch: Exception -> 0x00eb, all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00eb, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:17:0x00a5, B:18:0x00ab, B:19:0x00b1, B:20:0x00b6, B:22:0x00c5, B:23:0x00ca, B:24:0x00cf, B:24:0x00cf, B:27:0x00d5, B:32:0x00dd, B:34:0x00e3, B:35:0x0067, B:36:0x006c, B:39:0x0078, B:42:0x0080, B:44:0x008d), top: B:4:0x004a, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A05() {
                            /*
                                Method dump skipped, instructions count: 348
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A05():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0121 A[Catch: Exception -> 0x0157, all -> 0x016e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0157, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x0121, B:18:0x0127, B:23:0x012f, B:25:0x0135, B:26:0x006b, B:27:0x0070, B:30:0x007c, B:33:0x0084, B:34:0x008d, B:39:0x0112, B:39:0x0112, B:41:0x0116, B:42:0x009c, B:44:0x00ae, B:64:0x010d, B:67:0x0144, B:69:0x014f, B:71:0x0156), top: B:5:0x004e, outer: #4 }] */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x01aa  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x012f A[Catch: Exception -> 0x0157, all -> 0x016e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0157, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x0121, B:18:0x0127, B:23:0x012f, B:25:0x0135, B:26:0x006b, B:27:0x0070, B:30:0x007c, B:33:0x0084, B:34:0x008d, B:39:0x0112, B:39:0x0112, B:41:0x0116, B:42:0x009c, B:44:0x00ae, B:64:0x010d, B:67:0x0144, B:69:0x014f, B:71:0x0156), top: B:5:0x004e, outer: #4 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A06() {
                            /*
                                Method dump skipped, instructions count: 470
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A06():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0118 A[Catch: Exception -> 0x014e, all -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x014e, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x0118, B:18:0x011e, B:23:0x0126, B:25:0x012c, B:26:0x006b, B:27:0x0070, B:30:0x007c, B:33:0x0084, B:34:0x008d, B:39:0x0109, B:39:0x0109, B:41:0x010d, B:42:0x009c, B:44:0x00ae, B:60:0x0104, B:63:0x013b, B:65:0x0146, B:67:0x014d), top: B:5:0x004e, outer: #1 }] */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x01a1  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x0126 A[Catch: Exception -> 0x014e, all -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x014e, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x0118, B:18:0x011e, B:23:0x0126, B:25:0x012c, B:26:0x006b, B:27:0x0070, B:30:0x007c, B:33:0x0084, B:34:0x008d, B:39:0x0109, B:39:0x0109, B:41:0x010d, B:42:0x009c, B:44:0x00ae, B:60:0x0104, B:63:0x013b, B:65:0x0146, B:67:0x014d), top: B:5:0x004e, outer: #1 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A07() {
                            /*
                                Method dump skipped, instructions count: 461
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A07():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: Exception -> 0x00ce, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a2, B:18:0x00a8, B:20:0x00ae, B:21:0x00b2, B:21:0x00b2, B:24:0x00b8, B:29:0x00c0, B:31:0x00c6, B:32:0x0063, B:33:0x0068, B:36:0x0074, B:39:0x007c, B:41:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A08() {
                            /*
                                Method dump skipped, instructions count: 316
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A08():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: Exception -> 0x00a6, all -> 0x00ba, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a6, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x008a, B:17:0x0090, B:22:0x0098, B:24:0x009e, B:25:0x0063, B:26:0x0068, B:29:0x0072, B:31:0x007e), top: B:4:0x0046, outer: #1 }] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[Catch: Exception -> 0x00a6, all -> 0x00ba, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a6, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x008a, B:17:0x0090, B:22:0x0098, B:24:0x009e, B:25:0x0063, B:26:0x0068, B:29:0x0072, B:31:0x007e), top: B:4:0x0046, outer: #1 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A09() {
                            /*
                                Method dump skipped, instructions count: 276
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A09():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0094 A[Catch: Exception -> 0x00db, all -> 0x00ef, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00db, blocks: (B:6:0x0046, B:10:0x0050, B:13:0x005a, B:16:0x0094, B:17:0x009a, B:18:0x00a0, B:19:0x00a5, B:20:0x00ab, B:22:0x00b5, B:23:0x00bb, B:24:0x00bf, B:24:0x00bf, B:27:0x00c5, B:32:0x00cd, B:34:0x00d3, B:35:0x0063, B:36:0x0068, B:39:0x0074, B:42:0x007c, B:44:0x0088), top: B:5:0x0046, outer: #2 }] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[Catch: Exception -> 0x00db, all -> 0x00ef, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00db, blocks: (B:6:0x0046, B:10:0x0050, B:13:0x005a, B:16:0x0094, B:17:0x009a, B:18:0x00a0, B:19:0x00a5, B:20:0x00ab, B:22:0x00b5, B:23:0x00bb, B:24:0x00bf, B:24:0x00bf, B:27:0x00c5, B:32:0x00cd, B:34:0x00d3, B:35:0x0063, B:36:0x0068, B:39:0x0074, B:42:0x007c, B:44:0x0088), top: B:5:0x0046, outer: #2 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A0A() {
                            /*
                                Method dump skipped, instructions count: 329
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A0A():boolean");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: Exception -> 0x00d3, all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d3, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:16:0x009a, B:17:0x009f, B:18:0x00a5, B:20:0x00ad, B:21:0x00b3, B:22:0x00b7, B:22:0x00b7, B:25:0x00bd, B:30:0x00c5, B:32:0x00cb, B:33:0x0063, B:34:0x0068, B:37:0x0074, B:40:0x007c, B:42:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: Exception -> 0x00d3, all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d3, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:16:0x009a, B:17:0x009f, B:18:0x00a5, B:20:0x00ad, B:21:0x00b3, B:22:0x00b7, B:22:0x00b7, B:25:0x00bd, B:30:0x00c5, B:32:0x00cb, B:33:0x0063, B:34:0x0068, B:37:0x0074, B:40:0x007c, B:42:0x0088), top: B:4:0x0046, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private boolean A0B() {
                            /*
                                Method dump skipped, instructions count: 321
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.A0B():boolean");
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r314v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 314, insn: 0x0730: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:285:0x0730 */
                        /* JADX WARN: Not initialized variable reg: 316, insn: 0x071a: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:284:0x0717 */
                        @Override // X.C6fr
                        public X.C6g3 AdN(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 1878
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.AdN(java.lang.String):X.6g3");
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v129, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v131, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v133, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v135, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v137, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v139, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v141, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v143, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v145, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v147, types: [int] */
                        /* JADX WARN: Type inference failed for: r303v1 */
                        /* JADX WARN: Type inference failed for: r303v53 */
                        /* JADX WARN: Type inference failed for: r303v54 */
                        @Override // X.C6fr
                        public String[] Ayr() {
                            String[] strArr = this.A0N;
                            if (strArr == null) {
                                int i = this.A00;
                                int i2 = i;
                                if (i == -1) {
                                    boolean A01 = A01();
                                    boolean z = A01;
                                    if (A02()) {
                                        z = (A01 ? 1 : 0) + 1;
                                    }
                                    boolean z2 = z;
                                    if (A0B()) {
                                        z2 = (z ? 1 : 0) + 1;
                                    }
                                    boolean z3 = z2;
                                    if (A07()) {
                                        z3 = (z2 ? 1 : 0) + 1;
                                    }
                                    boolean z4 = z3;
                                    if (A04()) {
                                        z4 = (z3 ? 1 : 0) + 1;
                                    }
                                    boolean z5 = z4;
                                    if (A03()) {
                                        z5 = (z4 ? 1 : 0) + 1;
                                    }
                                    boolean z6 = z5;
                                    if (A06()) {
                                        z6 = (z5 ? 1 : 0) + 1;
                                    }
                                    boolean z7 = z6;
                                    if (A08()) {
                                        z7 = (z6 ? 1 : 0) + 1;
                                    }
                                    boolean z8 = z7;
                                    if (A09()) {
                                        z8 = (z7 ? 1 : 0) + 1;
                                    }
                                    boolean z9 = z8;
                                    if (A0A()) {
                                        z9 = (z8 ? 1 : 0) + 1;
                                    }
                                    boolean z10 = z9;
                                    if (A05()) {
                                        z10 = (z9 ? 1 : 0) + 1;
                                    }
                                    this.A00 = z10 ? 1 : 0;
                                    i2 = z10;
                                }
                                int i3 = 0;
                                strArr = new String[i2];
                                if (A01()) {
                                    strArr[0] = "imagine";
                                    i3 = 1;
                                }
                                if (A02()) {
                                    strArr[i3] = "meta_ai_prompt_sheet";
                                    i3++;
                                }
                                if (A0B()) {
                                    strArr[i3] = "roll_call";
                                    i3++;
                                }
                                if (A07()) {
                                    strArr[i3] = "reshare_hub";
                                    i3++;
                                }
                                if (A04()) {
                                    strArr[i3] = "event_creation";
                                    i3++;
                                }
                                if (A03()) {
                                    strArr[i3] = "voice_clip";
                                    i3++;
                                }
                                if (A06()) {
                                    strArr[i3] = "livelocation";
                                    i3++;
                                }
                                if (A08()) {
                                    strArr[i3] = "payment";
                                    i3++;
                                }
                                if (A09()) {
                                    strArr[i3] = "polling";
                                    i3++;
                                }
                                if (A0A()) {
                                    strArr[i3] = "public_chats_event_creation";
                                    i3++;
                                }
                                if (A05()) {
                                    strArr[i3] = "games_discovery";
                                }
                                this.A0N = strArr;
                            }
                            return strArr;
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r316v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r318v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r318v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 316, insn: 0x091b: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:403:0x091b */
                        /* JADX WARN: Not initialized variable reg: 318, insn: 0x0906: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r318 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:402:0x08fe */
                        @Override // X.C6fr
                        public boolean BVH(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 2369
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.BVH(java.lang.String):boolean");
                        }

                        @Override // X.C6fr
                        public boolean Bht(Intent intent, String str2, int i, int i2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0Y;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                            try {
                                A00();
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                                return false;
                            } catch (Throwable th) {
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onActivityResult", A00);
                                throw th;
                            }
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r0v47 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r2v2 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:372)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r302v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:372)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r5v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to set immutable type for var: r302v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:372)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:100)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:100)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 315, insn: 0x0d97: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:547:0x0d83 */
                        @Override // X.C6fr
                        public void BoT(java.lang.String r302) {
                            /*
                                Method dump skipped, instructions count: 3558
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.BoT(java.lang.String):void");
                        }

                        @Override // X.C6fr
                        public void C7Z(String str2) {
                            int andIncrement;
                            String str3;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement2 = atomicInteger.getAndIncrement();
                            1YC r0 = this.A0Y;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement2);
                            Exception e = null;
                            try {
                                A00();
                                try {
                                    try {
                                        if (!str2.equals("payment") || !A08()) {
                                            if (str2.equals("games_discovery") && A05()) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str3 = "messaging.games.composerentrypoint.discoverycomposerentrypoint.GamesDiscoveryComposerEntryPointImplementation";
                                                r0.A0A("com.facebook.messaging.games.plugins.composerentrypoint.discoverycomposerentrypoint.GamesDiscoveryComposerEntryPointImplementation", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.games.plugins.composerentrypoint.GamesComposerentrypointKillSwitch", "onMoreDrawerKeyboardOpened");
                                                C6fo c6fo2 = this.A0V;
                                                11T.A0F(c6fo2, 0);
                                                if (c6fo2 == C6fo.A04) {
                                                    ((Evw) 1Bn.A0A(67890)).A00(0S2.A0N, 0S2.A01);
                                                }
                                            }
                                            r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement2);
                                        }
                                        andIncrement = atomicInteger.getAndIncrement();
                                        str3 = 4YU.A10(r0, "onMoreDrawerKeyboardOpened", andIncrement);
                                        this.A07.A03(this.A0Q, this.A0V);
                                        r0.A09(str3, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement);
                                        r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement2);
                                    } catch (Exception e2) {
                                        e = e2;
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    r0.A04(e, str3, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                r0.A02(e, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpened", andIncrement2);
                                throw th2;
                            }
                        }

                        @Override // X.C6fr
                        public void C7a(String str2) {
                            int andIncrement;
                            String str3;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement2 = atomicInteger.getAndIncrement();
                            1YC r0 = this.A0Y;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", andIncrement2);
                            try {
                                A00();
                                try {
                                    try {
                                        if (!str2.equals("imagine") || !A01()) {
                                            if (str2.equals("meta_ai_prompt_sheet") && A02()) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str3 = "messaging.aibot.core.promptsheet.composerentrypoint.MetaAIPromptSheetComposerEntryPointImpl";
                                                r0.A0A("com.facebook.messaging.aibot.plugins.core.promptsheet.composerentrypoint.MetaAIPromptSheetComposerEntryPointImpl", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", "onMoreDrawerKeyboardOpenedExposure");
                                                MetaAIPromptSheetComposerEntryPointImpl metaAIPromptSheetComposerEntryPointImpl = this.A04;
                                                1qI r02 = (1qI) 1Br.A0B(metaAIPromptSheetComposerEntryPointImpl.A03);
                                                ThreadKey threadKey2 = metaAIPromptSheetComposerEntryPointImpl.A07;
                                                if (r02.A0O(threadKey2)) {
                                                    ((3vU) 1Br.A0B(metaAIPromptSheetComposerEntryPointImpl.A05)).A0R(threadKey2);
                                                }
                                            }
                                            r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", andIncrement2);
                                        }
                                        andIncrement = atomicInteger.getAndIncrement();
                                        str3 = "messaging.aibot.core.imagine.composerentrypoint.overflow.ImagineComposerOverflowEntryPoint";
                                        r0.A0A("com.facebook.messaging.aibot.plugins.core.imagine.composerentrypoint.overflow.ImagineComposerOverflowEntryPoint", str3, "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", "onMoreDrawerKeyboardOpenedExposure");
                                        ImagineComposerOverflowEntryPoint imagineComposerOverflowEntryPoint = this.A03;
                                        if (7WF.A00(imagineComposerOverflowEntryPoint.A06)) {
                                            1qI r03 = (1qI) 1Br.A0B(imagineComposerOverflowEntryPoint.A02);
                                            ThreadKey threadKey3 = imagineComposerOverflowEntryPoint.A05;
                                            r03.A0R(threadKey3, true);
                                            ((3vU) 1Br.A0B(imagineComposerOverflowEntryPoint.A03)).A0X(threadKey3, imagineComposerOverflowEntryPoint.A00);
                                        }
                                        r0.A09(str3, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", andIncrement);
                                        r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", andIncrement2);
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    r0.A04((Exception) null, str3, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", andIncrement);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onMoreDrawerKeyboardOpenedExposure", andIncrement2);
                                throw th2;
                            }
                        }

                        @Override // X.C6fr
                        public void CQT(String str2) {
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement = atomicInteger.getAndIncrement();
                            1YC r0 = this.A0Y;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", andIncrement);
                            Exception e = null;
                            try {
                                A00();
                                if (!str2.equals("payment") || !A08()) {
                                    r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", andIncrement);
                                    return;
                                }
                                int andIncrement2 = atomicInteger.getAndIncrement();
                                r0.A0A("com.facebook.messaging.payments.plugins.core.composerentrypoint.P2pPaymentComposerEntryPointImplementation", "messaging.payments.core.composerentrypoint.P2pPaymentComposerEntryPointImplementation", "com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", andIncrement2, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "com.facebook.messaging.payments.plugins.core.PaymentsCoreKillSwitch", "onThreadUpdated");
                                try {
                                    try {
                                        P2pPaymentComposerEntryPointImplementation p2pPaymentComposerEntryPointImplementation = this.A07;
                                        Context context2 = this.A0O;
                                        ThreadKey threadKey2 = this.A0W;
                                        if (this.A0V == C6fo.A02) {
                                            1Hv.A02(context2, 98755);
                                            11T.A0F(threadKey2, 0);
                                            1Hv.A02(context2, 98755);
                                            p2pPaymentComposerEntryPointImplementation.A01.get();
                                        }
                                        r0.A04((Exception) null, "messaging.payments.core.composerentrypoint.P2pPaymentComposerEntryPointImplementation", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", andIncrement2);
                                        r0.A02((Exception) null, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", andIncrement);
                                    } catch (Exception e2) {
                                        e = e2;
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    r0.A04(e, "messaging.payments.core.composerentrypoint.P2pPaymentComposerEntryPointImplementation", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", andIncrement2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                r0.A02(e, "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onThreadUpdated", andIncrement);
                                throw th2;
                            }
                        }

                        @Override // X.C6fr
                        public boolean CVK(Integer num, Object obj, String str2) {
                            int A00 = 1BK.A00();
                            1YC r0 = this.A0Y;
                            r0.A08("com.facebook.messaging.composer.plugins.interfaces.entrypoint.ComposerEntryPointInterfaceSpec", "messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                            try {
                                A00();
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                                return false;
                            } catch (Throwable th) {
                                r0.A06("messaging.composer.entrypoint.ComposerEntryPointInterfaceSpec", "onZeroRatingDialogCancel", A00);
                                throw th;
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
                        
                            if (r309 == null) goto L32;
                         */
                        @Override // X.C6fr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public boolean CVL(java.lang.Integer r302, java.lang.Object r303, java.lang.String r304) {
                            /*
                                Method dump skipped, instructions count: 546
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C6fq.CVL(java.lang.Integer, java.lang.Object, java.lang.String):boolean");
                        }
                    };
                    break;
                }
                throw 1BL.A0l(str);
            case 1666933099:
                if (str.equals("TestActionBar")) {
                    rmg = new Rmg(context, r303, fbUserSession, r305, r306, r307, r308, threadKey, threadSummary, migColorScheme, r313, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = rmg;
    }
}
