package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function2;

/* loaded from: AJP.class */
public final class AJP extends 0DO implements Function2 {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07 = 1;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJP(Context context, 8LJ r303, C9a2 c9a2, 0DR r305) {
        super(2, r305);
        this.A08 = context;
        this.A06 = c9a2;
        this.A09 = r303;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJP(Context context, FbUserSession fbUserSession, HighlightsFeedContent highlightsFeedContent, 0DR r305, long j) {
        super(2, r305);
        this.A08 = context;
        this.A09 = fbUserSession;
        this.A03 = highlightsFeedContent;
        this.A01 = j;
    }

    public final 0DR create(Object obj, 0DR r303) {
        int i = this.A07;
        Context context = (Context) this.A08;
        if (i == 0) {
            return new AJP(context, (FbUserSession) this.A09, (HighlightsFeedContent) this.A03, r303, this.A01);
        }
        AJP ajp = new AJP(context, (8LJ) this.A09, (C9a2) this.A06, r303);
        ajp.A03 = obj;
        return ajp;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0242  */
    /* JADX WARN: Type inference failed for: r0v178, types: [X.4cZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJP.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
