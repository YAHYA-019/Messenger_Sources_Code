package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.82r, reason: invalid class name */
/* loaded from: 82r.class */
public final class C82r extends 0DO implements Function2 {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82r(Object obj, 0DR r303, int i) {
        super(2, r303);
        this.A01 = i;
        this.A02 = obj;
    }

    public final 0DR create(Object obj, 0DR r303) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            default:
                i = 12;
                break;
        }
        return new C82r(obj2, r303, i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0ede, code lost:
    
        if (X.C5yh.A00(r0, r0, null) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0fbb, code lost:
    
        if (r0.A02((com.facebook.messaging.model.threadkey.ThreadKey) null, (com.facebook.prefs.shared.FbSharedPreferences) r0.get()) >= ((X.2yD) r0.get()).Auy(36599507979276916L)) goto L204;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x123c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0540  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
