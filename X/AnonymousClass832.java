package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.832, reason: invalid class name */
/* loaded from: 832.class */
public final class AnonymousClass832 extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass832(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        7JT r308;
        int i;
        7JT r0;
        Context context;
        Object AYZ;
        switch (this.A00) {
            case 0:
                context = ((7ML) this.A01).A00;
                return new 75E(context);
            case 1:
                7Mh r02 = (7Mh) this.A01;
                return new 7Mp((75G) r02.A04.getValue(), r02.A06);
            case 2:
                context = ((C6yp) this.A01).A00;
                return new 75E(context);
            case 3:
                r308 = (Drawable) this.A01;
                if (r308 instanceof 7JT) {
                    r308.BjV();
                }
                i = 42;
                return new C4FP(new AQY(r308, i));
            case 4:
                7Gs r03 = (7Gs) this.A01;
                return r03.A02.AYZ(r03.A03, r03.A04, r03.A01, r03.A00);
            case 5:
                r308 = (Drawable) this.A01;
                if ((r308 instanceof 7JT) && (r0 = r308) != null) {
                    r0.BjV();
                }
                i = 45;
                return new C4FP(new AQY(r308, i));
            case 6:
                7Tw r04 = (7Tw) this.A01;
                AYZ = r04.A01.AYZ(r04.A02, r04.A03, r04.A00, 255);
                if (AYZ instanceof 7Jk) {
                    ((7Jk) AYZ).A04.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    return AYZ;
                }
                return AYZ;
            case 7:
                7QZ r05 = (7QZ) this.A01;
                CallerContext callerContext = 7QZ.A0F;
                return Boolean.valueOf(r05.A06);
            case 8:
                int i2 = 0;
                CallerContext callerContext2 = 7QZ.A0F;
                7QZ r06 = (7QZ) this.A01;
                boolean z = r06.A07;
                boolean z2 = r06.A05;
                boolean z3 = !z2;
                String str = r06.A03;
                String str2 = r06.A04;
                int i3 = r06.A00;
                3xX r07 = r06.A01;
                Integer num = r06.A02;
                if (num != null) {
                    i2 = num.intValue();
                }
                return new C6qc(callerContext2, null, null, r07, null, str, str2, i3, i2, true, z, z3, z2, false, false);
            case 9:
            case 10:
            default:
                AYZ = ((C00m) this.A01).invoke();
                return AYZ;
            case 11:
                C2ob c2ob = new C2ob();
                C2ov c2ov = new C2ov();
                Object obj = this.A01;
                new GAb(obj, 9).invoke(c2ob);
                new GAb(obj, 10).invoke(c2ov);
                return new C2on(new C2oy(c2ov), new C2oi(c2ob));
            case 12:
                C72n c72n = (C72n) this.A01;
                return new C2pu(new A9K(c72n.A00, c72n.A01));
            case 13:
                return new LruCache((int) 4hW.A00((4hY) this.A01).Auy(36594117795186541L));
        }
    }
}
