package X;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: IkK.class */
public final class IkK implements JMZ {
    public final Rgr A00;
    public final /* synthetic */ IkF A01;

    public IkK(Rgr rgr, IkF ikF) {
        this.A01 = ikF;
        this.A00 = rgr;
    }

    public void Bn6(I51 i51) {
        11T.A0F(i51, 0);
        this.A00.A02(i51);
        IkF ikF = this.A01;
        synchronized (ikF) {
            if (ikF.A02 == 0S2.A01) {
                ikF.A02 = 0S2.A0C;
                HuI huI = ikF.A01;
                if (huI != null) {
                    huI.A00();
                }
            }
        }
    }

    public void Bwr(HDB hdb, I51 i51) {
        11T.A0H(hdb, i51);
        this.A00.A03(i51, hdb);
        IkF ikF = this.A01;
        synchronized (ikF) {
            if (ikF.A02 == 0S2.A01) {
                ikF.A02 = 0S2.A0N;
                HuI huI = ikF.A01;
                if (huI != null) {
                    huI.A03(hdb);
                }
                ikF.A09.CRU(hdb);
                String message = hdb.getMessage();
                List list = ikF.A0D;
                if (list.size() != ikF.A00) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((JKY) it.next()).ADz(message);
                    }
                }
                ikF.A08.A07();
                ikF.A0A.Bxd(hdb);
            }
        }
    }

    public void CJu(Qq3 qq3, float f) {
        synchronized (this) {
            RZF rzf = this.A01.A06;
            if (qq3 != Qq3.A02) {
                rzf.A01 = f;
                RZF.A00(rzf);
            }
        }
    }

    public void CJw(Qq3 qq3, File file, int i, long j) {
        this.A00.A04(qq3.name(), IkF.A00(this.A01), i);
    }

    public void CJy(IDe iDe, Qq3 qq3, int i) {
        11T.A0F(iDe, 2);
        Rgr rgr = this.A00;
        String name = qq3.name();
        IkF ikF = this.A01;
        JSONObject A00 = IkF.A00(ikF);
        synchronized (rgr) {
            11T.A0F(name, 0);
            Rgr.A00(rgr, iDe, AbstractC00603o4.A00(65), name, A00, i);
        }
        synchronized (ikF) {
            if (ikF.A02 == 0S2.A01) {
                ikF.A00++;
                ikF.A0C.add(iDe);
                File file = iDe.A0N;
                String A002 = HLj.A00(file.getPath(), "video/mp4", false);
                long length = file.length();
                Rb8 rb8 = new Rb8(Qq3.A03, file, A002, 0, length, 0L, length);
                IF5 if5 = ikF.A08;
                if5.A0A(rb8);
                HuI huI = ikF.A01;
                if (huI != null && ikF.A07.A0U != null) {
                    int i2 = iDe.A0D;
                    int i3 = iDe.A0B;
                    java.util.Map map = huI.A02;
                    map.put("target_width", String.valueOf(i2));
                    map.put("target_height", String.valueOf(i3));
                    huI.A01();
                }
                if5.A08();
            }
        }
    }

    public void onStart() {
    }

    public void onSuccess() {
    }
}
