package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: Cf4.class */
public final class Cf4 implements DK5 {
    public DHt A01;
    public CharSequence A03;
    public ScheduledFuture A04;
    public DEZ A05;
    public final C01s A06;
    public final C0dp A07;
    public final BbS A08;
    public final ImmutableList A0A;
    public final ScheduledExecutorService A0D;
    public final Set A0B = AnonymousClass001.A0v();
    public final Set A0C = AnonymousClass001.A0v();
    public final C1325Ae3 A09 = new C1325Ae3();
    public Qo5 A02 = Qo5.A02;
    public int A00 = 0;

    public Cf4(C01s c01s, C0dp c0dp, BbS bbS, ScheduledExecutorService scheduledExecutorService) {
        this.A08 = bbS;
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = bbS.A00.iterator();
        while (it.hasNext()) {
            BoE boE = (BoE) it.next();
            builder.m11011add((Object) new ROs(boE));
            this.A00 += boE.A02 ? 1 : 0;
        }
        this.A0A = builder.build();
        this.A07 = c0dp;
        this.A0D = scheduledExecutorService;
        this.A06 = c01s;
    }

    private void A00(ROs rOs, ImmutableList.Builder builder, Set set) {
        String str;
        Object obj;
        String str2;
        CI9 ci9 = rOs.A04 ? rOs.A01 : rOs.A02;
        if (ci9 == null || ci9.A03 != 0S2.A00) {
            return;
        }
        CharSequence charSequence = this.A03;
        CharSequence charSequence2 = ci9.A02;
        if (charSequence == null) {
            if (charSequence2 != null) {
                return;
            }
        } else if (charSequence2 == null || !charSequence.toString().equals(charSequence2.toString())) {
            return;
        }
        ImmutableList immutableList = ci9.A01;
        String str3 = rOs.A06.A01;
        1Du it = immutableList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Bjj bjj = (Bjj) it.next();
            1Du it2 = bjj.A00.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                AoU aoU = (DJm) it2.next();
                if (aoU instanceof AoU) {
                    str = aoU.A03.A0n.A0u();
                    obj = "thread_key";
                } else if (aoU instanceof AoS) {
                    str = ((AoS) aoU).A07.A13;
                    obj = "user_id";
                } else {
                    if (!z && str3 != null) {
                        builder.m11011add((Object) new Cey(str3, null));
                    }
                    if (!z2 && (str2 = bjj.A01) != null) {
                        builder.m11011add((Object) new Cey(str2, null));
                    }
                    builder.m11011add((Object) aoU);
                    z = true;
                    z2 = true;
                }
                RS4 rs4 = new RS4(StringFormatUtil.formatStrLocaleSafe("%s:%s", obj, str));
                if (!set.contains(rs4)) {
                    set.add(rs4);
                    if (!z) {
                        builder.m11011add((Object) new Cey(str3, null));
                    }
                    if (!z2) {
                        builder.m11011add((Object) new Cey(str2, null));
                    }
                    builder.m11011add((Object) aoU);
                    z = true;
                    z2 = true;
                }
            }
        }
    }

    public static void A01(Cf4 cf4) {
        String str;
        ImmutableList immutableList = cf4.A0A;
        ROs rOs = (ROs) immutableList.get(0);
        CI9 ci9 = rOs.A04 ? rOs.A01 : rOs.A02;
        if (ci9 != null) {
            CharSequence charSequence = cf4.A03;
            CharSequence charSequence2 = ci9.A02;
            if (charSequence == null) {
                if (charSequence2 != null) {
                    return;
                }
            } else if (charSequence2 == null || !charSequence.toString().equals(charSequence2.toString())) {
                return;
            }
            Integer num = ci9.A03;
            Integer num2 = 0S2.A01;
            if (num != num2 && num != 0S2.A0C) {
                HashSet A0v = AnonymousClass001.A0v();
                ImmutableList.Builder builder = ImmutableList.builder();
                ArrayList A00 = 1JW.A00(immutableList.size());
                0fH.A09(Cf4.class, cf4.A03, "In getResult(%s) process filters");
                ScheduledFuture scheduledFuture = cf4.A04;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    cf4.A04 = null;
                }
                1Du it = immutableList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ROs rOs2 = (ROs) it.next();
                    str = rOs2.A07;
                    0fH.A09(Cf4.class, str, "....Processing filter %s");
                    Qo5 qo5 = rOs2.A03;
                    Qo5 qo52 = Qo5.A02;
                    long j = -1;
                    if ((qo5 == qo52 || rOs2.A04) && rOs2.A00 != j) {
                        if (qo5 == qo52) {
                            0fH.A09(Cf4.class, str, "....Handling finished filter %s");
                        } else {
                            0fH.A09(Cf4.class, str, "....Handling frozen filter %s");
                        }
                        if (!A00.isEmpty()) {
                            0fH.A09(Cf4.class, 1BK.A0k(A00), "....Processing %d unfinished filters");
                            long now = cf4.A07.now() - rOs2.A00;
                            if (now < 4000) {
                                0fH.A0D(Cf4.class, "....Schedule publish results.");
                                cf4.A04 = cf4.A0D.schedule((Runnable) new S71(cf4), 4000 - now, TimeUnit.MILLISECONDS);
                                break;
                            }
                            0fH.A0D(Cf4.class, "....Freeze previous unfinished filters.");
                            Iterator it2 = A00.iterator();
                            while (it2.hasNext()) {
                                ROs rOs3 = (ROs) it2.next();
                                rOs3.A04 = true;
                                rOs3.A01 = rOs3.A02;
                                cf4.A00(rOs3, builder, A0v);
                            }
                            A00.clear();
                        }
                        0fH.A09(Cf4.class, str, "....Adding results from filter %s");
                        cf4.A00(rOs2, builder, A0v);
                    } else {
                        if (qo5 == qo52 && rOs2.A00 == j) {
                            C01s c01s = cf4.A06;
                            StringBuilder sb = new StringBuilder(200);
                            sb.append("Bad results: [");
                            1Du it3 = immutableList.iterator();
                            while (it3.hasNext()) {
                                ROs rOs4 = (ROs) it3.next();
                                sb.append(rOs4.A07);
                                if (rOs4 == rOs2) {
                                    sb.append("*");
                                }
                                sb.append(" : ");
                                sb.append(rOs4.A04 ? rOs4.A01 : rOs4.A02);
                                sb.append(", ");
                            }
                            c01s.D0v("ContactPickerMergedFilter", AnonymousClass001.A0d("]", sb));
                        }
                        A00.add(rOs2);
                        if (rOs2.A08) {
                            0fH.A09(Cf4.class, str, "....Waiting for required result from %s");
                            break;
                        }
                        0fH.A09(Cf4.class, str, "....Skipping unfinished filter %s");
                    }
                }
                str = null;
                if (!A00.isEmpty()) {
                    ROs rOs5 = (ROs) A00.get(0);
                    0fH.A09(Cf4.class, rOs5.A07, "....Adding results from first unfinished filter %s");
                    cf4.A00(rOs5, builder, A0v);
                }
                0fH.A09(Cf4.class, cf4.A03, "Finished getResult(%s) process filters");
                if (cf4.A00 > 1 && A0v.isEmpty() && str != null) {
                    0fH.A0X(cf4.A03, Cf4.class, "Finished getResult(%s), no data and waiting for unfinished required filter: %s", str);
                    return;
                }
                ci9 = CI9.A00(builder.build(), cf4.A03);
            }
            0fH.A09(Cf4.class, ci9, "New filtering result: %s");
            DEZ dez = cf4.A05;
            if (dez != null) {
                dez.CbO(ci9, cf4.A03);
            }
            C1325Ae3 c1325Ae3 = cf4.A09;
            CharSequence charSequence3 = cf4.A03;
            c1325Ae3.BsT(new C1323Ae1(ci9.A01(), num2), cf4, null, charSequence3 == null ? null : charSequence3.toString());
            DHt dHt = cf4.A01;
            if (dHt != null) {
                int intValue = ci9.A03.intValue();
                dHt.ByX(intValue != 1 ? intValue != 0 ? 0 : ci9.A00 : -1);
            }
        }
    }

    public void A5L(DFe dFe) {
        this.A09.A00(dFe);
    }

    public void ASQ(CharSequence charSequence) {
        ASS(null, charSequence);
    }

    public void ASS(DHt dHt, CharSequence charSequence) {
        this.A0B.clear();
        this.A0C.clear();
        this.A01 = dHt;
        this.A03 = charSequence;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.A0A;
            if (i >= immutableList.size()) {
                return;
            }
            ROs rOs = (ROs) immutableList.get(i);
            i++;
            if (i < immutableList.size()) {
                immutableList.get(i);
            }
            S3k s3k = new S3k(rOs, this, charSequence);
            rOs.A04 = false;
            rOs.A01 = null;
            rOs.A00 = -1;
            rOs.A05.ASS(s3k, charSequence);
        }
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public Qo5 BCA() {
        return this.A02;
    }

    @Override // X.DK5
    public void BOl(DEZ dez) {
        this.A05 = dez;
        1Du it = this.A0A.iterator();
        while (it.hasNext()) {
            ROs rOs = (ROs) it.next();
            rOs.A05.BOl(new RnV(rOs, this));
        }
    }

    @Override // X.DK5
    public void BPx() {
        1Du it = this.A0A.iterator();
        while (it.hasNext()) {
            ((ROs) it.next()).A05.BPx();
        }
    }

    @Override // X.DK5
    public void Clc(ImmutableList immutableList) {
        1Du it = this.A0A.iterator();
        while (it.hasNext()) {
            ((ROs) it.next()).A05.Clc(immutableList);
        }
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        ASS(null, (String) obj);
        return C1323Ae1.A05;
    }

    @Override // X.DK5
    public void CuB(DEY dey) {
        1Du it = this.A0A.iterator();
        while (it.hasNext()) {
            ((ROs) it.next()).A05.CuB(dey);
        }
    }

    @Override // X.DK5
    public void CuT(String str) {
        1Du it = this.A0A.iterator();
        while (it.hasNext()) {
            ((ROs) it.next()).A05.CuT(str);
        }
    }

    public String getFriendlyName() {
        return "ContactPickerMergedFilter";
    }
}
