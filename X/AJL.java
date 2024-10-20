package X;

import com.facebook.messaging.avatar.avatardetail.repository.AvatarDetailConfigRepository;
import kotlin.jvm.functions.Function2;

/* loaded from: AJL.class */
public final class AJL extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJL(AvatarDetailConfigRepository avatarDetailConfigRepository, String str, String str2, 0DR r305) {
        super(2, r305);
        this.A02 = 1;
        this.A03 = avatarDetailConfigRepository;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJL(Object obj, Object obj2, String str, String str2, 0DR r306, int i) {
        super(2, r306);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        int i;
        switch (this.A02) {
            case 0:
                str2 = this.A05;
                str = this.A04;
                obj2 = this.A03;
                obj3 = this.A01;
                i = 0;
                return new AJL(obj2, obj3, str2, str, r303, i);
            case 1:
                AJL ajl = new AJL((AvatarDetailConfigRepository) this.A03, this.A05, this.A04, r303);
                ajl.A01 = obj;
                return ajl;
            case 2:
                obj2 = this.A03;
                obj3 = this.A01;
                str2 = this.A05;
                str = this.A04;
                i = 2;
                return new AJL(obj2, obj3, str2, str, r303, i);
            case 3:
                obj2 = this.A03;
                str = this.A04;
                str2 = this.A05;
                obj3 = this.A01;
                i = 3;
                return new AJL(obj2, obj3, str2, str, r303, i);
            case 4:
                obj2 = this.A03;
                str = this.A04;
                str2 = this.A05;
                obj3 = this.A01;
                i = 4;
                return new AJL(obj2, obj3, str2, str, r303, i);
            default:
                obj2 = this.A03;
                str2 = this.A05;
                str = this.A04;
                obj3 = this.A01;
                i = 5;
                return new AJL(obj2, obj3, str2, str, r303, i);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJL.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
