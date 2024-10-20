package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AJh.class */
public final class AJh extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJh(KMR kmr, 9Mc r303, 0DR r304, Function1 function1) {
        super(2, r304);
        this.A06 = 0;
        this.A08 = kmr;
        this.A05 = r303;
        this.A07 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJh(ContentResolver contentResolver, Context context, Uri uri, GSS gss, 0DR r306, C4G7 c4g7) {
        super(2, r306);
        this.A06 = 1;
        this.A03 = contentResolver;
        this.A07 = uri;
        this.A02 = gss;
        this.A01 = c4g7;
        this.A08 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJh(ThreadKey threadKey, 9L5 r303, UserKey userKey, 2Og r305, 0DR r306) {
        super(2, r306);
        this.A06 = 5;
        this.A07 = r305;
        this.A05 = r303;
        this.A01 = userKey;
        this.A08 = threadKey;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 0DR r308, int i) {
        super(2, r308);
        this.A06 = i;
        this.A07 = obj;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A08 = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 0DR r309, int i) {
        super(2, r309);
        this.A06 = i;
        this.A05 = obj;
        this.A08 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A07 = obj5;
        this.A01 = obj6;
        this.A04 = obj7;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i;
        AJh aJh;
        switch (this.A06) {
            case 0:
                AJh aJh2 = new AJh((KMR) this.A08, (9Mc) this.A05, r303, (Function1) this.A07);
                aJh2.A01 = obj;
                return aJh2;
            case 1:
                aJh = new AJh((ContentResolver) this.A03, (Context) this.A08, (Uri) this.A07, (GSS) this.A02, r303, (C4G7) this.A01);
                aJh.A04 = obj;
                return aJh;
            case 2:
                Object obj9 = this.A08;
                return new AJh(this.A07, this.A05, this.A01, this.A02, this.A03, obj9, r303, 2);
            case 3:
                obj2 = this.A05;
                obj7 = this.A08;
                obj8 = this.A02;
                obj4 = this.A03;
                obj3 = this.A07;
                obj5 = this.A01;
                obj6 = this.A04;
                i = 3;
                break;
            case 4:
                obj2 = this.A05;
                obj3 = this.A07;
                obj4 = this.A03;
                obj5 = this.A01;
                obj6 = this.A04;
                obj7 = this.A08;
                obj8 = this.A02;
                i = 4;
                break;
            case 5:
                return new AJh((ThreadKey) this.A08, (9L5) this.A05, (UserKey) this.A01, (2Og) this.A07, r303);
            default:
                aJh = new AJh(this.A07, this.A05, this.A01, this.A02, this.A03, this.A08, r303, 6);
                aJh.A04 = obj;
                return aJh;
        }
        return new AJh(obj2, obj7, obj8, obj4, obj3, obj5, obj6, r303, i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0545, code lost:
    
        if (r309 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x07c9, code lost:
    
        if (r310 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0846, code lost:
    
        if (r311 == null) goto L183;
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
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x0c1b: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:300:0x0c1b */
    /* JADX WARN: Removed duplicated region for block: B:214:0x099a A[Catch: all -> 0x0a23, TRY_ENTER, TryCatch #1 {all -> 0x0a23, blocks: (B:202:0x0911, B:204:0x096a, B:205:0x0970, B:206:0x0976, B:207:0x097d, B:211:0x0990, B:214:0x099a, B:216:0x09a1, B:217:0x09a6, B:218:0x09ad, B:220:0x09c7, B:221:0x09ce, B:223:0x09d5, B:224:0x09db, B:225:0x09e1, B:226:0x09e7, B:228:0x09f0, B:237:0x098b, B:239:0x0953, B:240:0x0959, B:241:0x0960), top: B:198:0x08f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a08 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v650, types: [X.4cZ] */
    /* JADX WARN: Type inference failed for: r314v0, types: [X.4dH] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x09fc -> B:202:0x0969). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
