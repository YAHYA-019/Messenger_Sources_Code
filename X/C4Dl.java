package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.analytics.ttrc.surface.appstart.events.IntentHandled;
import com.facebook.messaging.communitymessaging.notify.analytics.CommunityMessagingNotificationsLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messenger.neue.MainActivity;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.4Dl, reason: invalid class name */
/* loaded from: 4Dl.class */
public final class C4Dl {
    public 1BY A00;
    public final C00i A0B = new 1BV((1BY) null, 68463);
    public final C00i A0X = new 1BQ(6);
    public final C00i A0D = new 1BQ(67262);
    public final C00i A03 = new 1BQ(66453);
    public final C00i A0I = new 1BV((1BY) null, 16428);
    public final C15h A0K = new C4Xh(this, 9);
    public final C00i A0F = new 1BV((1BY) null, 68383);
    public final C00i A0R = new 1BQ(85048);
    public final C00i A09 = new 1BQ(83168);
    public final C00i A0U = new 1BQ(85051);
    public final C00i A0S = new 1BQ(85050);
    public final C00i A08 = new 1BQ(66441);
    public final C00i A0P = new 1BV((1BY) null, 83024);
    public final C00i A0Q = new 1BV((1BY) null, 17019);
    public final C00i A0T = new 1BV((1BY) null, 114719);
    public final C00i A0V = new 1BQ(84488);
    public final C00i A0W = new 1BV((1BY) null, 32993);
    public final C00i A0O = new 1BV((1BY) null, 32994);
    public final C00i A0E = new 1BV((1BY) null, 82442);
    public final C00i A0G = new 1BV((1BY) null, 66058);
    public final C00i A05 = new 1BV((1BY) null, 83118);
    public final C00i A06 = new 1BV((1BY) null, 83330);
    public final C00i A0L = new 1BV((1BY) null, 83557);
    public final C15h A0J = new C4Xh(this, 10);
    public final C00i A04 = new 1BQ(66897);
    public final C00i A0H = new 1BV((1BY) null, 84232);
    public final C00i A01 = new 1BV((1BY) null, 33230);
    public final C00i A02 = new 1BV((1BY) null, 82531);
    public final C00i A0M = new 1BQ(66640);
    public final C00i A0Y = new 1BQ(83825);
    public final C00i A0N = new 1BQ(16511);
    public final C00i A0C = new 1BQ(67709);
    public final C00i A07 = new 1BQ(33013);
    public final C00i A0A = new 1BQ(16385);

    public C4Dl(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static NavigationTrigger A00(Intent intent, NavigationTrigger navigationTrigger) {
        return NavigationTrigger.A02(CJb.A01(intent.getExtras(), navigationTrigger), navigationTrigger.A05, navigationTrigger.A08, navigationTrigger.A07, navigationTrigger.A06, navigationTrigger.A00, navigationTrigger.A09);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r332v3 ??, still in use, count: 4, list:
          (r332v3 ??) from 0x0154: PHI (r332v2 ??) = (r332v1 ??), (r332v3 ??) binds: [B:327:0x0187, B:44:0x014f] A[DONT_GENERATE, DONT_INLINE]
          (r332v3 ?? I:android.content.Intent) from 0x0134: INVOKE (r332v3 ?? I:android.content.Intent), (r0v387 ?? I:int) VIRTUAL call: android.content.Intent.setFlags(int):android.content.Intent A[Catch: all -> 0x0782, MD:(int):android.content.Intent (c)]
          (r332v3 ?? I:android.content.Intent) from 0x0142: INVOKE (r332v3 ?? I:android.content.Intent), (r0v390 ?? I:java.lang.String), (r303v0 ?? I:android.os.Parcelable) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent A[Catch: all -> 0x0782, MD:(java.lang.String, android.os.Parcelable):android.content.Intent (c)]
          (r332v3 ?? I:android.content.Intent) from 0x0151: INVOKE (r332v3 ?? I:android.content.Intent), (r0v394 ?? I:java.lang.ClassLoader) VIRTUAL call: android.content.Intent.setExtrasClassLoader(java.lang.ClassLoader):void A[Catch: all -> 0x0782, MD:(java.lang.ClassLoader):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static com.google.common.util.concurrent.ListenableFuture A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r332v3 ??, still in use, count: 4, list:
          (r332v3 ??) from 0x0154: PHI (r332v2 ??) = (r332v1 ??), (r332v3 ??) binds: [B:327:0x0187, B:44:0x014f] A[DONT_GENERATE, DONT_INLINE]
          (r332v3 ?? I:android.content.Intent) from 0x0134: INVOKE (r332v3 ?? I:android.content.Intent), (r0v387 ?? I:int) VIRTUAL call: android.content.Intent.setFlags(int):android.content.Intent A[Catch: all -> 0x0782, MD:(int):android.content.Intent (c)]
          (r332v3 ?? I:android.content.Intent) from 0x0142: INVOKE (r332v3 ?? I:android.content.Intent), (r0v390 ?? I:java.lang.String), (r303v0 ?? I:android.os.Parcelable) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent A[Catch: all -> 0x0782, MD:(java.lang.String, android.os.Parcelable):android.content.Intent (c)]
          (r332v3 ?? I:android.content.Intent) from 0x0151: INVOKE (r332v3 ?? I:android.content.Intent), (r0v394 ?? I:java.lang.ClassLoader) VIRTUAL call: android.content.Intent.setExtrasClassLoader(java.lang.ClassLoader):void A[Catch: all -> 0x0782, MD:(java.lang.ClassLoader):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    private boolean A02(Intent intent, ThreadKey threadKey) {
        if (intent.getBooleanExtra("from_shortcut", false) && ((5HG) this.A0Y.get()).A03(threadKey)) {
            return true;
        }
        if ((threadKey.A0z() && !((C2j5) this.A01.get()).A02()) || !((C1254Abw) this.A02.get()).A0C(threadKey)) {
            return false;
        }
        boolean booleanExtra = intent.getBooleanExtra("from_notification", false);
        C2j5 c2j5 = (C2j5) this.A01.get();
        if (booleanExtra) {
            return false;
        }
        return ((2yD) c2j5.A03.A00.get()).AZk(36313046544946696L);
    }

    public 1hM A03(Context context, Intent intent) {
        C00j.A05("IntentHandlerDelegateImpl.openMomentCreation", -511773442);
        try {
            A0F(intent, null, 0S2.A00);
            9dD.A01(context, C6r6.A0H, C1ub.A01());
            1hM A0K = C3o5.A0K(true);
            C00j.A01(2104289369);
            return A0K;
        } catch (Throwable th) {
            C00j.A01(-1699609183);
            throw th;
        }
    }

    public 1hM A04(Context context, Intent intent) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getCallingActivity() != null) {
                ((08O) this.A0X.get()).A02().A09(activity, intent, 1000);
                return C3o5.A0K(true);
            }
        } else {
            intent.setFlags(intent.getFlags() | 268435456);
        }
        ((08O) this.A0X.get()).A02().A0A(context, intent);
        return C3o5.A0K(true);
    }

    public 1hM A05(Context context, Intent intent, Intent intent2) {
        boolean z = false;
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList("extra_account_switch_redirect_source", "extra_account_switch_target_uid", "focus_compose", "from_notification", "show_inbox", "note_id", "note_creators", "send_as_message_entry_point", "show_turn_on_show_sms", "extra_tracking_codes", "workchat_share_extension", "show_composer", "silent_switch_account", "composer_start_voice_recording"));
        if (intent.hasExtra("fb_messaging_surface_hierarchy")) {
            hashSet.add("fb_messaging_surface_hierarchy");
        }
        if (intent.hasExtra("block_id")) {
            hashSet.add("block_id");
            if (intent.hasExtra("block_entry_point")) {
                hashSet.add("block_entry_point");
            }
            if (intent.hasExtra("block_source")) {
                hashSet.add("block_source");
            }
        }
        if (intent.hasExtra("thread_type")) {
            hashSet.add("thread_type");
        }
        if (intent.hasExtra("extra_thread_view_params")) {
            hashSet.add("extra_thread_view_params");
        }
        if (intent.hasExtra("jewel_dedup_id")) {
            hashSet.add("jewel_dedup_id");
        }
        C00i c00i = this.A0W;
        c00i.get();
        if (4DK.A01(intent)) {
            z = true;
            hashSet.add("intent_auth_type_extra_key");
        } else {
            c00i.get();
            if (4DK.A02(intent) || 4DM.A01(intent) || ((4DL) this.A0O.get()).A00(intent, (String) null)) {
                z = true;
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null && !hashSet.isEmpty()) {
            Iterator it = new ArrayList(extras.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!hashSet.contains(str)) {
                    extras.remove(str);
                }
            }
            intent2.putExtras(extras);
        }
        if (z) {
            intent2.setData(intent.getData());
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (((C4Dp) 1Bn.A0G(this.A00, 99770)).A00(activity, intent)) {
                intent2.putExtra("flow_from_fb4a_redirect", true);
            }
            if (activity.getCallingActivity() != null) {
                ((08O) this.A0X.get()).A06().A09(activity, intent2, 1000);
                return new 1hM(true);
            }
        } else {
            intent2.setFlags(intent2.getFlags() | 268435456);
        }
        ((08O) this.A0X.get()).A06().A0A(context, intent2);
        return new 1hM(true);
    }

    public ListenableFuture A06(Context context, Intent intent) {
        C00i c00i;
        C6mh c6mh;
        String str;
        Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
        intent2.setExtrasClassLoader(MainActivity.class.getClassLoader());
        intent2.setData(intent.getData());
        String A00 = 7zK.A00(32);
        boolean booleanExtra = intent.getBooleanExtra(A00, false);
        String A002 = 7zK.A00(33);
        boolean booleanExtra2 = intent.getBooleanExtra(A002, false);
        String A003 = AbE.A00(21);
        String stringExtra = intent.getStringExtra(A003);
        if (booleanExtra || booleanExtra2) {
            intent2.putExtra(A00, booleanExtra);
            intent2.putExtra(A002, booleanExtra2);
            intent2.putExtra("thread_key", intent.getStringExtra("thread_key"));
            c00i = this.A0M;
            c6mh = (C6mh) c00i.get();
            str = "invite_notif";
        } else {
            C0dr c0dr = (C0dr) 1Bi.A03(84488);
            intent2.putExtra(1BJ.A00(1449), true);
            intent2.putExtra("group_invite_link_open_ts", c0dr.now());
            intent2.putExtra(A003, stringExtra);
            intent2.putExtra(4YT.A00(ActionId.BEGIN_START_ACTIVITY), BM8.A06.intValue);
            c00i = this.A0M;
            c6mh = (C6mh) c00i.get();
            str = AbE.A00(179);
        }
        c6mh.A08(str);
        C6mh c6mh2 = (C6mh) c00i.get();
        C6mh.A00(c6mh2).markerStart(947008942, true);
        C6mh.A00(c6mh2).markerAnnotate(947008942, "entry_point", 9Cy.A00(intent2).mValue);
        return A05(context, intent, intent2);
    }

    public ListenableFuture A07(Context context, Intent intent) {
        C00j.A05("IntentHandlerDelegateImpl.openHighlightsTab", -374514855);
        try {
            A0F(intent, null, 0S2.A00);
            ListenableFuture A0A = A0A(context, intent, null, 0S2.A0Y);
            C00j.A01(565558959);
            return A0A;
        } catch (Throwable th) {
            C00j.A01(-554268131);
            throw th;
        }
    }

    public ListenableFuture A08(Context context, Intent intent) {
        Integer num = 0S2.A00;
        A0F(intent, null, num);
        1V8.A00().CZm(new IntentHandled(num));
        return A0A(context, intent, null, num);
    }

    public ListenableFuture A09(Context context, Intent intent, Bundle bundle, int i) {
        Intent A0A = C3o5.A0A(context);
        if (bundle != null) {
            A0A.putExtras(bundle);
        }
        A0A.setFlags(i);
        return A05(context, intent, A0A);
    }

    public ListenableFuture A0A(Context context, Intent intent, Bundle bundle, Integer num) {
        Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
        intent2.setExtrasClassLoader(MainActivity.class.getClassLoader());
        intent2.setData(intent.getData());
        4FW.A01(intent2, num, "EXTRA_SAVED_TAB");
        if (bundle != null) {
            intent2.putExtras(bundle);
        }
        return A05(context, intent, intent2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v6 ??, still in use, count: 4, list:
          (r314v6 ??) from 0x0947: PHI (r314v5 ??) = (r314v3 ??), (r314v4 ??), (r314v4 ??), (r314v6 ??) binds: [B:458:0x0941, B:443:0x08f8, B:447:0x0908, B:349:0x07d3] A[DONT_GENERATE, DONT_INLINE]
          (r314v6 ?? I:android.content.Intent) from 0x07bc: INVOKE (r314v6 ?? I:android.content.Intent), (r0v287 ?? I:java.lang.String), (r0v283 ?? I:long) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, long):android.content.Intent A[Catch: all -> 0x0a24, MD:(java.lang.String, long):android.content.Intent (c)]
          (r314v6 ?? I:android.content.Intent) from 0x07cb: INVOKE (r314v6 ?? I:android.content.Intent), (r0v290 ?? I:java.lang.String), (r0v16 ?? I:android.os.Parcelable) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent A[Catch: all -> 0x0a24, MD:(java.lang.String, android.os.Parcelable):android.content.Intent (c)]
          (r314v6 ?? I:android.content.Intent) from 0x07d5: INVOKE (r314v6 ?? I:android.content.Intent), (r0v106 ?? I:java.lang.String), (r0v110 ?? I:android.os.Parcelable) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent A[Catch: all -> 0x0a24, MD:(java.lang.String, android.os.Parcelable):android.content.Intent (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public com.google.common.util.concurrent.ListenableFuture A0B(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v6 ??, still in use, count: 4, list:
          (r314v6 ??) from 0x0947: PHI (r314v5 ??) = (r314v3 ??), (r314v4 ??), (r314v4 ??), (r314v6 ??) binds: [B:458:0x0941, B:443:0x08f8, B:447:0x0908, B:349:0x07d3] A[DONT_GENERATE, DONT_INLINE]
          (r314v6 ?? I:android.content.Intent) from 0x07bc: INVOKE (r314v6 ?? I:android.content.Intent), (r0v287 ?? I:java.lang.String), (r0v283 ?? I:long) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, long):android.content.Intent A[Catch: all -> 0x0a24, MD:(java.lang.String, long):android.content.Intent (c)]
          (r314v6 ?? I:android.content.Intent) from 0x07cb: INVOKE (r314v6 ?? I:android.content.Intent), (r0v290 ?? I:java.lang.String), (r0v16 ?? I:android.os.Parcelable) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent A[Catch: all -> 0x0a24, MD:(java.lang.String, android.os.Parcelable):android.content.Intent (c)]
          (r314v6 ?? I:android.content.Intent) from 0x07d5: INVOKE (r314v6 ?? I:android.content.Intent), (r0v106 ?? I:java.lang.String), (r0v110 ?? I:android.os.Parcelable) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent A[Catch: all -> 0x0a24, MD:(java.lang.String, android.os.Parcelable):android.content.Intent (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public ListenableFuture A0C(Context context, Intent intent, ThreadKey threadKey, String str, String str2) {
        String str3;
        C5ap A00;
        CommunityMessagingNotificationsLoggerModel communityMessagingNotificationsLoggerModel;
        Bundle extras = intent.getExtras();
        if (extras != null && (communityMessagingNotificationsLoggerModel = (CommunityMessagingNotificationsLoggerModel) extras.getParcelable(4YT.A00(ActionId.ON_ATTACH_FRAGMENT))) != null) {
            String str4 = communityMessagingNotificationsLoggerModel.A09;
            if (!TextUtils.isEmpty(str4)) {
                C5e2.A00((C5e2) this.A06.get(), communityMessagingNotificationsLoggerModel);
                C45d c45d = (C45d) this.A09.get();
                11T.A0F(str4, 1);
                c45d.A0H(null, threadKey, null, str4, true);
            }
        }
        1hN r0 = (1hN) this.A08.get();
        r0.A00("intent_tread_view");
        1WI r02 = (1WI) r0.A01.A00.get();
        r02.A01 = true;
        r02.A0K("intent_open_community_channel");
        String obj = C1yg.COMMUNITY_CHANNEL.toString();
        r02.A0Z("thread_type", obj);
        if (str != null) {
            r02.A0Z(AbE.A00(52), str);
        }
        1hS r03 = (1hS) r0.A03.A00.get();
        r03.A01 = true;
        r03.A0K("intent_open_community_channel");
        r03.A0Z("thread_type", obj);
        if (str != null) {
            r03.A0Z(AbE.A00(52), str);
        }
        Uri data = intent.getData();
        String str5 = null;
        if (data != null) {
            str5 = data.getQueryParameter("message_id");
            str3 = data.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE);
        } else {
            str3 = null;
        }
        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0D(context, 16428));
        CQ5 cq5 = (CQ5) this.A0L.get();
        11T.A0F(A04, 0);
        11T.A0F(threadKey, 2);
        boolean z = false;
        if (intent.getStringExtra("communityID") != null && (A00 = AbstractC1238Abg.A00(intent)) != null) {
            boolean booleanExtra = intent.getBooleanExtra("from_notification", false);
            1BY r04 = cq5.A00.A00;
            Integer num = 1Lo.A05;
            1MV r05 = new 1MV(A04, r04, 82486);
            if (booleanExtra && CQ5.A04(cq5).A03() && ((C3j) r05.get()).A00(threadKey.A04)) {
                String str6 = A00.stringValue;
                if (11T.A0O(str6, C5ap.A1O.stringValue) || 11T.A0O(str6, C5ap.A1d.stringValue) || 11T.A0O(str6, C5ap.A1E.stringValue) || 11T.A0O(str6, C5ap.A1G.stringValue) || 11T.A0O(str6, C5ap.A1c.stringValue)) {
                    z = true;
                }
            }
        }
        if (z || str5 != null || 1JF.A0C(str3, "bloks_cm_admod_review")) {
            if (1JF.A0C(str3, "bloks_cm_admod_review")) {
                intent.putExtra("modify_backstack_override", false);
            }
            return A0B(context, intent, threadKey);
        }
        Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
        intent2.setExtrasClassLoader(MainActivity.class.getClassLoader());
        intent2.setData(data);
        intent2.putExtra("thread_key", threadKey);
        intent2.putExtra("group_id", str);
        intent2.putExtra("community_id", str2);
        intent2.putExtra(1BJ.A00(508), true);
        intent2.putExtras(intent);
        return A05(context, intent, intent2);
    }

    public ListenableFuture A0D(Context context, Intent intent, String str, String str2) {
        Intent A0C = C3o5.A0C(context, intent);
        A0C.putExtra("group_id", str);
        A0C.putExtra("community_id", str2);
        A0C.putExtra("open_channel_list", true);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            A0C.putExtras(extras);
        }
        return A05(context, intent, A0C);
    }

    public String A0E(Intent intent) {
        return intent.getBooleanExtra("from_notification", false) ? "notification" : intent.getBooleanExtra("from_shortcut", false) ? "shortcut" : intent.getBooleanExtra("is_diode", false) ? "diode" : "android_external";
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0337, code lost:
    
        if (com.facebook.messaging.analytics.perf.MessagingPerformanceLogger.A08(r0).isMarkerOn(5505026) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(android.content.Intent r302, com.facebook.messaging.model.threadkey.ThreadKey r303, java.lang.Integer r304) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Dl.A0F(android.content.Intent, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.Integer):void");
    }
}
