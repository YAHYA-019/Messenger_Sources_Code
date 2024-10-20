package X;

import com.facebook.graphservice.interfaces.PaginableList;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.aibot.feedback.model.AiBotFeedbackParams;
import java.util.List;
import java.util.Set;

/* renamed from: X.87w, reason: invalid class name */
/* loaded from: 87w.class */
public final class C87w extends C04v {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C87w() {
        this((List) C0ty.A00, (Set) 7zL.A15(), false);
        this.A02 = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C87w(int i) {
        this(new C87w((Integer) null, 7), new 8Lc(), false);
        this.A02 = i;
        switch (i) {
            case 1:
                this.A02 = 1;
                this((List) C0ty.A00, (Set) 7zL.A15(), false);
                return;
            case 6:
                this((Integer) null, 7);
                return;
            default:
                this.A02 = 7;
                return;
        }
    }

    public C87w(int i, Object obj, Object obj2, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A03 = obj2;
        this.A01 = z;
    }

    public C87w(C2p1 c2p1, C2fr c2fr, boolean z) {
        this.A02 = 4;
        this.A00 = c2fr;
        this.A03 = c2p1;
        this.A01 = z;
    }

    public C87w(EnumC11364wa enumC11364wa, boolean z) {
        this.A02 = 0;
        EnumC11364wa enumC11364wa2 = EnumC11364wa.A02;
        this.A02 = 0;
        this.A03 = enumC11364wa;
        this.A00 = enumC11364wa2;
        this.A01 = z;
    }

    public C87w(C87w c87w, 8Lc r303, boolean z) {
        this.A02 = 7;
        this.A03 = c87w;
        this.A00 = r303;
        this.A01 = z;
    }

    public C87w(PaginableList paginableList, Integer num, boolean z) {
        this.A02 = 6;
        7zR.A1N(paginableList, num);
        this.A00 = paginableList;
        this.A01 = z;
        this.A03 = num;
    }

    public C87w(ThreadKey threadKey, AiBotFeedbackParams aiBotFeedbackParams) {
        this.A02 = 5;
        11T.A0F(threadKey, 2);
        this.A03 = aiBotFeedbackParams;
        this.A00 = threadKey;
        this.A01 = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C87w(java.lang.Integer r302, int r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r301
            r1 = 6
            r0.A02 = r1
            r0 = r303
            r1 = 1
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L1d
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r306 = r0
            r0 = r306
            com.facebook.graphservice.interfaces.PaginableList r0 = com.facebook.graphservice.interfaces.PaginableList.withoutPaging(r0)
            r304 = r0
        L1d:
            r0 = r303
            r1 = 4
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2b
            java.lang.Integer r0 = X.0S2.A0C
            r302 = r0
        L2b:
            r0 = r301
            r1 = r304
            r2 = r302
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87w.<init>(java.lang.Integer, int):void");
    }

    public C87w(List list, Set set, boolean z) {
        this.A02 = 1;
        this.A01 = z;
        this.A00 = set;
        this.A03 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.C87w) r302).A02 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.C87w
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.87w r0 = (X.C87w) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A02
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r301
            if (r0 == r1) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87w.A00(int, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87w.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int A03;
        Object obj;
        int A05;
        int hashCode;
        int A02;
        String str;
        switch (this.A02) {
            case 0:
                A03 = 1BL.A03(this.A03);
                obj = this.A00;
                A02 = obj.hashCode();
                A05 = (A02 + A03) * 31;
                hashCode = AnonymousClass002.A00(this.A01 ? 1 : 0);
                return hashCode + A05;
            case 1:
                A05 = AnonymousClass002.A05(this.A00, AnonymousClass002.A00(this.A01 ? 1 : 0) * 31);
                hashCode = this.A03.hashCode();
                return hashCode + A05;
            case 2:
                hashCode = ((AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass001.A02(this.A03)) * 31;
                A05 = 4YU.A03(this.A00);
                return hashCode + A05;
            case 3:
                A02 = AnonymousClass001.A02(this.A00) * 31;
                A03 = 4YU.A03(this.A03);
                A05 = (A02 + A03) * 31;
                hashCode = AnonymousClass002.A00(this.A01 ? 1 : 0);
                return hashCode + A05;
            case 4:
                A03 = 1BL.A03(this.A00);
                obj = this.A03;
                A02 = obj.hashCode();
                A05 = (A02 + A03) * 31;
                hashCode = AnonymousClass002.A00(this.A01 ? 1 : 0);
                return hashCode + A05;
            case 5:
                A03 = 1BL.A03(this.A03);
                obj = this.A00;
                A02 = obj.hashCode();
                A05 = (A02 + A03) * 31;
                hashCode = AnonymousClass002.A00(this.A01 ? 1 : 0);
                return hashCode + A05;
            case 6:
                A05 = (1BL.A03(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31;
                int A032 = AnonymousClass001.A03(this.A03);
                switch (A032) {
                    case 1:
                        str = "ERROR";
                        break;
                    case 2:
                        str = "COMPLETE";
                        break;
                    default:
                        str = "LOADING";
                        break;
                }
                hashCode = 7zM.A04(str, A032);
                return hashCode + A05;
            case 7:
                A03 = 1BL.A03(this.A03);
                obj = this.A00;
                A02 = obj.hashCode();
                A05 = (A02 + A03) * 31;
                hashCode = AnonymousClass002.A00(this.A01 ? 1 : 0);
                return hashCode + A05;
            default:
                return super.hashCode();
        }
    }
}
