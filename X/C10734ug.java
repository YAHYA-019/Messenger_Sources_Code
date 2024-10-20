package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadJoinRequest;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.4ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ug.class */
public final class C10734ug {
    public static final String[] A1X;
    public static final String[] A1Y;
    public ImmutableMap A00;
    public 1Mu A01;
    public 1BY A02;
    public 1Mu A03;
    public 1Mu A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final int A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final C00i A0Z;
    public final C00i A0a;
    public final C15h A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final int A0q;
    public final int A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final int A0v;
    public final int A0w;
    public final int A0x;
    public final int A0y;
    public final int A0z;
    public final int A10;
    public final int A11;
    public final int A12;
    public final int A13;
    public final int A14;
    public final int A15;
    public final int A16;
    public final int A17;
    public final int A18;
    public final int A19;
    public final int A1A;
    public final int A1B;
    public final int A1C;
    public final int A1D;
    public final int A1E;
    public final int A1F;
    public final int A1G;
    public final int A1H;
    public final int A1I;
    public final int A1J;
    public final int A1K;
    public final int A1L;
    public final int A1M;
    public final int A1N;
    public final int A1O;
    public final int A1P;
    public final int A1Q;
    public final C00i A1T;
    public final C00i A1U;
    public final 4yI A1W = (4yI) 1Bn.A0E((Context) null, (1BY) null, 49391);
    public final C00i A1R = new 1BV((1BY) null, 68216);
    public final 4yV A1V = (4yV) 1Bn.A0E((Context) null, (1BY) null, 49401);
    public final C00i A0Y = new 1BV((1BY) null, 116312);
    public final C00i A1S = new 1BV((1BY) null, 67434);

    static {
        String[] strArr = new String[85];
        System.arraycopy(new String[]{"thread_key", "legacy_thread_id", "sequence_id", "senders", "snippet", "snippet_sender", "admin_snippet", "timestamp_ms", "last_read_timestamp_ms", "approx_total_message_count", "unread_message_count", "can_reply_to", "cannot_reply_reason", "is_subscribed", "folder", "draft", "last_fetch_time_ms", "mute_until", "mute_calls_until", "initial_fetch_complete", "is_joinable", "requires_approval", "group_description", "is_discoverable", "room_privacy_mode", "room_associated_fb_group_id", "room_associated_fb_group_name"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"room_associated_photo_uri", "has_work_multi_company_associated_group", "approval_toggleable", "video_room_mode", "invite_uri", "room_creation_time", "group_thread_category", "are_admins_supported", "group_thread_add_mode", "group_thread_offline_threading_id", "personal_group_invite_link", "optimistic_group_state", "use_existing_group", "thread_associated_object_type", "can_participants_claim_admin", "group_approval_mode", "synced_fb_group_id", "synced_fb_group_status", "synced_fb_group_is_work_multi_company_group", "video_chat_link", "is_fuss_red_page", "is_disappearing_mode", "proactive_warning_dismiss_time", "vanish_mode_selection_timestamp", "vanish_mode_selected_mode", "is_thread_pinned", "theme_id"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"theme_fallback_color", "theme_gradient_colors", "theme_accessibility_label", "thread_pin_timestamp", "group_associated_fb_group_visibility", "thread_connectivity_data", "unsendability_status", "group_thread_subtype", "last_message_timestamp_ms", "job_application_time", "has_non_admin_message", "reported_timestamp_ms", "reviewed_timestamp_ms", "policy_violation_content_visibility_value", "vanishing_mode_paired_timestamp_ms", "should_open_disappearing_mode", "disappearing_thread_key", "unread_disappearing_message_count", "pinned_message_id", "pinned_message_snippet", "magic_words", "group_thread_warning_type", "last_missed_call_timestamp_ms", "is_last_missed_call_video", "last_snippet_update_timestamp_ms", "is_xac_thread", "last_missed_call_participant_ids"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"is_all_unread_message_missed_call_xma", "learning_space_data", "theme_payload_data", "thread_takedown_state"}, 0, strArr, 81, 4);
        A1X = strArr;
        A1Y = strArr;
    }

    public C10734ug(Cursor cursor, 1BO r303, String str) {
        1BV r0 = new 1BV((1BY) null, 147576);
        this.A0a = r0;
        this.A0Z = new 1BV((1BY) null, 66402);
        this.A1U = new 1BV((1BY) null, 81938);
        this.A1T = new 1BV((1BY) null, 66508);
        this.A02 = new 1BY(r303);
        this.A0b = new DBR(1Bn.A0E((Context) null, (1BY) null, 16428), this, 2);
        this.A0V = cursor.getColumnIndexOrThrow("thread_key");
        this.A1B = cursor.getColumnIndexOrThrow("sequence_id");
        this.A1A = cursor.getColumnIndexOrThrow("senders");
        this.A1D = cursor.getColumnIndexOrThrow("snippet");
        this.A1E = cursor.getColumnIndexOrThrow("snippet_sender");
        this.A0c = cursor.getColumnIndexOrThrow("admin_snippet");
        this.A1I = cursor.getColumnIndexOrThrow(1JF.A0B(str) ? "timestamp_ms" : str);
        this.A0w = cursor.getColumnIndexOrThrow("last_read_timestamp_ms");
        this.A0d = cursor.getColumnIndexOrThrow("approx_total_message_count");
        this.A1K = cursor.getColumnIndexOrThrow("unread_message_count");
        this.A0e = cursor.getColumnIndexOrThrow("can_reply_to");
        this.A0f = cursor.getColumnIndexOrThrow("cannot_reply_reason");
        this.A0q = cursor.getColumnIndexOrThrow("is_subscribed");
        this.A0i = cursor.getColumnIndexOrThrow("folder");
        this.A0h = cursor.getColumnIndexOrThrow("draft");
        this.A11 = cursor.getColumnIndexOrThrow("mute_until");
        this.A10 = cursor.getColumnIndexOrThrow("mute_calls_until");
        this.A0l = cursor.getColumnIndexOrThrow("initial_fetch_complete");
        this.A0L = cursor.getColumnIndexOrThrow("last_fetch_time_ms");
        this.A0F = cursor.getColumnIndexOrThrow("group_description");
        this.A0J = cursor.getColumnIndexOrThrow("is_discoverable");
        this.A0I = cursor.getColumnIndexOrThrow("invite_uri");
        this.A0K = cursor.getColumnIndexOrThrow("is_joinable");
        this.A0O = cursor.getColumnIndexOrThrow("requires_approval");
        this.A05 = cursor.getColumnIndexOrThrow("approval_toggleable");
        this.A0X = cursor.getColumnIndexOrThrow("video_room_mode");
        this.A0G = cursor.getColumnIndexOrThrow("room_privacy_mode");
        this.A0T = cursor.getColumnIndexOrThrow("thread_associated_object_type");
        this.A0A = cursor.getColumnIndexOrThrow("room_associated_fb_group_id");
        this.A0B = cursor.getColumnIndexOrThrow("room_associated_fb_group_name");
        this.A0E = cursor.getColumnIndexOrThrow("room_associated_photo_uri");
        this.A0D = cursor.getColumnIndexOrThrow("has_work_multi_company_associated_group");
        this.A08 = cursor.getColumnIndexOrThrow("room_creation_time");
        this.A0U = cursor.getColumnIndexOrThrow("group_thread_category");
        this.A06 = cursor.getColumnIndexOrThrow("are_admins_supported");
        this.A0M = cursor.getColumnIndexOrThrow("group_thread_add_mode");
        this.A0H = cursor.getColumnIndexOrThrow("group_thread_offline_threading_id");
        this.A0N = cursor.getColumnIndexOrThrow("personal_group_invite_link");
        this.A12 = cursor.getColumnIndexOrThrow("optimistic_group_state");
        this.A0W = cursor.getColumnIndexOrThrow("use_existing_group");
        this.A07 = cursor.getColumnIndexOrThrow("can_participants_claim_admin");
        this.A09 = cursor.getColumnIndexOrThrow("group_approval_mode");
        this.A0P = cursor.getColumnIndexOrThrow("synced_fb_group_id");
        this.A0R = cursor.getColumnIndexOrThrow("synced_fb_group_status");
        this.A0Q = cursor.getColumnIndexOrThrow("synced_fb_group_is_work_multi_company_group");
        this.A1P = cursor.getColumnIndexOrThrow("video_chat_link");
        this.A0o = cursor.getColumnIndexOrThrow("is_fuss_red_page");
        this.A0n = cursor.getColumnIndexOrThrow("is_disappearing_mode");
        this.A13 = cursor.getColumnIndexOrThrow("proactive_warning_dismiss_time");
        this.A1N = cursor.getColumnIndexOrThrow("vanish_mode_selection_timestamp");
        this.A1M = cursor.getColumnIndexOrThrow("vanish_mode_selected_mode");
        this.A0r = cursor.getColumnIndexOrThrow("is_thread_pinned");
        this.A0S = cursor.getColumnIndexOrThrow("theme_id");
        this.A14 = cursor.getColumnIndexOrThrow("thread_pin_timestamp");
        this.A0C = cursor.getColumnIndexOrThrow("group_associated_fb_group_visibility");
        this.A1G = cursor.getColumnIndexOrThrow("thread_connectivity_data");
        this.A1L = cursor.getColumnIndexOrThrow("unsendability_status");
        this.A0j = cursor.getColumnIndexOrThrow("group_thread_subtype");
        this.A0t = cursor.getColumnIndexOrThrow("last_message_timestamp_ms");
        this.A1Q = cursor.getColumnIndexOrThrow("job_application_time");
        this.A1O = cursor.getColumnIndexOrThrow("vanishing_mode_paired_timestamp_ms");
        this.A18 = cursor.getColumnIndexOrThrow("reported_timestamp_ms");
        this.A19 = cursor.getColumnIndexOrThrow("reviewed_timestamp_ms");
        this.A17 = cursor.getColumnIndexOrThrow("policy_violation_content_visibility_value");
        this.A1C = cursor.getColumnIndexOrThrow("should_open_disappearing_mode");
        this.A0g = cursor.getColumnIndexOrThrow("disappearing_thread_key");
        this.A1J = cursor.getColumnIndexOrThrow("unread_disappearing_message_count");
        this.A0z = cursor.getColumnIndexOrThrow("magic_words");
        this.A15 = cursor.getColumnIndexOrThrow("pinned_message_id");
        this.A16 = cursor.getColumnIndexOrThrow("pinned_message_snippet");
        this.A0k = cursor.getColumnIndexOrThrow("group_thread_warning_type");
        this.A0v = cursor.getColumnIndexOrThrow("last_missed_call_timestamp_ms");
        this.A0p = cursor.getColumnIndexOrThrow("is_last_missed_call_video");
        this.A0u = cursor.getColumnIndexOrThrow("last_missed_call_participant_ids");
        this.A0x = cursor.getColumnIndexOrThrow("last_snippet_update_timestamp_ms");
        this.A0s = cursor.getColumnIndexOrThrow("is_xac_thread");
        this.A0m = cursor.getColumnIndexOrThrow("is_all_unread_message_missed_call_xma");
        this.A0y = cursor.getColumnIndexOrThrow("learning_space_data");
        this.A1F = cursor.getColumnIndexOrThrow("theme_payload_data");
        this.A1H = cursor.getColumnIndexOrThrow("thread_takedown_state");
        r0.get();
    }

    private void A00(CDt cDt) {
        int i;
        C00j.A05("CoreIterationResultBuilder.ensureParticipantsForWholeCursor", 1099011101);
        try {
            if (this.A04 == null || this.A03 == null || this.A01 == null) {
                this.A04 = new ArrayListMultimap();
                this.A03 = new ArrayListMultimap();
                this.A01 = new ArrayListMultimap();
                SQLiteDatabase A01 = C10654u8.A01(this.A0b);
                SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
                CDt.A00(cDt);
                sQLiteQueryBuilder.setTables(CPu.A00(cDt.A01));
                Cursor query = sQLiteQueryBuilder.query(A01, null, null, null, null, null, null);
                try {
                    C1595Amc c1595Amc = new C1595Amc(query);
                    while (c1595Amc.hasNext()) {
                        C7u0 c7u0 = (C7u0) c1595Amc.next();
                        4SH r0 = 4SH.$redex_init_class;
                        int intValue = c7u0.A06.intValue();
                        if (intValue == 0) {
                            this.A04.CZw(c7u0.A01, c7u0.A02);
                        } else if (intValue == 1) {
                            this.A03.CZw(c7u0.A01, c7u0.A02);
                        } else {
                            if (intValue != 2) {
                                throw AnonymousClass001.A0L("Improper Thread Participant Type");
                            }
                            1Mu r02 = this.A01;
                            ThreadKey threadKey = c7u0.A01;
                            UserKey userKey = c7u0.A04;
                            long j = c7u0.A00;
                            UserKey userKey2 = c7u0.A03;
                            Integer num = c7u0.A05;
                            r02.CZw(threadKey, new ThreadJoinRequest(userKey, userKey2, num == null ? -1 : num.intValue(), j));
                        }
                    }
                    query.close();
                    i = 2031240102;
                } finally {
                }
            } else {
                i = 1023460925;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(2000339738);
            throw th;
        }
    }

    public C1zm A01(CDt cDt) {
        ThreadKey A0K = ThreadKey.A0K(cDt.A00.getString(this.A0V), true);
        C1zm c1zm = new C1zm();
        A0K.getClass();
        c1zm.A03(A0K);
        return c1zm;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r322v26 ??, still in use, count: 2, list:
          (r322v26 ??) from 0x00c4: PHI (r322v25 ??) = (r322v24 ??), (r322v26 ??) binds: [B:20:0x00ad, B:24:0x00be] A[DONT_GENERATE, DONT_INLINE]
          (r322v26 ?? I:java.lang.Object) from 0x00c0: INVOKE (r0v958 ?? I:java.util.AbstractMap), (r0v1015 ?? I:java.lang.Object), (r322v26 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x01de, MD:(K, V):V (c)]
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
    public void A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r322v26 ??, still in use, count: 2, list:
          (r322v26 ??) from 0x00c4: PHI (r322v25 ??) = (r322v24 ??), (r322v26 ??) binds: [B:20:0x00ad, B:24:0x00be] A[DONT_GENERATE, DONT_INLINE]
          (r322v26 ?? I:java.lang.Object) from 0x00c0: INVOKE (r0v958 ?? I:java.util.AbstractMap), (r0v1015 ?? I:java.lang.Object), (r322v26 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x01de, MD:(K, V):V (c)]
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
}
