package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;

/* renamed from: X.GeX, reason: case insensitive filesystem */
/* loaded from: GeX.class */
public final class C2476GeX extends C1q6 implements 2QP {
    public int A00;
    public HrK A01;
    public CallModel A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final 1De A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final JL9 A0Q;
    public final C01i A0R;
    public final boolean A0S;
    public final FbUserSession A0T;
    public final JLm A0U;
    public final HGB A0V;
    public final ETl A0W;
    public final 1qP A0X;
    public final Ht3 A0Y;
    public final HFc A0Z;
    public final IZ2 A0a;
    public final IY8 A0b;
    public final 3Fu A0c;

    public C2476GeX(Resources resources, 1De r303, HrK hrK, JL9 jl9) {
        int i;
        11T.A0F(resources, 4);
        this.A09 = r303;
        this.A01 = hrK;
        this.A0Q = jl9;
        this.A0C = 1Bq.A00(49426);
        1BY r0 = r303.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A0P = A03;
        FbUserSession A032 = 1Br.A03(A03);
        this.A0T = A032;
        this.A0D = GOn.A0j(A032, r0);
        this.A0G = 1Lm.A03(A032, r0, 99472);
        this.A0M = 1Lm.A03(A032, r0, 84032);
        this.A0E = GOn.A0i(A032, r0);
        this.A0H = 1Bq.A00(115636);
        this.A0B = GOn.A0h(A032, r0);
        this.A0K = 1Lm.A03(A032, r0, 114859);
        this.A0O = GOn.A0f(A032, r0);
        this.A0A = 1Lm.A03(A032, r0, 98492);
        this.A0J = 1Lm.A03(A032, r0, 114856);
        this.A0F = 1Lm.A03(A032, r0, 99846);
        this.A0L = GOn.A0g(A032, r0);
        this.A0I = 1Bq.A00(116389);
        this.A0N = 1Bu.A03(r0, 16430);
        String A02 = 2yD.A02(1BL.A0Q(), 36886845585360572L);
        if (A02.equals("v3")) {
            i = 2131034119;
        } else {
            i = 2131034117;
            if (A02.equals("v2")) {
                i = 2131034118;
            }
        }
        this.A0S = resources.getBoolean(i);
        this.A0Z = new GqF(this, 4);
        this.A0c = Gyu.A00(this, 22);
        this.A0a = new IZ2(this);
        this.A0U = GpZ.A00(this, 37);
        this.A0W = new Gpr(this, 3);
        this.A0X = new Gpy(this, 7);
        this.A0V = new Gpl(this, 16);
        this.A0Y = new Gq8(this, 10);
        this.A0b = IY8.A01(this, 45);
        this.A0R = J9t.A00(this, C03i.A02, 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r0 == 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A00() {
        /*
            r301 = this;
            X.2yD r0 = X.1BL.A0Q()
            r302 = r0
            r0 = 36323414595619376(0x810bf400004a30, double:3.034411880695857E-306)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2d
            r0 = r301
            X.1Br r0 = r0.A0H
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.Hur r0 = (X.Hur) r0
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L2c
            r0 = r306
            r0.A02()
        L2c:
            return
        L2d:
            r0 = r301
            int r0 = r0.A00
            r307 = r0
            r0 = 4
            r305 = r0
            r0 = r307
            r1 = r305
            if (r0 == r1) goto L4a
            r0 = 3
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = r307
            r1 = r305
            if (r0 != r1) goto L4d
        L4a:
            r0 = 1
            r308 = r0
        L4d:
            r0 = r301
            X.1Br r0 = r0.A0H
            r306 = r0
            r0 = r306
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.Hur r0 = (X.Hur) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2c
            r0 = r302
            monitor-enter(r0)
            r0 = r302
            android.os.PowerManager$WakeLock r0 = r0.A02     // Catch: java.lang.Throwable -> Lab
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L9d
            r0 = r306
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> Lab
            r305 = r0
            r0 = r305
            r1 = r307
            if (r0 != r1) goto L9d
            r0 = r302
            android.os.PowerManager$WakeLock r0 = r0.A02     // Catch: java.lang.Throwable -> Lab
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L9d
            r0 = r308
            if (r0 == 0) goto L91
            r0 = 0
            r307 = r0
        L91:
            r0 = r306
            r1 = r307
            r0.release(r1)     // Catch: java.lang.Throwable -> Lab
            r0 = r306
            X.0Ew.A00(r0)     // Catch: java.lang.Throwable -> Lab
        L9d:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            r1 = 0
            r0.A02 = r1     // Catch: java.lang.Throwable -> Lab
            r0 = r302
            monitor-exit(r0)
            return
        Lab:
            r306 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r306
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2476GeX.A00():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0208, code lost:
    
        if (X.AbJ.A0X(r301.A0O).A0Q() == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C2476GeX r301, com.facebook.rsys.call.gen.CallModel r302) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2476GeX.A01(X.GeX, com.facebook.rsys.call.gen.CallModel):void");
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        this.A01 = null;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
        GOp.A0w(this.A0E).A7G(this.A0c);
        GOp.A0f(this.A0K).A01(this.A0Z);
        this.A0Q.Cqk(AnonymousClass001.A07(), this.A0a);
        GOp.A0Q(this.A0B).A60(this.A0U);
        ((FAb) 1Br.A0B(this.A0G)).A05(this.A0W);
        GOq.A1G(this.A0C, this);
        GOn.A1V(AbJ.A0X(this.A0O), this.A0X);
        GOp.A0R(this.A0A).A09(this.A0V);
        GOp.A0a(this.A0J).A62(this.A0Y);
        C00i c00i = this.A0L.A00;
        2JN A0R = GOo.A0R(c00i);
        IY8 iy8 = this.A0b;
        GOn.A1U(iy8, A0R);
        JNg A00 = Hn2.A00(this.A0I);
        if (A00 != null) {
            A00.A6O((HGE) this.A0R.getValue(), "InCallSensorManager");
        }
        IY8.A03(c00i, iy8);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
        ((FAb) 1Br.A0B(this.A0G)).A06(this.A0W);
        GOp.A0w(this.A0E).Cf7(this.A0c);
        GOp.A0f(this.A0K).A02(this.A0Z);
        JL9 jl9 = this.A0Q;
        jl9.D6E();
        GOp.A0Q(this.A0B).CeV(this.A0U);
        ((C4zR) 1Br.A0B(this.A0C)).A05(this);
        2Qb A0X = AbJ.A0X(this.A0O);
        A0X.A0V.remove(this.A0X);
        GOp.A0R(this.A0A).A0A(this.A0V);
        GOp.A0a(this.A0J).CeX(this.A0Y);
        GOp.A0O(this.A0L).A02(this.A0b);
        JNg A00 = Hn2.A00(this.A0I);
        if (A00 != null) {
            A00.Cee("InCallSensorManager");
        }
        HrK hrK = this.A01;
        if (hrK != null) {
            hrK.A00();
        }
        HrK hrK2 = this.A01;
        if (hrK2 != null) {
            hrK2.A01();
        }
        A00();
        jl9.disable();
        this.A04 = true;
        this.A05 = false;
        this.A06 = false;
        this.A03 = null;
    }

    public java.util.Map CYl() {
        Object obj;
        0QO r0 = new 0QO(5);
        r0.put("always allow rotation", String.valueOf(this.A0S));
        r0.put("allow rotation", String.valueOf(this.A04));
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    obj = "LOCK_PORTRAIT";
                    break;
                case 2:
                    obj = "ALLOW_ORIENTATION";
                    break;
                default:
                    obj = "LOCK_LANDSCAPE";
                    break;
            }
        } else {
            obj = "null";
        }
        r0.put("last updated orientation settings", obj);
        r0.put("force screen on", String.valueOf(this.A05));
        r0.put("proximity sensor", String.valueOf(this.A06));
        return r0;
    }
}
