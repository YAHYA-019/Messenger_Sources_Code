package X;

import com.facebook.messaging.communitymessaging.unread.calculator.count.CommunityListUnreadCountsFlowFactory$create$$inlined$map$1$2;

/* loaded from: AHv.class */
public final class AHv implements 0zV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AHv(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public Object collect(0zU r302, 0DR r303) {
        0zV r305;
        Object obj;
        int i;
        Object A00;
        0zU communityListUnreadCountsFlowFactory$create$$inlined$map$1$2;
        switch (this.A00) {
            case 0:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 1;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 1:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 2;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 2:
                0zV[] r0 = (0zV[]) this.A01;
                A00 = C0z7.A00(r303, new GAY(r0, 39), new AJr(this.A02, null, 0), r302, r0);
                break;
            case 3:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 3;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 4:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 4;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 5:
                r305 = (0zV) this.A01;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new CommunityListUnreadCountsFlowFactory$create$$inlined$map$1$2((5dY) this.A02, r302);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 6:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 7;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 7:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 9;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 8:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 11;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 9:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 12;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 10:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 13;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            case 11:
                r305 = (0zV) this.A01;
                obj = this.A02;
                i = 14;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(r302, obj, i);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
            default:
                r305 = (0zV) this.A02;
                communityListUnreadCountsFlowFactory$create$$inlined$map$1$2 = new AI6(this.A01, r302, 18);
                A00 = r305.collect(communityListUnreadCountsFlowFactory$create$$inlined$map$1$2, r303);
                break;
        }
        if (A00 != 0Ds.A02) {
            A00 = 04S.A00;
        }
        return A00;
    }
}
