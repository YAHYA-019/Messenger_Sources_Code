package X;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: IkL.class */
public final class IkL implements JMZ {
    public final Rgr A00;
    public final /* synthetic */ IkG A01;

    public IkL(Rgr rgr, IkG ikG) {
        this.A01 = ikG;
        this.A00 = rgr;
    }

    public void Bn6(I51 i51) {
        11T.A0F(i51, 0);
        this.A00.A02(i51);
        IkG ikG = this.A01;
        synchronized (ikG) {
            if (ikG.A03 == 0S2.A01) {
                ikG.A03 = 0S2.A0C;
                ikG.A01.A00();
            }
        }
    }

    public void Bwr(HDB hdb, I51 i51) {
        11T.A0H(hdb, i51);
        this.A00.A03(i51, hdb);
        IkG ikG = this.A01;
        synchronized (ikG) {
            if (ikG.A03 == 0S2.A01) {
                ikG.A03 = 0S2.A0N;
                ikG.A01.A03(hdb);
                ikG.A0F.CRU(hdb);
                IkG.A04(ikG, hdb);
            }
        }
    }

    public void CJu(Qq3 qq3, float f) {
        IkG ikG = this.A01;
        synchronized (ikG) {
            RZF rzf = ikG.A0B;
            if (qq3 != Qq3.A02) {
                rzf.A01 = f;
                RZF.A00(rzf);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.QyS] */
    public void CJw(Qq3 qq3, File file, int i, long j) {
        11T.A0F(file, 0);
        Rgr rgr = this.A00;
        String name = qq3.name();
        IkG ikG = this.A01;
        rgr.A04(name, IkG.A01(ikG), i);
        synchronized (ikG) {
            if (ikG.A03 == 0S2.A01) {
                long j2 = -1;
                ?? obj = new Object();
                ((QyS) obj).A05 = file;
                ((QyS) obj).A02 = j2;
                ((QyS) obj).A04 = qq3;
                ((QyS) obj).A06 = "video/mp4";
                ((QyS) obj).A03 = j2;
                ((QyS) obj).A00 = i;
                ((QyS) obj).A01 = j;
                ikG.A0M.add(obj);
                ikG.A0H.put(file, obj);
                IkG.A03(ikG);
            }
        }
    }

    public void CJy(IDe iDe, Qq3 qq3, int i) {
        IllegalStateException th;
        11T.A0F(iDe, 2);
        Rgr rgr = this.A00;
        String name = qq3.name();
        IkG ikG = this.A01;
        JSONObject A01 = IkG.A01(ikG);
        synchronized (rgr) {
            11T.A0F(name, 0);
            Rgr.A00(rgr, iDe, AbstractC00603o4.A00(65), name, A01, i);
        }
        synchronized (ikG) {
            if (ikG.A03 == 0S2.A01) {
                List<IDe> list = ikG.A0K;
                list.add(iDe);
                HashMap hashMap = ikG.A0H;
                File file = iDe.A0N;
                Object obj = hashMap.get(file);
                if (obj != null) {
                    QyS qyS = (QyS) obj;
                    qyS.A02 = file.length();
                    ikG.A0J.add(qyS);
                    IkG.A02(rgr, iDe, ikG, qyS);
                    IkG.A03(ikG);
                    IkG.A02(rgr, iDe, ikG, qyS);
                    if (iDe.A0O) {
                        try {
                            ikG.A00++;
                            HuI huI = ikG.A01;
                            if (ikG.A0L.size() == ikG.A00) {
                                for (IDe iDe2 : list) {
                                    if (ikG.A0A == QqC.A04) {
                                        int i2 = iDe2.A0D;
                                        int i3 = iDe2.A0B;
                                        java.util.Map map = huI.A02;
                                        map.put("target_width", String.valueOf(i2));
                                        map.put("target_height", String.valueOf(i3));
                                    }
                                    if (iDe2.A0M == HAy.A03) {
                                        huI.A02.put("target_color_space", RVP.A00(iDe2.A08));
                                    }
                                }
                                huI.A01();
                                ikG.A0F.CRW(ikG.A09, ikG.A0C, list, true);
                                try {
                                    ikG.A0E.A08();
                                } catch (IllegalStateException e) {
                                    IkG.A04(ikG, e);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    synchronized (ikG) {
                        Exception exc = ikG.A02;
                        if (ikG.A0L.size() == ikG.A00 && exc != null) {
                            ikG.CRb(exc);
                        }
                        IkG.A02(rgr, iDe, ikG, qyS);
                    }
                } else {
                    th = 1BK.A0h();
                }
                throw th;
            }
        }
    }

    public void onStart() {
    }

    public void onSuccess() {
    }
}
