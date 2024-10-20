package com.facebook.presence.note.ui.creation;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.9T1;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: NotesMentionsContactLoader$load$1.class */
public final class NotesMentionsContactLoader$load$1 extends 0DO implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function1 $onUsersLoaded;
    public final /* synthetic */ String $searchTerm;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ 9T1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesMentionsContactLoader$load$1(Context context, 9T1 r303, String str, 0DR r305, Function1 function1) {
        super(2, r305);
        this.this$0 = r303;
        this.$searchTerm = str;
        this.$context = context;
        this.$onUsersLoaded = function1;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new NotesMentionsContactLoader$load$1(this.$context, this.this$0, this.$searchTerm, r303, this.$onUsersLoaded);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c0  */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01ac -> B:15:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.note.ui.creation.NotesMentionsContactLoader$load$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
