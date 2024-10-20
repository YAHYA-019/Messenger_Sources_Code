package X;

import android.content.Context;
import com.facebook.secure.secrettypes.SecretString;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.87v, reason: invalid class name */
/* loaded from: 87v.class */
public final class C87v extends C04v {
    public Object A00;
    public final int A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C87v() {
        this(8Kh.A01);
        this.A01 = 9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C87v(int i) {
        this((List) null, 14);
        this.A01 = i;
        switch (i) {
            case 2:
                this.A01 = 2;
                this((Object) null, 2);
                return;
            case 8:
                this.A01 = 8;
                this((java.util.Map) 7zM.A1F());
                return;
            case 9:
                this.A01 = 9;
                this(8Kh.A01);
                return;
            default:
                this.A01 = 14;
                return;
        }
    }

    public C87v(C2fr c2fr) {
        this.A01 = 13;
        this.A00 = c2fr;
    }

    public C87v(C6qi c6qi) {
        this.A01 = 18;
        11T.A0F(c6qi, 1);
        this.A00 = c6qi;
    }

    public C87v(8Kh r302) {
        this.A01 = 9;
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public C87v(9DA r302) {
        this.A01 = 12;
        this.A00 = r302;
    }

    public C87v(9Dx r302) {
        this.A01 = 17;
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public C87v(HDm hDm) {
        this.A01 = 15;
        this.A00 = hDm;
    }

    public C87v(Jt2 jt2) {
        this.A01 = 1;
        11T.A0F(jt2, 1);
        this.A00 = jt2;
    }

    public C87v(Context context) {
        this.A01 = 7;
        this.A00 = context;
    }

    public C87v(SecretString secretString) {
        this.A01 = 20;
        11T.A0F(secretString, 1);
        this.A00 = secretString;
    }

    public C87v(ImmutableList immutableList) {
        this.A01 = 6;
        this.A00 = immutableList;
    }

    public C87v(Integer num, int i) {
        this.A01 = i;
        if (i != 0) {
            11T.A0F(num, 1);
        }
        this.A00 = num;
    }

    public C87v(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C87v(List list, int i) {
        this.A01 = i;
        if (11 - i == 0) {
            11T.A0F(list, 1);
        }
        this.A00 = list;
    }

    public C87v(java.util.Map map) {
        this.A01 = 8;
        this.A00 = map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C87v(java.util.Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((java.util.Map) 7zM.A1F());
        this.A01 = 8;
    }

    public static void A00(2Of r301, String str) {
        List singletonList = Collections.singletonList(new C87v(C6qi.A02));
        11T.A0A(singletonList);
        r301.AQN(new C7Us(str, singletonList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.C87v) r302).A01 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.C87v
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.87v r0 = (X.C87v) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C87v.A01(int, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0197 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87v.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object obj;
        String str;
        switch (this.A01) {
            case 0:
                Integer num = (Integer) this.A00;
                if (num != null) {
                    return 7zU.A02(num, Kvh.A01(num));
                }
                return 0;
            case 1:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                obj = this.A00;
                break;
            case 2:
            case 5:
            case 10:
            case 14:
                obj = this.A00;
                if (obj == null) {
                    return 0;
                }
                break;
            case 3:
                int A03 = AnonymousClass001.A03(this.A00);
                switch (A03) {
                    case 1:
                        str = "VISIBLE";
                        break;
                    case 2:
                        str = "INVISIBLE";
                        break;
                    default:
                        str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                        break;
                }
                return 7zM.A04(str, A03);
            case 4:
                return 9BK.A00((Integer) this.A00);
            case 9:
            default:
                return super.hashCode();
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder A0k;
        String str;
        switch (this.A01) {
            case 14:
                A0k = AnonymousClass001.A0k();
                str = "GraphQLInAppPurchaseOffer(subscriptionOffers=";
                break;
            case 15:
                A0k = AnonymousClass001.A0k();
                str = "GridLayoutStateUpdatedAction(layoutState=";
                break;
            case 16:
                A0k = AnonymousClass001.A0k();
                str = "MaybeEndPreCallAction(endedPreCallState=";
                break;
            case 17:
                A0k = AnonymousClass001.A0k();
                str = "PreCallStateUpdateAction(preCallState=";
                break;
            default:
                return super.toString();
        }
        A0k.append(str);
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
