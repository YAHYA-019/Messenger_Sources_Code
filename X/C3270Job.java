package X;

import android.app.PendingIntent;
import android.content.IntentSender;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Job, reason: case insensitive filesystem */
/* loaded from: Job.class */
public final class C3270Job extends 1RM {
    public final int A00;
    public final Object A01;

    public C3270Job(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        ExecutorService A1G;
        LpW lpS;
        Integer num;
        switch (this.A00) {
            case 0:
                boolean A1V = AnonymousClass001.A1V(obj);
                MAS mas = (MAS) this.A01;
                ((KT7) mas).A01 = A1V;
                C00i c00i = mas.A00.A00;
                ((KT7) mas).A00 = 4YV.A05(c00i);
                long A05 = 4YV.A05(c00i);
                A1G = GOp.A1G(mas.A01);
                lpS = new LpS(mas, A1V ? 1 : 0, A05);
                break;
            case 1:
                KhS khS = (KhS) obj;
                I2o i2o = (I2o) this.A01;
                if (i2o.A03 || i2o.A02 != null) {
                    return;
                }
                khS.getClass();
                Integer num2 = khS.A00;
                int intValue = num2.intValue();
                if (intValue == 0) {
                    num = 0S2.A0C;
                } else if (intValue != 2) {
                    num = 0S2.A0N;
                } else {
                    FbFragmentActivity fbFragmentActivity = i2o.A00;
                    if (num2 == 0S2.A0C) {
                        khS.A00 = 0S2.A0N;
                        try {
                            PendingIntent pendingIntent = khS.A01.A00.A01;
                            if (pendingIntent != null) {
                                fbFragmentActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 4975, null, 0, 0, 0);
                            }
                            i2o.A03 = true;
                            return;
                        } catch (IntentSender.SendIntentException e) {
                            0fH.A0N(Hdf.class, "Error starting google play services location dialog", e, new Object[0]);
                        }
                    }
                    num = 0S2.A0Y;
                }
                I2o.A00(i2o, num);
                return;
            case 2:
                List<Kqu> list = (List) obj;
                CbJ cbJ = (CbJ) this.A01;
                CallerContext callerContext = CbJ.A05;
                KzF kzF = (KzF) cbJ.A01.get();
                11T.A0F(list, 0);
                for (Kqu kqu : list) {
                    if (kqu != null) {
                        KzF.A00(kqu, kzF, (Integer) null, (Integer) null, (Integer) null, (Integer) null, kqu.A0E, (Throwable) null);
                    }
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = -1;
                int i14 = -1;
                int i15 = -1;
                for (Kqu kqu2 : list) {
                    if (kqu2 == null) {
                        i12++;
                    } else {
                        if (i13 == -1) {
                            i13 = kqu2.A00;
                            if (i13 == -1) {
                                i13 = 0;
                            }
                        }
                        if (i14 == -1) {
                            i14 = kqu2.A02;
                            if (i14 == -1) {
                                i14 = 0;
                            }
                        }
                        if (i15 == -1) {
                            i15 = kqu2.A01;
                            if (i15 == -1) {
                                i15 = 0;
                            }
                        }
                        int i16 = kqu2.A04;
                        if (i16 == -1) {
                            i16 = 0;
                        }
                        i += i16;
                        int i17 = kqu2.A06;
                        if (i17 == -1) {
                            i17 = 0;
                        }
                        i2 += i17;
                        int i18 = kqu2.A08;
                        if (i18 == -1) {
                            i18 = 0;
                        }
                        i3 += i18;
                        int i19 = kqu2.A07;
                        if (i19 == -1) {
                            i19 = 0;
                        }
                        i4 += i19;
                        int i20 = kqu2.A05;
                        if (i20 == -1) {
                            i20 = 0;
                        }
                        i5 += i20;
                        int i21 = kqu2.A0A;
                        if (i21 == -1) {
                            i21 = 0;
                        }
                        i6 += i21;
                        int i22 = kqu2.A09;
                        if (i22 == -1) {
                            i22 = 0;
                        }
                        i7 += i22;
                        int i23 = kqu2.A03;
                        if (i23 == -1) {
                            i23 = 0;
                        }
                        i8 += i23;
                        if (kqu2.A0C != null) {
                            i9++;
                        }
                        if (kqu2.A0B != null) {
                            i10++;
                        }
                        if (kqu2.A0D != null) {
                            i11++;
                        }
                    }
                }
                KzF.A00(new Kqu(null, null, null, "all", i13, i15, i14, i8, i, i5, i2, i4, i3, i7, i6), kzF, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), "all", (Throwable) null);
                return;
            case 3:
                boolean A1V2 = AnonymousClass001.A1V(obj);
                MAT mat = (MAT) this.A01;
                ((KT7) mat).A01 = A1V2;
                C00i c00i2 = mat.A01.A00;
                ((KT7) mat).A00 = 4YV.A05(c00i2);
                long A052 = 4YV.A05(c00i2);
                A1G = GOp.A1G(mat.A02);
                lpS = new LpW(mat, A1V2 ? 1 : 0, A052);
                break;
            default:
                JmB jmB = (JmB) this.A01;
                jmB.A06.A00(jmB.A0B, "services_request_appointment_create_success", jmB.A0C);
                jmB.A01.setVisibility(8);
                jmB.A04.ANa((AXn) null, 0S2.A00);
                return;
        }
        A1G.submit((Runnable) lpS);
    }

    public void A03(Throwable th) {
        1Br r308;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                r308 = ((MAS) this.A01).A03;
                break;
            case 1:
                I2o.A00((I2o) this.A01, 0S2.A0Y);
                return;
            case 2:
                CbJ cbJ = (CbJ) this.A01;
                CallerContext callerContext = CbJ.A05;
                KzF kzF = (KzF) cbJ.A01.get();
                11T.A0F(th, 0);
                KzF.A00((Kqu) null, kzF, (Integer) null, (Integer) null, (Integer) null, (Integer) null, "all", th);
                return;
            case 3:
                11T.A0F(th, 0);
                r308 = ((MAT) this.A01).A04;
                break;
            default:
                JmB jmB = (JmB) this.A01;
                jmB.A06.A00(jmB.A0B, "services_request_appointment_create_error", jmB.A0C);
                jmB.A01.setVisibility(8);
                ((F8q) jmB.A03.get()).A02(new FEd(jmB.getString(2131957335)));
                return;
        }
        ((3zH) 1Br.A0B(r308)).A01("", "", th.getMessage());
    }
}
